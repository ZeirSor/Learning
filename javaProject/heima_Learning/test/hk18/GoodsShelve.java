package test.hk18;

public class GoodsShelve {
    private int size = 0;
    private int maxSize;

    public GoodsShelve(int maxSize) {
        super();
        this.maxSize = maxSize;
    }

    public synchronized boolean addGoods(int num) {
        this.size += num;
        if (!isFull()) {
            System.out.println(Thread.currentThread().getName() + " add " + num + " goods into the shelves. now the size of the shelves is " + this.size);
        } else {
            int overSize = this.size - this.maxSize;
            System.out.println(Thread.currentThread().getName() + " Successfully add " + (num - overSize) + " goods into the Shelve. There are " + overSize
                    + " items left that have not been added.\nThe Goods Shelve is full!");
            this.size = this.maxSize;
            return false;
        }

        return true;
    }

    public boolean isFull() {
        if (this.size >= this.maxSize)
            return true;
        else
            return false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}