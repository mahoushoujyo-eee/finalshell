/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/*
 * Renamed from k8
 */
class k8_0
implements ActionListener {
    final CG p;

    k8_0(CG cG) {
        this.p = cG;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10;
        ArrayList arrayList;
        int n11 = ((y6_0)this.p.y).getSelectedRow();
        int n12 = ((y6_0)this.p.y).convertRowIndexToModel(n11);
        try {
            arrayList = (ArrayList)this.p.C.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ya_1 ya_12 = (ya_1)arrayList.get(n12);
        try {
            n10 = (Integer)ya_12.I();
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

