package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj29700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);
        int count = 0, result = 0;
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i ++){
            String str = br.readLine();
            for(int j = 0; j< M; j++){
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        if(M < K){
            System.out.println(0);
            return;
        }


        for(int i = 0; i < N ; i++){
            count = 0;
            for(int j = 0; j < K; j++){
                count += arr[i][j];
            }
            if(count == 0) result ++;
            for(int j = 0; j < M - K; j++){

                count -= arr[i][j];
                count += arr[i][j+K];

                if(count == 0) result++;
            }
        }

        System.out.println(result);
    }
}
