package mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj29718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i ++){
            String[] str = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < K; i ++){
            for(int j = 0; j < N; j++){
                sum += arr[j][i];
            }
        }
        int result = sum;
        for(int i = 0; i < M - K; i ++){
            for(int j = 0; j < N ; j++){
                sum -= arr[j][i];
                sum += arr[j][i+K];
            }
            if(sum > result) result = sum;
        }
        System.out.println(result);
    }
}
