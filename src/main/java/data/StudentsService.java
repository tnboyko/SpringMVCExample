package data;

import java.util.List;

public interface StudentsService {
	Student addStudent(Student student);
	Student getStudentById(int studentId);
	List<Student> getAllStudents();
	Student getStudentByPIB(String pib);
	List<Student> getAllStudentsByCourse(int course);
	void saveStudent(Student student);

}
