package tz.co.ejzoe.usermanament.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tz.co.ejzoe.usermanament.data.response.GeneralResponse;
import tz.co.ejzoe.usermanament.database.projectors.GenderInfo;
import tz.co.ejzoe.usermanament.service.lookupService.lookupInterface.LookUpInterface;

import java.util.List;

/**
 * @author Ernest Joseph Nzalawahe
 * @created 11/07/2024 - 11:06
 * @project user-manament
 */


@RestController
@RequestMapping("/api/v1.1")
@CrossOrigin
public class LookUpController {
    private  final LookUpInterface lookUp;

    public LookUpController(LookUpInterface lookUp) {
        this.lookUp = lookUp;
    }


    @GetMapping("/lookup/genders")
   public ResponseEntity<GeneralResponse<List<GenderInfo>>> getGenders(){
        GeneralResponse<List<GenderInfo>> response = lookUp.getGenders();
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
}
