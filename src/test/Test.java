package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, NoSuchFieldException, SecurityException {
//		Student s1 = new Student();
//		s1.setName("Krishna");
//		s1.setAge(30);
//		Address address = new Address();
//		s1.setAddress(address);
//		s1.getAddress().setHno("2-2-22");
//		s1.getAddress().setStreet("somewhere");
//		s1.getAddress().setPin(123);
//
//		Student s2 = new Student();
//		s2.setName("Krishna");
//		s2.setAge(20);
//		address = new Address();
//		s2.setAddress(address);
//		s2.getAddress().setHno("1-1-11");
//		s2.getAddress().setStreet("nowhere");
//		s2.getAddress().setPin(123);
//		Student s3 = new Student();
//		s3.setName("Krishna");
//		s3.setAge(20);
//		address = new Address();
//		s3.setAddress(address);
//		s3.getAddress().setHno("1-1-11");
//		s3.getAddress().setStreet("nowhere");
//		s3.getAddress().setPin(123);
//		List<Student> studentList=new ArrayList<>();
//		studentList.add(s2);
//		studentList.add(s3);
//		studentList.add(s1);
//		test(studentList);
		
		 /* Start with the empty list. */
        MyLinkedList list = new MyLinkedList(); 
	}
	


	private static Student test(List<Student> studentList) {
//		  System.out.println(empList.stream().collect(Collectors.groupingBy(employee -> employee.getName(),Collectors.counting())));
//
//	       System.out.print(empList.stream().collect(Collectors.groupingBy(employee -> employee.getName(),Collectors.counting())).entrySet().stream().collect(Collectors.averagingDouble(m-> Double.parseDouble(String.valueOf(m.getValue())))));

		Student student = new Student();
		Function<List<Student>, List<Integer>> studentAgeList=studentListParam->studentListParam.stream().map(studentParam->studentParam.getAge()).collect(Collectors.toList()); 
		studentAgeList.apply(studentList).forEach(System.out::println);
		Predicate<Student> studentAgePredicate=studentObj->studentObj.getAge()>25;
		studentList.stream().filter(studentAgePredicate).forEach(System.out::println);
		Supplier<Map<String,List<Student>>> studentNameSupplierList= ()-> studentList.stream().collect(Collectors.groupingBy(studentVar->studentVar.getName(),Collectors.mapping(studentVar->studentVar,Collectors.toList())));
		studentNameSupplierList.get().entrySet().forEach(k->{
			System.out.println(k.getKey()+":::"+k.getValue());
		});
		return student;
	}

}

class Student {
	public String name;
	public Address address;
	public int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	public Student(String name, Address address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public Student() {
		super();
	}

}

class Address {
	public String hno;
	public String street;
	public int pin;

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hno, pin, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(hno, other.hno) && pin == other.pin && Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", pin=" + pin + "]";
	}

	public Address(String hno, String street, int pin) {
		super();
		this.hno = hno;
		this.street = street;
		this.pin = pin;
	}

	public Address() {
		super();
	}

}



class MyLinkedList{
	private Node head; //head of list
	
	/*linked list node*/
	static class Node{
		int data;
		// Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
		Node next;
	}
	
	public MyLinkedList insert(MyLinkedList list,int data) {
		// Create a new node with given data 
		  Node new_node = new Node(data); 
		  
		  // If the Linked List is empty, 
	        // then make the new node as head 
		  if (list.head == null) { 
			  list.head = new_node; 
		  } else { 
	            // Else traverse till the last node 
	            // and insert the new_node there
			  Node last = list.head; 
			  while (last.next != null) { 
				  last = last.next; 
			  }
			  // Insert the new_node at last node 
	            last.next = new_node; 
		  }
		return list;
	}
}