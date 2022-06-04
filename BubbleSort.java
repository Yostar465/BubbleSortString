public class BubbleSort {
    private String[] dataStr;

    // constructor
    public BubbleSort() {
    }

    // Sort String
    public String[] getDataStr() {
        return dataStr;
    }

    public void setDataStr(String[] dataStr) {
        this.dataStr = dataStr;
    }

    public void sortDataStr(int n) {
        int lenDataStr = n;
        for (int i = 0; i < lenDataStr; i++) {
            for (int j = i + 1; j < lenDataStr; j++) {
                if (this.dataStr[i].compareTo(this.dataStr[j]) > 0) {
                    String temp = this.dataStr[i];
                    this.dataStr[i] = this.dataStr[j];
                    this.dataStr[j] = temp;
                }
            }
        }
    }

    public void PrintDataStr() {
        for (String datum : this.dataStr) {
            System.out.println(datum + " ");
        }
    }

    public static void main(String[] args) {
        int[] s = new int[] { 10, 35, 32, 13, 26 };
        String[] nama = { "Adi", "Mang", "Jordy", "Febry", "Sholeh" };
        int b = nama.length;

        BubbleSort _myBubbleStr = new BubbleSort();
        _myBubbleStr.setDataStr(nama);
        _myBubbleStr.sortDataStr(b);
        _myBubbleStr.PrintDataStr();
    }
}