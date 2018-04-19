package io.github.dunca.logpurchasemanager.shared.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import io.github.dunca.logpurchasemanager.shared.model.interfaces.Model;
import lombok.Data;

@Data
@DatabaseTable
public final class AcquisitionItem implements Model {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
    private Acquisition acquisition;

    @DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
    private Acquirer acquirer;

    @DatabaseField(canBeNull = false)
    private String logBarCode;

    @DatabaseField(canBeNull = false)
    private double netDiameter;

    @DatabaseField(canBeNull = false)
    private double grossDiameter;

    @DatabaseField(canBeNull = false)
    private double netLength;

    @DatabaseField(canBeNull = false)
    private double grossLength;

    @DatabaseField(canBeNull = false)
    private double netVolume;

    @DatabaseField(canBeNull = false)
    private double grossVolume;

    @DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
    private LogQualityClass logQualityClass;

    @DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
    private TreeSpecies treeSpecies;

    @DatabaseField(canBeNull = false)
    private String observations;

    @DatabaseField(canBeNull = false)
    private double price;

    @DatabaseField(canBeNull = false)
    private boolean isSpecialPrice;

    @DatabaseField(canBeNull = false)
    private boolean isSynced;

    @DatabaseField(canBeNull = false, defaultValue = "0")
    private int serverAllocatedId;

    public AcquisitionItem(Acquisition acquisition, Acquirer acquirer, String logBarCode,
                           double netDiameter, double grossDiameter, double netLength,
                           double grossLength, double netVolume, double grossVolume,
                           LogQualityClass logQualityClass, TreeSpecies treeSpecies,
                           String observations, double price, boolean isSpecialPrice, boolean isSynced) {
        this.acquisition = acquisition;
        this.acquirer = acquirer;
        this.logBarCode = logBarCode;
        this.netDiameter = netDiameter;
        this.grossDiameter = grossDiameter;
        this.netLength = netLength;
        this.grossLength = grossLength;
        this.netVolume = netVolume;
        this.grossVolume = grossVolume;
        this.logQualityClass = logQualityClass;
        this.treeSpecies = treeSpecies;
        this.observations = observations;
        this.price = price;
        this.isSpecialPrice = isSpecialPrice;
        this.isSynced = isSynced;
    }

    public AcquisitionItem() {

    }
}
