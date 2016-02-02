public class AppStore {
	private Application[] appList = new Application[100];
	private int totalApp = 0;
	
	public createNewApp(String appName, int appSize) {
		appList[totalApp] = new Application(appName,appSize);
		totalApp++;
	}
	
	public Application getApp(int id) {
		return appList[id];
	}
	
	public int getTotalApp() {
		return totalApp;
	}
	
	public Application[] getAppList() {
		return appList;
	}
	
	public String toString() {
		return "There are "+totalApp+" application ready to install";
	}
}

