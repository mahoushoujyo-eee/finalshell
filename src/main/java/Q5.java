/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class Q5
implements ActionListener {
    final xc_0 i;

    Q5(xc_0 xc_02) {
        this.i = xc_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10;
        u8_0 u8_02;
        ArrayList arrayList;
        int n11 = ((uo_0)this.i.M).getSelectedRow();
        int n12 = ((uo_0)this.i.M).convertRowIndexToModel(n11);
        try {
            arrayList = (ArrayList)this.i.t.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        li_1 li_12 = (li_1)arrayList.get(n12);
        try {
            u8_02 = (u8_0)li_12.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        u8_0 u8_03 = u8_02;
        try {
            n10 = (Integer)u8_03.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lk_0.u(n10 + "");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

