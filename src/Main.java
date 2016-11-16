import classes.Customer;
import classes.Employee;
import classes.MyMethod;
import classes.Person;
import com.sun.org.apache.regexp.internal.RE;

import java.util.Random;

public class Main {


    public static void main(String[] args) {


        /** Primitive variables*/
        /*byte byteVar = 127; //range from -128 to 127;
        short shortVar = 32767;
        int decimalVar = 2147483647;
        long longVar = -9223372036854775808L;
        long longDecimalVar = 9223372036854775807L;
        float fVAr = 8.2f;
        double dVar = 12312312.1232;
        boolean bVar = true;
        char charVar = '\u0041';
        int grades = 0;


        System.out.println("byte" +byteVar);
        System.out.println("short" +shortVar);
        System.out.println("int" +decimalVar);
        System.out.println("long" +longVar);
        System.out.println("long" +longDecimalVar);
        System.out.println("float" +fVAr);
        System.out.println("double" +dVar);
        System.out.println("boolean" +bVar);
        System.out.println("char" +charVar);
        System.out.println("int" +grades);

        String someText = "this is string variable";*/

        //Objects
        //Person person = new Person();
        //person.setNaame ("myName"); //



        /*int grades[]= new int[5];

        grades [0] = 98;
        grades [1] = 97;
        grades [2] = 96;
        grades [3] = 95;
        grades [4] = 94;

        System.out.println("math;" +grades[0]);
        System.out.println("filipino;" +grades[1]);
        System.out.println("english;" +grades[2]);
        System.out.println("science;" +grades[3]);
        System.out.println("mapeh;" +grades[4]);*/


        /*String errorMessages[]= new String[3];

        errorMessages[0] = "this is error messages" ;
        errorMessages[1] = "not found" ;
        errorMessages[2] = "go back to page";

        System.out.println("Error 1 =" + errorMessages[0]);
        System.out.println("Error 2 =" + errorMessages[1]);
        System.out.println("Error 3 =" + errorMessages[2]);*/

        //inheritance
    /*Person personObject = new Person();
        personObject.setName("Arboy");
        personObject.setGender(true);
        personObject.setEmail("arboybalatayo@gmail.com");
        personObject.setAge(23);
        personObject.setWeight(134f);
        personObject.setHeight(175f);



        System.out.println("Name: " + personObject.getName());
        System.out.println("Gender: " + personObject.isGender());
        System.out.println("Email: " + personObject.getEmail());
        System.out.println("Age: " + personObject.getAge());
        System.out.println("Weight: " + personObject.getWeight() +"kg.");
        System.out.println("Height: " + personObject.getHeight() +"cm.");*/


        /*Employee employee= new Employee();
        employee.setDepartment("Graphic Designer");
        employee.setSss_id(123457890);
        employee.setPagibig_id(1234567890);
        employee.setName("Arboy");

        System.out.println("Department: " + employee.getDepartment());
        System.out.println("SSS ID: " + employee.getSss_id());
        System.out.println("Pagibig ID: " + employee.getPagibig_id());

        Customer customer= new Customer();
        customer.setCustomer_id("Luke Reggie Balatayo");
        customer.setMembership_level(999);
        customer.setCredit_card_number(12334567);
        customer.setName("Joshua");

        System.out.println("Customer ID: " + customer.getCustomer_id());
        System.out.println("Membership Level: " + customer.getMembership_level());
        System.out.println("Credit Card Number: " + customer.getCredit_card_number());
        System.out.println("Hi I am " + customer.introduceYourSelf("Loki", "Villa Del Rio"));
        System.out.println("Hi I am " + employee.introduceYourSelf("Marlon", "Accounting Manager"));*/

        //abstaction
        /*Person person= new Person("Doctor");
        Person person1= new Person();*/

        //condition
        /*int number = 0;
            if( number < 3){
                System.out.println(number + " is less than 3");
        }
            else if( number == 3 ){
                System.out.println(number + " is equal to 3");

        }
            else {
            System.out.println(number + " is greater than or equal to 3");
        }*/

        /*int tstudent = 20;
        int cstudent = 15;
        String day = "Monday";

            if(cstudent <= 15 && day == "Monday") {
            System.out.println("MONDAY ");
            System.out.println("Current Subject is MATH and Teacher 1 has less than equal "+ cstudent );
            }

            else  if(cstudent > 15 && day == "Monday") {
                System.out.println("MONDAY");
                System.out.println("Current Subject is SCIENCE and Teacher 3 has " + tstudent + "students");

            }

            else if(cstudent == tstudent && day == "Tuesday") {
                System.out.println("Tuesday");
                System.out.println("Current Subject is SCIENCE and Teacher 3 has " + tstudent + "students");

            }

            else{
                System.out.println("Tuesday");
                System.out.println("Current Subject is English, OOP and Server Maintenance and Teacher 2,4 & 5 has less than or greater than " + tstudent +" students");
            }*/

        // condition test 2

        /*boolean Weekday = true;
        boolean Holiday = true;



            if(!Weekday && Holiday) {
                System.out.println("Today is Vacation");
            }
            else{
                System.out.println("Today is Not Vacation");
            }*/

        // condition test 3
        /*boolean Regular_student = false ;
        boolean Part_Time_student = true;

            if(Regular_student){
                System.out.println("Regular student has 7 subjects per trimester");
            }
            else if(!Regular_student && Part_Time_student) {
                System.out.println("Irregular student can take 6 subjects");
            }
            else if(!Regular_student || Part_Time_student) {
                System.out.println("&regular student can take 7 subjects per trimester");
            }
            else {
                System.out.println("Irregular student can take 5 subjects only");
            }*/



            /*System.out.println("You can take " + MyMethod.getNumbSubjects(true,true) + " subjects" );*/





           /*System.out.print(MyMethod.looper(6));*/

        /*System.out.println("The sum is " + MyMethod.sixInt());*/
/*

        int num = MyMethod.doWhile(9);
        System.out.print(num);
        }



*/
   /*MyMethod.doWhile(9);*/

        /*int n;
        String ForLoop[] = new String[5];

        ForLoop[0] = "Amille";
        ForLoop[1] = "Bert";
        ForLoop[2] = "Loki";
        ForLoop[3] = "Dennis";
        ForLoop[4] = "Richard";

        System.out.println("My friends are: ");
        for (n = 0; n < 5; n++) {
            System.out.println(ForLoop[n]);

        }*/


        //System.out.print(MyMethod.myFriends() + MyMethod.relationships() + MyMethod.girlfriends());
        /*System.out.print(MyMethod.relationships());
        System.out.print(MyMethod.girlfriends());*/

        Random rand = new Random();
        int getRandNum = rand.nextInt(2);//this return a number from 0 - 1
        int boy = 0;
        int girl = 1;
       // System.out.print(getRandNum);
        if (getRandNum == boy) {
            System.out.print(MyMethod.myFriends() + MyMethod.relationships() + MyMethod.girlfriends());
        }
        else if (getRandNum == girl){
            System.out.print(MyMethod.girlfriends() + MyMethod.relationships() + MyMethod.myFriends());
        }



       





    }
}


