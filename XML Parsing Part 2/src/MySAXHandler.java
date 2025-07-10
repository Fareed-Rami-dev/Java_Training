import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class MySAXHandler extends DefaultHandler {
    //List to hold Students - Students2 class object
    private List<Students2> studList=null;
    private Students2 stud=null;
    boolean bfname=false,blaname=false,bscore=false;
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
        if (qName.equals("student"))
        {
            // if element being read is named student
            //read element's attribute
            String id=attributes.getValue("id");
            // initizalize student2 object
            stud=new Students2();
            stud.setId(id);
            if (studList==null) {
                //first time i'm reading a student element
                studList = new ArrayList<Students2>();
                //then must instantiate my student list
                System.out.println("STUDENTS LIST CREATED\n");
            }
        }
        else if (qName.equals("firstname"))
        {
            bfname=true;
            System.out.println("First name flag set\n");
        }
        else if (qName.equals("lastname"))
        {
            blaname=true;
            System.out.println("Last name flag set\n");
        }
        else if (qName.equals("score"))
        {
            bscore=true;
            System.out.println("Score flag set\n");
        }
    }
    public void endElement(String uri, String localName, String qName) throws SAXException
    {
        //if student element is closing then that mean that
        // all student attributes and child elements have
        // been read coped to the student object
        //therefore, now it is time to add the student
        // object to the student list
        if (qName.equals("student"))
        {
            studList.add(stud);
            System.out.println("End of student tag detected\n");
        }
    }
    // startelement runs then characters runs then end element runs
    public void characters(char []ch,int start,int length) throws SAXException
    {
        if (bfname)
        {
            stud.setFirstName(new String(ch,start,length));
            bfname=false;
            System.out.println("Got the text between firstname starting and ending tag\n");
        }
        if (blaname)
        {
            stud.setLastName(new String(ch,start,length));
            blaname=false;
            System.out.println("Got the text between lastname starting and ending tag\n");
        }
        if (bscore)
        {
            stud.setScore(new String(ch,start,length));
            bscore=false;
            System.out.println("Got the text between score starting and ending tag\n");
        }
    }
    public List<Students2> getStudList()
    {
        return studList;
    }
}
