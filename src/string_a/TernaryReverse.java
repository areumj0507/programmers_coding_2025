package string_a;

import java.util.HashMap;
import java.util.Map;

public class TernaryReverse {
    public static int solution(int n) {
        int answer = 0;
        String ternaryStr = "";

        // 1. 3진법의 reverse 만들기
        while(true) {
            ternaryStr += n % 3;
            n = n / 3;

            if(n < 3) {
                if(n != 0) {
                    ternaryStr += n;
                }
                break;
            }
        }

        // 2. 10진수로 변환
        Map<Integer, Integer> ternaryMap = new HashMap<>();
        for(int i = 0; i < ternaryStr.length(); i++) {
            ternaryMap.put(i, ternaryStr.charAt(ternaryStr.length() -1 - i) - '0');
        }

        for(Integer num : ternaryMap.keySet()) {
            answer += (int) (Math.pow(3, num) * ternaryMap.get(num));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(45));       // 7
        System.out.println(solution(125));      // 229
        System.out.println(solution(10));       // 10
        System.out.println(solution(259));      // 433
        System.out.println(solution(1));        // 1
        System.out.println(solution(2));        // 2
    }
}
