import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("Person.txt")))) {
            Person person = new Person("Sam", 33, 178, true);
            oos.writeObject(person);

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("Person.txt")))) {
            Person person = (Person) ois.readObject();
            System.out.printf("Name %s \t Age %d \n", person.getName(), person.getAge());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

//        System.out.println();
//
//        File file = new File("test.txt");
//
//        String s = "kdfshgaank";
//        byte[] bytes = s.getBytes();
//        for (byte b : bytes) {
//            System.out.print(b + " ");
//        }
//
//        String text = "Hello world!";
//        try (FileOutputStream fos = new FileOutputStream("text.txt")) {
//            byte[] buffer = text.getBytes();
//
//            fos.write(buffer, 0, 12);
//            fos.write(49);
//            System.out.println("The file has been writted");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

//        int n = 2;
//        int[][] arr1 = new int[n][n];
//        int[][] arr2 = new int[n][n];
//        int[][] arr3 = new int[n][n];
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                arr1[i][j] = 1;
//            }
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                arr2[i][j] = 2;
//            }
//        }
//
//        for (int i = 0; i < arr3.length; i++) {
//            for (int j = 0; j < arr3.length; j++) {
//                arr3[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//
//        StringBuilder g = new StringBuilder();
//        for (int i = 0; i < arr3.length; i++) {
//            for (int j = 0; j < arr3.length; j++) {
//                g.append(arr3[i][j]).append(" ");
//            }
//            g.append("\n");
//        }
//        byte[] bytes1 = g.toString().getBytes();
//
//
//            try (FileOutputStream fos = new FileOutputStream("test2.txt")) {
//                fos.write(bytes1);
//                System.out.println("The file has been writted");
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//        }

//            try (FileInputStream fin = new FileInputStream("test2.txt"))
//            {
//                while((fin.available()>0)){
//                    System.out.println((char) fin.read());
//                }
//            }
//            catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }

//        File file = new File("test.txt");
//
//
//        try (FileWriter fw = new FileWriter(file)) {
//            String test = "jafkhka";
//            fw.write();
//        }
//
//        char[] test = new char[10];
//        try (FileReader fileReader = new FileReader(file)){
//            fileReader.read(test);
//        }
//        System.out.println(test);



//        File folder = new File("C:\\Users\\HP\\Desktop\\test");
//        File files1 = new File(folder, "test2.txt");
//        File NewFolder = new File (folder, "new_Folder");
//        NewFolder.createNewFile();
//        files1.createNewFile();
//
//        files1.delete();
//
//        File[] files = folder.listFiles();
//        for(File f: files) {
//               System.out.println(f.getAbsolutePath());
//               System.out.println(f.getCanonicalPath());
//        }
//
//        file.createNewFile();


    }
}
