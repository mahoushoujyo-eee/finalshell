/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBoxMenuItem;

class T_
implements ActionListener {
    final JCheckBoxMenuItem U;
    final yb_1 g;

    T_(yb_1 yb_12, JCheckBoxMenuItem jCheckBoxMenuItem) {
        this.g = yb_12;
        this.U = jCheckBoxMenuItem;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        Object object2;
        Object object3;
        try {
            object3 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2 = object3.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.W(((JCheckBoxMenuItem)this.U).isSelected());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

