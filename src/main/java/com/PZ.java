/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import com.aL;
import com.nb_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class PZ
extends ButtonGroup {
    private final List j = new ArrayList(1);
    private boolean S = true;

    public PZ() {
    }

    public PZ(AbstractButton[] abstractButtonArray) {
        this.p(abstractButtonArray);
    }

    public PZ(List list) {
        this.J(list);
    }

    public PZ(boolean bl) {
        this.F(bl);
    }

    public boolean f() {
        return this.S;
    }

    public void F(boolean bl) {
        this.S = bl;
    }

    @Override
    public void setSelected(ButtonModel buttonModel, boolean bl) {
        block6: {
            PZ pZ;
            block4: {
                block5: {
                    int[] nArray;
                    block2: {
                        block3: {
                            nArray = WC.V();
                            if (nArray != null) break block2;
                            if (bl) break block3;
                            pZ = this;
                            if (nArray != null) break block4;
                            if (pZ.S) break block5;
                        }
                        super.setSelected(buttonModel, bl);
                    }
                    if (nArray == null) break block6;
                }
                pZ = this;
            }
            pZ.clearSelection();
        }
        this.p();
    }

    public List L() {
        return aL.J((Collection)this.buttons);
    }

    public void V(nb_1 nb_12) {
        this.j.add(nb_12);
    }

    public void P(nb_1 nb_12) {
        this.j.remove(nb_12);
    }

    public void p() {
        Iterator iterator = aL.J((Collection)this.j).iterator();
        int[] nArray = WC.V();
        while (iterator.hasNext()) {
            nb_1 nb_12 = (nb_1)iterator.next();
            nb_12.z();
            if (nArray == null) continue;
        }
    }

    public void p(AbstractButton[] abstractButtonArray) {
        AbstractButton[] abstractButtonArray2 = abstractButtonArray;
        int n10 = abstractButtonArray2.length;
        int[] nArray = WC.V();
        for (int i2 = 0; i2 < n10; ++i2) {
            AbstractButton abstractButton = abstractButtonArray2[i2];
            this.add(abstractButton);
            if (nArray == null) continue;
        }
    }

    public void J(List list) {
        Iterator iterator = list.iterator();
        int[] nArray = WC.V();
        while (iterator.hasNext()) {
            AbstractButton abstractButton = (AbstractButton)iterator.next();
            this.add(abstractButton);
            if (nArray == null) continue;
        }
    }

    public static PZ h(AbstractButton[] abstractButtonArray) {
        return new PZ(abstractButtonArray);
    }

    public static PZ c(List list) {
        return new PZ(list);
    }
}

