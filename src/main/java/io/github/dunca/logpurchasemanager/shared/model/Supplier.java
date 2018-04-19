package io.github.dunca.logpurchasemanager.shared.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import io.github.dunca.logpurchasemanager.shared.model.interfaces.Model;
import lombok.Data;

@Data
@DatabaseTable
public final class Supplier implements Model {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false)
    private String name;

    @DatabaseField(canBeNull = false)
    private String street;

    @DatabaseField(canBeNull = false)
    private String country;

    @DatabaseField(canBeNull = false)
    private String address;

    @DatabaseField(canBeNull = false)
    private String code;

    public Supplier(String name, String street, String country, String address, String code) {
        this.name = name;
        this.street = street;
        this.country = country;
        this.address = address;
        this.code = code;
    }

    Supplier() {

    }

    @Override
    public String toString() {
        return name;
    }
}
