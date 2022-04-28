package nttdata.bootcamp.programa.funcional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
	 public static void main(String[] args) {
	      List<Producto> shopping = List.of(
	      new Producto("Clothes", new BigDecimal("15.90"), Impuesto.NORMAL),
	      new Producto("Bread", new BigDecimal("1.5"), Impuesto.SUPERREDUCED),
	      new Producto("Meat", new BigDecimal("13.99"), Impuesto.REDUCED),
	      new Producto("Cheese", new BigDecimal("3.59"), Impuesto.SUPERREDUCED),
	      new Producto("Coke", new BigDecimal("1.89"), Impuesto.REDUCED),
	      new Producto("Whiskey", new BigDecimal("19.90"), Impuesto.NORMAL));
	      
	      //// Implementacion
	      
	     ArrayList<String> lista = new ArrayList <String>();
	     lista.add("Clothes");
	     lista.add("Bread");
	     lista.add("Meat");
	     lista.add("Cheese");
	     lista.add("Coke");
	     lista.add("Whiskey");
	    
	     Object ListaProductoC = shopping.stream()
	    		 .filter(c-> c.name.startsWith("C"))
	    		 .map(d -> d.name)
	    		 .sorted()

	    		 .collect(Collectors.toList());
	     System.out.println("Los productos que empiezan por C son: "+ ListaProductoC.toString());
	     
	     Object PrecioTotal=shopping
	    		 .stream()
	    		 .map(x->x.price.add(x.price.multiply( BigDecimal.valueOf(( x.impuesto.getPercent()*0.01 )))))
	    		 .reduce(BigDecimal.ZERO, BigDecimal::add);
	     
	    		 
	     
	     
	    		 
	    		 
	    System.out.println("El precio es: "+ PrecioTotal);

	    	
	    	
	    }
	     
	    	  }
        







