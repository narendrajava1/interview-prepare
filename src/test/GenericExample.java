package test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		Counter<Integer> counter=new Counter<>(1);
		counter.print();
		counter.printGeneric("Narendra","Kumar");
		List<String> list=new ArrayList<>();
		list.add("Narendra");
		counter.print(list);
	}

}

class Counter<T extends Number & Serializable> {

	T t;

	Counter(T t) {
		this.t = t;
	}

	public void print() {
		System.out.println(t);
	}
	
	public <K,U> K printGeneric(K k,U u) {
		System.out.println(k);
		System.out.println(u);
		return k;
	}
	
	public void print(List<?> list) {  //we can use wild card here 
		System.out.println(list);
	}

}