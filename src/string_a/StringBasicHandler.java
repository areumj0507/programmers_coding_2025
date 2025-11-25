package string_a;

public class StringBasicHandler {
    public static boolean solution(String s) {
        boolean answer = true;
        char[] chars = s.toCharArray();
        if(chars.length != 4 && chars.length != 6) {
            return false;
        }

        for(char ch : chars) {
            if(!Character.isDigit(ch)) {
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }
}
