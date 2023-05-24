
public class CarFactory {
static Car c=null;
public static Car getCar(String carType) {
	if(carType.equals("Sedan"))
	{
		//c=new CARENS();
		//return c; (or)
		
		c=new CARENS();
		CARENS ca=(CARENS)c;
		return ca;
	}
	else if(carType.equals("HatchBack")){
		c=new SELTOS();
		SELTOS ca=(SELTOS)c;
		return ca;
	}
	else if(carType.equals("SUV")) {
		c=new CARNIVAL();
		CARNIVAL ca=(CARNIVAL)c;
		return ca;
	}
	else {
		return c;
	}
}


}
