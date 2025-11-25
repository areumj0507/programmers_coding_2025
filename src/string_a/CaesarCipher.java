package string_a;

public class CaesarCipher {
    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ') {
                answer.append(' ');
                continue;
            }

            if((chars[i] + n) > 122) {
                chars[i] -= 26;
                answer.append((char)(chars[i] + n));
                continue;
            }

            if((chars[i] + n) > 90 && (chars[i] + n) < 97) {
                chars[i] -= 26;
                answer.append((char)(chars[i] + n));
                continue;
            }

            answer.append((char)(chars[i] + n));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("XYZ", 26));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }
}
