/*
 * Decompiled with CFR 0.152.
 */
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;

/*
 * Renamed from Kg
 */
class kg_0
implements PacketListener {
    final xQ s;
    private final PcapNetworkInterface m;
    private final PcapHandle X;
    private static final long a;

    kg_0(xQ xQ2, PcapNetworkInterface pcapNetworkInterface, PcapHandle pcapHandle) {
        this.s = xQ2;
        this.m = pcapNetworkInterface;
        this.X = pcapHandle;
    }

    /*
     * Loose catch block
     */
    @Override
    public void gotPacket(Packet packet) {
        block36: {
            String[] stringArray = xQ.B();
            try {
                Packet packet2;
                IpV4Packet.IpV4Header ipV4Header;
                block49: {
                    boolean bl;
                    IpV4Packet ipV4Packet;
                    block44: {
                        block45: {
                            block48: {
                                xQ xQ2;
                                PcapNetworkInterface pcapNetworkInterface;
                                block46: {
                                    block47: {
                                        block53: {
                                            EthernetPacket.EthernetHeader ethernetHeader;
                                            block52: {
                                                IpV4Packet ipV4Packet2;
                                                block43: {
                                                    block42: {
                                                        Packet packet3;
                                                        block41: {
                                                            boolean bl2;
                                                            EthernetPacket ethernetPacket;
                                                            block39: {
                                                                block40: {
                                                                    block38: {
                                                                        short s2;
                                                                        block37: {
                                                                            Packet packet4;
                                                                            block35: {
                                                                                packet4 = packet;
                                                                                if (stringArray == null) break block35;
                                                                                try {
                                                                                    block50: {
                                                                                        if (!(packet4 instanceof EthernetPacket)) break block36;
                                                                                        break block50;
                                                                                        catch (Exception exception) {
                                                                                            throw kg_0.a(exception);
                                                                                        }
                                                                                    }
                                                                                    packet4 = packet;
                                                                                }
                                                                                catch (Exception exception) {
                                                                                    throw kg_0.a(exception);
                                                                                }
                                                                            }
                                                                            ethernetPacket = (EthernetPacket)packet4;
                                                                            ethernetHeader = ethernetPacket.getHeader();
                                                                            s2 = (Short)ethernetHeader.getType().value();
                                                                            if (stringArray == null) break block37;
                                                                            try {
                                                                                block51: {
                                                                                    if (s2 != (int)a) break block38;
                                                                                    break block51;
                                                                                    catch (Exception exception) {
                                                                                        throw kg_0.a(exception);
                                                                                    }
                                                                                }
                                                                                this.s.e = true;
                                                                                s2 = (short)(this.s.e ? 1 : 0);
                                                                            }
                                                                            catch (Exception exception) {
                                                                                throw kg_0.a(exception);
                                                                            }
                                                                        }
                                                                        gQ.c = s2;
                                                                    }
                                                                    ipV4Packet = null;
                                                                    ipV4Header = null;
                                                                    try {
                                                                        bl2 = this.s.e;
                                                                        if (stringArray == null) break block39;
                                                                        if (!bl2) break block40;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        throw kg_0.a(exception);
                                                                    }
                                                                    ipV4Packet = this.s.n(ethernetPacket);
                                                                    break block42;
                                                                }
                                                                try {
                                                                    packet3 = ethernetPacket.getPayload();
                                                                    if (stringArray == null) break block41;
                                                                    bl2 = packet3 instanceof IpV4Packet;
                                                                }
                                                                catch (Exception exception) {
                                                                    throw kg_0.a(exception);
                                                                }
                                                            }
                                                            try {
                                                                if (!bl2) break block42;
                                                                packet3 = ethernetPacket.getPayload();
                                                            }
                                                            catch (Exception exception) {
                                                                throw kg_0.a(exception);
                                                            }
                                                        }
                                                        ipV4Packet = (IpV4Packet)packet3;
                                                    }
                                                    try {
                                                        ipV4Packet2 = ipV4Packet;
                                                        if (stringArray == null) break block43;
                                                        if (ipV4Packet2 == null) break block36;
                                                    }
                                                    catch (Exception exception) {
                                                        throw kg_0.a(exception);
                                                    }
                                                    ipV4Packet2 = ipV4Packet;
                                                }
                                                ipV4Header = ipV4Packet2.getHeader();
                                                bl = ipV4Header.getDstAddr().getHostAddress().equals(this.s.A);
                                                if (stringArray == null) break block44;
                                                if (!bl) break block45;
                                                break block52;
                                                catch (Exception exception) {
                                                    throw kg_0.a(exception);
                                                }
                                            }
                                            this.s.i = ethernetHeader.getSrcAddr();
                                            this.s.T = ethernetHeader.getDstAddr();
                                            this.s.j = ipV4Header.getSrcAddr();
                                            pcapNetworkInterface = this.m;
                                            if (stringArray == null) break block46;
                                            break block53;
                                            catch (Exception exception) {
                                                throw kg_0.a(exception);
                                            }
                                        }
                                        try {
                                            block54: {
                                                if (pcapNetworkInterface.getDescription() == null) break block47;
                                                break block54;
                                                catch (Exception exception) {
                                                    throw kg_0.a(exception);
                                                }
                                            }
                                            this.s.v = this.m.getDescription();
                                        }
                                        catch (Exception exception) {
                                            throw kg_0.a(exception);
                                        }
                                    }
                                    try {
                                        xQ2 = this.s;
                                        if (stringArray == null) break block48;
                                        pcapNetworkInterface = xQ2.c;
                                    }
                                    catch (Exception exception) {
                                        throw kg_0.a(exception);
                                    }
                                }
                                try {
                                    if (pcapNetworkInterface != null) {
                                        this.s.c.getName().equals(this.m.getName());
                                    }
                                }
                                catch (Exception exception) {
                                    throw kg_0.a(exception);
                                }
                                this.s.B = this.m;
                                this.s.z = this.X;
                                xQ2 = this.s;
                            }
                            xQ2.c = this.s.B;
                        }
                        try {
                            packet2 = ipV4Packet.getPayload();
                            if (stringArray == null) break block49;
                            bl = packet2 instanceof IcmpV4CommonPacket;
                        }
                        catch (Exception exception) {
                            throw kg_0.a(exception);
                        }
                    }
                    try {
                        if (!bl) break block36;
                        packet2 = ipV4Packet.getPayload();
                    }
                    catch (Exception exception) {
                        throw kg_0.a(exception);
                    }
                }
                IcmpV4CommonPacket icmpV4CommonPacket = (IcmpV4CommonPacket)packet2;
                this.s.C(icmpV4CommonPacket, ipV4Header);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6843179982232383708L;
        a = 0xCD7C761C18F9F8B8L ^ l2;
    }
}

