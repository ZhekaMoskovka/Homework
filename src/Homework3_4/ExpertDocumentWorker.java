package Homework3_4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}