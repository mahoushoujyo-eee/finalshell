/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C.d;
import com.GA;
import com.GO;
import com.QX;
import com.qq_0;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;

/*
 * Renamed from com.Yj
 */
public class yj_0
extends d {
    final qq_0 e;

    protected yj_0(qq_0 qq_02) {
        this.e = qq_02;
    }

    /*
     * Unable to fully structure code
     */
    public void j(Graphics2D var1_1, Rectangle var2_2, qq_0 var3_3) {
        block3: {
            block2: {
                var4_4 = QX.Y();
                v0 = this.e.d(var3_3);
                v1 = qq_0.r(this.e).isFocusable();
                if (var4_4 != null) break block2;
                if (!v1) ** GOTO lbl-1000
                v1 = qq_0.r(this.e).z();
            }
            if (var4_4 != null) break block3;
            if (!v1) ** GOTO lbl-1000
            v1 = this.u;
        }
        if (v1) {
            v2 = GO.c;
        } else lbl-1000:
        // 3 sources

        {
            v2 = GO.r;
        }
        GA.i(var1_1, var3_3, v0, v2, qq_0.r(this.e).q(), true, this.z());
    }

    @Override
    public void h(Graphics2D graphics2D, Rectangle rectangle, JPanel jPanel) {
        this.j(graphics2D, rectangle, (qq_0)jPanel);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.j(graphics2D, rectangle, (qq_0)jComponent);
    }
}

