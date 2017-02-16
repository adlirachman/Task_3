package task3exercise1;

public class AppStore {
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
    private Application[] appList = new Application[100];
    private int totalApp;
    private int i;
    
    // NIM : 1301154152
    // NAMA : Valentino Wahyu Gusti Arson  
    public void createNewApp(String appName, int appSize){
        Application newApp = new Application(appName, appSize);
        for(int i = 1; i < appList.length; i++){
            if(appList[i] == null){
                appList[i] = newApp;
                this.totalApp = i;
                break;
            }
        }
    }
    
    // NIM : 1301154152
    // NAMA : Valentino Wahyu Gusti Arson  
    public Application getApp(int id){
        return appList[id];
    }
    
    public int getTotalApp(){
        return totalApp;
    }
    
    public Application getAppList(){
        for(int p = 0; p <= this.i; p++){
            return appList[p];
        }
        return null;
    }
    
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
    @Override
    public String toString() {
        return  ("Terdapat "+totalApp+" Aplikasi yang siap diinstall");
    }
}
