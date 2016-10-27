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

/**
 *
 * @author Surabhi9
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("idxadjective_txt"), "UTF-8"));
        Writer p = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("adjective.csv"), "UTF-8"));
        String line;
        String[] s;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.setLength(0);
            System.out.println(line);
            s = line.split(" ");
            sb.append(s[0]).append(",");
            for (int i = 5; i < s.length; i++) {
                sb.append(s[i]).append(",");
            }
            p.write(sb.toString() + "\n");
        }
        p.close();
    }
}
