package tz.co.ejzoe.usermanament.database.projectors;

/**
 * Projection for {@link tz.co.ejzoe.usermanament.database.entity.UserProfile}
 */
public interface UserProfileInfo {
    Long getId();

    String getFirstname();

    String getMiddleName();

    String getLastName();

    String getPhoneNumber();

    String getAddress();

    String getNidaNumber();
}