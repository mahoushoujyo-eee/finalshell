/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Cy
 */
public class cy_0
extends Exception {
    private static final long serialVersionUID;
    private static int[] i;

    cy_0() {
    }

    @Override
    public void printStackTrace() {
    }

    public static void c(int[] nArray) {
        i = nArray;
    }

    public static int[] u() {
        return i;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2;
        if (cy_0.u() == null) {
            cy_0.c(new int[4]);
        }
        long l3 = 1033888976259585596L;
        serialVersionUID = l2 = 0x55F390E81A47F5A2L ^ l3;
    }
}

