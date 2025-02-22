public class FizzBuzz {
    public static String fizzbuzz(int n) {
        StringBuilder result = new StringBuilder();
        if (n % 3 == 0) result.append("Fizz");
        if (n % 5 == 0) result.append("Buzz");
        return result.isEmpty() ? String.valueOf(n) : result.toString();
    }
}