package loopingstatements.patternlooping;

public class butterfly {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print("   ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print(" * ");
            }

            System.out.println();

        }
        for (int i = rows-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print("   ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}
