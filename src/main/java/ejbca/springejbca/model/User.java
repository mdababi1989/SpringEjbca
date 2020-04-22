package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdata")
@Getter
@ToString
public class User {
    @Id
    private String username;

    private int cAId;
    private String cardNumber;
    private int certificateProfileId;
    private String clearPassword;
    private int endEntityProfileId;
    private int hardTokenIssuerId;
    private String keyStorePassword;
    private String passwordHash;
    private int rowVersion;
    private int status;
    private String subjectAltName;
    private String subjectDN;
    private String subjectEmail;
    private long timeCreated;
    private long timeModified;
    private int tokenType;
    private int type;
    private String extendedInformationData;
    private String rowProtection;
}
