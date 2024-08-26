package mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj24499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        int[] arr = new int[N];
        String[] pie = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(pie[i]);
        }
        int sum = 0;
        for(int i = 0; i < K; i++){
            sum+= arr[i];
        }

        int result = sum;

        for(int i = 0; i< N; i++){
            sum -= arr[i];
            sum += arr[(i+K)%N];
            if(result < sum) result = sum;
        }

        System.out.println(result);
    }
}
