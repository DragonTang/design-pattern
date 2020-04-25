package composition;

public class MySqlConnection extends DBconnection {
    @Override
    public String getConnection() {
        return "Mysql数据库链接";
    }
}
