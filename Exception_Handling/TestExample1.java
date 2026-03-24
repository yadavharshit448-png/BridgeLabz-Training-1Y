public class TestExample1 extends Thread {
    public void run(){
        for(int i =1 ; i <=10; i++){
            System.out.println("Task1:" + i );
        }
    }

    public static void main(String[] args){
        TestExample1 t1 = new TestExample1();
        TestExample2 t2 = new TestExample2();
        t1.start();
        t2.start();
    }
}