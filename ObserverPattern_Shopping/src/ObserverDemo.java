
public class ObserverDemo {

	public static void main(String[] args) {
		SubjectMallCamera s = new SubjectMallCamera();
		new AlarmObserver(s);
		new DoorLockObserver(s);
		
		s.setVideoPath("video1");
	}

}
