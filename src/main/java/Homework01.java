public class Homework01 {
    public static void main(String[] args){
        //1. Write a java program that prints your name, address, age, profession
        String myName = "Quinn Polk";
        String address = "4321 Sweet Street, St. Louis, MO 63118";
        int age = 30;
        String profession = "Software Developer";

        System.out.println("My name is " +myName);
        System.out.println("My address is "+address);
        System.out.println("Age: " +age);
        System.out.println("My Profession: "+profession);

        int number = 20;
        //System.out.println(number/0); //This throws an exception

        //float speed = 25.8f;
        //long distance = 741258963L;

        //2. Create two different types of variable and print them to the console
        boolean isStudent = true;
        boolean madePayment = false;
        char grade = 'A'; //char values take single quotes unlike strings which take double quotes
        System.out.println("I am a student: " + isStudent);
        System.out.println("My grade: " + grade);

        //3. Test all the primitive data types in java.
        //byte value = 129; //range for byte data type is -128 to 127
        byte value = 120; //range for byte data type is -128 to 127
        byte value2 = -50; //range for byte data type is -128 to 127

        short value4 = 200; //range for short data type is -32,768 to 32,767
        //short value5 = 33000; //range for short data type is -32,768 to 32,767

        age = 30; //age is already defined above, so without the data type in front, this is re-assignment
        int speed = 26;
        System.out.println("Speed: "+speed);
        //increase speed
        //speed= 26+4;
        speed= speed +4;
        System.out.println("New Speed: " +speed);

    }
}
