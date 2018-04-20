package io.github.dunca.logpurchasemanager.shared.model.custom;

import io.github.dunca.logpurchasemanager.shared.model.Acquirer;
import io.github.dunca.logpurchasemanager.shared.model.Acquisition;
import io.github.dunca.logpurchasemanager.shared.model.AcquisitionItem;
import io.github.dunca.logpurchasemanager.shared.model.LogPrice;
import io.github.dunca.logpurchasemanager.shared.model.LogQualityClass;
import io.github.dunca.logpurchasemanager.shared.model.Supplier;
import io.github.dunca.logpurchasemanager.shared.model.TreeSpecies;
import io.github.dunca.logpurchasemanager.shared.model.WoodCertification;
import io.github.dunca.logpurchasemanager.shared.model.WoodRegion;
import lombok.Data;

import java.util.List;

@Data
public class FullDb {
    private List<Acquirer> acquirers;
    private List<Acquisition> acquistions;
    private List<AcquisitionItem> acquisitionItems;
    private List<LogPrice> logPrices;
    private List<LogQualityClass> logQualityClasses;
    private List<Supplier> suppliers;
    private List<TreeSpecies> treeSpecies;
    private List<WoodCertification> woodCertifications;
    private List<WoodRegion> woodRegions;
}
