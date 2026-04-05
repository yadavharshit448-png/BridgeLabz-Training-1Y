class number<T> {

    T num;

    void setNumber(T num) {
        this.num = num;
    }

    T getNumber() {
        return num;
    }
}

public class GenericsPractice {
    public static void main(String[] args) {

        number<Integer> n1 = new number<>();
        n1.setNumber(123);
        System.out.println(n1.getNumber());

        number<String> n2 = new number<>();
        n2.setNumber("2353245");
        System.out.println(n2.getNumber());

        number<Double> n3 = new number<>();
        n3.setNumber(435.34534);
        System.out.println(n3.getNumber());
    }
}