package App.Service;

import App.Model.Shipper;
import App.Model.ShipperRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Slf4j
public class ShipperService {

    @Autowired
    ShipperRepo shipperRepo;

    @Transactional
    @Modifying
    public void createNewShipper(String shipperName, String contactNumber) {

        Shipper newShipper = new Shipper();
        newShipper.setShippername(shipperName);
        newShipper.setContactnumber(contactNumber);

        shipperRepo.save(newShipper);
    }

    @Transactional
    @Modifying
    public void updateShipper(Integer shipperID, String shipperName, String contactNumber) {

        Shipper updatedShipper = shipperRepo.findByShipperid(shipperID);
        updatedShipper.setShippername(shipperName);
        updatedShipper.setContactnumber(contactNumber);

        shipperRepo.save(updatedShipper);
    }
}
