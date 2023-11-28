package pojo;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cache.cfg.*;
import org.hibernate.cfg.Configuration;

public class AppMain {
	private Session session;
    private SessionFactory sesfact; 
    private Transaction tx;
    public AppMain() {
        sesfact = new Configuration().configure("Hiber.cfg.xml").buildSessionFactory();
    }
    public void insert() {
        session = sesfact.openSession();
        tx = session.beginTransaction();
        CustomerDetails customer = new CustomerDetails();
        customer.setCode("C1001");
        customer.setName("killer");
        customer.setPhoneno("9768443546");
        customer.setAddress("Banglore");
        
        
        CustomerDetails customer1 = new CustomerDetails();
        customer1.setCode("C1002");
        customer1.setName("Faltooz");
        customer1.setPhoneno("8354355687");
        customer1.setAddress("Delhi");
        
        
        ItemDetails item1 = new ItemDetails();
        item1.setItemcode("I10001");
        item1.setItemname("Laptop");
        item1.setItemprice(60000);
        item1.setQoh(2);
        item1.setCustobj(customer);
        
        ItemDetails item2 = new ItemDetails();
        item2.setItemcode("I10002");
        item2.setItemname("Mouse");
        item2.setItemprice(150);
        item2.setQoh(2);
        item2.setCustobj(customer);
        
        
        ItemDetails item3 = new ItemDetails();
        item3.setItemcode("I10003");
        item3.setItemname("Mobile");
        item3.setItemprice(60000);
        item3.setQoh(2);
        item3.setCustobj(customer1);
        
        ItemDetails item4 = new ItemDetails();
        item4.setItemcode("I10004");
        item4.setItemname("Charger");
        item4.setItemprice(600);
        item4.setQoh(2);
        item4.setCustobj(customer1);
        
        Set<ItemDetails> set = new HashSet<ItemDetails>();
        set.add(item1);
        set.add(item2);
        customer.setItemobj(item3);
        customer.setItemobj(item4);

 
        Set<ItemDetails> set1 = new HashSet<ItemDetails>();
        set1.add(item3);
        set1.add(item4);
        customer1.setItemobj(item1);
        customer1.setItemobj(item2);
        session.save(customer);
        session.save(customer1);
        session.getTransaction().commit();
        session.close();
        
        
        
    }
    
    
    public void retreiveallItems() {
    
        
        
    }
	
	
    }

