import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.example.webservice.AddUserDetailsResponse;
import com.example.webservice.UserDetails;
import com.example.webservice.impl.BankAccountServiceImplService;
import com.example.webservice.impl.IBankAccountService;


class MyAsnchHandler implements AsyncHandler<AddUserDetailsResponse>{

	@Override
	public void handleResponse(Response<AddUserDetailsResponse> res) {
		
		try {
			
			System.out.println("User has been added" + res.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}

public class Client {

	public static void main(String[] args) {
	
		BankAccountServiceImplService service= new BankAccountServiceImplService();
		IBankAccountService port= service.getBankAccountServiceImplPort();
		
		UserDetails user1=new UserDetails();
		user1.setName("Arun");
		user1.setBankBalance(new BigDecimal(10000));
		
		UserDetails user2=new UserDetails();
		user2.setName("Shadiya");
		user2.setBankBalance(new BigDecimal(239000));
		
		MyAsnchHandler async=new MyAsnchHandler();
		port.addUserDetailsAsync(user1, async);
	
		port.addUserDetailsAsync(user2, async);
		
		
		
		System.out.println(port.getUserDetails("Arun").getBankBalance());
		System.out.println(port.getUserDetails("Shadiya").getName());
		
	
	}

}
