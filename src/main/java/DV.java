/*
 * Decompiled with CFR 0.152.
 */
class DV
implements Runnable {
    DV() {
    }

    @Override
    public void run() {
        bi_2.O = true;
        byte[] byArray = new byte[1];
        try {
            int n10 = bn_1.J.read(byArray, 0, byArray.length);
        }
        catch (Exception exception) {
            bi_2.B = true;
        }
        bi_2.O = false;
    }
}

