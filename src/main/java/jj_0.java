/*
 * Decompiled with CFR 0.152.
 */
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.PcapStat;

/*
 * Renamed from Jj
 */
class jj_0
extends Thread {
    final xQ H;
    private final PcapHandle C;
    private final PacketListener a;
    private final PcapNetworkInterface Y;

    jj_0(xQ xQ2, PcapHandle pcapHandle, PacketListener packetListener, PcapNetworkInterface pcapNetworkInterface) {
        this.H = xQ2;
        this.C = pcapHandle;
        this.a = packetListener;
        this.Y = pcapNetworkInterface;
    }

    @Override
    public void run() {
        try {
            this.C.loop(-1, this.a);
            PcapStat pcapStat = this.C.getStats();
            this.C.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.H.t.remove(this.Y.getName());
    }
}

