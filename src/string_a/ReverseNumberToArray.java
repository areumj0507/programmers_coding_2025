package string_a;

import java.util.Arrays;

public class ReverseNumberToArray {
    public static int[] solution(long n) {
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        int[] answer = new int[strArr.length];

        int num = 0;
        for(int i=strArr.length-1; i>=0; i--) {
            answer[num] = Integer.parseInt(strArr[i]);
            num++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}
