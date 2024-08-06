package com.example.xyz.repository;

import com.example.xyz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// lưu trữ các thực thi cơ sở dữ liệu => service sẽ đảm nhieemj thực thi
public interface Userrepsitory extends JpaRepository<User, Integer> {
}
