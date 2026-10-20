/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.et_0;
import com.xf_1;
import java.awt.Color;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from com.lG
 */
public final class lg_1 {
    @Contract(value="null -> null; !null -> new", pure=true)
    @Nullable
    public static Color H(@Nullable xf_1 xf_12) {
        return xf_12 == null ? null : new Color(xf_12.p(), true);
    }

    @Contract(value="null -> null; !null -> new")
    @Nullable
    public static xf_1 l(@Nullable Color color) {
        return color == null ? null : new xf_1(color.getRGB(), true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Contract(value="null -> null; !null -> new")
    @Nullable
    public static et_0 J(@Nullable Color color) {
        int n10 = _y_0.y();
        Color color2 = color;
        if (n10 == 0) {
            if (color2 == null) {
                return null;
            }
            color2 = color;
        }
        et_0 et_02 = et_0.R(lg_1.l(color2));
        return et_02;
    }
}

