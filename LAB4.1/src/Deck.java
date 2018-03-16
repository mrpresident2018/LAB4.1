// Saurabh Bansal;	Mr. Levin;	AP COMPSCI JAVA;	Pd 2;	 3/15/18
import java.util.ArrayList;
public class Deck 
{
	private ArrayList<Cards> unDealt = new ArrayList<Cards>();
	private ArrayList<Cards> Dealt = new ArrayList<Cards>();
	
	public Deck (String[] rank, String[] suit, int[] value)
	{
		for (int a = 0; a < rank.length; a++)
		{
			for (int b = 0; b < suit.length; b++)
			{
				unDealt.add(new Cards(rank[a], suit[b], value[a]));
			}
		}
	}
	public boolean isEmpty()
	{
		if (unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	public int size()
	{
		return unDealt.size();
	}
	public String deal()
	{
		Cards c = unDealt.remove(0);
		Dealt.add(c);
		return c.toString();
	}
	public void shuffle()
	{
		int length = unDealt.size() -1;
		int r;
		for (int k = unDealt.size()-1; k >= 1; k--)
		{
			r = (int)(Math.random()*length);
			this.swap(r,k);
		}
	}	
	public void swap(int x, int y)
	{
		Cards temp = unDealt.get(x);
		unDealt.set(x , unDealt.get(y));
		unDealt.set(y, temp);
	}
}
