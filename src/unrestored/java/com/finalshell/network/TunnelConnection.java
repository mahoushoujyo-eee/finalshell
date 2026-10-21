package com.finalshell.network;

import com.finalshell.config.DnsResolveFailedSetting;
import com.finalshell.core.UL;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.concurrent.LinkedBlockingQueue;

public class TunnelConnection extends DatagramSocket {
   public boolean o = true;
   public boolean Y = true;
   public LinkedBlockingQueue J = new LinkedBlockingQueue();
   public DnsResolveFailedSetting i;
   public int y;
   public Object r = new Object();
   public boolean Z = false;
   public static String[] a;
   public static String[] b;

   public TunnelConnection() throws SocketException {
   }

   public TunnelConnection(int var1) throws SocketException {
      this.y = var1;
   }

   @Override
   public int getLocalPort() {
      return this.y;
   }

   @Override
   public void send(DatagramPacket param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 003: aconst_null
      // 004: astore 3
      // 005: astore 2
      // 006: aload 0
      // 007: aload 2
      // 008: ifnonnull 0bc
      // 00b: getfield com/finalshell/network/Tunnel.Y Z
      // 00e: ifeq 0bb
      // 011: goto 018
      // 014: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 0
      // 019: getfield com/finalshell/network/Tunnel.i Lcom/finalshell/config/DnsResolveFailedSetting;
      // 01c: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 01f: invokevirtual com/finalshell/core/ConnectTimeout.f ()Lcom/finalshell/core/SecondHandshake;
      // 022: astore 3
      // 023: aload 3
      // 024: aload 2
      // 025: ifnonnull 0b7
      // 028: ifnull 099
      // 02b: goto 032
      // 02e: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: aload 3
      // 033: getfield com/finalshell/core/SecondHandshake.o Ljava/net/Inet4Address;
      // 036: invokevirtual java/net/Inet4Address.getHostAddress ()Ljava/lang/String;
      // 039: aload 1
      // 03a: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 03d: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 040: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 043: aload 2
      // 044: ifnonnull 071
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: ifeq 078
      // 051: goto 058
      // 054: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 3
      // 059: aload 2
      // 05a: ifnonnull 0d3
      // 05d: goto 064
      // 060: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: getfield com/finalshell/core/SecondHandshake.S S
      // 067: invokestatic com/finalshell/config/DnsResolveFailedSetting.S (S)I
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 1
      // 072: invokevirtual java/net/DatagramPacket.getPort ()I
      // 075: if_icmpeq 0d2
      // 078: aload 0
      // 079: getfield com/finalshell/network/Tunnel.i Lcom/finalshell/config/DnsResolveFailedSetting;
      // 07c: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 07f: aload 3
      // 080: invokevirtual com/finalshell/core/ConnectTimeout.M (Lcom/finalshell/core/SecondHandshake;)V
      // 083: aload 0
      // 084: getfield com/finalshell/network/Tunnel.i Lcom/finalshell/config/DnsResolveFailedSetting;
      // 087: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 08a: aconst_null
      // 08b: invokevirtual com/finalshell/core/ConnectTimeout.E (Lcom/finalshell/core/SecondHandshake;)V
      // 08e: aload 2
      // 08f: ifnull 0d2
      // 092: goto 099
      // 095: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: aload 0
      // 09a: aload 1
      // 09b: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 09e: aload 1
      // 09f: invokevirtual java/net/DatagramPacket.getPort ()I
      // 0a2: i2s
      // 0a3: invokevirtual com/finalshell/network/Tunnel.E (Ljava/net/InetAddress;S)V
      // 0a6: aload 0
      // 0a7: getfield com/finalshell/network/Tunnel.i Lcom/finalshell/config/DnsResolveFailedSetting;
      // 0aa: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 0ad: invokevirtual com/finalshell/core/ConnectTimeout.f ()Lcom/finalshell/core/SecondHandshake;
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: astore 3
      // 0b8: goto 0d2
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/network/Tunnel.i Lcom/finalshell/config/DnsResolveFailedSetting;
      // 0bf: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 0c2: aload 1
      // 0c3: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 0c6: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 0c9: aload 1
      // 0ca: invokevirtual java/net/DatagramPacket.getPort ()I
      // 0cd: i2s
      // 0ce: invokevirtual com/finalshell/core/ConnectTimeout.z (Ljava/lang/String;S)Lcom/finalshell/core/SecondHandshake;
      // 0d1: astore 3
      // 0d2: aload 3
      // 0d3: aload 2
      // 0d4: ifnonnull 0e2
      // 0d7: ifnull 11b
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: aload 3
      // 0e2: aload 2
      // 0e3: ifnonnull 0fb
      // 0e6: getfield com/finalshell/core/SecondHandshake.v Z
      // 0e9: ifeq 106
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 3
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: aload 1
      // 0fc: invokevirtual java/net/DatagramPacket.getData ()[B
      // 0ff: invokevirtual com/finalshell/core/SecondHandshake.P ([B)V
      // 102: aload 2
      // 103: ifnull 157
      // 106: new java/io/IOException
      // 109: dup
      // 10a: sipush -30965
      // 10d: sipush 8678
      // 110: invokestatic com/finalshell/network/Tunnel.a (II)Ljava/lang/String;
      // 113: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 116: athrow
      // 117: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: new java/io/IOException
      // 11e: dup
      // 11f: new java/lang/StringBuilder
      // 122: dup
      // 123: sipush -30966
      // 126: sipush 27725
      // 129: invokestatic com/finalshell/network/Tunnel.a (II)Ljava/lang/String;
      // 12c: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 12f: getstatic com/finalshell/crypto/PingMessageR.U Ljava/util/concurrent/ThreadPoolExecutor;
      // 132: invokevirtual java/util/concurrent/ThreadPoolExecutor.getActiveCount ()I
      // 135: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 138: ldc " "
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13d: aload 1
      // 13e: invokevirtual java/net/DatagramPacket.getAddress ()Ljava/net/InetAddress;
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 144: ldc ":"
      // 146: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 149: aload 1
      // 14a: invokevirtual java/net/DatagramPacket.getPort ()I
      // 14d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 150: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 153: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 156: athrow
      // 157: return
   }

