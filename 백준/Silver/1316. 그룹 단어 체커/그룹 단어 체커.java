import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int count = 0;
        for(int i = 0; i < (int)num; i++){
            String str = sc.nextLine();

            // str에서 연속하는 중복문자는 제외하고 새로 담는다.
            String reducedStr = "" + str.charAt(0);
            for(int j = 1; j < str.length(); j++){
                if(str.charAt(j-1) != str.charAt(j)) reducedStr += str.charAt(j);
            }

            // reducedStr에서 중복하는 문자가 있으면 그룹단어 x 없으면 그룹단어 ㅇ
            boolean isGroupWord = true;
            while(reducedStr.length()>0){
                String temp = "" + reducedStr.charAt(0);
                reducedStr = reducedStr.substring(1);
                if(reducedStr.contains(temp)){
                    isGroupWord = false;
                    break;
                }
            }

            if(isGroupWord) count++;
        }
        System.out.println(count);
    }
}