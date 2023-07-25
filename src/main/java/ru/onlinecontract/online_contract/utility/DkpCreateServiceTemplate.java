package ru.onlinecontract.online_contract.utility;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import org.springframework.stereotype.Component;
import ru.onlinecontract.online_contract.entity.Buyer;
import ru.onlinecontract.online_contract.entity.Car;
import ru.onlinecontract.online_contract.entity.Seller;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@Component
public class DkpCreateServiceTemplate {

    private Buyer buyer;
    private Seller seller;
    private Car car;
    String input = "C:\\Users\\Friend\\Desktop\\DKP.doc";

    public void createNewDkp(Buyer buyer, Seller seller, Car car) {
        Document doc = new Document(input);
        HashMap<String, String> map = new HashMap<>();
        map.put("sellerFullName", seller.getSellerFullName());
        map.put("sellerAddress", seller.getSellerFullName());
        map.put("sellerRegAddress", seller.getSellerRegAddress());
        map.put("sellerPassportSerial", seller.getSellerPassportSerial());
        map.put("sellerPassportNumber", seller.getSellerPassportNumber());
        map.put("sellerPassportCreatedAt", seller.getSellerPassportCreatedAt());
        map.put("buyerFullName", buyer.getBuyerFullName());
        map.put("buyerAddress", buyer.getBuyerAddress());
        map.put("buyerRegAddress", buyer.getBuyerAddress());
        map.put("buyerPassportSerial", buyer.getBuyerPassportSerial());
        map.put("buyerPassportNumber", buyer.getBuyerPassportNumber());
        map.put("buyerPassportCreatedAt", buyer.getBuyerPassportCreatedAt());
        map.put("markModelCar", car.getMarkModelCar());
        map.put("VIN", car.getVin());
        map.put("createdAt", car.getCreatedAt());
        map.put("engineNumber", car.getEngineNumber());
        map.put("chassisNumber", car.getChassisNumber());
        map.put("bodyNumber", car.getEngineNumber());
        map.put("color", car.getColor());
        map.put("mileageInKM", car.getMileageInKM());
        map.put("registrationNumber", car.getRegistrationNumber());
        map.put("registrationDocNumber", car.getRegistrationDocNumber());
        map.put("registrationDocNumberCreatedAt", car.getRegistrationDocNumberCreatedAt());
        rewriteTemplateClientData(map, doc);

        doc.saveToFile("C:\\Users\\Friend\\Desktop\\1\\Dkp_" + car.getVin() + ".doc", FileFormat.Docx_2013);
    }
    public void rewriteTemplateClientData(Map<String, String> map, Document doc){
        for (Map.Entry<String,String> entry : map.entrySet()) {
//            doc.replace(String.valueOf(Pattern.compile("{" + entry.getKey() + "}")), entry.getValue(), false, true);
            doc.replace(Pattern.compile(entry.getKey()), entry.getValue());
        }
    }


}
