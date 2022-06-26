package study.week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1312 {
	public static void main(String[] args) throws IOException {
		/* 이걸로하면 런타임 에러 (제출 실패) 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String result = String.valueOf((Double.parseDouble(st.nextToken())/ Double.parseDouble(st.nextToken())));
		System.out.println(result.charAt(Integer.parseInt(st.nextToken())+1));
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        A %= B;
        for (int i = 0; i < N - 1; i++) {
            A *= 10;
            A %= B;
        }
        A *= 10;
        bw.write(A / B + "\n");

        bw.flush();
        br.close();
        bw.close();
	}
}
