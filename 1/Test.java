/********************************************************
  > File Name:Dick.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sun Jan 10 00:52:24 2016
 *********************************************************/
public class Test {
	public static void main(String []args) {
		Coin coin = new Coin();
		for (int i = 0;i<20;i++) {
		System.out.println(coin.randomDecide());
		}
	}
}
