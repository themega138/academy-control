package com.mq310.modules.students.repositories;

import com.mq310.modules.students.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by moises on 12/02/17.
 */
public interface StudentsRepository extends JpaRepository<Student, Long> {
}
