package tz.co.ejzoe.usermanament.service.lookupService.lookupInterface;
import tz.co.ejzoe.usermanament.data.response.GeneralResponse;
import tz.co.ejzoe.usermanament.database.projectors.GenderInfo;
import java.util.List;

/**
 * @author Ernest Joseph Nzalawahe
 * @created 10/07/2024 - 16:36
 * @project user-manament
 */
public interface LookUpInterface {
    GeneralResponse<List<GenderInfo>> getGenders();
}
