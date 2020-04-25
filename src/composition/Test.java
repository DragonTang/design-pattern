package composition;

public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbconnection(new MySqlConnection());
        productDao.addProduct();
        productDao.setDbconnection(new PostgreSqlConnection());
        productDao.addProduct();
    }
}
