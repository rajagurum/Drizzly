package com.drizzly.springmvc.model;
// Generated 17 Oct, 2015 9:14:35 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

/**
 * DrMaStudent generated by hbm2java
 */
@Entity
@Table(name = "DR_MA_STUDENT")
public class StudentFees implements IStudentFees {

    @Id
    @Column(name = "ST_ID")
    @GeneratedValue
    private Long stId;
    @Column(name = "ST_CT_ID")
    private Long stCtId;
    @Column(name = "ST_NAME")
    private String stName;
    @Column(name = "ST_JOINED_DATE")
    private Date stJoinedDate;
    @Column(name = "ST_FEES_MODE")
    private String stFeesMode;
    @Column(name = "ST_FATHER_NAME")
    private String stFatherName;
    @Column(name = "ST_MOTHER_NAME")
    private String stMotherName;
    @Column(name = "ST_RELIEVED_DATE")
    private Date stRelievedDate;
    @Column(name = "ST_ADDRESS")
    private String stAddress;
    @Column(name = "ST_CITY")
    private String stCity = "Chennai";
    @Column(name = "ST_STATE")
    private String stState = "Tamilnadu";
    @Column(name = "ST_PINCODE")
    private String stPincode = "600042";
    @Column(name = "ST_COUNTRY")
    private String stCountry = "India";
    @Column(name = "ST_MOBILE1")
    private String stMobile1;
    @Column(name = "ST_MOBILE2")
    private String stMobile2;
    @Column(name = "ST_EMAIL1")
    private String stEmail1;
//    @OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "drMaStudent")
//    private Set drTrFeesDues = new HashSet(0);

    public StudentFees() {
    }

    public StudentFees(Long stCtId, String stName, Date stJoinedDate, String stFeesMode, String stFatherName, String stMotherName, String stAddress, String stCity, String stState, String stPincode, String stCountry, String stMobile1) {
        this.stCtId = stCtId;
        this.stName = stName;
        this.stJoinedDate = stJoinedDate;
        this.stFeesMode = stFeesMode;
        this.stFatherName = stFatherName;
        this.stMotherName = stMotherName;
        this.stAddress = stAddress;
        this.stCity = stCity;
        this.stState = stState;
        this.stPincode = stPincode;
        this.stCountry = stCountry;
        this.stMobile1 = stMobile1;
    }

    public StudentFees(Long stCtId, String stName, Date stJoinedDate, String stFeesMode, String stFatherName, String stMotherName, Date stRelievedDate, String stAddress, String stCity, String stState, String stPincode, String stCountry, String stMobile1, String stMobile2, String stEmail1, Set drTrFeesDues) {
        this.stCtId = stCtId;
        this.stName = stName;
        this.stJoinedDate = stJoinedDate;
        this.stFeesMode = stFeesMode;
        this.stFatherName = stFatherName;
        this.stMotherName = stMotherName;
        this.stRelievedDate = stRelievedDate;
        this.stAddress = stAddress;
        this.stCity = stCity;
        this.stState = stState;
        this.stPincode = stPincode;
        this.stCountry = stCountry;
        this.stMobile1 = stMobile1;
        this.stMobile2 = stMobile2;
        this.stEmail1 = stEmail1;
       // this.drTrFeesDues = drTrFeesDues;
    }

    @Override
    public Long getStId() {
        return this.stId;
    }

    public void setStId(Long stId) {
        this.stId = stId;
    }

    @Override
    public Long getStCtId() {
        return this.stCtId;
    }

    public void setStCtId(Long stCtId) {
        this.stCtId = stCtId;
    }

    @Override
    public String getStName() {
        return this.stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    @Override
    public Date getStJoinedDate() {
        return this.stJoinedDate;
    }

    public void setStJoinedDate(Date stJoinedDate) {
        this.stJoinedDate = stJoinedDate;
    }

    @Override
    public String getStFeesMode() {
        return this.stFeesMode;
    }

    public void setStFeesMode(String stFeesMode) {
        this.stFeesMode = stFeesMode;
    }

    @Override
    public String getStFatherName() {
        return this.stFatherName;
    }

    public void setStFatherName(String stFatherName) {
        this.stFatherName = stFatherName;
    }

    @Override
    public String getStMotherName() {
        return this.stMotherName;
    }

    public void setStMotherName(String stMotherName) {
        this.stMotherName = stMotherName;
    }

    @Override
    public Date getStRelievedDate() {
        return this.stRelievedDate;
    }

    public void setStRelievedDate(Date stRelievedDate) {
        this.stRelievedDate = stRelievedDate;
    }

    @Override
    public String getStAddress() {
        return this.stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    @Override
    public String getStCity() {
        return this.stCity;
    }

    public void setStCity(String stCity) {
        this.stCity = stCity;
    }

    @Override
    public String getStState() {
        return this.stState;
    }

    public void setStState(String stState) {
        this.stState = stState;
    }

    @Override
    public String getStPincode() {
        return this.stPincode;
    }

    public void setStPincode(String stPincode) {
        this.stPincode = stPincode;
    }

    @Override
    public String getStCountry() {
        return this.stCountry;
    }

    public void setStCountry(String stCountry) {
        this.stCountry = stCountry;
    }

    @Override
    public String getStMobile1() {
        return this.stMobile1;
    }

    public void setStMobile1(String stMobile1) {
        this.stMobile1 = stMobile1;
    }

    @Override
    public String getStMobile2() {
        return this.stMobile2;
    }

    public void setStMobile2(String stMobile2) {
        this.stMobile2 = stMobile2;
    }

    @Override
    public String getStEmail1() {
        return this.stEmail1;
    }

    public void setStEmail1(String stEmail1) {
        this.stEmail1 = stEmail1;
    }
//    @Override 
//    public Set getDrTrFeesDues() {
//        return this.drTrFeesDues;
//    }
//    
//    public void setDrTrFeesDues(Set drTrFeesDues) {
//        this.drTrFeesDues = drTrFeesDues;
//    }
    public String toString() {
        return "DrMaStudent{" + "stId=" + stId + ", stName=" + stName + ", stJoinedDate=" + stJoinedDate + ", stFeesMode=" + stFeesMode + ", stFatherName=" + stFatherName + ", stMotherName=" + stMotherName + ", stRelievedDate=" + stRelievedDate + ", stAddress=" + stAddress + ", stCity=" + stCity + ", stState=" + stState + ", stPincode=" + stPincode + ", stCountry=" + stCountry + ", stMobile1=" + stMobile1 + ", stMobile2=" + stMobile2 + ", stEmail1=" + stEmail1 + '}';
    }

}
