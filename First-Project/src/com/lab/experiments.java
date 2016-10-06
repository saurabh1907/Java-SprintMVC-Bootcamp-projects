package com.lab;

public class experiments
{

String abc; int a;
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return abc + a;
	}
public static void main(String[] args) {
	experiments exp = new experiments();
	exp.abc= "hello";
	exp.a=10;
	System.out.println(exp.toString());
	
}

}

