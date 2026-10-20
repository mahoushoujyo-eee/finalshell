/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JPanel;

/*
 * Renamed from Tm
 */
public class tm_0
extends JPanel {
    private static int c;

    public static void R(int n10) {
        c = n10;
    }

    public static int o() {
        return c;
    }

    public static int r() {
        int n10 = tm_0.o();
        if (n10 == 0) {
            return 89;
        }
        return 0;
    }

    static {
        if (tm_0.o() == 0) {
            tm_0.R(62);
        }
    }
}

