package com.example.licentaBackendSB.objects.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //select * from student where name = ? and prenume = ?
    @Query("select s from Student s where s.nume = ?1 and s.prenume = ?2")
    Optional<Student> findStudentByNameAndForname(String nume, String prenume);
}
