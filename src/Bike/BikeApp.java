package Bike;

import java.util.Scanner;



public class BikeApp {
     static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of bikes");
		int noofbikes=sc.nextInt();
       Bike[]bike=new Bike[noofbikes];
       boolean exitflag=true;
	    
		while(exitflag=true) {
			getmenu();
		    System.out.println("select an option");
		     int op=sc.nextInt();
		switch(op) {
		case 1:
			addNewBikeDetails(bike);
			
			break;
		case 2:
			SortBikeByName(bike);
			break;
		case 3:
			
			sortBikeByType(bike);
		    break;
		case 4:
			displayBikeDetailsByPrice(bike);
			System.out.println("least Expensive price:"+ bike[0].getPrice());
			System.out.println("most price:" +bike[bike.length-1].getPrice());
		    break;
		case 5:
		int result=SearchByName(bike);
		if(result!=-1) {
			System.out.println("name found:" +result);
		}
		else {
			System.out.print("not found");
		}
		  break;
		
		
		case 6:
			exitflag=false;
			break;
		default:
			break;
			}
		}
		}
	
	
	private static void displayBikeDetailsByPrice(Bike[] bike) {
		// TODO Auto-generated method stub
		
		//Insertionsort
				for(int i=1;i<bike.length;i++) {
					Bike k=bike[i];
					int j=i-1;
					while(j>=0 && bike[j].getPrice() > (k.getPrice()))
					{
						bike[j+1]=bike[j];
						j--;
					}
					bike[j+1]=k;
				}
				
				for (int i = 0; i < bike.length; i++) {
					 System.out.println("bike name:" +bike[i].getName());
			           System.out.println("Bike model:" +bike[i].getModel());
			           System.out.println("Bike Type :" +bike[i].getType());
			           System.out.println("Bike Engine:"  +bike[i].getEngine());
			           System.out.println("Bike price:"  +bike[i].getPrice());
			           
			           
			           
				}
		
	}


	

	


	private static int SearchByName(Bike[] bike) {
		// TODO Auto-generated method stub

		System.out.println("enter searchname");
		String searchname=sc.next();
		
		/*
		 * System.out.println("enter modelname"); String modelname=sc.next();
		 */
		
		
		 
		
		
	System.out.println("enter model name");
	String modelname=sc.next();
		
		
		int first=0;
		int last=bike.length-1;
		while(first<=last) {
			int mid=(last+first)/2;
	    
			if(bike[mid].getName().compareTo(searchname) == 0 && bike[mid].getModel().compareTo(modelname)==0)
			return mid;
			else if
			(bike[mid].getName().compareTo(searchname) > 0 && bike[mid].getModel().compareTo(modelname)>0)
			 last=mid-1;
			else
			first=mid+1;
			}
			
			return -1;
	   
	
		/*int low=0;
		int high=bike.length-1;
		
		while(low<=high) {
			
		int middle=low+(high-low)/2;
		int result=searchname.compareTo(bike[middle].getName());
		if(result ==0)
			return middle;
		if(result>0)
			low=middle+1;
		else
			high=middle-1;}
		return -1;
		
		/*for(int i=0;i<bike.length;i++) {
			if(bike[i].getName().equalsIgnoreCase(searchname))
				return i;
		}
		return -1;*/
		
		
		
	}


	private static void sortBikeByType(Bike[] bike) {
		// TODO Auto-generated method stub
		
		System.out.println("sorted based on Type and CC ");
		for (int i = 0; i < bike.length; i++) {
		
			for(int j=i+1;j<bike.length;j++) {
				
			if(bike[i].getType().compareTo(bike[j].getType())>0  && bike[i].getEngine().compareTo(bike[j].getEngine())>0)
				{
					Bike temp=bike[i];
					bike[i]=bike[j];
					bike[j]=temp;
				}
	
			}
		}
		
		
		/*for(int i=1;i<bike.length;i++) {
			Bike key=bike[i];
			int j=i-1;
while(j>=0 && (key.getType().compareTo(bike[j].getType()) <0 || (key.getType().compareTo(bike[j].getType())==0 && key.getEngine().compareTo(bike[j].getEngine())<0)))
			{
				
				bike[j+1]=bike[j];
				j=j-1;
			}
			bike[j+1]=key;
		}*/
		
		for (int i = 0; i< bike.length; i++) {
			 System.out.println("bike name:" +bike[i].getName());
	           System.out.println("Bike model:" +bike[i].getModel());
	           System.out.println("Bike Type :" +bike[i].getType());
	           System.out.println("Bike Engine:"  +bike[i].getEngine());
	           System.out.println("Bike price:"  +bike[i].getPrice());
	           
	           
	           
		}
	
			
			
		}
		
		

		
		
		
	

	private static void SortBikeByName(Bike[] bike) {
		// TODO Auto-generated method stub
		
		//Insertionsort
	/*	for(int i=1;i<bike.length;i++) {
			Bike k=bike[i];
			int j=i-1;
			while(j>=0 && bike[j].getName().compareTo(k.getName())>0){
				bike[j+1]=bike[j];
				j--;
			}
			bike[j+1]=k;
		}*/
		
		
		 //bubble sort
		
		for(int i=0;i<bike.length;i++)
		{
			for(int j=i+1;j<bike.length;j++) {
				if(bike[i].getName().compareTo(bike[j].getName())>0) {
					Bike temp=bike[i];
					bike[i]=bike[j];
					bike[j]=temp;
				}
			}
		}

		for (int i = 0; i < bike.length; i++) {
			 System.out.println("bike name:" +bike[i].getName());
	           System.out.println("Bike model:" +bike[i].getModel());
	           System.out.println("Bike Type :" +bike[i].getType());
	           System.out.println("Bike Engine:"  +bike[i].getEngine());
	           System.out.println("Bike price:"  +bike[i].getPrice());
	           
	           
	           
		}
	}

	
	  private static void addNewBikeDetails(Bike[] bike) {
		  // TODO Auto-generated
	  
	 for (int i = 0; i < bike.length; i++) {
	  System.out.println("Enter name");
	  String name=sc.next();
	  System.out.println("Enter model");
	
	  String model=sc.next();
	  System.out.println("Enter type");
	 
	 
	   String type=sc.next();
	  System.out.println("Enter Engine");
	  String engine=sc.next();
	  System.out.println("Enter price"); 
	  long price=sc.nextLong();
	  bike[i]=new Bike(name,model,type,engine,price);
	 
	 
	 }
	  }
	 
	private static void getmenu() {
		// TODO Auto-generated method stub
		System.out.println("1.Add new bike details");
		System.out.println("2.Display bike sorted by name");
		System.out.println("3.Display bike sorted by Type and cc");
		System.out.println("4.find least and most expensive store");
		System.out.println("5.search for a bike with name and model");
		System.out.println("6.Exit");
	}
  
	}


