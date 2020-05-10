# JAVA
---
## 第一個JAVA程式:
```java
/*
java 註解方式與C一樣
*/
public class Test {  //跟檔名一樣名稱
	public static void main(String[] args){ //主程式
		System.out.println("第一個 Java 應用程式");
	}
}
```

---
## 變數
```java
// primitive data type
public class test{
	public static void main(String[] args){
		int n1 = 5; // +- 2^32, 4 byte
		long n2 = 10000; // +- 2^64, 8 byte
		float n3 = 3.14; // +- 3.4e+38, 4 byte
		double n4 = 3.1415 // +- 1.79e+308, 8 byte
		char c = 97; // 0~65535, 2 byte
		var n5 = 100; // var保留字會 自動判斷右邊值 來給型別
	}
}
/*** 
reference data type:
	String, Array, Object 
*/
public class test{
	public static void main(String[] args){
		String str1 = "hello\tJAVA\n"; // string
		System.out.print(str1); // 不自動換行的輸出
		System.out.println("字串長度: " + str1.length()) // println()會自動換行
		// Array
		int[] a; // 宣吿一個陣列 // 亦可寫成 int[] a = new int[10]; // int a[] = {1,2,3};
    	a = new int[10]; // 配置記憶體
    	int[] b = a; // b 與 a 同用一個記憶體地址;
    	for(int i=0;i<10;i++)
    		a[i] = i;
    	for(int i:a)
    		System.out.println(i);
    	// 多維Array
    	int[][] a = new int[3][4];
    	/* 各別分配:
    	int[][] a = new int[3][];
    	for(int i=0;i<3;i++)
    		a[i] = new int[i+1];
    	for(int[] i:a)
			for(int j:i)
				System.out.println(j);
    	*/
	}
}

// reference data type 記憶體釋放:
// varName = null; //強制回收
//   //不做任何事JAVA也會在適當時機自動回收, ex: 離開有效範圍, 指向其他地方..
```
### 常數
```java
public class test{
	public static void main(String[] args){
		final int num = 5; // 加上 final 會使該變數變為常數
		float pi = 3.14;
		final pi; // 加上 final 會使該變數變為常數
	}
}
```
### 命名style: ageNum, ageOfStudent...

---
## 運算式(expression)
### 與c相同
### 一元 與 二元 算符
```java
// 一元運算符: char byte short, 運算前會轉為 int;
// 二元運算符: 
//  如有double則 另一個運算元會提升為double;
//  如有float則 另一個運算元會提升為float;
//  如有long則 另一個運算元會提升為long;
//  以上皆不符合則 皆提升為int;

// ps. 因此在程式中要注意 原型別是否會在運算中 被提升為更多byte的型別而出現錯誤;
// ps. 轉型: (type) variable; // 也要注意一樣byte的問題;
```

---
## 基本輸出入
```java
public class test{
    public static void main(String[] args){
        System.out.print("hello world\n"); //不會自動換行
        System.out.print("hello world"); //會自動換行
    }
}

import java.util.*;
public class test{
    public static void main(String[] args){
    	Scanner take=new Scanner(System.in);
        int num=0;

        System.out.print("enter a number: ");
        num = take.nextInt(); // .next();取字串, nextByte();取byte, nextLong();取long... Float, Double...
        /* 防呆: hasnextInt()
        // 預防 輸入型別與預定不符合
        while( ! take.hasNextInt() ){ // 讀取 並判斷型別是否正確, 正確回傳true;
			System.out.print("輸入錯誤! 請輸入整數: ");
			take.next(); // 清除剛才讀取的內容;
        }
        num = take.nextInt(); // 將正確 讀取內容 assign給 num;
        */
        System.out.print("take ="+num);
    }
}
```

---
## 流程控制 與 迴圈
```java
// if, else if, else
// switch, for(;;), while(), do while(); (break, continue也是)
// 皆與 C 相同
// ps. for-each loop
public class test{
    public static void main(String[] args){
    	int a[] = { 1,3,5,7,9 };
    	for(int i:a)
    		System.out.println(i);
    }
}

```

---
## 物件
```java
class IcCard{ // 定義 物件的類別
	String name; // 屬性
	int id;
	void show(){ // 方法
		System.out.println(name+"\nid:"+id);
	}
    boolean editId(int newId){
        if(newId > 0){
            id = newId;
            return true;
        }
        else
            return false;
    }
}

public class test{ // 主程式
    public static void main(String[] args){
    	IcCard myCard = new IcCard();
    	myCard.name = "John";
    	myCard.id = 131;
        myCard.show();
        
        if( myCard.editId(318) ){
            myCard.show();
        }
        else
            System.out.println("edit not success");
    }
}
// 與JavaSrcipt 一樣在類別定義中this代表此物件本身;

/***
	多重定義(over loading)
*/
class method{
    void methods(int num){
        System.out.println("im 1st method");
    }
    void methods(double num){
        System.out.println("im 2nd method");
    }
    void methods(int num1, int num2){
        System.out.println("im 3rd method");
    }
}

public class test{
    public static void main(String[] args){
        int num1 = 1, num2 = 2;
        double num3 = 3.3;
        method mtd = new method();

        mtd.methods(num1);
        mtd.methods(num1, num2);
        mtd.methods(num3);
    }
}	
```