public class Student {
    Course mat;
    Course fizik;
    Course tarih;

    String name;
    String stuNo;

    double average;

    Boolean isPass;
    Boolean isAllNotesOk = false;

    Student(String name, String stuNo, Course mat,Course fizik,Course tarih){
        this.name = name;
        this.stuNo = stuNo;

        this.mat = mat;
        this.fizik = fizik;
        this.tarih = tarih;
    }

    void addBulkExamNote(int mat,int matVoce, int fizik, int fzkVoce, int tarih, int trhVoce) {


        if(mat >= 0 && mat <=100) {
            this.mat.note = mat;
        }

        if(matVoce >= 0 && matVoce <=100) {
            this.mat.vivaVoce = matVoce;
        }

        if(fizik >= 0 && fizik <=100) {
            this.fizik.note = fizik;
        }

        if (fzkVoce >= 0 && fzkVoce <= 100) {
            this.fizik.vivaVoce = fzkVoce;
        }

        if (tarih >= 0 && tarih <= 100) {
            this.tarih.note = tarih;
        }

        if (trhVoce >= 0 && trhVoce <= 100){
            this.tarih.vivaVoce = trhVoce;
        }
        allNotes();


    }

    void calcAverage() {
        double matTotal = (this.mat.vivaVoce * 0.2) + (this.mat.note * 0.8);
        double fizikTotal = (this.fizik.vivaVoce * 0.2) + (this.fizik.note * 0.8);
        double tarihTotal = (this.tarih.vivaVoce * 0.2) + (this.tarih.note * 0.8);

        this.average = (matTotal + fizikTotal + tarihTotal) / 3;
    }

    void isPass () {
       if (!isAllNotesOk){
           System.out.println("Henüz tüm notlar girilmemiş.");
       }
        else {
            System.out.println("Ortalamanız : " + (int)this.average);
            if (average < 55) {
                System.out.println("Sınıfı geçemediniz.");
                this.isPass = false;
            }
            else {
                System.out.println("Başarıyla geçtiniz.");
                this.isPass = true;
            }
        }

    }

    void printNote() {
        if(isAllNotesOk) {
            System.out.println("Öğrenci : " + this.name);
            System.out.println("Matematik Sınav : " + this.mat.note);
            System.out.println("Matematik Sözlü : " + this.mat.vivaVoce);

            System.out.println("Fizik Sınav : " + this.fizik.note);
            System.out.println("Fizik Sözlü : " + this.fizik.vivaVoce);

            System.out.println("Tarih Sınav : " + this.tarih.note);
            System.out.println("Tarih Sözlü : " + this.tarih.vivaVoce);
        }
        else
        {
            System.out.println("Henüz tüm notlar girilmemiş.");
        }
    }

    void allNotes() {
        if(!(this.mat.note == -1 || this.mat.vivaVoce == -1 || this.fizik.note == -1 || this.fizik.vivaVoce == -1 || this.tarih.note == -1 || this.tarih.vivaVoce == -1)) {
            isAllNotesOk = true;
        }

    }


}
