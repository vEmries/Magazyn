package App.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductInfoRepo extends CrudRepository<ProductInfo, Integer> {

    List<ProductInfo> findByProductnameContaining(String productName);
    ProductInfo findByDetailid(Integer detailID);

    @Query("select p.detailid from ProductInfo p")
    List<Integer> getProductInfoIDs();
}
