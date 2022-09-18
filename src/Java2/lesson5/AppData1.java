package Java2.lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppData1 {

    public static final String SEPERATOR = ";";

    private String[] header;
    private Integer[][] data;

    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void readFromFile(String file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ArrayList<Integer[]> rowsList = new ArrayList<>();
            header = (reader.readLine().split(SEPERATOR));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] stringArr = line.split(SEPERATOR);
                Integer[] integersArr = new Integer[stringArr.length];
                for (int i = 0; i < stringArr.length; i++) {
                    integersArr[i] = Integer.parseInt(stringArr[i]);
                }
                rowsList.add(integersArr);
            }
            data = rowsList.toArray(new Integer[][]{});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAppData(String resultFileName) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFileName), StandardCharsets.UTF_8))) {

            StringBuffer oneLine = new StringBuffer();
            for (int i = 0; i < header.length; i++) {
                oneLine.append(header[i]);
                oneLine.append(SEPERATOR);
            }
            bw.write(oneLine.toString());
            bw.newLine();

            for (int i = 0; i < data.length; i++) {
                Integer[] rowData = data[i];
                oneLine.delete(0, oneLine.length());
                for (int j = 0; j < rowData.length; j++) {
                    oneLine.append(rowData[j]);
                    oneLine.append(SEPERATOR);
                }
                bw.write(oneLine.toString());
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
