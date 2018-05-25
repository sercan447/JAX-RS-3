
package com.pojos;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Personeller")
//@XmlType(propOrder = {"employeid","employeName","employeSurname","tarih","telefon"})
@XmlType(propOrder = {"employeid","employeName","employeSurname","tarih"})
@XmlAccessorType(XmlAccessType.NONE)
public class Employe {
    
    @XmlAttribute(name="emp-id")
    private int employeid;

    @XmlElement(name="name")
    private String employeName;
    
    @XmlElement(name="surname")
    private String employeSurname;
    
    @XmlElement(name="Tarih")
    private Date tarih;
    
   // @XmlElementWrapper(name="telefonlar")
    // @XmlElement(name="telefon")
    //private List<String> telefon;

    public Employe(){
    
    }
    
    public Employe(int employeid, String employeName, String employeSurname, Date tarih/*, List<String> telefon*/) {
        this.employeid = employeid;
        this.employeName = employeName;
        this.employeSurname = employeSurname;
        this.tarih = tarih;
      //  this.telefon = telefon;
    }
    


    public int getEmployeid() {
        return employeid;
    }

    public void setEmployeid(int employeid) {
        this.employeid = employeid;
    }

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public String getEmployeSurname() {
        return employeSurname;
    }

    public void setEmployeSurname(String employeSurname) {
        this.employeSurname = employeSurname;
    }
    
        public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

   /* public List<String> getTelefon() {
        return telefon;
    }

    public void setTelefon(List<String> telefon) {
        this.telefon = telefon;
    }
*/
    
    
    
}
