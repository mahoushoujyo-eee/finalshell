/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

/*
 * Renamed from Qi
 */
class qi_0
implements ActionListener {
    final y1_0 Y;
    final C_ Z;
    final cg_0 R;

    qi_0(cg_0 cg_02, y1_0 y1_02, C_ c_) {
        this.R = cg_02;
        this.Y = y1_02;
        this.Z = c_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            qi_0 qi_02;
            block6: {
                block7: {
                    boolean bl;
                    String[] stringArray = KV.b();
                    qi_02 = this;
                    if (stringArray != null) break block6;
                    try {
                        bl = (Boolean)qi_02.Y.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) break block7;
                    try {
                        this.R.O();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((JPopupMenu)this.R.b).show((C_)this.Z, 2, ((C_)this.Z).getHeight());
                    if (stringArray == null) break block8;
                }
                qi_02 = this;
            }
            ((JPopupMenu)qi_02.R.b).setVisible(false);
        }
    }
}

