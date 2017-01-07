class Juice {
	enum Juice_size{SHORT, TALL, GRANDE}
	Juice_size size;
}

public class Juice_size {

	public static void main(String args[]) {
	Juice juice = new Juice();
	juice.size = Juice.Juice_size.GRANDE ;
	System.out.println("You want " + juice.size);
}
}	
