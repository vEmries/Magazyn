package App.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WarehouseStockRepo extends CrudRepository<WarehouseStock, Integer> {

    List<WarehouseStock> findByProductnameContaining(String productName);

    @Query("select w.productid from WarehouseStock w")
    List<Integer> getProductIDs();
}
