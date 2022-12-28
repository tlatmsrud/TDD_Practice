package test.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("split 문자열을 문자열 내 특정 문자로 분리하여 배열화합니다.")
	public void split() {
		String values = "1,2,3";
		String[] result = values.split(",");
		assertThat(result,equalTo(new String[] {"1","2","3"}));	
	}
	
	@Test
	@DisplayName("join 문자열 배열을 특정 문자로 구분하여 문자열화 합니다.")
	public void join() {
		String[] values = {"one","two","three","four"};
		String result = String.join(",", values);
		assertThat(result,equalTo("one,two,three,four"));
	}
	
	@Test
	@DisplayName("contains 문자열 내 특정 문자열이 포함되어 있는지 확인합니다.")
	public void contains() {
		String values = "안녕하세요";
		boolean result = values.contains("안녕");

		assertThat(result,equalTo(true));
	}
	
	@Test
	@DisplayName("replace 문자열을 교체합니다.")
	public void replace() {
		String values = "안녕하세요";
		String result = values.replace("하세요", "해요");
		assertThat(result,equalTo("안녕해요"));
	}

	@Test
	@DisplayName("isEmpty 문자열이 빈값인지 체크합니다.")
	public void isEmpty() {
		String values = "안녕하세요";
		boolean result = values.isEmpty();
		assertThat(result,equalTo(false));
	}

}
