import java.util.Arrays;

public class FindAnagram {

        public static boolean isAnagram1(String word, String anagram) {
            if (word.length() != anagram.length()) {
                return false;
            }
            char[] chars = word.toCharArray();
            for (char c : chars) {
                int index = anagram.indexOf(c);
                if (index != -1) {
                    anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
                } else {
                    return false;
                }
            }
            return anagram.isEmpty();
        }


        public static boolean isAnagram2(String word, String anagram) {
            char[] charFromWord = word.toCharArray();
            char[] charFromAnagram = anagram.toCharArray();
            Arrays.sort(charFromWord);
            Arrays.sort(charFromAnagram);
            return Arrays.equals(charFromWord, charFromAnagram);
        }

        public static boolean isAnagram3(String first, String second) {
            char[] characters = first.toCharArray();
            StringBuilder sbSecond = new StringBuilder(second);
            for (char ch : characters) {
                int index = sbSecond.indexOf("" + ch);
                if (index != -1) {
                    sbSecond.deleteCharAt(index);
                } else {
                    return false;
                }
            }
            return sbSecond.length() == 0 ? true : false;
        }


    public static void main(String[] args) {
        System.out.println("First Way : \n"+ isAnagram1("word", "wrdo"));
        System.out.println(isAnagram1("pure", "in") + "\n");

        System.out.println("Second Way : \n"+isAnagram2("word", "wrdo"));
        System.out.println(isAnagram2("pure", "in") + "\n");

        System.out.println("Third Way : \n"+isAnagram3("word", "wrdo"));
        System.out.println(isAnagram3("pure", "in"));
    }

    }
