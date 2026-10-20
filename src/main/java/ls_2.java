/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ls
 */
class ls_2
implements ActionListener {
    final FT A;
    final tq_2 K;

    ls_2(tq_2 tq_22, FT fT2) {
        this.K = tq_22;
        this.A = fT2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block7: {
            kn_0 kn_02;
            L1 l1;
            int n10;
            block6: {
                Object object;
                int n11 = this.K.U;
                n10 = ((tq_2)this.K).convertRowIndexToModel(n11);
                String[] stringArray = FK.i();
                try {
                    object = this.A.getValueAt(n10, n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                l1 = (L1)object;
                kn_02 = (kn_0)this.K.h;
                if (stringArray != null) break block6;
                if (kn_02 == null) break block7;
                kn_02 = (kn_0)this.K.h;
            }
            try {
                kn_02.Q((Object)l1, n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

