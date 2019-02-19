package study.yanghui;

/**
 * @author Boli Tao
 * @version 0.1.0
 */
public class yanghui {
    public static void main(String[] args) {
        final int yanghuiRow = 10;
        int mat[][];
        mat = new int[yanghuiRow][];
        int row, column;
        for (row = 0; row < yanghuiRow; row++) {
            mat[row] = new int[row + 1];
            mat[row][0] = 1;
            mat[row][row] = 1;
            for (column = 1; column < row; column++) {
                //这里要考虑清 column < row 还是 column <= row
                mat[row][column] = mat[row - 1][column - 1] + mat[row - 1][column];
            }
            /*
            错误示范 = =
            for (column = 0; column <= row; column++) {
                mat[row + 1] = new int[column + 1];
                mat[row][0] = 1;
                mat[row][column] = 1;
            }
            */
        }
        for (row = 0; row < yanghuiRow; row++) {
            for (column = 1; column < (yanghuiRow - row); column++) {
                //此循环用来输出前面的空格
                System.out.print(" ");
            }
            for (column = 0; column <= row; column++) {
                //此循环输出二维数组
                System.out.print(" " + mat[row][column]);
            }
            System.out.println();   //换行
        }
    }
}