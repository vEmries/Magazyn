package App;

import App.Config.BasicConfig;
import App.Model.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OfflineQueries {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BasicConfig.class);

        UserRepo userRepo = ctx.getBean(UserRepo.class);
        ShipperRepo shipperRepo = ctx.getBean(ShipperRepo.class);
        ProductInfoRepo productInfoRepo = ctx.getBean(ProductInfoRepo.class);
        IncomingShipmentRepo incomingShipmentRepo = ctx.getBean(IncomingShipmentRepo.class);
        OutgoingShipmentRepo outgoingShipmentRepo = ctx.getBean(OutgoingShipmentRepo.class);
        WarehouseStockRepo warehouseStockRepo = ctx.getBean(WarehouseStockRepo.class);

//        System.out.println("------------------------------------------------------------");
//
//        System.out.println("--> " + userRepo.getUserIDs());
//        System.out.println("--> " + userRepo.findAll());

//        System.out.println("------------------------------------------------------------");
//
//        System.out.println("--> " + shipperRepo.getShipperIDs());
//        System.out.println("--> " + shipperRepo.findAll());

//        System.out.println("------------------------------------------------------------");
//
//        System.out.println("--> " + productInfoRepo.getProductInfoIDs());
//        System.out.println("--> " + productInfoRepo.findAll());

//        System.out.println("------------------------------------------------------------");
//
//        System.out.println("--> " + incomingShipmentRepo.getIncomingShipmentIDs());
//        System.out.println("--> " + incomingShipmentRepo.findAll());

//        System.out.println("------------------------------------------------------------");
//
//        System.out.println("--> " + outgoingShipmentRepo.getOutgoingShipmentIDs());
//        System.out.println("--> " + outgoingShipmentRepo.findAll());

        System.out.println("------------------------------------------------------------");

        System.out.println("--> " + warehouseStockRepo.getProductIDs());
        System.out.println("--> " + warehouseStockRepo.findAll());


        ctx.close();
    }
}
