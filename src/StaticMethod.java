public class StaticMethod {
    static int a = 10;
    void display()
    {
        System.out.println("This is an instance method");
    }
    static void show()
    {
        System.out.println("this is a static method");
    }
    public static void main(String[] args)
    {
        StaticMethod sm = new StaticMethod();
        sm.display();
        StaticMethod s = null;
        s.show();
        int c = s.a;
        System.out.println(c);
    }
}
