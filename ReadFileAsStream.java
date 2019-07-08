import java.nio.Files;
import java.nio.Paths;
import java.io.IOException;
import java.uitl.stream.Stream;

class ReadFileAsStream {
  public static void main(String[] args) {
    String fileName="./input.txt";
    try(Stream<String> stream = Files.lines(Paths.get(fileName))){
      stream.forEach(System.out::println);
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
