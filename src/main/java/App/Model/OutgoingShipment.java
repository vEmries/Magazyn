package App.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "outgoingshipment")
@Data
public class OutgoingShipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer shipmentid;
    Integer productid;
    Integer shipperid;
    Integer quantity;
    Integer permissionby;
    String shipmentNumber;

}
