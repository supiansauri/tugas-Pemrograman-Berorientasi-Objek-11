import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
  public static void main(String[] args) {
    String csvfile = "/Users/pardi/Developer/University/pemrograman-berbasis-object/11/FileHandling/src/students.csv";
    String line;
    String csvSplitBy = ",";
    int indeks = 0;
    System.out.println("NIM, NAMA, UMUR, PRODI");
    try (BufferedReader br = new BufferedReader (new FileReader(csvfile))){
      while ((line = br.readLine()) != null) {
        indeks++;
        if(indeks>1){
          String[] student = line.split(csvSplitBy);
          System.out.println(student[0] + ", " + student[1] + ", " + student[2] + ", " + student[3]);
        }
      }
      System.out.println("Jumlah baris pada file: " + indeks);
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}