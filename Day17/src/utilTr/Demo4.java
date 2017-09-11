package utilTr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		Person[] ps = new Person[] { new Person("jack", 34),
				new Person("lucy", 20), new Person("lili", 10),
				new Person("jack", 34) };
		// ��������
		System.out.println(Arrays.toString(ps));
		// 2. ���Զ����������ת��ΪList����
		List<Person> list = Arrays.asList(ps);
		// 3. ��Listת��ΪSet
		Set<Person> set = new HashSet<Person>();
		set.addAll(list);
		System.out.println(set);

	


	}

}
//1. ����Person��
class Person {
	public String name;
	public int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {

		return getClass().getName() + " : name=" + this.name + " age="
				+ this.age;

	}

	// 4. ��дhashCode��equals()
	public int hashCode() {

		return this.age;
	}

	public boolean equals(Object o) {
		Person p = null;
		if (o instanceof Person)
			p = (Person) o;
		return this.name.equals(p.name) && (this.age == p.age);
	}
}
