import java.util.*;


public class StringRev{
    public static void main(String[]args){
        String str = "Hello world";
        char[] charArray = str.toCharArray();
		
        Stack<Character> st = new Stack<>();

        for(char c : charArray){
            st.push(c);
        }
        for(int i = 0; i < charArray.length; i++){
            charArray[i] = st.pop();
        }
        System.out.println("Rev String - " + new String(charArray));
        


        
    }
}