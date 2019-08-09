package structure.composite;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:create.composite
 */
public class ZExecute {

    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
        CEO.add(headSales);
        CEO.add(headMarketing);


        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println("1" + CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println("2" + headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println("3" + employee);
            }
        }
    }

}
