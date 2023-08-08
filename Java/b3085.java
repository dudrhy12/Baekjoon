//Baekjoon 3085 by JAVA

import java.util.Arrays;
import java.util.Scanner;

public class b3085 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //보드 크기 입력받기
        int max = 0;
        char[][] board = new char[size][size]; //보드 선언
        for (int i=0; i<size; i++){
            String temp = sc.next();
            for (int k=0; k<size; k++){
                board[i][k] = temp.charAt(k); //보드 채우기
            }
        }
    }
}
