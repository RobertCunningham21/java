import java.util.Scanner;

public class NumberFormatterTester{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in an Integer: ");
        int integer = input.nextInt();

        DefaultFormatter ORIG = new DefaultFormatter();
        String x = ORIG.format(integer);
        DecimalSeparatorFormatter SEP = new DecimalSeparatorFormatter();
        String y = SEP.format(integer);
        AccoutingFormatter ACC = new AccoutingFormatter();
        String z = ACC.format(integer);
    }
}
