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
@Table(name = "transaction")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction extends AbstractEntity {

    @Serial
    private static final long serialVersionUID = -5054891184588101635L;

    @Id
    @GenericGenerator(name = "uuid_v1_time_swap", strategy = "com.sequence.api.utils.UUIDV1WithTimeSwapGenerationStrategy")
    @GeneratedValue(generator = "uuid_v1_time_swap")
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Email email;

    @Column(name = "is_read")
    private Boolean isRead;

    @Column(name = "is_reply")
    private Boolean isReply;

}