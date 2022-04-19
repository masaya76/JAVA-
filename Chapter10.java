import java.sql.SQLException;

public class Chapter10 {
    public static void main(String[] args) {

        try {
            int array[] = { 1, 3, 5 };
            Chapter10.validIndex(array, 2);
            Chapter10.validIndex(array, 3);
            System.out.println("validIndex end of call");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occrred");
            e.printStackTrace();
        }

        try {
            Chapter10.throwSQLException();
        } catch (SQLException e) {
            System.out.println("SQLException occrred");
            e.printStackTrace();
        } finally {
            System.out.println("throwSQLException end of call");
        }

        System.out.println("The end of mainmethod");
    }

    public static void validIndex(int[] array, int index) {
        if (array.length <= index) {
            throw new IllegalArgumentException(index + "is out size range");
        }
        System.out.println("index" + index + "element" + array[index] + " desu");
    }

    public static void throwSQLException() throws SQLException {

        throw new SQLException("SQL error");
    }
}