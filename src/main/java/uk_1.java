/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uK
 */
class uk_1
implements ActionListener {
    final wx_0 B;

    uk_1(wx_0 wx_02) {
        this.B = wx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block9: {
            String string;
            block10: {
                String string2;
                block11: {
                    String string3;
                    tf_2 tf_22;
                    int[] nArray;
                    block8: {
                        nArray = a3.I();
                        tf_22 = (tf_2)this.B.G;
                        if (nArray == null) break block8;
                        if (tf_22 == null) break block9;
                        tf_22 = (tf_2)this.B.G;
                    }
                    try {
                        string3 = (String)tf_22.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    string = string2 = string3;
                    if (nArray == null) break block10;
                    if (string.equals("/")) break block11;
                    string = string2;
                    if (nArray == null) break block10;
                    if (!string.endsWith("/")) {
                        string2 = string2 + "/";
                    }
                }
                string = string2;
            }
            try {
                lk_0.u(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

