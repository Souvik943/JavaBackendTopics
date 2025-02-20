package DESIGNPATTERNS.Singleton;

public class TVSet {
    private static volatile TVSet tvSetInstance = null;

    private TVSet() {
        System.out.println("Class Instantiated");
    }

    public static TVSet getTVSetInstance() {
        if(tvSetInstance == null) {
            synchronized (TVSet.class) {
                if(tvSetInstance == null) {
                    tvSetInstance = new TVSet();
                }
            }
        }
        return tvSetInstance;
    }
}
