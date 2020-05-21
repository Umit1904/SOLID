package dependancy_inversion.good;

public interface DB {
    String connect();
    String disconnect();
}
