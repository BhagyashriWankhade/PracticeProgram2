import java.io.*;
public class StaticExample {
    static int num = 100;
    static String str = "Welcome to KSJ";
    static void display()
    {
      System.out.println("static number is " +num);
      System.out.println("static string is " +str);
    }
    void nonstatic()
    {
        display();
    }
    public static void main(String args[])
    {
        StaticExample obj = new StaticExample();
        obj.nonstatic();
        display();
    }
}