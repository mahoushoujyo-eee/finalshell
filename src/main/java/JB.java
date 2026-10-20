/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class JB
implements ActionListener {
    final xc_0 J;

    JB(xc_0 xc_02) {
        this.J = xc_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string;
        String string2;
        u8_0 u8_02;
        ArrayList arrayList;
        int n10 = ((uo_0)this.J.M).getSelectedRow();
        int n11 = ((uo_0)this.J.M).convertRowIndexToModel(n10);
        try {
            arrayList = (ArrayList)this.J.t.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        li_1 li_12 = (li_1)arrayList.get(n11);
        boolean bl = uo_0.i();
        try {
            u8_02 = (u8_0)li_12.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        u8_0 u8_03 = u8_02;
        try {
            string2 = (String)u8_03.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string3 = string = string2;
        if (!bl) {
            if (string3 == null) {
                string = "";
            }
            string3 = string;
        }
        try {
            lk_0.u(string3);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

