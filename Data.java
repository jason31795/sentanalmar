/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marathidictionary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;

/**
 *
 * @author Surabhi9
 */
public class Data {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data_txt"), "UTF-8"));
        Writer p = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("data.csv"), "UTF-8"));
        String line;
        String[] s, s0, s1;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.setLength(0);
            s = line.split("\\|");
            s0 = s[0].split(" ");                                             
            s1 = s[1].split(":");
            System.out.println(s[0]);
            try {
                sb.append(s0[0]).append(",").append(s0[3]).append(",").append(s1[0]).append(",");
            } catch (ArrayIndexOutOfBoundsException e) {
            }
            p.write(sb.toString() + "\n");
        }
        p.close();
    }
}
