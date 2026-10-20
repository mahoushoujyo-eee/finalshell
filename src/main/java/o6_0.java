/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/*
 * Renamed from o6
 */
class o6_0
extends MouseAdapter {
    final t3_0 s;
    final aM W;
    final bq_0 e;

    o6_0(bq_0 bq_02, t3_0 t3_02, aM aM2) {
        this.e = bq_02;
        this.s = t3_02;
        this.W = aM2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        String[] stringArray = aM.s();
        super.mouseReleased(mouseEvent);
        String[] stringArray2 = stringArray;
        if (stringArray2 == null) {
            if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                Y9 y9 = new Y9((t3_0)this.s, Y9.f);
                try {
                    y9.I(mouseEvent);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.W.h(y9);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                this.W.X(this.s);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

