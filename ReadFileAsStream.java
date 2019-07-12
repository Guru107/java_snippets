import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;


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
