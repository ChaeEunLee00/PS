import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Map<String,String> pokemon = new HashMap();
        for(int i = 1; i <= M; i++){
            String mon = br.readLine();
            pokemon.put(Integer.toString(i) ,mon);
            pokemon.put(mon,Integer.toString(i) );
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(pokemon.get(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}