package gr.aueb.cf.ch7;

/**
 * concatenates two or more strings συνενονει δλδ
 */
public class ConcatApp {

    public static void main(String[] args) {
        String title = "Dr.";
        String firstname = "Athan";
        String lastname = "Androutsos";
        String fullname;
        String titleFullName;

        fullname = title + firstname + lastname;
        titleFullName = title.concat(firstname).concat(lastname);

        System.out.println(fullname);
        System.out.println(titleFullName);
    }
}
