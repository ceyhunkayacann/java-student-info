public class Main {
    public static void main(String[] args) {
        Course tarih = new Course("Tarih","101","TRH");
        Course mat = new Course("Matematik", "101", "MAT");
        Course fizik = new Course("Fizik", "101", "FZK");

        Teacher trhTeac = new Teacher("Halil","444","TRH");
        Teacher fzkTeac = new Teacher("Albert", "222", "FZK");
        Teacher matTeac = new Teacher("Harezmi", "888", "MAT");

        Student ceyy = new Student("Ceyy","294",mat,fizik,tarih);

        ceyy.addBulkExamNote(80,78,98,100,88,78);
        ceyy.calcAverage();
        ceyy.printNote();
        ceyy.isPass();


    }
}
