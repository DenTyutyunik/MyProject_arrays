import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int [] intArray = new int [] {1, 2, 3};
        double [] doubleArray = {1.57, 7.654, 9.986};
        String[] charArray = {"A", "B", "C"};

        // Task 2
        System.out.println();
        System.out.println("Task 2");
        System.out.println("intArray:");
        for (int index = 0; index < intArray.length - 1; index++) {
            System.out.print(intArray[index] + ", ");
        }
        System.out.print(intArray[intArray.length - 1]);
        System.out.println();
        System.out.println("doubleArray:");
        for (int index = 0; index < doubleArray.length - 1; index++) {
            System.out.print(doubleArray[index] + ", ");
        }
        System.out.print(doubleArray[doubleArray.length - 1]);
        System.out.println();
        System.out.println("charArray:");
        for (int index = 0; index < charArray.length - 1; index++) {
            System.out.print(charArray[index] + ", ");
        }
        System.out.print(charArray[charArray.length - 1]);
        System.out.println();

        // Task 3
        System.out.println();
        System.out.println("Task 3");
        System.out.println("intArray:");
        for (int index = intArray.length - 1; index > 0; index--) {
            System.out.print(intArray[index] + ", ");
        }
        System.out.print(intArray[0]);
        System.out.println();
        System.out.println("doubleArray:");
        for (int index = doubleArray.length - 1; index > 0; index--) {
            System.out.print(doubleArray[index] + ", ");
        }
        System.out.print(doubleArray[0]);
        System.out.println();
        System.out.println("charArray:");
        for (int index = charArray.length - 1; index > 0; index--) {
            System.out.print(charArray[index] + ", ");
        }
        System.out.print(charArray[0]);
        System.out.println();

        // Task 4
        System.out.println();
        System.out.println("Task 4");
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 == 1) {
                intArray[index] += 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}
