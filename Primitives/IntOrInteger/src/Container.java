public class Container {

    private Integer count;

    public void addCount(int value) {
        if(count != null) {
            count = count + value;
        } else {
            count = value;
        }
    }

    public int getCount() {
        return count;
    }
}
