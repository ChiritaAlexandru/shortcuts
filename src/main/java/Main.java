import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String [] args){
        String localDateTime= null;
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       // var d = LocalDateTime.parse(localDateTime.toString(),formatter);
        System.out.println(LocalDateTime.now().format(formatter));
    }
}
