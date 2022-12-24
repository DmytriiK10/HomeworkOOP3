package Classroom;

public class ExcelentPupil extends Pupil{
    @Override
    void relax() {
        System.out.println("Відмінний учень відпочиває на 1 ");

    }

    @Override
    void write() {
        System.out.println("Відмінний ученнь пише на 5 ");
    }
    @Override
    void study() {

        System.out.println("Відмінний ученнь вчиться на 5 ");
    }

    @Override
    void read() {
        System.out.println("Відмінний ученнь читає на 5 ");

    }


}
