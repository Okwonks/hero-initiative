import java.util.List;
import java.util.ArrayList;

public class Hero {
    private String mName;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int mId;
    private int mAge;
    private String mPower;
    private String mWeakness;

    public Hero(String name, String power, int age, String weakness) {
        //Hero object and it's properties. Get ready to be saved.
        mName = name;
        instances.add(this);
        mId = instances.size();
        mPower = power;
        mAge = age;
        mWeakness = weakness;
    }

    public String getName() {
        return mName;
    }
    public String getPower() {
        return mPower;
    }
    
    public String getWeakness() {
        return mWeakness;
    }

    public static List<Hero> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId() {
        return mId;
    }

    public int getAge() {
        return mAge;
    }

    public static Hero find(int id) {
        //Using try and catch to prevent an exception and the crashing of the program
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }
}