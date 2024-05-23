package tests_for_TZ;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class func_test {

    @Test
    public void testMin() throws FileNotFoundException {
        int[] numbersTEST = {1, 4, 2, 3};
        File file = new File("src/main/resources/func_test1.txt");

        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
            assertEquals(1, common.TZ._min(numbers));

    }

    @Test
    public void testMax() throws FileNotFoundException {
        int[] numbersTEST = {1, 4, 2, 3};
        File file = new File("src/main/resources/func_test2.txt");

        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
            assertEquals(1000, common.TZ._max(numbers));

    }
    @Test
    public void testSum() throws FileNotFoundException {
        int[] numbersTEST = {1, 4, 2, 3};
        File file = new File("src/main/resources/func_test3.txt");

        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
            assertEquals(15, common.TZ._sum(numbers));

    }

    @Test
    public void testMult()  throws FileNotFoundException {
        int[] numbersTEST = {1, 4, 2, 3};
        File file = new File("src/main/resources/func_test4.txt");

        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int count = 0;
        for (String number : numbersString) {
            numbers[count++] = Integer.parseInt(number);
        }
        assertEquals(24, common.TZ._mult(numbersTEST));
    }
}