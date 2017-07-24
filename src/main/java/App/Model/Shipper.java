package App.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shipper")
@Data
public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer shipperid;
    String shippername;
    String contactnumber;
}
