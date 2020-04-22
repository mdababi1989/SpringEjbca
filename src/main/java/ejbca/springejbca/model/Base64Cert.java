package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name  = "Base64CertData", schema = "ejbca")
@Getter
@ToString
public class Base64Cert {
    @Id
    private String fingerprint;
    private String base64Cert;
    private String certificateRequest;
    private String rowProtection;
    private int rowVersion;



}

