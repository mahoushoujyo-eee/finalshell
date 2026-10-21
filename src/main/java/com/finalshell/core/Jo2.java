package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Jo2 extends Jk2 {
   public byte[] Z;
   public int N;
   public static String[] D;
   public static String[] a;
   public static String[] d;
   public static long[] h;
   public static Integer[] i;

   static {
      __vfClinit__();
   }

   public Jo2(int var1) {
      super(var1, null, 0);
      this.O = null;
      this.N = b(24596, 7334922390716042460L);
      this.Z = new byte[2];
      this.Z[0] = 0;
      this.Z[1] = (byte)this.r;
   }

   public Jo2(int var1, InetAddress var2, int var3) {
      this(0, var1, var2, var3, null);
   }

   public Jo2(int var1, InetAddress var2, int var3, String var4) {
      this(4, var1, var2, var3, var4);
   }

   public Jo2(int var1, int var2, InetAddress var3, int var4, String var5) {
   super(var2, var3, var4);
      String[] var6;
      Jo2 var9;
      int var12;
      label36: {
         String[] var10000 = Jk2.Y();
         var6 = var10000;
         this.O = var5;
         var9 = this;
         var12 = var1;
         if (var6 != null) {
            this.u = var1;
            var9 = this;
            if (var5 == null) {
               var12 = b(21571, 6177561274986657928L);
               break label36;
            }

            var12 = b(27472, 4730592630746072989L);
         }

         var12 += var5.length();
      }

      byte[] var7;
      label30: {
         var9.N = var12;
         this.Z = new byte[this.N];
         this.Z[0] = (byte)var1;
         this.Z[1] = (byte)this.r;
         this.Z[2] = (byte)(var4 >> b(12676, 8866442875455085898L));
         byte[] var10 = this.Z;
         if (var6 != null) {
            this.Z[3] = (byte)var4;
            if (var3 != null) {
               var7 = var3.getAddress();
               if (var6 != null) {
                  break label30;
               }
            }

            var10 = new byte[4];
         }

         var7 = var10;
         var7[0] = var7[1] = var7[2] = var7[3] = 0;
      }

      System.arraycopy(var7, 0, this.Z, 4, 4);
      String var11 = var5;
      if (var6 != null) {
         if (var5 == null) {
            return;
         }

         var11 = var5;
      }

      byte[] var8 = var11.getBytes();
      System.arraycopy(var8, 0, this.Z, b(12676, 8866442875455085898L), var8.length);
      this.Z[this.Z.length - 1] = 0;
   }

   public Jo2(InputStream var1, boolean var2) throws IOException {
      super();
      this.Z = null;
      this.b(var1, var2);
   }

   @Override
   public void K(InputStream var1) throws IOException {
      this.b(var1, true);
   }

   @Override
   public void b(InputStream param1, boolean param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Jk2.Y ()[Ljava/lang/String;
      // 003: new java/io/DataInputStream
      // 006: dup
      // 007: aload 1
      // 008: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 00b: astore 4
      // 00d: aload 0
      // 00e: aload 4
      // 010: invokevirtual java/io/DataInputStream.readUnsignedByte ()I
      // 013: putfield com/finalshell/core/Jo2.u I
      // 016: astore 3
      // 017: aload 0
      // 018: aload 4
      // 01a: invokevirtual java/io/DataInputStream.readUnsignedByte ()I
      // 01d: putfield com/finalshell/core/Jo2.r I
      // 020: iload 2
      // 021: aload 3
      // 022: ifnull 0c5
      // 025: ifeq 0bb
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield com/finalshell/core/Jo2.r I
      // 033: aload 3
      // 034: ifnull 0c5
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 03d: athrow
      // 03e: sipush 30607
      // 041: ldc2_w 3977236145783462720
      // 044: invokestatic com/finalshell/core/Jo2.b (IJ)I
      // 047: if_icmpeq 0bb
      // 04a: goto 051
      // 04d: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 050: athrow
      // 051: aload 0
      // 052: getfield com/finalshell/core/Jo2.r I
      // 055: sipush 12364
      // 058: ldc2_w 4321627839599910021
      // 05b: invokestatic com/finalshell/core/Jo2.b (IJ)I
      // 05e: aload 3
      // 05f: ifnull 087
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 068: athrow
      // 069: if_icmple 0a2
      // 06c: goto 073
      // 06f: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 072: athrow
      // 073: aload 0
      // 074: getfield com/finalshell/core/Jo2.r I
      // 077: sipush 23873
      // 07a: ldc2_w 4964228734229410187
      // 07d: invokestatic com/finalshell/core/Jo2.b (IJ)I
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 086: athrow
      // 087: if_icmpge 0a2
      // 08a: getstatic com/finalshell/core/Jo2.D [Ljava/lang/String;
      // 08d: aload 0
      // 08e: getfield com/finalshell/core/Jo2.r I
      // 091: sipush 12364
      // 094: ldc2_w 4321627839599910021
      // 097: invokestatic com/finalshell/core/Jo2.b (IJ)I
      // 09a: isub
      // 09b: aaload
      // 09c: astore 5
      // 09e: aload 3
      // 09f: ifnonnull 0ad
      // 0a2: sipush -30667
      // 0a5: sipush -23523
      // 0a8: invokestatic com/finalshell/core/Jo2.b (II)Ljava/lang/String;
      // 0ab: astore 5
      // 0ad: new com/finalshell/io/B52
      // 0b0: dup
      // 0b1: aload 0
      // 0b2: getfield com/finalshell/core/Jo2.r I
      // 0b5: aload 5
      // 0b7: invokespecial com/finalshell/io/B52.<init> (ILjava/lang/String;)V
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: aload 4
      // 0be: invokevirtual java/io/DataInputStream.readUnsignedShort ()I
      // 0c1: putfield com/finalshell/core/Jo2.R I
      // 0c4: bipush 4
      // 0c5: newarray 8
      // 0c7: astore 5
      // 0c9: aload 4
      // 0cb: aload 5
      // 0cd: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 0d0: aload 0
      // 0d1: aload 5
      // 0d3: invokestatic com/finalshell/core/Jo2.u ([B)Ljava/net/InetAddress;
      // 0d6: putfield com/finalshell/core/Jo2.e Ljava/net/InetAddress;
      // 0d9: aload 0
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/Jo2.e Ljava/net/InetAddress;
      // 0de: invokevirtual java/net/InetAddress.getHostName ()Ljava/lang/String;
      // 0e1: putfield com/finalshell/core/Jo2.B Ljava/lang/String;
      // 0e4: iload 2
      // 0e5: aload 3
      // 0e6: ifnull 0fe
      // 0e9: ifne 157
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f2: athrow
      // 0f3: aload 1
      // 0f4: invokevirtual java/io/InputStream.read ()I
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0fd: athrow
      // 0fe: istore 6
      // 100: sipush 16131
      // 103: ldc2_w 4722903599729054671
      // 106: invokestatic com/finalshell/core/Jo2.b (IJ)I
      // 109: newarray 8
      // 10b: astore 7
      // 10d: bipush 0
      // 10e: istore 8
      // 110: bipush 0
      // 111: istore 8
      // 113: aload 3
      // 114: ifnonnull 12f
      // 117: aload 7
      // 119: iload 8
      // 11b: iload 6
      // 11d: i2b
      // 11e: bastore
      // 11f: aload 1
      // 120: invokevirtual java/io/InputStream.read ()I
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 129: athrow
      // 12a: istore 6
      // 12c: iinc 8 1
      // 12f: iload 8
      // 131: aload 7
      // 133: arraylength
      // 134: if_icmpge 147
      // 137: iload 6
      // 139: aload 3
      // 13a: ifnull 12a
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/Jo2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 143: athrow
      // 144: ifgt 117
      // 147: aload 0
      // 148: new java/lang/String
      // 14b: dup
      // 14c: aload 7
      // 14e: bipush 0
      // 14f: iload 8
      // 151: invokespecial java/lang/String.<init> ([BII)V
      // 154: putfield com/finalshell/core/Jo2.O Ljava/lang/String;
      // 157: return
   }

   @Override
   public void l(OutputStream var1) throws IOException {
      String[] var2 = Jk2.Y();

      label20: {
         try {
            if (var2 == null) {
               return;
            }

            if (this.Z != null) {
               break label20;
            }
         } catch (IOException var4) {
            throw a(var4);
         }

         Jo2 var3 = new Jo2(this.u, this.r, this.e, this.R, this.O);
         this.Z = var3.Z;
         this.N = var3.N;
      }

      var1.write(this.Z);
   }

   public static InetAddress u(byte[] var0) {
      String var1 = n(var0, 0);

      try {
         return InetAddress.getByName(var1);
      } catch (UnknownHostException var3) {
         return null;
      }
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -30671) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 152;
               break;
            case 1:
               var10000 = 194;
               break;
            case 2:
               var10000 = 58;
               break;
            case 3:
               var10000 = 138;
               break;
            case 4:
               var10000 = 94;
               break;
            case 5:
               var10000 = 85;
               break;
            case 6:
               var10000 = 49;
               break;
            case 7:
               var10000 = 90;
               break;
            case 8:
               var10000 = 129;
               break;
            case 9:
               var10000 = 116;
               break;
            case 10:
               var10000 = 20;
               break;
            case 11:
               var10000 = 155;
               break;
            case 12:
               var10000 = 212;
               break;
            case 13:
               var10000 = 177;
               break;
            case 14:
               var10000 = 114;
               break;
            case 15:
               var10000 = 238;
               break;
            case 16:
               var10000 = 208;
               break;
            case 17:
               var10000 = 253;
               break;
            case 18:
               var10000 = 229;
               break;
            case 19:
               var10000 = 70;
               break;
            case 20:
               var10000 = 188;
               break;
            case 21:
               var10000 = 230;
               break;
            case 22:
               var10000 = 200;
               break;
            case 23:
               var10000 = 154;
               break;
            case 24:
               var10000 = 56;
               break;
            case 25:
               var10000 = 1;
               break;
            case 26:
               var10000 = 84;
               break;
            case 27:
               var10000 = 210;
               break;
            case 28:
               var10000 = 178;
               break;
            case 29:
               var10000 = 231;
               break;
            case 30:
               var10000 = 3;
               break;
            case 31:
               var10000 = 213;
               break;
            case 32:
               var10000 = 104;
               break;
            case 33:
               var10000 = 97;
               break;
            case 34:
               var10000 = 179;
               break;
            case 35:
               var10000 = 99;
               break;
            case 36:
               var10000 = 16;
               break;
            case 37:
               var10000 = 111;
               break;
            case 38:
               var10000 = 54;
               break;
            case 39:
               var10000 = 103;
               break;
            case 40:
               var10000 = 161;
               break;
            case 41:
               var10000 = 45;
               break;
            case 42:
               var10000 = 191;
               break;
            case 43:
               var10000 = 122;
               break;
            case 44:
               var10000 = 26;
               break;
            case 45:
               var10000 = 235;
               break;
            case 46:
               var10000 = 240;
               break;
            case 47:
               var10000 = 145;
               break;
            case 48:
               var10000 = 37;
               break;
            case 49:
               var10000 = 64;
               break;
            case 50:
               var10000 = 13;
               break;
            case 51:
               var10000 = 50;
               break;
            case 52:
               var10000 = 55;
               break;
            case 53:
               var10000 = 131;
               break;
            case 54:
               var10000 = 227;
               break;
            case 55:
               var10000 = 160;
               break;
            case 56:
               var10000 = 172;
               break;
            case 57:
               var10000 = 219;
               break;
            case 58:
               var10000 = 39;
               break;
            case 59:
               var10000 = 222;
               break;
            case 60:
               var10000 = 186;
               break;
            case 61:
               var10000 = 136;
               break;
            case 62:
               var10000 = 29;
               break;
            case 63:
               var10000 = 12;
               break;
            case 64:
               var10000 = 124;
               break;
            case 65:
               var10000 = 173;
               break;
            case 66:
               var10000 = 74;
               break;
            case 67:
               var10000 = 126;
               break;
            case 68:
               var10000 = 17;
               break;
            case 69:
               var10000 = 101;
               break;
            case 70:
               var10000 = 95;
               break;
            case 71:
               var10000 = 66;
               break;
            case 72:
               var10000 = 144;
               break;
            case 73:
               var10000 = 166;
               break;
            case 74:
               var10000 = 189;
               break;
            case 75:
               var10000 = 185;
               break;
            case 76:
               var10000 = 125;
               break;
            case 77:
               var10000 = 167;
               break;
            case 78:
               var10000 = 43;
               break;
            case 79:
               var10000 = 63;
               break;
            case 80:
               var10000 = 83;
               break;
            case 81:
               var10000 = 237;
               break;
            case 82:
               var10000 = 157;
               break;
            case 83:
               var10000 = 53;
               break;
            case 84:
               var10000 = 206;
               break;
            case 85:
               var10000 = 46;
               break;
            case 86:
               var10000 = 211;
               break;
            case 87:
               var10000 = 112;
               break;
            case 88:
               var10000 = 106;
               break;
            case 89:
               var10000 = 174;
               break;
            case 90:
               var10000 = 218;
               break;
            case 91:
               var10000 = 24;
               break;
            case 92:
               var10000 = 142;
               break;
            case 93:
               var10000 = 40;
               break;
            case 94:
               var10000 = 92;
               break;
            case 95:
               var10000 = 162;
               break;
            case 96:
               var10000 = 86;
               break;
            case 97:
               var10000 = 71;
               break;
            case 98:
               var10000 = 117;
               break;
            case 99:
               var10000 = 196;
               break;
            case 100:
               var10000 = 207;
               break;
            case 101:
               var10000 = 135;
               break;
            case 102:
               var10000 = 19;
               break;
            case 103:
               var10000 = 156;
               break;
            case 104:
               var10000 = 22;
               break;
            case 105:
               var10000 = 89;
               break;
            case 106:
               var10000 = 76;
               break;
            case 107:
               var10000 = 158;
               break;
            case 108:
               var10000 = 139;
               break;
            case 109:
               var10000 = 123;
               break;
            case 110:
               var10000 = 234;
               break;
            case 111:
               var10000 = 81;
               break;
            case 112:
               var10000 = 47;
               break;
            case 113:
               var10000 = 163;
               break;
            case 114:
               var10000 = 149;
               break;
            case 115:
               var10000 = 120;
               break;
            case 116:
               var10000 = 216;
               break;
            case 117:
               var10000 = 195;
               break;
            case 118:
               var10000 = 96;
               break;
            case 119:
               var10000 = 220;
               break;
            case 120:
               var10000 = 34;
               break;
            case 121:
               var10000 = 171;
               break;
            case 122:
               var10000 = 15;
               break;
            case 123:
               var10000 = 110;
               break;
            case 124:
               var10000 = 244;
               break;
            case 125:
               var10000 = 205;
               break;
            case 126:
               var10000 = 214;
               break;
            case 127:
               var10000 = 236;
               break;
            case 128:
               var10000 = 105;
               break;
            case 129:
               var10000 = 202;
               break;
            case 130:
               var10000 = 250;
               break;
            case 131:
               var10000 = 52;
               break;
            case 132:
               var10000 = 215;
               break;
            case 133:
               var10000 = 62;
               break;
            case 134:
               var10000 = 27;
               break;
            case 135:
               var10000 = 88;
               break;
            case 136:
               var10000 = 108;
               break;
            case 137:
               var10000 = 77;
               break;
            case 138:
               var10000 = 68;
               break;
            case 139:
               var10000 = 140;
               break;
            case 140:
               var10000 = 21;
               break;
            case 141:
               var10000 = 184;
               break;
            case 142:
               var10000 = 42;
               break;
            case 143:
               var10000 = 115;
               break;
            case 144:
               var10000 = 239;
               break;
            case 145:
               var10000 = 23;
               break;
            case 146:
               var10000 = 133;
               break;
            case 147:
               var10000 = 48;
               break;
            case 148:
               var10000 = 14;
               break;
            case 149:
               var10000 = 192;
               break;
            case 150:
               var10000 = 204;
               break;
            case 151:
               var10000 = 183;
               break;
            case 152:
               var10000 = 164;
               break;
            case 153:
               var10000 = 73;
               break;
            case 154:
               var10000 = 121;
               break;
            case 155:
               var10000 = 61;
               break;
            case 156:
               var10000 = 67;
               break;
            case 157:
               var10000 = 165;
               break;
            case 158:
               var10000 = 91;
               break;
            case 159:
               var10000 = 148;
               break;
            case 160:
               var10000 = 226;
               break;
            case 161:
               var10000 = 146;
               break;
            case 162:
               var10000 = 203;
               break;
            case 163:
               var10000 = 150;
               break;
            case 164:
               var10000 = 80;
               break;
            case 165:
               var10000 = 180;
               break;
            case 166:
               var10000 = 9;
               break;
            case 167:
               var10000 = 32;
               break;
            case 168:
               var10000 = 72;
               break;
            case 169:
               var10000 = 98;
               break;
            case 170:
               var10000 = 82;
               break;
            case 171:
               var10000 = 233;
               break;
            case 172:
               var10000 = 36;
               break;
            case 173:
               var10000 = 190;
               break;
            case 174:
               var10000 = 181;
               break;
            case 175:
               var10000 = 78;
               break;
            case 176:
               var10000 = 127;
               break;
            case 177:
               var10000 = 182;
               break;
            case 178:
               var10000 = 87;
               break;
            case 179:
               var10000 = 223;
               break;
            case 180:
               var10000 = 159;
               break;
            case 181:
               var10000 = 102;
               break;
            case 182:
               var10000 = 251;
               break;
            case 183:
               var10000 = 130;
               break;
            case 184:
               var10000 = 228;
               break;
            case 185:
               var10000 = 187;
               break;
            case 186:
               var10000 = 134;
               break;
            case 187:
               var10000 = 193;
               break;
            case 188:
               var10000 = 197;
               break;
            case 189:
               var10000 = 31;
               break;
            case 190:
               var10000 = 44;
               break;
            case 191:
               var10000 = 141;
               break;
            case 192:
               var10000 = 243;
               break;
            case 193:
               var10000 = 100;
               break;
            case 194:
               var10000 = 11;
               break;
            case 195:
               var10000 = 7;
               break;
            case 196:
               var10000 = 249;
               break;
            case 197:
               var10000 = 28;
               break;
            case 198:
               var10000 = 175;
               break;
            case 199:
               var10000 = 2;
               break;
            case 200:
               var10000 = 38;
               break;
            case 201:
               var10000 = 199;
               break;
            case 202:
               var10000 = 242;
               break;
            case 203:
               var10000 = 5;
               break;
            case 204:
               var10000 = 119;
               break;
            case 205:
               var10000 = 170;
               break;
            case 206:
               var10000 = 254;
               break;
            case 207:
               var10000 = 147;
               break;
            case 208:
               var10000 = 201;
               break;
            case 209:
               var10000 = 57;
               break;
            case 210:
               var10000 = 143;
               break;
            case 211:
               var10000 = 75;
               break;
            case 212:
               var10000 = 118;
               break;
            case 213:
               var10000 = 41;
               break;
            case 214:
               var10000 = 151;
               break;
            case 215:
               var10000 = 168;
               break;
            case 216:
               var10000 = 224;
               break;
            case 217:
               var10000 = 65;
               break;
            case 218:
               var10000 = 6;
               break;
            case 219:
               var10000 = 107;
               break;
            case 220:
               var10000 = 217;
               break;
            case 221:
               var10000 = 225;
               break;
            case 222:
               var10000 = 232;
               break;
            case 223:
               var10000 = 10;
               break;
            case 224:
               var10000 = 79;
               break;
            case 225:
               var10000 = 252;
               break;
            case 226:
               var10000 = 255;
               break;
            case 227:
               var10000 = 30;
               break;
            case 228:
               var10000 = 33;
               break;
            case 229:
               var10000 = 241;
               break;
            case 230:
               var10000 = 4;
               break;
            case 231:
               var10000 = 35;
               break;
            case 232:
               var10000 = 132;
               break;
            case 233:
               var10000 = 176;
               break;
            case 234:
               var10000 = 18;
               break;
            case 235:
               var10000 = 51;
               break;
            case 236:
               var10000 = 113;
               break;
            case 237:
               var10000 = 69;
               break;
            case 238:
               var10000 = 128;
               break;
            case 239:
               var10000 = 169;
               break;
            case 240:
               var10000 = 209;
               break;
            case 241:
               var10000 = 198;
               break;
            case 242:
               var10000 = 59;
               break;
            case 243:
               var10000 = 221;
               break;
            case 244:
               var10000 = 247;
               break;
            case 245:
               var10000 = 0;
               break;
            case 246:
               var10000 = 153;
               break;
            case 247:
               var10000 = 246;
               break;
            case 248:
               var10000 = 25;
               break;
            case 249:
               var10000 = 248;
               break;
            case 250:
               var10000 = 245;
               break;
            case 251:
               var10000 = 109;
               break;
            case 252:
               var10000 = 60;
               break;
            case 253:
               var10000 = 137;
               break;
            case 254:
               var10000 = 93;
               break;
            default:
               var10000 = 8;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11467;
      if (i[var3] == null) {
         i[var3] = (int)(h[var3] ^ var1);
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "\u0091Â)@Éi\u0094ê¡ì±jz´#>R»æùO\u0081\u0002\u0087\u0018Ñ!¾Ä\u008aê#JKM1]gU\u001dc\u008fwé\u0002\\íL\u008e8TðÆç´T¡ö³W¯à9\u008f÷n_G\u009e\u001a\u0094\"\u0007Á\u0017t\u001bî¹`|m/TÒfOrr\bp\u0019\u009bþk\u0097";
      int var12 = "\u0091Â)@Éi\u0094ê¡ì±jz´#>R»æùO\u0081\u0002\u0087\u0018Ñ!¾Ä\u008aê#JKM1]gU\u001dc\u008fwé\u0002\\íL\u008e8TðÆç´T¡ö³W¯à9\u008f÷n_G\u009e\u001a\u0094\"\u0007Á\u0017t\u001bî¹`|m/TÒfOrr\bp\u0019\u009bþk\u0097"
         .length();
      char var9 = '\'';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 15;
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
                        var65 = 19;
                        break;
                     case 1:
                        var65 = 125;
                        break;
                     case 2:
                        var65 = 112;
                        break;
                     case 3:
                        var65 = 120;
                        break;
                     case 4:
                        var65 = 45;
                        break;
                     case 5:
                        var65 = 5;
                        break;
                     default:
                        var65 = 15;
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
                     d = new String[5];
                     long var0 = 7209093591591782095L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = ";§\t\u008cÊ\u0096~O*^WºxØw\u0019åW¦r\u0091\u0095\u001a\u0010³Ñø2vïÊ\u0011e\u0082BbÞ\u001bÝÕ¾h×P\u008b\u0094\u009b\u008d";
                     int var5 = ";§\t\u008cÊ\u0096~O*^WºxØw\u0019åW¦r\u0091\u0095\u001a\u0010³Ñø2vïÊ\u0011e\u0082BbÞ\u001bÝÕ¾h×P\u008b\u0094\u009b\u008d"
                        .length();
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
                                    h = var6;
                                    i = new Integer[8];
                                    D = new String[]{b(-30670, 5692), b(-30669, -24250), b(-30671, -30333), b(-30672, -30683)};
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ðÃ\u008b \u0003ìÁ[±Y©N\u001d\u001c\u0014\u0000";
                                 var5 = "ðÃ\u008b \u0003ìÁ[±Y©N\u001d\u001c\u0014\u0000".length();
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

                  var10 = "\u008bø²Ì÷\u0083QF³4×Oq=»\u0012\u0019Õ\u001d\u0018QeÔ\u001eO(î;h´\u0013ù\u0087·";
                  var12 = "\u008bø²Ì÷\u0083QF³4×Oq=»\u0012\u0019Õ\u001d\u0018QeÔ\u001eO(î;h´\u0013ù\u0087·".length();
                  var9 = 15;
                  var17 = -1;
            }

            var10000 = 118;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





