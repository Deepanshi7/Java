import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        FileWriter fout = new FileWriter("file.txt");
        fout.write("this file is created by anshu");
        fout.close();
        System.out.println( "write operation succesful");
    }
}
