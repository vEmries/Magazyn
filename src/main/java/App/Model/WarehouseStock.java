package App.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "warehousestock")
@Data
public class WarehouseStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer productid;
    Integer detailid;
    String productname;
    Integer quantity;
}
