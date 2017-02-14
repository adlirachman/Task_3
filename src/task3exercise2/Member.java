package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301150040 
    // NAMA : M Adli Rachman 
    //
    //------------------- your code here-----------------------
        private String name;
        private String special;
        private int numOfProject;
    //---------------------------------------------------------
    
    // 2. Declare your 2 Constructor here:
    // NIM : 1301150040 
    // NAMA : M Adli Rachman 
    //
    //------------------- your code here-----------------------
    public void Member(String name){
        this.name = name;
    }
    
    public void Member(String name, String special){
        this.name = name;
        this.special = special;
    }
    //---------------------------------------------------------
    

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301150040
    // NAMA : M Adli Rachman 
    //
    //------------------- your code here-----------------------
    public String getName() {
        return name;
    
    }    

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getNumOfProject() {
        return numOfProject;
    }
    public void setNumOfProject(int numOfProject) {        
        this.numOfProject = numOfProject;
    }

    //---------------------------------------------------------
    // 4. Create method toString() : String here:
    // NIM : 1301150040
    // NAMA : M Adli Rachman 
    //
    // returns String that contains member name, specialization,
    // and number of project worked
    //
    // example : "Member Alex specialized in Java Programming, 
    //            worked on 5 project(s)"
    public String toString() {
        //------------------- your code here-----------------------
        System.out.println("Member "+name+" specialized "+special+" Programing and already worked on "+numOfProject+" Project(s)");
        return null;
        
        //---------------------------------------------------------
    }

}
