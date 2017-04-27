package org.dnltsk.mapfileplugin.colorchooser;

import com.intellij.ui.ColorChooserService;
import com.intellij.ui.ColorPicker;
import com.intellij.ui.ColorPickerListener;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class MapfileColorChooser extends ColorChooserService {



    @Nullable
    @Override
    public Color showDialog(Component parent,
                            String caption,
                            Color preselectedColor,
                            boolean enableOpacity,
                            ColorPickerListener[] listeners) {
        return showDialog(parent, caption, preselectedColor, enableOpacity, Arrays.asList(listeners), false);
    }
    @Nullable
    @Override
    public Color showDialog(Component parent,
                            String caption,
                            Color preselectedColor,
                            boolean enableOpacity,
                            ColorPickerListener[] listeners,
                            boolean opacityInPercent) {
        return showDialog(parent, caption, preselectedColor, enableOpacity, Arrays.asList(listeners), opacityInPercent);
    }
    @Nullable
    @Override
    public Color showDialog(Component parent,
                            String caption,
                            Color preselectedColor,
                            boolean enableOpacity,
                            List<ColorPickerListener> listeners,
                            boolean opacityInPercent) {
        return ColorPicker.showDialog(parent, caption, preselectedColor, enableOpacity, listeners, opacityInPercent);
    }
}
