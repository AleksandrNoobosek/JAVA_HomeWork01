package lesson2;

public class lesson2 {
    public static void main(String[] args) {
    int N = 1;
    char first = 'A';
    char second = 'B';
    StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if(i%2 != 1){
                sb.append(first);
            }
            else {
                sb.append(second);
            }
        }
        System.out.println(sb);

    }
}
