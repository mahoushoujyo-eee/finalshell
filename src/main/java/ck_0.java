/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ck
 */
public abstract class ck_0
implements LayoutManager2 {
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public void addLayoutComponent(Component component, Object object) {
        try {
            this.O((Object)component, object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void addLayoutComponent(String string, Component component) {
        try {
            this.O((Object)component, (Object)string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void removeLayoutComponent(Component component) {
        try {
            this.B(component);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void O(Component component, Object object) {
    }

    public void B(Component component) {
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return this.preferredLayoutSize(container);
    }

    @Override
    public Dimension maximumLayoutSize(Container container) {
        return new Dimension(ck_0.a(10031, 8514026021197084715L), ck_0.a(10137, 963672662800955548L));
    }

    @Override
    public float getLayoutAlignmentX(Container container) {
        return 0.5f;
    }

    @Override
    public float getLayoutAlignmentY(Container container) {
        return 0.5f;
    }

    @Override
    public void invalidateLayout(Container container) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1452564465116053195L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0093\u007f\u00174\u00ba\u0085y\u001f=\u0087\u0003\byfy\u00a8";
        int n11 = "\u0093\u007f\u00174\u00ba\u0085y\u001f=\u0087\u0003\byfy\u00a8".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5F04;
        if (b[n11] == null) {
            ck_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

