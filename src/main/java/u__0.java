/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from u_
 */
class u__0
extends MouseAdapter {
    final ka_1 s;

    u__0(ka_1 ka_12) {
        this.s = ka_12;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        try {
            yt_1.F.J(new xn_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

