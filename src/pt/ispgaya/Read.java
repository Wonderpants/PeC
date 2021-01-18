package pt.ispgaya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

    private Read() {
    }

    public static int Int() {
        while (true) {
            try {
                return Integer.parseInt(String().trim());
            } catch (Exception e) {
                System.out.println("Not an Integer");
            }
        }
    }

    public static String String() {
        String s = "";
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in), 1);
            s = in.readLine();
        } catch (IOException e) {
            System.out.println(" Error ");
        }
        return s;
    }

    public static double Double() {
        while (true) {
            try {
                return Double.parseDouble(String().trim());
            } catch (Exception e) {
                System.out.println("Not a Double");
            }
        }
    }
}
