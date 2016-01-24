/********************************************************
  > File Name:Coin.java
  > Auther: ihochang
  > Mail: yihez@andrew.cmu.edu
  > Created Time: Sat Jan  9 21:15:34 2016
 *********************************************************/

import java.util.*;
public class Coin {
	private String sideUp;
	private double randomVal;
	public Coin() {
		decideSide();
	}
	private void decideSide() {
		randomVal = Math.random();
		if (randomVal < 0.5) {
			sideUp = "heads";
		} else {
			sideUp = "tails";
		}
	}
	public void toss() {
		decideSide();
	}
	public String getSideUp() {
		return sideUp;
	}
}
