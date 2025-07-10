import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class ReadingFromFiles {
    public static void main(String[] args) {
        readFromTestTxtFile();
    }
    public static void readFromTestTxtFile()
    {
        try
        {
            FileInputStream fstream=new FileInputStream("C:\\Users\\frysp.LENOVO.000\\IdeaProjects\\XML Parsing Part 2\\src\\test.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(fstream));
            String str;
            while((str=br.readLine())!=null)
            {
                System.out.println(str);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
