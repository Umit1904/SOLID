package dependancy_inversion.good;

public class OracleDatabase implements DB{
    public String connect(){
        return "connecting to oracle..";
    }
    public String disconnect(){
        return "disconnecting from oracle..";
    }
}