/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;

/*
 * Renamed from l3
 */
class l3_0
implements Runnable {
    final FO F;
    private static final long a;

    l3_0(FO fO2) {
        this.F = fO2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        boolean bl = true;
        while (true) {
            String[] stringArray;
            if (bl && !(bl = false)) {
                stringArray = QI.N();
                if (stringArray != null) continue;
            }
            byte[] byArray = new byte[(int)a];
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.F.K.receive(datagramPacket);
                this.F.B(datagramPacket);
                continue;
            }
            catch (IOException iOException) {
                try {
                    if (stringArray != null) return;
                    if (this.F.H) continue;
                    return;
                }
                catch (IOException iOException2) {
                    throw l3_0.a(iOException2);
                }
            }
            break;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5808219319646314783L;
        a = 0x8F58CF15AD1464C3L ^ l2;
    }
}

