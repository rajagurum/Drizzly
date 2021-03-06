package com.drizzly.springmvc.model;
// Generated 17 Oct, 2015 9:14:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DrMaCategory generated by hbm2java
 */
@Entity
@Table(name = "DR_MA_CATEGORY")
public class DrMaCategory  implements java.io.Serializable, IStudentCategory {


    @Id
    @Column(name = "CT_ID")
    @GeneratedValue
    private Long ctId;
    @Column(name = "CT_NAME")
    private String ctName;
//    @OneToMany
//    @JoinColumn(name = "FE_CT_ID")
//    private Set drMaFeeses = new HashSet(0);
//    @OneToMany
//    @JoinColumn(name = "ST_CT_ID")    
//    private Set drMaStudents = new HashSet(0);

    public DrMaCategory() {
    }

	
    public DrMaCategory(String ctName) {
        this.ctName = ctName;
    }
//    public DrMaCategory(String ctName, Set drMaFeeses, Set drMaStudents) {
//       this.ctName = ctName;
////       this.drMaFeeses = drMaFeeses;
////       this.drMaStudents = drMaStudents;
//    }
   
    @Override
    public Long getCtId() {
        return this.ctId;
    }
    
    public void setCtId(Long ctId) {
        this.ctId = ctId;
    }
    @Override
    public String getCtName() {
        return this.ctName;
    }
    
    public void setCtName(String ctName) {
        this.ctName = ctName;
    }
//    public Set getDrMaFeeses() {
//        return this.drMaFeeses;
//    }
//    
//    public void setDrMaFeeses(Set drMaFeeses) {
//        this.drMaFeeses = drMaFeeses;
//    }
//    public Set getDrMaStudents() {
//        return this.drMaStudents;
//    }
//    
//    public void setDrMaStudents(Set drMaStudents) {
//        this.drMaStudents = drMaStudents;
//    }

    @Override
    public String toString() {
        return "DrMaCategory{" + "ctId=" + ctId + ", ctName=" + ctName + '}';
    }
    
    
}


