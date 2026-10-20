/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;

class JP
extends Thread {
    final la_1 U;
    private static final long a;

    JP(la_1 la_12) {
        this.U = la_12;
    }

    @Override
    public void run() {
        while (true) {
            byte[] byArray = new byte[(int)a];
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.U.X.receive(datagramPacket);
                this.U.Q.add(datagramPacket);
                continue;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                try {
                    Thread.sleep(1L);
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                    continue;
                }
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3802407109053930472L;
        a = 0xB9726A7A2945E34L ^ l2;
    }
}

