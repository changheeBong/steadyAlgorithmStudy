package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);

        int count = 1;
        String[] visiter = br.readLine().split(" ");

        int sum = 0;
        for(int i = 0; i < X; i++){
            sum += Integer.parseInt(visiter[i]);
        }
        int result = sum;

        for(int i = 0; i < N-X; i++){


            sum += Integer.parseInt(visiter[i + X]);
            sum -= Integer.parseInt(visiter[i]);

            if(result == sum) count++;
            if(sum > result) {
                count = 1;
                result = sum;
            }

        }

        if(result == 0){
            System.out.println("SAD");
        }else {

            System.out.println(result);
            System.out.println(count);
        }
    }
}
