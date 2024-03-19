public class Set100Int {
    private boolean[] array = new boolean[100];

    public boolean add(int x) {
        if (0 <= x && x < 100) {
            array[x] = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(int x) {
        if (0 <= x && x < 100) {
            array[x] = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(int x) {
        if (0 <= x && x < 100) {
            return array[x];
        } else {
            return false;
        }
    }
}
