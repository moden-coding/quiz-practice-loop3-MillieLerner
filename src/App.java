/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. The test scores should be in a range from 0 to 100. If the user enters an invalid number
 *  tell them to re-enter the value. Keep track of the number of passing and failing test grades. Assume 
 *  that a failing grade is below a 60. When the user enters '-1', print out the number of passing and failing students.
 */


 import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int f=0;
        int p=0;
        while(true){
            System.out.println("What is the test grade?");
            int number = Integer.valueOf(scanner.nextLine());
            if(number==-1){
                break;
            } else if (number>100|| number<0){
                System.out.println("invalid. Re-enter value.");
            } else {
                if (number>=60){
                    p++;
                } else{
                    f++;
                }
            }
        } System.out.println("There were "+ p+" passing grades and "+f+" failing grades.");
    }
}
