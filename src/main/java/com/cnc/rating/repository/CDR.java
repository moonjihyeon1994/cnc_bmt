package com.cnc.rating.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CDR {
    @Id
    private String node_no;
    private String service_mgmt_no;
    private String usg_start_date;
    private String usg_start_time;
    private int usg_type;
    private String usg_seq;
    private int time_flag;
    private String extrnid;
    private String extrnid_type;
    private String prod_id;
    private int corridor_id;
    private String win_svc;
    private String charge_code;
    private String service_feature;
    private String filename;
    private int filerow;
    private String called_no;
    private String dialed_no;
    private int day_type_cd;
    private String service_term_date;
    private String service_term_time;
    private int total_duration;
    private int total_volume;
    private int total_free_volume;
    private int total_usg_nou;
    private int total_free_usg_nou;
    private String q_code;
    private int qos;
    private String service_type_cd;
    private int trans_count;
    private String charge_or_not;
    private String pps_card_type;
    private int total_used_charge;
    private int total_rated_charge;
    private String carrier;
    private String org_net_info;
    private String npa;
    private String msc_switch_id;
    private String switch_id;
    private String cell_id;
    private String call_status;
    private String cp_code;
    private String isp_code;
    private String ip_code;
    private int msg_length;
    private int billcycle_id;
    private String extra_rating_fac;
    private String deduct_code1;
    private int deducted_charge1;
    private int deduct_bal_before1;
    private int deduct_bal_after1;
    private String sub_event_cd1;
    private String deduct_code2;
    private int deducted_charge2;
    private int deduct_bal_before2;
    private int deduct_bal_after2;
    private String sub_event_cd2;
    private String deduct_code3;
    private int deducted_charge3;
    private int deduct_bal_before3;
    private int deduct_bal_after3;
    private String sub_event_cd3;
    private String deduct_code4;
    private int deducted_charge4;
    private int deduct_bal_before4;
    private int deduct_bal_after4;
    private String sub_event_cd4;
    private String deduct_code5;
    private int deducted_charge5;
    private int deduct_bal_before5;
    private int deduct_bal_after5;
    private String sub_event_cd5;
    private String disc_code1;
    private int disc_charge1;
    private String disc_code2;
    private int disc_charge2;
    private String disc_code3;
    private int disc_charge3;
    private String limit_code;
    private int limit_applied_charge;
    private int limit_bal_before;
    private int limit_bal_after;
    private String limit_applied_type;
    private String ag_service_type;
    private int ag_used_nou;
    private int ag_free_used_nou;
    private int ag_used_charge;
    private int ag_free_used_charge;
    private int cdr_duration;
    private String ch_service_mgmt_no;
    private String ch_svc_iccid;
    private String opmd_flag;
    private String dbm_prod_id;
    private String zone_call_info;
    private String ocall_toll_id;
    private String prod_seq;
    private String processed_date;
    private String processed_time;
    private String charging_id;
    private String ppe;
    private String svc_qos_ul;
    private String svc_qos_dl;
    private String los_seq_no;
    private String session_status;
    private String ntw_slice_id;
    private String svc_grp;
}
