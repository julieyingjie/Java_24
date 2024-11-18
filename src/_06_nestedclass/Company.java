package _06_nestedclass;

public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public void fire(Employee employee) {
        System.out.println(name + " fire " + employee.no);
//        employee.show();
    }

    public class Employee{
        private int no;

        public Employee(int no){
            class A{

            }
            this.no = no;
        }

        public void show(){
            System.out.println(name + " : " + no);
        }
    }
}
