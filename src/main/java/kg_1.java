/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * Renamed from kG
 */
class kg_1
extends Thread {
    final yt_1 M;
    private static final String a;
    private static final long b;

    kg_1(yt_1 yt_12) {
        this.M = yt_12;
    }

    @Override
    public void run() {
        byte[] byArray = new byte[(int)b];
        ky_2[] ky_2Array = yt_1.c();
        DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
        while (true) {
            long l2 = System.currentTimeMillis();
            try {
                ((DatagramSocket)this.M.D).receive(datagramPacket);
            }
            catch (IOException iOException) {
                if (ky_2Array != null) break;
            }
            byte[] byArray2 = datagramPacket.getData();
            String string = new String(byArray2, 0, datagramPacket.getLength());
            try {
                if (!string.equals(a)) continue;
                this.M.q = true;
            }
            catch (IOException iOException) {
                throw kg_1.a(iOException);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "+Qen:\"R".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 10;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 71;
                            break;
                        }
                        case 1: {
                            n17 = 40;
                            break;
                        }
                        case 2: {
                            n17 = 48;
                            break;
                        }
                        case 3: {
                            n17 = 8;
                            break;
                        }
                        case 4: {
                            n17 = 89;
                            break;
                        }
                        case 5: {
                            n17 = 94;
                            break;
                        }
                        default: {
                            n17 = 61;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 2041971949012568956L;
        b = 0xDBD90DAC3634CF7CL ^ l2;
    }
}

