package optionalTest;

import java.util.Optional;

import org.junit.Test;

public class OptionalMethodTest {

	@Test
	public void test() {
		Optional<Employee> ee = Optional.ofNullable(null);
		Employee e = ee.orElseGet(()-> new Employee());
		System.out.println(e);
		
	}
}
