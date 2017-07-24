package App.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "incomingshipment")
@Data
public class IncomingShipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer shipmentid;
    Integer productid;
    Integer shipperid;
    Integer quantity;
    Integer permissionby;
}
