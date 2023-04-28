package com.sequence.api.entity;

import com.sequence.api.base.AbstractEntity;
import com.sequence.api.enums.TriggerFormat;
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
@Table(name = "email")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Email extends AbstractEntity {

    @Serial
    private static final long serialVersionUID = -5429246653469897257L;

    @Id
    @GenericGenerator(name = "uuid_v1_time_swap", strategy = "com.sequence.api.utils.UUIDV1WithTimeSwapGenerationStrategy")
    @GeneratedValue(generator = "uuid_v1_time_swap")
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "email_name")
    private String emailName;

    @Column(name = "template_path")
    private String templatePath;

    @Column(name = "trigger_format")
    private TriggerFormat triggerFormat;

    @Column(name = "trigger_value")
    private Integer triggerValue;

}