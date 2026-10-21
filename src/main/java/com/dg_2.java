package com;

class Dg_2 extends com.DQ {
   private boolean F;
   byte[] J;
   byte[] p;
   final com.Bb_2 k;
   private static final String[] c;
   private static final String[] d;

   Dg_2(com.Bb_2 var1, String var2, byte[] var3) throws Pc_2 {
      this(var1, var2, 0, var3);
   }

   Dg_2(com.Bb_2 var1, String var2, int var3, byte[] var4) throws Pc_2 {
      this(var1, "", var2, var3, var4, null);
   }

   Dg_2(com.Bb_2 param1, String param2, String param3, int param4, byte[] param5, String param6) throws Pc_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/dm_4.F ()Z
      // 003: aload 0
      // 004: aload 1
      // 005: putfield com/Dg_2.k Lcom/Bb_2;
      // 008: aload 0
      // 009: aload 2
      // 00a: aload 3
      // 00b: iload 4
      // 00d: aload 5
      // 00f: aload 6
      // 011: invokespecial com/DQ.<init> (Ljava/lang/String;Ljava/lang/String;I[BLjava/lang/String;)V
      // 014: aload 0
      // 015: bipush 0
      // 016: putfield com/Dg_2.F Z
      // 019: istore 7
      // 01b: aload 0
      // 01c: aconst_null
      // 01d: putfield com/Dg_2.J [B
      // 020: aload 0
      // 021: aconst_null
      // 022: putfield com/Dg_2.p [B
      // 025: aload 0
      // 026: getfield com/Dg_2.Y Ljava/lang/String;
      // 029: sipush 17369
      // 02c: sipush -13661
      // 02f: invokestatic com/Dg_2.b (II)Ljava/lang/String;
      // 032: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 035: iload 7
      // 037: ifeq 06f
      // 03a: ifeq 126
      // 03d: goto 044
      // 040: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: aload 0
      // 045: getfield com/Dg_2.Y Ljava/lang/String;
      // 048: sipush 17371
      // 04b: sipush -9274
      // 04e: invokestatic com/Dg_2.b (II)Ljava/lang/String;
      // 051: invokevirtual java/lang/String.length ()I
      // 054: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 057: ldc "|"
      // 059: iload 7
      // 05b: ifeq 086
      // 05e: goto 065
      // 061: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 068: goto 06f
      // 06b: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: ifle 126
      // 072: aload 0
      // 073: getfield com/Dg_2.Y Ljava/lang/String;
      // 076: sipush 17371
      // 079: sipush -9274
      // 07c: invokestatic com/Dg_2.b (II)Ljava/lang/String;
      // 07f: goto 086
      // 082: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: invokevirtual java/lang/String.length ()I
      // 089: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 08c: astore 8
      // 08e: aload 8
      // 090: bipush 0
      // 091: aload 8
      // 093: ldc "|"
      // 095: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 098: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 09b: astore 9
      // 09d: aload 8
      // 09f: aload 8
      // 0a1: ldc "|"
      // 0a3: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0a6: bipush 1
      // 0a7: iadd
      // 0a8: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0ab: astore 10
      // 0ad: aload 0
      // 0ae: aload 9
      // 0b0: invokestatic com/E8.J (Ljava/lang/String;)[B
      // 0b3: bipush 0
      // 0b4: aload 9
      // 0b6: invokevirtual java/lang/String.length ()I
      // 0b9: invokestatic com/E8.M ([BII)[B
      // 0bc: putfield com/Dg_2.J [B
      // 0bf: aload 0
      // 0c0: aload 10
      // 0c2: invokestatic com/E8.J (Ljava/lang/String;)[B
      // 0c5: bipush 0
      // 0c6: aload 10
      // 0c8: invokevirtual java/lang/String.length ()I
      // 0cb: invokestatic com/E8.M ([BII)[B
      // 0ce: putfield com/Dg_2.p [B
      // 0d1: aload 1
      // 0d2: getfield com/Bb_2.r Lcom/FP;
      // 0d5: invokeinterface com/FP.h ()I 1
      // 0da: istore 11
      // 0dc: aload 0
      // 0dd: iload 7
      // 0df: ifeq 11c
      // 0e2: getfield com/Dg_2.J [B
      // 0e5: arraylength
      // 0e6: iload 11
      // 0e8: if_icmpne 10f
      // 0eb: goto 0f2
      // 0ee: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: iload 7
      // 0f5: ifeq 122
      // 0f8: goto 0ff
      // 0fb: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: getfield com/Dg_2.p [B
      // 102: arraylength
      // 103: iload 11
      // 105: if_icmpeq 121
      // 108: goto 10f
      // 10b: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 0
      // 110: aconst_null
      // 111: putfield com/Dg_2.J [B
      // 114: aload 0
      // 115: goto 11c
      // 118: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: aconst_null
      // 11d: putfield com/Dg_2.p [B
      // 120: return
      // 121: aload 0
      // 122: bipush 1
      // 123: putfield com/Dg_2.F Z
      // 126: return
   }

   @Override
   boolean p(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/dm_4.J ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 21
      // 09: getfield com/Dg_2.F Z
      // 0c: ifne 20
      // 0f: goto 16
      // 12: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokespecial com/DQ.p (Ljava/lang/String;)Z
      // 1b: ireturn
      // 1c: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield com/Dg_2.k Lcom/Bb_2;
      // 24: getfield com/Bb_2.r Lcom/FP;
      // 27: dup
      // 28: astore 3
      // 29: monitorenter
      // 2a: aload 0
      // 2b: getfield com/Dg_2.k Lcom/Bb_2;
      // 2e: getfield com/Bb_2.r Lcom/FP;
      // 31: aload 0
      // 32: getfield com/Dg_2.J [B
      // 35: invokeinterface com/FP.L ([B)V 2
      // 3a: aload 1
      // 3b: invokestatic com/E8.J (Ljava/lang/String;)[B
      // 3e: astore 4
      // 40: aload 0
      // 41: getfield com/Dg_2.k Lcom/Bb_2;
      // 44: getfield com/Bb_2.r Lcom/FP;
      // 47: aload 4
      // 49: bipush 0
      // 4a: aload 4
      // 4c: arraylength
      // 4d: invokeinterface com/FP.o ([BII)V 4
      // 52: aload 0
      // 53: getfield com/Dg_2.k Lcom/Bb_2;
      // 56: getfield com/Bb_2.r Lcom/FP;
      // 59: invokeinterface com/FP.h ()I 1
      // 5e: newarray 8
      // 60: astore 5
      // 62: aload 0
      // 63: getfield com/Dg_2.k Lcom/Bb_2;
      // 66: getfield com/Bb_2.r Lcom/FP;
      // 69: aload 5
      // 6b: bipush 0
      // 6c: invokeinterface com/FP.U ([BI)V 3
      // 71: aload 0
      // 72: getfield com/Dg_2.p [B
      // 75: aload 5
      // 77: invokestatic com/E8.I ([B[B)Z
      // 7a: aload 3
      // 7b: monitorexit
      // 7c: ireturn
      // 7d: astore 6
      // 7f: aload 3
      // 80: monitorexit
      // 81: aload 6
      // 83: athrow
      // 84: astore 3
      // 85: aload 0
      // 86: getfield com/Dg_2.k Lcom/Bb_2;
      // 89: invokestatic com/Bb_2.W (Lcom/Bb_2;)Lcom/Xe_2;
      // 8c: invokevirtual com/Xe_2.p ()Lcom/GN;
      // 8f: bipush 3
      // 90: new java/lang/StringBuilder
      // 93: dup
      // 94: invokespecial java/lang/StringBuilder.<init> ()V
      // 97: sipush 17370
      // 9a: sipush 14505
      // 9d: invokestatic com/Dg_2.b (II)Ljava/lang/String;
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: aload 1
      // a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // aa: aload 3
      // ab: invokeinterface com/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // b0: bipush 0
      // b1: ireturn
   }

   boolean d() {
      return this.F;
   }

   void u() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/dm_4.F ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01c
      // 009: getfield com/Dg_2.F Z
      // 00c: ifeq 01b
      // 00f: goto 016
      // 012: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: return
      // 017: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 0
      // 01c: iload 1
      // 01d: ifeq 064
      // 020: getfield com/Dg_2.J [B
      // 023: ifnonnull 063
      // 026: goto 02d
      // 029: invokestatic com/Dg_2.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: getstatic com/DI.p Lcom/i8_2;
      // 030: astore 2
      // 031: aload 2
      // 032: dup
      // 033: astore 3
      // 034: monitorenter
      // 035: aload 0
      // 036: aload 0
      // 037: getfield com/Dg_2.k Lcom/Bb_2;
      // 03a: getfield com/Bb_2.r Lcom/FP;
      // 03d: invokeinterface com/FP.h ()I 1
      // 042: newarray 8
      // 044: putfield com/Dg_2.J [B
      // 047: aload 2
      // 048: aload 0
      // 049: getfield com/Dg_2.J [B
      // 04c: bipush 0
      // 04d: aload 0
      // 04e: getfield com/Dg_2.J [B
      // 051: arraylength
      // 052: invokeinterface com/i8_2.Y ([BII)V 4
      // 057: aload 3
      // 058: monitorexit
      // 059: goto 063
      // 05c: astore 4
      // 05e: aload 3
      // 05f: monitorexit
      // 060: aload 4
      // 062: athrow
      // 063: aload 0
      // 064: getfield com/Dg_2.k Lcom/Bb_2;
      // 067: getfield com/Bb_2.r Lcom/FP;
      // 06a: dup
      // 06b: astore 2
      // 06c: monitorenter
      // 06d: aload 0
      // 06e: getfield com/Dg_2.k Lcom/Bb_2;
      // 071: getfield com/Bb_2.r Lcom/FP;
      // 074: aload 0
      // 075: getfield com/Dg_2.J [B
      // 078: invokeinterface com/FP.L ([B)V 2
      // 07d: aload 0
      // 07e: getfield com/Dg_2.Y Ljava/lang/String;
      // 081: invokestatic com/E8.J (Ljava/lang/String;)[B
      // 084: astore 3
      // 085: aload 0
      // 086: getfield com/Dg_2.k Lcom/Bb_2;
      // 089: getfield com/Bb_2.r Lcom/FP;
      // 08c: aload 3
      // 08d: bipush 0
      // 08e: aload 3
      // 08f: arraylength
      // 090: invokeinterface com/FP.o ([BII)V 4
      // 095: aload 0
      // 096: aload 0
      // 097: getfield com/Dg_2.k Lcom/Bb_2;
      // 09a: getfield com/Bb_2.r Lcom/FP;
      // 09d: invokeinterface com/FP.h ()I 1
      // 0a2: newarray 8
      // 0a4: putfield com/Dg_2.p [B
      // 0a7: aload 0
      // 0a8: getfield com/Dg_2.k Lcom/Bb_2;
      // 0ab: getfield com/Bb_2.r Lcom/FP;
      // 0ae: aload 0
      // 0af: getfield com/Dg_2.p [B
      // 0b2: bipush 0
      // 0b3: invokeinterface com/FP.U ([BI)V 3
      // 0b8: aload 2
      // 0b9: monitorexit
      // 0ba: goto 0c4
      // 0bd: astore 5
      // 0bf: aload 2
      // 0c0: monitorexit
      // 0c1: aload 5
      // 0c3: athrow
      // 0c4: goto 101
      // 0c7: astore 2
      // 0c8: aload 0
      // 0c9: getfield com/Dg_2.k Lcom/Bb_2;
      // 0cc: invokestatic com/Bb_2.W (Lcom/Bb_2;)Lcom/Xe_2;
      // 0cf: invokevirtual com/Xe_2.p ()Lcom/GN;
      // 0d2: bipush 3
      // 0d3: new java/lang/StringBuilder
      // 0d6: dup
      // 0d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0da: sipush 17368
      // 0dd: sipush 18498
      // 0e0: invokestatic com/Dg_2.b (II)Ljava/lang/String;
      // 0e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e6: aload 0
      // 0e7: getfield com/Dg_2.Y Ljava/lang/String;
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f0: aload 2
      // 0f1: invokeinterface com/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 0f6: aload 0
      // 0f7: aconst_null
      // 0f8: putfield com/Dg_2.J [B
      // 0fb: aload 0
      // 0fc: aconst_null
      // 0fd: putfield com/Dg_2.p [B
      // 100: return
      // 101: aload 0
      // 102: new java/lang/StringBuilder
      // 105: dup
      // 106: invokespecial java/lang/StringBuilder.<init> ()V
      // 109: sipush 17371
      // 10c: sipush -9274
      // 10f: invokestatic com/Dg_2.b (II)Ljava/lang/String;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: aload 0
      // 116: getfield com/Dg_2.J [B
      // 119: bipush 0
      // 11a: aload 0
      // 11b: getfield com/Dg_2.J [B
      // 11e: arraylength
      // 11f: bipush 1
      // 120: invokestatic com/E8.V ([BIIZ)[B
      // 123: invokestatic com/E8.B ([B)Ljava/lang/String;
      // 126: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 129: ldc "|"
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: aload 0
      // 12f: getfield com/Dg_2.p [B
      // 132: bipush 0
      // 133: aload 0
      // 134: getfield com/Dg_2.p [B
      // 137: arraylength
      // 138: bipush 1
      // 139: invokestatic com/E8.V ([BIIZ)[B
      // 13c: invokestatic com/E8.B ([B)Ljava/lang/String;
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 142: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 145: putfield com/Dg_2.Y Ljava/lang/String;
      // 148: aload 0
      // 149: bipush 1
      // 14a: putfield com/Dg_2.F Z
      // 14d: return
   }

   private static Exception b(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "R&A>ý¦V\u00836\u008c§Rf\u009d\u001aø~Pëc¡\u0014\u0001\u0089âµMó\u0085\u0082t7;õ`Ðí\u0087n8\u009e\u00adÖ|'(Aï\u0011 \u0017\u0006q\b\b \u00ad½¹]\u0018ÏÌ~Åµ";
      int var4 = "R&A>ý¦V\u00836\u008c§Rf\u009d\u001aø~Pëc¡\u0014\u0001\u0089âµMó\u0085\u0082t7;õ`Ðí\u0087n8\u009e\u00adÖ|'(Aï\u0011 \u0017\u0006q\b\b \u00ad½¹]\u0018ÏÌ~Åµ"
         .length();
      char var1 = 3;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 74;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 70;
                        break;
                     case 1:
                        var46 = 20;
                        break;
                     case 2:
                        var46 = 79;
                        break;
                     case 3:
                        var46 = 16;
                        break;
                     case 4:
                        var46 = 64;
                        break;
                     case 5:
                        var46 = 70;
                        break;
                     default:
                        var46 = 57;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     c = var5;
                     d = new String[4];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "ûÑD6ö$\u0007ã,°Ôå8[á\u00101}2öª\u0096Péø\u0089>DÛD\u008fßtØ¹Eæ\u0005?Q\u008d\u0098²¦O\u0093BWÁHé¦\u009d=ø\u0005H\u0007";
                  var4 = "ûÑD6ö$\u0007ã,°Ôå8[á\u00101}2öª\u0096Péø\u0089>DÛD\u008fßtØ¹Eæ\u0005?Q\u008d\u0098²¦O\u0093BWÁHé¦\u009d=ø\u0005H\u0007".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 17;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 17369) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 200;
               break;
            case 1:
               var10000 = 82;
               break;
            case 2:
               var10000 = 89;
               break;
            case 3:
               var10000 = 152;
               break;
            case 4:
               var10000 = 114;
               break;
            case 5:
               var10000 = 51;
               break;
            case 6:
               var10000 = 190;
               break;
            case 7:
               var10000 = 15;
               break;
            case 8:
               var10000 = 78;
               break;
            case 9:
               var10000 = 99;
               break;
            case 10:
               var10000 = 208;
               break;
            case 11:
               var10000 = 112;
               break;
            case 12:
               var10000 = 168;
               break;
            case 13:
               var10000 = 163;
               break;
            case 14:
               var10000 = 131;
               break;
            case 15:
               var10000 = 214;
               break;
            case 16:
               var10000 = 35;
               break;
            case 17:
               var10000 = 94;
               break;
            case 18:
               var10000 = 142;
               break;
            case 19:
               var10000 = 30;
               break;
            case 20:
               var10000 = 159;
               break;
            case 21:
               var10000 = 217;
               break;
            case 22:
               var10000 = 227;
               break;
            case 23:
               var10000 = 223;
               break;
            case 24:
               var10000 = 230;
               break;
            case 25:
               var10000 = 101;
               break;
            case 26:
               var10000 = 238;
               break;
            case 27:
               var10000 = 24;
               break;
            case 28:
               var10000 = 16;
               break;
            case 29:
               var10000 = 145;
               break;
            case 30:
               var10000 = 215;
               break;
            case 31:
               var10000 = 104;
               break;
            case 32:
               var10000 = 235;
               break;
            case 33:
               var10000 = 40;
               break;
            case 34:
               var10000 = 37;
               break;
            case 35:
               var10000 = 252;
               break;
            case 36:
               var10000 = 141;
               break;
            case 37:
               var10000 = 236;
               break;
            case 38:
               var10000 = 62;
               break;
            case 39:
               var10000 = 169;
               break;
            case 40:
               var10000 = 203;
               break;
            case 41:
               var10000 = 175;
               break;
            case 42:
               var10000 = 14;
               break;
            case 43:
               var10000 = 45;
               break;
            case 44:
               var10000 = 22;
               break;
            case 45:
               var10000 = 81;
               break;
            case 46:
               var10000 = 205;
               break;
            case 47:
               var10000 = 225;
               break;
            case 48:
               var10000 = 50;
               break;
            case 49:
               var10000 = 23;
               break;
            case 50:
               var10000 = 240;
               break;
            case 51:
               var10000 = 247;
               break;
            case 52:
               var10000 = 9;
               break;
            case 53:
               var10000 = 176;
               break;
            case 54:
               var10000 = 179;
               break;
            case 55:
               var10000 = 185;
               break;
            case 56:
               var10000 = 93;
               break;
            case 57:
               var10000 = 160;
               break;
            case 58:
               var10000 = 86;
               break;
            case 59:
               var10000 = 213;
               break;
            case 60:
               var10000 = 174;
               break;
            case 61:
               var10000 = 226;
               break;
            case 62:
               var10000 = 100;
               break;
            case 63:
               var10000 = 68;
               break;
            case 64:
               var10000 = 83;
               break;
            case 65:
               var10000 = 249;
               break;
            case 66:
               var10000 = 201;
               break;
            case 67:
               var10000 = 157;
               break;
            case 68:
               var10000 = 47;
               break;
            case 69:
               var10000 = 183;
               break;
            case 70:
               var10000 = 109;
               break;
            case 71:
               var10000 = 199;
               break;
            case 72:
               var10000 = 237;
               break;
            case 73:
               var10000 = 132;
               break;
            case 74:
               var10000 = 172;
               break;
            case 75:
               var10000 = 222;
               break;
            case 76:
               var10000 = 239;
               break;
            case 77:
               var10000 = 144;
               break;
            case 78:
               var10000 = 103;
               break;
            case 79:
               var10000 = 58;
               break;
            case 80:
               var10000 = 38;
               break;
            case 81:
               var10000 = 74;
               break;
            case 82:
               var10000 = 54;
               break;
            case 83:
               var10000 = 88;
               break;
            case 84:
               var10000 = 87;
               break;
            case 85:
               var10000 = 61;
               break;
            case 86:
               var10000 = 31;
               break;
            case 87:
               var10000 = 96;
               break;
            case 88:
               var10000 = 119;
               break;
            case 89:
               var10000 = 120;
               break;
            case 90:
               var10000 = 122;
               break;
            case 91:
               var10000 = 48;
               break;
            case 92:
               var10000 = 69;
               break;
            case 93:
               var10000 = 244;
               break;
            case 94:
               var10000 = 129;
               break;
            case 95:
               var10000 = 186;
               break;
            case 96:
               var10000 = 204;
               break;
            case 97:
               var10000 = 184;
               break;
            case 98:
               var10000 = 128;
               break;
            case 99:
               var10000 = 219;
               break;
            case 100:
               var10000 = 146;
               break;
            case 101:
               var10000 = 34;
               break;
            case 102:
               var10000 = 150;
               break;
            case 103:
               var10000 = 149;
               break;
            case 104:
               var10000 = 206;
               break;
            case 105:
               var10000 = 127;
               break;
            case 106:
               var10000 = 212;
               break;
            case 107:
               var10000 = 5;
               break;
            case 108:
               var10000 = 138;
               break;
            case 109:
               var10000 = 135;
               break;
            case 110:
               var10000 = 98;
               break;
            case 111:
               var10000 = 248;
               break;
            case 112:
               var10000 = 166;
               break;
            case 113:
               var10000 = 137;
               break;
            case 114:
               var10000 = 198;
               break;
            case 115:
               var10000 = 245;
               break;
            case 116:
               var10000 = 195;
               break;
            case 117:
               var10000 = 211;
               break;
            case 118:
               var10000 = 44;
               break;
            case 119:
               var10000 = 71;
               break;
            case 120:
               var10000 = 111;
               break;
            case 121:
               var10000 = 52;
               break;
            case 122:
               var10000 = 91;
               break;
            case 123:
               var10000 = 228;
               break;
            case 124:
               var10000 = 158;
               break;
            case 125:
               var10000 = 25;
               break;
            case 126:
               var10000 = 140;
               break;
            case 127:
               var10000 = 29;
               break;
            case 128:
               var10000 = 92;
               break;
            case 129:
               var10000 = 182;
               break;
            case 130:
               var10000 = 77;
               break;
            case 131:
               var10000 = 218;
               break;
            case 132:
               var10000 = 0;
               break;
            case 133:
               var10000 = 33;
               break;
            case 134:
               var10000 = 57;
               break;
            case 135:
               var10000 = 232;
               break;
            case 136:
               var10000 = 220;
               break;
            case 137:
               var10000 = 18;
               break;
            case 138:
               var10000 = 3;
               break;
            case 139:
               var10000 = 106;
               break;
            case 140:
               var10000 = 76;
               break;
            case 141:
               var10000 = 251;
               break;
            case 142:
               var10000 = 254;
               break;
            case 143:
               var10000 = 36;
               break;
            case 144:
               var10000 = 8;
               break;
            case 145:
               var10000 = 46;
               break;
            case 146:
               var10000 = 32;
               break;
            case 147:
               var10000 = 79;
               break;
            case 148:
               var10000 = 66;
               break;
            case 149:
               var10000 = 196;
               break;
            case 150:
               var10000 = 216;
               break;
            case 151:
               var10000 = 41;
               break;
            case 152:
               var10000 = 155;
               break;
            case 153:
               var10000 = 177;
               break;
            case 154:
               var10000 = 63;
               break;
            case 155:
               var10000 = 117;
               break;
            case 156:
               var10000 = 189;
               break;
            case 157:
               var10000 = 197;
               break;
            case 158:
               var10000 = 13;
               break;
            case 159:
               var10000 = 55;
               break;
            case 160:
               var10000 = 56;
               break;
            case 161:
               var10000 = 233;
               break;
            case 162:
               var10000 = 139;
               break;
            case 163:
               var10000 = 207;
               break;
            case 164:
               var10000 = 118;
               break;
            case 165:
               var10000 = 231;
               break;
            case 166:
               var10000 = 130;
               break;
            case 167:
               var10000 = 1;
               break;
            case 168:
               var10000 = 60;
               break;
            case 169:
               var10000 = 255;
               break;
            case 170:
               var10000 = 70;
               break;
            case 171:
               var10000 = 154;
               break;
            case 172:
               var10000 = 246;
               break;
            case 173:
               var10000 = 165;
               break;
            case 174:
               var10000 = 229;
               break;
            case 175:
               var10000 = 148;
               break;
            case 176:
               var10000 = 72;
               break;
            case 177:
               var10000 = 75;
               break;
            case 178:
               var10000 = 12;
               break;
            case 179:
               var10000 = 85;
               break;
            case 180:
               var10000 = 73;
               break;
            case 181:
               var10000 = 115;
               break;
            case 182:
               var10000 = 210;
               break;
            case 183:
               var10000 = 116;
               break;
            case 184:
               var10000 = 202;
               break;
            case 185:
               var10000 = 156;
               break;
            case 186:
               var10000 = 143;
               break;
            case 187:
               var10000 = 171;
               break;
            case 188:
               var10000 = 64;
               break;
            case 189:
               var10000 = 80;
               break;
            case 190:
               var10000 = 167;
               break;
            case 191:
               var10000 = 26;
               break;
            case 192:
               var10000 = 126;
               break;
            case 193:
               var10000 = 59;
               break;
            case 194:
               var10000 = 90;
               break;
            case 195:
               var10000 = 27;
               break;
            case 196:
               var10000 = 125;
               break;
            case 197:
               var10000 = 19;
               break;
            case 198:
               var10000 = 113;
               break;
            case 199:
               var10000 = 17;
               break;
            case 200:
               var10000 = 42;
               break;
            case 201:
               var10000 = 151;
               break;
            case 202:
               var10000 = 28;
               break;
            case 203:
               var10000 = 242;
               break;
            case 204:
               var10000 = 65;
               break;
            case 205:
               var10000 = 180;
               break;
            case 206:
               var10000 = 53;
               break;
            case 207:
               var10000 = 147;
               break;
            case 208:
               var10000 = 234;
               break;
            case 209:
               var10000 = 2;
               break;
            case 210:
               var10000 = 188;
               break;
            case 211:
               var10000 = 191;
               break;
            case 212:
               var10000 = 7;
               break;
            case 213:
               var10000 = 123;
               break;
            case 214:
               var10000 = 97;
               break;
            case 215:
               var10000 = 194;
               break;
            case 216:
               var10000 = 4;
               break;
            case 217:
               var10000 = 181;
               break;
            case 218:
               var10000 = 20;
               break;
            case 219:
               var10000 = 49;
               break;
            case 220:
               var10000 = 162;
               break;
            case 221:
               var10000 = 121;
               break;
            case 222:
               var10000 = 173;
               break;
            case 223:
               var10000 = 10;
               break;
            case 224:
               var10000 = 105;
               break;
            case 225:
               var10000 = 67;
               break;
            case 226:
               var10000 = 95;
               break;
            case 227:
               var10000 = 6;
               break;
            case 228:
               var10000 = 39;
               break;
            case 229:
               var10000 = 102;
               break;
            case 230:
               var10000 = 170;
               break;
            case 231:
               var10000 = 153;
               break;
            case 232:
               var10000 = 108;
               break;
            case 233:
               var10000 = 221;
               break;
            case 234:
               var10000 = 192;
               break;
            case 235:
               var10000 = 124;
               break;
            case 236:
               var10000 = 136;
               break;
            case 237:
               var10000 = 21;
               break;
            case 238:
               var10000 = 134;
               break;
            case 239:
               var10000 = 161;
               break;
            case 240:
               var10000 = 110;
               break;
            case 241:
               var10000 = 178;
               break;
            case 242:
               var10000 = 241;
               break;
            case 243:
               var10000 = 164;
               break;
            case 244:
               var10000 = 193;
               break;
            case 245:
               var10000 = 253;
               break;
            case 246:
               var10000 = 243;
               break;
            case 247:
               var10000 = 43;
               break;
            case 248:
               var10000 = 133;
               break;
            case 249:
               var10000 = 209;
               break;
            case 250:
               var10000 = 107;
               break;
            case 251:
               var10000 = 187;
               break;
            case 252:
               var10000 = 224;
               break;
            case 253:
               var10000 = 84;
               break;
            case 254:
               var10000 = 250;
               break;
            default:
               var10000 = 11;
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
}





