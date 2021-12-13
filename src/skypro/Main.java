package skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();


        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " +sum / (float) arr.length + " рублей");



        int min = arr[0];
        int max = arr[0];

        for (int i : arr){
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная затрата за день составила: "+ min);
        System.out.println("Максимальная затраты за день составила "+ max);


        int sum1 = 0;

        for (int i : arr) {
            sum1 += i;
        }

        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей ");

    }




    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    }

