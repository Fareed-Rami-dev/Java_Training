import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DemoSAXHandler {
    public static void main(String[] args) {
        try {
            // 1. Create a factory for SAX parsers
            SAXParserFactory factory = SAXParserFactory.newInstance();

            // 2. Use the factory to create a SAX parser
            SAXParser saxParser = factory.newSAXParser();

            // 3. Create an instance of your custom handler
            MySAXHandler handler = new MySAXHandler();

            // 4. Parse the XML file using your handler
            saxParser.parse(new File("C:\\Users\\frysp.LENOVO.000\\IdeaProjects\\XML Parsing Part 2\\src\\Students.xml"), handler);

            // 5. Get the parsed data (list of Students2 objects)
            List<Students2> studList = handler.getStudList();
            //6. create a text file for writing the info on it
            try {
                File f = new File("output.txt");
                if (f.createNewFile()) {
                    System.out.println("File created successfully\n");
                } else {
                    System.out.println("File Already Exists\n");
                }
            } catch (Exception e) {
                e.printStackTrace();

            }

            //7. Print each student
            // and writing on the file at the same time
            try {
                FileWriter myWriter = new FileWriter("output.txt");
                for (int i = 0; i < studList.size(); i++) {
                    String id, firstName, lastName, score;
                    id = studList.get(i).getId();
                    firstName = studList.get(i).getFirstName();
                    lastName = studList.get(i).getLastName();
                    score = studList.get(i).getScore();
                    System.out.println("Info of Student Number: " + (i + 1) + "\n");
                    System.out.println("Student ID: " + id + "\n");
                    System.out.println("Student First Name: " + firstName + "\n");
                    System.out.println("Student Last Name: " + lastName + "\n");
                    System.out.println("Student Score: " + score + "\n");
                    myWriter.write(id + "#//#" + firstName + "#//#" + lastName + "#//#" + score + "\n");
                }
                myWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace(); // Print any errors
        }
    }

}