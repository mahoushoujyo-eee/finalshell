/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.OutputStream;

class BX
extends Thread {
    final n6 J;
    private final OutputStream y;
    private static final long a;

    BX(n6 n62, OutputStream outputStream) {
        this.J = n62;
        this.y = outputStream;
    }

    @Override
    public void run() {
        int n10 = 0;
        String[] stringArray = QI.N();
        block2: while (true) {
            try {
                this.y.write(new byte[(int)a]);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            ++n10;
            do {
                if (n10 <= 1) continue block2;
            } while (stringArray == null);
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2178795676662593198L;
        a = 0x4C640A74C9A1482EL ^ l2;
    }
}

