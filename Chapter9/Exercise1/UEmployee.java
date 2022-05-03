class UEmployee {

    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return "Name: "+this.name+"\t Salary: "+this.salary;
    }

}
