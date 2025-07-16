import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Difference between remove at index and remove value of */
        ArrayList<Integer> s;
        ArrayList<String>strList;
        strList = new ArrayList<>();
        strList.add("Str1");
        strList.add("Str2");
        strList.add("Str3");
        boolean str1 = strList.remove(String.valueOf("Str1"));
//        for (String str : strList) {
//           if (!strList.contains("pizza")) {
//                strList.add(str);
//            } /* Implicit Iterator while using foreach loop */   /* Not Allowed */  /* ConcurrentModificationException */
//        }


       s=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            s.add(i);
        }
        s.remove(Integer.valueOf(5));
        for (int i=0;i<s.size();i++)
        {
            System.out.print(s.get(i)+" ");
        }

//  for (Integer number:s)
//        {
//   if (number%2==0)
//      {
//          s.remove(number);
//      }
//  } /* Implicit Iterator while using foreach loop */   /* Not Allowed */
    }
}