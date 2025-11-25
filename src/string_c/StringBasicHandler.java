package string_c;

public class StringBasicHandler {
    public static boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) {
            return false;
        }

        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean solution2(String s) {
        return s.matches("\\d{4}|\\d{6}");
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
        System.out.println("-----------");
        System.out.println(solution2("a234"));
        System.out.println(solution2("1234"));
    }
}
