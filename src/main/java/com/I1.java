/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.IH;
import com.NE;
import com.aS;
import com.bn_0;
import com.c9_0;
import com.ks_2;
import java.io.Serializable;
import javax.swing.JComponent;

public class I1
extends IB {
    private bn_0 O;

    public I1(aS aS2) {
        super(aS2);
    }

    protected void s(ks_2 ks_22) {
        this.O = new c9_0(this);
        ks_22.j(this.O);
    }

    protected void P(ks_2 ks_22) {
        ks_22.N(this.O);
        this.O = null;
    }

    /*
     * Unable to fully structure code
     */
    protected void K(ks_2 var1_1) {
        block3: {
            var3_2 = (String)this.o();
            var2_3 = IH.M();
            v0 = var3_2;
            if (var2_3 == null) break block3;
            if (v0 == null) ** GOTO lbl-1000
            v0 = var3_2.trim();
        }
        v1 = "";
        if (var2_3 != null) {
            ** if (!v0.equals((Object)v1)) goto lbl-1000
        }
        ** GOTO lbl16
lbl-1000:
        // 2 sources

        {
            v2 = null;
            ** GOTO lbl17
        }
lbl-1000:
        // 1 sources

        {
            v0 = var3_2;
            v1 = ",";
lbl16:
            // 2 sources

            v2 = NE.x(v0, v1);
        }
lbl17:
        // 2 sources

        var4_4 = v2;
        var1_1.h(var4_4);
    }

    protected void G(ks_2 ks_22) {
        String string = NE.I(ks_22.P(), ",");
        String[] stringArray = IH.M();
        String string2 = string;
        if (stringArray != null) {
            string2 = string2 != null ? string : "";
        }
        this.J((Serializable)((Object)string2));
    }

    @Override
    protected void T(JComponent jComponent) {
        this.G((ks_2)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.K((ks_2)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.P((ks_2)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.s((ks_2)jComponent);
    }
}

