package Ex_24_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;

public class Lab218_Interview {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
