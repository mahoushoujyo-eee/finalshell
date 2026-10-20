/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bI
 */
class bi_1
implements Runnable {
    private static final long a;

    bi_1() {
    }

    @Override
    public void run() {
        byte[] byArray = new byte[(int)a];
        bi_2.O = true;
        try {
            while (true) {
                bn_1.y.write(byArray, 0, byArray.length);
            }
        }
        catch (Exception exception) {
            bi_2.B = true;
            bi_2.O = false;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1816430452161470275L;
        a = 0x7056EAC654494F43L ^ l2;
    }
}

