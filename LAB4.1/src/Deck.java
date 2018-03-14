import java.util.ArrayList;
public class Deck 
{
	private ArrayList<Card> unDealt = new ArrayList<Card>();
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	
	public Deck (String[] rank, String[] suit, int[] value)
	{
		for (int a = 0; a < rank.length; a++)
		{
			for (int b = 0; b < suit.length; b++)
			{
				unDealt.add(new Card(rank[a], suit[b], value[a]));
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
		Card c = unDealt.remove(0);
		Dealt.add(c);
		return c.toString();
	}
	public void shuffle()
	{
		int posmax = 0;
		int n = unDealt.size();
		for (int k = 51; k >= 1; k--)
		{
			int r = (int)(Math.random()*50) + 1;
			unDealt.add(r, unDealt.get(k));
			unDealt.add(k + 1, unDealt.get(r + 1));
			unDealt.remove(r + 1);
			unDealt.remove(k + 1);
		}
		for (int i = 0; i < n; i++)
		{	
			if (unDealt.get(i).getValue() > unDealt.get(posmax).getValue() && unDealt.get(i).getSuit().trim().toLowerCase().equals("spade"));
			{
				posmax = i;
			}
		}
		for (int k = 51; k >= 1; k--)
		{
			unDealt.add(posmax, unDealt.get(k));
			unDealt.add(k + 1, unDealt.get(posmax + 1));
			unDealt.remove(posmax + 1);
			unDealt.remove(k + 1);
			posmax = k;
		}
	}
}
