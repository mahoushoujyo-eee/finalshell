/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Container;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from bu
 */
class bu_2
implements Runnable {
    final boolean i;
    final a3 r;
    private static final long a;

    bu_2(a3 a32, boolean bl) {
        this.r = a32;
        this.i = bl;
    }

    @Override
    public void run() {
        Rectangle rectangle;
        block10: {
            Rectangle rectangle2;
            int n10;
            block11: {
                Rectangle rectangle3;
                int[] nArray;
                block9: {
                    Rectangle rectangle4;
                    try {
                        rectangle4 = (Rectangle)this.r.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    rectangle = rectangle4;
                    nArray = a3.I();
                    Rectangle rectangle5 = ((a3)this.r).getBounds();
                    Container container = ((a3)this.r).getParent();
                    if (nArray != null) {
                        if (container == null) {
                            return;
                        }
                        container = ((a3)this.r).getParent();
                    }
                    rectangle3 = container.getBounds();
                    n10 = (int)a;
                    rectangle2 = rectangle3;
                    if (nArray == null) break block9;
                    if (rectangle2 == null) break block10;
                    rectangle2 = rectangle;
                }
                if (nArray == null) break block11;
                if (rectangle2 == null) break block10;
                rectangle2 = rectangle3;
            }
            if (rectangle2.height - rectangle.y < n10) {
                // empty if block
            }
        }
        if (this.i && rectangle != null) {
            ((a3)this.r).scrollRectToVisible(rectangle);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7446380712253550142L;
        a = 0xDA86FD6D20316E78L ^ l2;
    }
}

