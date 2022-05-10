package chapter18;

public class Method1 {

    public void m1(){
        RunnableInterface r = new RunnableInterface();
        int x = addNew(r);
        System.out.println(x);
    }

    private int addNew(RunnableInterface r) {
        var nr = getX(r);
        return nr;
    }

    private int getX(RunnableInterface r) {
        var x = r.sum(10);
        x = x+10;
        return x;
    }
}
