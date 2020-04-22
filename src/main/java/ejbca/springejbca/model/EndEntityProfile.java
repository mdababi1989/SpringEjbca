package ejbca.springejbca.model;


import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endentityprofiledata")
@Getter
public class EndEntityProfile {
    @Id
    private int id;

    private byte[] data;
    private String profileName;
    private String rowProtection;
    private int rowVersion;

    @Override
    public String toString() {
        return "EndEntityProfileData{" +
                "id=" + id +
                ", profileName='" + profileName + '\'' +
                ", rowProtection='" + rowProtection + '\'' +
                ", rowVersion=" + rowVersion +
                '}';
    }
}
