package con_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient
public class ConServerApplication {

	 public static void main(String[] args) {
	        SpringApplication.run(ConServerApplication.class, args);
	    }

}
