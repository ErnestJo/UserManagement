package tz.co.ejzoe.usermanament.database.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tz.co.ejzoe.usermanament.database.entity.Gender;
import tz.co.ejzoe.usermanament.database.projectors.GenderInfo;

import java.util.List;

/**
 * @author Ernest Joseph Nzalawahe
 * @created 10/07/2024 - 16:40
 * @project user-management
 */

@Repository
public interface GenderRepository extends CrudRepository<Gender, Long> {

    @Query(value = "SELECT id, gender_value FROM gender", nativeQuery = true)
    List<GenderInfo> findAllGendersNative();
}
