/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;

/*
 * Renamed from Lw
 */
class lw_0
implements ActionListener {
    final xl_0 Z;

    lw_0(xl_0 xl_02) {
        this.Z = xl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block10: {
            String string;
            block11: {
                String string2;
                boolean bl;
                block9: {
                    bl = F6.g();
                    string2 = (String)this.Z.x;
                    if (bl) break block9;
                    if (string2 != null) {
                        try {
                            string2 = (String)lk_0.M(this.Z.x);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block10;
                }
                string = string2;
                if (bl) break block11;
                if (string == null) break block10;
                ((JTextField)this.Z.C).setText(string);
                ((JTextField)this.Z.C).setCaretPosition(((JTextField)this.Z.C).getDocument().getLength());
            }
            try {
                yt_1.F.J(new BT(this, string));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

