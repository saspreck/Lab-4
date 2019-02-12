/**
 * Testing class for Product object
 *
 * @author Skyler Sprecker
 * @version 2019-02-11
 */
public class ZooTest {
	
	public void getTotalHeightTest() throws AssertException{
		Zoo zoo1 = new Zoo(5);
		Animal animal1 = new Animal("blue", "George", 198.5, 69.5);
		Animal animal2 = new Animal("blue", "Jack", 10.2, 5.3);
		
		zoo1.addAnimal(animal1);
		zoo1.addAnimal(animal2);
		
		Assert.assertEquals(74.8, zoo1.getTotalHeight());
		
	}
	
	public void getCapacityTest() throws AssertException {
		Zoo zoo2 = new Zoo(15);
		
		Assert.assertEquals(15, zoo2.getCapacity());
		
	}
	
	public void toStringTest() throws AssertException {
		Zoo zoo3 = new Zoo(5);
		Animal animal1 = new Animal("blue", "George", 198.5, 69.5);
		Animal animal2 = new Animal("blue", "Jack", 10.2, 5.3);
		
		zoo3.addAnimal(animal1);
		zoo3.addAnimal(animal2);
		
		Assert.assertEquals("These animals live in the zoo: \nGeorge, a blue-colored animal. 198.5 pounds, 69.5 inches\n"
				+ "Jack, a blue-colored animal. 10.2 pounds, 5.3 inches\n", zoo3.toString());;
	}
	
}