import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @After
    public void clear_removesAllInstancesOfSquad_0() {
        Squad testSquad = new Squad("The League", "Fighting Injustice");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }

    @Test
    public void squad_instanciatesCorrectly_true() {
        Squad testSquad = new Squad("The League", "Fighting Injustice");
        assertEquals(true, testSquad instanceof Squad);
    }

    @Test
    public void getName_squadInstanciatesWithName_TheLeague() {
        Squad testSquad = new Squad("The League", "Fighting Injustice");
        assertEquals("The League", testSquad.getName());
    }

    @Test
    public void getCause_squadInstanciatesWithCause_fightInjustice() {
        Squad testSquad = new Squad("The League", "Fight Injustice");
        assertEquals("Fight Injustice", testSquad.getCause());
    }

    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad("The League", "Fighting Injustice");
        Squad secondSquad = new Squad("Averagers", "Fighing the Mean");
        assertTrue(Squad.all().contains(firstSquad));
        assertTrue(Squad.all().contains(secondSquad));
    }

    @Test
    public void getId_squadInstanciatesWithId_1() {
        Squad testSquad = new Squad("The League", "Fighting Injustice");
        assertEquals(1, testSquad.getId());
    }

    @Test
    public void find_locatesSpecificIdOfSquad_secondSquad() {
        Squad firstSquad = new Squad("The League", "Fighting Injustice");
        Squad secondSquad = new Squad("Averagers", "Fighting the Mean");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }

    @Test
    public void getHero_returnsEmptyList_ArrayList() {
        Squad testSquad = new Squad("The League", "Fighting Injustice");
        assertEquals(0, testSquad.getHero().size());
    }

    @Test
    public void addHero_addsHeroToASquad_true() {
        Squad testSquad = new Squad("The League", "Fighting Injustice");
        Hero testHero = new Hero("Superman", "Strength", 20, "Green Rock");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHero().contains(testHero));
    }

    //Testing for the size of the squad
    @Test
    public void getSize_returnsMaximumSizeOfSquad_6() {
        Squad testSquad = new Squad("The League", "Fighting Injustice");
        Hero firstHero = new Hero("Superman", "Strength", 20, "Green Rock");
        Hero secondHero = new Hero("Superman", "Strength", 20, "Green Rock");
        Hero thirdHero = new Hero("Superman", "Strength", 20, "Green Rock");
        Hero fourthHero = new Hero("Superman", "Strength", 20, "Green Rock");
        Hero fifthHero = new Hero("Superman", "Strength", 20, "Green Rock");
        Hero sixthHero = new Hero("Superman", "Strength", 20, "Green Rock");
        testSquad.addHero(firstHero);
        testSquad.addHero(secondHero);
        testSquad.addHero(thirdHero);
        testSquad.addHero(fourthHero);
        testSquad.addHero(fifthHero);
        testSquad.addHero(sixthHero);
        assertEquals(6, testSquad.getHero().size());
    }
}