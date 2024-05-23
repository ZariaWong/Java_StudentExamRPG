import java.io.*;

public class OfficeCombat {
	public static void main(String[] args) throws IOException {
		BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
		String sg_name = inData.readLine();
		int sg_power = Integer.parseInt(inData.readLine());
		int sg_engeryLevel = Integer.parseInt(inData.readLine());
		String s_name = inData.readLine();
		int s_power = Integer.parseInt(inData.readLine());
		int s_engeryLevel = Integer.parseInt(inData.readLine());
		SecurityGuard sGuard = new SecurityGuard(sg_name, sg_power, sg_engeryLevel);
		Student student = new Student(s_name, s_power, s_engeryLevel);
		System.out.println("Now fighting: " + sGuard.getName() + " vs. " + student.getName());
		int round = 0;
		while (!sGuard.isLose() && !student.isLose()) {
			if (round % 2 == 0) {
				int attackAmount = sGuard.attack();
				student.hurt(attackAmount);
				if (round % 3 == 0) {
					student.hide();
				}
			} else {
				int attackAmount = student.attack();
				sGuard.hurt(attackAmount);
				if (round % 3 == 1) {
					sGuard.boost();
				}
			}
			round++;
		}
		if (sGuard.isLose())
			System.out.println(student.getName() + " wins! Exam paper stolen.");
		else
			System.out.println(sGuard.getName() + " wins! Exam paper is safe.");
	}
}
