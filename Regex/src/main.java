import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Problems problem = new Problems();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            String line;
            while ((line = reader.readLine()) != null) {
                switch (line) {
                    case "1":
                    	writer.append(problem.problem1(reader));
                    	break;
                    case "2":
                        writer.append(problem.problem2(reader));
                        break;
                    case "3":
                        writer.append(problem.problem3(reader));
                        break;
                    case "4":
                        writer.append(problem.problem4(reader));
                        break;
                    case "5":
                        writer.append(problem.problem5(reader));
                        break;
                    case "6":
                        writer.append(problem.problem6(reader));
                        break;
                    case "7":
                        writer.append(problem.problem7(reader));
                        break;
                    case "8":
                        writer.append(problem.problem8(reader));
                        break;
                    case "9":
                        writer.append(problem.problem9(reader));
                        break;
                    case "10":
                        writer.append(problem.problem10(reader));
                        break;
                 }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}