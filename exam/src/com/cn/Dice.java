package com.cn;

public class Dice {
	
	private int dice;
	
	public void roll()
	{
		setDice((int) (Math.random() * 6+1)); 
	}
	
	public void display()
	{
		System.out.println("the dice value is:"+getDice());
	}
	
	public int getDice() {
		return this.dice;
	}
	
	public void setDice(int dice) {
		this.dice = dice;
	}
}
