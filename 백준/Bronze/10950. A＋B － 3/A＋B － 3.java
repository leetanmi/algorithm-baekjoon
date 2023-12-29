import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nCount = sc.nextInt();
        int nA = 0;
        int nB = 0;

        for(int i=0; i<nCount; i++){
            nA = sc.nextInt();
            nB = sc.nextInt();

            System.out.println(nA+nB);
        }
    }
}
