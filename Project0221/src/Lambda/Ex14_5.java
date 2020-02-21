package Lambda;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Student> studentStream = Stream.of(
					new Student("���ڹ�", 3, 300), 
					new Student("���ڹ�", 1, 200), 
					new Student("���ڹ�", 2, 100), 
					new Student("���ڹ�", 2, 150), 
					new Student("���ڹ�", 1, 200), 
					new Student("���ڹ�", 3, 290), 
					new Student("���ڹ�", 3, 180)
				);
		
		studentStream.sorted(Comparator.comparing(Student::getBan)
			.thenComparing(Comparator.naturalOrder()))
			.forEach(System.out::println);

	}

}
