package Util;



import java.util.Scanner;


public class VenuTest {


        public static void main(String args[]){
            String  input ="50~Fifty~3,4,5,7~P,Q,R~D,E,F,N";
            Scanner s = new Scanner(input).useDelimiter("~");

            while(s.hasNext()) {
                String code=   s.next();
                String att1=   s.next();
                String multiValued1=   s.next();
                String multiValued2=   s.next();
                String multiValued3=   s.next();
                generateRow(code,att1,multiValued1,multiValued2,multiValued3);
            }

        }


    public static void      generateRow(String code,String Att1,String multiValued1,String multiValued2,String multiValued3){
        String saMessage1[] = multiValued1.split(",");
        String saMessage2[] = multiValued2.split(",");
        String saMessage3[] = multiValued3.split(",");

        int StringLength=saMessage1.length;
        StringLength=(StringLength<saMessage2.length ?saMessage2.length:StringLength);
        StringLength=(StringLength<saMessage3.length ?saMessage3.length:StringLength);


        for(int k=0;k<StringLength;k++){
                StringBuffer s2= new StringBuffer(code);
                s2.append(",").append(Att1);
                 s2.append(",");
               s2.append((saMessage1.length>k) ? saMessage1[k] :"");
                 s2.append(",");
               s2.append((saMessage2.length>k) ? saMessage2[k] :"");
                s2.append(",");
               s2.append((saMessage3.length>k) ? saMessage3[k] :"");


                System.out.println(s2.toString());
        }
     }
}

