package test.calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void null_�Ǵ�_��() {
		assertThat(Calculator.splitAndSum(null),equalTo(0));
		assertThat(Calculator.splitAndSum(""),equalTo(0));
	}
	
	@Test
	public void ��_�ϳ�() {
		assertThat(Calculator.splitAndSum("1"),equalTo(1));
	}
	
	@Test
	public void ��ǥ_������() {
		assertThat(Calculator.splitAndSum("1,2"),equalTo(3));
	}
	
	@Test
	public void ��ǥ_�ݷ�_������() {
		assertThat(Calculator.splitAndSum("1,2:3"),equalTo(6));
	}

}
