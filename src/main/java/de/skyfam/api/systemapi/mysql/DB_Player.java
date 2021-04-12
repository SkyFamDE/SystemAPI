/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.mysql;

import de.skyfam.api.systemapi.SystemAPI;
import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Player {

    public boolean userExist(String UUID) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Players WHERE UUID=?");
            preparedStatement.setString(1, UUID);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
                return resultSet.getString("UUID") != null;
        } catch(Exception exception) {
            System.out.println(SystemAPI.getInstance().strings.System + "§4GET USER ERROR");
            exception.printStackTrace();
        }

        return false;
    }

    public void createUser(String UUID, String Username) {

        try {
            if(!userExist(UUID)) {
                PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("INSERT INTO Players VALUES (" + "'" + UUID + "', " + "'" + Username + "', " + "'" + System.currentTimeMillis() + "', " + "'" + System.currentTimeMillis() + "', " + "'null', " + "'0', " + "'0', " + "'0', " + "'de_DE', " + "'you', " + "'1', " + "'0', " + "'0', " + "'0', " + "'0')");

                preparedStatement.executeUpdate();
                preparedStatement.close();
            } else {
                updateUser(UUID, Username);
                SystemAPI.getInstance().loginDatabase.updateFirstLogin(UUID);
            }
        } catch(Exception exception) {
            System.out.println(SystemAPI.getInstance().strings.System + "§4CREATE USER ERROR");
            exception.printStackTrace();
        }

    }


    public void updateUser(String UUID, String Username) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("UPDATE Players SET USERNAME='" + Username + "' WHERE UUID='" + UUID + "'");

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch(Exception exception) {
            exception.printStackTrace();
        }

    }

}
