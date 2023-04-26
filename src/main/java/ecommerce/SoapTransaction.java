package ecommerce;

import java.io.FileInputStream;
import java.net.URL;
        import java.net.HttpURLConnection;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Properties;

public class SoapTransaction {


    public static void main(String[] args) {

    }


    public static boolean purchaseStatus(String buyerName, String cardNumber, String expiryDate) {
        String soapResponse = null;
        try {

//            String configFilePath = "src/config.properties";
//            FileInputStream propsInput = new FileInputStream(configFilePath);
//            Properties prop = new Properties();
//            prop.load(propsInput);
            // Set the endpoint URL and the SOAP XML request
            String endpoint = "http://104.198.137.72:8089/ws";
//            String buyerName = "rakesh";
//            String cardNumber = "112";
//            String expiryDate = "12/22";
            String soapXML = "\t<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:loan=\"http://www.javatechie.com/spring/soap/api/loanEligibility\">\n" +
                    "\t   <soapenv:Header/>\n" +
                    "\t   <soapenv:Body>\n" +
                    "\t      <loan:CustomerRequest>\n" +
                    "\t         <loan:buyerName>" + buyerName + "</loan:buyerName>\n" +
                    "\t         <loan:cardNumber>" + cardNumber + "</loan:cardNumber>\n" +
                    "\t         <loan:expiryDate>" + expiryDate + "</loan:expiryDate>\n" +
                    "\t      </loan:CustomerRequest>\n" +
                    "\t   </soapenv:Body>\n" +
                    "\t</soapenv:Envelope>";

            // Open a connection to the endpoint URL
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the HTTP request headers and properties
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            connection.setRequestProperty("SOAPAction", endpoint);
            connection.setDoOutput(true);

            // Write the SOAP XML request to the output stream
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(soapXML.getBytes());
            outputStream.flush();

            // Read the response from the input stream
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder responseBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                responseBuilder.append(line);
            }
            soapResponse = responseBuilder.toString();
            bufferedReader.close();
            outputStream.close();

            // Print the SOAP XML response
            System.out.println(soapResponse);

            // Close the input stream and output stream


        } catch (Exception e) {
            e.printStackTrace();
        }
        if (soapResponse.indexOf("true") != -1) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}

