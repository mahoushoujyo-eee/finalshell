package com.finalshell.core;

import java.lang.reflect.Type;

public abstract class Zq2 extends ZS implements X4 {
   public static String[] a;
   public static String[] b;
   public static long[] e;
   public static Integer[] h;
   public static long l;

   @Override
   public Object z(Yn4 var1, Type var2, Object var3) {
      return this.p(var1, var2, var3, null, 0);
   }

   @Override
   public Object p(Yn4 param1, Type param2, Object param3, String param4, int param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/ZS.p ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 1
      // 004: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 007: astore 7
      // 009: astore 6
      // 00b: aload 7
      // 00d: invokeinterface com/finalshell/core/P7.P ()I 1
      // 012: bipush 2
      // 013: aload 6
      // 015: ifnonnull 06f
      // 018: if_icmpne 060
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 021: athrow
      // 022: aload 7
      // 024: invokeinterface com/finalshell/core/P7.f ()J 1
      // 029: lstore 9
      // 02b: sipush 24920
      // 02e: aload 7
      // 030: sipush 19438
      // 033: ldc2_w 9208909201061018005
      // 036: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 039: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 03e: sipush -31372
      // 041: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 044: aload 4
      // 046: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 049: ifeq 054
      // 04c: lload 9
      // 04e: getstatic com/finalshell/core/Zq2.l J
      // 051: lmul
      // 052: lstore 9
      // 054: lload 9
      // 056: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 059: astore 8
      // 05b: aload 6
      // 05d: ifnull 56c
      // 060: aload 7
      // 062: invokeinterface com/finalshell/core/P7.P ()I 1
      // 067: bipush 4
      // 068: goto 06f
      // 06b: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06e: athrow
      // 06f: aload 6
      // 071: ifnonnull 31c
      // 074: if_icmpne 305
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07d: athrow
      // 07e: aload 7
      // 080: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 085: astore 9
      // 087: aload 4
      // 089: aload 6
      // 08b: ifnonnull 0a1
      // 08e: ifnull 2a9
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 097: athrow
      // 098: sipush 24914
      // 09b: sipush 16628
      // 09e: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 0a1: aload 4
      // 0a3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a6: aload 6
      // 0a8: ifnonnull 0c0
      // 0ab: ifeq 105
      // 0ae: goto 0b5
      // 0b1: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b4: athrow
      // 0b5: aload 2
      // 0b6: instanceof java/lang/Class
      // 0b9: goto 0c0
      // 0bc: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bf: athrow
      // 0c0: aload 6
      // 0c2: ifnonnull 0f5
      // 0c5: ifeq 105
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: checkcast java/lang/Class
      // 0d3: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0d6: aload 6
      // 0d8: ifnonnull 104
      // 0db: goto 0e2
      // 0de: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e1: athrow
      // 0e2: sipush 24913
      // 0e5: sipush -19379
      // 0e8: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 0eb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ee: goto 0f5
      // 0f1: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f4: athrow
      // 0f5: ifeq 105
      // 0f8: aload 9
      // 0fa: invokestatic com/finalshell/core/B8_2.q (Ljava/lang/Object;)Ljava/lang/Object;
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 103: athrow
      // 104: areturn
      // 105: aconst_null
      // 106: astore 10
      // 108: new java/text/SimpleDateFormat
      // 10b: dup
      // 10c: aload 4
      // 10e: aload 1
      // 10f: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 112: invokeinterface com/finalshell/core/P7.w$Locale ()Ljava/util/Locale; 1
      // 117: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;Ljava/util/Locale;)V
      // 11a: astore 10
      // 11c: goto 16c
      // 11f: astore 11
      // 121: aload 4
      // 123: ldc "T"
      // 125: aload 6
      // 127: ifnonnull 142
      // 12a: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 12d: ifeq 16c
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 136: athrow
      // 137: aload 4
      // 139: ldc "T"
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 141: athrow
      // 142: sipush 24919
      // 145: sipush 14393
      // 148: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 14b: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 14e: astore 12
      // 150: new java/text/SimpleDateFormat
      // 153: dup
      // 154: aload 12
      // 156: aload 1
      // 157: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 15a: invokeinterface com/finalshell/core/P7.w$Locale ()Ljava/util/Locale; 1
      // 15f: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;Ljava/util/Locale;)V
      // 162: astore 10
      // 164: goto 16c
      // 167: astore 13
      // 169: aload 11
      // 16b: athrow
      // 16c: getstatic com/finalshell/core/Ok2.X Ljava/util/TimeZone;
      // 16f: ifnull 187
      // 172: aload 10
      // 174: aload 1
      // 175: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 178: invokeinterface com/finalshell/core/P7.t ()Ljava/util/TimeZone; 1
      // 17d: invokevirtual java/text/SimpleDateFormat.setTimeZone (Ljava/util/TimeZone;)V
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 186: athrow
      // 187: aload 10
      // 189: aload 9
      // 18b: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 18e: astore 8
      // 190: goto 198
      // 193: astore 11
      // 195: aconst_null
      // 196: astore 8
      // 198: aload 8
      // 19a: aload 6
      // 19c: ifnonnull 231
      // 19f: ifnonnull 22f
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a8: athrow
      // 1a9: getstatic com/finalshell/core/Ok2.Y Ljava/util/Locale;
      // 1ac: getstatic java/util/Locale.CHINA Ljava/util/Locale;
      // 1af: if_acmpne 22f
      // 1b2: goto 1b9
      // 1b5: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b8: athrow
      // 1b9: new java/text/SimpleDateFormat
      // 1bc: dup
      // 1bd: aload 4
      // 1bf: getstatic java/util/Locale.US Ljava/util/Locale;
      // 1c2: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;Ljava/util/Locale;)V
      // 1c5: astore 10
      // 1c7: goto 210
      // 1ca: astore 11
      // 1cc: aload 6
      // 1ce: ifnonnull 227
      // 1d1: aload 4
      // 1d3: ldc "T"
      // 1d5: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1d8: ifeq 210
      // 1db: goto 1e2
      // 1de: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e1: athrow
      // 1e2: aload 4
      // 1e4: ldc "T"
      // 1e6: sipush 24916
      // 1e9: sipush 20376
      // 1ec: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 1ef: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 1f2: astore 12
      // 1f4: new java/text/SimpleDateFormat
      // 1f7: dup
      // 1f8: aload 12
      // 1fa: aload 1
      // 1fb: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 1fe: invokeinterface com/finalshell/core/P7.w$Locale ()Ljava/util/Locale; 1
      // 203: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;Ljava/util/Locale;)V
      // 206: astore 10
      // 208: goto 210
      // 20b: astore 13
      // 20d: aload 11
      // 20f: athrow
      // 210: aload 10
      // 212: aload 1
      // 213: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 216: invokeinterface com/finalshell/core/P7.t ()Ljava/util/TimeZone; 1
      // 21b: invokevirtual java/text/SimpleDateFormat.setTimeZone (Ljava/util/TimeZone;)V
      // 21e: aload 10
      // 220: aload 9
      // 222: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 225: astore 8
      // 227: goto 22f
      // 22a: astore 11
      // 22c: aconst_null
      // 22d: astore 8
      // 22f: aload 8
      // 231: ifnonnull 2a4
      // 234: aload 4
      // 236: sipush 24917
      // 239: sipush 12374
      // 23c: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 23f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 242: aload 6
      // 244: ifnonnull 264
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24d: athrow
      // 24e: ifeq 2a1
      // 251: goto 258
      // 254: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 257: athrow
      // 258: aload 9
      // 25a: invokevirtual java/lang/String.length ()I
      // 25d: goto 264
      // 260: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 263: athrow
      // 264: sipush 21021
      // 267: ldc2_w 3016152918139854949
      // 26a: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 26d: if_icmpne 2a1
      // 270: new java/text/SimpleDateFormat
      // 273: dup
      // 274: sipush 24921
      // 277: sipush -16790
      // 27a: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 27d: getstatic com/finalshell/core/Ok2.Y Ljava/util/Locale;
      // 280: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;Ljava/util/Locale;)V
      // 283: astore 11
      // 285: aload 11
      // 287: getstatic com/finalshell/core/Ok2.X Ljava/util/TimeZone;
      // 28a: invokevirtual java/text/SimpleDateFormat.setTimeZone (Ljava/util/TimeZone;)V
      // 28d: aload 11
      // 28f: aload 9
      // 291: invokevirtual java/text/SimpleDateFormat.parse (Ljava/lang/String;)Ljava/util/Date;
      // 294: astore 8
      // 296: goto 2a4
      // 299: astore 11
      // 29b: aconst_null
      // 29c: astore 8
      // 29e: goto 2a4
      // 2a1: aconst_null
      // 2a2: astore 8
      // 2a4: aload 6
      // 2a6: ifnull 2ac
      // 2a9: aconst_null
      // 2aa: astore 8
      // 2ac: aload 8
      // 2ae: ifnonnull 300
      // 2b1: aload 9
      // 2b3: astore 8
      // 2b5: aload 7
      // 2b7: sipush 16328
      // 2ba: ldc2_w 3006813536678317502
      // 2bd: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 2c0: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 2c5: aload 7
      // 2c7: getstatic com/finalshell/ui/model/Ks2_2.AllowISO8601DateFormat Lcom/finalshell/ui/model/Ks2_2;
      // 2ca: invokeinterface com/finalshell/core/P7.w (Lcom/finalshell/ui/model/Ks2_2;)Z 2
      // 2cf: ifeq 300
      // 2d2: new com/finalshell/core/Uy2_2
      // 2d5: dup
      // 2d6: aload 9
      // 2d8: invokespecial com/finalshell/core/Uy2_2.<init> (Ljava/lang/String;)V
      // 2db: astore 10
      // 2dd: aload 10
      // 2df: aload 6
      // 2e1: ifnonnull 2fd
      // 2e4: invokevirtual com/finalshell/core/Uy2_2.z$boolean ()Z
      // 2e7: ifeq 2fb
      // 2ea: goto 2f1
      // 2ed: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f0: athrow
      // 2f1: aload 10
      // 2f3: invokevirtual com/finalshell/core/Uy2_2.c ()Ljava/util/Calendar;
      // 2f6: invokevirtual java/util/Calendar.getTime ()Ljava/util/Date;
      // 2f9: astore 8
      // 2fb: aload 10
      // 2fd: invokevirtual com/finalshell/core/Uy2_2.close ()V
      // 300: aload 6
      // 302: ifnull 56c
      // 305: aload 7
      // 307: invokeinterface com/finalshell/core/P7.P ()I 1
      // 30c: sipush 21748
      // 30f: ldc2_w 1063275156452206222
      // 312: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 315: goto 31c
      // 318: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31b: athrow
      // 31c: aload 6
      // 31e: ifnonnull 351
      // 321: if_icmpne 33a
      // 324: goto 32b
      // 327: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32a: athrow
      // 32b: aload 7
      // 32d: invokeinterface com/finalshell/core/P7.K ()V 1
      // 332: aconst_null
      // 333: astore 8
      // 335: aload 6
      // 337: ifnull 56c
      // 33a: aload 7
      // 33c: invokeinterface com/finalshell/core/P7.P ()I 1
      // 341: sipush 28513
      // 344: ldc2_w 1506461024879893784
      // 347: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 34a: goto 351
      // 34d: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 350: athrow
      // 351: aload 6
      // 353: ifnonnull 4b4
      // 356: if_icmpne 49c
      // 359: goto 360
      // 35c: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35f: athrow
      // 360: aload 7
      // 362: invokeinterface com/finalshell/core/P7.K ()V 1
      // 367: aload 7
      // 369: aload 6
      // 36b: ifnonnull 38e
      // 36e: goto 375
      // 371: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 374: athrow
      // 375: invokeinterface com/finalshell/core/P7.P ()I 1
      // 37a: bipush 4
      // 37b: if_icmpne 40f
      // 37e: goto 385
      // 381: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 384: athrow
      // 385: aload 7
      // 387: goto 38e
      // 38a: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38d: athrow
      // 38e: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 393: astore 9
      // 395: aload 6
      // 397: ifnonnull 40a
      // 39a: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 39d: aload 9
      // 39f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3a2: ifeq 402
      // 3a5: goto 3ac
      // 3a8: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ab: athrow
      // 3ac: aload 7
      // 3ae: invokeinterface com/finalshell/core/P7.K ()V 1
      // 3b3: aload 1
      // 3b4: sipush 26490
      // 3b7: ldc2_w 8317818934278509828
      // 3ba: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 3bd: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 3c0: aload 7
      // 3c2: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 3c7: astore 10
      // 3c9: aload 1
      // 3ca: invokevirtual com/finalshell/core/Yn4.L ()Lcom/finalshell/core/IG;
      // 3cd: aload 10
      // 3cf: aconst_null
      // 3d0: aload 7
      // 3d2: invokeinterface com/finalshell/core/P7.A$int ()I 1
      // 3d7: invokevirtual com/finalshell/core/IG.P (Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;
      // 3da: astore 11
      // 3dc: aload 6
      // 3de: ifnonnull 3f5
      // 3e1: aload 11
      // 3e3: ifnull 3f0
      // 3e6: goto 3ed
      // 3e9: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ec: athrow
      // 3ed: aload 11
      // 3ef: astore 2
      // 3f0: aload 1
      // 3f1: bipush 4
      // 3f2: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 3f5: aload 1
      // 3f6: sipush 16328
      // 3f9: ldc2_w 3006813536678317502
      // 3fc: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 3ff: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 402: aload 7
      // 404: bipush 2
      // 405: invokeinterface com/finalshell/core/P7.e (I)V 2
      // 40a: aload 6
      // 40c: ifnull 424
      // 40f: new com/finalshell/core/Hi2
      // 412: dup
      // 413: sipush 24915
      // 416: sipush 2183
      // 419: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 41c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 41f: athrow
      // 420: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 423: athrow
      // 424: aload 7
      // 426: aload 6
      // 428: ifnonnull 444
      // 42b: invokeinterface com/finalshell/core/P7.P ()I 1
      // 430: bipush 2
      // 431: if_icmpne 457
      // 434: goto 43b
      // 437: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43a: athrow
      // 43b: aload 7
      // 43d: goto 444
      // 440: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 443: athrow
      // 444: invokeinterface com/finalshell/core/P7.f ()J 1
      // 449: lstore 10
      // 44b: aload 7
      // 44d: invokeinterface com/finalshell/core/P7.K ()V 1
      // 452: aload 6
      // 454: ifnull 483
      // 457: new com/finalshell/core/Hi2
      // 45a: dup
      // 45b: new java/lang/StringBuilder
      // 45e: dup
      // 45f: invokespecial java/lang/StringBuilder.<init> ()V
      // 462: sipush 24923
      // 465: sipush -1990
      // 468: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 46b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46e: aload 7
      // 470: invokeinterface com/finalshell/core/P7.B ()Ljava/lang/String; 1
      // 475: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 478: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 47b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 47e: athrow
      // 47f: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 482: athrow
      // 483: lload 10
      // 485: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 488: astore 8
      // 48a: aload 1
      // 48b: sipush 25434
      // 48e: ldc2_w 4058859349216022823
      // 491: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 494: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 497: aload 6
      // 499: ifnull 56c
      // 49c: aload 1
      // 49d: aload 6
      // 49f: ifnonnull 56a
      // 4a2: goto 4a9
      // 4a5: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a8: athrow
      // 4a9: invokevirtual com/finalshell/core/Yn4.O ()I
      // 4ac: bipush 2
      // 4ad: goto 4b4
      // 4b0: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b3: athrow
      // 4b4: if_icmpne 55f
      // 4b7: aload 1
      // 4b8: bipush 0
      // 4b9: invokevirtual com/finalshell/core/Yn4.l (I)V
      // 4bc: aload 1
      // 4bd: sipush 16328
      // 4c0: ldc2_w 3006813536678317502
      // 4c3: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 4c6: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 4c9: aload 7
      // 4cb: invokeinterface com/finalshell/core/P7.P ()I 1
      // 4d0: aload 6
      // 4d2: ifnonnull 501
      // 4d5: goto 4dc
      // 4d8: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4db: athrow
      // 4dc: bipush 4
      // 4dd: if_icmpne 525
      // 4e0: goto 4e7
      // 4e3: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e6: athrow
      // 4e7: sipush 24912
      // 4ea: sipush 20969
      // 4ed: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 4f0: aload 7
      // 4f2: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 4f7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4fa: goto 501
      // 4fd: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 500: athrow
      // 501: ifne 519
      // 504: new com/finalshell/core/Hi2
      // 507: dup
      // 508: sipush 24918
      // 50b: sipush -8317
      // 50e: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 511: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 514: athrow
      // 515: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 518: athrow
      // 519: aload 7
      // 51b: invokeinterface com/finalshell/core/P7.K ()V 1
      // 520: aload 6
      // 522: ifnull 53a
      // 525: new com/finalshell/core/Hi2
      // 528: dup
      // 529: sipush 24918
      // 52c: sipush -8317
      // 52f: invokestatic com/finalshell/core/Zq2.a (II)Ljava/lang/String;
      // 532: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 535: athrow
      // 536: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 539: athrow
      // 53a: aload 1
      // 53b: sipush 32319
      // 53e: ldc2_w 7152635919829945408
      // 541: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 544: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 547: aload 1
      // 548: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 54b: astore 8
      // 54d: aload 1
      // 54e: sipush 29397
      // 551: ldc2_w 1860593260813074601
      // 554: invokestatic com/finalshell/core/Zq2.a (IJ)I
      // 557: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 55a: aload 6
      // 55c: ifnull 56c
      // 55f: aload 1
      // 560: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 563: goto 56a
      // 566: invokestatic com/finalshell/core/Zq2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 569: athrow
      // 56a: astore 8
      // 56c: aload 0
      // 56d: aload 1
      // 56e: aload 2
      // 56f: aload 3
      // 570: aload 8
      // 572: invokevirtual com/finalshell/core/Zq2.m (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 575: areturn
   }

