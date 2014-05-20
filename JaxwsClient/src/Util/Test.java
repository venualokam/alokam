package Util;

import java.util.StringTokenizer;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/10/12
 * Time: 4:17 PM
 */
public class Test {

    public static void main(String args[]){
        String  bhPassword ="3ArTw61UFuGjh+U+r2JAjw==";
        bhPassword = Encryption.decryptTextString(bhPassword, bhPassword);
        System.out.println("200000000======"+bhPassword);
        try{
        StringTokenizer parseRowColSizes = new StringTokenizer(null, ":");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
