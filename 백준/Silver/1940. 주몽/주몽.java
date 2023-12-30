import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] aNum = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            aNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(aNum);

        int nCnt  = 0;
        int ni    = 0;
        int nj    = N-1;
        int nSum  = 0;
        while(ni < nj){
            nSum = aNum[ni] + aNum[nj];
            if(nSum < M){
                ni++;
            } else if(nSum > M){
                nj--;
            } else{
                nCnt++;
                ni++;
                nj--;
            }
        } //end while
        System.out.println(nCnt);
    }
}