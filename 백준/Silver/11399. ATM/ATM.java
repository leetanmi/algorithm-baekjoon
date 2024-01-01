import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrN = new int[N];

        for(int i=0; i<N; i++){
            arrN[i] = sc.nextInt();
        }

        for(int i=1; i<N; i++){
            int index = i;
            int value = arrN[index];
            for(int j=i-1; j>=0; j--){
                if(arrN[j] < arrN[i]){
                    index = j+1;
                    break;
                }

                if(j == 0) index = 0;
            }

            for(int j=i; j>index; j--){
                arrN[j] = arrN[j-1];
            }

            arrN[index] = value;
        }

        int[] arrS = new int[N];
        arrS[0] = arrN[0];
        int result = arrS[0];
        for(int i=1; i<N; i++){
            arrS[i] = arrS[i-1] + arrN[i];
            result += arrS[i];
        }
        System.out.println(result);
    }
}
