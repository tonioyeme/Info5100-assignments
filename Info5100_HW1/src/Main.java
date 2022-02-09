import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ///Q9
        Book book1 = new Book("gone with wind", 233, "novel", 2.33);

        ///Q10
        Box box1 = new Box(2.0, 3.0, 3.0);
        double box1Volume = box1.calculateBoxVolume;
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
    public static boolean allUnique(int[] n){
        Arrays.sort(n);
        for (int i = 0; i < n.length-1; i++){
            if (n[i] == n[i+1])
                return false;
        }
        return true;
    }
    ///Q3
    public static boolean containDuplicate(int[] n){
        Arrays.sort(n);
        for (int i = 0; i < n.length-1; i++){
            if (n[i] == n[i+1])
                return true;
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
    public String getGrade(String grade, String meaningOfGrade){
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
    public double calculateBoxVolume(double width, double height, double depth){
        return (width * height * depth);
    }

}

