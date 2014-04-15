package dk.itu.smdp.model;

import java.util.ArrayList;

/**
 * Created by centos on 4/13/14.
 */
public class Category
{
	private String _title;
	private String _description;
	
	private ArrayList<Page> _pages;
	
	public Category(String title)
	{
		_title = title;
		_pages = new ArrayList<Page>();
	}
	
	public String getTitle()
	{
		return _title;
	}
	
	public void setTitle(String title)
	{
		this._title = title;
	}
	
	public String getDescription()
	{
		return _description;
	}
	
	public void setDescription(String description)
	{
		this._description = description;
	}
	
	public ArrayList<Page> getPages()
	{
		return _pages;
	}
	
	public void addPage(Page p)
	{
		_pages.add(p);
	}
}
