import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nNumCnt = Integer.parseInt(st.nextToken());
        int nSumCnt = Integer.parseInt(st.nextToken());

        long sumArray[] = new long[nNumCnt+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=nNumCnt; i++){
            sumArray[i] = sumArray[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int j=0; j<nSumCnt; j++){
            st = new StringTokenizer(br.readLine());
            int nStart = Integer.parseInt(st.nextToken());
            int nEnd = Integer.parseInt(st.nextToken());
            System.out.println(sumArray[nEnd] - sumArray[nStart-1]);
        }
    }
}