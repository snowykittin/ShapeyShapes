public class STATS {

    public static int numFood =5;
    public static int numEnemies =2;
    private static int life = 3;
    private static int level = 1;
    private static int lowSpeed = 3;
    private static int rangeSpeed = 8;

    public static int getNumFood() {
        return numFood;
    }

    public static void setNumFood(int numFood) {
        STATS.numFood = numFood;
    }

    public static int getNumEnemies() {
        return numEnemies;
    }

    public static void setNumEnemies(int numEnemies) {
        STATS.numEnemies = numEnemies;
    }

    public static int getLife() {
        return life;
    }

    public static void setLife(int life) {
        STATS.life = life;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        STATS.level = level;
    }

    public static int getLowSpeed() {
        return lowSpeed;
    }

    public static void setLowSpeed(int lowSpeed) {
        STATS.lowSpeed = lowSpeed;
    }

    public static int getRangeSpeed() {
        return rangeSpeed;
    }

    public static void setRangeSpeed(int rangeSpeed) {
        STATS.rangeSpeed = rangeSpeed;
    }

    public static void updateLevel(){
        switch(level){
            case 1:
                setNumFood(5);
                setNumEnemies(1);
                setLowSpeed(3);
                setRangeSpeed(4);
                break;
            case 2:
                setNumFood(10);
                setNumEnemies(3);
                setLowSpeed(8);
                setRangeSpeed(10);
                break;
        }
    }
}