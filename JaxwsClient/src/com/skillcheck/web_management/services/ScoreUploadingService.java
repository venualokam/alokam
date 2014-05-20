
package com.skillcheck.web_management.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-02/02/2007 03:56 AM(vivekp)-FCS
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ScoreUploadingService", targetNamespace = "http://webtest.skillcheck.com", wsdlLocation = "http://localhost:8080/onlinetesting/services/ScoreUploading?wsdl")
public class ScoreUploadingService
    extends Service
{

    private final static URL SCOREUPLOADINGSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/onlinetesting/services/ScoreUploading?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        SCOREUPLOADINGSERVICE_WSDL_LOCATION = url;
    }

    public ScoreUploadingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScoreUploadingService() {
        super(SCOREUPLOADINGSERVICE_WSDL_LOCATION, new QName("http://webtest.skillcheck.com", "ScoreUploadingService"));
    }

    /**
     * 
     * @return
     *     returns ScoreUploading
     */
    @WebEndpoint(name = "ScoreUploadingSoapPort")
    public ScoreUploading getScoreUploadingSoapPort() {
        return (ScoreUploading)super.getPort(new QName("http://webtest.skillcheck.com", "ScoreUploadingSoapPort"), ScoreUploading.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScoreUploading
     */
    @WebEndpoint(name = "ScoreUploadingSoapPort")
    public ScoreUploading getScoreUploadingSoapPort(WebServiceFeature... features) {
        return (ScoreUploading)super.getPort(new QName("http://webtest.skillcheck.com", "ScoreUploadingSoapPort"), ScoreUploading.class, features);
    }

}
