/*
 * Decompiled with CFR 0.152.
 */
import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IpV4Packet;

/*
 * Renamed from xq
 */
public class xq_0
extends xQ {
    static xq_0 p;

    public static synchronized xq_0 A() {
        xq_0 xq_02;
        block4: {
            block5: {
                String[] stringArray = xQ.B();
                try {
                    xq_02 = p;
                    if (stringArray == null) break block4;
                    if (xq_02 != null) break block5;
                }
                catch (Exception exception) {
                    throw xq_0.b(exception);
                }
                p = new xq_0(true, true);
                try {
                    p.u();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            xq_02 = p;
        }
        return xq_02;
    }

    public xq_0(boolean bl, boolean bl2) {
        super(bl, bl2);
    }

    @Override
    public void C(IcmpV4CommonPacket icmpV4CommonPacket, IpV4Packet.IpV4Header ipV4Header) {
        super.C(icmpV4CommonPacket, ipV4Header);
        ipV4Header.getSrcAddr().getHostAddress();
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

