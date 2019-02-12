/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException {
    	Animal animal2 = new Animal("blue", "George", 198.5, 69.5);
    	
    	Assert.assertEquals("blue", animal2.getColor());
    	Assert.assertEquals("George", animal2.getName());
    	Assert.assertEquals(198.5, animal2.getWeight(), 0.01);
    	Assert.assertEquals(69.5, animal2.getHeight(), 0.01);
    }
    
    public void toStringTest() throws AssertException{
    	Animal animal3 = new Animal();
    	Assert.assertEquals("noname, a unknown-colored animal. 0.0 pounds, 0.0 inches\n", animal3.toString());
    	
    	Animal animal4 = new Animal("blue", "Jack", 10.2, 5.3);
    	Assert.assertEquals("Jack, a blue-colored animal. 10.2 pounds, 5.3 inches\n", animal4.toString());
    	
    }
    
}

