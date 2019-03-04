package soumya;

public class AverageNum_Service {
	// Method for finding average
	double numAvg(double[] num) {
		double sum = 0;
		double avg = 0;
		for (int index = 0; index <= num.length - 1; index++) {
			sum = sum + num[index];
			avg = sum / num.length;
		}
		return avg;
	}
}
