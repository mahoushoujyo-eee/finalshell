/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

/*
 * Renamed from l4
 */
class l4_0
implements fb_0 {
    final ak_0 m;

    l4_0(ak_0 ak_02) {
        this.m = ak_02;
    }

    @Override
    public void O(ty_2 ty_22) {
        block8: {
            int n10;
            int n11;
            block6: {
                int n12;
                block7: {
                    int n13;
                    try {
                        n13 = (Integer)ty_22.D();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n12 = n13;
                    String string = ak_0.u();
                    n11 = n12;
                    n10 = ty_2.N;
                    if (string == null) break block6;
                    if (n11 != n10) break block7;
                    ((JButton)this.m.o).setEnabled(false);
                    if (string != null) break block8;
                }
                n11 = n12;
                n10 = ty_2.i;
            }
            if (n11 == n10) {
                ((JButton)this.m.o).setEnabled(true);
            }
        }
    }
}

