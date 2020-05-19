import java.util.*;

public class StringToNum{
    public static void main(String[] args){
    	Scanner take = new Scanner(System.in);
    	String str1 = "123";
    	// input string
        System.out.print("enter a number(interger): "); 
    	while( !take.hasNext() ){ // FPD
			System.out.print("輸入錯誤! 請輸入整數: ");
			take.next(); // 清除剛才讀取的內容;  		
    	}
    	str1 = take.next();
    	// string to num
        int num = Integer.parseInt(str1);
        double num2 = Double.parseDouble(str1);
        // output result
        System.out.println(num+"\t"+num2);
    }
}