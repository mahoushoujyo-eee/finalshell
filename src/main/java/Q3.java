/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class Q3
implements ActionListener {
    final f3_0 I;

    Q3(f3_0 f3_02) {
        this.I = f3_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string = null;
        int n10 = ((ua_1)this.I.q).getSelectedRow();
        int[] nArray = L9.X();
        if (n10 > -1) {
            String string2;
            ArrayList arrayList;
            try {
                arrayList = (ArrayList)this.I.K.N();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            L9 l9 = (L9)arrayList.get(n10);
            try {
                string2 = (String)l9.K();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (nArray == null) {
                if (string2 != null) {
                    try {
                        string2 = (String)l9.K();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            } else {
                string = string2;
            }
        }
        try {
            lk_0.u(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

