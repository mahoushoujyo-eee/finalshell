/*
 * Decompiled with CFR 0.152.
 */
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapStat;

/*
 * Renamed from cJ
 */
class cj_1
extends Thread {
    final li_0 m;
    private final PacketListener X;

    cj_1(li_0 li_02, PacketListener packetListener) {
        this.m = li_02;
        this.X = packetListener;
    }

    @Override
    public void run() {
        try {
            this.m.h.loop(-1, this.X);
            PcapStat pcapStat = this.m.h.getStats();
            this.m.h.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

