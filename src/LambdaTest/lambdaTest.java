package LambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lambdaTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("li", 6000),
				new Employee("zhang", 10000), new Employee("hua", 3000));
//		list.stream()
//		    .filter((e) -> e.getSalary() >= 5000)
//		    .forEach(System.out::println);
		Optional<Double> op = 
		list.stream()
		      .map(Employee::getSalary)
		      .reduce(Double::sum);
		System.out.println(op.get());
		list.stream()
			.map(Employee::getName)
			.collect(Collectors.toList())
			.forEach(System.out::println);
			
	}
}
