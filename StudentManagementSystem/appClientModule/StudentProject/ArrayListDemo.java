package StudentProject;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;



public class ArrayListDemo {
	public static void main(String[] args) throws ConcurrentModificationException{
		studentTest student = new studentTest();
		
		student.setNames();
		student.searchByName();
		student.searchNameByIndex();
		student.printNames();
		student.removeName();
	}
}