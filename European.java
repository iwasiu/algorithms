public class European extends Human {
    static String color = "light brown";
    static String education = "high";
    
        public static void main(String[] args) {
            Human human = new Human();
            System.out.println(Human.walk());
            System.out.println(Human.eat());
            System.out.println("The age has been initialised to : " + human.getAge());
            human.setAge(12);
            System.out.println("The age has been changed to : " + human.getAge());
            //System.out.println(hair());
            System.out.println("90% of Europeans' hair is unknown :" + human.getHair());
            human.setHair(color);
            System.out.println("90% of Europeans' hair is " + human.getHair());
    
        }       
    
        public static String setColor(){
            return "A European is proud to be color : "+color;
        }
        public static String setEducation(){
            return "Europeans's style of education is on the "+education;
        }    
        public static String hair(){
            return "Europeans' hair is always "+ color;
        }
    }
    