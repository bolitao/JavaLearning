////package gov.nasa.worldwind.all2;
//
//import java.io.*;
//import java.net.*;
//import java.util.Enumeration;
//import java.util.zip.*;
//
////import static jogamp.opengl.util.av.JavaSoundAudioSink.BUFFER_SIZE;
//
///**
// *
// * @author 吴俭
// *
// */
//public class DownloadUtil
//{
//    /**
//     * 从网络Url中下载文件
//     * @param urlStr
//     * @param fileName
//     * @param savePath
//     * @throws IOException
//     */
//    public static void  downLoadFromUrl(String urlStr,String fileName,String savePath) throws IOException {
//        URL url = new URL(urlStr);
//        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//        //设置超时间为3秒
//        conn.setConnectTimeout(3*1000);
//        //防止屏蔽程序抓取而返回403错误
//        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
//
//        //得到输入流
//        InputStream inputStream = conn.getInputStream();
//        //获取自己数组
//        byte[] getData = readInputStream(inputStream);
//
//        //文件保存位置
//        File saveDir = new File(savePath);
//        if(!saveDir.exists()){
//            saveDir.mkdir();
//        }
//        File file = new File(saveDir+File.separator+fileName);
//        FileOutputStream fos = new FileOutputStream(file);
//        fos.write(getData);
//        if(fos!=null){
//            fos.close();
//        }
//        if(inputStream!=null){
//            inputStream.close();
//        }
//
//
//        System.out.println("info:"+url+" download success");
//
//    }
//
//
//
//    /**
//     * 从输入流中获取字节数组
//     * @param inputStream
//     * @return
//     * @throws IOException
//     */
//    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
//        byte[] buffer = new byte[1024];
//        int len = 0;
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        while((len = inputStream.read(buffer)) != -1) {
//            bos.write(buffer, 0, len);
//        }
//        bos.close();
//        return bos.toByteArray();
//    }
//    /**
//     * zip解压
//     * @param srcFile        zip源文件
//     * @param destDirPath     解压后的目标文件夹
//     * @throws RuntimeException 解压失败会抛出运行时异常
//     */
//    public static void unZip(File srcFile, String destDirPath) throws RuntimeException {
//        long start = System.currentTimeMillis();
//        // 判断源文件是否存在
//        if (!srcFile.exists()) {
//            throw new RuntimeException(srcFile.getPath() + "所指文件不存在");
//        }
//        // 开始解压
//        ZipFile zipFile = null;
//        try {
//            zipFile = new ZipFile(srcFile);
//            Enumeration<?> entries = zipFile.entries();
//            while (entries.hasMoreElements()) {
//                ZipEntry entry = (ZipEntry) entries.nextElement();
//                System.out.println("解压" + entry.getName());
//                // 如果是文件夹，就创建个文件夹
//                if (entry.isDirectory()) {
//                    String dirPath = destDirPath + "/" + entry.getName();
//                    File dir = new File(dirPath);
//                    dir.mkdirs();
//                } else {
//                    // 如果是文件，就先创建一个文件，然后用io流把内容copy过去
//                    File targetFile = new File(destDirPath + "/" + entry.getName());
//                    // 保证这个文件的父文件夹必须要存在
//                    if(!targetFile.getParentFile().exists()){
//                        targetFile.getParentFile().mkdirs();
//                    }
//                    targetFile.createNewFile();
//                    // 将压缩文件内容写入到这个文件中
//                    InputStream is = zipFile.getInputStream(entry);
//                    FileOutputStream fos = new FileOutputStream(targetFile);
//                    int len;
//                    byte[] buf = new byte[BUFFER_SIZE];
//                    while ((len = is.read(buf)) != -1) {
//                        fos.write(buf, 0, len);
//                    }
//                    // 关流顺序，先打开的后关闭
//                    fos.close();
//                    is.close();
//                }
//            }
//            long end = System.currentTimeMillis();
//            System.out.println("解压完成，耗时：" + (end - start) +" ms");
//        } catch (Exception e) {
//            throw new RuntimeException("unzip error from ZipUtils", e);
//        } finally {
//            if(zipFile != null){
//                try {
//                    zipFile.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
