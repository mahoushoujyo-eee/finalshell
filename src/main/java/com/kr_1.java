/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.tz_0;
import java.awt.Component;
import javax.swing.SwingConstants;

/*
 * Renamed from com.kR
 */
public class kr_1
extends ky_2
implements SwingConstants {
    public kr_1(Component component, int n10, int n11) {
        super(new tz_0());
        this.setOpaque(false);
        this.add(component, n10 + "," + n11);
    }
}

