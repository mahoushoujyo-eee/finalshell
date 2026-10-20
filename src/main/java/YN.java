/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

public class YN {
    private static final String a;
    private static final long b;

    public static void main(String[] stringArray) {
        new YN();
    }

    public YN() {
        int n10 = (int)b;
        String string = a;
        try {
            xq_0.A().p(InetAddress.getByName(string), n10, null);
        }
        catch (UnknownHostException | NotOpenException | PcapNativeException exception) {
            exception.printStackTrace();
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
                char[] cArray3 = "H*5(;\r`E&".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 26;
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
                            n17 = 48;
                            break;
                        }
                        case 1: {
                            n17 = 81;
                            break;
                        }
                        case 2: {
                            n17 = 70;
                            break;
                        }
                        case 3: {
                            n17 = 86;
                            break;
                        }
                        case 4: {
                            n17 = 84;
                            break;
                        }
                        case 5: {
                            n17 = 57;
                            break;
                        }
                        default: {
                            n17 = 25;
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
        long l2 = 5237909011323948486L;
        b = 0xD72D53C881C80DCCL ^ l2;
    }
}

