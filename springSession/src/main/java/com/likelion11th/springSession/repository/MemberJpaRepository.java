package com.likelion11th.springSession.repository;

import com.likelion11th.springSession.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<MemberEntity, Long> {
}