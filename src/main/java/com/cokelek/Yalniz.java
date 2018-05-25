
package com.cokelek;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

@Path("/terzi")
public class Yalniz {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/kayitcek/{karar}")
    public String getKayit(@PathParam("karar") PathSegment karar){
    
        Map<String,String> bookNameMap = new HashMap<>();
                           bookNameMap.put("bookName", "Kuyucuklu Yusuf");
                           bookNameMap.put("bookName", "1984");
                           
        Map<String,String> authorNameMap = new HashMap<>();
                          authorNameMap.put("authorName", "Eda YERGOK");
                          authorNameMap.put("authorName", "Sercan Beyoglu");
                          
          //Parametre olarak gelenler 
          MultivaluedMap<String,String> parameters = karar.getMatrixParameters();
              String  gelenVeri = parameters.getFirst("bookName") + " - "+parameters.getFirst("authorName");
              
                           return gelenVeri;
        
    }
    
    @GET
    @Path("/query")
    public String getBook(@DefaultValue("Sercan")@QueryParam("from") String from, 
                          @DefaultValue("JAVA EE")@QueryParam("to") String to ,
                          @DefaultValue("489") @QueryParam("orderBy") int orderBy){
        
       return " - from : "+from + "- to :"+to + " - orderBy : "+orderBy; 
        
    }
    
    @GET
    @Path("/get")
    public Response addUser(@HeaderParam("user-agent") String useragent ,
                            @HeaderParam("host") String hostim){
        
        return Response.status(200).entity("Veri : "+useragent + "-- Host : "+hostim).build();
        }
}
