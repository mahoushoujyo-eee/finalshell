/*
 * Decompiled with CFR 0.152.
 */
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;

/*
 * Renamed from kZ
 */
class kz_1
implements PacketListener {
    final li_0 p;
    private final PcapNetworkInterface e;
    private static final long a;

    kz_1(li_0 li_02, PcapNetworkInterface pcapNetworkInterface) {
        this.p = li_02;
        this.e = pcapNetworkInterface;
    }

    /*
     * Loose catch block
     */
    @Override
    public void gotPacket(Packet packet) {
        block42: {
            String[] stringArray = li_0.I();
            try {
                block57: {
                    kz_1 kz_12;
                    String string;
                    block56: {
                        boolean bl;
                        IpV4Packet.IpV4Header ipV4Header;
                        EthernetPacket.EthernetHeader ethernetHeader;
                        block53: {
                            block54: {
                                block55: {
                                    block64: {
                                        block63: {
                                            block50: {
                                                String string2;
                                                block51: {
                                                    block52: {
                                                        block61: {
                                                            block60: {
                                                                IpV4Packet ipV4Packet;
                                                                block49: {
                                                                    IpV4Packet ipV4Packet2;
                                                                    block48: {
                                                                        Packet packet2;
                                                                        block47: {
                                                                            boolean bl2;
                                                                            EthernetPacket ethernetPacket;
                                                                            block45: {
                                                                                block46: {
                                                                                    block44: {
                                                                                        short s2;
                                                                                        block43: {
                                                                                            Packet packet3;
                                                                                            block41: {
                                                                                                packet3 = packet;
                                                                                                if (stringArray != null) break block41;
                                                                                                try {
                                                                                                    block58: {
                                                                                                        if (!(packet3 instanceof EthernetPacket)) break block42;
                                                                                                        break block58;
                                                                                                        catch (Exception exception) {
                                                                                                            throw kz_1.a(exception);
                                                                                                        }
                                                                                                    }
                                                                                                    packet3 = packet;
                                                                                                }
                                                                                                catch (Exception exception) {
                                                                                                    throw kz_1.a(exception);
                                                                                                }
                                                                                            }
                                                                                            ethernetPacket = (EthernetPacket)packet3;
                                                                                            ethernetHeader = ethernetPacket.getHeader();
                                                                                            s2 = (Short)ethernetHeader.getType().value();
                                                                                            if (stringArray != null) break block43;
                                                                                            try {
                                                                                                block59: {
                                                                                                    if (s2 != (int)a) break block44;
                                                                                                    break block59;
                                                                                                    catch (Exception exception) {
                                                                                                        throw kz_1.a(exception);
                                                                                                    }
                                                                                                }
                                                                                                this.p.k = true;
                                                                                                s2 = (short)(this.p.k ? 1 : 0);
                                                                                            }
                                                                                            catch (Exception exception) {
                                                                                                throw kz_1.a(exception);
                                                                                            }
                                                                                        }
                                                                                        W1.A = s2;
                                                                                    }
                                                                                    ipV4Packet2 = null;
                                                                                    ipV4Header = null;
                                                                                    try {
                                                                                        bl2 = this.p.k;
                                                                                        if (stringArray != null) break block45;
                                                                                        if (!bl2) break block46;
                                                                                    }
                                                                                    catch (Exception exception) {
                                                                                        throw kz_1.a(exception);
                                                                                    }
                                                                                    ipV4Packet2 = this.p.v(ethernetPacket);
                                                                                    break block48;
                                                                                }
                                                                                try {
                                                                                    packet2 = ethernetPacket.getPayload();
                                                                                    if (stringArray != null) break block47;
                                                                                    bl2 = packet2 instanceof IpV4Packet;
                                                                                }
                                                                                catch (Exception exception) {
                                                                                    throw kz_1.a(exception);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (!bl2) break block48;
                                                                                packet2 = ethernetPacket.getPayload();
                                                                            }
                                                                            catch (Exception exception) {
                                                                                throw kz_1.a(exception);
                                                                            }
                                                                        }
                                                                        ipV4Packet2 = (IpV4Packet)packet2;
                                                                    }
                                                                    try {
                                                                        ipV4Packet = ipV4Packet2;
                                                                        if (stringArray != null) break block49;
                                                                        if (ipV4Packet == null) break block42;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        throw kz_1.a(exception);
                                                                    }
                                                                    ipV4Packet = ipV4Packet2;
                                                                }
                                                                ipV4Header = ipV4Packet.getHeader();
                                                                bl = ipV4Header.getSrcAddr().getHostAddress().equals(this.p.l);
                                                                if (stringArray != null) break block50;
                                                                if (!bl) break block52;
                                                                break block60;
                                                                catch (Exception exception) {
                                                                    throw kz_1.a(exception);
                                                                }
                                                            }
                                                            this.p.F = ethernetHeader.getDstAddr();
                                                            this.p.c = ethernetHeader.getSrcAddr();
                                                            this.p.W = ipV4Header.getDstAddr();
                                                            this.p.U = this.e.getName();
                                                            string2 = this.e.getDescription();
                                                            if (stringArray != null) break block51;
                                                            break block61;
                                                            catch (Exception exception) {
                                                                throw kz_1.a(exception);
                                                            }
                                                        }
                                                        try {
                                                            block62: {
                                                                if (string2 == null) break block52;
                                                                break block62;
                                                                catch (Exception exception) {
                                                                    throw kz_1.a(exception);
                                                                }
                                                            }
                                                            this.p.g = this.e.getDescription();
                                                        }
                                                        catch (Exception exception) {
                                                            throw kz_1.a(exception);
                                                        }
                                                    }
                                                    string2 = ipV4Header.getDstAddr().getHostAddress();
                                                }
                                                bl = string2.equals(this.p.l);
                                            }
                                            if (stringArray != null) break block53;
                                            if (!bl) break block55;
                                            break block63;
                                            catch (Exception exception) {
                                                throw kz_1.a(exception);
                                            }
                                        }
                                        this.p.F = ethernetHeader.getSrcAddr();
                                        this.p.c = ethernetHeader.getDstAddr();
                                        this.p.W = ipV4Header.getSrcAddr();
                                        this.p.U = this.e.getName();
                                        string = this.e.getDescription();
                                        if (stringArray != null) break block54;
                                        break block64;
                                        catch (Exception exception) {
                                            throw kz_1.a(exception);
                                        }
                                    }
                                    try {
                                        block65: {
                                            if (string == null) break block55;
                                            break block65;
                                            catch (Exception exception) {
                                                throw kz_1.a(exception);
                                            }
                                        }
                                        this.p.g = this.e.getDescription();
                                    }
                                    catch (Exception exception) {
                                        throw kz_1.a(exception);
                                    }
                                }
                                string = ipV4Header.getDstAddr().getHostAddress();
                            }
                            try {
                                if (stringArray != null) break block56;
                                bl = string.equals(this.p.Y);
                            }
                            catch (Exception exception) {
                                throw kz_1.a(exception);
                            }
                        }
                        if (!bl) break block42;
                        try {
                            block66: {
                                this.p.F = ethernetHeader.getSrcAddr();
                                this.p.c = ethernetHeader.getDstAddr();
                                this.p.W = ipV4Header.getSrcAddr();
                                this.p.U = this.e.getName();
                                kz_12 = this;
                                if (stringArray != null) break block57;
                                break block66;
                                catch (Exception exception) {
                                    throw kz_1.a(exception);
                                }
                            }
                            string = kz_12.e.getDescription();
                        }
                        catch (Exception exception) {
                            throw kz_1.a(exception);
                        }
                    }
                    if (string == null) break block42;
                    kz_12 = this;
                }
                kz_12.p.g = this.e.getDescription();
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
        long l2 = 6654318502173289387L;
        a = 0x4BEBD2C70FA6A3CFL ^ l2;
    }
}

