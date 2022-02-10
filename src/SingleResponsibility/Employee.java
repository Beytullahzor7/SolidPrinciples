package SingleResponsibility;

public class Employee {

    /* Employee sınıfı 2 sorumluluk alıyor, biri çalışan veritabanı işlemlerinin sorumluluğunu üstleniyor,
     diğeri ise çalışanların raporlarını oluşturuyor.
     Employee sınıfı, rapor oluşturma sorumluluğunu üstlenmemelidir,
     çünkü müşteriniz sizden raporu Excel’de veya başka bir dosya türünde raporlama isteme
     olasılığı olduğunu düşünürsek, bu class’ın değiştirilmesi gerekecektir.

     Bu nedenle, SRP prensibine göre, bir class bir sorumluluk almalı, bu yüzden rapor oluşturma işlemi için
     farklı bir class yazmalıyız ve rapor oluşturma class’ındaki herhangi bir değişiklik “Employee” class’ını etkilememelidir.
     */

    public int employeeId;
    public String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void VeritabanıIslemleri(Employee employee){
        //Veritabanı islemlerini yap
    }

    public void RaporOlustur(Employee employee){
        // Rapor olusturma görevi
    }
}
