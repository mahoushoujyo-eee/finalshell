/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Wj
 */
class wj_0
implements ActionListener {
    final te_1 d;

    wj_0(te_1 te_12) {
        this.d = te_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        String string;
        try {
            string = (String)this.d.T.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        try {
            object = this.d.T.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.e(string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

