import java.util.*;

class User{
    int id;
    String Name;
    String Role;

    public User(int id, String Name, String Role){
            this.id = id;
            this.Name= Name;
            this.Role= Role;
        }
}

class Bug{
        //id , tittle ,  desription, status , priorty, user assignesTo;
        
        int id;
        String title;
        String description;
        String status;  // "new", "In progress", "resolved"
        String priorty; //"Low", "medium", "High"
        
        User assignedTo;

        public Bug(int id , String description , String title, String status , String priorty , User assignedTo){
            this.id= id;
            this.title= title;
            this.description = description;
            this.status = status;
            this.priorty = priorty;
            this.assignedTo = assignedTo;
        }
}
    class Project{
        int id;
        String name;
        List<Bug> bugs;

        public Project(int id , String name, List<Bug> bugs){
            this.id = id;
            this.name= name;
            this.bugs = new ArrayList<>();
        }
        public void addBug(Bug Bug){
            bugs.add(Bug);
        }
    }
    public class bugTracker{
        List<User> users;
        List<Project> projects;

        public bugTracker(List<User> users , List<Project> Projects){
            users = new ArrayList<>();
            projects = new ArrayList<>(); 
        } 
        public void addUser(User user){
            users.add(user);
        }
        public void addProject(Project project){
            projects.add(project);
        }
        public static void main(String[] args) {
            bugTracker system = new bugTracker(null, null);
            User dev = new User(2, "robert", "developer");
            User tester = new User(1, "Alice", "tester");
            system.addUser(dev);
            system.addUser(tester);

            Project project1 = new Project(1, "bug tracker system", null);
            Bug bug1 = new Bug(1, "Login issue", "Unable to login with given credentials", "New", "High", dev);
            project1.addBug(bug1);
            system.addProject(project1);

            System.out.println("Bug Tracker System with a project and a bug in it");


        }

}