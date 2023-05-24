import java.util.Scanner;

public class KIA {
	public static void main(String[] args) {
		//String s="SELTOS"; (or)//
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter the Car type:");
//		String s=scan.next();
//		Car c= null;
//		if(s.equals("SELTOS")) {
//		 c= new SELTOS();
//		}
//		else if(s.equals("CARNIVAL")) {
//			 c= new CARNIVAL();
//			}
//		else if(s.equals("CARENS")) {
//			 c= new CARENS();
//			}
//		if(c!= null) {
//			c.capacity();
//			c.mileage();
//			c.type();
//		}
//		else {
//			System.out.println("BAD CAR");
//		}
		Scanner sc= new Scanner(System.in);
		Car c=null;
		do {
			System.out.println("Choose a Car Type");
			System.out.println("1.Sedan\n2.HatchBack\n3.SUV\n4.Exit");
			System.out.println("Enter your choice:[1-4]");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				c=CarFactory.getCar("Sedan");
				System.out.println("Car name: "+c.getClass().getName());
				System.out.println("Car capacity: "+c.capacity());
				System.out.println("Car Mileage: "+c.mileage());
				System.out.println("Car Type: "+c.type());
				break;
			case 2:
				c=CarFactory.getCar("HatchBack");
				System.out.println("Car name: "+c.getClass().getName());
				System.out.println("Car capacity: "+c.capacity());
				System.out.println("Car Mileage: "+c.mileage());
				System.out.println("Car Type: "+c.type());
				break;
			case 3:
				c=CarFactory.getCar("SUV");
				System.out.println("Car name: "+c.getClass().getName());
				System.out.println("Car capacity: "+c.capacity());
				System.out.println("Car Mileage: "+c.mileage());
				System.out.println("Car Type: "+c.type());
				break;
			case 4:
				System.out.println("Exit");
				break;
				default:
					System.out.println("Invalid Choice");
			}
				
			}while(true); 
		}
	}


