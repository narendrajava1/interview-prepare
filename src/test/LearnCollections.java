package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LearnCollections {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("Narendra", "12345");
		map.put("Kumar", "12345");
		map.put("Kolli", "12345");
		map.put("Kolli1", "12345");
		System.out.println(map.get("Kolli1").hashCode());
		System.out.println(map.get("Kolli").hashCode());
		System.out.println(map);
		
		List<String> arrayList=new ArrayList<>();
		arrayList.add("arrayList"+"Narendra");
		arrayList.add("arrayList"+"Narendra1");
		arrayList.add("arrayList"+"Narendra2");
		arrayList.add("arrayList"+"Narendra3");
		List<String> linkedList=new LinkedList<>();
		linkedList.add("linkedList"+"Narendra");
		linkedList.add("linkedList"+"Narendra1");
		linkedList.add("linkedList"+"Narendra2");
		linkedList.add("linkedList"+"Narendra3");
		System.out.println(arrayList);
		System.out.println(linkedList);
	}
}
