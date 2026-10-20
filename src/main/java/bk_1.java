/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bK
 */
class bk_1
implements ActionListener {
    final U I;
    private static final long a;

    bk_1(U u10) {
        this.I = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block12: {
            long l2;
            block11: {
                C5 c5;
                String[] stringArray;
                block10: {
                    Object object;
                    String[] stringArray2 = F8.y();
                    try {
                        object = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object.P();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    stringArray = stringArray2;
                    c5 = (C5)U.u;
                    if (stringArray != null) break block10;
                    if (!c5.isVisible()) break block11;
                    c5 = (C5)U.u;
                }
                c5.setVisible(false);
                if (stringArray == null) break block12;
            }
            try {
                l2 = (Long)U.u.H();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            long l3 = System.currentTimeMillis() - l2;
            if (l3 > a) {
                try {
                    this.I.b();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7221976951569528976L;
        a = 0x64399DC6165C386AL ^ l2;
    }
}

