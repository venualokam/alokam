package otServices;

import com.skillcheck.web_management.services.ScoreUploadingService;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 7/30/12
 * Time: 3:28 PM
 */
public class ScoreUploadTest {
  public static void main(String[] argv) {
      com.skillcheck.web_management.services.ScoreUploading  service = new ScoreUploadingService().getScoreUploadingSoapPort();
      //invoke business method
    String s=  service.testExists("MARC3C","Administrator","Passw0rd!","EN_CS1J1","TalentScout - Customer Service");

  System.out.print(s);
  }
}