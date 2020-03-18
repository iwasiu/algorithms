public class Nigerian extends Human {
static String color = "black";
static String education = "average";
//private String hair;

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(Human.walk());
        System.out.println(Human.eat());
        System.out.println("The age has been initialised to : " + human.getAge());
        human.setAge(34);
        System.out.println("The age has been changed to : " + human.getAge());
        //System.out.println(hair());
        System.out.println("90% of Nigerians' hair is unknown :" + human.getHair());
        human.setHair("blue");
        System.out.println("90% of Nigerians' hair is " + human.getHair());

    }       

    public static String setColor(){
        return "A Nigerian is proud to be "+color;
    }
    public static String setEducation(){
        return "Nigeria's style of education is on the "+education;
    }    
    public static String hair(){
        return "Nigerians' hair is always "+ color;
    }
}
