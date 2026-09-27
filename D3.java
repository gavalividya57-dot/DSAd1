public class Main {
    public static void main(String[] args) {

        int[] a = {10, 5, 3, 4, 3, 5, 6};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    System.out.println("First repeating = " + a[i]);
                    return;
                }
            }
        }
    }
}