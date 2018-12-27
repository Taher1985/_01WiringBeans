package _06_com.spring.initdestroyBeans;

public class _01Auditorium {
	
	private String lifeCycle;
	
	public String getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(String lifeCycle) {
		System.out.println("settter called before init-method");
		this.lifeCycle = lifeCycle;
	}

	public void turnOnLights(){
		System.out.println("Turn on the lights");
	}
	
	public void turnOffLights(){
		System.out.println("Turn off the lights");
	}
}
