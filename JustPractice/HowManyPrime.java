import java.util.*;
/*
題目：判斷兩數間有幾個Prime
*/
class Solution{
    int HowManyPrime(int min, int max){
        int ret = 0;
        // go through all possible number in range
        for(int i=2;i<max;i++)
            // determine whether the number is prime
            for(int j=2;j<=i;j++){
                // if number is prime
                if(i == j){
                    ret += 1;
                    System.out.println(i);
                    break;
                }
                if(i % j == 0)
                    break;
            }
        return ret;
    }
}

public class HowManyPrime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Solution method = new Solution();
        System.out.print("\n\t@HowManyPrime\nenter range( min max ): ");
        while( ! input.hasNextInt() ){
            System.out.println("\t[ warning : wrong answer ]\n");
            input.next();
        }
        int min = input.nextInt();
        int max = input.nextInt();
        int ans = method.HowManyPrime(min, max);
        System.out.println("ans: "+ans);

    }
}
