/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

class Q7
implements ActionListener {
    final JCheckBox U;
    final cb_1 h;

    Q7(cb_1 cb_12, JCheckBox jCheckBox) {
        this.h = cb_12;
        this.U = jCheckBox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        u6_0 u6_02;
        Object object2;
        String[] stringArray = F_.F();
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            u6_02 = (u6_0)object2.h();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        boolean bl = ((JCheckBox)this.U).isSelected();
        if (stringArray != null) {
            bl = !bl;
        }
        try {
            u6_02.j(bl);
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