   protected abstract Object m(Yn4 var1, Type var2, Object var3, Object var4);

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 24913) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 68;
               break;
            case 1:
               var10000 = 90;
               break;
            case 2:
               var10000 = 207;
               break;
            case 3:
               var10000 = 44;
               break;
            case 4:
               var10000 = 155;
               break;
            case 5:
               var10000 = 224;
               break;
            case 6:
               var10000 = 43;
               break;
            case 7:
               var10000 = 156;
               break;
            case 8:
               var10000 = 58;
               break;
            case 9:
               var10000 = 133;
               break;
            case 10:
               var10000 = 122;
               break;
            case 11:
               var10000 = 169;
               break;
            case 12:
               var10000 = 150;
               break;
            case 13:
               var10000 = 251;
               break;
            case 14:
               var10000 = 119;
               break;
            case 15:
               var10000 = 6;
               break;
            case 16:
               var10000 = 154;
               break;
            case 17:
               var10000 = 3;
               break;
            case 18:
               var10000 = 34;
               break;
            case 19:
               var10000 = 216;
               break;
            case 20:
               var10000 = 129;
               break;
            case 21:
               var10000 = 123;
               break;
            case 22:
               var10000 = 128;
               break;
            case 23:
               var10000 = 89;
               break;
            case 24:
               var10000 = 85;
               break;
            case 25:
               var10000 = 144;
               break;
            case 26:
               var10000 = 64;
               break;
            case 27:
               var10000 = 209;
               break;
            case 28:
               var10000 = 11;
               break;
            case 29:
               var10000 = 37;
               break;
            case 30:
               var10000 = 26;
               break;
            case 31:
               var10000 = 130;
               break;
            case 32:
               var10000 = 234;
               break;
            case 33:
               var10000 = 82;
               break;
            case 34:
               var10000 = 236;
               break;
            case 35:
               var10000 = 60;
               break;
            case 36:
               var10000 = 1;
               break;
            case 37:
               var10000 = 40;
               break;
            case 38:
               var10000 = 24;
               break;
            case 39:
               var10000 = 175;
               break;
            case 40:
               var10000 = 182;
               break;
            case 41:
               var10000 = 244;
               break;
            case 42:
               var10000 = 245;
               break;
            case 43:
               var10000 = 5;
               break;
            case 44:
               var10000 = 203;
               break;
            case 45:
               var10000 = 57;
               break;
            case 46:
               var10000 = 200;
               break;
            case 47:
               var10000 = 194;
               break;
            case 48:
               var10000 = 51;
               break;
            case 49:
               var10000 = 19;
               break;
            case 50:
               var10000 = 181;
               break;
            case 51:
               var10000 = 124;
               break;
            case 52:
               var10000 = 117;
               break;
            case 53:
               var10000 = 67;
               break;
            case 54:
               var10000 = 30;
               break;
            case 55:
               var10000 = 212;
               break;
            case 56:
               var10000 = 80;
               break;
            case 57:
               var10000 = 23;
               break;
            case 58:
               var10000 = 96;
               break;
            case 59:
               var10000 = 230;
               break;
            case 60:
               var10000 = 75;
               break;
            case 61:
               var10000 = 27;
               break;
            case 62:
               var10000 = 42;
               break;
            case 63:
               var10000 = 92;
               break;
            case 64:
               var10000 = 176;
               break;
            case 65:
               var10000 = 104;
               break;
            case 66:
               var10000 = 62;
               break;
            case 67:
               var10000 = 240;
               break;
            case 68:
               var10000 = 36;
               break;
            case 69:
               var10000 = 217;
               break;
            case 70:
               var10000 = 22;
               break;
            case 71:
               var10000 = 127;
               break;
            case 72:
               var10000 = 41;
               break;
            case 73:
               var10000 = 59;
               break;
            case 74:
               var10000 = 165;
               break;
            case 75:
               var10000 = 222;
               break;
            case 76:
               var10000 = 158;
               break;
            case 77:
               var10000 = 81;
               break;
            case 78:
               var10000 = 138;
               break;
            case 79:
               var10000 = 98;
               break;
            case 80:
               var10000 = 249;
               break;
            case 81:
               var10000 = 237;
               break;
            case 82:
               var10000 = 171;
               break;
            case 83:
               var10000 = 105;
               break;
            case 84:
               var10000 = 160;
               break;
            case 85:
               var10000 = 109;
               break;
            case 86:
               var10000 = 76;
               break;
            case 87:
               var10000 = 103;
               break;
            case 88:
               var10000 = 248;
               break;
            case 89:
               var10000 = 202;
               break;
            case 90:
               var10000 = 53;
               break;
            case 91:
               var10000 = 178;
               break;
            case 92:
               var10000 = 191;
               break;
            case 93:
               var10000 = 121;
               break;
            case 94:
               var10000 = 205;
               break;
            case 95:
               var10000 = 252;
               break;
            case 96:
               var10000 = 226;
               break;
            case 97:
               var10000 = 69;
               break;
            case 98:
               var10000 = 79;
               break;
            case 99:
               var10000 = 147;
               break;
            case 100:
               var10000 = 195;
               break;
            case 101:
               var10000 = 132;
               break;
            case 102:
               var10000 = 228;
               break;
            case 103:
               var10000 = 225;
               break;
            case 104:
               var10000 = 146;
               break;
            case 105:
               var10000 = 18;
               break;
            case 106:
               var10000 = 49;
               break;
            case 107:
               var10000 = 48;
               break;
            case 108:
               var10000 = 72;
               break;
            case 109:
               var10000 = 15;
               break;
            case 110:
               var10000 = 45;
               break;
            case 111:
               var10000 = 151;
               break;
            case 112:
               var10000 = 238;
               break;
            case 113:
               var10000 = 242;
               break;
            case 114:
               var10000 = 78;
               break;
            case 115:
               var10000 = 13;
               break;
            case 116:
               var10000 = 198;
               break;
            case 117:
               var10000 = 73;
               break;
            case 118:
               var10000 = 210;
               break;
            case 119:
               var10000 = 102;
               break;
            case 120:
               var10000 = 95;
               break;
            case 121:
               var10000 = 177;
               break;
            case 122:
               var10000 = 163;
               break;
            case 123:
               var10000 = 50;
               break;
            case 124:
               var10000 = 214;
               break;
            case 125:
               var10000 = 193;
               break;
            case 126:
               var10000 = 206;
               break;
            case 127:
               var10000 = 115;
               break;
            case 128:
               var10000 = 25;
               break;
            case 129:
               var10000 = 94;
               break;
            case 130:
               var10000 = 86;
               break;
            case 131:
               var10000 = 231;
               break;
            case 132:
               var10000 = 56;
               break;
            case 133:
               var10000 = 142;
               break;
            case 134:
               var10000 = 7;
               break;
            case 135:
               var10000 = 153;
               break;
            case 136:
               var10000 = 35;
               break;
            case 137:
               var10000 = 140;
               break;
            case 138:
               var10000 = 52;
               break;
            case 139:
               var10000 = 218;
               break;
            case 140:
               var10000 = 239;
               break;
            case 141:
               var10000 = 168;
               break;
            case 142:
               var10000 = 134;
               break;
            case 143:
               var10000 = 141;
               break;
            case 144:
               var10000 = 192;
               break;
            case 145:
               var10000 = 233;
               break;
            case 146:
               var10000 = 157;
               break;
            case 147:
               var10000 = 159;
               break;
            case 148:
               var10000 = 148;
               break;
            case 149:
               var10000 = 173;
               break;
            case 150:
               var10000 = 87;
               break;
            case 151:
               var10000 = 135;
               break;
            case 152:
               var10000 = 183;
               break;
            case 153:
               var10000 = 241;
               break;
            case 154:
               var10000 = 137;
               break;
            case 155:
               var10000 = 232;
               break;
            case 156:
               var10000 = 83;
               break;
            case 157:
               var10000 = 120;
               break;
            case 158:
               var10000 = 185;
               break;
            case 159:
               var10000 = 61;
               break;
            case 160:
               var10000 = 227;
               break;
            case 161:
               var10000 = 38;
               break;
            case 162:
               var10000 = 101;
               break;
            case 163:
               var10000 = 184;
               break;
            case 164:
               var10000 = 250;
               break;
            case 165:
               var10000 = 246;
               break;
            case 166:
               var10000 = 0;
               break;
            case 167:
               var10000 = 186;
               break;
            case 168:
               var10000 = 110;
               break;
            case 169:
               var10000 = 243;
               break;
            case 170:
               var10000 = 33;
               break;
            case 171:
               var10000 = 84;
               break;
            case 172:
               var10000 = 100;
               break;
            case 173:
               var10000 = 106;
               break;
            case 174:
               var10000 = 77;
               break;
            case 175:
               var10000 = 215;
               break;
            case 176:
               var10000 = 97;
               break;
            case 177:
               var10000 = 162;
               break;
            case 178:
               var10000 = 114;
               break;
            case 179:
               var10000 = 221;
               break;
            case 180:
               var10000 = 223;
               break;
            case 181:
               var10000 = 172;
               break;
            case 182:
               var10000 = 220;
               break;
            case 183:
               var10000 = 66;
               break;
            case 184:
               var10000 = 211;
               break;
            case 185:
               var10000 = 71;
               break;
            case 186:
               var10000 = 20;
               break;
            case 187:
               var10000 = 166;
               break;
            case 188:
               var10000 = 4;
               break;
            case 189:
               var10000 = 131;
               break;
            case 190:
               var10000 = 116;
               break;
            case 191:
               var10000 = 254;
               break;
            case 192:
               var10000 = 213;
               break;
            case 193:
               var10000 = 219;
               break;
            case 194:
               var10000 = 63;
               break;
            case 195:
               var10000 = 143;
               break;
            case 196:
               var10000 = 199;
               break;
            case 197:
               var10000 = 12;
               break;
            case 198:
               var10000 = 32;
               break;
            case 199:
               var10000 = 28;
               break;
            case 200:
               var10000 = 190;
               break;
            case 201:
               var10000 = 107;
               break;
            case 202:
               var10000 = 113;
               break;
            case 203:
               var10000 = 167;
               break;
            case 204:
               var10000 = 29;
               break;
            case 205:
               var10000 = 91;
               break;
            case 206:
               var10000 = 164;
               break;
            case 207:
               var10000 = 74;
               break;
            case 208:
               var10000 = 201;
               break;
            case 209:
               var10000 = 196;
               break;
            case 210:
               var10000 = 54;
               break;
            case 211:
               var10000 = 152;
               break;
            case 212:
               var10000 = 112;
               break;
            case 213:
               var10000 = 99;
               break;
            case 214:
               var10000 = 145;
               break;
            case 215:
               var10000 = 204;
               break;
            case 216:
               var10000 = 229;
               break;
            case 217:
               var10000 = 247;
               break;
            case 218:
               var10000 = 39;
               break;
            case 219:
               var10000 = 189;
               break;
            case 220:
               var10000 = 14;
               break;
            case 221:
               var10000 = 70;
               break;
            case 222:
               var10000 = 253;
               break;
            case 223:
               var10000 = 47;
               break;
            case 224:
               var10000 = 180;
               break;
            case 225:
               var10000 = 2;
               break;
            case 226:
               var10000 = 136;
               break;
            case 227:
               var10000 = 16;
               break;
            case 228:
               var10000 = 111;
               break;
            case 229:
               var10000 = 188;
               break;
            case 230:
               var10000 = 65;
               break;
            case 231:
               var10000 = 9;
               break;
            case 232:
               var10000 = 10;
               break;
            case 233:
               var10000 = 93;
               break;
            case 234:
               var10000 = 108;
               break;
            case 235:
               var10000 = 255;
               break;
            case 236:
               var10000 = 55;
               break;
            case 237:
               var10000 = 208;
               break;
            case 238:
               var10000 = 170;
               break;
            case 239:
               var10000 = 8;
               break;
            case 240:
               var10000 = 17;
               break;
            case 241:
               var10000 = 88;
               break;
            case 242:
               var10000 = 149;
               break;
            case 243:
               var10000 = 31;
               break;
            case 244:
               var10000 = 187;
               break;
            case 245:
               var10000 = 161;
               break;
            case 246:
               var10000 = 125;
               break;
            case 247:
               var10000 = 126;
               break;
            case 248:
               var10000 = 139;
               break;
            case 249:
               var10000 = 197;
               break;
            case 250:
               var10000 = 118;
               break;
            case 251:
               var10000 = 21;
               break;
            case 252:
               var10000 = 235;
               break;
            case 253:
               var10000 = 174;
               break;
            case 254:
               var10000 = 179;
               break;
            default:
               var10000 = 46;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12926;
      if (h[var3] == null) {
         h[var3] = (int)(e[var3] ^ var1);
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var15 = new String[11];
      int var13 = 0;
      String var12 = "°sÉs³È\u0003A\u008c\u0013\"Íýå+]|§\u0003:Â\u001d\fx¦òÇ\u0080â\u0092g\u0099ÙQi\u001d8;¦y³¬\\u\u0096Ì+%\u009107\u008b\u0092ó@Õ©+Â\u0081\u0003F\u0092M\u0011\u0019ç\u009a]MÌ*³¥kÖ\u0093z\u000e6c Î%?\u008f\u0006ë\u0013K9\u0003.C¯\u0003áúV\fè\u0011à1Â<Ú¼\u0090¢p\u0006\u0015\u0004'!úCÜB{U\rT\u0001öY|Í-\u0098C8\u0089";
      int var14 = "°sÉs³È\u0003A\u008c\u0013\"Íýå+]|§\u0003:Â\u001d\fx¦òÇ\u0080â\u0092g\u0099ÙQi\u001d8;¦y³¬\\u\u0096Ì+%\u009107\u008b\u0092ó@Õ©+Â\u0081\u0003F\u0092M\u0011\u0019ç\u009a]MÌ*³¥kÖ\u0093z\u000e6c Î%?\u008f\u0006ë\u0013K9\u0003.C¯\u0003áúV\fè\u0011à1Â<Ú¼\u0090¢p\u0006\u0015\u0004'!úCÜB{U\rT\u0001öY|Í-\u0098C8\u0089"
         .length();
      char var11 = 18;
      int var19 = -1;

      label70:
      while (true) {
         byte var10000 = 60;
         String var10001 = var12.substring(++var19, var19 + var11);
         byte var10002 = -1;

         while (true) {
      char[] var36;
            label65: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var16 = 0;
               byte var46 = var10000;
               var36 = var43;
               int var26 = var10004;
               byte var53;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               } else {
                  var46 = var10000;
                  var26 = var10004;
                  if (var10004 <= var16) {
                     break label65;
                  }

                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var68 = var59[var10006];
                  byte var69;
                  switch (var16 % 7) {
                     case 0:
                        var69 = 90;
                        break;
                     case 1:
                        var69 = 13;
                        break;
                     case 2:
                        var69 = 126;
                        break;
                     case 3:
                        var69 = 43;
                        break;
                     case 4:
                        var69 = 104;
                        break;
                     case 5:
                        var69 = 70;
                        break;
                     default:
                        var69 = 89;
                  }

                  var59[var10006] = (char)(var68 ^ var53 ^ var69);
                  var16++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var59 = var36;
                     var53 = var46;
                  } else {
                     if (var26 <= var16) {
                        break;
                     }

                     var59 = var36;
                     var53 = var46;
                     var10006 = var16;
                  }
               }
            }

            String var48 = new String(var36).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var48;
                  if ((var19 += var11) >= var14) {
                     a = var15;
                     b = new String[11];
                     long var2 = 8103399467509481853L;
                     long[] var8 = new long[9];
                     int var5 = 0;
                     String var6 = "oÓ>*\u008eNTh\u0017KÃ¬Ä×Í,[À¿\u008e³ÁÁÙñ\u000f\u0015m\nµPW\u0089Ü\u0000#Ã*çûGíÍ\u000eoïxø\u001eÃ'É\u0084\u0005á\u000b";
                     int var7 = "oÓ>*\u008eNTh\u0017KÃ¬Ä×Í,[À¿\u008e³ÁÁÙñ\u000f\u0015m\nµPW\u0089Ü\u0000#Ã*çûGíÍ\u000eoïxø\u001eÃ'É\u0084\u0005á\u000b"
                        .length();
                     byte var4 = 0;

                     label44:
                     while (true) {
                        byte var28 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var28, var4).getBytes("ISO-8859-1");
                        long[] var21 = var8;
                        int var29 = var5++;
                        long var40 = ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L;
                        byte var49 = -1;

                        while (true) {
                           long var58 = var40 ^ var2;
                           switch (var49) {
                              case 0:
                                 var21[var29] = var58;
                                 if (var4 >= var7) {
                                    e = var8;
                                    h = new Integer[9];
                                    long var0 = 4175020388279755699L;
                                    long var42 = 4175020388279754843L ^ var0;
                                    byte var31 = -1;
                                    l = var42;
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var58;
                                 if (var4 < var7) {
                                    continue label44;
                                 }

                                 var6 = "¾§&TÂ\u0011Üi\bJªÐÚr\fÓ";
                                 var7 = "¾§&TÂ\u0011Üi\bJªÐÚr\fÓ".length();
                                 var4 = 0;
                           }

                           byte var30 = var4;
                           var4 += 8;
                           var9 = var6.substring(var30, var4).getBytes("ISO-8859-1");
                           var21 = var8;
                           var29 = var5++;
                           var40 = ((long)var9[0] & 255L) << 56
                              | ((long)var9[1] & 255L) << 48
                              | ((long)var9[2] & 255L) << 40
                              | ((long)var9[3] & 255L) << 32
                              | ((long)var9[4] & 255L) << 24
                              | ((long)var9[5] & 255L) << 16
                              | ((long)var9[6] & 255L) << 8
                              | (long)var9[7] & 255L;
                           var49 = 0;
                        }
                     }
                  }

                  var11 = var12.charAt(var19);
                  break;
               default:
                  var15[var13++] = var48;
                  if ((var19 += var11) < var14) {
                     var11 = var12.charAt(var19);
                     continue label70;
                  }

                  var12 = "Ë\u0094>\u0003\u0090\u009d\u0011À\u000fLß\u000f\u0093D\u0013q\"\u009e\nÊh\u0018\u009fU";
                  var14 = "Ë\u0094>\u0003\u0090\u009d\u0011À\u000fLß\u000f\u0093D\u0013q\"\u009e\nÊh\u0018\u009fU".length();
                  var11 = '\b';
                  var19 = -1;
            }

            var10000 = 109;
            var10001 = var12.substring(++var19, var19 + var11);
            var10002 = 0;
         }
      }
   }
}





