//Baekjoon 10845 bt JAVA

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class b10845 {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>(); //Queue 선언
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int last = 0;
        int line = sc.nextInt(); //명령어 수 입력 받기
        for (int i = 0; i < line; i++) {
            String command = sc.next(); //명령어 입력 받기
            switch (command) {
                case "push": //push 기능 구현
                    int num = sc.nextInt();
                    queue.add(num);
                    last = num; //Queue의 가장 뒤 정수 저장
                    break;
                case "pop":  //pop 기능 구현
                    if (queue.size() == 0) //Queue에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(queue.poll()).append("\n");
                    break;
                case "size": //size 기능 구현
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty": //empty 기능 구현
                    if (queue.size() == 0) //Queue에 정수가 없을 때
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;
                case "front": //front 기능 구현
                    if (queue.size() == 0) //Queue에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(queue.element()).append("\n");
                    break;
                case "back": //back 기능 구현
                    if (queue.size() == 0) //Queue에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
