package test.calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void null_또는_빈값() {
		assertThat(Calculator.splitAndSum(null),equalTo(0));
		assertThat(Calculator.splitAndSum(""),equalTo(0));
	}
	
	@Test
	public void 값_하나() {
		assertThat(Calculator.splitAndSum("1"),equalTo(1));
	}
	
	@Test
	public void 쉼표_구분자() {
		assertThat(Calculator.splitAndSum("1,2"),equalTo(3));
	}
	
	@Test
	public void 쉼표_콜론_구분자() {
		assertThat(Calculator.splitAndSum("1,2:3"),equalTo(6));
	}

}
