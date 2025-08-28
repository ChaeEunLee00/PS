import java.io.*;
import java.util.*;

public class Main {
    public static int[][] apt = new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(apartment(k, n));
        }
    }

    public static int apartment(int k, int n){
        if(apt[k][n] != 0) return apt[k][n];
        if(k == 0) return apt[k][n] = n;

        for(int i = 1; i <= n; i++){
            apt[k][n] += apartment(k-1, i);
        }
        return apt[k][n];
    }
}