/********************************************************
  > File Name:Coin.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sat Jan  9 21:15:34 2016
 *********************************************************/

import java.util.*;
public class Coin {
	//private enum side {"heads","tails"};
	private String sideUp;
	private void Coin() {
		double randomVal = Math.random();
		if (randomVal < 0.5) {
			sideUp = "heads";
		} else {
			sideUp = "tails";
		}
	}
	public void toss() {
		Coin();
	}
	public String getSideUp() {
		return sideUp;
	}
}
