import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problems {
	
	public String problem1(BufferedReader reader) throws IOException
	{
		String line;
		String res="";
		res+="1\n";
		Pattern pt = Pattern.compile("[a-zA-Z\\d._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}");
		while(!(line = reader.readLine()).equals("end") )
		{
			System.out.println(line);
			Matcher matcher = pt.matcher(line);
			if(matcher.matches())
			{
				res += "valid email\n";
			}
			else
			{
				res += "invalid email\n";
			}
				
		}
		res += "x\n";
		return res;
				
	}
	
	public String problem2(BufferedReader reader) throws IOException
	{
		String line;
		String res="";
		res+="2\n";
		Pattern pt = Pattern.compile("\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}");
		while(!(line = reader.readLine()).equals("end") )
		{
			System.out.println(line);
			Matcher matcher = pt.matcher(line);
			if(matcher.matches())
			{
				res += "valid phone number\n";
			}
			else
			{
				res += "invalid phone number\n";
			}
				
		}
		res += "x\n";
		return res;
	}
	
	public String problem3(BufferedReader reader) throws IOException
	{
		String line;
		String res="";
		res+="3\n";
		Pattern pt = Pattern.compile("\\d{1,4}[-\\/]\\d{1,2}[-\\/]\\d{1,4}");
		while(!(line = reader.readLine()).equals("end") )
		{
			System.out.println(line);
			Matcher matcher = pt.matcher(line);
			if(matcher.matches())
			{
				res += "valid date\n";
			}
			else
			{
				res += "invalid date\n";
			}
				
		}
		res += "x\n";
		return res;
	}
	
	public String problem4(BufferedReader reader) throws IOException
	{
		String line;
		String res="";
		res+="4\n";
		String part = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"; 
		Pattern pt = Pattern.compile(part +"\\." +part+"\\."+part+"\\."+part);
		while(!(line = reader.readLine()).equals("end") )
		{
			System.out.println(line);
			Matcher matcher = pt.matcher(line);
			if(matcher.matches())
			{
				res += "valid IP address\n";
			}
			else
			{
				res += "invalid IP address\n";
			}
				
		}
		res += "x\n";
		return res;
	}
	
	public String problem5(BufferedReader reader) throws IOException
	{
		String line;
		String res="";
		res+="5\n";
		Pattern pt = Pattern.compile("[a-zA-Z_][a-zA-Z_\\d]*");
		while(!(line = reader.readLine()).equals("end") )
		{
			System.out.println(line);
			Matcher matcher = pt.matcher(line);
			if(matcher.matches())
			{
				res += "valid c++ variable name\n";
			}
			else
			{
				res += "invalid c++ variable name\n";
			}
				
		}
		res += "x\n";
		return res;
	}
	
	public String problem6(BufferedReader reader) throws IOException
	{
	    String line;
	    String res="";
	    res+="6\n";
	    Pattern pt = Pattern.compile("^(?!.*bbb).*$", Pattern.CASE_INSENSITIVE);
	    while(!(line = reader.readLine()).equals("end") )
	    {
	        System.out.println(line);
	        Matcher matcher = pt.matcher(line);
	        if(matcher.find())
	        {
	            res += "valid string\n";
	        }
	        else
	        {
	            res += "invalid string, has 3 consecutive b's\n";
	        }
	            
	    }
	    res += "x\n";
	    return res;
	}
	
	public String problem7(BufferedReader reader) throws IOException {
	    String line;
	    String res = "7\n";
	    Pattern pt = Pattern.compile("(aa|bb)*(ab|ba)(((aa|bb)*(ab|ba)(aa|bb)*(ab|ba)))*(aa|bb)*");

	    while (!(line = reader.readLine()).equals("end")) {
	        res += "*" + line + "*\n";
	        Matcher matcher = pt.matcher(line);
	        List<String> matches = new ArrayList<>();
	        List<Integer> starts = new ArrayList<>();
	        List<Integer> ends = new ArrayList<>();
	        int matchCount = 0;

	        while (matcher.find()) {
	            matchCount++;
	            matches.add(matcher.group());
	            starts.add(matcher.start());
	            ends.add(matcher.end());
	        }

	        if (matchCount > 0) {
	            res += "number of matched substrings: " + matchCount + "\n";
	        }

	        for (int i = 0; i < matches.size(); i++) {
	            res += "matched substring: " + matches.get(i) + "\n";
	            res += "start index: " + starts.get(i) + ", end index: " + ends.get(i) + "\n";
	        }
	    }
	    res += "x\n";
	    return res;
	}



	
	public String problem8(BufferedReader reader) throws IOException
	{
	    String line;
	    String res = "8\n";
	    Pattern pt = Pattern.compile("\\b\\w{3}\\b");

	    while (!(line = reader.readLine()).equals("end")) {
	        res += "*" + line + "*\n";
	        Matcher matcher = pt.matcher(line);
	        List<String> matches = new ArrayList<>();
	        List<Integer> starts = new ArrayList<>();
	        List<Integer> ends = new ArrayList<>();
	        int matchCount = 0;

	        while (matcher.find()) {
	            matchCount++;
	            matches.add(matcher.group());
	            starts.add(matcher.start());
	            ends.add(matcher.end());
	        }

	        if (matchCount > 0) {
	            res += "number of matched words: " + matchCount + "\n";
	        }
	        else
	        {
	        	res+= "No word matches\n";
	        }

	        for (int i = 0; i < matches.size(); i++) {
	            res += "matched word: " + matches.get(i) + "\n";
	            res += "start index: " + starts.get(i) + ", end index: " + ends.get(i) + "\n";
	        }
	    }
	    res += "x\n";
	    return res;
	}
	
	public String problem9(BufferedReader reader) throws IOException
	{
		
	}
	
	public String problem10(BufferedReader reader) throws IOException
	{
		
	}

}
