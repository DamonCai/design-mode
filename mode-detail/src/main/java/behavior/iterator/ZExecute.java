package behavior.iterator;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:behavior.iterator
 */
public class ZExecute {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}
