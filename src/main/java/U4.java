/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class U4
implements ActionListener {
    final jr_0 w;

    U4(jr_0 jr_02) {
        this.w = jr_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string;
        String[] stringArray = KV.b();
        try {
            string = (String)this.w.E.g();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (stringArray == null) {
            if (string != null) {
                try {
                    string = (String)this.w.E.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        } else {
            try {
                ka_0.O(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

