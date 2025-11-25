package string_c;

import java.util.Arrays;

public class ReverseNumberToArray {
    public static int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            // '0'으로 문자를 숫자로 변환
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }

        return answer;
    }

    public static int[] solution2(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(c -> c - '0')
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
        System.out.println(Arrays.toString(solution2(12345)));
    }
}
