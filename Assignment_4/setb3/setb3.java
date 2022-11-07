import java.util.*;
class InvalidDateException extends Exception
{
}

class myDate
{
	int d,m,y;
	myDate(int d, int m,int y){
	this.d = d;
	this.m = m;
	this.y = y;
	}
	
	void display()
	{
		System.out.println("\n\t Date is Valid :" +d+"-"+m+"-"+y);
	}
} 

class setb3
{
	public static void main(String args[])
	{
		int dd,mm,yy;
		int flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("\n\t Enter Date:");
		dd = s.nextInt();
		System.out.println("\n\t Enter Month:");
		mm = s.nextInt();
		System.out.println("\n\t Enter Year:");
		yy = s.nextInt();
		
		try
		{
			if(mm<= 0 ||  mm > 12)
			throw new InvalidDateException();
			else
			{
				if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)
				{
					if(dd >= 1 && dd <= 31)
					flag = 1;
					else
					throw new InvalidDateException();
					
				}
				else if(mm == 2)
				{
					if(yy % 4 == 0)
					{
						if(dd >= 1 && dd <= 29)
						flag = 1;
						else
						throw new InvalidDateException();
					}
					else
					{
						if(dd >= 1 && dd <= 28)
						flag = 1;
						throw new InvalidDateException();
					}
				
				}
				else
				{
					if(mm == 4 || mm == 6 || mm == 9 || mm == 11 )
				{
					if(dd >= 1 && dd <= 30)
					flag = 1;
					else
					throw new InvalidDateException();
					
				}
				}	
			}
		if(flag== 1)
		{
		myDate dt = new myDate(dd,mm,yy);
		dt.display();
		}
		}
		catch(InvalidDateException m)
		{
		System.out.println("Invalid Date");
		}
		
		
	}
}


























