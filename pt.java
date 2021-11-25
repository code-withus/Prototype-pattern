import java.io.*;
import java.util.Scanner;

interface Prototype {

    public Prototype getClone();

}

class EmployeeRecord {

    public int id;
    public String name, designation;
    public double salary;
    public String address;

    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {

        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }
    public EmployeeRecord(){

        System.out.print("");

    }
    void setData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        id = Integer.parseInt(br.readLine());
        System.out.print("\n");


        System.out.print("Enter Employee Name: ");
        name = br.readLine();
        System.out.print("\n");


        System.out.print("Enter Employee Designation: ");
        designation = br.readLine();
        System.out.print("\n");


        System.out.print("Enter Employee Address: ");
        address = br.readLine();
        System.out.print("\n");


        System.out.print("Enter Employee Salary: ");
        salary = Double.parseDouble(br.readLine());
        System.out.print("\n");



    }
    public void record(){
        System.out.println("   Employee Records ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid" + "\t\t" + "Ename" + "\t\t" + "Edesignation" + "\t\t" + "Esalary" + "\t\t" + "Eaddress");
        System.out.println(id + "\t\t" + name + "\t\t" + designation + "\t\t" + salary + "\t\t" + address);
    }
        public void data(){
            System.out.println("   Employee Records ");
            System.out.println("---------------------------------------------");
            System.out.println("Eid" + "\t\t" + "Ename" + "\t\t" + "Edesignation" + "\t\t" + "Esalary" + "\t\t" + "Eaddress");

        }

        public void showDetail() {

            System.out.println(id + "\t\t" + name + "\t\t" + designation + "\t\t" + salary + "\t\t" + address);
        }

   //@Override
	public EmployeeRecord getClone() {

        return new EmployeeRecord(id,name,designation,salary,address);
    }
}
class Employeee
{
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.println("       *****  EMPLOYEE MANAGEMENT SYSTEM  ******");
		System.out.println(" ");
        System.out.println("Enter the number of Employees: ");
        int n;
        n=sc.nextInt();
        EmployeeRecord Emp[]=new EmployeeRecord[n];
		
		System.out.println("\n");
        System.out.println("Enter the Details of Employee");
        int i;
        for(i=0; i<n; i++) {
            Emp[i] = new EmployeeRecord();
            Emp[i].setData();
            Emp[i].record();
        }
		System.out.println("\n");
        System.out.println("\n" + "           *** AFTER CLONING *** ");
		System.out.println("\n");
        EmployeeRecord[] e = new EmployeeRecord[n];
        for(i=0;i<n;i++){

            e[i] = new EmployeeRecord();
            e[i] = Emp[i].getClone();
        }
        for(i=0; i<1; i++) {
            e[i].data();
        }
        for(i=0; i<n; i++) {
            e[i].showDetail();
        }
		System.out.println(" ");
		for(i=0; i<1; i++) {
            e[i].data();
        }
        for(i=0; i<n; i++) {
            e[i].showDetail();
        }


        System.out.println("\n");
    }
    }
