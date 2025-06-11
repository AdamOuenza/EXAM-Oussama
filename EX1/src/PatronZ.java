public class PatronZ {
    public static void printZPattern() {
        int size = 10;

        // First line
        for (int i = 0; i < size; i++) {
            System.out.print(i);
        }
        System.out.println();

        // Diagonal from top-right to bottom-left
        for (int i = size - 2; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }

        // Last line
        for (int i = 0; i < size; i++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
