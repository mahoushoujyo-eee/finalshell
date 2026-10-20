/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from b0
 */
class b0_0
implements WindowFocusListener {
    final KQ u;

    b0_0(KQ kQ) {
        this.u = kQ;
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
        block7: {
            KQ kQ;
            block6: {
                boolean bl;
                String[] stringArray = F8.y();
                this.u.g = System.currentTimeMillis();
                String[] stringArray2 = stringArray;
                kQ = (KQ)this.u;
                if (stringArray2 != null) break block6;
                try {
                    bl = (Boolean)KQ.F(kQ);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (bl) break block7;
                kQ = (KQ)this.u;
            }
            try {
                kQ.r(false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

