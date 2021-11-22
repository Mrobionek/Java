public class Main {
    public static void main(String[] args) {

    Printer firstQueue = new Printer();

        firstQueue.append( "текст документа №1", "Документ №1", 6);
        firstQueue.append("текст документа №2", "Документ №2");
        firstQueue.append("текст документа №3");

        firstQueue.print("Документы на печать: ");
        System.out.println("Всего документов: " + firstQueue.getPendingPagesCount() + " шт.");

        firstQueue.clear();
        System.out.println();
        firstQueue.print("Документы на печать: ");
        System.out.println("Всего документов: " + firstQueue.getPendingPagesCount() + " шт.");

        System.out.println();
        firstQueue.append( "текст документа №1", "Документ №1", 4);
        firstQueue.append("текст документа №2", "Документ №2");
        firstQueue.append("текст документа №3");

        firstQueue.print("Документы на печать: ");
        System.out.println("Всего документов: " + firstQueue.getPendingPagesCount() + " шт.");

        firstQueue.clear();
        System.out.println();
        firstQueue.print("Документы на печать: ");
        System.out.println("Всего документов: " + firstQueue.getPendingPagesCount() + " шт.");

        System.out.println();
        System.out.println("Распечатано документов за все время: " + firstQueue.getTotalPages());

    }
}
