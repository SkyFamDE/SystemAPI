/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.mysql;

import de.skyfam.api.systemapi.SystemAPI;
import org.bukkit.Bukkit;

import java.sql.*;

public class MySQL_ACP {

    public String host;
    public Integer port;
    public String username;
    public String password;

    public Connection connection;

    public boolean isConnected() {
        return connection != null;
    }

    public MySQL_ACP(String HOST, Integer PORT, String USERNAME, String PASSWORD) {
        this.host = HOST;
        this.port = PORT;
        this.username = USERNAME;
        this.password = PASSWORD;

        this.connect();
    }

    public void connect() {

        if(!isConnected()) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/acp", this.username, this.password);
                Bukkit.getConsoleSender().sendMessage(SystemAPI.getInstance().strings.System + "§aAdmin Control Panel");
                Bukkit.getConsoleSender().sendMessage(SystemAPI.getInstance().strings.System + "Die MySQL Datenbank hat sich erfolgreich verbunden und wird nun benutzt!");
            } catch(SQLException exception) {
                Bukkit.getConsoleSender().sendMessage(SystemAPI.getInstance().strings.System + "§aAdmin Control Panel");
                Bukkit.getConsoleSender().sendMessage(SystemAPI.getInstance().strings.System + "Die MySQL Datenbank hatte einen Fehler beim Vebinden...");
                exception.printStackTrace();
            }
        }

    }

    public void disconnect() {

        if(isConnected()) {
            try {
                connection.close();
                Bukkit.getConsoleSender().sendMessage(SystemAPI.getInstance().strings.System + "§aAdmin Control Panel");
                Bukkit.getConsoleSender().sendMessage(SystemAPI.getInstance().strings.System + "Die MySQL Datenbank wurde erfolgreich getrennt!");
            } catch(SQLException exception) {
                Bukkit.getConsoleSender().sendMessage(SystemAPI.getInstance().strings.System + "§aAdmin Control Panel");
                Bukkit.getConsoleSender().sendMessage(SystemAPI.getInstance().strings.System + "Die MySQL Datenbank konnte nicht getrennt werden...");
                exception.printStackTrace();
            }
        }

    }

    public PreparedStatement getStatement(String sqlStatement) {

        if(isConnected()) {
            PreparedStatement preparedStatement;

            try {
                preparedStatement = connection.prepareStatement(sqlStatement);
                return preparedStatement;
            } catch(SQLException exception) {
                exception.printStackTrace();
            }
        }

        return null;
    }

    public ResultSet getResult(String sqlResult) {

        if(isConnected()) {
            PreparedStatement preparedStatement;
            ResultSet resultSet;

            try {
                preparedStatement = getStatement(sqlResult);
                resultSet = preparedStatement.executeQuery();

                return resultSet;
            } catch(SQLException exception) {
                exception.printStackTrace();
            }
        }

        return null;
    }

}
