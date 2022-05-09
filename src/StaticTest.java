public class StaticTest {
    static int x = 20;
    static int y = 30;
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
    static void show()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args)
    {
        StaticTest st = new StaticTest();
        st.display();
        show();
    }
}