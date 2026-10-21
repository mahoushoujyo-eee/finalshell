package com.finalshell.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Ei2 implements Ic4 {
   public static int Y;
   public String P;
   public int h;
   public InputStream Z;
   public OutputStream w;
   public Socket G;
   public String M;
   public String L;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public Ei2(String var1) {
   super();
      boolean var10000 = Dm4.J$boolean();
      boolean var2 = var10000;
      int var3 = Y;
      String var4 = var1;

      label24: {
         try {
            if (var2) {
               return;
            }

            if (var1.indexOf(a(23778, 96189199492760108L)) == -1) {
               break label24;
            }
         } catch (Exception var7) {
            throw a(var7);
         }

         try {
            var4 = var1.substring(0, var1.indexOf(a(629, 8067234565891628217L)));
            var3 = Integer.parseInt(var1.substring(var1.indexOf(a(629, 8067234565891628217L)) + 1));
         } catch (Exception var6) {
         }
      }

      this.P = var4;
      this.h = var3;
   }

   public Ei2(String var1, int var2) {
      this.P = var1;
      this.h = var2;
   }

   public void U(String var1, String var2) {
      this.M = var1;
      this.L = var2;
   }

   @Override
   public void e(PJ3 param1, String param2, int param3, int param4) throws Pc2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 5
      // 005: iload 5
      // 007: ifne 06f
      // 00a: aload 1
      // 00b: ifnonnull 048
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 0
      // 016: aload 0
      // 017: getfield com/finalshell/core/Ei2.P Ljava/lang/String;
      // 01a: aload 0
      // 01b: getfield com/finalshell/core/Ei2.h I
      // 01e: iload 4
      // 020: invokestatic com/finalshell/core/E8.k (Ljava/lang/String;II)Ljava/net/Socket;
      // 023: putfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 026: aload 0
      // 027: aload 0
      // 028: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 02b: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 02e: putfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 031: aload 0
      // 032: aload 0
      // 033: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 036: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 039: putfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 03c: iload 5
      // 03e: ifeq 07d
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: aload 1
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/Ei2.P Ljava/lang/String;
      // 04e: aload 0
      // 04f: getfield com/finalshell/core/Ei2.h I
      // 052: invokeinterface com/finalshell/core/PJ3.y (Ljava/lang/String;I)Ljava/net/Socket; 3
      // 057: putfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 05a: aload 0
      // 05b: aload 1
      // 05c: aload 0
      // 05d: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 060: invokeinterface com/finalshell/core/PJ3.j (Ljava/net/Socket;)Ljava/io/InputStream; 2
      // 065: putfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: aload 0
      // 070: aload 1
      // 071: aload 0
      // 072: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 075: invokeinterface com/finalshell/core/PJ3.P (Ljava/net/Socket;)Ljava/io/OutputStream; 2
      // 07a: putfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 07d: iload 4
      // 07f: ifle 092
      // 082: aload 0
      // 083: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 086: iload 4
      // 088: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: aload 0
      // 093: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 096: bipush 1
      // 097: invokevirtual java/net/Socket.setTcpNoDelay (Z)V
      // 09a: aload 0
      // 09b: getfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 09e: new java/lang/StringBuilder
      // 0a1: dup
      // 0a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a5: sipush -26010
      // 0a8: sipush -21574
      // 0ab: invokestatic com/finalshell/core/Ei2.a (II)Ljava/lang/String;
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b1: aload 2
      // 0b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b5: ldc ":"
      // 0b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ba: iload 3
      // 0bb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0be: sipush -26012
      // 0c1: sipush 18334
      // 0c4: invokestatic com/finalshell/core/Ei2.a (II)Ljava/lang/String;
      // 0c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ca: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cd: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 0d0: invokevirtual java/io/OutputStream.write ([B)V
      // 0d3: aload 0
      // 0d4: iload 5
      // 0d6: ifne 171
      // 0d9: getfield com/finalshell/core/Ei2.M Ljava/lang/String;
      // 0dc: ifnull 15d
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: iload 5
      // 0e9: ifne 171
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: getfield com/finalshell/core/Ei2.L Ljava/lang/String;
      // 0f6: ifnull 15d
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: new java/lang/StringBuilder
      // 103: dup
      // 104: invokespecial java/lang/StringBuilder.<init> ()V
      // 107: aload 0
      // 108: getfield com/finalshell/core/Ei2.M Ljava/lang/String;
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: ldc ":"
      // 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113: aload 0
      // 114: getfield com/finalshell/core/Ei2.L Ljava/lang/String;
      // 117: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11d: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 120: astore 6
      // 122: aload 6
      // 124: bipush 0
      // 125: aload 6
      // 127: arraylength
      // 128: bipush 1
      // 129: invokestatic com/finalshell/core/E8.V ([BIIZ)[B
      // 12c: astore 6
      // 12e: aload 0
      // 12f: getfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 132: sipush -26009
      // 135: sipush 21552
      // 138: invokestatic com/finalshell/core/Ei2.a (II)Ljava/lang/String;
      // 13b: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 13e: invokevirtual java/io/OutputStream.write ([B)V
      // 141: aload 0
      // 142: getfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 145: aload 6
      // 147: invokevirtual java/io/OutputStream.write ([B)V
      // 14a: aload 0
      // 14b: getfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 14e: sipush -26016
      // 151: sipush 27314
      // 154: invokestatic com/finalshell/core/Ei2.a (II)Ljava/lang/String;
      // 157: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 15a: invokevirtual java/io/OutputStream.write ([B)V
      // 15d: aload 0
      // 15e: getfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 161: sipush -26011
      // 164: sipush 8136
      // 167: invokestatic com/finalshell/core/Ei2.a (II)Ljava/lang/String;
      // 16a: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 16d: invokevirtual java/io/OutputStream.write ([B)V
      // 170: aload 0
      // 171: getfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 174: invokevirtual java/io/OutputStream.flush ()V
      // 177: bipush 0
      // 178: istore 6
      // 17a: new java/lang/StringBuilder
      // 17d: dup
      // 17e: invokespecial java/lang/StringBuilder.<init> ()V
      // 181: astore 7
      // 183: iload 6
      // 185: iflt 1fb
      // 188: aload 0
      // 189: getfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 18c: invokevirtual java/io/InputStream.read ()I
      // 18f: istore 6
      // 191: iload 6
      // 193: iload 5
      // 195: ifne 1fd
      // 198: sipush 9378
      // 19b: ldc2_w 6398244208591845992
      // 19e: invokestatic com/finalshell/core/Ei2.a (IJ)I
      // 1a1: iload 5
      // 1a3: ifne 1ec
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: if_icmpeq 1cc
      // 1b0: goto 1b7
      // 1b3: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b6: athrow
      // 1b7: aload 7
      // 1b9: iload 6
      // 1bb: i2c
      // 1bc: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1bf: pop
      // 1c0: iload 5
      // 1c2: ifeq 183
      // 1c5: goto 1cc
      // 1c8: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: getfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 1d0: invokevirtual java/io/InputStream.read ()I
      // 1d3: istore 6
      // 1d5: iload 6
      // 1d7: iload 5
      // 1d9: ifne 1fd
      // 1dc: sipush 4388
      // 1df: ldc2_w 3747558605785370595
      // 1e2: invokestatic com/finalshell/core/Ei2.a (IJ)I
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: if_icmpeq 1fb
      // 1ef: iload 5
      // 1f1: ifeq 183
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fa: athrow
      // 1fb: iload 6
      // 1fd: ifge 20c
      // 200: new java/io/IOException
      // 203: dup
      // 204: invokespecial java/io/IOException.<init> ()V
      // 207: athrow
      // 208: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: aload 7
      // 20e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 211: astore 8
      // 213: sipush -26014
      // 216: sipush -14721
      // 219: invokestatic com/finalshell/core/Ei2.a (II)Ljava/lang/String;
      // 21c: astore 9
      // 21e: bipush -1
      // 21f: istore 10
      // 221: aload 8
      // 223: sipush 17690
      // 226: ldc2_w 216738344300534741
      // 229: invokestatic com/finalshell/core/Ei2.a (IJ)I
      // 22c: invokevirtual java/lang/String.indexOf (I)I
      // 22f: istore 6
      // 231: aload 8
      // 233: sipush 15621
      // 236: ldc2_w 6151627178397344717
      // 239: invokestatic com/finalshell/core/Ei2.a (IJ)I
      // 23c: iload 6
      // 23e: bipush 1
      // 23f: iadd
      // 240: invokevirtual java/lang/String.indexOf (II)I
      // 243: istore 11
      // 245: aload 8
      // 247: iload 6
      // 249: bipush 1
      // 24a: iadd
      // 24b: iload 11
      // 24d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 250: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 253: istore 10
      // 255: aload 8
      // 257: iload 11
      // 259: bipush 1
      // 25a: iadd
      // 25b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 25e: astore 9
      // 260: goto 265
      // 263: astore 11
      // 265: iload 10
      // 267: iload 5
      // 269: ifne 2a7
      // 26c: sipush 25303
      // 26f: ldc2_w 2397709623815863313
      // 272: invokestatic com/finalshell/core/Ei2.a (IJ)I
      // 275: if_icmpeq 2a6
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27e: athrow
      // 27f: new java/io/IOException
      // 282: dup
      // 283: new java/lang/StringBuilder
      // 286: dup
      // 287: invokespecial java/lang/StringBuilder.<init> ()V
      // 28a: sipush -26013
      // 28d: sipush 30339
      // 290: invokestatic com/finalshell/core/Ei2.a (II)Ljava/lang/String;
      // 293: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 296: aload 9
      // 298: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 29e: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 2a1: athrow
      // 2a2: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: bipush 0
      // 2a7: istore 11
      // 2a9: bipush 0
      // 2aa: istore 11
      // 2ac: iload 6
      // 2ae: iflt 31e
      // 2b1: aload 0
      // 2b2: getfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 2b5: invokevirtual java/io/InputStream.read ()I
      // 2b8: istore 6
      // 2ba: iload 6
      // 2bc: iload 5
      // 2be: ifne 320
      // 2c1: sipush 14366
      // 2c4: ldc2_w 6673198822416852695
      // 2c7: invokestatic com/finalshell/core/Ei2.a (IJ)I
      // 2ca: iload 5
      // 2cc: ifne 30f
      // 2cf: goto 2d6
      // 2d2: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d5: athrow
      // 2d6: if_icmpeq 2ef
      // 2d9: goto 2e0
      // 2dc: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2df: athrow
      // 2e0: iinc 11 1
      // 2e3: iload 5
      // 2e5: ifeq 2ac
      // 2e8: goto 2ef
      // 2eb: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ee: athrow
      // 2ef: aload 0
      // 2f0: getfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 2f3: invokevirtual java/io/InputStream.read ()I
      // 2f6: istore 6
      // 2f8: iload 6
      // 2fa: iload 5
      // 2fc: ifne 320
      // 2ff: sipush 31860
      // 302: ldc2_w 2387458014775403199
      // 305: invokestatic com/finalshell/core/Ei2.a (IJ)I
      // 308: goto 30f
      // 30b: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30e: athrow
      // 30f: if_icmpeq 31e
      // 312: iload 5
      // 314: ifeq 2ac
      // 317: goto 31e
      // 31a: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31d: athrow
      // 31e: iload 6
      // 320: iload 5
      // 322: ifne 33d
      // 325: ifge 33b
      // 328: goto 32f
      // 32b: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32e: athrow
      // 32f: new java/io/IOException
      // 332: dup
      // 333: invokespecial java/io/IOException.<init> ()V
      // 336: athrow
      // 337: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33a: athrow
      // 33b: iload 11
      // 33d: ifne 2a9
      // 340: iload 5
      // 342: ifne 31e
      // 345: goto 348
      // 348: goto 3a4
      // 34b: astore 6
      // 34d: aload 6
      // 34f: athrow
      // 350: astore 6
      // 352: aload 0
      // 353: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 356: iload 5
      // 358: ifne 370
      // 35b: ifnull 373
      // 35e: goto 365
      // 361: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 364: athrow
      // 365: aload 0
      // 366: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 369: goto 370
      // 36c: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: invokevirtual java/net/Socket.close ()V
      // 373: goto 378
      // 376: astore 7
      // 378: new java/lang/StringBuilder
      // 37b: dup
      // 37c: invokespecial java/lang/StringBuilder.<init> ()V
      // 37f: sipush -26015
      // 382: sipush -21586
      // 385: invokestatic com/finalshell/core/Ei2.a (II)Ljava/lang/String;
      // 388: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38b: aload 6
      // 38d: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 390: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 393: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 396: astore 7
      // 398: new com/finalshell/core/Pc2
      // 39b: dup
      // 39c: aload 7
      // 39e: aload 6
      // 3a0: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3a3: athrow
      // 3a4: return
   }

   @Override
   public InputStream R() {
      return this.Z;
   }

   @Override
   public OutputStream p() {
      return this.w;
   }

   @Override
   public Socket W() {
      return this.G;
   }

   @Override
   public void n() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 25
      // 09: getfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 1a: invokevirtual java/io/InputStream.close ()V
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: iload 1
      // 26: ifeq 45
      // 29: getfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 2c: ifnull 44
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 3a: invokevirtual java/io/OutputStream.close ()V
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 48: iload 1
      // 49: ifeq 61
      // 4c: ifnull 64
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 0
      // 57: getfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Ei2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: invokevirtual java/net/Socket.close ()V
      // 64: goto 68
      // 67: astore 2
      // 68: aload 0
      // 69: aconst_null
      // 6a: putfield com/finalshell/core/Ei2.Z Ljava/io/InputStream;
      // 6d: aload 0
      // 6e: aconst_null
      // 6f: putfield com/finalshell/core/Ei2.w Ljava/io/OutputStream;
      // 72: aload 0
      // 73: aconst_null
      // 74: putfield com/finalshell/core/Ei2.G Ljava/net/Socket;
      // 77: return
   }

   public static int u() {
      return Y;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -26012) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 208;
               break;
            case 1:
               var10000 = 251;
               break;
            case 2:
               var10000 = 255;
               break;
            case 3:
               var10000 = 146;
               break;
            case 4:
               var10000 = 191;
               break;
            case 5:
               var10000 = 79;
               break;
            case 6:
               var10000 = 201;
               break;
            case 7:
               var10000 = 161;
               break;
            case 8:
               var10000 = 175;
               break;
            case 9:
               var10000 = 220;
               break;
            case 10:
               var10000 = 53;
               break;
            case 11:
               var10000 = 23;
               break;
            case 12:
               var10000 = 177;
               break;
            case 13:
               var10000 = 150;
               break;
            case 14:
               var10000 = 183;
               break;
            case 15:
               var10000 = 30;
               break;
            case 16:
               var10000 = 35;
               break;
            case 17:
               var10000 = 87;
               break;
            case 18:
               var10000 = 214;
               break;
            case 19:
               var10000 = 61;
               break;
            case 20:
               var10000 = 48;
               break;
            case 21:
               var10000 = 33;
               break;
            case 22:
               var10000 = 117;
               break;
            case 23:
               var10000 = 38;
               break;
            case 24:
               var10000 = 168;
               break;
            case 25:
               var10000 = 10;
               break;
            case 26:
               var10000 = 195;
               break;
            case 27:
               var10000 = 159;
               break;
            case 28:
               var10000 = 157;
               break;
            case 29:
               var10000 = 126;
               break;
            case 30:
               var10000 = 113;
               break;
            case 31:
               var10000 = 77;
               break;
            case 32:
               var10000 = 213;
               break;
            case 33:
               var10000 = 162;
               break;
            case 34:
               var10000 = 102;
               break;
            case 35:
               var10000 = 226;
               break;
            case 36:
               var10000 = 55;
               break;
            case 37:
               var10000 = 125;
               break;
            case 38:
               var10000 = 68;
               break;
            case 39:
               var10000 = 119;
               break;
            case 40:
               var10000 = 75;
               break;
            case 41:
               var10000 = 143;
               break;
            case 42:
               var10000 = 252;
               break;
            case 43:
               var10000 = 188;
               break;
            case 44:
               var10000 = 234;
               break;
            case 45:
               var10000 = 40;
               break;
            case 46:
               var10000 = 200;
               break;
            case 47:
               var10000 = 225;
               break;
            case 48:
               var10000 = 93;
               break;
            case 49:
               var10000 = 2;
               break;
            case 50:
               var10000 = 121;
               break;
            case 51:
               var10000 = 54;
               break;
            case 52:
               var10000 = 138;
               break;
            case 53:
               var10000 = 199;
               break;
            case 54:
               var10000 = 124;
               break;
            case 55:
               var10000 = 242;
               break;
            case 56:
               var10000 = 63;
               break;
            case 57:
               var10000 = 164;
               break;
            case 58:
               var10000 = 89;
               break;
            case 59:
               var10000 = 58;
               break;
            case 60:
               var10000 = 206;
               break;
            case 61:
               var10000 = 231;
               break;
            case 62:
               var10000 = 232;
               break;
            case 63:
               var10000 = 82;
               break;
            case 64:
               var10000 = 229;
               break;
            case 65:
               var10000 = 170;
               break;
            case 66:
               var10000 = 45;
               break;
            case 67:
               var10000 = 49;
               break;
            case 68:
               var10000 = 133;
               break;
            case 69:
               var10000 = 46;
               break;
            case 70:
               var10000 = 41;
               break;
            case 71:
               var10000 = 217;
               break;
            case 72:
               var10000 = 230;
               break;
            case 73:
               var10000 = 197;
               break;
            case 74:
               var10000 = 169;
               break;
            case 75:
               var10000 = 101;
               break;
            case 76:
               var10000 = 148;
               break;
            case 77:
               var10000 = 247;
               break;
            case 78:
               var10000 = 204;
               break;
            case 79:
               var10000 = 132;
               break;
            case 80:
               var10000 = 209;
               break;
            case 81:
               var10000 = 22;
               break;
            case 82:
               var10000 = 167;
               break;
            case 83:
               var10000 = 112;
               break;
            case 84:
               var10000 = 25;
               break;
            case 85:
               var10000 = 155;
               break;
            case 86:
               var10000 = 34;
               break;
            case 87:
               var10000 = 250;
               break;
            case 88:
               var10000 = 39;
               break;
            case 89:
               var10000 = 90;
               break;
            case 90:
               var10000 = 218;
               break;
            case 91:
               var10000 = 184;
               break;
            case 92:
               var10000 = 249;
               break;
            case 93:
               var10000 = 151;
               break;
            case 94:
               var10000 = 224;
               break;
            case 95:
               var10000 = 0;
               break;
            case 96:
               var10000 = 74;
               break;
            case 97:
               var10000 = 223;
               break;
            case 98:
               var10000 = 98;
               break;
            case 99:
               var10000 = 116;
               break;
            case 100:
               var10000 = 24;
               break;
            case 101:
               var10000 = 194;
               break;
            case 102:
               var10000 = 141;
               break;
            case 103:
               var10000 = 149;
               break;
            case 104:
               var10000 = 123;
               break;
            case 105:
               var10000 = 110;
               break;
            case 106:
               var10000 = 244;
               break;
            case 107:
               var10000 = 205;
               break;
            case 108:
               var10000 = 154;
               break;
            case 109:
               var10000 = 237;
               break;
            case 110:
               var10000 = 83;
               break;
            case 111:
               var10000 = 198;
               break;
            case 112:
               var10000 = 131;
               break;
            case 113:
               var10000 = 120;
               break;
            case 114:
               var10000 = 70;
               break;
            case 115:
               var10000 = 109;
               break;
            case 116:
               var10000 = 60;
               break;
            case 117:
               var10000 = 6;
               break;
            case 118:
               var10000 = 144;
               break;
            case 119:
               var10000 = 76;
               break;
            case 120:
               var10000 = 211;
               break;
            case 121:
               var10000 = 85;
               break;
            case 122:
               var10000 = 111;
               break;
            case 123:
               var10000 = 67;
               break;
            case 124:
               var10000 = 239;
               break;
            case 125:
               var10000 = 66;
               break;
            case 126:
               var10000 = 193;
               break;
            case 127:
               var10000 = 37;
               break;
            case 128:
               var10000 = 253;
               break;
            case 129:
               var10000 = 245;
               break;
            case 130:
               var10000 = 182;
               break;
            case 131:
               var10000 = 88;
               break;
            case 132:
               var10000 = 32;
               break;
            case 133:
               var10000 = 99;
               break;
            case 134:
               var10000 = 65;
               break;
            case 135:
               var10000 = 185;
               break;
            case 136:
               var10000 = 72;
               break;
            case 137:
               var10000 = 36;
               break;
            case 138:
               var10000 = 147;
               break;
            case 139:
               var10000 = 11;
               break;
            case 140:
               var10000 = 246;
               break;
            case 141:
               var10000 = 42;
               break;
            case 142:
               var10000 = 8;
               break;
            case 143:
               var10000 = 187;
               break;
            case 144:
               var10000 = 69;
               break;
            case 145:
               var10000 = 96;
               break;
            case 146:
               var10000 = 156;
               break;
            case 147:
               var10000 = 59;
               break;
            case 148:
               var10000 = 227;
               break;
            case 149:
               var10000 = 228;
               break;
            case 150:
               var10000 = 94;
               break;
            case 151:
               var10000 = 216;
               break;
            case 152:
               var10000 = 84;
               break;
            case 153:
               var10000 = 29;
               break;
            case 154:
               var10000 = 100;
               break;
            case 155:
               var10000 = 139;
               break;
            case 156:
               var10000 = 15;
               break;
            case 157:
               var10000 = 106;
               break;
            case 158:
               var10000 = 163;
               break;
            case 159:
               var10000 = 173;
               break;
            case 160:
               var10000 = 207;
               break;
            case 161:
               var10000 = 3;
               break;
            case 162:
               var10000 = 176;
               break;
            case 163:
               var10000 = 51;
               break;
            case 164:
               var10000 = 202;
               break;
            case 165:
               var10000 = 174;
               break;
            case 166:
               var10000 = 91;
               break;
            case 167:
               var10000 = 145;
               break;
            case 168:
               var10000 = 158;
               break;
            case 169:
               var10000 = 241;
               break;
            case 170:
               var10000 = 5;
               break;
            case 171:
               var10000 = 80;
               break;
            case 172:
               var10000 = 97;
               break;
            case 173:
               var10000 = 95;
               break;
            case 174:
               var10000 = 240;
               break;
            case 175:
               var10000 = 57;
               break;
            case 176:
               var10000 = 52;
               break;
            case 177:
               var10000 = 20;
               break;
            case 178:
               var10000 = 103;
               break;
            case 179:
               var10000 = 1;
               break;
            case 180:
               var10000 = 254;
               break;
            case 181:
               var10000 = 13;
               break;
            case 182:
               var10000 = 189;
               break;
            case 183:
               var10000 = 165;
               break;
            case 184:
               var10000 = 44;
               break;
            case 185:
               var10000 = 178;
               break;
            case 186:
               var10000 = 142;
               break;
            case 187:
               var10000 = 130;
               break;
            case 188:
               var10000 = 4;
               break;
            case 189:
               var10000 = 248;
               break;
            case 190:
               var10000 = 192;
               break;
            case 191:
               var10000 = 235;
               break;
            case 192:
               var10000 = 18;
               break;
            case 193:
               var10000 = 233;
               break;
            case 194:
               var10000 = 136;
               break;
            case 195:
               var10000 = 181;
               break;
            case 196:
               var10000 = 127;
               break;
            case 197:
               var10000 = 92;
               break;
            case 198:
               var10000 = 17;
               break;
            case 199:
               var10000 = 115;
               break;
            case 200:
               var10000 = 152;
               break;
            case 201:
               var10000 = 47;
               break;
            case 202:
               var10000 = 12;
               break;
            case 203:
               var10000 = 105;
               break;
            case 204:
               var10000 = 86;
               break;
            case 205:
               var10000 = 243;
               break;
            case 206:
               var10000 = 219;
               break;
            case 207:
               var10000 = 21;
               break;
            case 208:
               var10000 = 215;
               break;
            case 209:
               var10000 = 43;
               break;
            case 210:
               var10000 = 50;
               break;
            case 211:
               var10000 = 135;
               break;
            case 212:
               var10000 = 108;
               break;
            case 213:
               var10000 = 71;
               break;
            case 214:
               var10000 = 62;
               break;
            case 215:
               var10000 = 16;
               break;
            case 216:
               var10000 = 31;
               break;
            case 217:
               var10000 = 238;
               break;
            case 218:
               var10000 = 56;
               break;
            case 219:
               var10000 = 137;
               break;
            case 220:
               var10000 = 28;
               break;
            case 221:
               var10000 = 160;
               break;
            case 222:
               var10000 = 78;
               break;
            case 223:
               var10000 = 222;
               break;
            case 224:
               var10000 = 212;
               break;
            case 225:
               var10000 = 180;
               break;
            case 226:
               var10000 = 236;
               break;
            case 227:
               var10000 = 166;
               break;
            case 228:
               var10000 = 27;
               break;
            case 229:
               var10000 = 19;
               break;
            case 230:
               var10000 = 140;
               break;
            case 231:
               var10000 = 64;
               break;
            case 232:
               var10000 = 172;
               break;
            case 233:
               var10000 = 14;
               break;
            case 234:
               var10000 = 179;
               break;
            case 235:
               var10000 = 134;
               break;
            case 236:
               var10000 = 128;
               break;
            case 237:
               var10000 = 153;
               break;
            case 238:
               var10000 = 210;
               break;
            case 239:
               var10000 = 104;
               break;
            case 240:
               var10000 = 171;
               break;
            case 241:
               var10000 = 186;
               break;
            case 242:
               var10000 = 203;
               break;
            case 243:
               var10000 = 9;
               break;
            case 244:
               var10000 = 221;
               break;
            case 245:
               var10000 = 73;
               break;
            case 246:
               var10000 = 81;
               break;
            case 247:
               var10000 = 7;
               break;
            case 248:
               var10000 = 129;
               break;
            case 249:
               var10000 = 26;
               break;
            case 250:
               var10000 = 190;
               break;
            case 251:
               var10000 = 114;
               break;
            case 252:
               var10000 = 196;
               break;
            case 253:
               var10000 = 122;
               break;
            case 254:
               var10000 = 118;
               break;
            default:
               var10000 = 107;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7887;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "i£\u0090ÕcØs)]\u000e#\u0002Y<\bÉÑ\u0091f\u000f\u009b,®\u001b\u0095\u0098JãMµÊ\u009dPÍ+Q\u001d\u0018PVãë©VÂ#\tÐ±\u009bÁ\u0002 t\u000bãÏ\u0084\t\u0094\u008där\u0006g\u000e";
      int var12 = "i£\u0090ÕcØs)]\u000e#\u0002Y<\bÉÑ\u0091f\u000f\u009b,®\u001b\u0095\u0098JãMµÊ\u009dPÍ+Q\u001d\u0018PVãë©VÂ#\tÐ±\u009bÁ\u0002 t\u000bãÏ\u0084\t\u0094\u008där\u0006g\u000e"
         .length();
      char var9 = 11;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 61;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var65 = 96;
                        break;
                     case 1:
                        var65 = 107;
                        break;
                     case 2:
                        var65 = 91;
                        break;
                     case 3:
                        var65 = 67;
                        break;
                     case 4:
                        var65 = 14;
                        break;
                     case 5:
                        var65 = 97;
                        break;
                     default:
                        var65 = 47;
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
                     b = new String[8];
                     long var0 = 6216293777466471678L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "|\u000f¾ôlao\u000bsè\u0018êc¢öè\u0087è\"&\u007fQX \u0011\u009b\u0098Y\"å(}Z\u0080>\u0001\u001f\u0084ÖKê0-\u009f\u000e\r\u000e\u009bðòLQTê\u0012$âLc\u0087._\u0017\u0013";
                     int var5 = "|\u000f¾ôlao\u000bsè\u0018êc¢öè\u0087è\"&\u007fQX \u0011\u009b\u0098Y\"å(}Z\u0080>\u0001\u001f\u0084ÖKê0-\u009f\u000e\r\u000e\u009bðòLQTê\u0012$âLc\u0087._\u0017\u0013"
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
                                    c = var6;
                                    d = new Integer[10];
                                    Y = a(29379, 5665530054152383502L);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u0000×FI\t\u0097»\u0017\u008awÝé[HH'";
                                 var5 = "\u0000×FI\t\u0097»\u0017\u008awÝé[HH'".length();
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

                  var10 = "\u007f\u0006¼³\u000b;½Pè\u0090\u0019ÅÉ\r©ßã\u0001rî\u0003WÅ~H\u0082\u008c";
                  var12 = "\u007f\u0006¼³\u000b;½Pè\u0090\u0019ÅÉ\r©ßã\u0001rî\u0003WÅ~H\u0082\u008c".length();
                  var9 = '\r';
                  var17 = -1;
            }

            var10000 = 127;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





