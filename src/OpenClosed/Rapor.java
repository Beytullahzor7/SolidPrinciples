package OpenClosed;

import SingleResponsibility.Employee;

/* Dolayısıyla, yeni bir rapor türü oluşturmak istiyorsak, sadece Rapor classından miras alırız.
    Bu yüzden RaporOlustur gelişime açık fakat değişiklik için kapalıdır.
 */

public abstract class Rapor {

    public int raporId;
    public String raporAdi;

    public abstract void RaporOlustur(Employee employee);
    // Override edilecek olan metodumuzdur. Bu metod farklı tipte raporlamalar için kullanılacaktır.
}

class CrystalReportOlustur extends Rapor{

    @Override
    public void RaporOlustur(Employee employee) {
        // Crystal Report ile rapor oluştur
    }
}

class PDFReportOlustur extends Rapor{

    @Override
    public void RaporOlustur(Employee employee) {
        // PDF ile rapor oluştur
    }
}
