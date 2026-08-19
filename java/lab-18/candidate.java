// 74. Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age, Candidate_Weight and
// Candidate_Height data members. Also create a method GetCandidateDetails() and DisplayCandidateDetails(). Create main
// method to demonstrate the Candidate class. (A)

import java.util.*;

class candidate{
	public static void main(){
		candidate2 a = new candidate2();
		a.GetCandidateDetails();
		a.DisplayCandidateDetails();		
}
}
class candidate2{
	int candidate_id;
	String candidate_name;
	int candidate_age;
	double candidate_weight;
	double candidate_height;
void GetCandidateDetails(){
	Scanner sc = new Scanner(System.in);

	System.out.println("Entre the candidate details in id,name,age,weight,height");
	
	 candidate_id=sc.nextInt();
	candidate_name=sc.next();
	candidate_age=sc.nextInt();
	candidate_weight=sc.nextDouble();
	candidate_height=sc.nextDouble();
}
void DisplayCandidateDetails(){
	System.out.println("candidate details");
	System.out.println(candidate_id);
	System.out.println(candidate_name);
	System.out.println(candidate_age);
	System.out.println(candidate_weight);
	System.out.println(candidate_height);
}
}