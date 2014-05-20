package Util;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/10/12
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
import org.jasypt.util.password.ConfigurablePasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.jasypt.util.text.StrongTextEncryptor;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.*;
//import org.bouncycastle.jce.provider.BouncyCastleProvider;
public class Encryption {

	static String encryptionString1 = "I did not fail the test, I just found 100 ways to do it wrong.";

	static public String encryptPassword(String passwordIn) {
		try {
	      ConfigurablePasswordEncryptor conPassEncrypt = new ConfigurablePasswordEncryptor();
	      conPassEncrypt.setAlgorithm("SHA-512");
	      conPassEncrypt.setPlainDigest(false); //TBD: ask Marc if we need salt digester.
	      conPassEncrypt.setStringOutputType("base64");  // default
	      String passwordOut = conPassEncrypt.encryptPassword(passwordIn);

	      /* testing purposes only.
	      System.out.println("the configurablePass: the encryptedpass is " + passwordOut);

	      if(conPassEncrypt.checkPassword(passwordIn, passwordOut))
	    	  System.out.println("compare the password using config, it is true");
	      else
	    	  System.out.println("compare the password using config, it is false");
	      */
			return passwordOut;

		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	static public boolean checkPassword(String passwordIn, String passwordCompare) {

		try {
			ConfigurablePasswordEncryptor conPassEncrypt = new ConfigurablePasswordEncryptor();
			conPassEncrypt.setAlgorithm("SHA-512");

			if(conPassEncrypt.checkPassword(passwordIn, passwordCompare))
				return true;
			else
				return false;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}

	}


static StandardPBEStringEncryptor getTextStandardPBEEncryptor (boolean strong, String encryptPassword) {

	StandardPBEStringEncryptor stringEncryptor = new StandardPBEStringEncryptor();

	if (strong == true) {
//		stringEncryptor.setProvider(new BouncyCastleProvider());
	    stringEncryptor.setAlgorithm("PBEWITHSHA256AND128BITAES-CBC-BC");
	}
	else
	    stringEncryptor.setAlgorithm("PBEWithMD5AndDES");
//	Provider sunJce = new com.sun.crypto.provider.SunJCE();
    stringEncryptor.setStringOutputType("base64");
    stringEncryptor.setSaltGenerator(new ZeroSaltGenerator());
//    stringEncryptor.setAlgorithm("PBEWithMD5AndDES");
    stringEncryptor.setPassword(encryptPassword + Encryption.encryptionString1 + encryptPassword);

	return stringEncryptor;
}

static BasicTextEncryptor getTextStandardEncryptor (boolean strong, String encryptPassword) {

	BasicTextEncryptor stringEncryptor = new BasicTextEncryptor();
	stringEncryptor.setPassword ( encryptPassword );

	return stringEncryptor;
}


static StrongTextEncryptor getTextEncryptor () {

	StrongTextEncryptor stringEncryptor = new StrongTextEncryptor();
    stringEncryptor.setPassword(Encryption.encryptionString1);
    return stringEncryptor;

}
static public String encryptTextString(String encryptPassword, String textStringIn) {
	String encryptedText =	null;
	try {

		String encryptKey = encryptionString1;
		//if (encryptPassword != null)
		//	encryptKey = encryptPassword;
		StandardPBEStringEncryptor stringEncryptor = getTextStandardPBEEncryptor(false, encryptKey);
//		BasicTextEncryptor stringEncryptor = getTextStandardEncryptor(false, encryptKey);
		encryptedText = stringEncryptor.encrypt(textStringIn);
//		decryptedText = stringEncryptor.decrypt(encryptedText);

//		System.out.println("the encrypted message1 is for standard: " + encryptedText);
//		System.out.println("the decrypted message1 is for standard: " + decryptedText);

	return encryptedText;
	}
	catch (Exception e) {
		throw new RuntimeException(e);
	}

}

static public String decryptTextString(String encryptPassword, String textStringIn) {
	try {

		String encryptKey = encryptionString1;
		//if (encryptPassword != null)
		//	encryptKey = encryptPassword;
		//BasicTextEncryptor stringEncryptor = getTextStandardEncryptor(false, encryptKey);
		StandardPBEStringEncryptor stringEncryptor = getTextStandardPBEEncryptor(false, encryptKey);
		String decryptedText = stringEncryptor.decrypt(textStringIn);

  //    System.out.println("the Decrypted message1 is for standard: " + stringEncryptor.decrypt(standardEncryptor1));

	return decryptedText;
	}
	catch (Exception e) {
		throw new RuntimeException(e);
	}

}
static public boolean checkExemptPassword(String encryptPassword, String passwordIn, String passwordCompare) {

	try {
		String passwordDecrypted = decryptTextString(encryptPassword, passwordCompare);

		if(passwordDecrypted.equals(passwordIn))
			return true;
		else
			return false;
	}
	catch (Exception e) {
		throw new RuntimeException(e);
	}
}
}