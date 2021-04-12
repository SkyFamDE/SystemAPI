/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.mysql;

import de.skyfam.api.systemapi.SystemAPI;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Language {

    public String getGerman(String Name) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlLanguage.getStatement("SELECT * FROM German WHERE NAME=?");
            preparedStatement.setString(1, Name);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getString("TEXT");
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public String getBritain(String Name) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlLanguage.getStatement("SELECT * FROM English WHERE NAME=?");
            preparedStatement.setString(1, Name);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getString("TEXT");
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public String getSwitzerland(String Name) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlLanguage.getStatement("SELECT * FROM Switzerland WHERE NAME=?");
            preparedStatement.setString(1, Name);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return resultSet.getString("TEXT");
            }
        } catch(Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public String getMessage(String Username, String messageCode) {

        try {
            PreparedStatement preparedStatement = SystemAPI.getInstance().sqlSystem.getStatement("SELECT * FROM Players WHERE USERNAME='" + Username + "'");

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                if (resultSet.getString("LANGUAGE") == "de-DE") {
                    getGerman(messageCode);
                } else if (resultSet.getString("LANGUAGE") == "de-CH") {
                    getSwitzerland(messageCode);
                } else if (resultSet.getString("LANGUAGE") == "en-GB") {
                    getBritain(messageCode);
                } else {
                    getBritain(messageCode);
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

}
