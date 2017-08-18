import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

    @After
    public void clear_emptiesAllHerosFromArrayList_0() {
        Hero testHero = new Hero("Superman", "Strength", 20, "Green Rock");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
        //Clears the fields after every test
    }

    @Test
    public void Hero_instanciatesCorrectly_true() {
        Hero testHero = new Hero("Superman", "Strength", 20, "Green Rock");
        assertEquals(true, testHero instanceof Hero);
    }

    /** Testing the properties of the Hero Object **/
    @Test
    public void Hero_instanciatesWithName_String() {
        Hero testHero = new Hero("Superman", "Strength", 20, "Green Rock");
        assertEquals("Superman", testHero.getName());
    }
    
    @Test
    public void Hero_instanciatesWithSuperPower_String() {
        Hero testHero = new Hero("Superman", "Strength", 20, "Green Rock");
        assertEquals("Strength", testHero.getPower());
    }

    @Test
    public void Hero_instanciatesWithWeakness_String() {
        Hero testHero =  new Hero("Superman", "Strength", 20, "Green Rock");
        assertEquals("Green Rock", testHero.getWeakness());
    }

    /** Testing to see if an instances contains all Heroes **/
    @Test
    public void all_returnsInstancesOfHero_true() {
        Hero firstHero = new Hero("Superman", "Strength", 20, "Green Rock");
        Hero secondHero = new Hero("Batman", "Martial Arts", 25, "Women");
        assertEquals(true, Hero.all().contains(firstHero));
        assertEquals(true, Hero.all().contains(secondHero));
    }

    /** Testing to see if Heroes are instanciated with Id **/
    @Test
    public void getId_herosInstanciateWithAnId_1() {
        Hero testHero = new Hero("Superman", "Strength", 20, "Green Rock");
        assertEquals(1, testHero.getId());
    }

    @Test
    public void find_returnsHeroWithTheSameId_secondHero() {
        Hero firstHero = new Hero("Superman", "Strength", 20, "Green Rock");
        Hero secondHero = new Hero("Batman", "Martial Arts", 25, "Women");
        assertEquals(Hero.find(secondHero.getId()), secondHero);
    }

    /** Testing if the age property is included in teh Hero object **/
    @Test
    public void getAge_heroesInstanciateWithAge_0() {
        Hero testHero = new Hero("Superman", "Strength", 20, "Green Rock");
        assertEquals(20, testHero.getAge());
    }
}