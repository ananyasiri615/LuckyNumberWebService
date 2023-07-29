package com.ars;

public class CalculateLuckyNumberImpl implements CalculateLuckyNumber{

	@Override
	public int calculateLuckyNumber(NameInput name) {
		int tot= name.getName().length();
		String str = name.getName();
		boolean a =false;
		boolean e =false;
		boolean i =false;
		boolean o =false;
		boolean u =false;
		
		for(int j=0;j<tot;j++) {
			
			if(str.charAt(j) == ' ') {
				tot--;
			}
			if(str.charAt(j) == 'a' || str.charAt(j) == 'A') {
				a=true;
			}
			else if(str.charAt(j) == 'e' || str.charAt(j) == 'E') {
				e=true;
			}
			else if(str.charAt(j) == 'i' || str.charAt(j) == 'I') {
				i=true;
			}
			else if(str.charAt(j) == 'o' || str.charAt(j) == 'O') {
				o=true;
			}
			else if(str.charAt(j) == 'u' || str.charAt(j) == 'U') {
				u=true;
			}
		}
		int count=0;
		if(a==true) {
			count++;
		}
		if(e==true) {
			count++;
		}
		if(i==true) {
			count++;
		}
		if(o==true) {
			count++;
		}
		if(u==true) {
			count++;
		}
		
		int result = tot-count;
		
		return result;
	}

}