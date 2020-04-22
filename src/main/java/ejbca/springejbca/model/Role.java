package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roledata")
@Getter
@ToString
public class Role {
    @Id
    private int id;

    private String nameSpace;
    private String rawData;
    private String roleName;
    private String rowProtection;
    private int rowVersion;

}
