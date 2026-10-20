/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Renamed from lZ
 */
class lz_1
extends Thread {
    final yf_1 p;
    private final ServerSocket f;
    private static final String a;

    lz_1(yf_1 yf_12, ServerSocket serverSocket) {
        this.p = yf_12;
        this.f = serverSocket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    Socket socket = this.f.accept();
                    System.out.println(a + socket.getRemoteSocketAddress());
                    this.p.p(socket);
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                continue;
            }
            break;
        }
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
                char[] cArray3 = "\u63d4\u5384\u8fa1\u6389WZ\u0016Q".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 82;
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
                            n17 = 35;
                            break;
                        }
                        case 1: {
                            n17 = 1;
                            break;
                        }
                        case 2: {
                            n17 = 45;
                            break;
                        }
                        case 3: {
                            n17 = 126;
                            break;
                        }
                        case 4: {
                            n17 = 55;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 118;
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
    }
}

