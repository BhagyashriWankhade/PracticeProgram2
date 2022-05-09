public class SquareAndCube {
    static int x = 15;
    static int y = 20;
    static int square(int x)
    {
        int a = x*x;
        return a;
    }
    static int cube(int y) {
        int b= y*y*y;
        return b;
    }
    public static void main(String[] args)
    {
        int sq = square(5);
        int CB = cube(10);
        System.out.println(sq);
        System.out.println(CB);
    }
}
