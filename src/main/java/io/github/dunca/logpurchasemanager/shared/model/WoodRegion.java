package io.github.dunca.logpurchasemanager.shared.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import io.github.dunca.logpurchasemanager.shared.model.interfaces.Model;
import lombok.Data;

@Data
@DatabaseTable
public final class WoodRegion implements Model {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false)
    private String name;

    @DatabaseField(canBeNull = false)
    private String symbol;

    public WoodRegion(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    WoodRegion() {

    }

    @Override
    public String toString() {
        return name;
    }
}
