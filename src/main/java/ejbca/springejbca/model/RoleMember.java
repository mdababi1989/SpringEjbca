package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rolememberdata")
@Getter
@ToString
public class RoleMember {
    @Id
    private int primaryKey;

    private String description;

    private int roleId;
    private int rowVersion;
    private int tokenIssuerId;
    private int tokenMatchKey;
    private int tokenMatchOperator;
    private String tokenMatchValue;
    private String tokenType;
    private String rowProtection;
    
}
