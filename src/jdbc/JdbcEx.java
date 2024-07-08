package jdbc;

import java.sql.*;

public class JdbcEx {
    public static void main(String[] args) {
        System.out.println("==회원 정보 입력 후 조회===");
        //회원의 정보를 사용자 받는 기능
        //Member 클래스(VO)
        memberInsert();
        memberSearch();
        System.out.println("==회원 정보수정 후 조회===");
        memberUpdate();
        memberSearch();
        System.out.println("==회원 정보삭제 후 조회===");
        memberDelete();
        memberSearch();
    }

    private static void memberInsert() {
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "0909";
        String query = "INSERT INTO member VALUES (?,?,?)";

        Connection con = null;
        PreparedStatement pstmt = null;
        int result = 0;

        try {
            con = DriverManager.getConnection(url, username, password);
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "jha");
            pstmt.setString(3, "student");

            result = pstmt.executeUpdate();
            if (result == 1) {
                System.out.println("회원 정보가 입력되었습니다.");
            } else if (result == 0) {
                System.out.println("회원 정보 입력에 실패했습니다.");
            }
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void memberUpdate() {
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "0909";
        String query = "UPDATE member SET job = ? WHERE id = ?";

        Connection con = null;
        PreparedStatement pstmt = null;
        int result = 0;

        try {
            con = DriverManager.getConnection(url, username, password);
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, "engineer");
            pstmt.setInt(2, 1);

            result = pstmt.executeUpdate();
            if (result == 1) {
                System.out.println("회원 정보가 수정되었습니다.");
            } else if (result == 0) {
                System.out.println("회원 정보 수정에 실패했습니다.");
            }
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void memberDelete() {
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "0909";
        String query = "DELETE FROM member WHERE id = ?";

        Connection con = null;
        PreparedStatement pstmt = null;
        int result = 0;

        try {
            con = DriverManager.getConnection(url, username, password);
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 1);

            result = pstmt.executeUpdate();
            if (result == 1) {
                System.out.println("회원 정보가 삭제되었습니다.");
            } else if (result == 0) {
                System.out.println("회원 정보 삭제에 실패했습니다.");
            }
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void memberSearch() {
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "0909";
        String query = "SELECT * FROM member";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job = rs.getString("job");

                System.out.printf("id : %d, name: %s, job: %s", id, name, job);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}


