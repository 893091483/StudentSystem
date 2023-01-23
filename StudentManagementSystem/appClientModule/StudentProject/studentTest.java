package StudentProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class studentTest {
		private ArrayList <Student> stuList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		public void setNames() {
			
			System.out.println("Please enter roll number");
			int rollNo = sc.nextInt();
			System.out.println("Please enter name");
			String stuName = sc.next();
			System.out.println("Please enter age");
			int stuAge = sc.nextInt();
			System.out.println("Please enter address");
			String stuAddress = sc.next();
			stuList.add(new Student(rollNo,stuName,stuAge,stuAddress));
			System.out.println("Student added");
		} 
		
		public void searchByName() {
			boolean flag = false;
			System.out.println("Please enter name");
			String name = sc.next();
			for (Student temp : stuList) {
				if(temp.getName() == name) {
					flag = true;
					System.out.println("Student found" + temp.toString());
					break;
				}
			
			}
			if(!flag)
				System.out.println("Student no found");
		} 
		
		public void searchNameByIndex() {
			boolean flag = false;
			System.out.println("Please enter roll number");
			int rollNo = sc.nextInt();
			for (Student temp : stuList) {
				if(temp.getRollNo() == rollNo) {
					flag = true;
					System.out.println("Student found" + temp.toString());
					break;
				}
			
			}
			if(!flag)
				System.out.println("Student no found");
		} 
		
		public void printNames( ) {
			Iterator < Student> str = stuList.iterator();
			while(str.hasNext()) {
				  System.out.println(str.next().getName());
				}
			
		}
		public void removeName( ) {
			boolean flag = false;
			System.out.println("Please enter name");
			String stuName = sc.next();
			for (Student temp : stuList) {
				if(temp.getName() == stuName) {
					flag = true;
					System.out.println("Student found and deleted" + temp.toString());
					break;
				}
			
			}
			if(!flag)
				System.out.println("Student no found");
		}		
}
