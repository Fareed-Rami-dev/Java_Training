import com.jbs1.DB_Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.jbs1.*;
public class Main {
    public static void main(String[] args) {
    final Logger logger= LogManager.getLogger(Main.class.getName());
        DB_Utility obj=new DB_Utility();
        try {
           obj.excecuteInsertQuery("Insert into mydb.employee (firstname,lastname,email) values ('Ramzez','Hamza','RamezHamza@gmail.com')");
            obj.printAllResults("Select * from mydb.employee");
            System.out.println("-----------------------------------------------\n");
            obj.excecuteUpdateQuery("Update mydb.employee set firstname='Ramzi123' where id=11");
           obj.printAllResults("Select * from mydb.employee");
           System.out.println("-----------------------------------------------\n");
           obj.excecuteDeleteQuery("Delete from mydb.employee where id=7");
         obj.printAllResults("Select * from mydb.employee");
        }
        catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
    }



}