   public void E(InetAddress param1, short param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/config/DnsResolveFailedSetting.I$arrString ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/network/Tunnel.r Ljava/lang/Object;
      // 07: dup
      // 08: astore 4
      // 0a: monitorenter
      // 0b: astore 3
      // 0c: aload 0
      // 0d: getfield com/finalshell/network/Tunnel.i Lcom/finalshell/config/DnsResolveFailedSetting;
      // 10: getfield com/finalshell/config/DnsResolveFailedSetting.Z Lcom/finalshell/core/ConnectTimeout;
      // 13: invokevirtual com/finalshell/core/ConnectTimeout.f ()Lcom/finalshell/core/SecondHandshake;
      // 16: aload 3
      // 17: ifnonnull 74
      // 1a: ifnonnull 72
      // 1d: goto 24
      // 20: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: aload 3
      // 26: ifnonnull 58
      // 29: goto 30
      // 2c: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: getfield com/finalshell/network/Tunnel.Z Z
      // 33: ifeq 52
      // 36: goto 3d
      // 39: invokestatic com/finalshell/network/Tunnel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/finalshell/network/Tunnel.r Ljava/lang/Object;
      // 41: invokevirtual java/lang/Object.wait ()V
      // 44: goto 72
      // 47: astore 5
      // 49: aload 5
      // 4b: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 4e: aload 3
      // 4f: ifnull 72
      // 52: aload 0
      // 53: bipush 1
      // 54: putfield com/finalshell/network/Tunnel.Z Z
      // 57: aload 0
      // 58: getfield com/finalshell/network/Tunnel.i Lcom/finalshell/config/DnsResolveFailedSetting;
      // 5b: aload 1
      // 5c: invokevirtual java/net/InetAddress.getHostAddress ()Ljava/lang/String;
      // 5f: iload 2
      // 60: invokevirtual com/finalshell/config/DnsResolveFailedSetting.w (Ljava/lang/String;S)V
      // 63: goto 6d
      // 66: astore 5
      // 68: aload 5
      // 6a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 6d: aload 0
      // 6e: bipush 0
      // 6f: putfield com/finalshell/network/Tunnel.Z Z
      // 72: aload 4
      // 74: monitorexit
      // 75: goto 7c
      // 78: aload 4
      // 7a: monitorexit
      // 7b: athrow
      // 7c: return
   }

   @Override
   public synchronized void receive(DatagramPacket var1) throws IOException {
      Object var2 = null;

      try {
         var2 = (UL)this.J.take();
         var1.setData(((UL)var2).W);
         var1.setLength(((UL)var2).W.length);
         var1.setAddress(((UL)var2).V.o);
         var1.setPort(DnsResolveFailedSetting.S(((UL)var2).V.S));
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }
   }

   public void T(UL var1) {
      this.J.add(var1);
   }

   public boolean z() {
      return this.Y;
   }

   public void z(boolean var1) {
      this.Y = var1;
   }

