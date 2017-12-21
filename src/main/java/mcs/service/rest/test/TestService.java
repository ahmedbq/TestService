package mcs.service.rest.test;

import javax.ws.rs.Path;
import javax.ws.rs.GET;

import java.util.ArrayList;

import javax.ws.rs.Produces;

/*Path refers to the location where Cars.java is located*/
@Path("/test")
public class TestService {
		
	@GET
	@Path("/get")
	@Produces("application/json")
	public ArrayList<Cars> getCarsInJSON() {
		
		/*Creating an ArrayList*/
		ArrayList<Cars> carList = new ArrayList<Cars>();
		
		carList.add(new Cars("Ford","Mustang",2016));
		carList.add(new Cars("Chrysler","300",2017));
		carList.add(new Cars("Ferrari","Dino",1968));
		carList.add(new Cars("Volkswagen","Jetta",1979));
		carList.add(new Cars("Toyota","Daihatsu Applause",2000));
		carList.add(new Cars("Lamborghini","Aventador",2011));
		carList.add(new Cars("Porsche","718 Cayman",2018));
		carList.add(new Cars("BMW","4 Series",2016));
		carList.add(new Cars("Toyota","Camry",2009));
		carList.add(new Cars("Volkswagen","Beetle",2004));
		
		return carList;
	}

}
