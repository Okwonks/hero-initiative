import java.util.List;
import java.util.ArrayList;

/**The Squad Object
 * This is where a Hero can join a cause to fight for
 * Heroes wil be members of a Squad 
 * **/

 public class Squad {
    private String mName;
    private String mCause;
    private static List<Squad> instances = new ArrayList<Squad>(); //Stores all the instances created of the object
    private int mId;
    private List<Hero> mHeros;
    private int mMemebers;
    public Squad(String name, String cause) {
        mName = name;
        instances.add(this);
        mId = instances.size();
        mHeros = new ArrayList<Hero>();
        mMemebers = new ArrayList<Hero>().size();
        mCause = cause;
    }

    public String getName() {
        return mName;
    }

    public String getCause() {
        return mCause;
    }

    public static List<Squad> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId() {
        return mId;
    }

    public static Squad find(int id) {
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public List<Hero> getHero() {
        return mHeros;
    }

    public void addHero(Hero hero) {
        mHeros.add(hero);
    }

    public int getMemebers() {
        return mMemebers;
    }
}