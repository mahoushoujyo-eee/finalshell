/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

class BC
implements Runnable {
    final qu_0 H;
    private final we_0 A;

    BC(qu_0 qu_02, we_0 we_02) {
        this.H = qu_02;
        this.A = we_02;
    }

    @Override
    public void run() {
        block10: {
            qu_0 qu_02;
            block8: {
                this.H.M = this.A.r();
                String[] stringArray = QI.N();
                try {
                    this.H.s = InetAddress.getByName(this.H.M);
                }
                catch (UnknownHostException unknownHostException) {
                    unknownHostException.printStackTrace();
                }
                try {
                    block9: {
                        try {
                            try {
                                this.H.F = this.A.x();
                                qu_02 = this.H;
                                if (stringArray == null) break block8;
                                if (qu_02.N) break block9;
                            }
                            catch (UnknownHostException unknownHostException) {
                                throw BC.a(unknownHostException);
                            }
                            this.H.X();
                            if (stringArray != null) break block10;
                        }
                        catch (UnknownHostException unknownHostException) {
                            throw BC.a(unknownHostException);
                        }
                    }
                    qu_02 = this.H;
                }
                catch (UnknownHostException unknownHostException) {
                    throw BC.a(unknownHostException);
                }
            }
            qu_02.b();
        }
    }

    private static UnknownHostException a(UnknownHostException unknownHostException) {
        return unknownHostException;
    }
}

