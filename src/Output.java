import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Output {

    public static  void main(String args[]) throws IOException {

        String x= null;
        print(x);
        print(x);
   /* try{
       System.out.println( "main");

       return ;
   }catch (Exception e){
       System.out.println( " inside finally");
   }*/
        System.out.println( "main");

        String str1="hava";
        String str10=str1;
        str1="new";
        String str11="hava";
        System.out.println( " val" +str1==str10);
        readFromFile();

    }

    public static void print(String y) {
        // System.out.println( " val" +y.equals(null));
        new Thread() {
            public void run() { doStuff(); }

            private void doStuff() {
                System.out.println( " val");
            }
        }.start();
    }


    public static void readFromFile() throws IOException {
        String filename = "src//resources//test" ;
        File file = new File(filename);
        FileReader reeder = new FileReader(file);
        BufferedReader br = new BufferedReader(new FileReader(file)) ;
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            } Stream<String> stream  = Files.lines(Paths.get(filename));
        List<String> list = 	 stream
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        list.forEach(System.out::println);

    }
}
