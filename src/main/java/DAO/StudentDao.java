package DAO;

import java.util.List;

/**
 * Created by Andrea on 01/10/2015.
 */

//Create Data Access Object Interface.
public interface StudentDao {

    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);

}
