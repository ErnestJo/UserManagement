package tz.co.ejzoe.usermanament.database.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table (name = "audit_logs")
public class AuditLog {
    @Id
    @Column (name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @NotNull
    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @OnDelete (action = OnDeleteAction.CASCADE)
    @JoinColumn (name = "user_id", nullable = false)
    private User user;

    @NotNull
    @Lob
    @Column (name = "action", nullable = false)
    private String action;

    @ColumnDefault ("CURRENT_TIMESTAMP")
    @Column (name = "timestamp")
    private Instant timestamp;

}