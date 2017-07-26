package App.Service;

import App.Model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Slf4j
public class ShipmentService {

    @Autowired
    IncomingShipmentRepo incomingShipmentRepo;

    @Autowired
    OutgoingShipmentRepo outgoingShipmentRepo;

    @Autowired
    WarehouseStockRepo warehouseStockRepo;

    @Transactional
    @Modifying
    public void updateProductStock(Integer productID, Integer quantity) {

        WarehouseStock updatedWarehouseProduct = warehouseStockRepo.findByProductid(productID);
        updatedWarehouseProduct.setQuantity(updatedWarehouseProduct.getQuantity() + quantity);

        warehouseStockRepo.save(updatedWarehouseProduct);
    }

    @Transactional
    @Modifying
    public void createNewIncomingShipment(Integer productID, Integer shipperID, Integer quantity, Integer permissionBy, String shipmentNumber) {

        IncomingShipment newIncomingShipment = new IncomingShipment();
        newIncomingShipment.setProductid(productID);
        newIncomingShipment.setShipperid(shipperID);
        newIncomingShipment.setQuantity(quantity);
        newIncomingShipment.setPermissionby(permissionBy);
        newIncomingShipment.setShipmentnumber(shipmentNumber);

        incomingShipmentRepo.save(newIncomingShipment);

        updateProductStock(newIncomingShipment.getProductid(), newIncomingShipment.getQuantity());
    }

    @Transactional
    @Modifying
    public void createNewOutgoingShipment(Integer produtctID, Integer shipperID, Integer quantity, Integer permissionBy, String shipmentNumber) {

        OutgoingShipment newOutgoingShipment = new OutgoingShipment();
        newOutgoingShipment.setProductid(produtctID);
        newOutgoingShipment.setShipperid(shipperID);
        newOutgoingShipment.setQuantity(quantity);
        newOutgoingShipment.setPermissionby(permissionBy);
        newOutgoingShipment.setShipmentNumber(shipmentNumber);

        outgoingShipmentRepo.save(newOutgoingShipment);

        updateProductStock(newOutgoingShipment.getProductid(), -(quantity));
    }
}
