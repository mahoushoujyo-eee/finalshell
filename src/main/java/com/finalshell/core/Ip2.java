package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Ip2 {
   public int h;
   public byte[] m;
   public File U;
   public File x;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] f;

   public Ip2(File var1, File var2) {
      this.U = var1;
      this.x = var2;
      this.m = new byte[a(31294, 2030944994059029000L)];
      this.h = a(24575, 1119919088765874120L);
   }

   public List e() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 2
      // 08: invokestatic com/finalshell/core/Ip.v ()Z
      // 0b: new java/io/FileInputStream
      // 0e: dup
      // 0f: aload 0
      // 10: getfield com/finalshell/core/Ip2.U Ljava/io/File;
      // 13: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 16: astore 3
      // 17: istore 1
      // 18: new java/io/BufferedReader
      // 1b: dup
      // 1c: new java/io/InputStreamReader
      // 1f: dup
      // 20: aload 3
      // 21: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 24: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 27: astore 4
      // 29: aload 4
      // 2b: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 2e: dup
      // 2f: astore 5
      // 31: ifnull 9b
      // 34: new com/finalshell/core/Co4
      // 37: dup
      // 38: invokespecial com/finalshell/core/Co4.<init> ()V
      // 3b: astore 6
      // 3d: aload 5
      // 3f: ldc ","
      // 41: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 44: astore 7
      // 46: iload 1
      // 47: ifeq a0
      // 4a: aload 7
      // 4c: arraylength
      // 4d: iload 1
      // 4e: ifeq 96
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Ip2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: bipush 3
      // 59: if_icmpne 97
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/Ip2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 6
      // 65: aload 7
      // 67: bipush 0
      // 68: aaload
      // 69: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 6c: invokevirtual com/finalshell/core/Co4.o (Ljava/lang/String;)V
      // 6f: aload 6
      // 71: aload 7
      // 73: bipush 1
      // 74: aaload
      // 75: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 78: invokevirtual com/finalshell/core/Co4.s (Ljava/lang/String;)V
      // 7b: aload 6
      // 7d: aload 7
      // 7f: bipush 2
      // 80: aaload
      // 81: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 84: invokevirtual com/finalshell/core/Co4.m (Ljava/lang/String;)V
      // 87: aload 2
      // 88: aload 6
      // 8a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8f: goto 96
      // 92: invokestatic com/finalshell/core/Ip2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: pop
      // 97: iload 1
      // 98: ifne 29
      // 9b: aload 4
      // 9d: invokevirtual java/io/BufferedReader.close ()V
      // a0: aload 2
      // a1: areturn
   }

   public void w(List var1) throws Exception {
      var1.sort(Ip2::lambda$handleIpData$0);
      boolean var10000 = Ip.v();
      HashMap var3 = new HashMap();
      HashMap var4 = new HashMap();
      List var5 = var1.stream().map(Ip2::lambda$handleIpData$1).distinct().collect(Collectors.toList());
      List var6 = var1.stream().map(Ip2::lambda$handleIpData$2).distinct().collect(Collectors.toList());
      boolean var2 = var10000;
      Iterator var7 = var5.iterator();

      while (true) {
         if (var7.hasNext()) {
            String var8 = (String)var7.next();

            try {
               var3.put(var8, this.h);
               System.arraycopy(var8.getBytes(a(15505, -26299)), 0, this.m, this.h, var8.getBytes(a(15504, 10266)).length);
               this.h = this.h + var8.getBytes(a(15504, 10266)).length;
               this.m[this.h++] = 0;
               if (!var2) {
                  break;
               }

               if (var2) {
                  continue;
               }
            } catch (Exception var16) {
               throw a(var16);
            }
         }

         var7 = var6.iterator();
         break;
      }

      while (true) {
         if (var7.hasNext()) {
            String var18 = (String)var7.next();

            try {
               var4.put(var18, this.h);
               System.arraycopy(var18.getBytes(a(15504, 10266)), 0, this.m, this.h, var18.getBytes(a(15504, 10266)).length);
               this.h = this.h + var18.getBytes(a(15504, 10266)).length;
               var24 = this;
               if (!var2) {
                  break;
               }

               this.m[this.h++] = 0;
               if (var2) {
                  continue;
               }
            } catch (Exception var15) {
               throw a(var15);
            }
         }

         var24 = this;
         break;
      }

      int var17 = var24.h;
      Iterator var19 = var1.iterator();

      while (true) {
         if (var19.hasNext()) {
            Co4 var9 = (Co4)var19.next();
            long var10 = A(var9.G());
            int var12 = (Integer)var3.get(var9.I());
            int var13 = (Integer)var4.get(var9.u());
            var10 &= b(27782, 536094076997990677L);
            this.m[this.h++] = (byte)((int)(var10 & b(22025, 6031814460005663647L)));
            this.m[this.h++] = (byte)((int)(var10 >> a(24575, 1119919088765874120L) & b(22025, 6031814460005663647L)));
            this.m[this.h++] = (byte)((int)(var10 >> a(946, 3177728095509476238L) & b(22025, 6031814460005663647L)));
            this.m[this.h++] = (byte)((int)(var10 >> a(29865, 4328335029914010775L) & b(22025, 6031814460005663647L)));
            var12 &= -1;
            this.m[this.h++] = (byte)(var12 & a(21492, 1418427298462213057L));
            this.m[this.h++] = (byte)(var12 >> a(24575, 1119919088765874120L) & a(17025, 7614567023108862645L));
            this.m[this.h++] = (byte)(var12 >> a(946, 3177728095509476238L) & a(17025, 7614567023108862645L));
            var13 &= -1;

            try {
               this.m[this.h++] = (byte)(var13 & a(17025, 7614567023108862645L));
               this.m[this.h++] = (byte)(var13 >> a(24575, 1119919088765874120L) & a(17025, 7614567023108862645L));
               var25 = this;
               if (!var2) {
                  break;
               }

               this.m[this.h++] = (byte)(var13 >> a(946, 3177728095509476238L) & a(17025, 7614567023108862645L));
               if (var2) {
                  continue;
               }
            } catch (Exception var14) {
               throw a(var14);
            }
         }

         var25 = this;
         break;
      }

      int var20 = var25.h - a(9152, 4894340081107981304L);
      this.m[0] = (byte)(var17 & a(17025, 7614567023108862645L));
      this.m[1] = (byte)(var17 >> a(24575, 1119919088765874120L) & a(17025, 7614567023108862645L));
      this.m[2] = (byte)(var17 >> a(946, 3177728095509476238L) & a(17025, 7614567023108862645L));
      this.m[3] = (byte)(var17 >> a(29865, 4328335029914010775L) & a(17025, 7614567023108862645L));
      this.m[4] = (byte)(var20 & a(17025, 7614567023108862645L));
      this.m[5] = (byte)(var20 >> a(24575, 1119919088765874120L) & a(17025, 7614567023108862645L));
      this.m[a(12807, 7977225138544099901L)] = (byte)(var20 >> a(946, 3177728095509476238L) & a(17025, 7614567023108862645L));
      this.m[a(2683, 4959416084429240896L)] = (byte)(var20 >> a(29865, 4328335029914010775L) & a(17025, 7614567023108862645L));
   }

   public void D() throws Exception {
      List var1 = this.e();
      this.w(var1);
      this.Z();
   }

   public static long A(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ip.v ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 29
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ip2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new java/lang/NullPointerException
      // 16: dup
      // 17: sipush 15507
      // 1a: sipush 26101
      // 1d: invokestatic com/finalshell/core/Ip2.a (II)Ljava/lang/String;
      // 20: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/Ip2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: sipush 15509
      // 2c: sipush -5174
      // 2f: invokestatic com/finalshell/core/Ip2.a (II)Ljava/lang/String;
      // 32: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 35: astore 2
      // 36: aload 2
      // 37: bipush 0
      // 38: aaload
      // 39: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 3c: sipush 8235
      // 3f: ldc2_w 1059781274343617980
      // 42: invokestatic com/finalshell/core/Ip2.b (IJ)J
      // 45: land
      // 46: sipush 3070
      // 49: ldc2_w 4457867134299208647
      // 4c: invokestatic com/finalshell/core/Ip2.a (IJ)I
      // 4f: lshl
      // 50: sipush 31881
      // 53: ldc2_w 8501819527379085593
      // 56: invokestatic com/finalshell/core/Ip2.b (IJ)J
      // 59: land
      // 5a: lstore 3
      // 5b: lload 3
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: aaload
      // 5f: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 62: sipush 22025
      // 65: ldc2_w 6031814460005663647
      // 68: invokestatic com/finalshell/core/Ip2.b (IJ)J
      // 6b: land
      // 6c: sipush 23927
      // 6f: ldc2_w 5716022500506643784
      // 72: invokestatic com/finalshell/core/Ip2.a (IJ)I
      // 75: lshl
      // 76: sipush 8601
      // 79: ldc2_w 4827361223322678280
      // 7c: invokestatic com/finalshell/core/Ip2.b (IJ)J
      // 7f: land
      // 80: lor
      // 81: lstore 3
      // 82: lload 3
      // 83: aload 2
      // 84: bipush 2
      // 85: aaload
      // 86: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 89: sipush 22025
      // 8c: ldc2_w 6031814460005663647
      // 8f: invokestatic com/finalshell/core/Ip2.b (IJ)J
      // 92: land
      // 93: sipush 29895
      // 96: ldc2_w 6765354024649819386
      // 99: invokestatic com/finalshell/core/Ip2.a (IJ)I
      // 9c: lshl
      // 9d: sipush 3338
      // a0: ldc2_w 22772371954440344
      // a3: invokestatic com/finalshell/core/Ip2.b (IJ)J
      // a6: land
      // a7: lor
      // a8: lstore 3
      // a9: lload 3
      // aa: aload 2
      // ab: bipush 3
      // ac: aaload
      // ad: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // b0: sipush 22025
      // b3: ldc2_w 6031814460005663647
      // b6: invokestatic com/finalshell/core/Ip2.b (IJ)J
      // b9: land
      // ba: lor
      // bb: lstore 3
      // bc: lload 3
      // bd: lreturn
   }

   public void Z() throws Exception {
      FileOutputStream var2 = new FileOutputStream(this.x);
      boolean var10000 = Ip.h();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      var3.write(this.m, 0, this.h);
      boolean var1 = var10000;

      try {
         var3.writeTo(var2);
         var3.close();
         var2.close();
         if (var1) {
            Ky4.K(new String[2]);
         }
      } catch (Exception var4) {
         throw a(var4);
      }
   }

   public static void main(String[] param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/io/File
      // 03: dup
      // 04: sipush 15508
      // 07: sipush 1678
      // 0a: invokestatic com/finalshell/core/Ip2.a (II)Ljava/lang/String;
      // 0d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 10: astore 2
      // 11: new java/io/File
      // 14: dup
      // 15: sipush 15506
      // 18: sipush 13754
      // 1b: invokestatic com/finalshell/core/Ip2.a (II)Ljava/lang/String;
      // 1e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 21: astore 3
      // 22: new com/finalshell/core/Ip2
      // 25: dup
      // 26: aload 2
      // 27: aload 3
      // 28: invokespecial com/finalshell/core/Ip2.<init> (Ljava/io/File;Ljava/io/File;)V
      // 2b: astore 4
      // 2d: invokestatic com/finalshell/core/Ip.h ()Z
      // 30: aload 4
      // 32: invokevirtual com/finalshell/core/Ip2.D ()V
      // 35: istore 1
      // 36: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 39: ifnull 53
      // 3c: iload 1
      // 3d: ifeq 4f
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/Ip2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: bipush 0
      // 48: goto 50
      // 4b: invokestatic com/finalshell/core/Ip2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 1
      // 50: invokestatic com/finalshell/core/Ip.T (Z)V
      // 53: return
   }

   public static String lambda$handleIpData$2(Co4 var0) {
      return var0.u().trim();
   }

   public static String lambda$handleIpData$1(Co4 var0) {
      return var0.I().trim();
   }

   public static int lambda$handleIpData$0(Co4 var0, Co4 var1) {
      return (int)(A(var0.S) - A(var1.S));
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 15504) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 97;
               break;
            case 1:
               var10000 = 69;
               break;
            case 2:
               var10000 = 165;
               break;
            case 3:
               var10000 = 223;
               break;
            case 4:
               var10000 = 59;
               break;
            case 5:
               var10000 = 132;
               break;
            case 6:
               var10000 = 6;
               break;
            case 7:
               var10000 = 31;
               break;
            case 8:
               var10000 = 3;
               break;
            case 9:
               var10000 = 72;
               break;
            case 10:
               var10000 = 147;
               break;
            case 11:
               var10000 = 92;
               break;
            case 12:
               var10000 = 198;
               break;
            case 13:
               var10000 = 95;
               break;
            case 14:
               var10000 = 48;
               break;
            case 15:
               var10000 = 162;
               break;
            case 16:
               var10000 = 80;
               break;
            case 17:
               var10000 = 234;
               break;
            case 18:
               var10000 = 187;
               break;
            case 19:
               var10000 = 194;
               break;
            case 20:
               var10000 = 120;
               break;
            case 21:
               var10000 = 172;
               break;
            case 22:
               var10000 = 27;
               break;
            case 23:
               var10000 = 91;
               break;
            case 24:
               var10000 = 8;
               break;
            case 25:
               var10000 = 188;
               break;
            case 26:
               var10000 = 131;
               break;
            case 27:
               var10000 = 206;
               break;
            case 28:
               var10000 = 219;
               break;
            case 29:
               var10000 = 201;
               break;
            case 30:
               var10000 = 163;
               break;
            case 31:
               var10000 = 185;
               break;
            case 32:
               var10000 = 204;
               break;
            case 33:
               var10000 = 106;
               break;
            case 34:
               var10000 = 228;
               break;
            case 35:
               var10000 = 99;
               break;
            case 36:
               var10000 = 109;
               break;
            case 37:
               var10000 = 32;
               break;
            case 38:
               var10000 = 210;
               break;
            case 39:
               var10000 = 249;
               break;
            case 40:
               var10000 = 217;
               break;
            case 41:
               var10000 = 200;
               break;
            case 42:
               var10000 = 157;
               break;
            case 43:
               var10000 = 216;
               break;
            case 44:
               var10000 = 232;
               break;
            case 45:
               var10000 = 122;
               break;
            case 46:
               var10000 = 103;
               break;
            case 47:
               var10000 = 36;
               break;
            case 48:
               var10000 = 189;
               break;
            case 49:
               var10000 = 129;
               break;
            case 50:
               var10000 = 85;
               break;
            case 51:
               var10000 = 254;
               break;
            case 52:
               var10000 = 218;
               break;
            case 53:
               var10000 = 255;
               break;
            case 54:
               var10000 = 152;
               break;
            case 55:
               var10000 = 98;
               break;
            case 56:
               var10000 = 146;
               break;
            case 57:
               var10000 = 7;
               break;
            case 58:
               var10000 = 196;
               break;
            case 59:
               var10000 = 89;
               break;
            case 60:
               var10000 = 38;
               break;
            case 61:
               var10000 = 16;
               break;
            case 62:
               var10000 = 10;
               break;
            case 63:
               var10000 = 76;
               break;
            case 64:
               var10000 = 57;
               break;
            case 65:
               var10000 = 240;
               break;
            case 66:
               var10000 = 40;
               break;
            case 67:
               var10000 = 79;
               break;
            case 68:
               var10000 = 178;
               break;
            case 69:
               var10000 = 127;
               break;
            case 70:
               var10000 = 211;
               break;
            case 71:
               var10000 = 160;
               break;
            case 72:
               var10000 = 235;
               break;
            case 73:
               var10000 = 205;
               break;
            case 74:
               var10000 = 75;
               break;
            case 75:
               var10000 = 253;
               break;
            case 76:
               var10000 = 21;
               break;
            case 77:
               var10000 = 46;
               break;
            case 78:
               var10000 = 107;
               break;
            case 79:
               var10000 = 45;
               break;
            case 80:
               var10000 = 225;
               break;
            case 81:
               var10000 = 62;
               break;
            case 82:
               var10000 = 24;
               break;
            case 83:
               var10000 = 63;
               break;
            case 84:
               var10000 = 84;
               break;
            case 85:
               var10000 = 17;
               break;
            case 86:
               var10000 = 222;
               break;
            case 87:
               var10000 = 12;
               break;
            case 88:
               var10000 = 100;
               break;
            case 89:
               var10000 = 168;
               break;
            case 90:
               var10000 = 207;
               break;
            case 91:
               var10000 = 236;
               break;
            case 92:
               var10000 = 81;
               break;
            case 93:
               var10000 = 115;
               break;
            case 94:
               var10000 = 181;
               break;
            case 95:
               var10000 = 140;
               break;
            case 96:
               var10000 = 5;
               break;
            case 97:
               var10000 = 96;
               break;
            case 98:
               var10000 = 175;
               break;
            case 99:
               var10000 = 25;
               break;
            case 100:
               var10000 = 86;
               break;
            case 101:
               var10000 = 197;
               break;
            case 102:
               var10000 = 18;
               break;
            case 103:
               var10000 = 243;
               break;
            case 104:
               var10000 = 241;
               break;
            case 105:
               var10000 = 238;
               break;
            case 106:
               var10000 = 88;
               break;
            case 107:
               var10000 = 83;
               break;
            case 108:
               var10000 = 125;
               break;
            case 109:
               var10000 = 215;
               break;
            case 110:
               var10000 = 248;
               break;
            case 111:
               var10000 = 150;
               break;
            case 112:
               var10000 = 66;
               break;
            case 113:
               var10000 = 143;
               break;
            case 114:
               var10000 = 231;
               break;
            case 115:
               var10000 = 60;
               break;
            case 116:
               var10000 = 71;
               break;
            case 117:
               var10000 = 29;
               break;
            case 118:
               var10000 = 193;
               break;
            case 119:
               var10000 = 110;
               break;
            case 120:
               var10000 = 199;
               break;
            case 121:
               var10000 = 118;
               break;
            case 122:
               var10000 = 37;
               break;
            case 123:
               var10000 = 74;
               break;
            case 124:
               var10000 = 166;
               break;
            case 125:
               var10000 = 26;
               break;
            case 126:
               var10000 = 1;
               break;
            case 127:
               var10000 = 186;
               break;
            case 128:
               var10000 = 94;
               break;
            case 129:
               var10000 = 136;
               break;
            case 130:
               var10000 = 44;
               break;
            case 131:
               var10000 = 195;
               break;
            case 132:
               var10000 = 130;
               break;
            case 133:
               var10000 = 226;
               break;
            case 134:
               var10000 = 47;
               break;
            case 135:
               var10000 = 56;
               break;
            case 136:
               var10000 = 82;
               break;
            case 137:
               var10000 = 251;
               break;
            case 138:
               var10000 = 212;
               break;
            case 139:
               var10000 = 183;
               break;
            case 140:
               var10000 = 229;
               break;
            case 141:
               var10000 = 34;
               break;
            case 142:
               var10000 = 246;
               break;
            case 143:
               var10000 = 61;
               break;
            case 144:
               var10000 = 128;
               break;
            case 145:
               var10000 = 68;
               break;
            case 146:
               var10000 = 214;
               break;
            case 147:
               var10000 = 77;
               break;
            case 148:
               var10000 = 52;
               break;
            case 149:
               var10000 = 144;
               break;
            case 150:
               var10000 = 101;
               break;
            case 151:
               var10000 = 154;
               break;
            case 152:
               var10000 = 134;
               break;
            case 153:
               var10000 = 42;
               break;
            case 154:
               var10000 = 112;
               break;
            case 155:
               var10000 = 70;
               break;
            case 156:
               var10000 = 23;
               break;
            case 157:
               var10000 = 9;
               break;
            case 158:
               var10000 = 242;
               break;
            case 159:
               var10000 = 22;
               break;
            case 160:
               var10000 = 13;
               break;
            case 161:
               var10000 = 124;
               break;
            case 162:
               var10000 = 208;
               break;
            case 163:
               var10000 = 64;
               break;
            case 164:
               var10000 = 104;
               break;
            case 165:
               var10000 = 15;
               break;
            case 166:
               var10000 = 220;
               break;
            case 167:
               var10000 = 41;
               break;
            case 168:
               var10000 = 192;
               break;
            case 169:
               var10000 = 170;
               break;
            case 170:
               var10000 = 133;
               break;
            case 171:
               var10000 = 50;
               break;
            case 172:
               var10000 = 202;
               break;
            case 173:
               var10000 = 233;
               break;
            case 174:
               var10000 = 0;
               break;
            case 175:
               var10000 = 67;
               break;
            case 176:
               var10000 = 141;
               break;
            case 177:
               var10000 = 33;
               break;
            case 178:
               var10000 = 174;
               break;
            case 179:
               var10000 = 111;
               break;
            case 180:
               var10000 = 169;
               break;
            case 181:
               var10000 = 155;
               break;
            case 182:
               var10000 = 221;
               break;
            case 183:
               var10000 = 209;
               break;
            case 184:
               var10000 = 161;
               break;
            case 185:
               var10000 = 213;
               break;
            case 186:
               var10000 = 121;
               break;
            case 187:
               var10000 = 164;
               break;
            case 188:
               var10000 = 123;
               break;
            case 189:
               var10000 = 19;
               break;
            case 190:
               var10000 = 145;
               break;
            case 191:
               var10000 = 53;
               break;
            case 192:
               var10000 = 224;
               break;
            case 193:
               var10000 = 14;
               break;
            case 194:
               var10000 = 73;
               break;
            case 195:
               var10000 = 227;
               break;
            case 196:
               var10000 = 148;
               break;
            case 197:
               var10000 = 171;
               break;
            case 198:
               var10000 = 182;
               break;
            case 199:
               var10000 = 149;
               break;
            case 200:
               var10000 = 137;
               break;
            case 201:
               var10000 = 54;
               break;
            case 202:
               var10000 = 151;
               break;
            case 203:
               var10000 = 35;
               break;
            case 204:
               var10000 = 139;
               break;
            case 205:
               var10000 = 87;
               break;
            case 206:
               var10000 = 39;
               break;
            case 207:
               var10000 = 252;
               break;
            case 208:
               var10000 = 247;
               break;
            case 209:
               var10000 = 49;
               break;
            case 210:
               var10000 = 190;
               break;
            case 211:
               var10000 = 2;
               break;
            case 212:
               var10000 = 180;
               break;
            case 213:
               var10000 = 93;
               break;
            case 214:
               var10000 = 55;
               break;
            case 215:
               var10000 = 58;
               break;
            case 216:
               var10000 = 176;
               break;
            case 217:
               var10000 = 20;
               break;
            case 218:
               var10000 = 138;
               break;
            case 219:
               var10000 = 158;
               break;
            case 220:
               var10000 = 250;
               break;
            case 221:
               var10000 = 244;
               break;
            case 222:
               var10000 = 159;
               break;
            case 223:
               var10000 = 177;
               break;
            case 224:
               var10000 = 114;
               break;
            case 225:
               var10000 = 203;
               break;
            case 226:
               var10000 = 113;
               break;
            case 227:
               var10000 = 65;
               break;
            case 228:
               var10000 = 51;
               break;
            case 229:
               var10000 = 245;
               break;
            case 230:
               var10000 = 102;
               break;
            case 231:
               var10000 = 179;
               break;
            case 232:
               var10000 = 153;
               break;
            case 233:
               var10000 = 116;
               break;
            case 234:
               var10000 = 78;
               break;
            case 235:
               var10000 = 30;
               break;
            case 236:
               var10000 = 173;
               break;
            case 237:
               var10000 = 119;
               break;
            case 238:
               var10000 = 4;
               break;
            case 239:
               var10000 = 142;
               break;
            case 240:
               var10000 = 156;
               break;
            case 241:
               var10000 = 230;
               break;
            case 242:
               var10000 = 117;
               break;
            case 243:
               var10000 = 167;
               break;
            case 244:
               var10000 = 135;
               break;
            case 245:
               var10000 = 239;
               break;
            case 246:
               var10000 = 126;
               break;
            case 247:
               var10000 = 237;
               break;
            case 248:
               var10000 = 105;
               break;
            case 249:
               var10000 = 191;
               break;
            case 250:
               var10000 = 11;
               break;
            case 251:
               var10000 = 28;
               break;
            case 252:
               var10000 = 184;
               break;
            case 253:
               var10000 = 108;
               break;
            case 254:
               var10000 = 43;
               break;
            default:
               var10000 = 90;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28732;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 5522) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[6];
      int var19 = 0;
      String var18 = "D'Ê\u0003Ù\\y\b~¾àNºøq?\u0006I\u0094仆耵仛稱";
      int var20 = "D'Ê\u0003Ù\\y\b~¾àNºøq?\u0006I\u0094仆耵仛稱".length();
      char var17 = 3;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 82;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
      char[] var46;
            label83: {
               char[] var54 = var10001.toCharArray();
               int var10004 = var54.length;
               int var22 = 0;
               byte var57 = var10000;
               var46 = var54;
               int var34 = var10004;
               byte var66;
               char[] var74;
               int var10006;
               if (var10004 <= 1) {
                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               } else {
                  var57 = var10000;
                  var34 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var83 = var74[var10006];
                  byte var84;
                  switch (var22 % 7) {
                     case 0:
                        var84 = 15;
                        break;
                     case 1:
                        var84 = 91;
                        break;
                     case 2:
                        var84 = 95;
                        break;
                     case 3:
                        var84 = 87;
                        break;
                     case 4:
                        var84 = 102;
                        break;
                     case 5:
                        var84 = 93;
                        break;
                     default:
                        var84 = 120;
                  }

                  var74[var10006] = (char)(var83 ^ var66 ^ var84);
                  var22++;
                  if (var57 == 0) {
                     var10006 = var57;
                     var74 = var46;
                     var66 = var57;
                  } else {
                     if (var34 <= var22) {
                        break;
                     }

                     var74 = var46;
                     var66 = var57;
                     var10006 = var22;
                  }
               }
            }

            String var59 = new String(var46).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var59;
                  if ((var26 += var17) >= var20) {
                     a = var21;
                     b = new String[6];
                     long var8 = 2185261908882669371L;
                     long[] var14 = new long[12];
                     int var11 = 0;
                     String var12 = "Q\u0003\u001f¹\u0019ºL¥hs\u0092?×'»ÉÊ p\u0090:Ã;´V# f\"ò\u0012c«\u0015x5\u0094AlÉ\u0011IÑ§ÿîDä²\u0006\u00adXX\u0018}\u0000WTÀBÙçÅ|À\u009eÐ¹îê\rq\u000fBý\u0012,ª\u001c\u0005";
                     int var13 = "Q\u0003\u001f¹\u0019ºL¥hs\u0092?×'»ÉÊ p\u0090:Ã;´V# f\"ò\u0012c«\u0015x5\u0094AlÉ\u0011IÑ§ÿîDä²\u0006\u00adXX\u0018}\u0000WTÀBÙçÅ|À\u009eÐ¹îê\rq\u000fBý\u0012,ª\u001c\u0005"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var36 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var37 = var11++;
                        long var50 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var71 = var50 ^ var8;
                           switch (var60) {
                              case 0:
                                 var28[var37] = var71;
                                 if (var10 >= var13) {
                                    c = var14;
                                    d = new Integer[12];
                                    long var0 = 5356430330925199557L;
                                    long[] var6 = new long[6];
                                    int var3 = 0;
                                    String var4 = "J\u0005:[§å×]²Ú´G\\´¶/?©ZÑ\u0094\u0004YÜ\b«æud·\u0004Í";
                                    int var5 = "J\u0005:[§å×]²Ú´G\\´¶/?©ZÑ\u0094\u0004YÜ\b«æud·\u0004Í".length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var39 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var40 = var3++;
                                       long var52 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var62 = -1;

                                       while (true) {
                                          var71 = var52 ^ var0;
                                          switch (var62) {
                                             case 0:
                                                var29[var40] = var71;
                                                if (var2 >= var5) {
                                                   e = var6;
                                                   f = new Long[6];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "\u0019à\u0092J½_s¥DàÄu\u009e0\u0005\u0086";
                                                var5 = "\u0019à\u0092J½_s¥DàÄu\u009e0\u0005\u0086".length();
                                                var2 = 0;
                                          }

                                          byte var41 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var40 = var3++;
                                          var52 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var62 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var37] = var71;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "w^¦µÃ\u009bµ3S\u0098\u007f\u0091\u008b5\u0010û";
                                 var13 = "w^¦µÃ\u009bµ3S\u0098\u007f\u0091\u008b5\u0010û".length();
                                 var10 = 0;
                           }

                           byte var38 = var10;
                           var10 += 8;
                           var15 = var12.substring(var38, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var37 = var11++;
                           var50 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var59;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "p\u009d\u0004\u0003 ûSq$r·fù\u0002{|";
                  var20 = "p\u009d\u0004\u0003 ûSq$r·fù\u0002{|".length();
                  var17 = '\r';
                  var26 = -1;
            }

            var10000 = 48;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





