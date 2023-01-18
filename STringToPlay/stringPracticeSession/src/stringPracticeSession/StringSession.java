package stringPracticeSession;

public class StringSession {

	public static void main(String[] args)throws Exception {
		String Job_Joining_Year = "05-sep-2022";
		int indexStart = Job_Joining_Year.indexOf("2022");
		
		System.out.println("Starting Index Is: " + indexStart);
		System.out.println();
		System.out.println("Job Joing Year is: " + Job_Joining_Year.substring(indexStart));
		System.out.println("");
		
		String newDate = "12-12-2012";
		
		Thread.sleep(250);
		System.out.println(String.join("/", "12-12-2018"));
		System.out.println("");
		System.out.println(newDate.replaceAll("-", "/"));
		System.out.println("");
		System.out.println(newDate.replaceFirst("2012", "2023"));
		System.out.println("");
		System.out.println("It Is OutPut\n".repeat(3).indent(8));
		System.out.println("");
		System.out.println("*".repeat(15).indent(6));
	}
}
