package string_a;

public class WeirdStringMaker {
    public static String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.trim().split("\\s+");

        for(String word : words) {
            String[] alphas = word.split("");

            for(int j=0; j<alphas.length; j++) {
                if(j%2 == 0) {
                    stringBuilder.append(alphas[j].toUpperCase());
                }else {
                    stringBuilder.append(alphas[j].toLowerCase());
                }

                if(j == alphas.length - 1) {
                    stringBuilder.append(" ");
                }
            }
        }

        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(solution("try  hello  world"));
        System.out.println(solution("try hello world"));
        System.out.println(solution("areum   jeon kyoungmin kim"));
    }
}
