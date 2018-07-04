package main.java.spring.ioc.autowiring;

public class AutoWiringService {

    private AutoWiringDao autoWiringDao;

    /**
     * constructor
     * @param autoWiringDao
     */
    public AutoWiringService(AutoWiringDao autoWiringDao) {
        System.out.println("cons");
        this.autoWiringDao = autoWiringDao;
    }

    /**
     * byName
     * @param autoWiringDao
     */
    public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
        System.out.println("go");
        this.autoWiringDao = autoWiringDao;
    }

    public void say(String word) {
        this.autoWiringDao.say(word);
    }
}
