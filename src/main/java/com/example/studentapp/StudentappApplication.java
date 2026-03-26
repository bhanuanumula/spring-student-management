import com.example.studentapp.config.StudentConfig;
import com.example.studentapp.model.Student;
import com.example.studentapp.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class StudentappApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

		StudentService service = context.getBean(StudentService.class);
		Scanner sc = new Scanner(System.in);

		int num = 0;
		while(num!=-1){
			System.out.println("\n1. Add a student \n2. View students\n3. Delete Student\n4. search student");
			System.out.print("choose an option: ");
			num = sc.nextInt();
			sc.nextLine();
				switch (num){
					case 1:
						System.out.print("Enter name: ");
						String name = sc.nextLine();
						service.createStudent(name);
						break;
					case 2:
						service.getStudents().forEach(System.out::println);
						break;

					case 3:
						System.out.print("Enter id: ");
						int id = sc.nextInt();
						sc.nextLine();
						System.out.println(service.delete(id));
						break;
					case 4:
						System.out.print("Enter id: ");
						id = sc.nextInt();
						sc.nextLine();
						Student s = service.search(id);
						if(s!=null) {
							System.out.println(s);
						}
						break;

					default: num = -1;
					break;
				}

		}
		System.out.println("--- Exited ---");
	}

}