package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import com.mobeta.android.dslv.DragSortController;
import com.mobeta.android.dslv.DragSortListView;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.utils.FixedStack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tony Beltramelli www.tonybeltramelli.com
 */
public class RankingQuestion extends Question implements DragSortListView.DropListener
{
	private ArrayAdapter<String> _adapter;
	private DragSortListView _dragSortListView;
	private DragSortController _dragSortController;
	
	public RankingQuestion(boolean isMandatory, String questionText)
	{
		super(isMandatory, questionText);
	}
	
	@Override
	public View getView(Context context, ViewGroup parent)
	{
		LinearLayout layout = initQuestionLayout(context, parent);
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		_dragSortListView = (DragSortListView) inflater.inflate(R.layout.ranking_list, parent, false);
		
		layout.addView(_dragSortListView);
		
		_dragSortController = new DragSortController(_dragSortListView);
		_dragSortController.setDragHandleId(R.id.drag_handle);
		_dragSortController.setSortEnabled(true);
		
		_dragSortListView.setFloatViewManager(_dragSortController);
		_dragSortListView.setOnTouchListener(_dragSortController);
		_dragSortListView.setDragEnabled(true);
		_dragSortListView.setDropListener(this);
		
		this.populateAnswerViews(context, layout, layout, this);
        //set height manually due to unknown bug
        setLayoutHeight(context , layout);
        //after all answers have been inserted
        initQuestion();

		return layout;
	}

    private void setLayoutHeight(Context context , LinearLayout layout) {
        int itemSize = (int) context.getResources().getDimension(R.dimen.item_height);
        final float scale = context.getResources().getDisplayMetrics().density;
        int pixels = (int) (itemSize * scale + 0.5f);
        layout.getLayoutParams().height = pixels * _answers.size();
    }

    @Override
	protected void populateAnswerViews(Context context, ViewGroup parent, ViewGroup container, Answerable answerable)
	{
		List<String> optionList = new ArrayList<String>();
		
		for (Answer a : _answers)
		{
			optionList.add(a.getDescription());
		}
		
		_adapter = new ArrayAdapter<String>(context, R.layout.ranking_field, R.id.text, optionList);
		_dragSortListView.setAdapter(_adapter);
	}
	
	@Override
	public boolean isQuestionAnswered()
	{
		return true;
	}

    @Override
    protected void initQuestion() {
        //all the answers get into the answered answers
        _answeredAnswers = new FixedStack<Answer>(_answers.size());

        //insert them in the opposite order. The first answer should be on the
        //top of the stack
        for( int i = 0 ; i < _answers.size() ; i++ ) {
            _answeredAnswers.push(_answers.get(i));
        }
    }

    @Override
	public void drop(int from, int to)
	{
		if (from != to)
		{
			String item = _adapter.getItem(from);
			_adapter.remove(item);
			_adapter.insert(item, to);

            //update the answeredAnswers
            _answeredAnswers.moveFromTo(from , to);
        }
	}
}
