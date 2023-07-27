package exceptions.seminar2.homework;

public class Task3 {
    /**
     * @apiNote Все exceptions можно заменить на if, FileFoundException не обязателен
     */
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("нельзя делить на ноль");
            }
            printSum(23, 234);
            int[] abc = {1, 2};
            Integer idx = 3;
            if ((idx != null) && (idx >= 0 && idx < abc.length)) abc[idx] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
