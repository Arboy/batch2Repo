package classes;

/**
 * Created by JPMPC-B209 on 11/10/2016.
 */
public class Employee extends Person{
    private String department;
    private int sss_id;
    public int pagibig_id;

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public int getSss_id() {

        return sss_id;
    }

    public void setSss_id(int sss_id) {

        this.sss_id = sss_id;
    }

    public int getPagibig_id() {

        return pagibig_id;
    }

    public void setPagibig_id(int pagibig_id) {

        this.pagibig_id = pagibig_id;
    }


}
