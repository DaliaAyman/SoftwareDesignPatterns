
public class AlarmObserver extends MallCameraObserver{
	
	public AlarmObserver(SubjectMallCamera snew){
		this.s = snew;
		s.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Camera Detected - Alarm fired.");
	}
	
}
