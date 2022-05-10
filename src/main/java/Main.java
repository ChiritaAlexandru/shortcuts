import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        String localDateTime= null;
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       // var d = LocalDateTime.parse(localDateTime.toString(),formatter);
        System.out.println(LocalDateTime.now().format(formatter));


        try{
            throw new RuntimeException("here");
        }catch(RuntimeException re){
            System.out.println( re.getLocalizedMessage());
        }
        List<String> kust = new ArrayList<>(4);
        kust.add("1");
        kust.add("2");

        kust.forEach( i -> {
            kust.add(new String("dd"));
        });

        System.out.println(kust.size());
    }
}
