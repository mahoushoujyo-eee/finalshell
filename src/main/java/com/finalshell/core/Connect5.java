package com.finalshell.core;

import com.finalshell.task.Fs4;
import com.finalshell.task.LZ3;
import com.finalshell.task.ReadDoneTask;
import com.finalshell.task.ReadDoneTask3;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;

public class Connect5 {
   PcapNetworkInterface H;
   public static String r;
   public static String n;
   String m = "";
   PcapHandle F;
   Fm4 I = new Fm4();
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   static {
      __vfClinit__();
   }

   public static void main(String[] var0) throws Exception {
      Connect5 var1 = new Connect5();
      var1.Q();
   }

   Connect5() throws Exception {
      List var1 = null;
      var1 = Pcaps.findAllDevs();
      this.H = (PcapNetworkInterface)var1.get(0);
      System.out.println(this.H.getName() + ":" + this.H.getDescription() + " " + a(11404, 9209416878257102776L));
      this.F = this.H.openLive(a(19975, 5276185257872637233L), PcapNetworkInterface.PromiscuousMode.PROMISCUOUS, -1);

      try {
         ServerSocket var2 = new ServerSocket(a(11708, 2589683101895089801L));
         Fs4 var3 = new Fs4(this, var2);
         var3.start();
         ServerSocket var4 = new ServerSocket(a(10599, 4833676742896212560L));
         LZ3 var5 = new LZ3(this, var4);
         var5.start();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   void p(Socket var1) {
      try {
         OutputStream var3 = var1.getOutputStream();
         InputStream var2 = var1.getInputStream();
         new com.finalshell.task.WZ(this, var3);
         ReadDoneTask3 var5 = new ReadDoneTask3(this, var2);
         var5.start();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   void n(Socket var1) throws IOException {
      System.out.println(a(-276, -2375) + var1.getRemoteSocketAddress());
      OutputStream var2 = var1.getOutputStream();
      InputStream var3 = var1.getInputStream();
      new com.finalshell.task.J2(this, var2);
      ReadDoneTask var5 = new ReadDoneTask(this, var3);
      var5.start();
   }

   void Q() throws Exception {
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
      // 04: getfield com/finalshell/core/Connect5.H Lorg/pcap4j/core/PcapNetworkInterface;
      // 07: sipush 19975
      // 0a: ldc2_w 5276185257872637233
      // 0d: invokestatic com/finalshell/core/Connect5.a (IJ)I
      // 10: getstatic org/pcap4j/core/PcapNetworkInterface$PromiscuousMode.PROMISCUOUS Lorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;
      // 13: bipush -1
      // 14: invokevirtual org/pcap4j/core/PcapNetworkInterface.openLive (ILorg/pcap4j/core/PcapNetworkInterface$PromiscuousMode;I)Lorg/pcap4j/core/PcapHandle;
      // 17: astore 2
      // 18: astore 1
      // 19: aload 0
      // 1a: getfield com/finalshell/core/Connect5.m Ljava/lang/String;
      // 1d: invokevirtual java/lang/String.length ()I
      // 20: ifeq 35
      // 23: aload 2
      // 24: aload 0
      // 25: getfield com/finalshell/core/Connect5.m Ljava/lang/String;
      // 28: getstatic org/pcap4j/core/BpfProgram$BpfCompileMode.OPTIMIZE Lorg/pcap4j/core/BpfProgram$BpfCompileMode;
      // 2b: invokevirtual org/pcap4j/core/PcapHandle.setFilter (Ljava/lang/String;Lorg/pcap4j/core/BpfProgram$BpfCompileMode;)V
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Connect5.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 34: athrow
      // 35: new com/finalshell/core/BO
      // 38: dup
      // 39: aload 0
      // 3a: invokespecial com/finalshell/core/BO.<init> (Lcom/finalshell/core/Connect5;)V
      // 3d: astore 3
      // 3e: aload 2
      // 3f: bipush -1
      // 40: aload 3
      // 41: invokevirtual org/pcap4j/core/PcapHandle.loop (ILorg/pcap4j/core/PacketListener;)V
      // 44: goto 4e
      // 47: astore 4
      // 49: aload 4
      // 4b: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 4e: aload 2
      // 4f: invokevirtual org/pcap4j/core/PcapHandle.getStats ()Lorg/pcap4j/core/PcapStat;
      // 52: astore 4
      // 54: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 57: new java/lang/StringBuilder
      // 5a: dup
      // 5b: sipush -275
      // 5e: sipush 29305
      // 61: invokestatic com/finalshell/core/Connect5.a (II)Ljava/lang/String;
      // 64: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 67: aload 4
      // 69: invokevirtual org/pcap4j/core/PcapStat.getNumPacketsReceived ()J
      // 6c: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 6f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 72: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 75: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 78: new java/lang/StringBuilder
      // 7b: dup
      // 7c: sipush -278
      // 7f: sipush 24232
      // 82: invokestatic com/finalshell/core/Connect5.a (II)Ljava/lang/String;
      // 85: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 88: aload 4
      // 8a: invokevirtual org/pcap4j/core/PcapStat.getNumPacketsDropped ()J
      // 8d: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 90: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 93: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 96: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 99: new java/lang/StringBuilder
      // 9c: dup
      // 9d: sipush -277
      // a0: sipush -26357
      // a3: invokestatic com/finalshell/core/Connect5.a (II)Ljava/lang/String;
      // a6: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // a9: aload 4
      // ab: invokevirtual org/pcap4j/core/PcapStat.getNumPacketsDroppedByIf ()J
      // ae: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b4: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // b7: aload 1
      // b8: ifnonnull f4
      // bb: invokestatic com/sun/jna/Platform.isWindows ()Z
      // be: ifeq f0
      // c1: goto c8
      // c4: invokestatic com/finalshell/core/Connect5.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // c7: athrow
      // c8: getstatic java/lang/System.out Ljava/io/PrintStream;
      // cb: new java/lang/StringBuilder
      // ce: dup
      // cf: sipush -280
      // d2: sipush -7797
      // d5: invokestatic com/finalshell/core/Connect5.a (II)Ljava/lang/String;
      // d8: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // db: aload 4
      // dd: invokevirtual org/pcap4j/core/PcapStat.getNumPacketsCaptured ()J
      // e0: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e6: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // e9: goto f0
      // ec: invokestatic com/finalshell/core/Connect5.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // ef: athrow
      // f0: aload 2
      // f1: invokevirtual org/pcap4j/core/PcapHandle.close ()V
      // f4: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -279) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 231;
               break;
            case 1:
               var10000 = 33;
               break;
            case 2:
               var10000 = 22;
               break;
            case 3:
               var10000 = 197;
               break;
            case 4:
               var10000 = 149;
               break;
            case 5:
               var10000 = 198;
               break;
            case 6:
               var10000 = 177;
               break;
            case 7:
               var10000 = 9;
               break;
            case 8:
               var10000 = 244;
               break;
            case 9:
               var10000 = 43;
               break;
            case 10:
               var10000 = 108;
               break;
            case 11:
               var10000 = 232;
               break;
            case 12:
               var10000 = 56;
               break;
            case 13:
               var10000 = 247;
               break;
            case 14:
               var10000 = 245;
               break;
            case 15:
               var10000 = 152;
               break;
            case 16:
               var10000 = 4;
               break;
            case 17:
               var10000 = 170;
               break;
            case 18:
               var10000 = 87;
               break;
            case 19:
               var10000 = 192;
               break;
            case 20:
               var10000 = 31;
               break;
            case 21:
               var10000 = 235;
               break;
            case 22:
               var10000 = 252;
               break;
            case 23:
               var10000 = 40;
               break;
            case 24:
               var10000 = 70;
               break;
            case 25:
               var10000 = 71;
               break;
            case 26:
               var10000 = 137;
               break;
            case 27:
               var10000 = 37;
               break;
            case 28:
               var10000 = 127;
               break;
            case 29:
               var10000 = 135;
               break;
            case 30:
               var10000 = 89;
               break;
            case 31:
               var10000 = 75;
               break;
            case 32:
               var10000 = 55;
               break;
            case 33:
               var10000 = 130;
               break;
            case 34:
               var10000 = 36;
               break;
            case 35:
               var10000 = 172;
               break;
            case 36:
               var10000 = 120;
               break;
            case 37:
               var10000 = 105;
               break;
            case 38:
               var10000 = 14;
               break;
            case 39:
               var10000 = 7;
               break;
            case 40:
               var10000 = 114;
               break;
            case 41:
               var10000 = 217;
               break;
            case 42:
               var10000 = 183;
               break;
            case 43:
               var10000 = 190;
               break;
            case 44:
               var10000 = 166;
               break;
            case 45:
               var10000 = 242;
               break;
            case 46:
               var10000 = 168;
               break;
            case 47:
               var10000 = 6;
               break;
            case 48:
               var10000 = 214;
               break;
            case 49:
               var10000 = 41;
               break;
            case 50:
               var10000 = 72;
               break;
            case 51:
               var10000 = 145;
               break;
            case 52:
               var10000 = 207;
               break;
            case 53:
               var10000 = 102;
               break;
            case 54:
               var10000 = 73;
               break;
            case 55:
               var10000 = 126;
               break;
            case 56:
               var10000 = 17;
               break;
            case 57:
               var10000 = 90;
               break;
            case 58:
               var10000 = 158;
               break;
            case 59:
               var10000 = 50;
               break;
            case 60:
               var10000 = 171;
               break;
            case 61:
               var10000 = 213;
               break;
            case 62:
               var10000 = 93;
               break;
            case 63:
               var10000 = 154;
               break;
            case 64:
               var10000 = 175;
               break;
            case 65:
               var10000 = 153;
               break;
            case 66:
               var10000 = 156;
               break;
            case 67:
               var10000 = 211;
               break;
            case 68:
               var10000 = 86;
               break;
            case 69:
               var10000 = 18;
               break;
            case 70:
               var10000 = 34;
               break;
            case 71:
               var10000 = 47;
               break;
            case 72:
               var10000 = 186;
               break;
            case 73:
               var10000 = 96;
               break;
            case 74:
               var10000 = 67;
               break;
            case 75:
               var10000 = 99;
               break;
            case 76:
               var10000 = 12;
               break;
            case 77:
               var10000 = 11;
               break;
            case 78:
               var10000 = 131;
               break;
            case 79:
               var10000 = 165;
               break;
            case 80:
               var10000 = 44;
               break;
            case 81:
               var10000 = 35;
               break;
            case 82:
               var10000 = 132;
               break;
            case 83:
               var10000 = 239;
               break;
            case 84:
               var10000 = 111;
               break;
            case 85:
               var10000 = 203;
               break;
            case 86:
               var10000 = 238;
               break;
            case 87:
               var10000 = 209;
               break;
            case 88:
               var10000 = 54;
               break;
            case 89:
               var10000 = 20;
               break;
            case 90:
               var10000 = 196;
               break;
            case 91:
               var10000 = 229;
               break;
            case 92:
               var10000 = 49;
               break;
            case 93:
               var10000 = 125;
               break;
            case 94:
               var10000 = 0;
               break;
            case 95:
               var10000 = 116;
               break;
            case 96:
               var10000 = 80;
               break;
            case 97:
               var10000 = 85;
               break;
            case 98:
               var10000 = 230;
               break;
            case 99:
               var10000 = 129;
               break;
            case 100:
               var10000 = 29;
               break;
            case 101:
               var10000 = 234;
               break;
            case 102:
               var10000 = 118;
               break;
            case 103:
               var10000 = 48;
               break;
            case 104:
               var10000 = 188;
               break;
            case 105:
               var10000 = 160;
               break;
            case 106:
               var10000 = 250;
               break;
            case 107:
               var10000 = 94;
               break;
            case 108:
               var10000 = 225;
               break;
            case 109:
               var10000 = 38;
               break;
            case 110:
               var10000 = 216;
               break;
            case 111:
               var10000 = 63;
               break;
            case 112:
               var10000 = 5;
               break;
            case 113:
               var10000 = 150;
               break;
            case 114:
               var10000 = 1;
               break;
            case 115:
               var10000 = 162;
               break;
            case 116:
               var10000 = 138;
               break;
            case 117:
               var10000 = 104;
               break;
            case 118:
               var10000 = 19;
               break;
            case 119:
               var10000 = 240;
               break;
            case 120:
               var10000 = 218;
               break;
            case 121:
               var10000 = 140;
               break;
            case 122:
               var10000 = 16;
               break;
            case 123:
               var10000 = 184;
               break;
            case 124:
               var10000 = 195;
               break;
            case 125:
               var10000 = 27;
               break;
            case 126:
               var10000 = 8;
               break;
            case 127:
               var10000 = 51;
               break;
            case 128:
               var10000 = 200;
               break;
            case 129:
               var10000 = 112;
               break;
            case 130:
               var10000 = 141;
               break;
            case 131:
               var10000 = 110;
               break;
            case 132:
               var10000 = 68;
               break;
            case 133:
               var10000 = 30;
               break;
            case 134:
               var10000 = 227;
               break;
            case 135:
               var10000 = 181;
               break;
            case 136:
               var10000 = 95;
               break;
            case 137:
               var10000 = 62;
               break;
            case 138:
               var10000 = 223;
               break;
            case 139:
               var10000 = 26;
               break;
            case 140:
               var10000 = 233;
               break;
            case 141:
               var10000 = 136;
               break;
            case 142:
               var10000 = 179;
               break;
            case 143:
               var10000 = 187;
               break;
            case 144:
               var10000 = 249;
               break;
            case 145:
               var10000 = 174;
               break;
            case 146:
               var10000 = 193;
               break;
            case 147:
               var10000 = 106;
               break;
            case 148:
               var10000 = 254;
               break;
            case 149:
               var10000 = 167;
               break;
            case 150:
               var10000 = 117;
               break;
            case 151:
               var10000 = 32;
               break;
            case 152:
               var10000 = 25;
               break;
            case 153:
               var10000 = 58;
               break;
            case 154:
               var10000 = 164;
               break;
            case 155:
               var10000 = 98;
               break;
            case 156:
               var10000 = 144;
               break;
            case 157:
               var10000 = 169;
               break;
            case 158:
               var10000 = 159;
               break;
            case 159:
               var10000 = 100;
               break;
            case 160:
               var10000 = 78;
               break;
            case 161:
               var10000 = 91;
               break;
            case 162:
               var10000 = 228;
               break;
            case 163:
               var10000 = 134;
               break;
            case 164:
               var10000 = 81;
               break;
            case 165:
               var10000 = 66;
               break;
            case 166:
               var10000 = 222;
               break;
            case 167:
               var10000 = 237;
               break;
            case 168:
               var10000 = 206;
               break;
            case 169:
               var10000 = 77;
               break;
            case 170:
               var10000 = 147;
               break;
            case 171:
               var10000 = 60;
               break;
            case 172:
               var10000 = 204;
               break;
            case 173:
               var10000 = 199;
               break;
            case 174:
               var10000 = 53;
               break;
            case 175:
               var10000 = 88;
               break;
            case 176:
               var10000 = 61;
               break;
            case 177:
               var10000 = 220;
               break;
            case 178:
               var10000 = 143;
               break;
            case 179:
               var10000 = 182;
               break;
            case 180:
               var10000 = 161;
               break;
            case 181:
               var10000 = 246;
               break;
            case 182:
               var10000 = 122;
               break;
            case 183:
               var10000 = 243;
               break;
            case 184:
               var10000 = 251;
               break;
            case 185:
               var10000 = 65;
               break;
            case 186:
               var10000 = 248;
               break;
            case 187:
               var10000 = 84;
               break;
            case 188:
               var10000 = 210;
               break;
            case 189:
               var10000 = 64;
               break;
            case 190:
               var10000 = 155;
               break;
            case 191:
               var10000 = 57;
               break;
            case 192:
               var10000 = 39;
               break;
            case 193:
               var10000 = 157;
               break;
            case 194:
               var10000 = 59;
               break;
            case 195:
               var10000 = 151;
               break;
            case 196:
               var10000 = 21;
               break;
            case 197:
               var10000 = 128;
               break;
            case 198:
               var10000 = 76;
               break;
            case 199:
               var10000 = 194;
               break;
            case 200:
               var10000 = 74;
               break;
            case 201:
               var10000 = 124;
               break;
            case 202:
               var10000 = 42;
               break;
            case 203:
               var10000 = 148;
               break;
            case 204:
               var10000 = 178;
               break;
            case 205:
               var10000 = 119;
               break;
            case 206:
               var10000 = 109;
               break;
            case 207:
               var10000 = 215;
               break;
            case 208:
               var10000 = 24;
               break;
            case 209:
               var10000 = 142;
               break;
            case 210:
               var10000 = 92;
               break;
            case 211:
               var10000 = 52;
               break;
            case 212:
               var10000 = 97;
               break;
            case 213:
               var10000 = 189;
               break;
            case 214:
               var10000 = 2;
               break;
            case 215:
               var10000 = 253;
               break;
            case 216:
               var10000 = 226;
               break;
            case 217:
               var10000 = 224;
               break;
            case 218:
               var10000 = 146;
               break;
            case 219:
               var10000 = 241;
               break;
            case 220:
               var10000 = 82;
               break;
            case 221:
               var10000 = 103;
               break;
            case 222:
               var10000 = 13;
               break;
            case 223:
               var10000 = 101;
               break;
            case 224:
               var10000 = 180;
               break;
            case 225:
               var10000 = 255;
               break;
            case 226:
               var10000 = 107;
               break;
            case 227:
               var10000 = 202;
               break;
            case 228:
               var10000 = 139;
               break;
            case 229:
               var10000 = 191;
               break;
            case 230:
               var10000 = 15;
               break;
            case 231:
               var10000 = 201;
               break;
            case 232:
               var10000 = 10;
               break;
            case 233:
               var10000 = 46;
               break;
            case 234:
               var10000 = 176;
               break;
            case 235:
               var10000 = 221;
               break;
            case 236:
               var10000 = 113;
               break;
            case 237:
               var10000 = 79;
               break;
            case 238:
               var10000 = 212;
               break;
            case 239:
               var10000 = 115;
               break;
            case 240:
               var10000 = 69;
               break;
            case 241:
               var10000 = 205;
               break;
            case 242:
               var10000 = 45;
               break;
            case 243:
               var10000 = 83;
               break;
            case 244:
               var10000 = 173;
               break;
            case 245:
               var10000 = 23;
               break;
            case 246:
               var10000 = 123;
               break;
            case 247:
               var10000 = 236;
               break;
            case 248:
               var10000 = 28;
               break;
            case 249:
               var10000 = 121;
               break;
            case 250:
               var10000 = 208;
               break;
            case 251:
               var10000 = 133;
               break;
            case 252:
               var10000 = 185;
               break;
            case 253:
               var10000 = 219;
               break;
            case 254:
               var10000 = 163;
               break;
            default:
               var10000 = 3;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29495;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[7];
      int var11 = 0;
      String var10 = "\u0097¼Âº>\u001e?\u0010\tTàN3©qï6\u0094\u000b\f\u008e\u0015ôÅÖ\u0083\u0001\u008f-þ\tË=í\u008fÎ\u001ev'#\tÚÑÏ\u0004\u009d·ï\u009fÖ";
      int var12 = "\u0097¼Âº>\u001e?\u0010\tTàN3©qï6\u0094\u000b\f\u008e\u0015ôÅÖ\u0083\u0001\u008f-þ\tË=í\u008fÎ\u001ev'#\tÚÑÏ\u0004\u009d·ï\u009fÖ".length();
      char var9 = '\b';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 37;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 56;
                        break;
                     case 1:
                        var65 = 55;
                        break;
                     case 2:
                        var65 = 51;
                        break;
                     case 3:
                        var65 = 54;
                        break;
                     case 4:
                        var65 = 82;
                        break;
                     case 5:
                        var65 = 47;
                        break;
                     default:
                        var65 = 40;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[7];
                     long var0 = 2420769844116647820L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "¥Nªm²é÷´øaÓyQ*z½";
                     int var5 = "¥Nªm²é÷´øaÓyQ*z½".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[4];
                                    r = CO.class.getName() + a(-273, 16998);
                                    n = CO.class.getName() + a(-279, -17277);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "KÃ?\u0012\u0088ÅwU\u0092Ûë\u009b\u0080\u008c\u00984";
                                 var5 = "KÃ?\u0012\u0088ÅwU\u0092Ûë\u009b\u0080\u008c\u00984".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "挤匞迲挖Â\f\u0092-e¥¸ÉyÚ±M×æ";
                  var12 = "挤匞迲挖Â\f\u0092-e¥¸ÉyÚ±M×æ".length();
                  var9 = 5;
                  var17 = -1;
            }

            var10000 = 12;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





