package io.github.dunca.logpurchasemanager.shared.model.custom;

import io.github.dunca.logpurchasemanager.shared.model.Acquisition;
import io.github.dunca.logpurchasemanager.shared.model.AcquisitionItem;
import io.github.dunca.logpurchasemanager.shared.model.LogPrice;
import lombok.Data;

import java.util.List;

@Data
public class FullAcquisition {
    private Acquisition acquisition;
    private List<AcquisitionItem> acquisitionItemList;
    private List<LogPrice> logPriceList;

    public FullAcquisition(Acquisition acquisition, List<AcquisitionItem> acquisitionItemList, List<LogPrice> logPriceList) {
        this.acquisition = acquisition;
        this.acquisitionItemList = acquisitionItemList;
        this.logPriceList = logPriceList;
    }

    public FullAcquisition() {

    }
}
