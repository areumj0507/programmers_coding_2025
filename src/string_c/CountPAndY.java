package string_c;

public class CountPAndY {
    public static boolean solution(String s) {
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'p') {
                count++;
            }else if(c == 'y') {
                count--;
            }
        }

        return count == 0;
    }

    public static boolean solution2(String s) {
        s = s.toLowerCase();

        long pCount = s.chars().filter(c -> c == 'p').count();
        long yCount = s.chars().filter(c -> c == 'y').count();

        return pCount == yCount;
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
        System.out.println("----------");
        System.out.println(solution2("pPoooyY"));
        System.out.println(solution2("Pyy"));
    }
}
