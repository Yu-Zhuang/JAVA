import java.util.*;
/*
題目：連續輸入5張牌花色與點數 串在linked list中, 最後輸出所有linked list牌的資料
*/
class Card{
	// data attribute
	String format;
	int rank;
	Card next = null;
	// method attribute
	Card NewCard(String format, int rank){
		Card newCard = new Card();
		newCard.rank = rank;
		newCard.format = format;
		return newCard;
	}
	void CardAdd(String format, int rank){
		Card tmp = this;
		while(tmp.next != null)
			tmp = tmp.next;
		tmp.next = NewCard(format, rank);
	}
	void CardPrint(){
		Card tmp = this.next;
		while(tmp != null){
			System.out.print("["+tmp.format+":"+tmp.rank+"]->");
			tmp = tmp.next;
		}
		System.out.println("|END");
	}
}

public class FiveCard{
    public static void main(String[] args){
    	Scanner take = new Scanner(System.in);
    	Card card = new Card();
    	for(int i=0;i<5;i++){
    		System.out.print("輸入 花色 點數: ");
    		take.hasNext();
    		card.CardAdd(take.next(), take.nextInt());
    	}
    	card.CardPrint();
    }
}
