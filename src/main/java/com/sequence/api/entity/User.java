package com.sequence.api.entity;

import com.sequence.api.base.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serial;
import java.util.UUID;

/**
 * @author Nawaz
 */
@Getter
@Setter
@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends AbstractEntity {

    @Serial
    private static final long serialVersionUID = -664494846249432284L;

    @Id
    @GenericGenerator(name = "uuid_v1_time_swap", strategy = "com.sequence.api.utils.UUIDV1WithTimeSwapGenerationStrategy")
    @GeneratedValue(generator = "uuid_v1_time_swap")
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "job_profile")
    private String jobProfile;

    @Column(name = "email_status")
    private String emailStatus;

}