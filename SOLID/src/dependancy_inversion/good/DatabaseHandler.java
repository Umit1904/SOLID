package dependancy_inversion.good;

public class DatabaseHandler {
    DB dbOr = new OracleDatabase();
    DB dbMS = new MySQLDatabase();
    public String connect(String dbname) throws Exception {
        if(dbname == "MySQLDatabase"){
            return dbMS.connect();
        }
        else if(dbname == "OracleDatabase"){
            return dbOr.connect();
        }
        else{
            throw new Exception("Cannot make the order!");
        }
    }
    public String disconnect(String dbname) throws Exception {
        if(dbname == "MySQLDatabase"){
             return dbMS.disconnect();
        }
        else if(dbname == "OracleDatabase"){
            return dbOr.disconnect();
        }
        else{
            throw new Exception("Cannot make the order!");
        }
    }

}