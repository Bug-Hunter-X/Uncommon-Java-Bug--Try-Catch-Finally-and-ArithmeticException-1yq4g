public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int z = x / y; //Potential ArithmeticException
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues");
    }
}