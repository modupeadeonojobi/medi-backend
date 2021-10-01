package com.example.medis.medis.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Diagnosis {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long accuracy;

    private Long id;

    private String icd;

    private String icdName;

    private String name;

    private String profName;

    private Long ranking;

    private boolean validityResponse;
}

