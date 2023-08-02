import java.util.Arrays;
       import java.util.Arrays;

        public class Main {
            public static void main(String[] args) {
                int[] numbers = new int[3]; // Задача 1
                numbers[0] = 1;
                numbers[1] = 2;
                numbers[2] = 3;
                for (int i =0; i<numbers.length; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();

                float[] arrays1 = {1.57f, 7.654f, 9.986f};
                for (int i = 0; i < arrays1.length; i++) {
                    System.out.println(arrays1[i]);
                }
                int[] year = new int[4];
                year[0] = 10;
                year[1] = 20;
                year[2] = 30;
                year[3] = 40;
                int winter = year[0];
                int Spring = year[1];
                int summer = year[2];
                int autumn = year[3];
                System.out.println(Spring);

                int[] numbers1 = new int[3]; // Задача 2
                numbers1[0] = 1;
                numbers1[1] = 2;
                numbers1[2] = 3;
                System.out.println(Arrays.toString(numbers1));

                float[] arrays2 = {1.57f, 7.654f, 9.986f};
                System.out.println(Arrays.toString(arrays2));

                int[] year1 = new int[4];
                year1[0] = 10;
                year1[1] = 20;
                year1[2] = 30;
                year1[3] = 40;
                int winter1 = year[0];
                int Spring1 = year[1];
                int summer1 = year[2];
                int autumn1 = year[3];
                System.out.println(Arrays.toString(year1));

                int[] numbers2 = {1,2,3};// Задача 3
                for (int index =2; index<=numbers2.length-1; index--) {
                    if (index ==0) {
                        System.out.println(numbers2[index]);
                        break;
                    }
                    System.out.print(numbers2[index] + " ,");
                }
                float[] arrays3 = {1.57f, 7.654f, 9.986f};
                for (int i = 2; i<=arrays3.length-1; i--) {
                    if (i==0) {
                        System.out.println(arrays3[i]);
                        break;
                    }
                    System.out.print(arrays3 [i] + " ,");
                }
                int[] year2 = new int[4];
                year2[0] = 10;
                year2[1] = 20;
                year2[2] = 30;
                year2[3] = 40;
                int winter2 = year[0];
                int Spring2 = year[1];
                int summer2 = year[2];
                int autumn2 = year[3];
                for (int stone = 3; stone<=year2.length-1; stone--) {
                    if (stone == 0) {
                        System.out.println(year2[stone]);
                        break;
                    }
                    System.out.print(year2[stone] + " ,");
                }

                int[] numbers3 = new int[3]; // Задача 4
                numbers3[0] = 1;
                numbers3[1] = 2;
                numbers3[2] = 3;
                for (int in = 0; in < numbers3.length; in++) {
                    if (numbers3[in] % 2 != 0)
                        numbers3[in] += 1;
                }
                System.out.println(Arrays.toString(numbers3));
            }
        }