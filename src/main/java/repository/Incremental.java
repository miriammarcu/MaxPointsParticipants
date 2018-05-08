package repository;
        import controller.StoreController;
        import model.Product;


public class Incremental {
    public void incrementalA() {
        String cat1 = "aliment";
        StoreController storeController = new StoreController();
        storeController.addProduct(new Product(1,"prod1",cat1,10));
        if(storeController.getProductsCategory(cat1).isEmpty()){
            assert false;
        }
    }

    public void incrementalB() {
        this.incrementalA();
        String cat1 = "o categorie frumoasa";
        StoreController storeController = new StoreController();
        storeController.addProduct(new Product(1, "prod1", "cat1", 10));
        if (storeController.getProductsCategory(cat1).isEmpty()) {
            assert true;
        }
    }
    public void incrementalC() {
        this.incrementalB();
        String cat1 = "o alta categorie";
        StoreController storeController = new StoreController();
        storeController.addProduct(new Product(1, "prod1", "cat1", 10));
        storeController.addProduct(new Product(2, "prod2", "cat2", 20));
        if (storeController.getProductsCategory(cat1).isEmpty()) {
            assert true;
        } }
}
