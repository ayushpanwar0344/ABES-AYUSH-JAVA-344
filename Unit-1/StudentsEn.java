public class StudentsEn {
    
    //In encapsulation the variable will be private and the class will be public

    private int rollNo;
    private String name;
    private int marks;

    //2 method public setter/getter method

public void setRollNo(int rollno) {
    this.rollNo = rollNo;
}

public void setName(String name) {
    this.name = name;
}

public void setMarks(int marks) {
    if(marks>=0 && marks<=100)
    {
        this.marks = marks;
    }
    else {
        System.out.println("Invalid Marks");
    }
}

//getter

public int getRollNo() {
    return rollNo;
}

public String getName() {
    return name;
}

public int getMarks() {
    return marks;
}


    public static void main(String[] args) {
        StudentsEn s = new StudentsEn();
        s.setRollNo(1);
        s.setName("Ayush Panwar");
        s.setMarks(100);

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
        System.out.println(s.getMarks());
    }
}
