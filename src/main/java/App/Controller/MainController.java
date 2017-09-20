package App.Controller;

import App.Model.WarehouseStock;
import App.Model.WarehouseStockRepo;
import App.Service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin
public class MainController {

    @Autowired
    WarehouseStockRepo warehouseStockRepo;

    @Autowired
    ProductService productService;


    @RequestMapping(value = "/stock", method = RequestMethod.GET)
    public Iterable<WarehouseStock> getStock() {
        return warehouseStockRepo.findAll();
    }

    @RequestMapping(value = "/stock/{ID}", method = RequestMethod.GET)
    public WarehouseStock getStockByID(@PathVariable(value = "ID") Integer productID) {
        return warehouseStockRepo.findByProductid(productID);
    }

    @RequestMapping(value = "/stock/new", method = RequestMethod.POST)
    public void createNewProduct(@RequestParam String productName, @RequestParam String packagingType,
                                 @RequestParam String size, @RequestParam Integer quantity) {
        productService.createNewProduct(productName, packagingType, size, quantity);
    }

}
