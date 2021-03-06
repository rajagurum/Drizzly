package com.drizzly.springmvc.model;
// Generated 17 Oct, 2015 9:14:35 PM by Hibernate Tools 4.3.1


import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DrTrLoanDue generated by hbm2java
 */
@Entity
@Table(name = "DR_TR_LOAN_DUE")
public class DrTrLoanDue  implements java.io.Serializable {


     @Id
     @Column(name = "LP_ID")
     @GeneratedValue
     private Long lpId;
     @Column(name = "LP_AMOUNT_PAID")
     private BigInteger lpAmountPaid;
     @Column(name = "LP_DATE")
     private Date lpDate;
//     @OneToMany
//     @JoinColumn(name = "LP_LN_ID")
//     private Set drTrLoanDues = new HashSet(0);
     @ManyToOne
     @JoinColumn(name = "LP_EM_ID")
     private DrMaEmployee drMaEmployee;
     @ManyToOne
     @JoinColumn(name = "LP_LN_ID")
     private DrTrLoanDue drTrLoanDue;
     
    public DrTrLoanDue() {
    }

	
    public DrTrLoanDue(DrMaEmployee drMaEmployee, DrTrLoanDue drTrLoanDue, BigInteger lpAmountPaid, Date lpDate) {
        this.drMaEmployee = drMaEmployee;
        this.drTrLoanDue = drTrLoanDue;
        this.lpAmountPaid = lpAmountPaid;
        this.lpDate = lpDate;
    }
    public DrTrLoanDue(DrMaEmployee drMaEmployee, DrTrLoanDue drTrLoanDue, BigInteger lpAmountPaid, Date lpDate, Set drTrLoanDues) {
       this.drMaEmployee = drMaEmployee;
       this.drTrLoanDue = drTrLoanDue;
       this.lpAmountPaid = lpAmountPaid;
       this.lpDate = lpDate;
//       this.drTrLoanDues = drTrLoanDues;
    }
   
    public Long getLpId() {
        return this.lpId;
    }
    
    public void setLpId(Long lpId) {
        this.lpId = lpId;
    }
    public DrMaEmployee getDrMaEmployee() {
        return this.drMaEmployee;
    }
    
    public void setDrMaEmployee(DrMaEmployee drMaEmployee) {
        this.drMaEmployee = drMaEmployee;
    }
    public DrTrLoanDue getDrTrLoanDue() {
        return this.drTrLoanDue;
    }
    
    public void setDrTrLoanDue(DrTrLoanDue drTrLoanDue) {
        this.drTrLoanDue = drTrLoanDue;
    }
    public BigInteger getLpAmountPaid() {
        return this.lpAmountPaid;
    }
    
    public void setLpAmountPaid(BigInteger lpAmountPaid) {
        this.lpAmountPaid = lpAmountPaid;
    }
    public Date getLpDate() {
        return this.lpDate;
    }
    
    public void setLpDate(Date lpDate) {
        this.lpDate = lpDate;
    }
//    public Set getDrTrLoanDues() {
//        return this.drTrLoanDues;
//    }
//    
//    public void setDrTrLoanDues(Set drTrLoanDues) {
//        this.drTrLoanDues = drTrLoanDues;
//    }

    @Override
    public String toString() {
        return "DrTrLoanDue{" + "lpId=" + lpId + ", lpAmountPaid=" + lpAmountPaid + ", lpDate=" + lpDate + '}';
    }




}


