package io.pivotal.HostaliasesExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import java.net.InetAddress;

@SpringBootApplication
@Controller
public class HostaliasesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostaliasesExampleApplication.class, args);
	}

	@GetMapping("/privatesite")
	@ResponseBody
	public String makeHTTPRequest() {
		try {
			StringBuffer sb = new StringBuffer();
			InetAddress dnsresult[] = InetAddress.getAllByName("privatesite");
			for (int i=0; i<dnsresult.length; i++) sb.append(dnsresult[i] + "<br />");
			return sb.toString();
				
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
