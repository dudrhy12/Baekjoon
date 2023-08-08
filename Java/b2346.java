//Baekjoon 2346 bt JAVA


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class b2346 {
    public static void main(String args[]) {
        Deque<Integer> deque = new ArrayDeque<>(); //Deque 선언
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int line = sc.nextInt(); //풍선 수 입력 받기
        sc.nextLine();
        for (int i = 0; i < line; i++) {
            int num = sc.nextInt();
            deque.addLast(num);
        }
        int key = deque.removeFirst();
        while (deque.size() != 0) {
            if (key > 0) {
                for (int k = 1; k < key; k++) {
                    deque.add(deque.poll());
                }
                deque.poll();
                deque.add(deque.poll());
            } else {
                for (int k = 1; k < key; k++) {
                    deque.addFirst(deque.pollLast());
                }
                deque.pollLast();
                deque.addFirst(deque.pollLast());
            }
            System.out.println(deque);
        }
        //System.out.print(sb);

    }
}
