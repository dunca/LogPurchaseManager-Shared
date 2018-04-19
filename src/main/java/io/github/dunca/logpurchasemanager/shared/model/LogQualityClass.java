package io.github.dunca.logpurchasemanager.shared.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import io.github.dunca.logpurchasemanager.shared.model.interfaces.Model;
import lombok.Data;

@Data
@DatabaseTable
public final class LogQualityClass implements Model {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false)
    private String symbol;

    @DatabaseField(canBeNull = false)
    private String name;

    public LogQualityClass(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    LogQualityClass() {

    }

    public String toString() {
        return String.format("%s (%s)", symbol, name);
    }
}
