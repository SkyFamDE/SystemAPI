/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.mysql;

import de.skyfam.api.systemapi.SystemAPI;
import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_System {

    /* System | User */
    public boolean userExist(Player player) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Players WHERE UUID=?");
            preparedStatement.setString(1, player.getUniqueId().toString());

            ResultSet resultSet = preparedStatement.executeQuery();
            boolean user = resultSet.next();

            resultSet.close();
            resultSet.close();


            return user;
        } catch(Exception exception) {
            System.out.println(SystemAPI.getInstance().strings.System + "§4GET USER ERROR");
            exception.printStackTrace();
        }

        return false;
    }

    public void createUser(Player player) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("INSERT INTO Players VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, player.getUniqueId().toString()); //UUID
            preparedStatement.setString(2, player.getName()); //USERNAME
            preparedStatement.setString(3, null); //FIRST_JOIN
            preparedStatement.setString(4, null); //LAST_JOIN
            preparedStatement.setString(5, null); //LAST_LOGOUT
            preparedStatement.setInt(6, 0); //BANS
            preparedStatement.setInt(7, 0); //MUTES
            preparedStatement.setInt(8, 0); //WARNS
            preparedStatement.setString(9, "de_DE"); //LANGUAGE
            preparedStatement.setString(10, "you"); //SALUTATION
            preparedStatement.setInt(11, 1); //RANK
            preparedStatement.setInt(12, 0); //VERIFY_DC
            preparedStatement.setInt(13, 0); //VERIFY_WEB
            preparedStatement.setString(14, "0"); //ONLINE_TIME
            preparedStatement.setInt(15, 0); //ONLINE_STATUS

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch(Exception exception) {
            System.out.println(SystemAPI.getInstance().strings.System + "§4CREATE USER ERROR");
            exception.printStackTrace();
        }

    }

    public String getLanguage(String UUID) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Players WHERE UUID=?");
            preparedStatement.setString(1, UUID);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getString("LANGUAGE");
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public String getSalutation(String UUID) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Players WHERE UUID=?");
            preparedStatement.setString(1, UUID);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getString("SALUTATION");
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    /* Command | Active */
    public boolean isCommandActive(String Name) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Commands WHERE NAME=?");
            preparedStatement.setString(1, Name);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getInt("ACTIVE") == 1;
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return false;
    }

    /* Command | Beta */
    public boolean isCommandBeta(String Name) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Commands WHERE NAME=?");
            preparedStatement.setString(1, Name);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getInt("BETA") == 1;
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return false;
    }

    /* Command | Production */
    public boolean isCommandProduct(String Name) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Commands WHERE NAME=?");
            preparedStatement.setString(1, Name);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getInt("PRODUCTION") == 1;
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return false;
    }

    /* Comment | Get */
    public String getComment(String Comment) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Comments WHERE COMMENT=?");
            preparedStatement.setString(1, Comment);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getString("INPUT");
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

}