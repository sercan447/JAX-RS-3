
package com.cokelek;

import com.pojos.Employe;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/servisler")
public class Servis {
    
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/say")
    public String sayilar(){
        return "<B>489</B>";
    }
    
    @GET
    @Produces(MediaType.TEXT_XML)
    @Path("/xmlverileri")
    public Employe veris(){
    
        Employe emp = new Employe();
                emp.setEmployeid(48);     
                emp.setEmployeName("sercan");
                emp.setEmployeSurname("JAVA EE");
                emp.setTarih(new Date());
                                
                List<String> tel = new ArrayList<String>();
                             tel.add("4444444");
                             tel.add("333333");
                             tel.add("88888888");
                             
                       //  emp.setTelefon(tel);
                return emp;
    }//METHOD
    
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/listeXML")
    public List<Employe> listeVeri(){
    
        List<Employe> listex = new ArrayList<Employe>();
        List<String> telefon = new ArrayList<String>();
                     telefon.add("111111111111");
                     telefon.add("222222222222");
                     telefon.add("3333333333333");
        
       Employe emp1 = new Employe(5,"Tınaztepe","Semih",new Date()/*,telefon*/);
       Employe emp2 = new Employe(6,"Evcil","Soner",new Date()/*,telefon*/);
       Employe emp3 = new Employe(7,"Duman","Ramazan",new Date()/*,telefon*/);
       
       listex.add(emp1);
       listex.add(emp2);
       listex.add(emp3);
        
        return listex;
     }
    
    
}
