import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Youssef Alsaeed 20206093
 * Youssef Essmat  20206096
 */

public class Problems {
	
	public String problem1(BufferedReader reader) throws IOException
	{
		String line; // store each line mn el input file
		String res=""; // store el result to be written to output file
		res+="1\n";
		Pattern pt = Pattern.compile("[a-zA-Z\\d._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}");
		while(!(line = reader.readLine()).equals("end") ) //read kol line l7d klmt end
		{
			System.out.println(line);
			Matcher matcher = pt.matcher(line);
			if(matcher.matches()) // get full match
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
		String line; // store each line mn el input file
		String res=""; // store el result to be written to output file
		res+="2\n";
		Pattern pt = Pattern.compile("(\\(\\d{3}\\)|\\d{3})([-.\\s]?)\\d{3}\\2\\d{4}");
		while(!(line = reader.readLine()).equals("end") ) //read kol line l7d klmt end
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
//		Pattern pt = Pattern.compile("\\d{1,4}([-\\/])\\d{1,2}\\1\\d{1,4}"); // simpler regex but diesnt verify months
		Pattern pt = Pattern.compile("(?:\\d{1,4}([-\\/])(0*[1-9]|1[0-2])\\1\\d{1,4}|\\d{1,2}([-\\/])(0*[1-9]|1[0-2])\\3\\d{1,4})"); //better regex
		while(!(line = reader.readLine()).equals("end") ) //read kol line l7d klmt end
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
		String part = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";  // regex ll part el wa7d 
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
	    Pattern pt = Pattern.compile("^(?!.*bbb).*$", Pattern.CASE_INSENSITIVE); // 3shan a-allow b or B , kman using negative lookahead
	    while(!(line = reader.readLine()).equals("end") )
	    {
	        System.out.println(line);
	        Matcher matcher = pt.matcher(line);
	        if(matcher.find()) // find to match any group
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
	        List<String> matches = new ArrayList<>(); // keep matching groups
	        List<Integer> starts = new ArrayList<>(); // keep start index of each group
	        List<Integer> ends = new ArrayList<>();  // keep end index of each group
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
	
	 public String problem9(BufferedReader reader) throws IOException {
	        String line;
	        String res = "9\n";
	        List<String> filePaths = new ArrayList<>();

	        while (!(line = reader.readLine()).equals("end")) { // get file paths from input file
	            filePaths.add(line);
	        }

	        for (String filePath : filePaths) {
	        	File file = new File(filePath);
	            res += "*" + file.getName() + "*\n"; //extract file name mn el path
	            BufferedReader fileReader = new BufferedReader(new FileReader(filePath)); // 3shan n-read from the other file
	            List<String> urls = new ArrayList<>();
	            int totalUrls = 0;
	            int lineNumber = 0;
	            Pattern urlPattern = Pattern.compile("https?://\\S*[a-zA-Z/\\d]"); 
	            
	            while ((line = fileReader.readLine()) != null) {
	                lineNumber++;
	                Matcher matcher = urlPattern.matcher(line);
	                while (matcher.find()) {
	                    totalUrls++;
	                    String url = matcher.group();
	                    urls.add("URL: " + url + "\n" +
	                             "Line: " + lineNumber + "\n" +
	                             "start index: " + matcher.start() + ", end index: " + matcher.end() + "\n");
	                }
	            }
	            fileReader.close();
	            res += "Number of URLs: " + totalUrls + "\n";

	            for (String urlInfo : urls) {
	                res += urlInfo;
	            }
	            
	        }
	        res += "x\n";
	        return res;
	    }

	
	public String problem10(BufferedReader reader) throws IOException
	{
	    String line;
	    String res="";
	    res+="10\n";
	    Pattern pt = Pattern.compile("((\\d+(\\.\\d*)?|[a-z])([+-/*]{1,2})?)+=((\\d+(\\.\\d*)?|[a-z])([+-/*]{1,2})?)+", Pattern.CASE_INSENSITIVE);
	    while(!(line = reader.readLine()).equals("end") )
	    {
	        System.out.println(line);
	        Matcher matcher = pt.matcher(line);
	        if(matcher.matches())
	        {
	            res += "valid mathematical expression\n";
	        }
	        else
	        {
	            res += "invalid mathematical expression\n";
	        }
	            
	    }
	    res += "x\n";
	    return res;
	}

}
