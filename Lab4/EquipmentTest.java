/**
 * Testing class for Product object
 *
 * @author Skyler Sprecker
 * @version 2019-02-11
 */

public class EquipmentTest{
	/**
     * Test the equipment constructor and the getters
     */
    public void ConstructorTest() throws AssertException
    {
        Equipment sword = new Equipment("Sword/1, 5.2, 250.4, a sword for fighting");


        Assert.assertEquals("Sword", sword.getName());
        Assert.assertEquals(1, sword.getCount());
        Assert.assertEquals(5.2, sword.getTotalWeight(), 0.01);
        Assert.assertEquals(250.4, sword.getTotalPrice(), 0.01);
        Assert.assertEquals(" a sword for fighting", sword.getDescription());
        
    }
    
    public void equalsTest() throws AssertException{
    	Equipment sword = new Equipment("Sword/1, 5.2, 250.4, a sword for fighting");
    	Equipment knife = new Equipment("Knife/1, 1.2, 26.3, a knife for fighting");
    	Equipment knife2 = new Equipment("Knife/1, 1.2, 26.3, a knife for fighting");
    	Animal animal1 = new Animal("blue", "George", 198.5, 69.5);
    	
    	
    	Assert.assertEquals(false, sword.equals(knife));
    	Assert.assertEquals(true, knife.equals(knife2));
    	Assert.assertEquals(false, sword.equals(animal1));
    	
    }
    
    public void toStringTest() throws AssertException{
    	Equipment knife = new Equipment("Knife/1, 1.2, 26.3, a knife for fighting");
    	Assert.assertEquals("Name: Knife, Number: 1, Weight: 1.20 lbs, Price: $26.30 -  a knife for fighting", knife.toString());
    	
    }
    
}