package csc300Hw1;

public class AList 
{
	private String[] data;
	
	public AList()
	{
		this.data = new String[0];
	}
	
	public String getAtIndex(int index)
	{
		//returns without removing the String at position index
		return data[index];
	}
	
	public String removeAtIndex(int index)
	{
		//returns with removing and resizing the String at positon index
		String[] resized = new String[data.length -1];
		String retStr = "";
		for(int i = 0, j=0; i<data.length; i++)
		{
			if (i!=index)
			{
				resized[j] = data[i];
				j++;
			}
			else
			{
				 retStr=data[i];
			}
		}
		data = resized;
		return retStr;
	}
	
	

	
	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	public void add(String s)
	{
		String[] temp = new String[this.data.length + 1];
		for(int i = 0; i < this.data.length; i++)
		{
			temp[i] = this.data[i];
		}
		temp[temp.length-1] = s;
		data = temp;
	}
	
	public int size()
	{
		return this.data.length;
	}
}
