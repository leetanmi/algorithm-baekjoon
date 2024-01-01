import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int passCount = 0;
    static int[] passArr;
    static int[] currArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int count = 0;
        passCount = 0;
        passArr = new int[4];
        currArr = new int[4];

        char[] inputArr = new char[S];
        inputArr = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            passArr[i] = Integer.parseInt(st.nextToken());
            if(passArr[i] == 0) passCount++;
        }

        for(int i=0; i<P; i++){ //초기 세팅
            put(inputArr[i], '+');
        }

        if(passCount == 4) count++;

        for(int j=P; j<S; j++){
            int i = j-P;
            put(inputArr[j], '+');
            put(inputArr[i], '-');

            if(passCount == 4) count++;
        }

        System.out.println(count);
        br.close();
    }

    private static void add(int index){
        currArr[index]++;
        if(currArr[index] == passArr[index]){
            passCount++;
        }
    }

    private static void remove(int index){
        if(currArr[index] == passArr[index]){
            passCount--;
        }
        currArr[index]--;
    }

    private static void put(char c, char calc) {
        int index = 0;
        if(c == 'A'){
            index = 0;
        }else if (c == 'C'){
            index = 1;
        }else if (c == 'G'){
            index = 2;
        }else if (c == 'T'){
            index = 3;
        }

        if(calc == '+'){
            add(index);
        }else if(calc == '-'){
            remove(index);
        }

    }
}
