import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nScore = sc.nextInt();
        String strResult = "";

        if(nScore >= 90){
            strResult = "A";
        }else if(nScore >= 80){
            strResult = "B";
        }else if(nScore >= 70){
            strResult = "C";
        }else if(nScore >= 60){
            strResult = "D";
        }else{
            strResult = "F";
        }

        System.out.println(strResult);
    }
}
