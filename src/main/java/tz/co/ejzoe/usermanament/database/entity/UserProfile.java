package tz.co.ejzoe.usermanament.database.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table (name = "user_profile")
public class UserProfile {
    @Id
    @Column (name = "id", columnDefinition = "int UNSIGNED not null")
    private Long id;

    @NotNull
    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @OnDelete (action = OnDeleteAction.CASCADE)
    @JoinColumn (name = "user_id", nullable = false)
    private User user;

    @Size (max = 50)
    @NotNull
    @Column (name = "first_name", nullable = false, length = 50)
    private String firstname;

    @Size (max = 50)
    @Column (name = "middle_name", length = 50)
    private String middleName;

    @Size (max = 50)
    @NotNull
    @Column (name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Size (max = 15)
    @NotNull
    @Column (name = "phone_number", nullable = false, length = 15)
    private String phoneNumber;

    @Lob
    @Column (name = "address")
    private String address;

    @Size (max = 20)
    @NotNull
    @Column (name = "nida_number", nullable = false, length = 20)
    private String nidaNumber;

    @NotNull
    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name = "gender_id", nullable = false)
    private Gender gender;

}