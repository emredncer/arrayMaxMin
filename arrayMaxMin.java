import java.util.Scanner;
import java.util.Arrays;

public class arrayMaxMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Bir sayı giriniz: ");
        int number = input.nextInt();

        System.out.println("Dizi: " + Arrays.toString(list));

        Arrays.sort(list);

        int maxNumber = 0;
        int minNumber = 0;
        for (int i : list) {
            if (number < i) {
                maxNumber = i;
                break;
            }
        }
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }
        for (int i : reverse) {
            if (i < number) {
                minNumber = i;
                break;
            }
        }

        System.out.println("Girilen sayı: " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxNumber);
    }
}
