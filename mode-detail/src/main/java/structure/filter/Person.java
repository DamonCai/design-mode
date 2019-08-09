package structure.filter;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:structure.filter
 * @date Date:2019/8/9 11:25
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
