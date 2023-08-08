//Baekjoon 10866 bt JAVA

import java.util.*;

public class b10866 {
    public static void main(String args[]) {
        Deque<Integer> deque = new ArrayDeque<>(); //Deque 선언
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int line = sc.nextInt(); //명령어 수 입력 받기
        for (int i = 0; i < line; i++) {
            String command = sc.next(); //명령어 입력 받기
            switch (command) {
                case "push_front": //정수를 deque의 앞에 넣기
                    int num1 = sc.nextInt();
                    deque.addFirst(num1);
                    break;
                case "push_back": //정수를 deque의 뒤에 넣기
                    int num2 = sc.nextInt();
                    deque.addLast(num2);
                    break;
                case "pop_front": //가장 앞의 수 빼기
                    if (deque.size() == 0) //deque에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(deque.removeFirst()).append("\n");
                    break;
                case "pop_back": //가장 뒤의 수 빼기
                    if (deque.size() == 0) //deque에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(deque.removeLast()).append("\n");
                    break;
                case "size": //정수 개수 출력
                        sb.append(deque.size()).append("\n");
                    break;
                case "empty": //비어있는지
                    if (deque.isEmpty() == true) //비어있을 때
                            sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;
                case "front": //가장 앞의 수 출력
                    if (deque.size() == 0) //deque에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(deque.getFirst()).append("\n");
                    break;
                case "back": //가장 뒤의 수 출력
                    if (deque.size() == 0) //deque에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(deque.getLast()).append("\n");
                    break;
                }
            }
        System.out.print(sb);
    }
}

