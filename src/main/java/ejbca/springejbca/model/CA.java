package ejbca.springejbca.model;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAData")
@Getter
@ToString
public class CA {
    @Id
    private int cAId;
    private String data;
    private long expireTime;
    private String name;
    private String rowProtection;
    private int rowVersion;
    private int status;
    private String subjectDN;
    private long updateTime;


}
