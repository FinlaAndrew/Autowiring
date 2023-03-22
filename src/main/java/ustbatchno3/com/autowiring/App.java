package ustbatchno3.com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("application.xml");
    	Notificationservices s = context.getBean(Notificationservices.class);
    	
    	s.Notify();
    }
}
