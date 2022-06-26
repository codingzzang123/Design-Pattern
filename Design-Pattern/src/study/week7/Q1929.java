package study.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean flag[] = new boolean[m+1];
        
        flag[0]=true;
        flag[1]=true;
        
        for(int i=2; i<=Math.sqrt(m+1); i++) {
        	for(int j=i*i; j<m+1; j+=i) {
        		flag[j] = true;
        	}
        }
        
        for(int i=n; i<m+1; i++) {
        	if(flag[i]==false)
        		System.out.println(i);
        }
	}
}
