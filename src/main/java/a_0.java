/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;

/*
 * Renamed from a
 */
class a_0
implements ActionListener {
    final JFrame V;
    final ka_0 i;

    a_0(ka_0 ka_02, JFrame jFrame) {
        this.i = ka_02;
        this.V = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ky_2[] ky_2Array = ka_0.N();
        JFrame jFrame = (JFrame)this.V;
        if (ky_2Array != null) {
            if (!jFrame.isVisible()) {
                U u10;
                Object object;
                Object object2;
                Object object3;
                ((JFrame)this.V).pack();
                try {
                    object3 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object2 = object3.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = object2.G();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    u10 = (U)object.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JFrame)this.V).setLocationRelativeTo(u10);
            }
            ((JFrame)this.V).setVisible(true);
            jFrame = (JFrame)this.V;
        }
        jFrame.toFront();
    }
}

