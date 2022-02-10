package OpenClosed;

import SingleResponsibility.Employee;

// Çok fazla ‘if’ cümleleri varsa ve Excel ’gibi yeni bir rapor türü daha tanıtmak istiyorsak,‘ if’ yazmanız gerekir.
// Bu prensibe göre classlar gelişime açık, değişime kapalı olmalıdır

public class RaporOlustur {
    public String RaporTipi;

    public void raporOlustur(Employee employee){

        if (RaporTipi == "CRS") {
            // Crystal Report ile rapor oluştur

        }if (RaporTipi == "PDF"){
            // PDF formatında rapor oluştur
        }
    }
}
