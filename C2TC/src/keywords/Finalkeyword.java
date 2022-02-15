package keywords;

class car{
    final  int max_speed =120;


    void controlSpeed(){
//        max_speed =180; //compile time error
        System.out.println(max_speed);

    }
}
public class Finalkeyword {

	public static void main(String[] args) {
		car c1 =new car();
        c1.controlSpeed();
        
      //final variable cannot be override
      //final method cannot be override
      //final class cannot be override


	}

}
