public class Main {
    public static void main(String[] args) {
        // Создание урока
        Lesson lesson = new Lesson("Java Programming", LessonType.LECTURE, Language.EN);
        lesson.displayInfo();

        // Работа с ResearchSupervisor
        try {
            ResearchSupervisor supervisor = new ResearchSupervisor("Dr. Smith", 2);
            supervisor.assignSupervisor();
        } catch (InvalidSupervisorException e) {
            System.out.println(e.getMessage());
        }

        // Работа с ResearchProject
        try {
            ResearchProject project = new ResearchProject("AI Development");
            User student = new Student("Alice", 3.5);
            User researcher = new Researcher("Dr. John", 5);

            project.addParticipant(researcher);
            project.addParticipant(student); // Это вызовет исключение
        } catch (InvalidProjectParticipantException e) {
            System.out.println(e.getMessage());
        }
    }
}
