import java.util.ArrayList;

public class SubjectMallCamera {
	private String videoPath;
	private ArrayList<MallCameraObserver> observers = new ArrayList<MallCameraObserver>();
	
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
		notifyObservers();
	}
	public void notifyObservers(){
		for(int i=0; i<observers.size(); i++){
			observers.get(i).update();
		}
	}
	
	public void attach(MallCameraObserver o){
		this.observers.add(o);
	}
}