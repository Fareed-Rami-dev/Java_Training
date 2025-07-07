import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        DocumentBuilder builder;
        final String x = "Don't change me";
      //Document Builder Factory
        DocumentBuilderFactory f;
        f= DocumentBuilderFactory.newInstance();
        try {
            //Document Builder
            builder = f.newDocumentBuilder();
            //Parse the xml file
         Document doc= builder.parse(new File("test.xml"));
         //Get Root Element
            Element rootElement=doc.getDocumentElement();
           System.out.println(rootElement.getNodeName());
 //5. Node List
            String tagname="book";
          NodeList n= rootElement.getElementsByTagName(tagname);
           System.out.println(n.getLength());
           for (int i = 0; i < n.getLength(); i++) {
               Node node=n.item(i);

              switch (node.getNodeType()) {
                  case Node.ELEMENT_NODE:
                  {
                      System.out.println("Element Node <tag> for example\n");
                      break;
                  }
                  case Node.TEXT_NODE:
                  {
                      System.out.println("Text Node (text between starting tag and end tag)\n");
                      break;
                  }
                  case Node.COMMENT_NODE:
                  {
                      System.out.println("Comment Node <!-- This is a comment ... -->\n");
                      break;
                  }
                  case Node.DOCUMENT_NODE:
                  {
                      System.out.println("Document Node (Whole File)\n");
                      break;
                  }
              }
               //check the node type
               if (node.getNodeType() == Node.ELEMENT_NODE) {
                   Element el= (Element) node;
                   System.out.println(node.getNodeType());
                   String id=el.getAttribute("id");
                   System.out.println("id="+id);

                   String author=el.getElementsByTagName("author").item(0).getTextContent();
                   String title=el.getElementsByTagName("title").item(0).getTextContent();
                   System.out.println("author="+author);
                   System.out.println("title="+title);

               }
           }
        }
        catch(ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch(SAXException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

   }

}
