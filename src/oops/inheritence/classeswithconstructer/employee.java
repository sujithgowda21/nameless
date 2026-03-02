package oops.inheritence.classeswithconstructer;

public class employee {
    String FirstName;
    String LastName;

    employee(String FirstName, String LastName ){
    this.FirstName=FirstName;
    this.LastName=LastName;
}
}
class job extends employee{
        int Id;

        job(String FirstName, String LastName, int Id){
        super(FirstName, LastName);
        this.Id=Id;

}
void printdetails(){
    System.out.println(" Full Name "+ FirstName +" "+ LastName);

    System.out.println(" the ID is "+ Id);
}

}

class driver{
    public static void main(String[] args) {
        job j1=new job("Sujith","Gowda",215);
        j1.printdetails();

    }
}