package dk.itu.smdp.model.question;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mobeta.android.dslv.DragSortController;
import com.mobeta.android.dslv.DragSortListView;

import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;
import dk.itu.smdp.model.answer.Answer;

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
		
		this.populateAnswerViews(context, layout, layout, this);
		
		return layout;
	}
	
	@Override
	protected LinearLayout initQuestionLayout(Context context, ViewGroup parent)
	{
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.ranking_question, parent, false);		
		
		TextView titleView = (TextView) layout.findViewById(R.id.question_textview);
		titleView.setText(_questionText);
		
		_dragSortListView = (DragSortListView) layout.findViewById(R.id.drag_sort_listview);
		
		_dragSortController = new DragSortController(_dragSortListView);
		_dragSortController.setDragHandleId(R.id.drag_handle);
		_dragSortController.setSortEnabled(true);
		
		_dragSortListView.setFloatViewManager(_dragSortController);
		_dragSortListView.setOnTouchListener(_dragSortController);
		_dragSortListView.setDragEnabled(true);
		_dragSortListView.setDropListener(this);
		
		return layout;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void drop(int from, int to)
	{
		if (from != to)
		{
			String item = _adapter.getItem(from);
			_adapter.remove(item);
			_adapter.insert(item, to);
		}
	}
}
