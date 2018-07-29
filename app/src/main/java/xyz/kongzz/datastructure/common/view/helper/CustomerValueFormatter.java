package xyz.kongzz.datastructure.common.view.helper;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

/**
 * 功能描述:
 * 作者: Kong
 * 时间: 2018/7/27
 */

public class CustomerValueFormatter implements IValueFormatter {

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return (int) value + "";
    }
}
