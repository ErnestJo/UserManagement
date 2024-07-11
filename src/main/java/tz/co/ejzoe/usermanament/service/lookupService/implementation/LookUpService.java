package tz.co.ejzoe.usermanament.service.lookupService.implementation;

import org.springframework.stereotype.Service;
import tz.co.ejzoe.usermanament.data.response.GeneralResponse;
import tz.co.ejzoe.usermanament.database.DatabaseRepository;
import tz.co.ejzoe.usermanament.database.projectors.GenderInfo;
import tz.co.ejzoe.usermanament.service.lookupService.lookupInterface.LookUpInterface;

import java.util.List;

/**
 * @author Ernest Joseph Nzalawahe
 * @created 11/07/2024 - 10:47
 * @project user-manament
 */

@Service
public class LookUpService implements LookUpInterface {
    private  final DatabaseRepository databaseRepository;

    public LookUpService(DatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }


    @Override
    public GeneralResponse<List<GenderInfo>> getGenders() {
        try {
            List<GenderInfo> genders = databaseRepository.getGenderRepository().findAllGendersNative();
            return processBatchResponse(200, "Success", genders);
        } catch (Exception e) {
            return processBatchResponse(500, "Internal Server Error", null);
        }
    }

    private <T> GeneralResponse<T> processBatchResponse(int status, String message, T body) {
        GeneralResponse<T> responseWrapper = new GeneralResponse<>();
        responseWrapper.setStatusCode(status);
        responseWrapper.setStatusDescription(message);
        responseWrapper.setData(body);
        return responseWrapper;
    }
}
