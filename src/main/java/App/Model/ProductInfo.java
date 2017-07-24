package App.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "detailproductinfo")
@Data
public class ProductInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer detailid;
    String productname;
    String packagingtype;
    String size;
}
