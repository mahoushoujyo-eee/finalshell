/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/*
 * Renamed from lR
 */
class lr_1
implements ActionListener {
    final O3 Y;

    lr_1(O3 o3) {
        this.Y = o3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10;
        ArrayList arrayList;
        int n11 = ((UT)this.Y.x).getSelectedRow();
        int n12 = ((UT)this.Y.x).convertRowIndexToModel(n11);
        try {
            arrayList = (ArrayList)this.Y.o.T();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        kw_2 kw_22 = (kw_2)arrayList.get(n12);
        try {
            n10 = (Integer)kw_22.f();
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

