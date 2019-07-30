/*
 *                           CONFIDENTIALITY DISCLAIMER AND AGREEMENT
 * 
 * ALL INFORMATION PERTAINING TO AXIONENT (PVT) LTD. ARE COPYRIGHT MATERIAL OF
 * AXIONENT (PVT) LTD.  ALL RIGHTS RESERVED COPYING OR REPRODUCTION OF THE DATA & INFORMATION,
 * SOFTWARE ARCHITECTURES, DESIGNS, UTILITIES, DOCUMENTATION AND SOURCE CODE TO ANY OTHER SERVER OR
 * LOCATION FOR FURTHER REPRODUCTION OR REDISTRIBUTION IS EXPRESSLY PROHIBITED, UNLESS SUCH
 * REPRODUCTION OR REDISTRIBUTION IS EXPRESSLY PERMITTED.
 * 
 * AS A CONDITION OF YOUR WORK WITH THE SOURCE CODE AND RELATED EQUIPMENT AND UTILITIES, YOU WILL
 * NOT USE THESE MATERIAL PERSONALLY OR BY JOINING A COMPETITOR OR PARTNER IN THE SAME PRODUCT AND
 * SOFTWARE DOMAIN FOR ANY PURPOSE THAT IS UNLAWFUL OR PROHIBITED BY THESE TERMS, CONDITIONS, AND
 * NOTICES. YOU MAY NOT USE THE SOURCE CODE IN ANY MANNER THAT COULD DAMAGE, DISABLE, OVERBURDEN, OR
 * IMPAIR ANY AXIONENT (PVT) LTD BUSINESS INCLUDING SERVERS, OR THE NETWORK(S) CONNECTED TO ANY
 * AXIONENT (PVT) LTD SERVERS, OR INTERFERE WITH ANY OTHER PARTY'S APIS. YOU MAY NOT ATTEMPT TO
 * GAIN UNAUTHORIZED ACCESS TO ANY SOURCE CODE, OTHER ACCOUNTS, COMPUTER SYSTEMS OR NETWORKS
 * CONNECTED TO ANY AXIONENT (PVT) LTD SERVER OR TO ANY OF THE SERVICES, THROUGH HACKING,
 * PASSWORD MINING OR ANY OTHER MEANS. YOU MAY NOT OBTAIN OR ATTEMPT TO OBTAIN ANY MATERIALS OR
 * INFORMATION THROUGH ANY MEANS NOT INTENTIONALLY MADE AVAILABLE THROUGH THE SERVICES. YOU MAY NOT
 * DIRECTLY ON INDIRECTLY CONTACT ANY OF THE EXISTING CLIENTS OR PARTNERS OF AXIONENT (PVT) LTD.
 * PERTAINING TO THE PRODUCT SECTOR AXIONENT (PVT) LTD. SPECIALIZES IN.
 * 
 * EQUIPMENT, SOFTWARE ARCHITECTURES, DESIGNS, UTILITIES, DOCUMENTATION AND SOURCE CODE THAT BELONGS
 * TO AXIONENT (PVT) LTD IS GOVERNED AND PROTECTED BY THE INTELLECTUAL PROPERTY ACT NO 36 OF 2003
 * OF THE DEMOCRATIC SOCIALIST REPUBLIC OF SRI LANKA. ANY ILLEGAL USE IS SUBJECT TO LEGAL PROSECUTION.
 */
package org.chrishale.ttbu.manatee.entity.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.chrishale.ttbu.manatee.entity.Mentee;

/**
 *
 * @author Chrismal Panditharathne <chrismal@innovware.com>
 */
@Stateless
@Path("org.chrishale.ttbu.manatee.entity.mentee")
public class MenteeFacadeREST extends AbstractFacade<Mentee> {

    @PersistenceContext(unitName = "org.chrishale.ttbu_manatee_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public MenteeFacadeREST() {
        super(Mentee.class);
        System.out.println("MenteeFacadeREST object created.");
        this.em = JPAUtility.getEntityManager();
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Mentee entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, Mentee entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Mentee find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Mentee> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Mentee> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
