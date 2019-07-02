package com.sample.crud;

public class VowelConsonantCount {
	
	public static void main(String[] args) {
		String str="nandhakrishna";
		int vcount = 0;
		int ccount = 0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			
			char ch = str.charAt(i);
			if( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )
			{
				vcount++;
			}
			else if((ch>='a'&&ch<='z'))
			{
				ccount++;
			}
				
		}
		System.out.println(ccount);
		System.out.println(vcount);
		
	}

}
