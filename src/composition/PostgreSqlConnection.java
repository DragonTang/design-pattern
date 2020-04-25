package composition;

public class PostgreSqlConnection extends DBconnection {
    @Override
    public String getConnection() {
        return "PostgreSql数据库链接";
    }
}
