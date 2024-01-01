import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] arrN = new int[N.length()];

        for(int i=0; i<N.length(); i++){
            arrN[i] = Integer.parseInt(N.substring(i, i+1));
        }

        for(int i=0; i<N.length(); i++){
            int maxIdx = i;
            for(int j=i+1; j<N.length(); j++){
                if(arrN[j] > arrN[maxIdx]) maxIdx = j;
            }

            if(arrN[i] < arrN[maxIdx]){
                int temp = arrN[i];
                arrN[i] = arrN[maxIdx];
                arrN[maxIdx] = temp;
            }
        }

        for(int num : arrN){
            System.out.print(num);
        }
    }
}
