package bubble.test.ex00;

import lombok.Data;

@Data
class Dog{
	private String name; // 모든 변수는 private로 걸어야함
}

public class LombokTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("토토");
		System.out.println(d.getName());
	}
}
