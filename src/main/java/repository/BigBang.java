package repository;
import controller.StoreController;
import model.Product;
import org.junit.Test;

public class BigBang {
    public void ListProductsCat1() {
        String cat1 = "aliment";
        StoreController storeController = new StoreController();
        storeController.addProduct(new Product(1,"prod1",cat1,10));
        storeController.addProduct(new Product(2,"prod2","cat2",20));
        if(storeController.getProductsCategory(cat1).isEmpty()){
            assert false;
        }
    }

    public void ListProductsCat2() {
        String cat1 = "asdasdsdas";
        StoreController storeController = new StoreController();
        storeController.addProduct(new Product(1, "prod1", "cat1", 10));
        storeController.addProduct(new Product(2, "prod2", "cat2", 20));
        if (storeController.getProductsCategory(cat1).isEmpty()) {
            assert true;
        }
    }
    public void ListProductsCat3() {
        String cat1 = "asdasdsddasdasas";
        StoreController storeController = new StoreController();
        storeController.addProduct(new Product(1, "prod1", "cat1", 10));
        storeController.addProduct(new Product(2, "prod2", "cat2", 20));
        if (storeController.getProductsCategory(cat1).isEmpty()) {
            assert true;
        }
    }


    public void bigbang(){
        this.ListProductsCat1();
        this.ListProductsCat2();
        this.ListProductsCat3();
    }
}
