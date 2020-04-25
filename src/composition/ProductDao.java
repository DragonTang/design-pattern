package composition;

public class ProductDao {
    private DBconnection dbConnection;

    public void setDbconnection(DBconnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "添加产品");
    }
}
