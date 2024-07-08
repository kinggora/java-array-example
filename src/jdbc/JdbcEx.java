package jdbc;

import jdbc.vo.Member;

import java.sql.*;
import java.util.Scanner;

public class JdbcEx extends MemberDB {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==회원 정보 입력 후 조회===");
        Member insertMember = inputMemberInfo();
        memberInsert(insertMember);
        memberSearch();
        System.out.println("==회원 정보수정 후 조회===");
        Member updateMember = inputMemberInfo();
        memberUpdate(updateMember);
        memberSearch();
        System.out.println("==회원 정보삭제 후 조회===");
        int id = inputMemberId();
        memberDelete(id);
        memberSearch();
    }

    private static Member inputMemberInfo() {
        System.out.print("id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("job: ");
        String job = sc.nextLine();
        return new Member(id, name, job);
    }

    private static int inputMemberId() {
        System.out.print("id: ");
        return Integer.parseInt(sc.nextLine());
    }

    private static void memberInsert(Member member) {
        String query = "INSERT INTO member VALUES (?,?,?)";
        Connection con = open();

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getJob());

            int result = pstmt.executeUpdate();
            if (result == 1) {
                System.out.println("회원 정보가 입력되었습니다.");
            } else if (result == 0) {
                System.out.println("회원 정보 입력에 실패했습니다.");
            }
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
    }

    private static void memberUpdate(Member member) {
        String query = "UPDATE member SET name = ?, job = ? WHERE id = ?";
        Connection con = open();

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getJob());
            pstmt.setInt(3, member.getId());

            int result = pstmt.executeUpdate();
            if (result == 1) {
                System.out.println("회원 정보가 수정되었습니다.");
            } else if (result == 0) {
                System.out.println("회원 정보 수정에 실패했습니다.");
            }
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
    }

    private static void memberDelete(int memberId) {
        String query = "DELETE FROM member WHERE id = ?";
        Connection con = open();

        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, memberId);

            int result = pstmt.executeUpdate();
            if (result == 1) {
                System.out.println("회원 정보가 삭제되었습니다.");
            } else if (result == 0) {
                System.out.println("회원 정보 삭제에 실패했습니다.");
            }
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }  finally {
            close();
        }
    }

    private static void memberSearch() {
        String query = "SELECT * FROM member";
        Connection con = open();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job = rs.getString("job");

                Member member = new Member(id, name, job);
                System.out.println(member);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
    }
}


