package j2ee.composite;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.composite
 * @date Date:2019/8/13 16:11
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2) {
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData() {
        return new String[] {do1.getData(), do2.getData()};
    }
}
