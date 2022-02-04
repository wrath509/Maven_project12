package collec;

import java.io.*;

public class fileyolo {
    public static void main(String[] args) throws IOException {
        File f = new File("./Test.txt");
        f.createNewFile();

        FileWriter fw = new FileWriter(f);
        fw.write("This is the 1st line");
        fw.write("\n");
        fw.write("This is the 2nd line");
        fw.close();
        FileReader fr = new FileReader("./Test.txt");
        BufferedReader br = new BufferedReader(fr);

        String str;
        while((str= br.readLine())!=null)
        {
            System.out.println(str);
        }
br.close();
    }
}
