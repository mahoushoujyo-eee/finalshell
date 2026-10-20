/*
 * Decompiled with CFR 0.152.
 */
import org.pcap4j.core.PacketListener;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.Packet;

class LB
implements PacketListener {
    final li_0 n;

    LB(li_0 li_02) {
        this.n = li_02;
    }

    /*
     * Loose catch block
     */
    @Override
    public void gotPacket(Packet packet) {
        block6: {
            String[] stringArray = li_0.I();
            try {
                if (stringArray != null) break block6;
                try {
                    block7: {
                        if (!(packet instanceof EthernetPacket)) break block6;
                        break block7;
                        catch (Exception exception) {
                            throw LB.a(exception);
                        }
                    }
                    this.n.B(packet);
                }
                catch (Exception exception) {
                    throw LB.a(exception);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

