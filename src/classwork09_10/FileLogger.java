package classwork09_10;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger implements Message
{
	private String messagePrefix = "[Logger]:";
	private PrintWriter writer;
	
	public FileLogger()
	{
		Date ltm = new Date( );
	    SimpleDateFormat lt = new SimpleDateFormat ("'['dd.MM hh:mm:ss a']: '");
	    final String logtm = lt.format(ltm);
	    writer = new PrintWriter("logs/LOGTIME_"+logtm, "UTF-8");

	    String prefix = "[Logger]:";

	    writer.println(prefix + "Logger opened!"); 

	    writer.println("----------xXx----------");
	    writer.flush();
	}
	
	@Override
	public void Print(String message)
	{
		writer.println(messagePrefix + " - " + message);		
	}
	
	
}
