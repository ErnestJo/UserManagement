package tz.co.ejzoe.usermanament.database;

import org.springframework.stereotype.Repository;
import tz.co.ejzoe.usermanament.database.repository.GenderRepository;

/**
 * @author Ernest Joseph Nzalawahe
 * @created 10/07/2024 - 16:41
 * @project user-management
 */
@Repository
public class DatabaseRepository {

    private final GenderRepository genderRepository;

    public DatabaseRepository(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    public GenderRepository getGenderRepository() {
        return genderRepository;
    }
}
