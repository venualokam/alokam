package otServices;


import com.skillcheck.web_management.services.Statistics;
import com.skillcheck.web_management.services.StatisticsService;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/30/13
 * Time: 3:13 PM
 */
public class StaticsTest {
    public static void main(String[] argv) {
      Statistics service = new StatisticsService().getStatisticsSoapPort();
     String s= service.getAccountStatistics("MARC3C", "Administrator", "Passw0rd!");
      System.out.print(s);
  }
}
