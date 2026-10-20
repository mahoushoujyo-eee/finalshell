/*
 * Decompiled with CFR 0.152.
 */
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapStat;

class OP
extends Thread {
    final li_0 d;
    private final PcapHandle v;
    private final PacketListener M;

    OP(li_0 li_02, PcapHandle pcapHandle, PacketListener packetListener) {
        this.d = li_02;
        this.v = pcapHandle;
        this.M = packetListener;
    }

    @Override
    public void run() {
        try {
            this.v.loop(-1, this.M);
            PcapStat pcapStat = this.v.getStats();
            this.v.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

