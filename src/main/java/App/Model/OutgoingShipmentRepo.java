package App.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OutgoingShipmentRepo extends CrudRepository<OutgoingShipment, Integer> {

    List<OutgoingShipment> findByShipmentNumber(String shipmentNumber);

    @Query("select s.shipmentid from OutgoingShipment s")
    List<Integer> getOutgoingShipmentIDs();

}
