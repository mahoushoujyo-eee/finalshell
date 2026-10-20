/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._Y;
import com.dm_2;
import com.rc_0;
import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import org.newsclub.net.unix.AFUNIXServerSocketChannel;
import org.newsclub.net.unix.AFUNIXSocketAddress;
import org.newsclub.net.unix.AFUNIXSocketChannel;

/*
 * Renamed from com.nF
 */
public class nf_1
implements rc_0 {
    private static final String a;

    public nf_1() throws _Y {
        block5: {
            boolean bl = dm_2.J();
            boolean bl2 = bl;
            try {
                AFUNIXSocketChannel aFUNIXSocketChannel;
                block4: {
                    AFUNIXSocketChannel aFUNIXSocketChannel2 = AFUNIXSocketChannel.open();
                    try {
                        aFUNIXSocketChannel = aFUNIXSocketChannel2;
                        if (bl2) break block4;
                        if (aFUNIXSocketChannel == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw nf_1.a(iOException);
                    }
                    aFUNIXSocketChannel = aFUNIXSocketChannel2;
                }
                aFUNIXSocketChannel.close();
            }
            catch (IOException | NoClassDefFoundError throwable) {
                throw new _Y(a, throwable);
            }
        }
    }

    @Override
    public SocketChannel o(Path path) throws IOException {
        AFUNIXSocketAddress aFUNIXSocketAddress = AFUNIXSocketAddress.of(path);
        AFUNIXSocketChannel aFUNIXSocketChannel = AFUNIXSocketChannel.open();
        aFUNIXSocketChannel.configureBlocking(true);
        aFUNIXSocketChannel.connect(aFUNIXSocketAddress);
        return aFUNIXSocketChannel;
    }

    @Override
    public ServerSocketChannel J(Path path) throws IOException {
        AFUNIXSocketAddress aFUNIXSocketAddress = AFUNIXSocketAddress.of(path);
        AFUNIXServerSocketChannel aFUNIXServerSocketChannel = AFUNIXServerSocketChannel.open();
        aFUNIXServerSocketChannel.configureBlocking(true);
        aFUNIXServerSocketChannel.bind(aFUNIXSocketAddress);
        return aFUNIXServerSocketChannel;
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
                char[] cArray3 = "EHq.6l)LVz3ns/MO~57?3A\\i&'s'MQz".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 37;
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
                            n17 = 10;
                            break;
                        }
                        case 1: {
                            n17 = 24;
                            break;
                        }
                        case 2: {
                            n17 = 58;
                            break;
                        }
                        case 3: {
                            n17 = 98;
                            break;
                        }
                        case 4: {
                            n17 = 107;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 99;
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

