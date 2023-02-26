import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //대문자로 입력받기
        String line = sc.nextLine().toUpperCase();
        int[] alphabet = new int[26];
        
        //알파벳 배열에 횟수만큼 넣어주기
        for(int i = 0; i < line.length(); i++){
            alphabet[line.charAt(i)-65] += 1;
        }
        
        //max와 maxIdx 찾기
        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] > max){
                max = alphabet[i];
                maxIdx = i;
            }
        }
        
        //max가 여러개 존재하는지 아닌지 판별하기
        int count = 0;
        boolean check = true;
        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] == max){
                count ++;
                if(count >= 2) {
                    System.out.print("?");
                    check = false;
                    break;
                }
            }
        }

        if (check) System.out.print((char) (maxIdx+65));



    }
}