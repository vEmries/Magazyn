package App.Service;

import App.Model.ProductInfo;
import App.Model.ProductInfoRepo;
import App.Model.WarehouseStock;
import App.Model.WarehouseStockRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Slf4j
public class ProductService {

    @Autowired
    ProductInfoRepo productInfoRepo;

    @Autowired
    WarehouseStockRepo warehouseStockRepo;


    @Transactional
    @Modifying
    public void updateProductStock(Integer productID, Integer quantity) {

        WarehouseStock updatedWarehouseProduct = warehouseStockRepo.findByProductid(productID);
        updatedWarehouseProduct.setQuantity(quantity);

        warehouseStockRepo.save(updatedWarehouseProduct);
    }

    @Transactional
    @Modifying
    public void createNewProduct(String productName, String packagingType, String size, Integer quantity) {

        ProductInfo newProduct = new ProductInfo();
        newProduct.setProductname(productName);
        newProduct.setPackagingtype(packagingType);
        newProduct.setSize(size);

        productInfoRepo.save(newProduct);

        WarehouseStock newProductStock = new WarehouseStock();
        newProductStock.setDetailid(newProduct.getDetailid());
        newProductStock.setProductname(productName);
        newProductStock.setQuantity(quantity);

        warehouseStockRepo.save(newProductStock);
    }

    @Transactional
    @Modifying
    public void updateProductInfo(Integer detailID, String productName, String packagingType, String size) {

        ProductInfo updatedProduct = new ProductInfo();
        updatedProduct.setDetailid(detailID);
        updatedProduct.setProductname(productName);
        updatedProduct.setPackagingtype(packagingType);
        updatedProduct.setSize(size);

        productInfoRepo.save(updatedProduct);

        WarehouseStock updatedWarehouseProduct = warehouseStockRepo.findByDetailid(updatedProduct.getDetailid());
        updatedWarehouseProduct.setProductname(productName);

        warehouseStockRepo.save(updatedWarehouseProduct);

    }

    @Transactional
    @Modifying
    public void deleteProduct(Integer detailID) {
        productInfoRepo.delete(detailID);
    }
}
