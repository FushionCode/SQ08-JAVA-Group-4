
import java.util.*;

public class Find{
    public static void main(System[]args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        Set<Character> st = Collections.emptySet();
        String s = scan.nextLine();
        // char [] cat = new char[s.length()];
        // cat = s.split("");
        for (char letter : s.toCharArray()){
            st.add(letter);
        }
        //for (char s : st) {
        //   System. out. println(s);
        //}
    }
}

