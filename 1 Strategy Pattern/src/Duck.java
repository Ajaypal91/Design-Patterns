/**
 * 
 */

/**
 * @author ajay
 *
 */
public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public abstract void display();
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void swim() {
		System.out.println("All ducks can swim...");
	}
	
	//following methods are added to dynamically change the behaviour of the duck objects
	public void setFlyBehaviour(FlyBehaviour fb){
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
}
