 class animal{

    void initial(){
        
        System.out.println("animal sound ");
}
}

class cat extends animal{

    void sound(){

        System.out.println("meowwwwwwwwww");
    }
}

public class Animal {
      public static void main(String[]args){
        cat c1 = new cat();

        c1.sound();
        c1.initial();
      }

}