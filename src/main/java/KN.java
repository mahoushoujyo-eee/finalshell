/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class KN
implements ActionListener {
    final FT B;
    final tq_2 X;

    KN(tq_2 tq_22, FT fT2) {
        this.X = tq_22;
        this.B = fT2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        Object object2;
        int n10 = this.X.U;
        int n11 = ((tq_2)this.X).convertRowIndexToModel(n10);
        try {
            object2 = this.B.getValueAt(n11, n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        L1 l1 = (L1)object2;
        try {
            object = l1.A();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            lk_0.u(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

