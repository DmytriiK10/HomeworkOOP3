package Classroom;

public class BadPupil extends Pupil {
    @Override
    void read() {
        System.out.println("Поганий ученнь читає на 3 ");

    }

    @Override
    void write() {
        System.out.println("Поганий ученнь пише на 3 ");
    }

    @Override
    void study() {
        System.out.println("Поганий ученнь вчиться на 3 ");
    }

    @Override
    void relax() {
        System.out.println("Поганий ученнь відпочиває на 5 ");
    }
}
