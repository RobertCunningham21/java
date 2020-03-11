public class AccoutingFormatter implements NumberFormatter{
    public String format(int n) {
        String num = Integer.toString(n);
        if(num.charAt(0) == '-') {
            System.out.println("Accounting: " + num.replace("-", "(") + ")");
            return num;
        }
        else {
            System.out.println("Accounting: " + num);
            return num;
        }
    }
}
