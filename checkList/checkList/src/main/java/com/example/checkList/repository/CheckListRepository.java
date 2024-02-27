package com.example.checkList.repository;

import com.example.checkList.entity.CheckList;
import com.example.checkList.mapper.CheckListMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface CheckListRepository extends JpaRepository<CheckList,Long> {
        CheckList findByDateOfEntry(LocalDateTime dateOfEntry);
}
