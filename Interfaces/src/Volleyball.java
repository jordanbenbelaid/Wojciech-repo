
public class Volleyball implements BallSports, Health{

	@Override
	public void ballSize() {
		System.out.println("Medium sized ball");
	}

	@Override
	public double ballWeight() {
		double x = 0.45;
		return x;
	}

	@Override
	public void heartRate() {
		System.out.println("My resting heart rate is 58");
		
	}

	@Override
	public String eatingRoutine() {
		return "I eat very healthy except on fridays";
	}

}
