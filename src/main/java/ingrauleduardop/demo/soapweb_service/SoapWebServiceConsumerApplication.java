package ingrauleduardop.demo.soapweb_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequest;
import com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponse;

import ingrauleduardop.demo.soapweb_service.connector.SOAPConnector;

@SpringBootApplication
public class SoapWebServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapWebServiceConsumerApplication.class, args);
	}
	
	@Bean
    CommandLineRunner lookup(SOAPConnector soapConnector) {
        return args -> {
            String numeroTarjeta = "1235698745";//Default Name
            GetDebitCardRequest request = new GetDebitCardRequest();
            request.setNumeroTarjeta(numeroTarjeta);
            GetDebitCardResponse response =(GetDebitCardResponse) soapConnector.callWebService("http://localhost:8080/ws", request);
            System.out.println("Got Response As below ========= : ");
           System.out.println("NUMERO DE TARJETA : "+response.getDebitCard().getNumeroTarjeta());
        };
    }
}
