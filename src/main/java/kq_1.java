/*
 * Decompiled with CFR 0.152.
 */
import com._C;
import com.c;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

/*
 * Renamed from kQ
 */
class kq_1
implements ActionListener {
    final y1_0 y;
    final jx_0 Y;
    private static final long a;

    kq_1(jx_0 jx_02, y1_0 y1_02) {
        this.Y = jx_02;
        this.y = y1_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block6: {
            kq_1 kq_12;
            block4: {
                block5: {
                    boolean bl;
                    int[] nArray = jx_0.O();
                    kq_12 = this;
                    if (nArray != null) break block4;
                    try {
                        bl = (Boolean)kq_12.y.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) break block5;
                    Dimension dimension = ((JPopupMenu)this.Y.a).getPreferredSize();
                    ((JPopupMenu)this.Y.a).show((_C)this.Y.H, (int)a, ((_C)this.Y.H).getHeight() + 4);
                    if (nArray == null) break block6;
                }
                kq_12 = this;
            }
            ((JPopupMenu)kq_12.Y.a).setVisible(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1654064544388987467L;
        a = 0x6E79D0737C2045B0L ^ l2;
    }
}

