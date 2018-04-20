package io.github.dunca.logpurchasemanager.shared.model.custom;

import io.github.dunca.logpurchasemanager.shared.model.Acquisition;
import io.github.dunca.logpurchasemanager.shared.model.AcquisitionItem;
import io.github.dunca.logpurchasemanager.shared.model.LogPrice;
import lombok.Data;

import java.util.List;

@Data
public class FullAggregation {
    private List<Acquisition> acquisitionList;
    private List<AcquisitionItem> acquisitionItemList;
    private List<LogPrice> logPriceList;

    public FullAggregation(List<Acquisition> acquisitionList, List<AcquisitionItem> acquisitionItemList, List<LogPrice> logPriceList) {
        this.acquisitionList = acquisitionList;
        this.acquisitionItemList = acquisitionItemList;
        this.logPriceList = logPriceList;
    }
}
