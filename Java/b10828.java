//Baekjoon 10828 by JAVA
import java.util.Scanner;
import java.util.Stack;

public class b10828 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>(); //Stack 선언
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int line = sc.nextInt(); //명령어 수 입력 받기
        for (int i = 0; i < line; i++) {
            String command = sc.next(); //명령어 입력 받기
            switch (command) {
                case "push": //push 기능 구현
                    int num = sc.nextInt();
                    stack.push(num);
                    break;
                case "pop":  //pop 기능 구현
                    if (stack.size() == 0) //스택에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(stack.pop()).append("\n");
                    break;
                case "size": //size 기능 구현
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty": //empty 기능 구현
                    if (stack.size() == 0) //스택에 정수가 없을 때
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;
                case "top":
                    if (stack.size() == 0) //스택에 정수가 없을 때
                        sb.append("-1").append("\n");
                    else
                        sb.append(stack.peek()).append("\n");
                    break;
                }
            }
        System.out.println(sb);
        }
    }

