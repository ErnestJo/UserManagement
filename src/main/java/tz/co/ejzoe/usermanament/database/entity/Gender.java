package tz.co.ejzoe.usermanament.database.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table (name = "gender")
public class Gender {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @Size (max = 20)
    @NotNull
    @Column (name = "gender_value", nullable = false, length = 20)
    private String genderValue;

    @OneToMany (mappedBy = "gender")
    private Set<UserProfile> userProfiles = new LinkedHashSet<>();

}