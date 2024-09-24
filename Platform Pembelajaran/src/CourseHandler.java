import java.util.ArrayList;
import java.util.List;

public class CourseHandler {
    //set material 
    //set student 
    //set teacher
    private List<Course> coursesList;
    private List<Person> personList;

    public CourseHandler() {
        coursesList = new ArrayList<>();
        personList = new ArrayList<>();
    }


    public void addKursus(Course course) {
        coursesList.add(course);
    }

    public void Matematika(Mathematic Mathematic){
        
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void showAllCourses() {
        for (Course kursus : coursesList) {
            kursus.tampilkanKursus();
            System.out.println();
        }
    }

    public void showAllPersons() {
        for (Person person : personList) {
            System.out.println("Person: " + person.getName());
        }
    }
}