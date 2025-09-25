public class ContohOperator14 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + x++ + " dan " + x++);
        System.out.println("Setelah evaluasi, x = " + x);
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi, x = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah " + z);
        
        System.out.println(padLeftZeros(Integer.toBinaryString(x), 8));
        System.out.println(padLeftZeros(Integer.toBinaryString(y), 8));
        System.out.println(padLeftZeros(Integer.toBinaryString(z), 8));
        
        z %= 2;
        System.out.println("Hasil akhir " + z);

    }

    public static String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);
        return sb.toString();
    }
}