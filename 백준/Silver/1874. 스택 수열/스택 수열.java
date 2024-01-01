import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nArr = new int[N];

        for(int i=0; i<N; i++){
            nArr[i] = sc.nextInt();
        }

        int num = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        boolean boolPossible = true;
        for(int i=0; i<N; i++){
            int seq = nArr[i];

            if(seq >= num){

                while(seq >= num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");

            }else{
                int popNum = stack.pop();
                if(popNum > seq){ // 5 > 3
                    boolPossible = false;
                    System.out.println("NO");
                    break;
                }else{
                    sb.append("-\n");
                }
            }
        } //end for

        if(boolPossible) System.out.println(sb.toString());
    }
}
