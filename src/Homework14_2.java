import java.io.*;
import java.util.regex.Pattern;

public class Homework14_2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/chyper.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Pattern pattern = Pattern.compile("\\s+");
        String []strings = pattern.split(bufferedReader.readLine());
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/chyper.txt"), "Cp866"));
        for (String  word : strings) {
            word = "Java ";
            printWriter.print(word);
        }
        bufferedReader.close();
        printWriter.flush();
        printWriter.close();
    }
}