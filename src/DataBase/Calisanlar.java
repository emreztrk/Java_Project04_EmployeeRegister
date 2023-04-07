package DataBase;

import Models.Personnel.Personnel;
import Models.Departmanlar.Departman;

import java.util.ArrayList;

public class Calisanlar {


    // Buradaki calisanList static cünkü proje calismaya basladiği anda oluşması lazım. Bunu bir veritabani
    // gibi görebiliriz. Calisanlarimizin hepsi bu liste icerisinde yer alacak.
    private static ArrayList<Personnel> calisanList = new ArrayList<>();

    // Calisanlari almak icin basit bir getter method
    public static ArrayList<Personnel> getCalisanList() {
        return calisanList;
    }

    // Bir çalışan eklemek için gerekli method.
    public static void addACalisan(Personnel calisan) {
        calisanList.add(calisan);
    }


    // Bir çalışan silmek için gerekli method.
    public static void deleteACalisanWithId(String calisanId) {
        for (int i = 0; i < calisanList.size(); i++) {
            if (calisanList.get(i).getCalisanId().equals(calisanId)){
                calisanList.remove(calisanList.get(i));
            }

        }

    }

    // Departman kodu verilerek, konsola sadece o departmanda calisanlari yazdirmak için
    public static void printDepartmandakiCalisanlar(String departmanKodu) {
        Departman d1= null;
        for (Departman d: Departmanlar.getDepartmanList()){
            if (d.getDepartmanKodu().equals(departmanKodu)){
                d1=d;
            }
        }
        for (Personnel c : calisanList){
            if (c.getDepartman()==d1){
                System.out.println(c);
            }
        }

    }


    // Calisanlari konsola yazdirmak için
    public static void printCalisanlar() {
        for (Personnel c : calisanList){
            System.out.println(c.toString());
            }
        }


}
