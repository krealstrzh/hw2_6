import java.util.*;

public class Main {

    public static List<Integer> printOdds(List<Integer> nums) {
        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                odds.add(nums.get(i));
            }
        }
        return odds;
    }

    public static void printEvensWithoutRepeat(List<Integer> nums) {
        Map<Integer, Integer> evens = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                evens.putIfAbsent(nums.get(i), nums.get(i));
            }
        }
        System.out.println(evens.values());
    }

    public static void printUniqueWords (List <String> text) {
        Set<String> doubles = new HashSet<>(text);
        System.out.println(doubles);
    }

    public static void countDoubleWords (List <String> text) {
        Set<String> doubles = new HashSet<>(text);
        System.out.println(text.size() - doubles.size());
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 6, 8, 10, 6, 7));
        List <String> text = new ArrayList<>(List.of("заходит тестировщик в бар", "вбегает тестировщик в бар", "заходит тестировщик в бар", "bcd", "e"));
//        Задание 1
        System.out.println(printOdds(nums));
//        Задание 2
        printEvensWithoutRepeat(nums);
//        Задание 3
        printUniqueWords(text);
//        Задание 4
        countDoubleWords(text);
    }
}