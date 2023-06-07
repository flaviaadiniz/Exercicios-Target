import java.util.Scanner;

public class Exercicio6 {
        public static int maxEnergy(int[] ener) {
            int  answer = 0;

            int biggestNum = 0;
            int secondBiggestNum = 0;

            for (int i = 0; i < ener.length; i++) {
                if (ener[i] > biggestNum) {
                    biggestNum = ener[i];
                }
            }


            for (int i = 0; i < ener.length; i++) {
                if (ener[i] > secondBiggestNum && ener[i] < biggestNum) {
                    secondBiggestNum = ener[i];
                }
            }

            answer = biggestNum + secondBiggestNum;

            return answer;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //input for ener
            int ener_size = in.nextInt();
            int ener[] = new int[ener_size];
            for(int idx = 0; idx < ener_size; idx++) {
                ener[idx] = in.nextInt();
            }

            int result = maxEnergy(ener);
            System.out.print(result);

        }

}
