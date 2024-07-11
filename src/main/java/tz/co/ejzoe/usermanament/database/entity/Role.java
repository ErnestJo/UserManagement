package tz.co.ejzoe.usermanament.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "roles")
public class Role {
    @Id
    @Column (name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Size (max = 50)
    @NotNull
    @Column (name = "name", nullable = false, length = 50)
    private String name;

    @Size (max = 100)
    @Column (name = "description", length = 100)
    private String description;

}