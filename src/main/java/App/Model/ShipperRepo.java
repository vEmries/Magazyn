package App.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShipperRepo extends CrudRepository<Shipper, Integer> {

    List<Shipper> findByShippernameContaining(String shipperName);
    Shipper findByShipperid(Integer shipperID);

    @Query("select s.shipperid from Shipper s")
    List<Integer> getShipperIDs();
}
