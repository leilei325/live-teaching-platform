package cn.jerryshell.liveteaching.dao;

import cn.jerryshell.liveteaching.model.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeworkDao extends JpaRepository<Homework, String> {
    List<Homework> findByStudentId(String studentId);

    List<Homework> findByVideoId(String videoId);
}
