/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

class T6
implements ActionListener {
    final kr_2 C;

    T6(kr_2 kr_22) {
        this.C = kr_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton jButton;
        Object object = actionEvent.getSource();
        try {
            jButton = (JButton)kr_2.p(this.C);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (object == jButton) {
            Object object2;
            try {
                object2 = kr_2.y(this.C);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2.G();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

