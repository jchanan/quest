package com.questcomputing.quest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questcomputing.quest.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
