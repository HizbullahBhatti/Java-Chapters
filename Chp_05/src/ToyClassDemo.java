
public class ToyClassDemo {

	public static void main(String[] arg) {
		 ToyClass anObject = new ToyClass("Mr. Cellophane", 0);
	        System.out.println(anObject);
	        System.out.println("Now we call changer with anObject as argument.");
	        ToyClass.changer(anObject);;
	        System.out.println(anObject);

	}

}
