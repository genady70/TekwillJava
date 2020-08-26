package md.tekwill.model;

public class Student {
    private String fio;
    private Adress ad;
    private Ld pers_data;

    public void setFio(String fio) {
        this.fio = fio;
    }
    private int up_d_r(){
      int a=pers_data.getD_r();
      return ++a;
    }
    private  int down_d_r(){
        int a=pers_data.getD_r();
        return --a;
    }
    public void afis(){
        int c=up_d_r()+down_d_r();
        System.out.println("data nasterii"+c+fio);
    }

}
