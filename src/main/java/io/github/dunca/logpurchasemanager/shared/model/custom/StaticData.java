package io.github.dunca.logpurchasemanager.shared.model.custom;

import io.github.dunca.logpurchasemanager.shared.model.Acquirer;
import io.github.dunca.logpurchasemanager.shared.model.LogQualityClass;
import io.github.dunca.logpurchasemanager.shared.model.Supplier;
import io.github.dunca.logpurchasemanager.shared.model.TreeSpecies;
import io.github.dunca.logpurchasemanager.shared.model.WoodCertification;
import io.github.dunca.logpurchasemanager.shared.model.WoodRegion;
import lombok.Data;

import java.util.List;

@Data
public class StaticData {
    private List<Acquirer> acquirers;
    private List<LogQualityClass> logQualityClasses;
    private List<Supplier> suppliers;
    private List<TreeSpecies> treeSpecies;
    private List<WoodCertification> woodCertifications;
    private List<WoodRegion> woodRegions;

    public StaticData(List<Acquirer> acquirers, List<LogQualityClass> logQualityClasses, List<Supplier> suppliers,
                      List<TreeSpecies> treeSpecies, List<WoodCertification> woodCertifications, List<WoodRegion> woodRegions) {
        this.acquirers = acquirers;
        this.logQualityClasses = logQualityClasses;
        this.suppliers = suppliers;
        this.treeSpecies = treeSpecies;
        this.woodCertifications = woodCertifications;
        this.woodRegions = woodRegions;
    }

    public StaticData() {

    }
}
