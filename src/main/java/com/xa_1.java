/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.WC;
import com.rt_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.EventObject;

/*
 * Renamed from com.xA
 */
public class xa_1
implements ActionListener,
ItemListener,
Serializable {
    protected Object j;
    final rt_2 p;

    protected xa_1(rt_2 rt_22) {
        this.p = rt_22;
    }

    public Object G() {
        return this.j;
    }

    public void y(Object object) {
        this.j = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean T(EventObject eventObject) {
        int[] nArray = WC.V();
        EventObject eventObject2 = eventObject;
        if (nArray == null) {
            if (eventObject2 == null) return true;
            eventObject2 = eventObject;
        }
        boolean bl = eventObject2 instanceof ActionEvent;
        if (nArray == null) {
            if (bl) {
                return true;
            }
            bl = eventObject instanceof KeyEvent;
        }
        if (nArray == null) {
            if (bl) {
                KeyEvent keyEvent = (KeyEvent)eventObject;
                return GR.lR.J(keyEvent);
            }
            bl = eventObject instanceof MouseEvent;
        }
        if (nArray != null) return bl;
        if (!bl) return false;
        MouseEvent mouseEvent = (MouseEvent)eventObject;
        int n10 = this.p.B;
        if (nArray == null) {
            if (n10 < 0) return 0 != 0;
            n10 = mouseEvent.getClickCount();
        }
        if (nArray != null) return n10 != 0;
        if (n10 < this.p.B) return 0 != 0;
        return 1 != 0;
    }

    public boolean P(EventObject eventObject) {
        return true;
    }

    public boolean p() {
        rt_2.H(this.p);
        return true;
    }

    public void a() {
        rt_2.u(this.p);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.p.stopCellEditing();
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        this.p.stopCellEditing();
    }
}

