package com.sequence.api.entity;

import com.sequence.api.base.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serial;
import java.util.UUID;

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
    @GenericGenerator(name = "uuid_v1_time_swap", strategy = "com.sequence.api.utils.UUIDV1WithTimeSwapGenerationStrategy")
    @GeneratedValue(generator = "uuid_v1_time_swap")
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name")
    private String name;

}