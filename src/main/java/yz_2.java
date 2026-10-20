/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;

/*
 * Renamed from yz
 */
class yz_2
implements Runnable {
    final o9_0 k;
    private static final long a;

    yz_2(o9_0 o9_02) {
        this.k = o9_02;
    }

    @Override
    public void run() {
        String[] stringArray = QI.N();
        block4: while (true) {
            byte[] byArray = new byte[(int)a];
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                lc_2 lc_22;
                block6: {
                    lc_2 lc_23;
                    this.k.k.receive(datagramPacket);
                    byte[] byArray2 = datagramPacket.getData();
                    int n10 = lh_1.z(byArray2, 0);
                    do {
                        if (n10 != D6.s) continue block4;
                        wu_0 wu_02 = new wu_0(datagramPacket);
                        int n11 = wu_02.l();
                        lc_22 = (lc_2)this.k.C.get(n11);
                    } while (stringArray == null);
                    try {
                        lc_23 = lc_22;
                        if (stringArray == null) break block6;
                        if (lc_23 == null) continue;
                    }
                    catch (IOException iOException) {
                        throw yz_2.a(iOException);
                    }
                    lc_22.B = true;
                    lc_22.m = System.currentTimeMillis();
                    lc_23 = lc_22;
                }
                lc_23.o = (int)(lc_22.m - lc_22.T);
            }
            catch (IOException iOException) {
                return;
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6897935784349423364L;
        a = 0x629C41E58D9A5304L ^ l2;
    }
}

