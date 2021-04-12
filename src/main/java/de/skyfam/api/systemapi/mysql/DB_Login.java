/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.mysql;

import de.skyfam.api.systemapi.SystemAPI;

import java.sql.PreparedStatement;

public class DB_Login {

    /* updateLogin */
    public void updateFirstLogin(String UUID) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("UPDATE Players SET FIRST_JOIN=? WHERE UUID=?");
            preparedStatement.setLong(1, System.currentTimeMillis());
            preparedStatement.setString(2, UUID);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch(Exception exception) {
            exception.printStackTrace();
        }

    }

    public void updateLastLogin(String UUID) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("UPDATE Players SET LAST_JOIN=? WHERE UUID=?");
            preparedStatement.setLong(1, System.currentTimeMillis());
            preparedStatement.setString(2, UUID);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch(Exception exception) {
            exception.printStackTrace();
        }

    }

    public void updateLastLogout(String UUID) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("UPDATE Players SET LAST_LOGOUT=? WHERE UUID=?");
            preparedStatement.setLong(1, System.currentTimeMillis());
            preparedStatement.setString(2, UUID);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch(Exception exception) {
            exception.printStackTrace();
        }

    }

}
