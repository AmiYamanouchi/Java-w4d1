package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	
		
		public static void printStudents(ArrayList<Student> studList) {
			for(Student s : studList) {
				System.out.println("Name: " + s.getFirstName() + " " + s.getLastName() +
								   "\nYear of Birth: " + s.getBirthYear());
				System.out.println();
			}
		}
		
		public static void removeStudent(String student, ArrayList<Student> studList) {
			for(int i =0; i < studList.size(); i++) {
				if(studList.get(i).getLastName().equalsIgnoreCase(student)) {
					studList.remove(i);
					break;
     			}
//				else {
//					System.out.println("Sorry we don't have this student in the list");
//				}
			}
		}
			
		
		public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
			
		//アレイリストを作成
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		//アレイリストの中のオブジェクトたち
//		Student student1 = new Student("Jane", "Doe", 1980);
//		Student student2 = new Student("John", "Dew", 1987);
//		Student student3 = new Student("Sarah", "Green", 1985);
		
		//アレイリストに作ったオブジェクトたちを追加する
//		studentList.add(student1);
//		studentList.add(student2);
//		studentList.add(student3);
//		
//		printStudents(studentList);
		
//		System.out.println("Enter the last name of student whon you want to remove");
//		String lastNameEntered = input.nextLine();
//		removeStudent(lastNameEntered,studentList);
//		
//		printStudents(studentList);
		
		System.out.println("pless Q for Quit");
		String sEntered = input.next();
		while(!sEntered.equalsIgnoreCase("q")) {
			System.out.println("enter the first name of student");
			String fname = input.nextLine();
			System.out.println("enter the last name of student");
			String lname = input.nextLine();
			System.out.println("enter the birth year of student");
			int bYear = input.nextInt();
			
			Student s = new Student(fname, lname, bYear);
			
			studentList.add(s);
			
			System.out.println("press q to quit otherwise enter any keyword");
			sEntered = input.next();
			
		}
		
		printStudents(studentList);
	
	}			
	
}
