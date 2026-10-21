package com;

import java.math.BigDecimal;

class zF extends com.z8 {
   private final long R;
   private final S6 w;
   private BigDecimal Z;
   private Float F;
   private Double P;

   public zF(String var1, boolean var2, long var3, S6 var5) {
      super(var1, var2);
      this.R = var3;
      this.w = var5;
   }

   @Override
   public boolean x(ph_4 param1, Object param2, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 003: aload 0
      // 004: aload 1
      // 005: aload 2
      // 006: aload 4
      // 008: invokevirtual com/zF.H (Lcom/ph_4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: astore 6
      // 00d: astore 5
      // 00f: aload 6
      // 011: aload 5
      // 013: ifnonnull 028
      // 016: ifnonnull 026
      // 019: goto 020
      // 01c: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 01f: athrow
      // 020: bipush 0
      // 021: ireturn
      // 022: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 025: athrow
      // 026: aload 6
      // 028: instanceof java/lang/Number
      // 02b: aload 5
      // 02d: ifnonnull 045
      // 030: ifne 040
      // 033: goto 03a
      // 036: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 039: athrow
      // 03a: bipush 0
      // 03b: ireturn
      // 03c: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 03f: athrow
      // 040: aload 6
      // 042: instanceof java/math/BigDecimal
      // 045: aload 5
      // 047: ifnonnull 180
      // 04a: ifeq 17b
      // 04d: goto 054
      // 050: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 053: athrow
      // 054: aload 0
      // 055: getfield com/zF.Z Ljava/math/BigDecimal;
      // 058: aload 5
      // 05a: ifnonnull 084
      // 05d: goto 064
      // 060: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 063: athrow
      // 064: ifnonnull 080
      // 067: goto 06e
      // 06a: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 06d: athrow
      // 06e: aload 0
      // 06f: aload 0
      // 070: getfield com/zF.R J
      // 073: invokestatic java/math/BigDecimal.valueOf (J)Ljava/math/BigDecimal;
      // 076: putfield com/zF.Z Ljava/math/BigDecimal;
      // 079: goto 080
      // 07c: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 07f: athrow
      // 080: aload 0
      // 081: getfield com/zF.Z Ljava/math/BigDecimal;
      // 084: aload 6
      // 086: checkcast java/math/BigDecimal
      // 089: invokevirtual java/math/BigDecimal.compareTo (Ljava/math/BigDecimal;)I
      // 08c: istore 7
      // 08e: getstatic com/l1_2.U [I
      // 091: aload 0
      // 092: getfield com/zF.w Lcom/S6;
      // 095: invokevirtual com/S6.ordinal ()I
      // 098: iaload
      // 099: aload 5
      // 09b: ifnonnull 17a
      // 09e: tableswitch 219 1 6 42 72 95 126 157 188
      // 0c4: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0c7: athrow
      // 0c8: iload 7
      // 0ca: aload 5
      // 0cc: ifnonnull 0e1
      // 0cf: goto 0d6
      // 0d2: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0d5: athrow
      // 0d6: ifne 0e4
      // 0d9: goto 0e0
      // 0dc: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0df: athrow
      // 0e0: bipush 1
      // 0e1: goto 0e5
      // 0e4: bipush 0
      // 0e5: ireturn
      // 0e6: iload 7
      // 0e8: aload 5
      // 0ea: ifnonnull 0f8
      // 0ed: ifeq 0fb
      // 0f0: goto 0f7
      // 0f3: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 0f6: athrow
      // 0f7: bipush 1
      // 0f8: goto 0fc
      // 0fb: bipush 0
      // 0fc: ireturn
      // 0fd: bipush 0
      // 0fe: aload 5
      // 100: ifnonnull 117
      // 103: iload 7
      // 105: if_icmplt 11a
      // 108: goto 10f
      // 10b: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 10e: athrow
      // 10f: bipush 1
      // 110: goto 117
      // 113: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 116: athrow
      // 117: goto 11b
      // 11a: bipush 0
      // 11b: ireturn
      // 11c: bipush 0
      // 11d: aload 5
      // 11f: ifnonnull 136
      // 122: iload 7
      // 124: if_icmple 139
      // 127: goto 12e
      // 12a: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 12d: athrow
      // 12e: bipush 1
      // 12f: goto 136
      // 132: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 135: athrow
      // 136: goto 13a
      // 139: bipush 0
      // 13a: ireturn
      // 13b: bipush 0
      // 13c: aload 5
      // 13e: ifnonnull 155
      // 141: iload 7
      // 143: if_icmpgt 158
      // 146: goto 14d
      // 149: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 14c: athrow
      // 14d: bipush 1
      // 14e: goto 155
      // 151: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 154: athrow
      // 155: goto 159
      // 158: bipush 0
      // 159: ireturn
      // 15a: bipush 0
      // 15b: aload 5
      // 15d: ifnonnull 174
      // 160: iload 7
      // 162: if_icmpge 177
      // 165: goto 16c
      // 168: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 16b: athrow
      // 16c: bipush 1
      // 16d: goto 174
      // 170: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 173: athrow
      // 174: goto 178
      // 177: bipush 0
      // 178: ireturn
      // 179: bipush 0
      // 17a: ireturn
      // 17b: aload 6
      // 17d: instanceof java/lang/Float
      // 180: aload 5
      // 182: ifnonnull 2c8
      // 185: ifeq 2b7
      // 188: goto 18f
      // 18b: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 18e: athrow
      // 18f: aload 0
      // 190: getfield com/zF.F Ljava/lang/Float;
      // 193: aload 5
      // 195: ifnonnull 1c0
      // 198: goto 19f
      // 19b: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 19e: athrow
      // 19f: ifnonnull 1bc
      // 1a2: goto 1a9
      // 1a5: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: aload 0
      // 1ab: getfield com/zF.R J
      // 1ae: l2f
      // 1af: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1b2: putfield com/zF.F Ljava/lang/Float;
      // 1b5: goto 1bc
      // 1b8: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 1bb: athrow
      // 1bc: aload 0
      // 1bd: getfield com/zF.F Ljava/lang/Float;
      // 1c0: aload 6
      // 1c2: checkcast java/lang/Float
      // 1c5: invokevirtual java/lang/Float.compareTo (Ljava/lang/Float;)I
      // 1c8: istore 7
      // 1ca: getstatic com/l1_2.U [I
      // 1cd: aload 0
      // 1ce: getfield com/zF.w Lcom/S6;
      // 1d1: invokevirtual com/S6.ordinal ()I
      // 1d4: iaload
      // 1d5: aload 5
      // 1d7: ifnonnull 2b6
      // 1da: tableswitch 219 1 6 42 72 95 126 157 188
      // 200: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 203: athrow
      // 204: iload 7
      // 206: aload 5
      // 208: ifnonnull 21d
      // 20b: goto 212
      // 20e: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 211: athrow
      // 212: ifne 220
      // 215: goto 21c
      // 218: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 21b: athrow
      // 21c: bipush 1
      // 21d: goto 221
      // 220: bipush 0
      // 221: ireturn
      // 222: iload 7
      // 224: aload 5
      // 226: ifnonnull 234
      // 229: ifeq 237
      // 22c: goto 233
      // 22f: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 232: athrow
      // 233: bipush 1
      // 234: goto 238
      // 237: bipush 0
      // 238: ireturn
      // 239: bipush 0
      // 23a: aload 5
      // 23c: ifnonnull 253
      // 23f: iload 7
      // 241: if_icmplt 256
      // 244: goto 24b
      // 247: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 24a: athrow
      // 24b: bipush 1
      // 24c: goto 253
      // 24f: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 252: athrow
      // 253: goto 257
      // 256: bipush 0
      // 257: ireturn
      // 258: bipush 0
      // 259: aload 5
      // 25b: ifnonnull 272
      // 25e: iload 7
      // 260: if_icmple 275
      // 263: goto 26a
      // 266: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 269: athrow
      // 26a: bipush 1
      // 26b: goto 272
      // 26e: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 271: athrow
      // 272: goto 276
      // 275: bipush 0
      // 276: ireturn
      // 277: bipush 0
      // 278: aload 5
      // 27a: ifnonnull 291
      // 27d: iload 7
      // 27f: if_icmpgt 294
      // 282: goto 289
      // 285: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 288: athrow
      // 289: bipush 1
      // 28a: goto 291
      // 28d: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 290: athrow
      // 291: goto 295
      // 294: bipush 0
      // 295: ireturn
      // 296: bipush 0
      // 297: aload 5
      // 299: ifnonnull 2b0
      // 29c: iload 7
      // 29e: if_icmpge 2b3
      // 2a1: goto 2a8
      // 2a4: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 2a7: athrow
      // 2a8: bipush 1
      // 2a9: goto 2b0
      // 2ac: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 2af: athrow
      // 2b0: goto 2b4
      // 2b3: bipush 0
      // 2b4: ireturn
      // 2b5: bipush 0
      // 2b6: ireturn
      // 2b7: aload 6
      // 2b9: aload 5
      // 2bb: ifnonnull 3f5
      // 2be: instanceof java/lang/Double
      // 2c1: goto 2c8
      // 2c4: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 2c7: athrow
      // 2c8: ifeq 3f3
      // 2cb: aload 0
      // 2cc: getfield com/zF.P Ljava/lang/Double;
      // 2cf: aload 5
      // 2d1: ifnonnull 2fc
      // 2d4: goto 2db
      // 2d7: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 2da: athrow
      // 2db: ifnonnull 2f8
      // 2de: goto 2e5
      // 2e1: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 2e4: athrow
      // 2e5: aload 0
      // 2e6: aload 0
      // 2e7: getfield com/zF.R J
      // 2ea: l2d
      // 2eb: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 2ee: putfield com/zF.P Ljava/lang/Double;
      // 2f1: goto 2f8
      // 2f4: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 2f7: athrow
      // 2f8: aload 0
      // 2f9: getfield com/zF.P Ljava/lang/Double;
      // 2fc: aload 6
      // 2fe: checkcast java/lang/Double
      // 301: invokevirtual java/lang/Double.compareTo (Ljava/lang/Double;)I
      // 304: istore 7
      // 306: getstatic com/l1_2.U [I
      // 309: aload 0
      // 30a: getfield com/zF.w Lcom/S6;
      // 30d: invokevirtual com/S6.ordinal ()I
      // 310: iaload
      // 311: aload 5
      // 313: ifnonnull 3f2
      // 316: tableswitch 219 1 6 42 72 95 126 157 188
      // 33c: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 33f: athrow
      // 340: iload 7
      // 342: aload 5
      // 344: ifnonnull 359
      // 347: goto 34e
      // 34a: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 34d: athrow
      // 34e: ifne 35c
      // 351: goto 358
      // 354: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 357: athrow
      // 358: bipush 1
      // 359: goto 35d
      // 35c: bipush 0
      // 35d: ireturn
      // 35e: iload 7
      // 360: aload 5
      // 362: ifnonnull 370
      // 365: ifeq 373
      // 368: goto 36f
      // 36b: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 36e: athrow
      // 36f: bipush 1
      // 370: goto 374
      // 373: bipush 0
      // 374: ireturn
      // 375: bipush 0
      // 376: aload 5
      // 378: ifnonnull 38f
      // 37b: iload 7
      // 37d: if_icmplt 392
      // 380: goto 387
      // 383: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 386: athrow
      // 387: bipush 1
      // 388: goto 38f
      // 38b: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 38e: athrow
      // 38f: goto 393
      // 392: bipush 0
      // 393: ireturn
      // 394: bipush 0
      // 395: aload 5
      // 397: ifnonnull 3ae
      // 39a: iload 7
      // 39c: if_icmple 3b1
      // 39f: goto 3a6
      // 3a2: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 3a5: athrow
      // 3a6: bipush 1
      // 3a7: goto 3ae
      // 3aa: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 3ad: athrow
      // 3ae: goto 3b2
      // 3b1: bipush 0
      // 3b2: ireturn
      // 3b3: bipush 0
      // 3b4: aload 5
      // 3b6: ifnonnull 3cd
      // 3b9: iload 7
      // 3bb: if_icmpgt 3d0
      // 3be: goto 3c5
      // 3c1: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 3c4: athrow
      // 3c5: bipush 1
      // 3c6: goto 3cd
      // 3c9: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 3cc: athrow
      // 3cd: goto 3d1
      // 3d0: bipush 0
      // 3d1: ireturn
      // 3d2: bipush 0
      // 3d3: aload 5
      // 3d5: ifnonnull 3ec
      // 3d8: iload 7
      // 3da: if_icmpge 3ef
      // 3dd: goto 3e4
      // 3e0: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 3e3: athrow
      // 3e4: bipush 1
      // 3e5: goto 3ec
      // 3e8: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 3eb: athrow
      // 3ec: goto 3f0
      // 3ef: bipush 0
      // 3f0: ireturn
      // 3f1: bipush 0
      // 3f2: ireturn
      // 3f3: aload 6
      // 3f5: checkcast java/lang/Number
      // 3f8: invokestatic com/B8.e (Ljava/lang/Number;)J
      // 3fb: lstore 7
      // 3fd: getstatic com/l1_2.U [I
      // 400: aload 0
      // 401: getfield com/zF.w Lcom/S6;
      // 404: invokevirtual com/S6.ordinal ()I
      // 407: iaload
      // 408: aload 5
      // 40a: ifnonnull 4e8
      // 40d: tableswitch 218 1 6 43 78 106 134 162 190
      // 434: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 437: athrow
      // 438: lload 7
      // 43a: aload 0
      // 43b: getfield com/zF.R J
      // 43e: lcmp
      // 43f: aload 5
      // 441: ifnonnull 456
      // 444: goto 44b
      // 447: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 44a: athrow
      // 44b: ifne 459
      // 44e: goto 455
      // 451: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 454: athrow
      // 455: bipush 1
      // 456: goto 45a
      // 459: bipush 0
      // 45a: ireturn
      // 45b: lload 7
      // 45d: aload 0
      // 45e: getfield com/zF.R J
      // 461: lcmp
      // 462: aload 5
      // 464: ifnonnull 472
      // 467: ifeq 475
      // 46a: goto 471
      // 46d: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 470: athrow
      // 471: bipush 1
      // 472: goto 476
      // 475: bipush 0
      // 476: ireturn
      // 477: lload 7
      // 479: aload 0
      // 47a: getfield com/zF.R J
      // 47d: lcmp
      // 47e: aload 5
      // 480: ifnonnull 48e
      // 483: iflt 491
      // 486: goto 48d
      // 489: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 48c: athrow
      // 48d: bipush 1
      // 48e: goto 492
      // 491: bipush 0
      // 492: ireturn
      // 493: lload 7
      // 495: aload 0
      // 496: getfield com/zF.R J
      // 499: lcmp
      // 49a: aload 5
      // 49c: ifnonnull 4aa
      // 49f: ifle 4ad
      // 4a2: goto 4a9
      // 4a5: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 4a8: athrow
      // 4a9: bipush 1
      // 4aa: goto 4ae
      // 4ad: bipush 0
      // 4ae: ireturn
      // 4af: lload 7
      // 4b1: aload 0
      // 4b2: getfield com/zF.R J
      // 4b5: lcmp
      // 4b6: aload 5
      // 4b8: ifnonnull 4c6
      // 4bb: ifgt 4c9
      // 4be: goto 4c5
      // 4c1: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 4c4: athrow
      // 4c5: bipush 1
      // 4c6: goto 4ca
      // 4c9: bipush 0
      // 4ca: ireturn
      // 4cb: lload 7
      // 4cd: aload 0
      // 4ce: getfield com/zF.R J
      // 4d1: lcmp
      // 4d2: aload 5
      // 4d4: ifnonnull 4e2
      // 4d7: ifge 4e5
      // 4da: goto 4e1
      // 4dd: invokestatic com/zF.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 4e0: athrow
      // 4e1: bipush 1
      // 4e2: goto 4e6
      // 4e5: bipush 0
      // 4e6: ireturn
      // 4e7: bipush 0
      // 4e8: ireturn
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }
}





