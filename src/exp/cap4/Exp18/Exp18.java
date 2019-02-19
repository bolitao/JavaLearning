package exp.cap4.Exp18;

import java.util.Arrays;
import java.util.Random;

public class Exp18 {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        System.out.println("随机生成的数组如下：");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
//                array[i][j] = (int) (100 * Math.random());
                array[i][j] = new Random().nextInt(100);
                System.out.print("array[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
            System.out.println();
        }
        Arrays.sort(array[0]);
        Arrays.sort(array[1]);
        for (int i = 0; i < array.length; i++) {
            System.out.println("第 " + (i + 1) + " 行排序后的大小为：");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("array[" + i + "][" + j + "] = " + array[i][j] + "    ");
            }
            System.out.println();
        }
    }
}