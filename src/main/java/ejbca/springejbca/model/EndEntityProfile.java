package ejbca.springejbca.model;


import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "endentityprofiledata")
@Getter
public class EndEntityProfile {
    @Id
    private int id;

    @OneToMany(mappedBy="endEntityProfile", cascade= CascadeType.ALL)
    private Collection<Certificate> certificates ;

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
