package com.clinicalmaster.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="marital_status_master")
public class maritalStatus {

    @Id
    @Column(name="msm_id")
    private int Id;
    @Column(name="msm_marital_status")
    private String statusName;
    @Column(name="msm_status")
    private char status;

}
