package workshop14.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import workshop14.config.config.ComponentScanConfig;
import workshop14.config.data_access.StudentDao;
import workshop14.config.model.Student;
import workshop14.config.service.StudentManagement;
import workshop14.config.util.UserInputService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService userInputService = context.getBean(UserInputService.class);


        System.out.println("Enter a name: ");
        String name = userInputService.getString();
        System.out.println("Now enter an ID: ");
        int id = userInputService.getInt();
        studentDao.save(new Student(id, name));
        studentDao.findAll().forEach(System.out::println);


    }
}