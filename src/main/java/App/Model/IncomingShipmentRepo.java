package App.Model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IncomingShipmentRepo extends CrudRepository<IncomingShipment, Integer>{

    List<IncomingShipment> findByShipmentnumber(String shipmentNumber);

    @Query("select s.shipmentid from IncomingShipment s")
    List<Integer> getIncomingShipmentIDs();
}
