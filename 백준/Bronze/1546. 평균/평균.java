import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nCount = sc.nextInt();
        int nScores[] = new int[nCount];

        for(int i=0; i<nCount; i++){
            nScores[i] = sc.nextInt();
        }

        long nMax = 0;
        long nSum = 0;
        for(int i=0; i<nCount; i++){
            if(nScores[i] > nMax){
                nMax = nScores[i];
            }

            nSum += nScores[i];
        }

        System.out.println(nSum * 100.0 / nMax / nCount);
    }
}