import java.util.Scanner;
import java.io.IOException;
class NOMatchException extends Exception
{
	NOMatchException(String s)
	{
		super(s);
	}
}
class ExCheck{
	static void check(String s1) throws NOMatchException
	{
		if(s1.equalsIgnoreCase("India"))
		{
			System.out.println("Matched!");
		}
		else
		{
			throw new NOMatchException("Not Matched!!!");
		}
	}
	public static void main(String args[]) throws NOMatchException
	{
		try
		{
			check(args[0]);
		}catch(Exception e)
		{
			System.out.println("Exception Occured: "+e+"\n Check Carefully!");
		}
	}
}