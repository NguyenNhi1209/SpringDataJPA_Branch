package Repo;

import entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    @Query( value = "select * from student", nativeQuery = true)
    List<Student> getAll();

    @Transactional
    @Modifying
    @Query(value = "update student set name = ?2 where id = ?1", nativeQuery = true)
    void updateStudent(int id, String name);


}
