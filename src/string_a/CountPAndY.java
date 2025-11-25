package string_a;

public class CountPAndY {
    public static boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        String[] strArr = s.toUpperCase().split("");
        for(String str : strArr) {
            if("P".equals(str)) {
                pCount++;
            }else if("Y".equals(str)) {
                yCount++;
            }
        }

        return pCount == yCount;
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
}
