/********************************************************
  > File Name:Dick.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sun Jan 10 00:52:24 2016
 *********************************************************/
public class Test {
	public static void main(String []args) {
		Coin coin = new Coin();
		System.out.println("the initial facing up is "+coin.getSideUp());
		int heads = 0;
		int tails = 0;
		for (int i = 1;i<=20;i++) {
			coin.toss();
			if (coin.getSideUp() == "heads") {
				heads++;
			} else {
				tails++;
			}
			System.out.println(i+" time toss: "+coin.getSideUp());
		}
		System.out.println("total heads:"+heads+";  "+"tails"+tails);
	}
}
