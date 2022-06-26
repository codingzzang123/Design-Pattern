package study.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cycle=1;
	
		int temp = fix(N);
		
		while(N != temp) {
			if(N==0)break;
			++cycle;
			temp = fix(temp);
		}
		System.out.println(cycle);
		br.close();
	}
	public static int fix(int i) {
		return (i % 10)*10 + ((i/10 + i%10)%10);
	}
}
