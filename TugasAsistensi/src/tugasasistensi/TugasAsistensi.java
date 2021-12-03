package tugasasistensi;
import Controller.AllObjectController;
import Model.AllObjectModel;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class TugasAsistensi {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
    int pil;
    do{
        System.out.println("1. insert");
        System.out.println("2. update");
        System.out.println("3. delete");
        System.out.println("4. View Hasil Clustering");
        System.out.println("0. exit");
        System.out.println("Pilih -> ");
        
        pil = input.nextInt();
        switch(pil){
            case 1:
                InputDataRecord();
                System.out.println(AllObjectController.recordcontroller.ViewDataRecord());
                break;
            case 2:
                UpdateDataRecord();
                System.out.println(AllObjectController.recordcontroller.ViewDataRecord());
                 break;
            case 3 :
                delete();
                System.out.println(AllObjectController.recordcontroller.ViewDataRecord());
                break;
            case 4:
                System.out.println(AllObjectController.recordcontroller.ViewDataRecord());
                break;
        }
    }while(pil!=0);
    }
    static void InputDataRecord(){
        System.out.print("Provinsi = ");
        String provinsi = input.next();
        System.out.print("Tingkat Kematian = ");
        int tingkatkematian = input.nextInt();
        System.out.print("Jumlah Kasus = ");
        int jumlahkasus = input.nextInt();
        System.out.print("Potensi Penularan = ");
        int potensipenularan = input.nextInt();
        AllObjectController.recordcontroller.InsertRecord(provinsi,tingkatkematian,jumlahkasus,potensipenularan);
        System.out.println("Data Berhasil Diinsert");
    
}
    static void UpdateDataRecord(){
        boolean ketemu = false;
        int index = 0;
        System.out.print("Provinis yang diupdate = " );
        String provinsicek = input.next();
        for(int i=0;i<AllObjectModel.modelrecord.getData().size();i++){
            if(provinsicek.equals(AllObjectModel.modelrecord.getData().get(i).getProvinsi())){
                ketemu = true;
                index = i;
            }
        }
        if(ketemu = true){
            System.out.print("Provinsi = ");
            String provinsi = input.next();
            System.out.print("Tingkat Kematian = ");
            int tingkatkematian = input.nextInt();
            System.out.print("Jumlah Kasus = ");
            int jumlahkasus = input.nextInt();
            System.out.print("Potensi Penularan = ");
            int potensipenularan = input.nextInt();
             AllObjectController.recordcontroller.UpdateRecord(index,provinsi,tingkatkematian,jumlahkasus,potensipenularan);
             System.out.println("Data Berhasil Diupdate");
        }else{
            System.out.println("Data Tidak Ada");
        }
    }
    static void delete(){
        boolean ketemu = false;
        int index = 0;
        System.out.print("Provinsi yang didelete = ");
        String provinsicek = input.next();
        for(int i=0;i<AllObjectModel.modelrecord.getData().size();i++){
            if(provinsicek.equals(AllObjectModel.modelrecord.getData().get(i).getProvinsi())){
                ketemu =true;
                index = i;
            }
        }
        if (ketemu == true){
        AllObjectController.recordcontroller.DeleteRecord(index);
             System.out.println("Data Berhasil Diupdate");
        }else{
            System.out.println("Data Tidak Ada");
        }
        }
    }
