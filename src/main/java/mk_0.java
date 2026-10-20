/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

/*
 * Renamed from mk
 */
class mk_0
implements fb_0 {
    final VN i;

    mk_0(VN vN) {
        this.i = vN;
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
                    int n14 = z2.w();
                    n11 = n12;
                    n10 = ty_2.N;
                    if (n14 == 0) break block6;
                    if (n11 != n10) break block7;
                    ((JButton)this.i.m).setEnabled(false);
                    if (n14 != 0) break block8;
                }
                n11 = n12;
                n10 = ty_2.i;
            }
            if (n11 == n10) {
                ((JButton)this.i.m).setEnabled(true);
            }
        }
    }
}

