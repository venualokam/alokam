package Util;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 3/21/13
 * Time: 3:29 PM
 */
public final class  ImmutableTest {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
               ImmutableTest(String name ,String address){
       this.name=name;
       this.address=address;
   }
    String name;
    String address;
}
