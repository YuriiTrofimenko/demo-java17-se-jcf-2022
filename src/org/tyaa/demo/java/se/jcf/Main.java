package org.tyaa.demo.java.se.jcf;

import org.tyaa.demo.java.se.jcf.models.Employee;
import org.tyaa.demo.java.se.jcf.models.Employee2;
import org.tyaa.demo.java.se.jcf.models.Fish;

import java.lang.ref.WeakReference;
import java.math.BigDecimal;
/* import java.util.ArrayList;
import java.util.List;
import java.util.Set; */
import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // List Demo

	    /* List integers = new ArrayList();
	    integers.add(30);
	    integers.add(55);
	    integers.add("Java");
		for (var item : integers) {
			System.out.println((Integer) item * 2);
		} */
		/* List<Integer> integers = new ArrayList<>();
		integers.add(30);
		integers.add(55);
		// integers.add("Java");
		for (var item : integers) {
			System.out.println(item * 2);
		} */

		/* List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bill", new BigDecimal("22000"), "Toronto"));
        employees.add(new Employee("John", new BigDecimal("20000"), "NewYork"));
        employees.add(new Employee("Mary", new BigDecimal("22000"), "NewYork"));
        employees.add(new Employee("Lui", new BigDecimal("21000"), "Paris"));
        employees.add(new Employee("Lu", new BigDecimal("21000"), "Beijing")); */

        // Set Demo

        // Set<String> citySet = new LinkedHashSet<>();
        // Set<String> citySet = new HashSet<>();
        /* Set<String> citySet = new TreeSet<>();
        for (Employee employee : employees) {
            citySet.add(employee.cityName());
        }
        for (String city : citySet) {
            System.out.println(city);
        } */

        // Map Demo

        /* System.out.println();
        Map<String, Integer> cityMap = new TreeMap<>();
        for (Employee employee : employees) {
            cityMap.put(
                employee.cityName(),
                (cityMap.containsKey(employee.cityName())) ? cityMap.get(employee.cityName()) + 1 : 1
            );
        }
        for (Map.Entry<String, Integer> city : cityMap.entrySet()) {
            System.out.printf("%s=%s\n", city.getKey(), city.getValue());
        } */

        // WeakHashMap Demo

        expirience2();
    }

    public static void expirience2 () throws InterruptedException {

        // Map<Employee, Integer> employeeMap = new HashMap<>();
        Map<Employee, Integer> employeeMap = new WeakHashMap<>();
        employeeMap.put(new Employee("Bill", new BigDecimal("22000"), "Toronto"), 1);
        employeeMap.put(new Employee("John", new BigDecimal("20000"), "NewYork"), 3);
        employeeMap.put(new Employee("Lu", new BigDecimal("21000"), "Beijing"), 2);
        System.out.println("Before:");
        for (Map.Entry<Employee, Integer> city : employeeMap.entrySet()) {
            System.out.printf("%s=%s\n", city.getKey(), city.getValue());
        }
        // do something huge to invoke garbage collector
        for(int i = 0; i < 10000; i++) {
            byte b[] = new byte[1000000];
            b = null;
        }
        System.out.println();
        System.out.println("After:");
        for (Map.Entry<Employee, Integer> city : employeeMap.entrySet()) {
            System.out.printf("%s=%s\n", city.getKey(), city.getValue());
        }
    }
}
