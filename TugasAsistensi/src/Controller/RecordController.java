package Controller;
import Entity.*;
import Model.*;
/**
 *
 * @author asus
 */
public class RecordController {
    
    public void InsertRecord(String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan){
        AllObjectModel.modelrecord.getData().add(new RecordEntity(provinsi,TingkatKematian,JumlahKasus,PotensiPenularan));
    }
    public void UpdateRecord(int index, String provinsi,int TingkatKematian, int JumlahKasus, int PotensiPenularan){
        AllObjectModel.modelrecord.getData().set(index, new RecordEntity(provinsi,TingkatKematian,JumlahKasus,PotensiPenularan));
    }
    public void DeleteRecord(int index){
        AllObjectModel.modelrecord.getData().remove(index);
    }
    public String ViewDataRecord(){
        String text;
        text="Provinsi\tTingkat Kematian\tJumlah Kasus\tPotensi Penularan\n";
        
        for(int i=0;i<AllObjectModel.modelrecord.getData().size();i++){
            text+=""+AllObjectModel.modelrecord.getData().get(i).getProvinsi()
                    +"\t\t"+AllObjectModel.modelrecord.getData().get(i).getTingkatKematian()
                    +"\t\t"+AllObjectModel.modelrecord.getData().get(i).getJumlahKasus()
                    +"\t\t"+AllObjectModel.modelrecord.getData().get(i).getPotensiPenularan()+"\n";
        }
                return text;
    }
}
