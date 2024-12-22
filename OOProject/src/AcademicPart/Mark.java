package AcademicPart;
import java.util.HashMap;
import java.util.Map;

class Mark {
    private String courseName;
    private Map<String, double[]> studentMarks;
    //constructor
    public Mark(String courseName) {
        this.courseName = courseName;
        this.studentMarks = new HashMap<>();
    }
    
    //main methods
    public void setStudentMarks(String studentName, double firstAssessment, double secondAssessment, double finalExam) {
        studentMarks.put(studentName, new double[]{firstAssessment, secondAssessment, finalExam});
    }
    public double[] getStudentMarks(String studentName) {
        return studentMarks.get(studentName);
    }
    public double calculateTotal(String studentName) {
        double[] marks = getStudentMarks(studentName);
        return marks[0] * 0.3 + marks[1] * 0.3 + marks[2] * 0.4;
    }
    
    @Override
    public String toString() {
        return "Mark:" + "courseName=" + courseName + ", studentMarks=" + studentMarks;
    }
}
