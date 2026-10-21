package org.v;

import java.util.Objects;

class hF extends hv_2 {
   @org.F.c
   private h4[] d;
   final NU K;
   final H_3 B;
   private static final String[] c;
   private static final String[] e;
   private static final long[] f;
   private static final Integer[] h;

   hF(H_3 var1, hd_2 var2, NU var3) {
      this.B = var1;
      this.K = var3;
      Objects.requireNonNull(var2);
      super(var2);
   }

   @Override
   public _S p() {
      return this.K.A();
   }

   @Override
   public h4[] f() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield org/v/hF.d [Lorg/v/h4;
      // 08: aload 1
      // 09: ifnull 32
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield org/v/hF.d [Lorg/v/h4;
      // 1a: areturn
      // 1b: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: getfield org/v/hF.B Lorg/v/H_3;
      // 24: aload 0
      // 25: getfield org/v/hF.K Lorg/v/NU;
      // 28: invokevirtual org/v/NU.d ()[Lorg/v/hV;
      // 2b: invokestatic org/v/H_3.R (Lorg/v/H_3;[Lorg/v/hV;)[Lorg/v/h4;
      // 2e: dup_x1
      // 2f: putfield org/v/hF.d [Lorg/v/h4;
      // 32: areturn
      // 33: astore 2
      // 34: new org/P
      // 37: dup
      // 38: aload 0
      // 39: getfield org/v/hF.K Lorg/v/NU;
      // 3c: invokevirtual org/v/NU.Q ()Lorg/I;
      // 3f: aconst_null
      // 40: aload 2
      // 41: invokespecial org/P.<init> (Lorg/I;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 44: athrow
   }

   @Override
   public f3 v() throws org.b_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield org/v/hF.K Lorg/v/NU;
      // 008: invokevirtual org/v/NU.j ()Lorg/v/_q_2;
      // 00b: instanceof org/v/f2
      // 00e: aload 1
      // 00f: ifnull 03a
      // 012: ifne 025
      // 015: goto 01c
      // 018: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: invokespecial org/v/hv_2.v ()Lorg/v/f3;
      // 020: areturn
      // 021: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 0
      // 026: aload 1
      // 027: ifnull 03e
      // 02a: getfield org/v/hF.K Lorg/v/NU;
      // 02d: invokevirtual org/v/NU.j ()Lorg/v/_q_2;
      // 030: instanceof org/v/_p_2
      // 033: goto 03a
      // 036: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: ifeq 042
      // 03d: aload 0
      // 03e: invokespecial org/v/hv_2.v ()Lorg/v/f3;
      // 041: areturn
      // 042: new java/util/ArrayList
      // 045: dup
      // 046: invokespecial java/util/ArrayList.<init> ()V
      // 049: astore 2
      // 04a: aload 0
      // 04b: getfield org/v/hF.B Lorg/v/H_3;
      // 04e: aload 0
      // 04f: getfield org/v/hF.K Lorg/v/NU;
      // 052: invokevirtual org/v/NU.j ()Lorg/v/_q_2;
      // 055: invokestatic org/v/H_3.e (Lorg/v/H_3;Lorg/v/K_2;)Lorg/v/hd_2;
      // 058: invokevirtual org/v/hd_2.i ()Lorg/v/hd_2;
      // 05b: astore 3
      // 05c: aload 3
      // 05d: ifnull 072
      // 060: aload 2
      // 061: aload 3
      // 062: invokevirtual org/v/hd_2.z ()Ljava/lang/String;
      // 065: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 06a: pop
      // 06b: goto 072
      // 06e: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 0
      // 073: getfield org/v/hF.K Lorg/v/NU;
      // 076: invokevirtual org/v/NU.j ()Lorg/v/_q_2;
      // 079: getfield org/v/_q_2.E Ljava/util/SortedMap;
      // 07c: invokeinterface java/util/SortedMap.values ()Ljava/util/Collection; 1
      // 081: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 086: astore 4
      // 088: aload 4
      // 08a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08f: ifeq 0d7
      // 092: aload 4
      // 094: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 099: checkcast org/v/u_3
      // 09c: astore 5
      // 09e: aload 5
      // 0a0: invokevirtual org/v/u_3.h ()Ljava/lang/String;
      // 0a3: sipush 26904
      // 0a6: sipush -16199
      // 0a9: invokestatic org/v/hF.c (II)Ljava/lang/String;
      // 0ac: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0af: aload 1
      // 0b0: ifnull 0d2
      // 0b3: ifeq 0d3
      // 0b6: goto 0bd
      // 0b9: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: aload 2
      // 0be: aload 5
      // 0c0: invokevirtual org/v/u_3.P ()Lorg/v/hd_2;
      // 0c3: invokevirtual org/v/hd_2.z ()Ljava/lang/String;
      // 0c6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cb: goto 0d2
      // 0ce: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: pop
      // 0d3: aload 1
      // 0d4: ifnonnull 088
      // 0d7: aload 0
      // 0d8: invokevirtual org/v/hF.d ()[Lorg/v/hd_2;
      // 0db: astore 4
      // 0dd: aload 4
      // 0df: arraylength
      // 0e0: istore 5
      // 0e2: bipush 0
      // 0e3: istore 6
      // 0e5: iload 6
      // 0e7: iload 5
      // 0e9: if_icmpge 106
      // 0ec: aload 4
      // 0ee: iload 6
      // 0f0: aaload
      // 0f1: astore 7
      // 0f3: aload 2
      // 0f4: aload 7
      // 0f6: invokevirtual org/v/hd_2.z ()Ljava/lang/String;
      // 0f9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0fe: pop
      // 0ff: iinc 6 1
      // 102: aload 1
      // 103: ifnonnull 0e5
      // 106: new org/v/f3
      // 109: dup
      // 10a: ldc "V"
      // 10c: aload 2
      // 10d: aload 2
      // 10e: invokeinterface java/util/List.size ()I 1
      // 113: anewarray 149
      // 116: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 11b: checkcast [Ljava/lang/String;
      // 11e: invokespecial org/v/f3.<init> (Ljava/lang/String;[Ljava/lang/String;)V
      // 121: areturn
   }

