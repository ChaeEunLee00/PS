import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Set<String> subStrings = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String subStr = str.substring(i,j+1);
                if(!subStrings.contains(subStr)) subStrings.add(subStr);
            }
        }
        System.out.println(subStrings.size());
    }
}