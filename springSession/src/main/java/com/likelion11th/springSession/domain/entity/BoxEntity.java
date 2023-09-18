package com.likelion11th.springSession.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "boxes")
public class BoxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private MemberEntity member;

    @OneToMany(mappedBy = "box")
    private List<LetterEntity> letters;
}