package com.example.medis.medis.controller;


import com.example.medis.medis.model.Diagnosis;
import com.example.medis.medis.repository.DiagnosisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class DiagnosisController {

    @Autowired
    DiagnosisRepo diagnosisRepo;

@Transactional
    @PostMapping("/diagnosis")
    public ResponseEntity<?> saveDiagnosis(@RequestBody Diagnosis diagnosis) {
        Long id = diagnosis.getId();
        String icd = diagnosis.getIcd();
        Long accuracy = diagnosis.getAccuracy();
        String icdName = diagnosis.getIcdName();
        String name = diagnosis.getName();
        String profName = diagnosis.getProfName();
        Long ranking = diagnosis.getRanking();


        if (id == null || icd == null || accuracy == null || icdName == null || name == null ||
                profName == null || ranking == null ) {
            return new ResponseEntity<>("Field cannot be empty ", HttpStatus.BAD_REQUEST);
        }
        else {
             diagnosisRepo.save(diagnosis);
            System.out.println(diagnosis.toString() + "lkdjkadjkdkljkjkjkjkh");
            return new ResponseEntity<>("Record save successfully", HttpStatus.OK);
        }

    }
}
