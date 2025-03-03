import java.util.*;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;  // Auto-unboxing
        }

        System.out.println("Sum of numbers: " + sum);

        // Parsing strings into wrapper classes
        String strNum = "100";
        Integer parsedNum = Integer.parseInt(strNum); // Auto-boxing
        System.out.println("Parsed Integer: " + parsedNum);
    }
}
