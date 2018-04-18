package calendar;
import java.util.Date;

public class Task 
{
	private String name;
	private String type;
	private Date start;
	private Date end;
	private String priority;
	private boolean completed = false;
	
	public Task () {
		name="";
		type="";
		start=null;
		end=null;
		priority="C";
		completed=false;
	}
	
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type;
	}
	public Date getStart()
	{
		return start;
	}
	public Date getEnd()
	{
		return end;
	}
	public String getPriority()
	{
		return priority;
	}
	public boolean getCompleted() {
		return completed;
	}
	
	public void setName(String x)
	{
		name=x;
	}
	public void setType(String x)
	{
		type=x;
	}
	public void setStart(Date x)
	{
		start=x;
	}
	public void setEnd(Date x)
	{
		end=x;
	}
	public void setPriority(String string)
	{
		priority=string;
	}
	public void setCompleted(String x)
	{
		if (x.equals("T")||x.equals("t")||x.equals("True")||x.equals("true"))
		{
			completed=true;
		}
		else
		{
			completed=false;
		}
	}
	
	public void copy(Task t) {
		name=t.getName();
		type=t.getType();
		start=t.getStart();
		end=t.getEnd();
		priority=t.getPriority();
		completed=t.getCompleted();
	}
}
