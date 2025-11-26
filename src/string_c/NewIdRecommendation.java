package string_c;

public class NewIdRecommendation {
    public static String solution(String new_id) {
        // 1단계: 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2단계: 알파벳 소문자, 숫자, -, _, .를 제외한 모든 문자를 제거
        new_id = new_id.replaceAll("[^a-z0-9_.-]", "");

        // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");

        // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");

        // 5단계: 빈 문자열이라면, new_id에 "a"
        if(new_id.isBlank()) {
            new_id = "a";
        }

        // 6단계: 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        // 6-1단계: 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.$", "");
        }

        // 7단계: new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }

    public static String solution2(String new_id) {
        new_id = new_id.toLowerCase()
                .replaceAll("[^a-z0-9_.-]", "")
                .replaceAll("\\.{2,}", ".")
                .replaceAll("^\\.|\\.$", "")
                .replaceAll("^$", "a")
                .replaceAll("(.{15}).*", "$1")
                .replaceAll("\\.$", "");

        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }

    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));    // "bat.y.abcdefghi"
        System.out.println(solution("z-+.^."));                         // "z--"
        System.out.println(solution("=.="));                            // "aaa"
        System.out.println(solution("123_.def"));                       // "123_.def"
        System.out.println(solution("abcdefghijklmn.p"));               // "abcdefghijklmn"

        System.out.println("----------");

        System.out.println(solution2("...!@BaT#*..y.abcdefghijklm"));    // "bat.y.abcdefghi"
        System.out.println(solution2("z-+.^."));                         // "z--"
        System.out.println(solution2("=.="));                            // "aaa"
        System.out.println(solution2("123_.def"));                       // "123_.def"
        System.out.println(solution2("abcdefghijklmn.p"));               // "abcdefghijklmn"
    }
}
