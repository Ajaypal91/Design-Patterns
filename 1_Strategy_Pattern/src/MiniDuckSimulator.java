/**
 * 
 */

/**
 * @author ajay
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
		
	}	

}
