package com.dh.dp.class15_适配器;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\conf\\mqttConf.properties");
        // InputStreamReader是BufferedReader与FileInputStream的适配器
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
