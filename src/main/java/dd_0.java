/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/*
 * Renamed from Dd
 */
class dd_0
implements ActionListener {
    final xc_0 P;

    dd_0(xc_0 xc_02) {
        this.P = xc_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string;
        String string2;
        Object object;
        u8_0 u8_02;
        ArrayList arrayList;
        int n10 = ((uo_0)this.P.M).getSelectedRow();
        boolean bl = uo_0.i();
        int n11 = ((uo_0)this.P.M).convertRowIndexToModel(n10);
        try {
            arrayList = (ArrayList)this.P.t.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        li_1 li_12 = (li_1)arrayList.get(n11);
        try {
            u8_02 = (u8_0)li_12.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        u8_0 u8_03 = u8_02;
        try {
            object = u8_03.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string2 = (String)object.B();
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

