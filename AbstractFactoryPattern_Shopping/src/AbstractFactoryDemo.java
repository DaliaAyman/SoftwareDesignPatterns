
public class AbstractFactoryDemo {
	public static void main(String[] args){
		ClothesFactory sDalydress = new DalydressFactory();
		sDalydress.createCottonDress();
		sDalydress.createJacket();

		System.out.println();
		
		ClothesFactory sConcrete = new ConcreteFactory();
		sConcrete.createCottonDress();
		sConcrete.createJacket();
	}
}
