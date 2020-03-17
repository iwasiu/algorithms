public class Human {
    static int legs = 2;
    static int hand = 2;
    private int age;
    String color;
    public enum Education {
        PRIMARY, SECONDARY, TERTIARY
    };

    public static String walk() {
        return "I can walk on my " + Human.legs + " legs";
    }

    public static String eat() {
        return "I can eat with " + Human.hand + " hands";
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }
}