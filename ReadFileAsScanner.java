import java.io.File;
import java.util.Scanner;

class ReadFileAsScanner {
  public static void main(String[] args){
    try{
      String fileName = "./input.txt";
      Scanner sc = new Scanner(new File(fileName));
      while(sc.hasNextInt()){
        System.out.println(sc.nextInt());
      }
      sc.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
