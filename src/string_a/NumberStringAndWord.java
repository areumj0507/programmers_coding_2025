package string_a;

import java.util.HashMap;

public class NumberStringAndWord {
    public static int solution(String s) {
        HashMap<String, String> convertMap = new HashMap<>();
        convertMap.put("zero", "0");
        convertMap.put("one", "1");
        convertMap.put("two", "2");
        convertMap.put("three", "3");
        convertMap.put("four", "4");
        convertMap.put("five", "5");
        convertMap.put("six", "6");
        convertMap.put("seven", "7");
        convertMap.put("eight", "8");
        convertMap.put("nine", "9");

        for(String key : convertMap.keySet()) {
            if(s.contains(key)) {
                s = s.replace(key, convertMap.get(key));
            }
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));     // 1478
        System.out.println(solution("23four5six7"));        // 234567
        System.out.println(solution("2three45sixseven"));   // 234567
        System.out.println(solution("123"));                // 123
    }
}
