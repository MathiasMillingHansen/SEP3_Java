package UserSystemStack.PersistenceTier.Application.DAOs;

import UserSystemStack.PersistenceTier.Application.DAOs.Interfaces.IUserDao;
import UserSystemStack.PersistenceTier.Database.ConnectionPool;
import UserSystemStack.Shared.DTOs.LoginDto;
import UserSystemStack.Shared.DTOs.RegisterDto;
import UserSystemStack.Shared.DTOs.UserDto;
import UserSystemStack.Shared.DTOs.UserInfoDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao implements IUserDao {
    @Override
    public UserInfoDto getUserInfo(UserDto userDto){
        String sql = "SELECT username, email, phone_number FROM users WHERE username = ?";

        try (Connection conn = ConnectionPool.getDataSource().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, userDto.getUsername());

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new UserInfoDto(
                            rs.getString("username"),
                            rs.getString("email"),
                            rs.getString("phone_number")
                    );
                } else {
                    // Handle the case where the result set is empty
                    throw new SQLException("username does not exist");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Internal Database Error");
        }
    }

    @Override
    public boolean login(LoginDto loginDto) {
        String sql = "SELECT EXISTS (SELECT 1 FROM users WHERE username = ? AND password = ?)";
        try (Connection conn = ConnectionPool.getDataSource().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, loginDto.getUsername());
            pstmt.setString(2, loginDto.getPassword());

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getBoolean(1);
                } else {
                    // Handle the case where the result set is empty
                    throw new SQLException("username or password is incorrect");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Internal Database Error");
        }
    }

    @Override
    public boolean register(RegisterDto registerDto) {
        String sql = "INSERT INTO users (username, password, email, phone_number) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionPool.getDataSource().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, registerDto.getUsername());
            pstmt.setString(2, registerDto.getPassword());
            pstmt.setString(3, registerDto.getEmail());
            pstmt.setString(4, registerDto.getPhoneNumber());

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                return true;
            } else {
                // Handle the case where no rows are affected
                throw new SQLException("Provided username or password already exists");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Internal Database Error");
        }
    }

    @Override
    public boolean userExists(String username) {
        String sql = "SELECT EXISTS (SELECT 1 FROM users WHERE UPPER(username) = UPPER(?))";
        try (Connection conn = ConnectionPool.getDataSource().getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, username);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getBoolean(1);
                } else {
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Internal Database Error");
        }
    }

}
