/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from c_
 */
class c__0
implements ActionListener {
    final F6 B;

    c__0(F6 f62) {
        this.B = f62;
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
                    string2 = (String)this.B.y;
                    if (bl) break block9;
                    if (string2 != null) {
                        try {
                            string2 = (String)lk_0.M(this.B.y);
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
                ((dv_0)this.B.J).setText(string);
                ((dv_0)this.B.J).setCaretPosition(((dv_0)this.B.J).getDocument().getLength());
            }
            try {
                this.B.t((Object)string, true, true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

