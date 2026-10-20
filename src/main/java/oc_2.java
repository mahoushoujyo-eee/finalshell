/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

/*
 * Renamed from oc
 */
class oc_2
implements ActionListener {
    final JCheckBox g;
    final zU k;

    oc_2(zU zU2, JCheckBox jCheckBox) {
        this.k = zU2;
        this.g = jCheckBox;
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
            object2 = object3.P();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.Z(((JCheckBox)this.g).isSelected());
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

