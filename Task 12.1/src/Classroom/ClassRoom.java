package Classroom;
import java.util.Scanner;
public class ClassRoom extends Pupil {

    public static void main(String[] args) {
        Pupil pupil1 = new ExcelentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть оцінку, щоб визначити рівень успішності учнів тієї або іншої групи ");
        int number = scan.nextInt();

        if (number == 5) {
            pupil1.relax();
            pupil1.read();
            pupil1.study();
            pupil1.write();

        }
        if (number == 4) {
            pupil2.relax();
            pupil2.read();
            pupil2.study();
            pupil2.write();

        }
        else if (number == 3) {
            pupil3.relax();
            pupil3.read();
            pupil3.study();
            pupil3.write();
        }

    }
}
