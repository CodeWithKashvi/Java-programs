package lab5;

// Aim: Design a class University with an inner class Department. Inner class should access outer class data.

class University {
    String universityName;
    String location;

    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    class Department {
        String deptName;
        String hodName;

        Department(String deptName, String hodName) {
            this.deptName = deptName;
            this.hodName = hodName;
        }

        void display() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    void createDepartment(String deptName, String hodName) {
        Department d = new Department(deptName, hodName);
        d.display();
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        University u = new University("KIIT", "Bhubaneswar");
        u.createDepartment("CSE", "Dr. S. Das");
    }
}
