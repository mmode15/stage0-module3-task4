package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {

        System.out.println(f(2,3));
    }
    static int f(int a, int b){
        return (9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
    }

}
