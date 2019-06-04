package how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {
    public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        try {
            new FileInputStream(f);
            System.out.println("成功打开文件");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("文件不存在，请检查");
        }
    }
}

//public class TestException {
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            sb.append('a');
//        }
//    }
//}