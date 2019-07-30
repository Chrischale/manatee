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
package org.chrishale.ttbu.manatee.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chrismal Panditharathne <chrismal@innovware.com>
 */
@Entity
@XmlRootElement
public class Mentor extends Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "mantorid", unique = true)
    @NotNull
    private String mantorid;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mantorid != null ? mantorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mentor)) {
            return false;
        }
        Mentor other = (Mentor) object;
        if ((this.mantorid == null && other.mantorid != null) || (this.mantorid != null && !this.mantorid.equals(other.mantorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.chrishale.ttbu.manatee.entity.Mentor[ id=" + mantorid + " ]";
    }
    
}
