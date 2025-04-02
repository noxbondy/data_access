package workshop14.config.data_access;

import workshop14.config.model.Student;

import java.util.List;

public interface StudentDao {
    Student save(Student student);
    Student find(int id);
    List<Student> findAll();
    void delete(int id);
}

