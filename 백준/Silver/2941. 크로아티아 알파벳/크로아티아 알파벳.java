import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        //목록에 나와있는 알파벳 count하고 제거
        //c=
        if(str.contains("c=")){
            count += (str.length() - str.replace("c=", "").length())/2;
            str = str.replace("c=", " ");
        }
        //c-
        if(str.contains("c-")){
            count += (str.length() - str.replace("c-", "").length())/2;
            str = str.replace("c-", " ");
        }
        //dz=
        if(str.contains("dz=")){
            count += (str.length() - str.replace("dz=", "").length())/3;
            str = str.replace("dz=", " ");
        }
        //d-
        if(str.contains("d-")){
            count += (str.length() - str.replace("d-", "").length())/2;
            str = str.replace("d-", " ");
        }
        //lj
        if(str.contains("lj")){
            count += (str.length() - str.replace("lj", "").length())/2;
            str = str.replace("lj", " ");
        }
        //nj
        if(str.contains("nj")){
            count += (str.length() - str.replace("nj", "").length())/2;
            str = str.replace("nj", " ");
        }
        //s=
        if(str.contains("s=")){
            count += (str.length() - str.replace("s=", "").length())/2;
            str = str.replace("s=", " ");
        }
        //z=
        if(str.contains("z=")){
            count += (str.length() - str.replace("z=", "").length())/2;
            str = str.replace("z=", " ");
        }

        //남은 알파벳들 count
        count += str.replace(" ","").length();

        System.out.println(count);
    }
}