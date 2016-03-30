
public class DoorLockObserver extends MallCameraObserver{
	
	public DoorLockObserver(SubjectMallCamera snew){
		this.s = snew;
		s.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Camera detected - Door locked");
	}
	
}
