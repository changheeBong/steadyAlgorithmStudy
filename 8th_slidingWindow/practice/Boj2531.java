package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Boj2531 {
    static int N,d,k,c, cho[], visit[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
         N = Integer.parseInt(s[0]);
         d = Integer.parseInt(s[1]);
         k = Integer.parseInt(s[2]);
         c = Integer.parseInt(s[3]);

        cho = new int[N];
        visit = new int [d+1];
        for(int i = 0 ; i < N; i ++){
            cho[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solution());

    }

    static int solution(){
        int total = 0, max = 0;
        for(int i = 0; i< k; i++){
            if(visit[cho[i]] == 0) total ++;
            visit[cho[i]]++;
        }
        max = total;
        for(int i = 1; i < N; i++){
            if(max <= total){
                if(visit[c] == 0) max = total + 1;
                else max = total;
            }
            visit[cho[i-1]] --;
            if(visit[cho[i-1]] == 0) total--;

            if(visit[cho[(i+k - 1) % N]] == 0) total++;
            visit[cho[(i + k - 1) % N]]++;
        }
        return max;
    }
}
