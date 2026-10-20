/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QL;
import com.at_0;
import com.ll_1;
import com.zJ;
import java.awt.FontMetrics;
import java.awt.datatransfer.DataFlavor;
import javax.swing.Icon;

public class zU
extends zJ {
    protected final QL C;

    public zU(QL qL) {
        this.C = qL;
    }

    @Override
    public DataFlavor y() {
        return ll_1.q;
    }

    protected FontMetrics R(at_0 at_02) {
        return this.C.getFontMetrics(this.C.getFont());
    }

    protected Icon h(at_0 at_02) {
        return at_02.I();
    }

    protected String A(at_0 at_02) {
        return at_02.V();
    }

    @Override
    protected String O(Object object) {
        return this.A((at_0)object);
    }

    @Override
    protected Icon n(Object object) {
        return this.h((at_0)object);
    }

    @Override
    protected FontMetrics Z(Object object) {
        return this.R((at_0)object);
    }
}

