package test.api;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CollectionTest {

	@Test
	@DisplayName("ArrayList 메서드 테스트")
	void arrayList() {
		ArrayList<String> values = new ArrayList<>();
		values.add("first");
		values.add("second");
		assertThat(values.add("third"),is(true));
		assertThat(values.size(),equalTo(3));
		assertThat(values.remove(0),equalTo("first"));
		assertThat(values.contains("first"),equalTo(false));
		assertThat(values.size(),equalTo(2));
		values.clear();
		assertThat(values.size(),equalTo(0));
	}
	
	@Test
	@DisplayName("HashSet 메서드 테스트")
	public void hashSet() {
		HashSet<String> values = new HashSet<>();
		values.add("first");
		values.add("first");
		
		assertThat(values.size(),equalTo(1));
		assertThat(values.contains("first"),equalTo(true));
		values.add("second");
		assertThat(values.size(),equalTo(2));
		values.remove("first");
		assertThat(values.contains("first"),equalTo(false));
		
		HashSet<String> addValues = new HashSet<>();
		addValues.add("first");
		addValues.add("third");
		values.addAll(addValues);
		assertThat(values.contains("first"),equalTo(true));
		assertThat(values.contains("second"),equalTo(true));
		assertThat(values.contains("third"),equalTo(true));

	}

}
