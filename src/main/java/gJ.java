/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

class gJ
extends MouseAdapter {
    final ka_1 T;

    gJ(ka_1 ka_12) {
        this.T = ka_12;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        try {
            yt_1.F.J(new zk_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

