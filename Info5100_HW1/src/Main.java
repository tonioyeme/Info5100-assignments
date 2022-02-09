import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ///Q1 test case
        System.out.println("Q1");
        String s1 = "";
        String s2 = "abcba";
        String s3 = "abc";
        System.out.println(strPalindrome(s1));
        System.out.println(strPalindrome(s2));
        System.out.println(strPalindrome(s3));
        System.out.println("====================================================");


        ///Q2 test case
        System.out.println("Q2");
        String s4 = "";
        String s5 = "aaa";
        String s6 = "abc";
        System.out.println(allUnique(s4));
        System.out.println(allUnique(s5));
        System.out.println(allUnique(s6));
        System.out.println("====================================================");


        ///Q3 test case
        System.out.println("Q3");
        System.out.println(allUnique(s4));
        System.out.println(allUnique(s5));
        System.out.println(allUnique(s6));
        System.out.println("====================================================");

        ///Q4 test case
        System.out.println("Q4");
        String sa = "abc";
        String sb = "cba";
        String sc = "cde";
        System.out.println(isAnagram(sa,sb));
        System.out.println(isAnagram(sa,sc));
        System.out.println("====================================================");

        ///Q5 test case
        System.out.println("Q5");
        int y1 = 2012;
        int y2 = 2011;
        System.out.println(isLeapYr(y1));
        System.out.println(isLeapYr(y2));
        System.out.println("====================================================");

        ///Q6 test case
        System.out.println("Q6");
        int c1 = 99;
        int c2 = 149;
        int c3 = 199;
        int c4 = 201;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("====================================================");

        ///Q7 test case
        System.out.println("Q7");
        String sub1 = "app";
        String sub2 = "apple";
        String sub3 = "pear";
        System.out.println(isSubString(sub1, sub2));
        System.out.println(isSubString(sub1, sub3));
        System.out.println("====================================================");

        ///Q8 test case
        System.out.println("Q8");
        String g1 = "A";
        String g2 = "F";
        System.out.println(g1);
        System.out.println(g2);
        System.out.println("====================================================");

        ///Q9
        System.out.println("Q9");
        Book book1 = new Book("gone with wind", 233, "novel", 2.33);

        System.out.println("====================================================");
        ///Q10
        System.out.println("Q10");
        Box box1 = new Box(2.0, 3.0, 3.0);
        double box1Volume = box1.calculateBoxVolume();
        System.out.println(box1Volume);












    }


    ///Q1
    public static boolean strPalindrome(String s){
        for (int left = 0, right = s.length() - 1; left < right; left++, right--){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
        }
        return true;
    }
    ///Q2
    public static boolean allUnique(String str){
        int[] count = new int[128];
        for(int i = 0; i < str.length(); i++){
            int c = (int)str.charAt(i);
            if (count[c] > 0){
                return false;
            }else{
                count[c]++;
            }
        }
        return true;
    }
    ///Q3
    public static boolean containDuplicate(String str){
        if ("".equals(str)){
            return false;
        }
        int[] count = new int[128];
        for(int i = 0; i < str.length(); i++){
            int c = (int)str.charAt(i);
            if (count[c] > 0){
                return true;
            }else{
                count[c]++;
            }
        }
        return false;
    }
    ///Q4
    public static boolean isAnagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++){
            count[a.charAt(i) - 'a'] ++;
            count[b.charAt(i) - 'a'] --;
        }
        for (int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    ///Q5
    public static boolean isLeapYr(int y){
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    ///Q6
    public static double telephoneBill(int call) {

        if (call <= 100){
            call = 1;
        }else if (call <= 150){
            call = 2;
        }else if (call <= 200){
            call = 3;
        }else{
            call = 4;
        }


        return switch (call) {
            case 1 -> 200;
            case 2 -> (200 + 0.6 * (call - 100));
            case 3 -> (200 + 30 + 0.5 * (call - 150));
            case 4 -> (200 + 30 + 25 + 0.4 * (call - 200));
            default -> 0;
        };
    }

    ///Q7
    public static boolean isSubString(String ransomNote, String magazine){
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c: magazine.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c: ransomNote.toCharArray()) {
            if (!count.containsKey(c)){
                return false;
            } else {
                count.put(c, count.get(c)-1);
                if (count.get(c) == 0){
                    count.remove(c);
                }
            }
        }
        return true;
    }

    ///Q8
    public String getGrade(String grade){
        HashMap<String, String> grading = new HashMap<>();
        grading.put("A", "Excellent");
        grading.put("B", "Good");
        grading.put("C", "Average");
        grading.put("D", "Deficient");
        grading.put("F", "Failing");
        if (grading.containsKey(grade)) {
            return grading.get(grade);
        }
        return "wrong input";
    }

    ///Q9: answers in line8 and in the Book class file

    ///10: also in line10 - line 13 and in the Box class file

}

