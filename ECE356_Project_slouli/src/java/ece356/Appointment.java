/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ece356;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
        
/**
 *
 * @author slouli
 */
public class Appointment {
    private String patient_id;
    private String doctor_id;
    private String appt_start;
    private String appt_end;
    
    private String status;
    private String proc;
    
    
    public Appointment(String patient_id, String doctor_id, Date start, Date end,
            String status, String proc) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String appt_start = sdf.format(start);
        String appt_end = sdf.format(end);
        
        this.patient_id = patient_id;
        this.doctor_id = doctor_id;
        this.appt_start = appt_start;
        this.appt_end = appt_end;
        this.status = status;
        this.proc = proc;
    }
    
    public String getPatientId() {
        return this.patient_id;
    }
    
    public void setPatientId(String patient_id) {
        this.patient_id = patient_id;
    }
    
    public String getDoctorId() {
        return this.doctor_id;
    }
    
    public void setDoctorId(String doctor_id) {
        this.doctor_id = doctor_id;
    }
    
    public String getApptStart() {
        return this.appt_start;
    }
    
    public String getApptEnd() {
        return this.appt_end;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status= status;
    }
    
    public String getProc() {
        return this.proc;
    }
    
    public void setProc(String proc) {
        this.proc = proc;
    }
}
