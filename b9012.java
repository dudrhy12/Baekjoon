//Baekjoon 9012 by JAVA
import java.util.Scanner;
import java.util.Stack;

public class b9012 {
    public static void main(String args[]) {
        Stack<Character> stack = new Stack<>(); //Stack 선언
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int line = sc.nextInt(); //명령어 수 입력 받기
        sc.nextLine(); //줄바꿈 소비
        for (int i = 0; i < line; i++) {
            String str = sc.nextLine(); //한 줄 입력 받기
            for (int k = 0; k < str.length(); k++){
                if (stack.size() == 0 || str.charAt(k) == '(') //무조건 원소 추가
                    stack.push(str.charAt(k));
                else {
                    if (stack.peek() == '(') //짝 지어지는 경우
                        stack.pop(); //원소 제거
                    else //짝 지어지지 않는 경우
                        stack.push(str.charAt(k)); //원소 추가
                }
            }
            if (stack.empty()) //VPS인 경우
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");
            stack.clear(); //stack 비우기
        }
        System.out.print(sb);
    }
}
