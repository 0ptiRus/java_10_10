package classwork09_10;

public class ConsoleLogger implements Message 
{
	@Override
	public void Print(String message)
	{
		System.out.println(message);
	}
}
