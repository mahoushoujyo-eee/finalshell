/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/*
 * Renamed from xt
 */
class xt_0
implements Runnable {
    final U C;

    xt_0(U u10) {
        this.C = u10;
    }

    @Override
    public void run() {
        this.C.h1 = new aj_0();
        ((aj_0)this.C.h1).setOpaque(false);
        this.C.h0 = this.C.h1;
        ((JSplitPane)this.C.r).setLeftComponent((JPanel)this.C.h0);
        try {
            this.C.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.C.S = true;
    }
}

