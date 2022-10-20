package io;

import java.io.*;
import java.util.Arrays;

public class IOMain {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/home/xszhang/Documents/tt.txt")) {
            int read = 0;
            while ((read = fr.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (InputStream is = new FileInputStream("/home/xszhang/Documents/tt.txt");
//             BufferedInputStream bis = new BufferedInputStream(is)) {
//
//            System.out.println(new String(bis.readAllBytes()));
////            int content;
////            while ((content = inputStream.read()) != -1) {
////                System.out.print((char) content);
////            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("1111");
    }
}
