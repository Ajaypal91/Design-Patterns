
public class MallardDuck extends Duck{
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm real Mallard Duck..");
	}

}
