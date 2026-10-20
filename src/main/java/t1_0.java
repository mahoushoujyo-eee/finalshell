/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/*
 * Renamed from t1
 */
class t1_0
implements ActionListener {
    final CG N;

    t1_0(CG cG) {
        this.N = cG;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string;
        ArrayList arrayList;
        int n10 = ((y6_0)this.N.y).getSelectedRow();
        int n11 = ((y6_0)this.N.y).convertRowIndexToModel(n10);
        try {
            arrayList = (ArrayList)this.N.C.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ya_1 ya_12 = (ya_1)arrayList.get(n11);
        try {
            string = (String)ya_12.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lk_0.u(string + "");
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

