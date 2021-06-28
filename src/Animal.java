import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class Animal {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        Set<Character> st = Collections.emptySet();
        String s = scan.nextLine();
         //char [] cat = new char[s.length()];
        // cat = s.split("");
        for (char letter : s.toCharArray()){
            st.add(letter);
        }
        //for ()
    }
}
