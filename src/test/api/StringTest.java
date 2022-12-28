package test.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("split ���ڿ��� ���ڿ� �� Ư�� ���ڷ� �и��Ͽ� �迭ȭ�մϴ�.")
	public void split() {
		String values = "1,2,3";
		String[] result = values.split(",");
		assertThat(result,equalTo(new String[] {"1","2","3"}));	
	}
	
	@Test
	@DisplayName("join ���ڿ� �迭�� Ư�� ���ڷ� �����Ͽ� ���ڿ�ȭ �մϴ�.")
	public void join() {
		String[] values = {"one","two","three","four"};
		String result = String.join(",", values);
		assertThat(result,equalTo("one,two,three,four"));
	}
	
	@Test
	@DisplayName("contains ���ڿ� �� Ư�� ���ڿ��� ���ԵǾ� �ִ��� Ȯ���մϴ�.")
	public void contains() {
		String values = "�ȳ��ϼ���";
		boolean result = values.contains("�ȳ�");

		assertThat(result,equalTo(true));
	}
	
	@Test
	@DisplayName("replace ���ڿ��� ��ü�մϴ�.")
	public void replace() {
		String values = "�ȳ��ϼ���";
		String result = values.replace("�ϼ���", "�ؿ�");
		assertThat(result,equalTo("�ȳ��ؿ�"));
	}

	@Test
	@DisplayName("isEmpty ���ڿ��� ������ üũ�մϴ�.")
	public void isEmpty() {
		String values = "�ȳ��ϼ���";
		boolean result = values.isEmpty();
		assertThat(result,equalTo(false));
	}

}
