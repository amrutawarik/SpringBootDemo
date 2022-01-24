package com.amruta.SpringBootDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootDemoApplication.class, args);


		List list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);
		list.remove(1);
		System.out.println(list);


		list = (List) list.stream()
				.filter(o -> !o.equals(3))
				.collect(Collectors.toList());

		System.out.println(list);

		System.out.println(list.stream().findFirst());

		list.stream().anyMatch()


		list = (List) list.stream()
				.map(o -> ((Integer)o).intValue() * 3 )
				.collect(Collectors.toList());

		System.out.println(list);

	}

}
