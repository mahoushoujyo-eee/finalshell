/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;

class xF
implements Runnable {
    final F0 X;
    private static final long a;

    xF(F0 f02) {
        this.X = f02;
    }

    @Override
    public void run() {
        while (true) {
            byte[] byArray = new byte[(int)a];
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.X.X.receive(datagramPacket);
                this.X.e(datagramPacket);
            }
            catch (IOException iOException) {
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5889304329227815079L;
        a = 0x979BD0E4A5CB4D7BL ^ l2;
    }
}