   public DnsResolveFailedSetting c() {
      return this.i;
   }

   public void c(DnsResolveFailedSetting var1) {
      this.i = var1;
      var1.f = this;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -30965) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 150;
               break;
            case 1:
               var10000 = 213;
               break;
            case 2:
               var10000 = 178;
               break;
            case 3:
               var10000 = 218;
               break;
            case 4:
               var10000 = 232;
               break;
            case 5:
               var10000 = 237;
               break;
            case 6:
               var10000 = 125;
               break;
            case 7:
               var10000 = 135;
               break;
            case 8:
               var10000 = 186;
               break;
            case 9:
               var10000 = 121;
               break;
            case 10:
               var10000 = 253;
               break;
            case 11:
               var10000 = 182;
               break;
            case 12:
               var10000 = 188;
               break;
            case 13:
               var10000 = 234;
               break;
            case 14:
               var10000 = 148;
               break;
            case 15:
               var10000 = 14;
               break;
            case 16:
               var10000 = 2;
               break;
            case 17:
               var10000 = 83;
               break;
            case 18:
               var10000 = 132;
               break;
            case 19:
               var10000 = 181;
               break;
            case 20:
               var10000 = 160;
               break;
            case 21:
               var10000 = 222;
               break;
            case 22:
               var10000 = 32;
               break;
            case 23:
               var10000 = 29;
               break;
            case 24:
               var10000 = 156;
               break;
            case 25:
               var10000 = 27;
               break;
            case 26:
               var10000 = 215;
               break;
            case 27:
               var10000 = 108;
               break;
            case 28:
               var10000 = 131;
               break;
            case 29:
               var10000 = 56;
               break;
            case 30:
               var10000 = 19;
               break;
            case 31:
               var10000 = 219;
               break;
            case 32:
               var10000 = 197;
               break;
            case 33:
               var10000 = 63;
               break;
            case 34:
               var10000 = 173;
               break;
            case 35:
               var10000 = 98;
               break;
            case 36:
               var10000 = 185;
               break;
            case 37:
               var10000 = 249;
               break;
            case 38:
               var10000 = 176;
               break;
            case 39:
               var10000 = 190;
               break;
            case 40:
               var10000 = 136;
               break;
            case 41:
               var10000 = 100;
               break;
            case 42:
               var10000 = 168;
               break;
            case 43:
               var10000 = 227;
               break;
            case 44:
               var10000 = 187;
               break;
            case 45:
               var10000 = 225;
               break;
            case 46:
               var10000 = 7;
               break;
            case 47:
               var10000 = 251;
               break;
            case 48:
               var10000 = 57;
               break;
            case 49:
               var10000 = 23;
               break;
            case 50:
               var10000 = 126;
               break;
            case 51:
               var10000 = 240;
               break;
            case 52:
               var10000 = 201;
               break;
            case 53:
               var10000 = 133;
               break;
            case 54:
               var10000 = 238;
               break;
            case 55:
               var10000 = 81;
               break;
            case 56:
               var10000 = 207;
               break;
            case 57:
               var10000 = 16;
               break;
            case 58:
               var10000 = 166;
               break;
            case 59:
               var10000 = 241;
               break;
            case 60:
               var10000 = 224;
               break;
            case 61:
               var10000 = 68;
               break;
            case 62:
               var10000 = 128;
               break;
            case 63:
               var10000 = 141;
               break;
            case 64:
               var10000 = 170;
               break;
            case 65:
               var10000 = 175;
               break;
            case 66:
               var10000 = 6;
               break;
            case 67:
               var10000 = 118;
               break;
            case 68:
               var10000 = 34;
               break;
            case 69:
               var10000 = 165;
               break;
            case 70:
               var10000 = 21;
               break;
            case 71:
               var10000 = 52;
               break;
            case 72:
               var10000 = 161;
               break;
            case 73:
               var10000 = 211;
               break;
            case 74:
               var10000 = 72;
               break;
            case 75:
               var10000 = 41;
               break;
            case 76:
               var10000 = 38;
               break;
            case 77:
               var10000 = 44;
               break;
            case 78:
               var10000 = 152;
               break;
            case 79:
               var10000 = 80;
               break;
            case 80:
               var10000 = 25;
               break;
            case 81:
               var10000 = 142;
               break;
            case 82:
               var10000 = 53;
               break;
            case 83:
               var10000 = 99;
               break;
            case 84:
               var10000 = 179;
               break;
            case 85:
               var10000 = 167;
               break;
            case 86:
               var10000 = 120;
               break;
            case 87:
               var10000 = 221;
               break;
            case 88:
               var10000 = 9;
               break;
            case 89:
               var10000 = 214;
               break;
            case 90:
               var10000 = 250;
               break;
            case 91:
               var10000 = 124;
               break;
            case 92:
               var10000 = 216;
               break;
            case 93:
               var10000 = 138;
               break;
            case 94:
               var10000 = 74;
               break;
            case 95:
               var10000 = 194;
               break;
            case 96:
               var10000 = 134;
               break;
            case 97:
               var10000 = 223;
               break;
            case 98:
               var10000 = 143;
               break;
            case 99:
               var10000 = 246;
               break;
            case 100:
               var10000 = 8;
               break;
            case 101:
               var10000 = 39;
               break;
            case 102:
               var10000 = 48;
               break;
            case 103:
               var10000 = 20;
               break;
            case 104:
               var10000 = 13;
               break;
            case 105:
               var10000 = 195;
               break;
            case 106:
               var10000 = 196;
               break;
            case 107:
               var10000 = 127;
               break;
            case 108:
               var10000 = 130;
               break;
            case 109:
               var10000 = 92;
               break;
            case 110:
               var10000 = 184;
               break;
            case 111:
               var10000 = 158;
               break;
            case 112:
               var10000 = 243;
               break;
            case 113:
               var10000 = 113;
               break;
            case 114:
               var10000 = 236;
               break;
            case 115:
               var10000 = 116;
               break;
            case 116:
               var10000 = 229;
               break;
            case 117:
               var10000 = 11;
               break;
            case 118:
               var10000 = 103;
               break;
            case 119:
               var10000 = 115;
               break;
            case 120:
               var10000 = 97;
               break;
            case 121:
               var10000 = 147;
               break;
            case 122:
               var10000 = 59;
               break;
            case 123:
               var10000 = 169;
               break;
            case 124:
               var10000 = 198;
               break;
            case 125:
               var10000 = 206;
               break;
            case 126:
               var10000 = 123;
               break;
            case 127:
               var10000 = 78;
               break;
            case 128:
               var10000 = 155;
               break;
            case 129:
               var10000 = 112;
               break;
            case 130:
               var10000 = 4;
               break;
            case 131:
               var10000 = 5;
               break;
            case 132:
               var10000 = 91;
               break;
            case 133:
               var10000 = 28;
               break;
            case 134:
               var10000 = 153;
               break;
            case 135:
               var10000 = 40;
               break;
            case 136:
               var10000 = 180;
               break;
            case 137:
               var10000 = 210;
               break;
            case 138:
               var10000 = 111;
               break;
            case 139:
               var10000 = 191;
               break;
            case 140:
               var10000 = 129;
               break;
            case 141:
               var10000 = 30;
               break;
            case 142:
               var10000 = 163;
               break;
            case 143:
               var10000 = 247;
               break;
            case 144:
               var10000 = 102;
               break;
            case 145:
               var10000 = 208;
               break;
            case 146:
               var10000 = 88;
               break;
            case 147:
               var10000 = 58;
               break;
            case 148:
               var10000 = 84;
               break;
            case 149:
               var10000 = 239;
               break;
            case 150:
               var10000 = 157;
               break;
            case 151:
               var10000 = 106;
               break;
            case 152:
               var10000 = 36;
               break;
            case 153:
               var10000 = 245;
               break;
            case 154:
               var10000 = 119;
               break;
            case 155:
               var10000 = 230;
               break;
            case 156:
               var10000 = 1;
               break;
            case 157:
               var10000 = 242;
               break;
            case 158:
               var10000 = 235;
               break;
            case 159:
               var10000 = 183;
               break;
            case 160:
               var10000 = 15;
               break;
            case 161:
               var10000 = 76;
               break;
            case 162:
               var10000 = 226;
               break;
            case 163:
               var10000 = 54;
               break;
            case 164:
               var10000 = 17;
               break;
            case 165:
               var10000 = 12;
               break;
            case 166:
               var10000 = 254;
               break;
            case 167:
               var10000 = 64;
               break;
            case 168:
               var10000 = 70;
               break;
            case 169:
               var10000 = 95;
               break;
            case 170:
               var10000 = 217;
               break;
            case 171:
               var10000 = 122;
               break;
            case 172:
               var10000 = 79;
               break;
            case 173:
               var10000 = 3;
               break;
            case 174:
               var10000 = 43;
               break;
            case 175:
               var10000 = 33;
               break;
            case 176:
               var10000 = 140;
               break;
            case 177:
               var10000 = 202;
               break;
            case 178:
               var10000 = 145;
               break;
            case 179:
               var10000 = 231;
               break;
            case 180:
               var10000 = 94;
               break;
            case 181:
               var10000 = 22;
               break;
            case 182:
               var10000 = 171;
               break;
            case 183:
               var10000 = 248;
               break;
            case 184:
               var10000 = 26;
               break;
            case 185:
               var10000 = 199;
               break;
            case 186:
               var10000 = 93;
               break;
            case 187:
               var10000 = 31;
               break;
            case 188:
               var10000 = 255;
               break;
            case 189:
               var10000 = 0;
               break;
            case 190:
               var10000 = 205;
               break;
            case 191:
               var10000 = 212;
               break;
            case 192:
               var10000 = 177;
               break;
            case 193:
               var10000 = 162;
               break;
            case 194:
               var10000 = 66;
               break;
            case 195:
               var10000 = 151;
               break;
            case 196:
               var10000 = 73;
               break;
            case 197:
               var10000 = 45;
               break;
            case 198:
               var10000 = 104;
               break;
            case 199:
               var10000 = 101;
               break;
            case 200:
               var10000 = 164;
               break;
            case 201:
               var10000 = 96;
               break;
            case 202:
               var10000 = 18;
               break;
            case 203:
               var10000 = 90;
               break;
            case 204:
               var10000 = 35;
               break;
            case 205:
               var10000 = 174;
               break;
            case 206:
               var10000 = 110;
               break;
            case 207:
               var10000 = 228;
               break;
            case 208:
               var10000 = 82;
               break;
            case 209:
               var10000 = 139;
               break;
            case 210:
               var10000 = 144;
               break;
            case 211:
               var10000 = 71;
               break;
            case 212:
               var10000 = 105;
               break;
            case 213:
               var10000 = 55;
               break;
            case 214:
               var10000 = 200;
               break;
            case 215:
               var10000 = 209;
               break;
            case 216:
               var10000 = 204;
               break;
            case 217:
               var10000 = 149;
               break;
            case 218:
               var10000 = 62;
               break;
            case 219:
               var10000 = 189;
               break;
            case 220:
               var10000 = 87;
               break;
            case 221:
               var10000 = 117;
               break;
            case 222:
               var10000 = 252;
               break;
            case 223:
               var10000 = 61;
               break;
            case 224:
               var10000 = 89;
               break;
            case 225:
               var10000 = 42;
               break;
            case 226:
               var10000 = 10;
               break;
            case 227:
               var10000 = 60;
               break;
            case 228:
               var10000 = 46;
               break;
            case 229:
               var10000 = 49;
               break;
            case 230:
               var10000 = 50;
               break;
            case 231:
               var10000 = 51;
               break;
            case 232:
               var10000 = 154;
               break;
            case 233:
               var10000 = 85;
               break;
            case 234:
               var10000 = 172;
               break;
            case 235:
               var10000 = 159;
               break;
            case 236:
               var10000 = 114;
               break;
            case 237:
               var10000 = 233;
               break;
            case 238:
               var10000 = 244;
               break;
            case 239:
               var10000 = 220;
               break;
            case 240:
               var10000 = 107;
               break;
            case 241:
               var10000 = 109;
               break;
            case 242:
               var10000 = 137;
               break;
            case 243:
               var10000 = 47;
               break;
            case 244:
               var10000 = 192;
               break;
            case 245:
               var10000 = 193;
               break;
            case 246:
               var10000 = 146;
               break;
            case 247:
               var10000 = 24;
               break;
            case 248:
               var10000 = 67;
               break;
            case 249:
               var10000 = 65;
               break;
            case 250:
               var10000 = 75;
               break;
            case 251:
               var10000 = 69;
               break;
            case 252:
               var10000 = 77;
               break;
            case 253:
               var10000 = 86;
               break;
            case 254:
               var10000 = 203;
               break;
            default:
               var10000 = 37;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "隴連柋轘挧÷\u000f陦邝亶嬉埆\u008bÎ8.o\u0096yW\u0099ë";
      int var4 = "隴連柋轘挧÷\u000f陦邝亶嬉埆\u008bÎ8.o\u0096yW\u0099ë".length();
      char var1 = 6;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 96;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 96;
               var10006 = var6;
            } else {
               var13 = 96;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 96;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 106;
                     break;
                  case 1:
                     var29 = 68;
                     break;
                  case 2:
                     var29 = 5;
                     break;
                  case 3:
                     var29 = 63;
                     break;
                  case 4:
                     var29 = 88;
                     break;
                  case 5:
                     var29 = 83;
                     break;
                  default:
                     var29 = 124;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[2];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}





