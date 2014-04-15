package dk.itu.smdp.utils;

/**
 * Created by centos on 4/14/14.
 */
import java.util.Stack;

public class FixedStack<T> extends Stack<T>
{
	private int maxSize;
	
	public FixedStack(int size)
	{
		super();
		this.maxSize = size;
	}
	
	public T pushAndPopExtraItem(T object)
	{
		// If the stack is too big, remove elements until it's the right size.
		T popedItem = null;
		while (this.size() >= maxSize)
		{
			popedItem = this.remove(0);
		}
		super.push(object);
		
		return popedItem;
	}
}
