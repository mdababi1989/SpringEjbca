package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "CertificateData")
@Getter
public class Certificate {
    @Id
    private String fingerprint;

    private String cAFingerprint;

    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="certificateProfileId", referencedColumnName = "id")
    private CertificateProfile certificateProfile;

    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="endEntityProfileId", referencedColumnName = "id")
    private EndEntityProfile endEntityProfile;

    private int crlPartitionIndex;
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
