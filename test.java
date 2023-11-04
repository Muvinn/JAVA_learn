// test
public class test {
    public static void main(String[] args) {
        //다차원 배열 순회
        String[][] seats = new String[][] {
            {"a1", "a2", "a3", "a4", "a5"},
            {"b1", "b2", "b3", "b4", "b5"},
            {"c1", "c2", "c3", "c4", "c5"}
        };

    for (int i =0; i < 3; i++){
        for (int j = 0; j < 5; j++)
            System.out.println(seats[i][j] + " ");
    }
            //System.out.println();

    }
}
