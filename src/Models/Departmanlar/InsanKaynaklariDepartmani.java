package Models.Departmanlar;

public class InsanKaynaklariDepartmani implements Departman {

    final String departmanKodu = "IKD";

    // Zam oranini belirlemeyi unutmayalim.
    final int zamOrani = 25;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }
}
