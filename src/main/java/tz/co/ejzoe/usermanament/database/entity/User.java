package tz.co.ejzoe.usermanament.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table (name = "user")
public class User {
    @Id
    @Column (name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Size (max = 50)
    @NotNull
    @Column (name = "username", nullable = false, length = 50)
    private String username;

    @Size (max = 255)
    @NotNull
    @Column (name = "password", nullable = false)
    private String password;

    @Size (max = 100)
    @NotNull
    @Column (name = "email", nullable = false, length = 100)
    private String email;

    @ColumnDefault ("CURRENT_TIMESTAMP")
    @Column (name = "created_at")
    private Instant createdAt;

    @ColumnDefault ("CURRENT_TIMESTAMP")
    @Column (name = "updated_at")
    private Instant updatedAt;

    @Size (max = 255)
    @Column (name = "login_session")
    private String loginSession;

    @ColumnDefault ("1")
    @Column (name = "active")
    private Boolean active;

    @ColumnDefault ("0")
    @Column (name = "isDefaultPassword")
    private Boolean isDefaultPassword;

}