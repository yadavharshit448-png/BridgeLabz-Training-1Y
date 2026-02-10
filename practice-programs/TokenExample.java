import java.util.StringTokenizer;

class TokenExample {

    public static void main(String[] args) {

        String str = "Java is easy";

        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
