import java.util.Arrays;

public class AlgorithmTest {
    public static void main(String[] args) {
        //int arr [] = {-100,-29,-24,-19,19};
       // largestPairSum();
       // System.out.println(largestPairSum(arr));

        String keyString = "abcde";
        char [] charList = keyString.toCharArray();
        System.out.print(charList);
    }

    public static int largestPairSum(int[] numbers){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for(int value: numbers){
            if(value > max){
                secondMax = max;
                max = value;
            }
            else if(value > secondMax && value < max){
                secondMax = value;
            }
        }
        System.out.println("Max value in the array is: " + max);
        System.out.println("SecondMax value in the Array is: " + secondMax);

        int sumLargestPair = max + secondMax;
        return sumLargestPair;
    }

    public static int duplicateCount(String text) {
        //String keyString = "abcdeafgd";
        char [] keyArray = text.toCharArray();
        int minimumNoOfRepeat = Integer.MAX_VALUE;
        byte xterRepeat = 0;

        int repetitionCounter = 0;
        for (char i=0; i<keyArray.length; i++){
            if (text.length() > minimumNoOfRepeat){

            }

        }
        //String[] keyStringToArray = keyString.split(",");
        //System.out.println(text.split(text));
        //return repetitionCounter;
   }
}
