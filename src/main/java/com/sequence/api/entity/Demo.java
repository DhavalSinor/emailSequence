package com.sequence.api.entity;

import com.sequence.api.base.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;

@Getter
@Setter
@Entity
@Table(name = "demo")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Demo extends AbstractEntity {

    @Serial
    private static final long serialVersionUID = -5418215431736488195L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

}