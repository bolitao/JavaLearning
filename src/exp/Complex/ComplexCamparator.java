package exp.Complex;

import java.util.Comparator;

/**
 * ComplexComparator class
 *
 * @author Boli Tao
 * @date 2018/4/26
 */
public class ComplexCamparator implements Comparator<Complex> {
    @Override
    public int compare(Complex a, Complex b) {
        return a.compareTo(b);
        //调用重写的 Compare 函数
    }
}