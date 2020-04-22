package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CertificateProfileData")
@Getter
@ToString
public class CertificateProfile {
    @Id
    private int id;

    private String certificateProfileName;
    private byte[] data;
    private String rowProtection;
    private int rowVersion;

}
