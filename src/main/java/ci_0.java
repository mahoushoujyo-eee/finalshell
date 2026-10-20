/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBoxMenuItem;

/*
 * Renamed from Ci
 */
class ci_0
implements ActionListener {
    final JCheckBoxMenuItem k;
    final nx_0 O;

    ci_0(nx_0 nx_02, JCheckBoxMenuItem jCheckBoxMenuItem) {
        this.O = nx_02;
        this.k = jCheckBoxMenuItem;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        yt_1 yt_12;
        String string = km_0.U();
        try {
            yt_12 = (yt_1)yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (string == null) {
            Object object;
            Object object2;
            boolean bl;
            Object object3;
            try {
                object3 = yt_12.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                bl = (Boolean)object3.v();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!bl) {
                Object object4;
                try {
                    object4 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object4.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                return;
            }
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.h();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.b(((JCheckBoxMenuItem)this.k).isSelected());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                yt_12 = (yt_1)yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        try {
            yt_12.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

