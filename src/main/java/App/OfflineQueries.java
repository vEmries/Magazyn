package App;

import App.Config.BasicConfig;
import App.Model.*;
import App.Service.ProductService;
import App.Service.ShipmentService;
import App.Service.ShipperService;
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

        ProductService productService = ctx.getBean(ProductService.class);
        ShipmentService shipmentService = ctx.getBean(ShipmentService.class);
        ShipperService shipperService = ctx.getBean(ShipperService.class);

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

//        System.out.println("------------------------------------------------------------");
//
//        System.out.println("--> " + warehouseStockRepo.getProductIDs());
//        System.out.println("--> " + warehouseStockRepo.findAll());

//        System.out.println("------------------------------------------------------------");

//        productService.createNewProduct("Japka - luz", "Brak opakowania", "1szt = 1kg", 100);
//        productService.updateProductInfo(8, "Japka - luz", "Brak opakowania", "1szt = 3kg");
//        productService.deleteProduct(7);

//        System.out.println("------------------------------------------------------------");
//        shipmentService.createNewIncomingShipment(1, 2, 15, 2, "DJ-443");
//        shipmentService.createNewOutgoingShipment(3, 1, 33, 1, "JJ-13");

//        System.out.println("------------------------------------------------------------");
//        shipperService.createNewShipper("JCS", "555-111-222");
//        shipperService.updateShipper(4, "JCS", "444-111-222");


        ctx.close();
    }
}
