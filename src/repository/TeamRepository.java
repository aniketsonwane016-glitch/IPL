package repository;

import entity.Team;

public class TeamRepository {
		
		public static Team getMITeamDetails() {
				
			Team team = new Team();
			
			team.setId(101);
			team.setTeamName("Mumbai Indians");
			team.setCaptainName("Hardik Pandya");
			team.setCoachName("Mahela Jaywardhan");
			team.setQualified(false);
			team.setnRR(2.3f);
			team.setShortName("MI");
			return team;
			
		}
		
		
		public static Team getCSKTeamDetails() {
		
		Team team = new Team();
		
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("Mahendra Singh Dhoni");
		team.setCoachName("Stephen Flaming");
		team.setQualified(true);
		team.setnRR(4.5f);
		team.setShortName("CSK");

		return team;
		}
		
		public static Team getRRTeamDetails() {
			
		Team team = new Team();
		
		team.setId(103);
		team.setTeamName("Rajastahan Royal");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setQualified(false);
		team.setnRR(5.1f);
		team.setShortName("RR");

		return team;
		}
		
		public static Team getKKRTeamDetails() {
			
			Team team = new Team();
			
			team.setId(104);
			team.setTeamName("Kolkata Knight Rider");
			team.setCaptainName("Ajinkya Rahane");
			team.setCoachName("Chandu Borde");
			team.setQualified(false);
			team.setnRR(1.2f);
			team.setShortName("KKR");

			return team;
			}
		
		public static Team getLSGTeamDetails() {
			
			Team team = new Team();
			
			team.setId(105);
			team.setTeamName("Lucknow Super Giants");
			team.setCaptainName("RISHABH PANT");
			team.setCoachName("JUSTIN LANGER");
			team.setQualified(true);
			team.setnRR(1.2f);
			team.setShortName("LSG");

			return team;
			}

		

		public static Team getRCBTeamDetails() {
			
			Team team = new Team();
			
			team.setId(106);
			team.setTeamName("Royal Chanllenger Bengluru");
			team.setCaptainName("Rajat Patidar");
			team.setCoachName("Andy Flower");
			team.setQualified(true);
			team.setnRR(1.2f);
			team.setShortName("RCB");

			return team;
			}
	
		public static Team getDCTeamDetails() {
	
		Team team = new Team();
	
		team.setId(107);
		team.setTeamName("Delhi Capital");
		team.setCaptainName("Axar Patel");
		team.setCoachName("Hemang Badani");
		team.setQualified(false);
		team.setnRR(1.2f);
		team.setShortName("DC");

		return team;
	}
		
		public static Team getPKTeamDetails() {
			
			Team team = new Team();
			
			team.setId(108);
			team.setTeamName("Punjab Kings XI");
			team.setCaptainName("Shreyas ayyar");
			team.setCoachName("Ricky Ponting");
			team.setQualified(true);
			team.setnRR(3.4f);
			team.setShortName("PKXI");

			return team;
			}
		
		public static Team getGTTeamDetails() {
			
			Team team = new Team();
			
			team.setId(109);
			team.setTeamName("Gujrat Titans");
			team.setCaptainName("Shubhman Gill");
			team.setCoachName("Ashish Nehra");
			team.setQualified(false);
			team.setnRR(1.2f);
			team.setShortName("GT");

			return team;
			}
		
		public static Team getSRHTeamDetails() {
			
			Team team = new Team();
			
			team.setId(110);
			team.setTeamName("SunRisers Hyderbad");
			team.setCaptainName("Pat Cummins");
			team.setCoachName("Daniel Vettori");
			team.setQualified(false);
			team.setnRR(3.4f);
			team.setShortName("SRH");

			return team;
			}	
}
			// add similar methods for remaning 9 teams

