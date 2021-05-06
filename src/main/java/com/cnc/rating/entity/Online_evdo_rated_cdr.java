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
public class Online_evdo_rated_cdr {
    @Id
    private String service_mgmt_no;
    private long usg_start_date;
    private long usg_start_time;
    private String total_duration;
    private String total_usg_nou;
    private String total_used_charge;
    private String total_rated_charge;
    private String deduct_code1;
    private String deduct_code2;
    private String deduct_code3;
    private String deduct_code4;
    private String deduct_code5;
    private String disc_code1;
    private String disc_code2;
    private String disc_code3;
    private String msc_switch_id;
    private String cell_id;
    private String sect_cd;
    private String usg_type;
    private String ag_service_type_name;
    private String usg_seq;
    private String CH_SVC_ICCID;
    private String ocall_toll_id;
    private String processed_date;
    private String processed_time;
    private String org_net_info;
    private String network_type;
    private String opmd_flag;
    private String dialed_no;
    private String called_no;
}
