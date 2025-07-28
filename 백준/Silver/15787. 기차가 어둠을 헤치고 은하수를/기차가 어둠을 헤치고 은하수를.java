import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] train = new boolean[N][20];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int statementNum = Integer.parseInt(st.nextToken());

            int trainNum = 0;
            int seatNum = 0;
            if(statementNum == 1){
                trainNum = Integer.parseInt(st.nextToken())-1;
                seatNum = Integer.parseInt(st.nextToken())-1;
                doStatementOne(train, trainNum, seatNum);
            }
            else if(statementNum == 2){
                trainNum = Integer.parseInt(st.nextToken())-1;
                seatNum = Integer.parseInt(st.nextToken())-1;
                doStatementTwo(train, trainNum, seatNum);
            }
            else if(statementNum == 3){
                trainNum = Integer.parseInt(st.nextToken())-1;
                doStatementThree(train, trainNum);
            }
            else if(statementNum == 4){
                trainNum = Integer.parseInt(st.nextToken())-1;
                doStatementFour(train, trainNum);
            }
        }

        System.out.println(countPassedTrain(train));
    }

    public static void doStatementOne(boolean[][] train, int trainNum, int seatNum){
        if(!train[trainNum][seatNum]) train[trainNum][seatNum] = true;
    }

    public static void doStatementTwo(boolean[][] train, int trainNum, int seatNum){
        if(train[trainNum][seatNum]) train[trainNum][seatNum] = false;
    }

    public static void doStatementThree(boolean[][] train, int trainNum){
        boolean temp = false;
        boolean prev = false;
        for(int i = 0; i < 20; i++){
            temp = train[trainNum][i];
            train[trainNum][i] = prev;
            prev = temp;
        }
    }

    public static void doStatementFour(boolean[][] train, int trainNum){
        boolean temp = false;
        boolean prev = false;
        for(int i = 19; i >= 0; i--){
            temp = train[trainNum][i];
            train[trainNum][i] = prev;
            prev = temp;
        }
    }

    public static int countPassedTrain(boolean[][] train){
        String trainStaus = "";
        Set<String> trainStausSet = new HashSet<>();

        for(int i = 0; i < train.length; i++){
            trainStaus = "";
            for(int j = 0; j < 20; j++){
                if(train[i][j]) trainStaus += "1";
                else trainStaus += "0";
            }

            if(!trainStausSet.contains(trainStaus)){
                trainStausSet.add(trainStaus);
            }
        }

        return trainStausSet.size();
    }
}