class human{

void Say(){
    System.out.println("Hello me is human");
}


}
class Tall extends human{

void SayTall(){
    System.out.println("meee is taaaaal");
}

}
class Short extends human{

    void SayShort(){
        System.out.println("Me is so short :<<<<<");
    }

}

public class Hierarchical{
    public static void main(String[]args){
        Tall t1 = new Tall();
        t1.SayTall();
        t1.Say();
        
        Short s1 = new Short();
        s1.Say();
        s1.SayShort();
    }
}
