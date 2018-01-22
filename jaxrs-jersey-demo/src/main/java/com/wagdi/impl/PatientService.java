package com.wagdi.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wagdi.model.Patient;

import java.util.*;


@Path("/patientservice")
public class PatientService  {

    static Long currentId= 123L;
    static Map<Long, Patient> patients = new HashMap<Long, Patient>();

    public PatientService() {
        init();
    }

    void init(){
        Patient patient= new Patient();
        patient.setId(currentId);
        patient.setName("Ahmed");

        patients.put(currentId,patient);
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/patients")
    public List<Patient> getPatients() {
        Collection<Patient> result = patients.values();
        List<Patient> resultArrayList = new ArrayList<Patient>(result);
        System.out.println(resultArrayList.size());
        return resultArrayList;
    }
    @GET
    @Path("/patients/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getPatient(@PathParam(value="id")Long id) {
        return patients.get(id);
    }
    @Path("/patients")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPatient(Patient patient) {
        patient.setId(currentId++);
        
        System.out.println("Current ID : "+currentId);
        patients.put(patient.getId(),patient);
        return Response.ok(patient).build();
    }
    @Path("/patients")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_XML)
    public Response updatePatient(Patient patient) {
        Patient currPatient = patients.get(patient.getId());
        Response response;
        if(currPatient!=null){
            patients.put(patient.getId(),patient);
            response = Response.ok(patient).build();
        }else{
            response= Response.notModified().build();
        }
        return response;
    }
    @Path("/patients/{id}")
    @DELETE
    public Response deletePatient(Long id) {
        Patient currPatient = patients.get(id);
        Response response;
        if(currPatient!=null){
            patients.remove(id);
            response = Response.ok().build();
        }else{
            response= Response.notModified().build();
        }
        return response;
    }
}
