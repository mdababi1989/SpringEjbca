package ejbca.springejbca.model;


import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crldata")
@Getter
@ToString
public class CRL {
    @Id
    private String fingerprint;
    private String base64Crl;
    private String cAFingerprint;
    private int crlPartitionIndex;
    private int deltaCRLIndicator;
    private String issuerDN;
    private long nextUpdate;
    private String rowProtection;
    private int rowVersion;
    private long thisUpdate;
    
}
