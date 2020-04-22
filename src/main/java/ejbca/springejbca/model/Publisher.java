package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publisherdata")
@Getter
@ToString
public class Publisher {
    @Id
    private int id;
    private String data;
    private String name;
    private String rowProtection;
    private int rowVersion;
    private int updateCounter;

}