   @Override
   public boolean c() {
      return this.K.t.v;
   }

   @Override
   public hd_2[] d() throws org.b_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield org/v/hF.K Lorg/v/NU;
      // 04: getfield org/v/NU.t Lorg/v/RJ;
      // 07: getfield org/v/RJ.Q [Lorg/v/R9;
      // 0a: astore 2
      // 0b: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 0e: aload 2
      // 0f: arraylength
      // 10: anewarray 98
      // 13: astore 3
      // 14: astore 1
      // 15: bipush 0
      // 16: istore 4
      // 18: iload 4
      // 1a: aload 2
      // 1b: arraylength
      // 1c: if_icmpge 87
      // 1f: aload 0
      // 20: getfield org/v/hF.B Lorg/v/H_3;
      // 23: aload 2
      // 24: iload 4
      // 26: aaload
      // 27: getfield org/v/R9.Y Lorg/v/Nt_2;
      // 2a: invokestatic org/v/H_3.c (Lorg/v/H_3;Lorg/v/Nt_2;)Lorg/v/hd_2;
      // 2d: astore 5
      // 2f: aload 1
      // 30: ifnull 83
      // 33: iload 4
      // 35: aload 2
      // 36: arraylength
      // 37: bipush 1
      // 38: isub
      // 39: if_icmpne 7a
      // 3c: goto 43
      // 3f: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 0
      // 44: aload 1
      // 45: ifnull 6a
      // 48: goto 4f
      // 4b: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: getfield org/v/hF.K Lorg/v/NU;
      // 52: getfield org/v/NU.t Lorg/v/RJ;
      // 55: getfield org/v/RJ.v Z
      // 58: ifeq 7a
      // 5b: goto 62
      // 5e: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: aload 0
      // 63: goto 6a
      // 66: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: getfield org/v/hF.B Lorg/v/H_3;
      // 6d: invokestatic org/v/H_3.Q (Lorg/v/H_3;)Lorg/v/_L;
      // 70: aload 5
      // 72: invokestatic org/v/H_3.T (Lorg/v/q_4;)Lorg/v/hd_2;
      // 75: invokevirtual org/v/_L.h (Lorg/v/hd_2;)Lorg/v/hd_2;
      // 78: astore 5
      // 7a: aload 3
      // 7b: iload 4
      // 7d: aload 5
      // 7f: aastore
      // 80: iinc 4 1
      // 83: aload 1
      // 84: ifnonnull 18
      // 87: aload 3
      // 88: areturn
   }

   @Override
   public hd_2[] S() throws org.b_2 {
      hd_2[] var2 = new hd_2[this.K.g.length];
      String[] var10000 = RG.C();
      int var3 = 0;
      String[] var1 = var10000;

      while (true) {
         if (var3 < var2.length) {
            try {
               var5 = var2;
               if (var1 == null) {
                  break;
               }

               var2[var3] = H_3.c(this.B, this.K.g[var3]);
               var3++;
               if (var1 != null) {
                  continue;
               }
            } catch (org.b_2 var4) {
               throw a(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/lang/StringBuilder
      // 03: dup
      // 04: invokespecial java/lang/StringBuilder.<init> ()V
      // 07: aload 0
      // 08: getfield org/v/hF.K Lorg/v/NU;
      // 0b: invokevirtual org/v/NU.H ()Lorg/v/K_2;
      // 0e: invokeinterface org/v/K_2.R ()Ljava/lang/String; 1
      // 13: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16: sipush 24969
      // 19: ldc2_w 5220291137206845088
      // 1c: invokestatic org/v/hF.b (IJ)I
      // 1f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 22: astore 2
      // 23: aload 0
      // 24: getfield org/v/hF.K Lorg/v/NU;
      // 27: getfield org/v/NU.t Lorg/v/RJ;
      // 2a: getfield org/v/RJ.Q [Lorg/v/R9;
      // 2d: astore 3
      // 2e: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 31: bipush 0
      // 32: istore 4
      // 34: astore 1
      // 35: iload 4
      // 37: aload 3
      // 38: arraylength
      // 39: if_icmpge a1
      // 3c: iload 4
      // 3e: ifeq 56
      // 41: aload 2
      // 42: sipush 26905
      // 45: sipush -16459
      // 48: invokestatic org/v/hF.c (II)Ljava/lang/String;
      // 4b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e: pop
      // 4f: goto 56
      // 52: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 2
      // 57: aload 3
      // 58: iload 4
      // 5a: aaload
      // 5b: iload 4
      // 5d: aload 1
      // 5e: ifnull 80
      // 61: aload 3
      // 62: arraylength
      // 63: bipush 1
      // 64: isub
      // 65: if_icmpne 92
      // 68: goto 6f
      // 6b: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield org/v/hF.K Lorg/v/NU;
      // 73: getfield org/v/NU.t Lorg/v/RJ;
      // 76: getfield org/v/RJ.v Z
      // 79: goto 80
      // 7c: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: aload 1
      // 81: ifnull 8f
      // 84: ifeq 92
      // 87: goto 8e
      // 8a: invokestatic org/v/hF.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: bipush 1
      // 8f: goto 93
      // 92: bipush 0
      // 93: invokevirtual org/v/R9.H (Z)Ljava/lang/String;
      // 96: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 99: pop
      // 9a: iinc 4 1
      // 9d: aload 1
      // 9e: ifnonnull 35
      // a1: aload 2
      // a2: sipush 1785
      // a5: ldc2_w 1433829488425834961
      // a8: invokestatic org/v/hF.b (IJ)I
      // ab: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b1: areturn
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "\u0082¸p\u0097\u0002S{";
      int var12 = "\u0082¸p\u0097\u0002S{".length();
      char var9 = 4;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 116;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 116;
               var10006 = var14;
            } else {
               var23 = 116;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 116;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 72;
                     break;
                  case 1:
                     var41 = 98;
                     break;
                  case 2:
                     var41 = 7;
                     break;
                  case 3:
                     var41 = 95;
                     break;
                  case 4:
                     var41 = 52;
                     break;
                  case 5:
                     var41 = 99;
                     break;
                  default:
                     var41 = 97;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            c = var13;
            e = new String[2];
            long var0 = 8690814281310298807L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "Kòà w1\u001c?Ït\u0004hP~{O";
            int var5 = "Kòà w1\u001c?Ït\u0004hP~{O".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
                     ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L
                  )
                  ^ var0;
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            f = var6;
            h = new Integer[2];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }

   private static String c(int var0, int var1) {
      int var2 = (var0 ^ 26904) & 65535;
      if (e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 149;
               break;
            case 1:
               var10000 = 89;
               break;
            case 2:
               var10000 = 127;
               break;
            case 3:
               var10000 = 197;
               break;
            case 4:
               var10000 = 96;
               break;
            case 5:
               var10000 = 75;
               break;
            case 6:
               var10000 = 73;
               break;
            case 7:
               var10000 = 222;
               break;
            case 8:
               var10000 = 35;
               break;
            case 9:
               var10000 = 63;
               break;
            case 10:
               var10000 = 105;
               break;
            case 11:
               var10000 = 13;
               break;
            case 12:
               var10000 = 103;
               break;
            case 13:
               var10000 = 168;
               break;
            case 14:
               var10000 = 231;
               break;
            case 15:
               var10000 = 4;
               break;
            case 16:
               var10000 = 122;
               break;
            case 17:
               var10000 = 95;
               break;
            case 18:
               var10000 = 94;
               break;
            case 19:
               var10000 = 37;
               break;
            case 20:
               var10000 = 213;
               break;
            case 21:
               var10000 = 247;
               break;
            case 22:
               var10000 = 123;
               break;
            case 23:
               var10000 = 8;
               break;
            case 24:
               var10000 = 69;
               break;
            case 25:
               var10000 = 23;
               break;
            case 26:
               var10000 = 210;
               break;
            case 27:
               var10000 = 104;
               break;
            case 28:
               var10000 = 80;
               break;
            case 29:
               var10000 = 237;
               break;
            case 30:
               var10000 = 107;
               break;
            case 31:
               var10000 = 84;
               break;
            case 32:
               var10000 = 18;
               break;
            case 33:
               var10000 = 204;
               break;
            case 34:
               var10000 = 160;
               break;
            case 35:
               var10000 = 44;
               break;
            case 36:
               var10000 = 190;
               break;
            case 37:
               var10000 = 146;
               break;
            case 38:
               var10000 = 85;
               break;
            case 39:
               var10000 = 136;
               break;
            case 40:
               var10000 = 78;
               break;
            case 41:
               var10000 = 125;
               break;
            case 42:
               var10000 = 129;
               break;
            case 43:
               var10000 = 130;
               break;
            case 44:
               var10000 = 246;
               break;
            case 45:
               var10000 = 196;
               break;
            case 46:
               var10000 = 74;
               break;
            case 47:
               var10000 = 212;
               break;
            case 48:
               var10000 = 170;
               break;
            case 49:
               var10000 = 206;
               break;
            case 50:
               var10000 = 167;
               break;
            case 51:
               var10000 = 25;
               break;
            case 52:
               var10000 = 137;
               break;
            case 53:
               var10000 = 106;
               break;
            case 54:
               var10000 = 226;
               break;
            case 55:
               var10000 = 50;
               break;
            case 56:
               var10000 = 185;
               break;
            case 57:
               var10000 = 252;
               break;
            case 58:
               var10000 = 215;
               break;
            case 59:
               var10000 = 238;
               break;
            case 60:
               var10000 = 41;
               break;
            case 61:
               var10000 = 140;
               break;
            case 62:
               var10000 = 175;
               break;
            case 63:
               var10000 = 88;
               break;
            case 64:
               var10000 = 152;
               break;
            case 65:
               var10000 = 214;
               break;
            case 66:
               var10000 = 110;
               break;
            case 67:
               var10000 = 208;
               break;
            case 68:
               var10000 = 91;
               break;
            case 69:
               var10000 = 66;
               break;
            case 70:
               var10000 = 154;
               break;
            case 71:
               var10000 = 145;
               break;
            case 72:
               var10000 = 243;
               break;
            case 73:
               var10000 = 209;
               break;
            case 74:
               var10000 = 240;
               break;
            case 75:
               var10000 = 202;
               break;
            case 76:
               var10000 = 60;
               break;
            case 77:
               var10000 = 176;
               break;
            case 78:
               var10000 = 203;
               break;
            case 79:
               var10000 = 72;
               break;
            case 80:
               var10000 = 119;
               break;
            case 81:
               var10000 = 68;
               break;
            case 82:
               var10000 = 14;
               break;
            case 83:
               var10000 = 159;
               break;
            case 84:
               var10000 = 40;
               break;
            case 85:
               var10000 = 218;
               break;
            case 86:
               var10000 = 34;
               break;
            case 87:
               var10000 = 199;
               break;
            case 88:
               var10000 = 181;
               break;
            case 89:
               var10000 = 193;
               break;
            case 90:
               var10000 = 97;
               break;
            case 91:
               var10000 = 254;
               break;
            case 92:
               var10000 = 141;
               break;
            case 93:
               var10000 = 27;
               break;
            case 94:
               var10000 = 22;
               break;
            case 95:
               var10000 = 9;
               break;
            case 96:
               var10000 = 227;
               break;
            case 97:
               var10000 = 102;
               break;
            case 98:
               var10000 = 49;
               break;
            case 99:
               var10000 = 183;
               break;
            case 100:
               var10000 = 90;
               break;
            case 101:
               var10000 = 180;
               break;
            case 102:
               var10000 = 139;
               break;
            case 103:
               var10000 = 10;
               break;
            case 104:
               var10000 = 111;
               break;
            case 105:
               var10000 = 223;
               break;
            case 106:
               var10000 = 157;
               break;
            case 107:
               var10000 = 188;
               break;
            case 108:
               var10000 = 108;
               break;
            case 109:
               var10000 = 245;
               break;
            case 110:
               var10000 = 33;
               break;
            case 111:
               var10000 = 114;
               break;
            case 112:
               var10000 = 15;
               break;
            case 113:
               var10000 = 55;
               break;
            case 114:
               var10000 = 138;
               break;
            case 115:
               var10000 = 52;
               break;
            case 116:
               var10000 = 148;
               break;
            case 117:
               var10000 = 31;
               break;
            case 118:
               var10000 = 83;
               break;
            case 119:
               var10000 = 201;
               break;
            case 120:
               var10000 = 21;
               break;
            case 121:
               var10000 = 48;
               break;
            case 122:
               var10000 = 229;
               break;
            case 123:
               var10000 = 77;
               break;
            case 124:
               var10000 = 151;
               break;
            case 125:
               var10000 = 228;
               break;
            case 126:
               var10000 = 224;
               break;
            case 127:
               var10000 = 230;
               break;
            case 128:
               var10000 = 134;
               break;
            case 129:
               var10000 = 162;
               break;
            case 130:
               var10000 = 133;
               break;
            case 131:
               var10000 = 161;
               break;
            case 132:
               var10000 = 56;
               break;
            case 133:
               var10000 = 5;
               break;
            case 134:
               var10000 = 6;
               break;
            case 135:
               var10000 = 169;
               break;
            case 136:
               var10000 = 242;
               break;
            case 137:
               var10000 = 200;
               break;
            case 138:
               var10000 = 182;
               break;
            case 139:
               var10000 = 142;
               break;
            case 140:
               var10000 = 117;
               break;
            case 141:
               var10000 = 118;
               break;
            case 142:
               var10000 = 244;
               break;
            case 143:
               var10000 = 150;
               break;
            case 144:
               var10000 = 135;
               break;
            case 145:
               var10000 = 76;
               break;
            case 146:
               var10000 = 171;
               break;
            case 147:
               var10000 = 112;
               break;
            case 148:
               var10000 = 36;
               break;
            case 149:
               var10000 = 234;
               break;
            case 150:
               var10000 = 28;
               break;
            case 151:
               var10000 = 16;
               break;
            case 152:
               var10000 = 219;
               break;
            case 153:
               var10000 = 173;
               break;
            case 154:
               var10000 = 205;
               break;
            case 155:
               var10000 = 7;
               break;
            case 156:
               var10000 = 253;
               break;
            case 157:
               var10000 = 59;
               break;
            case 158:
               var10000 = 255;
               break;
            case 159:
               var10000 = 153;
               break;
            case 160:
               var10000 = 57;
               break;
            case 161:
               var10000 = 3;
               break;
            case 162:
               var10000 = 248;
               break;
            case 163:
               var10000 = 79;
               break;
            case 164:
               var10000 = 100;
               break;
            case 165:
               var10000 = 62;
               break;
            case 166:
               var10000 = 109;
               break;
            case 167:
               var10000 = 64;
               break;
            case 168:
               var10000 = 46;
               break;
            case 169:
               var10000 = 126;
               break;
            case 170:
               var10000 = 192;
               break;
            case 171:
               var10000 = 81;
               break;
            case 172:
               var10000 = 67;
               break;
            case 173:
               var10000 = 65;
               break;
            case 174:
               var10000 = 124;
               break;
            case 175:
               var10000 = 147;
               break;
            case 176:
               var10000 = 128;
               break;
            case 177:
               var10000 = 174;
               break;
            case 178:
               var10000 = 236;
               break;
            case 179:
               var10000 = 87;
               break;
            case 180:
               var10000 = 158;
               break;
            case 181:
               var10000 = 249;
               break;
            case 182:
               var10000 = 187;
               break;
            case 183:
               var10000 = 172;
               break;
            case 184:
               var10000 = 61;
               break;
            case 185:
               var10000 = 11;
               break;
            case 186:
               var10000 = 221;
               break;
            case 187:
               var10000 = 26;
               break;
            case 188:
               var10000 = 239;
               break;
            case 189:
               var10000 = 86;
               break;
            case 190:
               var10000 = 241;
               break;
            case 191:
               var10000 = 251;
               break;
            case 192:
               var10000 = 184;
               break;
            case 193:
               var10000 = 156;
               break;
            case 194:
               var10000 = 144;
               break;
            case 195:
               var10000 = 194;
               break;
            case 196:
               var10000 = 115;
               break;
            case 197:
               var10000 = 58;
               break;
            case 198:
               var10000 = 54;
               break;
            case 199:
               var10000 = 1;
               break;
            case 200:
               var10000 = 121;
               break;
            case 201:
               var10000 = 38;
               break;
            case 202:
               var10000 = 120;
               break;
            case 203:
               var10000 = 42;
               break;
            case 204:
               var10000 = 198;
               break;
            case 205:
               var10000 = 216;
               break;
            case 206:
               var10000 = 220;
               break;
            case 207:
               var10000 = 235;
               break;
            case 208:
               var10000 = 177;
               break;
            case 209:
               var10000 = 93;
               break;
            case 210:
               var10000 = 132;
               break;
            case 211:
               var10000 = 143;
               break;
            case 212:
               var10000 = 43;
               break;
            case 213:
               var10000 = 211;
               break;
            case 214:
               var10000 = 92;
               break;
            case 215:
               var10000 = 195;
               break;
            case 216:
               var10000 = 45;
               break;
            case 217:
               var10000 = 70;
               break;
            case 218:
               var10000 = 2;
               break;
            case 219:
               var10000 = 113;
               break;
            case 220:
               var10000 = 0;
               break;
            case 221:
               var10000 = 71;
               break;
            case 222:
               var10000 = 39;
               break;
            case 223:
               var10000 = 29;
               break;
            case 224:
               var10000 = 166;
               break;
            case 225:
               var10000 = 232;
               break;
            case 226:
               var10000 = 217;
               break;
            case 227:
               var10000 = 165;
               break;
            case 228:
               var10000 = 131;
               break;
            case 229:
               var10000 = 178;
               break;
            case 230:
               var10000 = 233;
               break;
            case 231:
               var10000 = 101;
               break;
            case 232:
               var10000 = 30;
               break;
            case 233:
               var10000 = 53;
               break;
            case 234:
               var10000 = 98;
               break;
            case 235:
               var10000 = 155;
               break;
            case 236:
               var10000 = 47;
               break;
            case 237:
               var10000 = 17;
               break;
            case 238:
               var10000 = 207;
               break;
            case 239:
               var10000 = 32;
               break;
            case 240:
               var10000 = 12;
               break;
            case 241:
               var10000 = 116;
               break;
            case 242:
               var10000 = 179;
               break;
            case 243:
               var10000 = 163;
               break;
            case 244:
               var10000 = 164;
               break;
            case 245:
               var10000 = 20;
               break;
            case 246:
               var10000 = 24;
               break;
            case 247:
               var10000 = 189;
               break;
            case 248:
               var10000 = 99;
               break;
            case 249:
               var10000 = 19;
               break;
            case 250:
               var10000 = 51;
               break;
            case 251:
               var10000 = 186;
               break;
            case 252:
               var10000 = 250;
               break;
            case 253:
               var10000 = 225;
               break;
            case 254:
               var10000 = 191;
               break;
            default:
               var10000 = 82;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7977;
      if (h[var3] == null) {
         h[var3] = (int)(f[var3] ^ var1);
      }

      return h[var3];
   }
}





