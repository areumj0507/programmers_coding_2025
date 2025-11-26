package string_c;

public class NumberStringAndWord {
    public static int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < words.length; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }

    public static int solution2(String s) {
        return Integer.parseInt(s.replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9"));

    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));     // 1478
        System.out.println(solution("23four5six7"));        // 234567
        System.out.println(solution("2three45sixseven"));   // 234567
        System.out.println(solution("123"));                // 123
        System.out.println("----------");
        System.out.println(solution2("one4seveneight"));     // 1478
        System.out.println(solution2("23four5six7"));        // 234567
        System.out.println(solution2("2three45sixseven"));   // 234567
        System.out.println(solution2("123"));                // 123
    }
}
