package mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj20437 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T ; t++){
            String str = br.readLine();
            int[] visited = new int[27];
            int k = Integer.parseInt(br.readLine());
            int N = str.length();
            int[] start = new int[27];
            int result1 = 10001, result2 = 0;
            for(int i = 0; i <  N; i ++){
                int n = str.charAt(i)- 'a';
                if(visited[n] == 0)   start[n] = i;
                else if(visited[n] > 0 && visited[n]+1 == k){
                    result1 = Math.min(result1,  i- start[n] );
                    result2 = Math.max(result2,  i - start[n] );
                }
                    visited[n] ++;
            }

            if(result1 == 10001 || result2 == 0) System.out.println(-1);
            else{
                System.out.println(result1 + " " + result2);
            }


        }
    }
}
