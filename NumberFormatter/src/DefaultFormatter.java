public class DefaultFormatter implements NumberFormatter{
    public String format(int n) {
        String num = Integer.toString(n);
        System.out.println("Default: " + num);
        return num;
    }
}
