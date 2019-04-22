package overview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		Theatre theatre=new Theatre("Olympian",8,12);

/*		List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.getseats());
		printList(seatCopy);
		
		Collections.shuffle(seatCopy);
		
		System.out.println("Shuffled");
		printList(seatCopy);
		
		System.out.println("Sorted using swap method of Collections interface");
		sortList(seatCopy);
		printList(seatCopy);
		
		Theatre.Seat minSeat=Collections.min(theatre.seats);
		Theatre.Seat maxSeat=Collections.max(theatre.seats);
		
		
		System.out.println("Min "+minSeat.getSeatNumber());
		System.out.println("Max "+maxSeat.getSeatNumber());*/
		
		
		
theatre.getseats();
		
		
		if(theatre.reserveSeats("H10")) {
			System.out.println("Seat H10 reserved. Please Pay");
			
		}else {
			System.out.println("The seat is already taken"); 
		
		}
		
		
		if(theatre.reserveSeats("A05")) {
			System.out.println("Seat A5 reserved. Please Pay");
			
		}else {
			System.out.println("The seat is already taken"); 
		
		}
		
		if(theatre.reserveSeats("A05")) {
			System.out.println("Seat A5 reserved. Please Pay");
			
		}else {
			System.out.println("The seat is already taken"); 
		
		}
		
		
		List<Theatre.Seat> reverseSeats=new ArrayList<>(theatre.getseats());
		Collections.reverse(reverseSeats);
//		printList(reverseSeats);
		Collections.sort(reverseSeats);
//		printList(reverseSeats);
		
		
		List<Theatre.Seat> priceSeats=new ArrayList<>(theatre.getseats());
		priceSeats.add(theatre.new Seat("A00",0.0d));
		priceSeats.add(theatre.new Seat("B00",0.0d));
		Collections.sort(priceSeats,Theatre.PRICE_ORDER);
		printList(priceSeats);
		
	}
	
	
	
	public static void printList(List<Theatre.Seat> Seat) {
		
		for(Theatre.Seat seat: Seat) {
			
			System.out.print(" "+seat.getSeatNumber()+" "+seat.getPrice());
			
		}
		
		System.out.println();
		System.out.println("=======================================================================");
		
		
	}
	
	public static void sortList(List<? extends Theatre.Seat> list) {
		
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1;j<list.size();j++) {
				
				
				if(list.get(i).compareTo(list.get(j))>0) {
					Collections.swap(list, i, j);
				}
			}
		}
	}
	
	

}
