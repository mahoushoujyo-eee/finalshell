package com.finalshell.core;

import com.finalshell.config.DnsResolveFailedSetting;
import org.pcap4j.core.PacketListener;
import org.pcap4j.packet.Packet;

public class LB implements PacketListener {
   final DnsResolveFailedSetting n;

   LB(DnsResolveFailedSetting var1) {
      this.n = var1;
   }

   @Override
   public void gotPacket(Packet param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnonnull 25
      // 08: aload 1
      // 09: instanceof org/pcap4j/packet/EthernetPacket
      // 0c: ifeq 2d
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/LB.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/LB.n Lcom/finalshell/config/DnsResolveFailedSetting;
      // 1a: aload 1
      // 1b: invokevirtual com/finalshell/config/DnsResolveFailedSetting.B (Lorg/pcap4j/packet/Packet;)V
      // 1e: goto 25
      // 21: invokestatic com/finalshell/core/LB.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: goto 2d
      // 28: astore 3
      // 29: aload 3
      // 2a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 2d: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





