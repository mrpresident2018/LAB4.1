//Saurabh Bansal
public class Cards 
{
	String [] rank = {"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"};
	String [] suit = {"Diamond" , "Club" , "Heart" , "Spade"};
	int [] value = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13};
	public Cards (String[] rank , String [] suit, int [] value)
	{
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}	
	public String getRank() 
	{
		System.out.println(rank);
	}

	public String getSuit() 
	{
		System.out.println (suit);
	}

	public int getValue()
	{
		System.out.println(value);;
	}
	
	public boolean equals(Card othercard)
	{
		if (this.value == othercard.getValue())
		{
			return true;
		}
		
		return false;
	}
	
	public String toString()
	{
		return (this.rank + "of" + this.suit + "has the value" + this.value);
}