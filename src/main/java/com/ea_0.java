/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.II;
import com.wb_0;
import com.xg_0;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;

/*
 * Renamed from com.Ea
 */
public class ea_0
extends EY {
    private II F = null;

    public ea_0(II iI) {
        this.F = iI;
    }

    @Override
    public boolean d(List list) {
        boolean bl;
        boolean bl2 = false;
        String string = wb_0.m();
        if (this.F != null) {
            for (File file : list) {
                bl = xg_0.P(file.getName());
                if (string != null) {
                    if (string != null && bl) {
                        this.F.V(new ImageIcon(file.getAbsolutePath()));
                        boolean bl3 = bl2 = true;
                    }
                    if (string != null) continue;
                }
                break;
            }
        } else {
            bl = bl2;
        }
        return bl;
    }
}

