package com.example.mobile.jpa;

import com.example.mobile.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {
}
