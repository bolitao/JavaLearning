package exp.cap9.exp48;

class AException extends Exception {
}

class BException extends Exception {
}

class ThrowException {
    public static void main(String[] args) {
        int x = 1;
        try {
            if (x > 0) {
                throw new AException();
            } else {
                throw new BException();
            }
        } catch (AException a) {
            System.out.println("执行 A 异常处理程序");
        } catch (BException b) {
            System.out.println("执行 B 异常处理程序");
        }
    }
}
