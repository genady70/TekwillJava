import java.util.Objects;

public class Student {
    String fio;
    String data;
    byte kurs;
    double bursa;

    public void setBursa(double bursa) {
        this.bursa = bursa;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setKurs(byte kurs) {
        this.kurs = kurs;
    }

    public byte getKurs() {
        return kurs;
    }

    public String getFio() {
        return fio;
    }

    public double getBursa() {
        return bursa;
    }

    public String getData() {
        return data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return kurs == student.kurs &&
                Double.compare(student.bursa, bursa) == 0 &&
                Objects.equals(fio, student.fio) &&
                Objects.equals(data, student.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, data, kurs, bursa);
    }
    void displayInfo(){
        System.out.printf("fio: %s \t Datar: %s \t Kurs: %d \t Stipen: %.2f \n",fio ,data,kurs,bursa);
    }
}
