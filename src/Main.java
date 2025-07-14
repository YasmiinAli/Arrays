import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          int[] scores = {85,92,78,96,88};
//           the max score
          Arrays.sort(scores);
          System.out.println(scores[scores.length-1]);
//          sum and average scores
        double sum =0;

        for(int i=0; i<scores.length; i++ ){
            sum += scores[i];
        }
        System.out.println("sum of scores " + sum);
        System.out.println("average of scores " + sum/scores.length + "%");

//        search 92 and display its index after sorting
       int index = Arrays.binarySearch(scores,92);
        System.out.println("Index of 92 " + index );
//        if the value not found
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value to search " );
        int valueToFound = scanner.nextInt();

        if (Arrays.binarySearch(scores, valueToFound) >= 0) {
            System.out.println("this value already found ");
        } else {
            System.out.println("this value not found ");
        }


    }
}