package Annotation;

import java.lang.annotation.Annotation;

@SmartPhone(os="Android",version=6)
@SmartTv(osi = "sumsung",versions = 9)
class Nokia_Series{
    String model;
    int screensize;

    public Nokia_Series(String model, int screensize) {
        this.model = model;
        this.screensize = screensize;
    }
}

public class AnnoatationDemo {

	public static void main(String[] args) {
		Nokia_Series obj = new Nokia_Series("fire",4);
        System.out.println(obj.model);
        System.out.println(obj.screensize);

        Class c = obj.getClass();
        Annotation an =c.getAnnotation(SmartPhone.class);
        SmartPhone s= (SmartPhone) an;
        System.out.println(s.os());
        System.out.println(s.version());

        Class d = obj.getClass();
        Annotation af =d.getAnnotation(SmartTv.class);
        SmartTv st = (SmartTv) af;
        System.out.println(st.osi());
        System.out.println(st.versions());
	}

}
