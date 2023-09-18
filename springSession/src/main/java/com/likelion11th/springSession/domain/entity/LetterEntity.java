package com.likelion11th.springSession.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "letter")
public class LetterEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(name = "photo_url", nullable = true)
    private String photoUrl;

    @Column(nullable = false)
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn(name = "box_id", nullable = false)
    private BoxEntity box;
}
