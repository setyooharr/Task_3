public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory;
	private int x;
	private int total;

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public Application getApp(int id) {
		return appList[id];
	}

	public int getTotalApp() {
		return totalApp;
	}

	public int getRemainingSize() {
		x = memory;
		for(int i=0; i<appList.length; i++) {
			total+=appList[i];
		}
		return x-=total;
	}


	public addApplication(AppStore appStore,int appId) {
		if(getRemainingSize()>=appStore.getApp[appId].getappSize()) {
			appList[totalApp] = appStore.getApp[appId];
			totalApp++;
		}
	}

	public String toString() {
		return "memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size: "+getRemainingSize+"MB";
	}
}

