public class zadanie3 {

    public static void main(String[] args) {
        int max = -16;
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30) - 15);
            System.out.print(" " + array[i]);
            if (array[i] > max) max = array[i];
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > max) count += 1;
        }
        System.out.println("\n" + "Количество элементов по модулю больших, чем максимальный = " + count);
    }
}

