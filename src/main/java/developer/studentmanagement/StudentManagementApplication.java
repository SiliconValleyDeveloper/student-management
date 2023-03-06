package developer.studentmanagement;

import developer.studentmanagement.entity.Student;
import developer.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}


//	@Autowired
//	private StudentRepository studentRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		Student student1 = new Student("Ankit", "Rawat", "ankit@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Shivam", "Rawat", "Shivam@gmail.com");
//		studentRepository.save(student2);
//
//
//		Student student3 = new Student("Sapna", "Rawat", "ss@gmail.com");
//		studentRepository.save(student3);
//
//
//	}

}
