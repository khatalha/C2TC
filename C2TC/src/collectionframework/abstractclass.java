package collectionframework;

abstract class Bank1{

    abstract float gatRateOfIntrest();

    void display(){

        System.out.println("this the abstract class");
    }
}

class HDFC1 extends Bank1{

    @Override
    float gatRateOfIntrest() {

        return 0;
    }
}
class ICICI1 extends Bank1{
    float gatRateOfIntrest(){
        return 6.0f;
    }
}
class kotak1 extends Bank1{
    float gatRateOfIntrest(){
        return 7.0f;
    }
}

public class abstractclass {

	public static void main(String[] args) {
		System.out.println("Abstract class");
		

	}

}
