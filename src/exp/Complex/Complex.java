package exp.Complex;

/**
 * Complex class
 *
 * @author Boli Tao
 * @date 2018/4/26
 */
public class Complex implements Comparable<Complex> {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(String str) {
        if (str.indexOf("i") == -1) {
            this.real = Double.parseDouble(str);
            this.imag = 0;
        } else {
            String[] parts = str.split("\\+");
            this.real = Double.parseDouble(parts[0]);
            this.imag = Double.parseDouble(parts[1].substring(0, parts[1].indexOf("i")));
//            this.imag = Double.parseDouble(parts[1].substring(0, parts[1].length()-1));
        }
    }

    public static String plus(Complex a, Complex b) {
        Complex tmp = new Complex(0, 0);
        tmp.real = a.real + b.real;
        tmp.imag = a.imag + b.imag;
        return tmp.toString();
    }

    public static String pub(Complex a, Complex b) {
        Complex tmp = new Complex(0, 0);
        tmp.real = a.real - b.real;
        tmp.imag = a.imag - b.imag;
        return tmp.toString();
    }

    public double mold() {
        return Math.sqrt(real * real + imag * imag);
    }

    @Override
    public String toString() {
        if (this.real == 0) {
            return this.imag + "i";
        } else if (this.imag < 0) {
            return this.real + "" + this.imag + "i";
        } else if (this.imag == 0) {
            return this.real + "";
        } else {
            return this.real + "+" + this.imag + "i";
        }
    }

    public boolean equals(Complex a) {
        return ((a == this) || (a.real == this.real && a.imag == this.imag));
    }

    @Override
    public int compareTo(Complex complex) {
        double tmp = this.mold() - complex.mold();
        if (tmp > 0) {
            return 1;
        } else if (tmp == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static double compareTo(Complex a, Complex b) {
        return (a.mold() - b.mold());
    }
}

//TODO: Arrays sort on textbook