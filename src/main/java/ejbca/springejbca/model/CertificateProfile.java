package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "CertificateProfileData")
@Getter
public class CertificateProfile {
    @Id
    private int id;

    @OneToMany(mappedBy="certificateProfile", cascade= CascadeType.ALL)
    private Collection<Certificate> certificates ;

    private String certificateProfileName;
    private byte[] data;
    private String rowProtection;
    private int rowVersion;

}
