package Documentworker;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть ключ доступу ");
        String code = scan.next();

        if (code.equals("pro") ) {
            ProDocumentWorker documents1 = new ProDocumentWorker();
            System.out.println("Ви можете користуватися версією PRO ");
            documents1.editDocument();
            documents1.saveDocument();

        } else if (code.equals("exp") ) {
            ExpertDocumentWorker documents = new ExpertDocumentWorker();
            System.out.println("Ви можете користуватися версією Expert " );
            documents.saveDocument();
        } else {
            System.out.println("Ви можете користуватися тільки базовою версією ");
            DocumentWorker documents3 = new DocumentWorker();
            documents3.openDocument();
            documents3.editDocument();
            documents3.saveDocument();
        }

        }


    }

