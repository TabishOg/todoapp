package com.s2p.dao;

import com.s2p.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;


//jpa repository to perform quesires
public interface iTaskDAO extends JpaRepository<Task,Long> {
}
