import java.util.Scanner;

public class TableOfNumber {
    public static void main(String args[]) {
        int number, i, table;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number :");
        number = scan.nextInt();

        System.out.println("Table of" +number+ "is\n");
        for(i=1; i<=10; i++) {
            table = number*i;
            System.out.println(number +"*"+ "=" +table+ "\n");
        }
    }
}
