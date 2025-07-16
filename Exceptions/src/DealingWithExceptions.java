import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class DealingWithExceptions {
    /*** Checked Exceptions */
    enum Color {RED, BLUE}

//    public static void fun3() {
//
//
//       try {
//            FileInputStream fstream = new FileInputStream("doesNotExist.txt");
//            int x=3/0;
//       } catch (FileNotFoundException e) {
//          e.printStackTrace();
//        }
//       catch(ArithmeticException e)
//       {
//           e.printStackTrace();
//       }
//       finally {
//
//
//       }
//    }
//
//    public static void fun2()  {
//        fun3();
//
//    }

    //  THIS WOULD WORK BECAUSE FUN3 handled the exceptions using try catch block(s)
    // any funtion who calls fun3 or calls functions that call fun3 will NOT have to handle any exception




     /*
   Case 2

         public static void fun3() {
     FileInputStream fstream = new FileInputStream("doesNotExist.txt");
     }
     public static void fun2()
     {
        fun3();
     }
     public static void fun1()
     {
     fun2();
     }
      */
     /* if fun3 didn't do try catch neither throws decalration an exception would not be handled in the
     program.. fun3 says .. I don't want to handle the exception by myself.. i'll pass that mission to the function
     who calls me.. and the function who calls me fun2 can either handle the exception by try catch block
     or fun2 can say.. i don't wanna handle the exception and i'll pass that mission to the function who calls me
     and so on......  suppose fun2 was called by fun1 and fun1 passed the handling mission to the main function
     and that main function called fun1
     main->fun1()->fun2()->fun3()
     if the main used try catch block like
     try
     {
     fun1()
     }
     catch(Exception e)
     {
     // some exception hadling code
      }
      in this case the issue is solved.. however if the main function itself decided to pass the exception
      handling and not handle it by try catch.. that mission will be passed to the JVM and the JVM
      can't do anything about it.. in this case stack trace will be printed and the program crashes....
      */


    /*** Unchecked Exceptions */
/*
Any Runtime Exception or one of it's children or any error are unchecke exceptions
basically we don't usually handle the exception by try catch or even by throws declaration
static public void fun1()
{
     int x;
    Scanner scr=new Scanner(System.in);
    x=scr.nextInt();
   int y=10/x;
}
static public void fun2()
{
fun1()
}


 */
    public static void main(String[] args) {
        //Some of Exceptions
        // 1. ArithmeticException /0
        try {
            int y = 0; // You can simulate user input here
            int result = 10 / y;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. ArrayStoreException
        try {
            Object[] arr = new String[3];
            arr[0] = 100; // Trying to store Integer in String[]
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }

        // 3. ClassCastException
        try {
            Object obj = new Integer(5);
            String s = (String) obj; // Invalid cast
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        // 4. ConcurrentModificationException
        try {
            List<String> list = new ArrayList<>(List.of("A", "B", "C"));
            for (String s : list) {
                if (s.equals("B")) {
                    list.remove(s); // Unsafe modification
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException: " + e.getMessage());
        }

        // 5. EnumConstantNotPresentException
        try {
            Color c = Color.valueOf("GREEN"); // Not in enum
        } catch (IllegalArgumentException e) {
            // valueOf() throws IllegalArgumentException which is actually thrown here
            System.out.println("Caught EnumConstantNotPresentException (as IllegalArgumentException): " + e.getMessage());
        }

        // 6. IllegalArgumentException
        try {
            Thread t = new Thread();
            t.setPriority(100); // Invalid priority (must be 1–10)
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // 6.a. NumberFormatException
        try {
            int n = Integer.parseInt("abc"); // Not a number
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // 6.b. IllegalThreadStateException
        try {
            Thread thread = new Thread(() -> System.out.println("Running"));
            thread.start();
            thread.start(); // Starting again
        } catch (IllegalThreadStateException e) {
            System.out.println("Caught IllegalThreadStateException: " + e.getMessage());
        }

        // 7. IllegalMonitorStateException
        try {
            Object lock = new Object();
            lock.wait(); // Not in synchronized block
        } catch (IllegalMonitorStateException e) {
            System.out.println("Caught IllegalMonitorStateException: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
        }
    }
}



