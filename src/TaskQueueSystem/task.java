package TaskQueueSystem;

public class task {
    private String description ;
    public int id ;


   @Override
    public String toString() {
        return "task{" +
                "description='" + description  +
                ", id=" + id +
                '}';
    }
    task(int id , String description){
       this.id=id;
       this.description=description;

    }
}
