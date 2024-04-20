public class Bayer extends BaseAbstract {
    protected String bName;
    protected int bYear;
    private String silnik;

    Bayer(String bName, int bYear, String silnik) {
        this.bName = bName;
        this.bYear = bYear;
        this.silnik = silnik;
    }

    Bayer(String bName, int bYear) {
        this.bName = bName;
        this.bYear = bYear;
        this.silnik = "20000000.0";
    }

    public String getSilnik() {
        return silnik;
    }

}
