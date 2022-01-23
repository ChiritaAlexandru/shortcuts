import java.util.stream.Stream;

public class Dog {
    private String nume;


    public void addNume(String nume) {
    /*    System.out.println();
        System.out.println(nume);

        //System.out.println(nume); */
        Stream.of("1", "2", "3")
                .mapToInt(x -> Integer.parseInt(x))
                .forEach(c -> System.out.println(c));
        System.out.println("test");
    }

    public void showName(String nume) {
        System.out.println(nume);
    }

    public void newMethod1(){
        System.out.println("method1");
        System.out.println("here ");
    }
}
