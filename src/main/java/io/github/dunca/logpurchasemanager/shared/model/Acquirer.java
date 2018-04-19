package io.github.dunca.logpurchasemanager.shared.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import io.github.dunca.logpurchasemanager.shared.model.interfaces.Model;
import lombok.Data;

/**
 * Corresponds to a acquirer / user of the mobile application
 */
@Data
@DatabaseTable
public final class Acquirer implements Model {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false)
    private String username;

    @DatabaseField(canBeNull = false)
    private String firstName;

    @DatabaseField(canBeNull = false)
    private String lastName;

    @DatabaseField(canBeNull = false)
    private String password;

    public Acquirer(String username, String firstName, String lastName, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    Acquirer() {

    }

    @Override
    public String toString() {
        return username + String.format(" (%s %s)", firstName, lastName);
    }
}
