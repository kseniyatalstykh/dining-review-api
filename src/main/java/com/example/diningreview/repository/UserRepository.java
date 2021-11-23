package com.example.diningreview.repository;

import com.example.diningreview.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
}
