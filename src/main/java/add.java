import chapter18.RunnableInterface;

public class add {
    public static void m1() {
        RunnableInterface r = new RunnableInterface();

        var x = r.sum(1033);
        x = x + 12;
        System.out.println(x);
    }
}
