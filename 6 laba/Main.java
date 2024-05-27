import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {

            System.out.println("Введiть номер завдання (1; 2; 3; 4; 5), або 'q' для виходу:");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                return;
            }

            switch (userInput) {
                case "1":
                    System.out.println("-------------------------------");
                    Person task1 = new Person("Mahmed", 38);
                    task1.talk();
                    task1.move();
                    break;
                case "2":
                    System.out.println("-------------------------------");
                    
                    Phone task2 = new Phone("067-116-9990", "Afon", 22222);
                    Phone MyPhone = new Phone("097-321-3135", "Sasung", 22222);
                    System.out.println("The phone I found: " + task2.model + ", its number: " + task2.number + ", its weight: " + task2.weight);

                    MyPhone.recieveCall("Abobus", "067-116-9990");
                    System.out.println("Phone number: " + MyPhone.getNumber());
                    
                    MyPhone.sendMessage("987-654-3210", "555-1234-3142", "999-999-9999");
                    break;
                case "3":
                    System.out.println("-------------------------------");
                    Shape shape = new Shape();
                    Shape pyramid = new Pyramid(2.0, 1.0);
                    Shape cylinder = new Cylinder(35.0, 1.0);
                    Shape ball = new Ball(9.0);

                    System.out.println(pyramid.getVolume());
                    System.out.println(cylinder.getVolume());
                    System.out.println(ball.getVolume());
                    break;
                case "4":
                    System.out.println("-------------------------------");
                    Sedan sedan = new Sedan("Toyota Camry", "Black", 180);
                    Mazda mazda = new Mazda("Mazda Miata", "Pink", 350);

                    sedan.gas();
                    sedan.brake();

                    mazda.gas();
                    mazda.brake();
                    break;
                case "5":
                    System.out.println("-------------------------------");
                    StudentPerformance student = new StudentPerformance();

                    student.inputStudentData();
                    student.displayStudentData();
                    
                    System.out.println("Average grade: " + student.calculateAverageGrade());
                    break;
                default:
                    System.out.println("Неправильний ввiд. Введiть номер завдання (1; 2; 3; 4; 5) або 'q' для виходу.");
                    break;
            }
        }
    }
}