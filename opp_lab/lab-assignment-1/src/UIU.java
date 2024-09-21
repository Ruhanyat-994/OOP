// Main class
public class UIU {
    public static void main(String[] args) {
        Department[] departments = new Department[4];
        departments[0] = new CSE();
        departments[1] = new EEE();
        departments[2] = new CIVIL();
        departments[3] = new DATA_SCIENCE();

        for (Department department : departments) {
            department.displayCourses();
            System.out.println();
        }
    }
}


class Course {
    private String courseCode;
    private String courseName;
    private double credits;

    public Course(String courseCode, String courseName, double credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Course Name: " + courseName + ", Credits: " + credits;
    }
}


class Department {
    private String name;
    private Course[] courses;

    public Department(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }

    public void displayCourses() {
        System.out.println("Department: " + name);
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}


class CSE extends Department {
    public CSE() {
        super("CSE", new Course[] {
                new Course("CSE 1115", "OOP", 3.0),
                new Course("CSE 1116", "OOP Lab", 1.0)
        });
    }
}


class EEE extends Department {
    public EEE() {
        super("EEE", new Course[] {
                new Course("EEE 2113", "Electrical Circuits", 3.0),
                new Course("EEE 2123", "Electronics", 3.0)
        });
    }
}


class CIVIL extends Department {
    public CIVIL() {
        super("CIVIL", new Course[] {
                new Course("CE 2171", "Fluid Mechanics", 3.0),
                new Course("CE 2172", "Fluid Mechanics Lab", 1.5)
        });
    }
}


class DATA_SCIENCE extends Department {
    public DATA_SCIENCE() {
        super("DATA_SCIENCE", new Course[] {
                new Course("DS 3521", "Data Visualization", 3.0),
                new Course("DS 3522", "Data Visualization Lab", 1.0)
        });
    }
}
