package com.common.utility;

import java.io.FileWriter;
import java.io.IOException;

public class CreateLargeFile {

    public static void writeFile(String str) {
        // attach a file to FileWriter
        try (FileWriter fw = new FileWriter("F:\\Programming\\Code\\Java\\dataFile\\source\\output.txt", true)) {
            // read character wise from string and write into FileWriter
            for (int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));
            System.out.println("Writing successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createLargeFile(int rowStartCount, int rowEndCount, int columnsCount) {

        String defaultData = "data";
        String delimiter = "|";
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = rowStartCount; i <= rowEndCount; i++) {
                for (int j = 1; j <= columnsCount; j++) {
                    sb.append(defaultData).append("_").append(i).append("_").append(j).append(delimiter);
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.out.println("sb.length():==>" + sb.length());
            writeFile(sb.toString());
        } catch (Exception e) {
            System.out.println("Exception :=>" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void batchProcessing(int totalRowCount,int batchSize,int columnsCount)
    {
        int batchCount = (totalRowCount / batchSize) + 1;
        int startIndex, endIndex = 0;
        for (int currBatchCnt = 1; currBatchCnt < batchCount; currBatchCnt++) {

            startIndex = (batchSize * (currBatchCnt - 1) + 1);
            endIndex = batchSize * currBatchCnt;
            System.out.println("startIndex = " + startIndex);
            System.out.println("endIndex   = " + endIndex);
            System.out.println("------------------------------------");
            createLargeFile(startIndex,endIndex,columnsCount);
        }
        if((totalRowCount % batchSize!=0)) {
            startIndex = endIndex + 1;
            endIndex = totalRowCount;
            System.out.println("startIndex = " + startIndex);
            System.out.println("endIndex   = " + endIndex);
            System.out.println("------------------------------------");
            createLargeFile(startIndex,endIndex,columnsCount);
        }

    }

    public static void main(String[] args) {

        int totalRowCount = 1000000000;
        int batchSize = 2000;
        int columnsCount = 20;
        batchProcessing(totalRowCount,batchSize,columnsCount);
        System.out.println("File Created Successfully!!");
    }
}