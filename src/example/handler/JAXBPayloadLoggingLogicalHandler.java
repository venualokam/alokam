package example.handler;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 22 Jun, 2011
 * Time: 11:36:52 AM
 */

import java.util.Set;


import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;


public class JAXBPayloadLoggingLogicalHandler implements SOAPHandler<SOAPMessageContext> {


    public Set<QName> getHeaders() {
        return null;
    }


    public void close(MessageContext context) {
    }


    public boolean handleFault(SOAPMessageContext context) {
        logToSystemOut(context);
        return true;
    }

    
    public boolean handleMessage(SOAPMessageContext context) {
        logToSystemOut(context);
        return true;
    }

    private void logToSystemOut(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty) {
            System.out.println("\nOutgoing message:");
        } else {
            System.out.println("\nIncoming message:");
        }

        SOAPMessage message = smc.getMessage();  
        try {
            message.writeTo(System.out);
        } catch (Exception e) {
            System.out.println("Exception in handler: " + e);
        }
    }

}