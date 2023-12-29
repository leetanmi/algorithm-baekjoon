import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nCount = sc.nextInt();
        String strNum = sc.next();

        char[] cNum = strNum.toCharArray();
        int nSum = 0;

        for(int i=0; i<cNum.length; i++){
            nSum += cNum[i] - 48;
        }

        System.out.println(nSum);
    }
}