package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CertificateData")
@Getter
@ToString
public class Certificate {
    @Id
    private String fingerprint;
    private String cAFingerprint;
    private int certificateProfileId;
    private int crlPartitionIndex;
    private int endEntityProfileId;
    private long expireDate;
    private String issuerDN;
    private long notBefore;
    private long revocationDate;
    private int revocationReason;
    private int rowVersion;
    private String serialNumber;
    private int status;
    private String subjectAltName;
    private String subjectDN;
    private String subjectKeyId;
    private String tag;
    private int type;
    private long updateTime;
    private String username;
    private String base64Cert;
    private String certificateRequest;
    private String rowProtection;
}
