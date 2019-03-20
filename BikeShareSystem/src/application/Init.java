package application;

import java.io.*;

/**
 * Init
 * 
 * @author Xin Yifei
 * @version 0.8
 */
public class Init {

    public static void main(String[] args) {
        String filePath = System.getProperty("user.home") + "\\Documents\\BikeShareSystemFile\\";
        String[] fileNames = Main.fileNames;
        for (String fileName : fileNames) {
            File fp = new File(filePath);
            File f = new File(filePath + fileName);
            try {
                if (!fp.exists()) {
                    fp.mkdir();
                }
                if (!f.exists()) {
                    f.createNewFile();
                    if (fileName.equals("bikes.txt")) {
                        BufferedWriter writter = new BufferedWriter(new FileWriter(filePath + fileName));
                        String str = "A 500\nB 500\nC 500";
                        writter.write(str.toString());
                        writter.close();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}