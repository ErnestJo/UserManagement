package tz.co.ejzoe.usermanament.database.projectors;

import tz.co.ejzoe.usermanament.database.entity.Gender;

/**
 * Projection for {@link Gender}
 */
public interface GenderInfo {
    Long getId();

    String getGenderValue();

}