import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrN = new int[N];

        for(int i=0; i<N; i++){
            arrN[i] = sc.nextInt();
        }

        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(arrN[j] > arrN[j+1]){
                    int temp = arrN[j];
                    arrN[j] = arrN[j+1];
                    arrN[j+1] = temp;
                }
            }
        }

        for(int num : arrN){
            System.out.println(num);
        }
    }
}
