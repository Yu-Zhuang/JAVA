import java.util.*;
/*
題目：古典問題：有一對兔子，
從出生後第3個月起每個月都生一對兔子，
小兔子長到第三個月後每個月又生一對兔子，假如兔子都不死，問每個月的兔子對數為多少？
*/
class Solution{
	int HowManyRabbit(int months){
		if(months>0 & months<3)
			return 1;
		else if(months>2)
			return HowManyRabbit(months-1)+HowManyRabbit(months-2);
		else{
			System.out.println("\t[ warning 102 : error input ]");
			return 0;
		}
	}
}

public class RabbitProblem{
    public static void main(String[] args){
    	Solution method = new Solution();
    	Scanner input = new Scanner(System.in);

    	System.out.print("請輸入第幾個月: ");
    	while( ! input.hasNextInt() ){
    		System.out.println("\t[ warning 101 : error input ]");
    		input.next();
    	}
    	int ans = input.nextInt();

    	System.out.println("num:"+ans);
    	System.out.println("Ans:"+method.HowManyRabbit(ans));
    }
}
