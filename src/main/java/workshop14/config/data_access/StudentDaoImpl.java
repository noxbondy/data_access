package workshop14.config.data_access;

import workshop14.config.model.Student;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{
    private List<Student> students = new ArrayList<>();

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        for(Student student : students){
            if(student.getId() == id)
                return student;
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
