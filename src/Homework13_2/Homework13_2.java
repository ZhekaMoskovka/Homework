package Homework13_2;

import java.io.*;

public class Homework13_2 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream("D:\\Женя\\JAVA\\Homework\\src\\Homework13_2\\test.txt"), "Cp866"));
            String s;
            do {
                s = bufferedReader.readLine();
                printWriter.println(s);
            } while (!s.equals("q"));
            bufferedReader.close();
            printWriter.flush();
            printWriter.close();
            FileReader fr = new FileReader("D:\\Женя\\JAVA\\Homework\\src\\Homework13_2\\test.txt");
            bufferedReader = new BufferedReader(fr);
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}