public class DecimalSeparatorFormatter implements NumberFormatter{
    public String format(int n) {
        String num = Integer.toString(n);

        if(num.charAt(0) == '-') {
            String finalnum = "";
            String x = num.substring(1);
            int digits = 0;

            for(int i = x.length()-1; i >= 0; i--) {
                digits++;
                finalnum = x.charAt(i) + finalnum;
                if(digits % 3 == 0) {
                    if(digits == x.length()) {
                        finalnum = "" + finalnum;
                    }
                    else {
                        finalnum = "," + finalnum;
                    }
                }
            }
            System.out.println("Separator: " + "-" + finalnum);
        }
        else {
            String finalnum = "";
            int digits = 0;

            for(int i = num.length()-1; i >= 0; i--) {
                digits++;
                finalnum = num.charAt(i) + finalnum;
                if(digits % 3 == 0) {
                    if(digits == num.length()) {
                        finalnum = "" + finalnum;
                    }
                    else {
                        finalnum = "," + finalnum;
                    }
                }
            }
            System.out.println("Separator: " + finalnum);
        }
        return num;
    }
}
