/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from nr
 */
public class nr_0
extends Exception {
    private static final long serialVersionUID;
    String s;

    nr_0(String string) {
        this.s = string;
    }

    @Override
    public void printStackTrace() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2;
        long l3 = 6882402631078578447L;
        serialVersionUID = l2 = 0xE855E341C3AE8EE3L ^ l3;
    }
}

