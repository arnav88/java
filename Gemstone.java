package lab3;
public class Gemstone
{
private static boolean isGemStone(String[] rocks, char gem)
	{
		int amt = 0;
		
		for (String rock : rocks)
		{
			for (int i = 0; i < rock.length(); ++i)
			{
				char c = rock.charAt(i);
				
				if (c == gem)
				{
					++amt;
					break;
				}
			}
		}
		
		return (amt == rocks.length);
		
	}
	
	private static void printGemStones(String[] rocks)
	{
		int numberOfStones = 0;
		
		for (String rock : rocks)
		{
			for (int i = 0; i < rocks.length; ++i)
			{
				char gem = rock.charAt(i);
				if (isGemStone(rocks, gem))
				{
					++numberOfStones;
					break;
				}
			}
		}
		System.out.println(numberOfStones);	
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int	n= sc.nextInt();
		String[] rocks=new String[n];
		
		for (int i=0;i<n;++i)
		{
			rocks[i]=sc.next();
		}
		
		printGemStones(rocks);
		scanner.close();
	}

}
