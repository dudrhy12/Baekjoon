//Baekjoon 2164 by JAVA

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b2164 {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>(); //Queue 선언
        Scanner sc = new Scanner(System.in);
        int move = 0;
            int card = sc.nextInt(); //카드 번호 입력 받기
            for (int i = 1; i <= card; i++)
                queue.add(i);
            while (!(queue.isEmpty())) {
                if (queue.size() == 1)
                    break;
                queue.poll();
                if (queue.size() == 1)
                    break;
                move = queue.poll();
                queue.add(move);
            }
            System.out.print(queue.element());
    }
}
