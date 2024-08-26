package mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj12847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        String[] arr = br.readLine().split(" ");
        int[] money =  new int[N];
        for(int i = 0; i < N; i ++){
            money[i] = Integer.parseInt(arr[i]);
        }
        long sum = 0;
        for(int i = 0; i < K; i ++){
            sum += money[i];
        }

        long result = sum;
        for(int i = 0 ; i < N - K; i ++){
            sum -= money[i];
            sum += money[i+K];
            if(sum > result) result = sum;
        }
        System.out.println(result);
    }
}
