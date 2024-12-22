package AcademicPart;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

class Lesson {
    private String courseName;
    private String type; // Lecture, Practice, etc.
    private Date date;
    private String time;
    private Map<String, String> studentSchedule;
    public Lesson(String courseName, String type, Date date, String time) {
        this.courseName = courseName;
        this.type = type;
        this.date = date;
        this.time = time;
        this.studentSchedule = new HashMap<>();
    }
    //getters
    public String getCourseName() {
        return courseName;
    }
    public String getType() {
        return type;
    }
    public Date getDate() {
        return date;
    }
    public String getTime() { 
    	return time;
    }
    
    //other methods
    public void setStudentSchedule(String student, String schedule) {
        studentSchedule.put(student, schedule);
    }
    public String getStudentSchedule(String student) {
        return studentSchedule.getOrDefault(student, "No schedule assigned");
    }
    
    @Override
    public String toString() {
        return "Lesson:" + " course name=" + courseName + ", type=" + type + ", date=" + date + ", time=" + time;
    }
}