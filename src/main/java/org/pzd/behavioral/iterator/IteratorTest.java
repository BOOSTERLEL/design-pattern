package org.pzd.behavioral.iterator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class IteratorTest {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
