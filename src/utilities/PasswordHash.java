/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author thanhcanhit
 */
public class PasswordHash {

    public String hashPassword(String password) {
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        return null;
    }
}

//    public static boolean comparePasswords(String password, String hashedPassword) throws NoSuchAlgorithmException {
//        // Băm mật khẩu nhập vào
//        String hashedInputPassword = hashPassword(password);
//
//        // So sánh 2 chuỗi hash
//        return hashedInputPassword.equals(hashedPassword);
//    }

    private static String bytesToHex(byte[] bytes) {
        // Tạo một StringBuilder để lưu trữ kết quả
        StringBuilder sb = new StringBuilder();

        for (byte b : bytes) {
            // Chuyển byte thành giá trị thập lục phân
            int value = b & 0xFF;
            String hex = Integer.toHexString(value);

            // Nếu giá trị thập lục phân có 1 chữ số, thêm 0 ở phía trước
            if (hex.length() == 1) {
                sb.append("0");
            }

            sb.append(hex);
        }

        return sb.toString();
    }
}
