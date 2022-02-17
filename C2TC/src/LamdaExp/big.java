package LamdaExp;


@FunctionalInterface
public interface big {
    public void samp();
}

@FunctionalInterface
interface small {
    public void samp1(int a,int b);
}

interface squareIt {
    public int sqare(int n);
}

interface cheackIt {
    public Boolean check(int n);
}