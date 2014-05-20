package Util;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 3/21/13
 * Time: 3:30 PM
 */
public class AlokamImmutableTest {

    public static void main(String args[]){
            AlokamImmutableTest ff=new AlokamImmutableTest();
            ff.test();
    }


    public void test(){
            ImmutableTest gg=new ImmutableTest("venu","alokam");
            System.out.println(gg.getName());
            gg.setName("venu23");
            System.out.println(gg.getName());
            System.out.println(gg.getAddress());
    }
}
