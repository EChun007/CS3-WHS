import java.io.*;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("pr101.dat"));
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(scan.nextLine());
            int num = 0;
            int num2 = 1;
            for (int j = 0; j < x; j++) {
                int temp = num;
                num = num2;
                num2 += temp;
            }
            System.out.println(num);
        }
        scan.close();
    }
}