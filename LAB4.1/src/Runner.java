// Saurabh Bansal;	Mr. Levin;	AP COMPSCI JAVA;	Pd 2;	 3/15/18
public class Runner 
{
	public static void main(String[]args)
	{
		String [] rank = {"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"};
		String [] suit = {"Diamond" , "Club" , "Heart" , "Spade"};
		int [] value = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13};
		
		Deck a = new Deck(rank, suit, value);
		
		System.out.println(a);
		
		int size = a.size();
		a.shuffle();
	
		for (int i = 0; i < size; i++)
		{
			System.out.println(i+ " " + a.deal());
		}
	}
}