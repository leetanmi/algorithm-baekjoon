import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nNum = sc.nextInt();

        int nCnt = 1;
        int nStart = 1;
        int nEnd = 1;
        int nSum = 1;

        while(nEnd != nNum){
            if(nSum == nNum){
                nCnt++;
                nEnd++;
                nSum += nEnd;
            }else if(nSum > nNum){
                nSum -= nStart;
                nStart++;
            }else if(nSum < nNum){
                nEnd++;
                nSum += nEnd;
            }
        }
        System.out.println(nCnt);
    }
}