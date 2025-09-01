package w3resource.array.Converters;

public class HexToDec {
    public static void main(String[] args) {
        System.out.println(convertHexToDec("11"));
        System.out.println(convertHexToDecMath("2A5"));

    }

    public static int convertHexToDec(String hex){
        String hexDigits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int sum = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = hexDigits.indexOf(c);
            sum = 16*sum+d;
        }
        return sum;
    }
    public static int convertHexToDecMath(String hex){
        String hexDigits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int sum = 0;
        int chaningPow = hex.length()-1;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = hexDigits.indexOf(c);
            sum += d * Math.pow(16,chaningPow--);
        }
        return sum;
    }
}
