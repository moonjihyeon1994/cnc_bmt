package com.cnc.rating.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class UiMinorCode {
    @Id
    private String major_id;
    private String code_id;
    private String code_name;
    private String code_desc;
    private String code_eng_desc;
    private String upper_major_id;
    private String upper_code_id;
    private int code_order;
    private String user_yn;
    private String reg_id;
    private String reg_date;
    private String mod_id;
    private String mod_date;
}
