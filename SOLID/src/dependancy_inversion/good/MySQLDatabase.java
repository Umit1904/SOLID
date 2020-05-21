package dependancy_inversion.good;

public class MySQLDatabase implements DB{
    public String connect(){
        return "connecting database..";
}
    public String disconnect(){
        return "disconnecting database..";
    }
}