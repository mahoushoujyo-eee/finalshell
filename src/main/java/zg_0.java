/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/*
 * Renamed from zg
 */
public class zg_0 {
    static HashMap a;

    public void D() {
        ((HashMap)zg_0.a).clear();
    }

    public static synchronized boolean d(int n10, int n11) {
        int n12 = (n10 + "_" + n11).hashCode();
        return ((HashMap)zg_0.a).containsKey(n12);
    }

    public static synchronized uc_0 s(int n10, int n11) {
        int n12 = (n10 + "_" + n11).hashCode();
        return (uc_0)((HashMap)zg_0.a).get(n12);
    }

    public static void K() {
    }

    public static synchronized uc_0 u(BufferedImage bufferedImage, BufferedImage bufferedImage2, RenderingHints renderingHints, int n10, int n11) {
        int n12 = (n10 + "_" + n11).hashCode();
        uc_0 uc_02 = new uc_0();
        uc_02.F = n10;
        uc_02.U = n11;
        try {
            uc_02.q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)zg_0.a).put(n12, uc_02);
        return uc_02;
    }

    public static synchronized void o(uc_0 uc_02, int n10) {
        try {
            uc_02.T(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static synchronized void G(uc_0 uc_02, int n10) {
        block9: {
            int n11;
            block8: {
                String[] stringArray = F8.y();
                try {
                    uc_02.P(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String[] stringArray2 = stringArray;
                try {
                    n11 = (Integer)uc_02.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (stringArray2 != null) break block8;
                if (n11 != 0) break block9;
                n11 = (uc_02.F + "_" + uc_02.U).hashCode();
            }
            int n12 = n11;
            ((HashMap)zg_0.a).remove(n12);
            try {
                uc_02.E();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    private static void B(int n10, int n11) {
    }

    static {
        zg_0.a = new HashMap();
    }
}

