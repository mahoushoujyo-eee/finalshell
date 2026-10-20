/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

/*
 * Renamed from tU
 */
class tu_1
implements ActionListener {
    final aj_0 R;

    tu_1(aj_0 aj_02) {
        this.R = aj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        JLabel jLabel;
        Object object2;
        try {
            object2 = this.R.W();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            jLabel = (JLabel)this.R.V.v();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = this.R.k.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object2.z((Object)jLabel.getText(), object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

