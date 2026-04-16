public class Q3 {
    public static int replaceZeroWithOne(int num) {
        String str = String.valueOf(num);
        str = str.replace('0', '1');
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        int number = 10203;
        System.out.println("Original: " + number);
        System.out.println("Result: " + replaceZeroWithOne(number));
    }
}