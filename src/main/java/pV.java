/*
 * Decompiled with CFR 0.152.
 */
public class pV
extends Exception {
    private static final long serialVersionUID;
    String x;

    pV(String string) {
        this.x = string;
    }

    @Override
    public void printStackTrace() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2;
        long l3 = 2028208590500628135L;
        serialVersionUID = l2 = 0x651F636B9109C224L ^ l3;
    }
}

