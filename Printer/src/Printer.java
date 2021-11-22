public class Printer {
    private String queue = "";
    private int PendingPagesCount;
    private int totalPages;

    public void append(String text) {
        append(text, "", 1);
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void append(String text, String name, int count) {
        queue =  queue + "\n" + text + " - " + name + " - " + count + " шт.";
        PendingPagesCount = PendingPagesCount + count;
        totalPages = totalPages + count;
    }
    public void clear() {
        queue = "";
        PendingPagesCount = 0;
    }

    public int getPendingPagesCount() {
        return PendingPagesCount;
    }

    public int getTotalPages() {
        return totalPages;
    }


   public void print(String title) {
            System.out.println(title);
            if(queue.isEmpty()) {
                System.out.println("Очередь пуста");
            } else System.out.println(queue);
        }
}


