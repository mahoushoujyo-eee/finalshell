/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Renamed from kn
 */
class kn_2
implements Runnable {
    Object[] T;
    String K;
    String N;

    kn_2(Object[] objectArray) {
        this.T = objectArray;
        this.N = null;
        this.K = null;
    }

    kn_2(Object[] objectArray, String string, String string2) {
        this.T = objectArray;
        this.K = string;
        this.N = string2;
    }

    public final void L() {
        this.Q(true);
    }

    public final void Q(boolean bl) {
        block3: {
            block2: {
                String[] stringArray = jk_0.Y();
                if (!bl) break block2;
                Thread thread = new Thread(this);
                thread.start();
                if (stringArray != null) break block3;
            }
            this.run();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void run() {
        block8: {
            var1_1 = jk_0.Y();
            try {
                block7: {
                    try {
                        v0 = this.K;
                        if (var1_1 == null) break block7;
                        if (v0 == null) {
                        }
                        ** GOTO lbl17
                    }
                    catch (UnknownHostException v1) {
                        throw kn_2.a(v1);
                    }
                    var2_2 = InetAddress.getByName((String)this.T[0]);
                    this.T[1] = var2_2;
                    var3_4 /* !! */  = new Long(TR.J(var2_2));
                    try {
                        this.T[2] = this.T[3] = var3_4 /* !! */ ;
                        if (var1_1 != null) break block8;
lbl17:
                        // 2 sources

                        v0 = this.K;
                    }
                    catch (UnknownHostException v2) {
                        throw kn_2.a(v2);
                    }
                }
                var2_2 = InetAddress.getByName(v0);
                var3_4 /* !! */  = InetAddress.getByName(this.N);
                this.T[2] = new Long(TR.J(var2_2));
                this.T[3] = new Long(TR.J(var3_4 /* !! */ ));
            }
            catch (UnknownHostException var2_3) {
                // empty catch block
            }
        }
    }

    private static UnknownHostException a(UnknownHostException unknownHostException) {
        return unknownHostException;
    }
}

