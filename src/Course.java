public class Course {
    Teacher teacher;

    String name;
    String code;
    String prefix;
    int note = -1;
    int vivaVoce = -1;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        }
        else {
            System.out.println("Öğretmen ve Ders uyuşmuyor..");
        }
    }

    void printTeacher(Teacher teacher) {
        System.out.println("İsim : " + teacher.name);
        System.out.println("Telefon : " + teacher.mpno);
        System.out.println("Branş : " + teacher.branch);
    }

}
