/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from h
 */
class h_0
implements ActionListener {
    final FT C;
    final tq_2 S;

    h_0(tq_2 tq_22, FT fT2) {
        this.S = tq_22;
        this.C = fT2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block11: {
            kn_0 kn_02;
            L1 l1;
            int n10;
            block10: {
                Object object;
                int n11;
                try {
                    n11 = (Integer)tq_2.y(this.S);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int n12 = n11;
                String[] stringArray = FK.i();
                n10 = ((tq_2)this.S).convertRowIndexToModel(n12);
                try {
                    object = this.C.getValueAt(n10, n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                l1 = (L1)object;
                try {
                    this.C.I(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String[] stringArray2 = stringArray;
                kn_02 = (kn_0)this.S.h;
                if (stringArray2 != null) break block10;
                if (kn_02 == null) break block11;
                kn_02 = (kn_0)this.S.h;
            }
            try {
                kn_02.c((Object)l1, n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

