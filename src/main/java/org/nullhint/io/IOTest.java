package org.nullhint.io;

import java.io.*;

/**
 * Java IO test class.
 *
 * @author lixibo
 * @date 2018/1/11
 */
public class IOTest {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = IOTest.class.getResourceAsStream("iotest.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
