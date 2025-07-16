//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("myFile.txt");
            if (f.createNewFile()) {
                System.out.println("File created"+f.getName());
            } else {
                System.out.println("File already exists");
            }
        }
        catch(IOException e) {
        System.out.println("Error\n");
          e.printStackTrace();
        }
    try {
        FileWriter myWriter=new FileWriter("myFile.txt",true);
       myWriter.write("Hello World\n");
       myWriter.write("Java\n");
       myWriter.close();
       System.out.println("File written");
    }
    catch(IOException e) {
        System.out.println("Error");
        e.printStackTrace();
    }


    }

}
