package md.tekwill.model;

public class Ld {
    private long phone;
    private String email;
    private boolean sex;
    private int d_r;

    public boolean isSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getD_r() {
        return d_r;
    }

    public void setD_r(int d_r) {
        this.d_r = d_r;
    }
}
