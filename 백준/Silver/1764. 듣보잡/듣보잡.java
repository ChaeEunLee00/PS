import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> hear = new HashSet<>();
        for(int i = 0; i < N; i++){
            hear.add(br.readLine());
        }

        TreeSet<String> hearANDsee = new TreeSet<>();
        for(int i = 0; i < M; i++){
            String see = br.readLine();
            if(hear.contains(see)) hearANDsee.add(see);
        }
        StringBuilder sb = new StringBuilder();

        int size = hearANDsee.size();
        sb.append(size).append('\n');
        for(int i = 0; i < size; i++){
            String hearsee = hearANDsee.first();
            sb.append(hearsee).append('\n');
            hearANDsee.remove(hearsee);
        }
        System.out.println(sb);
    }
}