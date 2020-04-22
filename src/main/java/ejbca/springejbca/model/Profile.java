package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profiledata")
@Getter
@ToString
public class Profile {
    @Id
    private int id;

    private String profileName;
    private String profileType;
    private String rawData;
    private String rowProtection;
    private int rowVersion;

}
