package main;

//import java.util.Scanner;

//import entity.Team;
//import repository.TeamRepository;

import service.TeamService;

public class Test {

		public static void main(String[] args) {
			
			TeamService servise = new TeamService();
//			TeamRepository s= new TeamRepository();
//			s.getMITeamDetails();
			
			servise.printTeamDetails();
			System.out.println("test github");		
			
//				
//			Scanner sc = new Scanner (System.in);
//			System.out.println("Enter a team id :");
//			int id =sc.nextInt(); 
//		
//			
//			sc.close();
			
}
}
