package java_practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * created by ANEK on Friday 2/25/2022 at 7:02 PM
 */

public class PropertyLoader {
    public static void main(String[] args) throws IOException, URISyntaxException {

        // 1. Reading a small file
        Path path = Paths.get("./src/main/resources/spark.conf");
        List<String> lines = Files.readAllLines(path);
        System.out.println("lines :: param => "+lines.get(0).split("=")[0]);
        System.out.println("lines :: value => "+lines.get(0).split("=")[1]);
        System.out.println("lines :: "+lines.size());

        System.out.println("**********  lines stream *************");
        Map<String,String> map = new HashMap<>();
        lines.stream().map(
                line -> {
                              map.put(line.split("=")[0],line.split("=")[1]);
                              return map;
                        }

                ).count();
        System.out.println("map :: "+map);

        // Reading a large file
        Path path1 = Paths.get("./src/main/resources/spark.conf");
        BufferedReader bufferedReader = Files.newBufferedReader(path1);
        String s = bufferedReader.readLine();
        System.out.println("readLine() :: "+s);

        Path path2 = Paths.get(PropertyLoader.class.getClassLoader().getResource("./spark.conf").toURI());
        Stream<String> lines2 = Files.lines(path2);
        String data = lines2.collect(Collectors.joining("->"));
        System.out.println("data ::  "+ data);


        /*
        while(bufferedReader.readLine() != null){
            String s = bufferedReader.readLine();
            System.out.println("readLine() :: "+s);
        }
        */
     /*   BufferedReader bufferedReader = new BufferedReader(path);
        Properties properties = new Properties();
        properties.load();

        System.out.println("Path :: "+path.getFileName());
        System.out.println("Path :: "+path.getParent());
                          */

    }

}
