/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import com.rt_2;
import com.xa_1;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.JComboBox;

/*
 * Renamed from com.xC
 */
class xc_1
extends xa_1 {
    final JComboBox A;
    final rt_2 s;
    private static final long a;

    xc_1(rt_2 rt_22, JComboBox jComboBox) {
        this.s = rt_22;
        this.A = jComboBox;
        super(rt_22);
    }

    @Override
    public void y(Object object) {
        this.A.setSelectedItem(object);
    }

    @Override
    public Object G() {
        return this.A.getSelectedItem();
    }

    @Override
    public boolean P(EventObject eventObject) {
        int[] nArray = WC.V();
        boolean bl = eventObject instanceof MouseEvent;
        if (nArray == null) {
            if (bl) {
                MouseEvent mouseEvent = (MouseEvent)eventObject;
                int n10 = mouseEvent.getID();
                if (nArray == null) {
                    n10 = n10 != (int)a ? 1 : 0;
                }
                return n10 != 0;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean p() {
        int[] nArray = WC.V();
        boolean bl = this.A.isEditable();
        if (nArray == null) {
            if (bl) {
                this.A.actionPerformed(new ActionEvent(this.s, 0, ""));
            }
            bl = super.p();
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6011872944660465104L;
        a = 0x94EF76444544C42AL ^ l2;
    }
}

