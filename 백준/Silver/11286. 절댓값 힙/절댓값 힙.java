import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> {
            int nFirst = Math.abs(o1);
            int nSecond = Math.abs(o2);
            if(nFirst == nSecond){
                return o1 - o2;
            }else{
                return nFirst - nSecond;
            }
        });

        for(int i=0; i<N; i++){
            int nInput = Integer.parseInt(br.readLine());
            if(nInput == 0){
                System.out.println(que.isEmpty()? "0" : que.poll());
            }else{
                que.add(nInput);
            }
        }
    }
}
