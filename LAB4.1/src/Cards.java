// Saurabh Bansal;	Mr. Levin;	AP COMPSCI JAVA;	Pd 2;	 3/15/18
public class Cards 
{
	private String rank, suit;
	private int value;
	
	public Cards (String rank , String suit, int value)
	{
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}	
	public String getRank() 
	{
		return (this.rank);
	}

	public String getSuit() 
	{
		return (suit);
	}

	public int getValue()
	{
		return value;
	}

	public boolean equals(Cards othercard)
	{
		if (this.value == othercard.getValue())
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return ("This is the rank (" + this.rank + ")of " + this.suit + " has the value " + this.value);
	}
}