package Classroom;

public class GoodPupil extends Pupil{
    @Override
    void relax() {
        System.out.println("Добрий ученнь відпочиває на 2 ");
    }

    @Override
    void study() {
        System.out.println("Добрий ученнь вчиться на 4 ");
    }

    @Override
    void read() {
        System.out.println("Добрий ученнь читає на 4 ");
    }

    @Override
    void write() {
    System.out.println("Добрий ученнь пише на 4 "); }
}
