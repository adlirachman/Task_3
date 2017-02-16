package task3exercise2;


public class StartUp {
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
    //
    private Member[] member = new Member[100];
    private Project[] projectList = new Project[100];
    private int nMember = 0;
    private int nProject = 0;
    private int getNum = 0;
    
    
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
    public void addMember(Member m){
        if(nMember <= member.length){
            m = member[nMember];
            nMember++;
        }
        else{
            System.out.println("Member Full");
        }        
    }
    
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson 
    public Member getMember(int id){
        return member[id];
    }
     
    // NIM : 1301154152
    // NAMA : Valentino Wahyu Gusti Arson  
    public void createNewProject(String projectName){
        if(nProject <= projectList.length){
            Project p = new Project(projectName);
            projectList[nProject] = p;
            nProject++;
        }
        else{
            System.out.println("Project Full");
        }
    }
    
       
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson  
    public Project getProject(int id){
        return projectList[id];       
    }
    
    // NIM : 1301154152
    // NAMA : Valentino Wahyu Gusti Arson  
    public void releaseProject(Project p){
        p.releaseApp();
    }
     
    // NIM : 1301154152 
    // NAMA : Valentino Wahyu Gusti Arson    
    public int getNumReleasedProject(){
        for(int i=0; i <= projectList.length; i++){
            if(getProject(i).isReleased() == true){
                getNum++;
            }
        }
        return getNum;
    }

}
    