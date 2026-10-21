package com.finalshell.core;

import com.finalshell.ui.model.Ks2_2;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Ph4 implements Xd4 {
   public static ConcurrentMap s;
   public final String V;
   public A0_2[] K;
   public boolean i;
   public En2 F;
   public IG w;
   public boolean T;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;
   public static long[] e;
   public static Long[] f;

   public Ph4(String var1) {
      this(var1, En2.p(), IG.G(), true);
   }

   public Ph4(String var1, boolean var2) {
      this(var1, En2.p(), IG.G(), var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public Ph4(String var1, En2 var2, IG var3, boolean var4) {
   super();
      String var10000 = Hi2.C();
      String var5 = var10000;

      label41: {
         label33: {
            label32: {
               try {
                  var10000 = var1;
                  if (var5 != null) {
                     break label32;
                  }

                  if (var1 == null) {
                     break label33;
                  }
               } catch (Hf2 var8) {
                  throw a(var8);
               }

               var10000 = var1;
            }

            try {
               if (var10000.length() != 0) {
                  break label41;
               }
            } catch (Hf2 var7) {
               boolean var10001 = false;
               throw a(var7);
            }
         }

         try {
            throw new Hf2(a(2743, -17262));
         } catch (Hf2 var6) {
            boolean var11 = false;
            throw a(var6);
         }
      }

      this.V = var1;
      this.F = var2;
      this.w = var3;
      this.T = var4;
   }

   public void x() {
      String var1 = Hi2.C();

      try {
         if (this.K != null) {
            return;
         }
      } catch (Hf2 var3) {
         throw a(var3);
      }

      try {
         if ("*".equals(this.V)) {
            this.K = new A0_2[]{C_o_2.O};
            if (var1 == null) {
               return;
            }
         }
      } catch (Hf2 var4) {
         throw a(var4);
      }

      S9 var2 = new S9(this.V);
      this.K = var2.S();
      this.i = S9.Y(var2);
   }

   public boolean X() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/core/Ph4.x ()V
      // 08: bipush 0
      // 09: istore 2
      // 0a: iload 2
      // 0b: aload 0
      // 0c: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 0f: arraylength
      // 10: if_icmpge 54
      // 13: aload 0
      // 14: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 17: iload 2
      // 18: aaload
      // 19: astore 3
      // 1a: aload 3
      // 1b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1e: astore 4
      // 20: aload 1
      // 21: ifnonnull 50
      // 24: aload 4
      // 26: ldc com/finalshell/core/DX
      // 28: if_acmpeq 4d
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 4
      // 34: ldc com/finalshell/core/W3_2
      // 36: if_acmpne 4b
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 1
      // 41: ifnull 4d
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
      // 4d: iinc 2 1
      // 50: aload 1
      // 51: ifnull 0a
      // 54: bipush 1
      // 55: ireturn
      // 56: astore 2
      // 57: bipush 0
      // 58: ireturn
   }

   public Object S(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1e
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual com/finalshell/core/Ph4.x ()V
      // 1d: aload 1
      // 1e: astore 3
      // 1f: bipush 0
      // 20: istore 4
      // 22: iload 4
      // 24: aload 0
      // 25: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 28: arraylength
      // 29: if_icmpge 4b
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 30: iload 4
      // 32: aaload
      // 33: astore 5
      // 35: aload 5
      // 37: aload 0
      // 38: aload 1
      // 39: aload 3
      // 3a: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 3f: aload 2
      // 40: ifnonnull 4c
      // 43: astore 3
      // 44: iinc 4 1
      // 47: aload 2
      // 48: ifnull 22
      // 4b: aload 3
      // 4c: areturn
   }

   public Object L(Object var1, Type var2, IG var3) {
      Object var4 = this.S(var1);
      return B8_2.I(var4, var2, var3);
   }

   public Object F(Object var1, Type var2) {
      return this.L(var1, var2, IG.G());
   }

   public Object e(Yn4 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 2
      // 005: ifnonnull 01d
      // 008: aload 1
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: invokevirtual com/finalshell/core/Ph4.x ()V
      // 01d: aload 0
      // 01e: getfield com/finalshell/core/Ph4.i Z
      // 021: aload 2
      // 022: ifnonnull 04a
      // 025: ifeq 03a
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 1
      // 030: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 033: astore 3
      // 034: aload 0
      // 035: aload 3
      // 036: invokevirtual com/finalshell/core/Ph4.S (Ljava/lang/Object;)Ljava/lang/Object;
      // 039: areturn
      // 03a: aload 0
      // 03b: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 03e: aload 2
      // 03f: ifnonnull 05a
      // 042: arraylength
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: ifne 056
      // 04d: aload 1
      // 04e: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 051: areturn
      // 052: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 0
      // 057: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 05a: aload 0
      // 05b: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 05e: arraylength
      // 05f: bipush 1
      // 060: isub
      // 061: aaload
      // 062: astore 3
      // 063: aload 3
      // 064: aload 2
      // 065: ifnonnull 0b6
      // 068: instanceof com/finalshell/core/Fn2_2
      // 06b: ifne 0a7
      // 06e: goto 075
      // 071: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: aload 3
      // 076: aload 2
      // 077: ifnonnull 0b6
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: instanceof com/finalshell/core/ZC
      // 084: ifne 0a7
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 3
      // 08f: aload 2
      // 090: ifnonnull 0b6
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: instanceof com/finalshell/core/Ad2_2
      // 09d: ifeq 0b7
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: aload 1
      // 0a9: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 0ac: invokevirtual com/finalshell/core/Ph4.S (Ljava/lang/Object;)Ljava/lang/Object;
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: areturn
      // 0b7: aconst_null
      // 0b8: astore 4
      // 0ba: bipush 0
      // 0bb: istore 5
      // 0bd: iload 5
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 0c3: arraylength
      // 0c4: if_icmpge 307
      // 0c7: aload 0
      // 0c8: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 0cb: iload 5
      // 0cd: aaload
      // 0ce: aload 2
      // 0cf: ifnonnull 30c
      // 0d2: astore 6
      // 0d4: iload 5
      // 0d6: aload 2
      // 0d7: ifnonnull 0f3
      // 0da: aload 0
      // 0db: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 0de: arraylength
      // 0df: bipush 1
      // 0e0: isub
      // 0e1: if_icmpne 0f6
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: bipush 1
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: goto 0f7
      // 0f6: bipush 0
      // 0f7: istore 7
      // 0f9: aload 4
      // 0fb: aload 2
      // 0fc: ifnonnull 120
      // 0ff: ifnull 13a
      // 102: goto 109
      // 105: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: aload 4
      // 10b: aload 2
      // 10c: ifnonnull 125
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: ifnull 13a
      // 123: aload 4
      // 125: aload 6
      // 127: aload 0
      // 128: aconst_null
      // 129: aload 4
      // 12b: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 12e: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 133: putfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 136: aload 2
      // 137: ifnull 300
      // 13a: iload 7
      // 13c: aload 2
      // 13d: ifnonnull 2e6
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: ifne 2de
      // 14a: goto 151
      // 14d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: aload 0
      // 152: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 155: iload 5
      // 157: bipush 1
      // 158: iadd
      // 159: aaload
      // 15a: astore 9
      // 15c: aload 6
      // 15e: instanceof com/finalshell/core/W3_2
      // 161: aload 2
      // 162: ifnonnull 23b
      // 165: ifeq 22f
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: aload 6
      // 171: checkcast com/finalshell/core/W3_2
      // 174: invokestatic com/finalshell/core/W3_2.Z (Lcom/finalshell/core/W3_2;)Z
      // 177: aload 2
      // 178: ifnonnull 23b
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: ifeq 22f
      // 185: goto 18c
      // 188: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: aload 9
      // 18e: instanceof com/finalshell/core/DX
      // 191: aload 2
      // 192: ifnonnull 229
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: ifne 228
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: aload 9
      // 1a8: instanceof com/finalshell/core/Ad2_2
      // 1ab: aload 2
      // 1ac: ifnonnull 229
      // 1af: goto 1b6
      // 1b2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: ifne 228
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: aload 9
      // 1c2: instanceof com/finalshell/core/Nz4
      // 1c5: aload 2
      // 1c6: ifnonnull 229
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: ifne 228
      // 1d3: goto 1da
      // 1d6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d9: athrow
      // 1da: aload 9
      // 1dc: instanceof com/finalshell/core/H5
      // 1df: aload 2
      // 1e0: ifnonnull 229
      // 1e3: goto 1ea
      // 1e6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9: athrow
      // 1ea: ifne 228
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: aload 9
      // 1f6: instanceof com/finalshell/core/W3_2
      // 1f9: aload 2
      // 1fa: ifnonnull 229
      // 1fd: goto 204
      // 200: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 203: athrow
      // 204: ifne 228
      // 207: goto 20e
      // 20a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: aload 9
      // 210: instanceof com/finalshell/core/LQ_2
      // 213: aload 2
      // 214: ifnonnull 23b
      // 217: goto 21e
      // 21a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: ifeq 22f
      // 221: goto 228
      // 224: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: bipush 1
      // 229: istore 8
      // 22b: aload 2
      // 22c: ifnull 2da
      // 22f: aload 9
      // 231: instanceof com/finalshell/core/DX
      // 234: goto 23b
      // 237: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23a: athrow
      // 23b: aload 2
      // 23c: ifnonnull 279
      // 23f: ifeq 26d
      // 242: goto 249
      // 245: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 248: athrow
      // 249: aload 9
      // 24b: checkcast com/finalshell/core/DX
      // 24e: invokestatic com/finalshell/core/DX.n (Lcom/finalshell/core/DX;)I
      // 251: aload 2
      // 252: ifnonnull 279
      // 255: goto 25c
      // 258: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25b: athrow
      // 25c: ifge 26d
      // 25f: goto 266
      // 262: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: bipush 1
      // 267: istore 8
      // 269: aload 2
      // 26a: ifnull 2da
      // 26d: aload 9
      // 26f: instanceof com/finalshell/core/LQ_2
      // 272: goto 279
      // 275: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 278: athrow
      // 279: aload 2
      // 27a: ifnonnull 29a
      // 27d: ifeq 28e
      // 280: goto 287
      // 283: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 286: athrow
      // 287: bipush 1
      // 288: istore 8
      // 28a: aload 2
      // 28b: ifnull 2da
      // 28e: aload 6
      // 290: instanceof com/finalshell/core/C_o_2
      // 293: goto 29a
      // 296: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 299: athrow
      // 29a: aload 2
      // 29b: ifnonnull 2bb
      // 29e: ifeq 2af
      // 2a1: goto 2a8
      // 2a4: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: bipush 1
      // 2a9: istore 8
      // 2ab: aload 2
      // 2ac: ifnull 2da
      // 2af: aload 6
      // 2b1: instanceof com/finalshell/core/Ad2_2
      // 2b4: goto 2bb
      // 2b7: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ba: athrow
      // 2bb: aload 2
      // 2bc: ifnonnull 2d8
      // 2bf: ifeq 2d0
      // 2c2: goto 2c9
      // 2c5: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c8: athrow
      // 2c9: bipush 1
      // 2ca: istore 8
      // 2cc: aload 2
      // 2cd: ifnull 2da
      // 2d0: bipush 0
      // 2d1: goto 2d8
      // 2d4: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d7: athrow
      // 2d8: istore 8
      // 2da: aload 2
      // 2db: ifnull 2e8
      // 2de: bipush 1
      // 2df: goto 2e6
      // 2e2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e5: athrow
      // 2e6: istore 8
      // 2e8: new com/finalshell/core/KE
      // 2eb: dup
      // 2ec: aload 4
      // 2ee: iload 8
      // 2f0: invokespecial com/finalshell/core/KE.<init> (Lcom/finalshell/core/KE;Z)V
      // 2f3: astore 4
      // 2f5: aload 6
      // 2f7: aload 0
      // 2f8: aload 1
      // 2f9: aload 4
      // 2fb: invokeinterface com/finalshell/core/A0_2.Z (Lcom/finalshell/core/Ph4;Lcom/finalshell/core/Yn4;Lcom/finalshell/core/KE;)V 4
      // 300: iinc 5 1
      // 303: aload 2
      // 304: ifnull 0bd
      // 307: aload 4
      // 309: getfield com/finalshell/core/KE.t Ljava/lang/Object;
      // 30c: areturn
   }

   public boolean V(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1e
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual com/finalshell/core/Ph4.x ()V
      // 1d: aload 1
      // 1e: astore 3
      // 1f: bipush 0
      // 20: istore 4
      // 22: iload 4
      // 24: aload 0
      // 25: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 28: arraylength
      // 29: if_icmpge 9a
      // 2c: aload 3
      // 2d: astore 5
      // 2f: aload 0
      // 30: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 33: iload 4
      // 35: aaload
      // 36: aload 0
      // 37: aload 1
      // 38: aload 3
      // 39: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 3e: astore 3
      // 3f: aload 3
      // 40: aload 2
      // 41: ifnonnull 55
      // 44: ifnonnull 54
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
      // 50: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 3
      // 55: aload 2
      // 56: ifnonnull 6f
      // 59: getstatic java/util/Collections.EMPTY_LIST Ljava/util/List;
      // 5c: if_acmpne 93
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 5
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: instanceof java/util/List
      // 72: aload 2
      // 73: ifnonnull 92
      // 76: ifeq 93
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: aload 5
      // 82: checkcast java/util/List
      // 85: aload 3
      // 86: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: ireturn
      // 93: iinc 4 1
      // 96: aload 2
      // 97: ifnull 22
      // 9a: bipush 1
      // 9b: ireturn
   }

   public boolean D(Object param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual com/finalshell/core/Ph4.S (Ljava/lang/Object;)Ljava/lang/Object;
      // 08: astore 4
      // 0a: astore 3
      // 0b: aload 4
      // 0d: aload 3
      // 0e: ifnonnull 24
      // 11: aload 2
      // 12: if_acmpne 22
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: ireturn
      // 1e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 4
      // 24: aload 3
      // 25: ifnonnull 3a
      // 28: ifnonnull 38
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aload 4
      // 3a: instanceof java/lang/Iterable
      // 3d: aload 3
      // 3e: ifnonnull 97
      // 41: ifeq 91
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: aload 4
      // 4d: checkcast java/lang/Iterable
      // 50: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 55: astore 5
      // 57: aload 5
      // 59: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5e: ifeq 8f
      // 61: aload 5
      // 63: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 68: astore 6
      // 6a: aload 6
      // 6c: aload 2
      // 6d: invokestatic com/finalshell/core/Ph4.m (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 70: aload 3
      // 71: ifnonnull 90
      // 74: aload 3
      // 75: ifnonnull 8a
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: ifeq 8b
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: bipush 1
      // 8a: ireturn
      // 8b: aload 3
      // 8c: ifnull 57
      // 8f: bipush 0
      // 90: ireturn
      // 91: aload 4
      // 93: aload 2
      // 94: invokestatic com/finalshell/core/Ph4.m (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 97: ireturn
   }

   public int j(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1e
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: bipush -1
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual com/finalshell/core/Ph4.x ()V
      // 1d: aload 1
      // 1e: astore 3
      // 1f: bipush 0
      // 20: istore 4
      // 22: iload 4
      // 24: aload 0
      // 25: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 28: arraylength
      // 29: if_icmpge 47
      // 2c: aload 0
      // 2d: aload 2
      // 2e: ifnonnull 48
      // 31: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 34: iload 4
      // 36: aaload
      // 37: aload 0
      // 38: aload 1
      // 39: aload 3
      // 3a: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 3f: astore 3
      // 40: iinc 4 1
      // 43: aload 2
      // 44: ifnull 22
      // 47: aload 0
      // 48: aload 3
      // 49: invokevirtual com/finalshell/core/Ph4.T (Ljava/lang/Object;)I
      // 4c: ireturn
   }

   public Set u(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1e
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual com/finalshell/core/Ph4.x ()V
      // 1d: aload 1
      // 1e: astore 3
      // 1f: bipush 0
      // 20: istore 4
      // 22: iload 4
      // 24: aload 0
      // 25: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 28: arraylength
      // 29: if_icmpge 47
      // 2c: aload 0
      // 2d: aload 2
      // 2e: ifnonnull 48
      // 31: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 34: iload 4
      // 36: aaload
      // 37: aload 0
      // 38: aload 1
      // 39: aload 3
      // 3a: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 3f: astore 3
      // 40: iinc 4 1
      // 43: aload 2
      // 44: ifnull 22
      // 47: aload 0
      // 48: aload 3
      // 49: invokevirtual com/finalshell/core/Ph4.K (Ljava/lang/Object;)Ljava/util/Set;
      // 4c: areturn
   }

   public void H(Object param1, Object param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnonnull 01b
      // 00b: ifnonnull 016
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: return
      // 016: aload 0
      // 017: invokevirtual com/finalshell/core/Ph4.x ()V
      // 01a: aload 1
      // 01b: astore 5
      // 01d: aconst_null
      // 01e: astore 6
      // 020: bipush 0
      // 021: istore 7
      // 023: iload 7
      // 025: aload 0
      // 026: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 029: arraylength
      // 02a: if_icmpge 0b0
      // 02d: aload 5
      // 02f: astore 6
      // 031: aload 0
      // 032: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 035: iload 7
      // 037: aaload
      // 038: astore 8
      // 03a: aload 8
      // 03c: aload 0
      // 03d: aload 1
      // 03e: aload 5
      // 040: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 045: astore 5
      // 047: aload 4
      // 049: ifnonnull 0ab
      // 04c: aload 5
      // 04e: aload 4
      // 050: ifnonnull 0b2
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: ifnonnull 0a8
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: iload 7
      // 066: aload 4
      // 068: ifnonnull 08f
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: aload 0
      // 073: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 076: arraylength
      // 077: bipush 1
      // 078: isub
      // 079: if_icmpeq 0a8
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: aload 8
      // 085: instanceof com/finalshell/core/W3_2
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: ifeq 0a8
      // 092: new com/finalshell/ui/model/O0
      // 095: dup
      // 096: invokespecial com/finalshell/ui/model/O0.<init> ()V
      // 099: astore 5
      // 09b: aload 8
      // 09d: checkcast com/finalshell/core/W3_2
      // 0a0: aload 0
      // 0a1: aload 6
      // 0a3: aload 5
      // 0a5: invokevirtual com/finalshell/core/W3_2.M (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)V
      // 0a8: iinc 7 1
      // 0ab: aload 4
      // 0ad: ifnull 023
      // 0b0: aload 5
      // 0b2: astore 7
      // 0b4: iload 3
      // 0b5: aload 4
      // 0b7: ifnonnull 0dc
      // 0ba: ifne 0f0
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aload 7
      // 0c6: aload 4
      // 0c8: ifnonnull 0f2
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: instanceof java/util/Collection
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: ifeq 0f0
      // 0df: aload 7
      // 0e1: checkcast java/util/Collection
      // 0e4: astore 8
      // 0e6: aload 8
      // 0e8: aload 2
      // 0e9: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0ee: pop
      // 0ef: return
      // 0f0: aload 7
      // 0f2: aload 4
      // 0f4: ifnonnull 1b2
      // 0f7: ifnull 1aa
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: iload 3
      // 102: ifne 1aa
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: aload 7
      // 10e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 111: astore 9
      // 113: aload 9
      // 115: invokevirtual java/lang/Class.isArray ()Z
      // 118: aload 4
      // 11a: ifnonnull 173
      // 11d: ifeq 158
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aload 7
      // 129: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 12c: istore 10
      // 12e: aload 9
      // 130: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 133: iload 10
      // 135: bipush 1
      // 136: iadd
      // 137: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 13a: astore 11
      // 13c: aload 7
      // 13e: bipush 0
      // 13f: aload 11
      // 141: bipush 0
      // 142: iload 10
      // 144: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 147: aload 11
      // 149: iload 10
      // 14b: aload 2
      // 14c: invokestatic java/lang/reflect/Array.set (Ljava/lang/Object;ILjava/lang/Object;)V
      // 14f: aload 11
      // 151: astore 8
      // 153: aload 4
      // 155: ifnull 1a5
      // 158: ldc_w java/util/Map
      // 15b: aload 4
      // 15d: ifnonnull 177
      // 160: goto 167
      // 163: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: aload 9
      // 169: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: ifeq 17e
      // 176: aload 2
      // 177: astore 8
      // 179: aload 4
      // 17b: ifnull 1a5
      // 17e: new com/finalshell/core/Hi2
      // 181: dup
      // 182: new java/lang/StringBuilder
      // 185: dup
      // 186: invokespecial java/lang/StringBuilder.<init> ()V
      // 189: sipush 2750
      // 18c: sipush 11111
      // 18f: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 192: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 195: aload 9
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 19a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19d: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1a0: athrow
      // 1a1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: aload 4
      // 1a7: ifnull 1b4
      // 1aa: aload 2
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b1: athrow
      // 1b2: astore 8
      // 1b4: aload 0
      // 1b5: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 1b8: aload 0
      // 1b9: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 1bc: arraylength
      // 1bd: bipush 1
      // 1be: isub
      // 1bf: aaload
      // 1c0: astore 9
      // 1c2: aload 9
      // 1c4: instanceof com/finalshell/core/W3_2
      // 1c7: aload 4
      // 1c9: ifnonnull 1ed
      // 1cc: ifeq 1e8
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: aload 9
      // 1d8: checkcast com/finalshell/core/W3_2
      // 1db: astore 10
      // 1dd: aload 10
      // 1df: aload 0
      // 1e0: aload 6
      // 1e2: aload 8
      // 1e4: invokevirtual com/finalshell/core/W3_2.M (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)V
      // 1e7: return
      // 1e8: aload 9
      // 1ea: instanceof com/finalshell/core/DX
      // 1ed: aload 4
      // 1ef: ifnonnull 210
      // 1f2: ifeq 212
      // 1f5: goto 1fc
      // 1f8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fb: athrow
      // 1fc: aload 9
      // 1fe: checkcast com/finalshell/core/DX
      // 201: aload 0
      // 202: aload 6
      // 204: aload 8
      // 206: invokevirtual com/finalshell/core/DX.a (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 209: goto 210
      // 20c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20f: athrow
      // 210: pop
      // 211: return
      // 212: new java/lang/UnsupportedOperationException
      // 215: dup
      // 216: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 219: athrow
   }

   public void v(Object param1, Object[] param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 2
      // 005: aload 3
      // 006: ifnonnull 014
      // 009: ifnull 023
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aload 2
      // 014: aload 3
      // 015: ifnonnull 029
      // 018: arraylength
      // 019: ifne 028
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: return
      // 024: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: aload 1
      // 029: aload 3
      // 02a: ifnonnull 03d
      // 02d: ifnonnull 038
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: return
      // 038: aload 0
      // 039: invokevirtual com/finalshell/core/Ph4.x ()V
      // 03c: aload 1
      // 03d: astore 4
      // 03f: aconst_null
      // 040: astore 5
      // 042: bipush 0
      // 043: istore 6
      // 045: iload 6
      // 047: aload 0
      // 048: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 04b: arraylength
      // 04c: if_icmpge 078
      // 04f: iload 6
      // 051: aload 0
      // 052: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 055: arraylength
      // 056: bipush 1
      // 057: isub
      // 058: if_icmpne 05f
      // 05b: aload 4
      // 05d: astore 5
      // 05f: aload 0
      // 060: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 063: iload 6
      // 065: aaload
      // 066: aload 0
      // 067: aload 1
      // 068: aload 4
      // 06a: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 06f: astore 4
      // 071: iinc 6 1
      // 074: aload 3
      // 075: ifnull 045
      // 078: aload 4
      // 07a: astore 6
      // 07c: aload 6
      // 07e: aload 3
      // 07f: ifnonnull 0b7
      // 082: ifnonnull 0b5
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: new com/finalshell/core/Hf2
      // 08f: dup
      // 090: new java/lang/StringBuilder
      // 093: dup
      // 094: invokespecial java/lang/StringBuilder.<init> ()V
      // 097: sipush 2746
      // 09a: sipush -9506
      // 09d: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 0a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a3: aload 0
      // 0a4: getfield com/finalshell/core/Ph4.V Ljava/lang/String;
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ad: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;)V
      // 0b0: athrow
      // 0b1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: aload 6
      // 0b7: aload 3
      // 0b8: ifnonnull 0fc
      // 0bb: instanceof java/util/Collection
      // 0be: ifeq 0fa
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: aload 6
      // 0ca: checkcast java/util/Collection
      // 0cd: astore 7
      // 0cf: aload 2
      // 0d0: astore 8
      // 0d2: aload 8
      // 0d4: arraylength
      // 0d5: istore 9
      // 0d7: bipush 0
      // 0d8: istore 10
      // 0da: iload 10
      // 0dc: iload 9
      // 0de: if_icmpge 0f9
      // 0e1: aload 8
      // 0e3: iload 10
      // 0e5: aaload
      // 0e6: astore 11
      // 0e8: aload 7
      // 0ea: aload 11
      // 0ec: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0f1: pop
      // 0f2: iinc 10 1
      // 0f5: aload 3
      // 0f6: ifnull 0da
      // 0f9: return
      // 0fa: aload 6
      // 0fc: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0ff: astore 7
      // 101: aload 7
      // 103: invokevirtual java/lang/Class.isArray ()Z
      // 106: aload 3
      // 107: ifnonnull 120
      // 10a: ifeq 16e
      // 10d: goto 114
      // 110: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: aload 6
      // 116: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: istore 9
      // 122: aload 7
      // 124: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 127: iload 9
      // 129: aload 2
      // 12a: arraylength
      // 12b: iadd
      // 12c: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 12f: astore 10
      // 131: aload 6
      // 133: bipush 0
      // 134: aload 10
      // 136: bipush 0
      // 137: iload 9
      // 139: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 13c: bipush 0
      // 13d: istore 11
      // 13f: iload 11
      // 141: aload 2
      // 142: arraylength
      // 143: if_icmpge 166
      // 146: aload 10
      // 148: aload 3
      // 149: ifnonnull 168
      // 14c: iload 9
      // 14e: iload 11
      // 150: iadd
      // 151: aload 2
      // 152: iload 11
      // 154: aaload
      // 155: invokestatic java/lang/reflect/Array.set (Ljava/lang/Object;ILjava/lang/Object;)V
      // 158: iinc 11 1
      // 15b: aload 3
      // 15c: ifnull 13f
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: aload 10
      // 168: astore 8
      // 16a: aload 3
      // 16b: ifnull 195
      // 16e: new com/finalshell/core/Hi2
      // 171: dup
      // 172: new java/lang/StringBuilder
      // 175: dup
      // 176: invokespecial java/lang/StringBuilder.<init> ()V
      // 179: sipush 2742
      // 17c: sipush 22558
      // 17f: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 182: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 185: aload 7
      // 187: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18d: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 190: athrow
      // 191: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: aload 0
      // 196: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 199: aload 0
      // 19a: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 19d: arraylength
      // 19e: bipush 1
      // 19f: isub
      // 1a0: aaload
      // 1a1: astore 9
      // 1a3: aload 9
      // 1a5: instanceof com/finalshell/core/W3_2
      // 1a8: aload 3
      // 1a9: ifnonnull 1cd
      // 1ac: ifeq 1c8
      // 1af: goto 1b6
      // 1b2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: aload 9
      // 1b8: checkcast com/finalshell/core/W3_2
      // 1bb: astore 10
      // 1bd: aload 10
      // 1bf: aload 0
      // 1c0: aload 5
      // 1c2: aload 8
      // 1c4: invokevirtual com/finalshell/core/W3_2.M (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)V
      // 1c7: return
      // 1c8: aload 9
      // 1ca: instanceof com/finalshell/core/DX
      // 1cd: aload 3
      // 1ce: ifnonnull 1ef
      // 1d1: ifeq 1f1
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: aload 9
      // 1dd: checkcast com/finalshell/core/DX
      // 1e0: aload 0
      // 1e1: aload 5
      // 1e3: aload 8
      // 1e5: invokevirtual com/finalshell/core/DX.a (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: pop
      // 1f0: return
      // 1f1: new java/lang/UnsupportedOperationException
      // 1f4: dup
      // 1f5: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 1f8: athrow
   }

   public boolean n(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnonnull 01e
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: bipush 0
      // 014: ireturn
      // 015: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: invokevirtual com/finalshell/core/Ph4.x ()V
      // 01d: aload 1
      // 01e: astore 3
      // 01f: aconst_null
      // 020: astore 4
      // 022: aload 0
      // 023: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 026: aload 0
      // 027: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 02a: arraylength
      // 02b: bipush 1
      // 02c: isub
      // 02d: aaload
      // 02e: astore 5
      // 030: bipush 0
      // 031: istore 6
      // 033: iload 6
      // 035: aload 0
      // 036: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 039: arraylength
      // 03a: if_icmpge 221
      // 03d: iload 6
      // 03f: aload 0
      // 040: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 043: arraylength
      // 044: bipush 1
      // 045: isub
      // 046: if_icmpne 056
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: aload 3
      // 051: astore 4
      // 053: goto 221
      // 056: aload 0
      // 057: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 05a: iload 6
      // 05c: aaload
      // 05d: astore 7
      // 05f: aload 2
      // 060: ifnonnull 1fa
      // 063: iload 6
      // 065: aload 0
      // 066: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 069: arraylength
      // 06a: bipush 2
      // 06b: isub
      // 06c: if_icmpne 1ef
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: aload 5
      // 078: aload 2
      // 079: ifnonnull 206
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: instanceof com/finalshell/core/LQ_2
      // 086: ifeq 1ef
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: aload 7
      // 092: aload 2
      // 093: ifnonnull 206
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: instanceof com/finalshell/core/W3_2
      // 0a0: ifeq 1ef
      // 0a3: goto 0aa
      // 0a6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: aload 5
      // 0ac: checkcast com/finalshell/core/LQ_2
      // 0af: astore 8
      // 0b1: aload 3
      // 0b2: instanceof java/util/List
      // 0b5: aload 2
      // 0b6: ifnonnull 180
      // 0b9: ifeq 171
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: aload 7
      // 0c5: checkcast com/finalshell/core/W3_2
      // 0c8: astore 9
      // 0ca: aload 3
      // 0cb: checkcast java/util/List
      // 0ce: astore 10
      // 0d0: aload 10
      // 0d2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d7: astore 11
      // 0d9: aload 11
      // 0db: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e0: ifeq 16f
      // 0e3: aload 11
      // 0e5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ea: astore 12
      // 0ec: aload 9
      // 0ee: aload 0
      // 0ef: aload 1
      // 0f0: aload 12
      // 0f2: invokevirtual com/finalshell/core/W3_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0f5: astore 13
      // 0f7: aload 13
      // 0f9: instanceof java/lang/Iterable
      // 0fc: aload 2
      // 0fd: ifnonnull 170
      // 100: aload 2
      // 101: ifnonnull 136
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: ifeq 12a
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: aload 8
      // 117: aload 0
      // 118: aload 1
      // 119: aload 13
      // 11b: invokevirtual com/finalshell/core/LQ_2.Q (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 11e: pop
      // 11f: aload 2
      // 120: ifnull 16b
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: aload 13
      // 12c: instanceof java/util/Map
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: aload 2
      // 137: ifnonnull 15a
      // 13a: ifeq 16b
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: aload 8
      // 146: invokestatic com/finalshell/core/LQ_2.w (Lcom/finalshell/core/LQ_2;)Lcom/finalshell/core/N5;
      // 149: aload 0
      // 14a: aload 1
      // 14b: aload 3
      // 14c: aload 13
      // 14e: invokeinterface com/finalshell/core/N5.x (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z 5
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: ifeq 16b
      // 15d: aload 11
      // 15f: invokeinterface java/util/Iterator.remove ()V 1
      // 164: goto 16b
      // 167: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: aload 2
      // 16c: ifnull 0d9
      // 16f: bipush 1
      // 170: ireturn
      // 171: aload 3
      // 172: aload 2
      // 173: ifnonnull 206
      // 176: instanceof java/util/Map
      // 179: goto 180
      // 17c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: ifeq 1ef
      // 183: aload 7
      // 185: checkcast com/finalshell/core/W3_2
      // 188: astore 9
      // 18a: aload 9
      // 18c: aload 0
      // 18d: aload 1
      // 18e: aload 3
      // 18f: invokevirtual com/finalshell/core/W3_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 192: astore 10
      // 194: aload 10
      // 196: aload 2
      // 197: ifnonnull 1ac
      // 19a: ifnonnull 1aa
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: bipush 0
      // 1a5: ireturn
      // 1a6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: aload 10
      // 1ac: aload 2
      // 1ad: ifnonnull 206
      // 1b0: instanceof java/util/Map
      // 1b3: ifeq 1ef
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: aload 8
      // 1bf: invokestatic com/finalshell/core/LQ_2.w (Lcom/finalshell/core/LQ_2;)Lcom/finalshell/core/N5;
      // 1c2: aload 2
      // 1c3: ifnonnull 206
      // 1c6: goto 1cd
      // 1c9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: aload 0
      // 1ce: aload 1
      // 1cf: aload 3
      // 1d0: aload 10
      // 1d2: invokeinterface com/finalshell/core/N5.x (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z 5
      // 1d7: ifeq 1ef
      // 1da: goto 1e1
      // 1dd: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0: athrow
      // 1e1: aload 9
      // 1e3: aload 0
      // 1e4: aload 3
      // 1e5: invokevirtual com/finalshell/core/W3_2.m (Lcom/finalshell/core/Ph4;Ljava/lang/Object;)Z
      // 1e8: pop
      // 1e9: bipush 1
      // 1ea: ireturn
      // 1eb: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: aload 7
      // 1f1: aload 0
      // 1f2: aload 1
      // 1f3: aload 3
      // 1f4: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 1f9: astore 3
      // 1fa: aload 2
      // 1fb: ifnonnull 21e
      // 1fe: aload 3
      // 1ff: goto 206
      // 202: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 205: athrow
      // 206: ifnonnull 214
      // 209: aload 2
      // 20a: ifnull 221
      // 20d: goto 214
      // 210: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 213: athrow
      // 214: iinc 6 1
      // 217: goto 21e
      // 21a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: goto 033
      // 221: aload 4
      // 223: ifnonnull 22c
      // 226: bipush 0
      // 227: ireturn
      // 228: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: aload 5
      // 22e: instanceof com/finalshell/core/W3_2
      // 231: aload 2
      // 232: ifnonnull 312
      // 235: ifeq 30d
      // 238: goto 23f
      // 23b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23e: athrow
      // 23f: aload 5
      // 241: checkcast com/finalshell/core/W3_2
      // 244: astore 6
      // 246: aload 4
      // 248: instanceof java/util/Collection
      // 24b: aload 2
      // 24c: ifnonnull 30c
      // 24f: ifeq 304
      // 252: goto 259
      // 255: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 258: athrow
      // 259: aload 0
      // 25a: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 25d: arraylength
      // 25e: aload 2
      // 25f: ifnonnull 30c
      // 262: goto 269
      // 265: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: bipush 1
      // 26a: if_icmple 304
      // 26d: goto 274
      // 270: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 273: athrow
      // 274: aload 0
      // 275: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 278: aload 0
      // 279: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 27c: arraylength
      // 27d: bipush 2
      // 27e: isub
      // 27f: aaload
      // 280: astore 7
      // 282: aload 7
      // 284: aload 2
      // 285: ifnonnull 2b1
      // 288: instanceof com/finalshell/core/Il2
      // 28b: ifne 2af
      // 28e: goto 295
      // 291: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: aload 7
      // 297: instanceof com/finalshell/core/Ad2_2
      // 29a: aload 2
      // 29b: ifnonnull 30c
      // 29e: goto 2a5
      // 2a1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a4: athrow
      // 2a5: ifeq 304
      // 2a8: goto 2af
      // 2ab: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ae: athrow
      // 2af: aload 4
      // 2b1: checkcast java/util/Collection
      // 2b4: astore 8
      // 2b6: bipush 0
      // 2b7: istore 9
      // 2b9: aload 8
      // 2bb: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 2c0: astore 10
      // 2c2: aload 10
      // 2c4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2c9: ifeq 301
      // 2cc: aload 10
      // 2ce: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d3: astore 11
      // 2d5: aload 6
      // 2d7: aload 0
      // 2d8: aload 11
      // 2da: invokevirtual com/finalshell/core/W3_2.m (Lcom/finalshell/core/Ph4;Ljava/lang/Object;)Z
      // 2dd: istore 12
      // 2df: iload 12
      // 2e1: aload 2
      // 2e2: ifnonnull 303
      // 2e5: aload 2
      // 2e6: ifnonnull 2fb
      // 2e9: goto 2f0
      // 2ec: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ef: athrow
      // 2f0: ifeq 2fd
      // 2f3: goto 2fa
      // 2f6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f9: athrow
      // 2fa: bipush 1
      // 2fb: istore 9
      // 2fd: aload 2
      // 2fe: ifnull 2c2
      // 301: iload 9
      // 303: ireturn
      // 304: aload 6
      // 306: aload 0
      // 307: aload 4
      // 309: invokevirtual com/finalshell/core/W3_2.m (Lcom/finalshell/core/Ph4;Ljava/lang/Object;)Z
      // 30c: ireturn
      // 30d: aload 5
      // 30f: instanceof com/finalshell/core/DX
      // 312: aload 2
      // 313: ifnonnull 340
      // 316: ifeq 330
      // 319: goto 320
      // 31c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31f: athrow
      // 320: aload 5
      // 322: checkcast com/finalshell/core/DX
      // 325: aload 0
      // 326: aload 4
      // 328: invokevirtual com/finalshell/core/DX.s (Lcom/finalshell/core/Ph4;Ljava/lang/Object;)Z
      // 32b: ireturn
      // 32c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32f: athrow
      // 330: aload 5
      // 332: aload 2
      // 333: ifnonnull 345
      // 336: instanceof com/finalshell/core/LQ_2
      // 339: goto 340
      // 33c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33f: athrow
      // 340: ifeq 354
      // 343: aload 5
      // 345: checkcast com/finalshell/core/LQ_2
      // 348: astore 6
      // 34a: aload 6
      // 34c: aload 0
      // 34d: aload 1
      // 34e: aload 4
      // 350: invokevirtual com/finalshell/core/LQ_2.Q (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 353: ireturn
      // 354: new java/lang/UnsupportedOperationException
      // 357: dup
      // 358: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 35b: athrow
   }

   public boolean G(Object var1, Object var2) {
      return this.G(var1, var2, true);
   }

   public boolean G(Object param1, Object param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnonnull 020
      // 00b: ifnonnull 01b
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: bipush 0
      // 016: ireturn
      // 017: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 0
      // 01c: invokevirtual com/finalshell/core/Ph4.x ()V
      // 01f: aload 1
      // 020: astore 5
      // 022: aconst_null
      // 023: astore 6
      // 025: bipush 0
      // 026: istore 7
      // 028: iload 7
      // 02a: aload 0
      // 02b: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 02e: arraylength
      // 02f: if_icmpge 1dd
      // 032: aload 5
      // 034: astore 6
      // 036: aload 0
      // 037: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 03a: iload 7
      // 03c: aaload
      // 03d: astore 8
      // 03f: aload 8
      // 041: aload 0
      // 042: aload 1
      // 043: aload 5
      // 045: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 04a: astore 5
      // 04c: aload 4
      // 04e: ifnonnull 1d8
      // 051: aload 5
      // 053: aload 4
      // 055: ifnonnull 1df
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: ifnonnull 1d5
      // 062: goto 069
      // 065: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: aconst_null
      // 06a: astore 9
      // 06c: iload 7
      // 06e: aload 0
      // 06f: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 072: arraylength
      // 073: bipush 1
      // 074: isub
      // 075: if_icmpge 083
      // 078: aload 0
      // 079: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 07c: iload 7
      // 07e: bipush 1
      // 07f: iadd
      // 080: aaload
      // 081: astore 9
      // 083: aconst_null
      // 084: astore 10
      // 086: aload 9
      // 088: instanceof com/finalshell/core/W3_2
      // 08b: aload 4
      // 08d: ifnonnull 14f
      // 090: ifeq 14a
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: aconst_null
      // 09b: astore 11
      // 09d: aconst_null
      // 09e: astore 12
      // 0a0: aload 8
      // 0a2: aload 4
      // 0a4: ifnonnull 0bd
      // 0a7: instanceof com/finalshell/core/W3_2
      // 0aa: ifeq 100
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 8
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: checkcast com/finalshell/core/W3_2
      // 0c0: invokestatic com/finalshell/core/W3_2.h (Lcom/finalshell/core/W3_2;)Ljava/lang/String;
      // 0c3: astore 13
      // 0c5: aload 6
      // 0c7: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0ca: astore 14
      // 0cc: aload 0
      // 0cd: aload 14
      // 0cf: invokevirtual com/finalshell/core/Ph4.Z (Ljava/lang/Class;)Lcom/finalshell/core/Ep4;
      // 0d2: astore 15
      // 0d4: aload 15
      // 0d6: aload 4
      // 0d8: ifnonnull 0e7
      // 0db: ifnull 100
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 15
      // 0e7: aload 13
      // 0e9: invokevirtual com/finalshell/core/Ep4.a (Ljava/lang/String;)Lcom/finalshell/core/UT_2;
      // 0ec: astore 16
      // 0ee: aload 16
      // 0f0: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 0f3: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 0f6: astore 12
      // 0f8: aload 0
      // 0f9: aload 12
      // 0fb: invokevirtual com/finalshell/core/Ph4.Z (Ljava/lang/Class;)Lcom/finalshell/core/Ep4;
      // 0fe: astore 11
      // 100: aload 11
      // 102: aload 4
      // 104: ifnonnull 113
      // 107: ifnull 13e
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: aload 11
      // 113: getfield com/finalshell/core/Ep4.T Lcom/finalshell/core/ZzzzF6BeanInfo;
      // 116: getfield com/finalshell/core/ZzzzF6BeanInfo.t Ljava/lang/reflect/Constructor;
      // 119: aload 4
      // 11b: ifnonnull 137
      // 11e: ifnull 13c
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 11
      // 12a: aconst_null
      // 12b: aload 12
      // 12d: invokevirtual com/finalshell/core/Ep4.O (Lcom/finalshell/core/Yn4;Ljava/lang/reflect/Type;)Ljava/lang/Object;
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: astore 10
      // 139: goto 147
      // 13c: bipush 0
      // 13d: ireturn
      // 13e: new com/finalshell/ui/model/O0
      // 141: dup
      // 142: invokespecial com/finalshell/ui/model/O0.<init> ()V
      // 145: astore 10
      // 147: goto 15b
      // 14a: aload 9
      // 14c: instanceof com/finalshell/core/DX
      // 14f: ifeq 15b
      // 152: new com/finalshell/ui/model/Oc2
      // 155: dup
      // 156: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 159: astore 10
      // 15b: aload 10
      // 15d: aload 4
      // 15f: ifnonnull 1df
      // 162: ifnull 1dd
      // 165: goto 16c
      // 168: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 8
      // 16e: instanceof com/finalshell/core/W3_2
      // 171: aload 4
      // 173: ifnonnull 1b9
      // 176: goto 17d
      // 179: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: ifeq 1a1
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: aload 8
      // 189: checkcast com/finalshell/core/W3_2
      // 18c: astore 11
      // 18e: aload 11
      // 190: aload 0
      // 191: aload 6
      // 193: aload 10
      // 195: invokevirtual com/finalshell/core/W3_2.M (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)V
      // 198: aload 10
      // 19a: astore 5
      // 19c: aload 4
      // 19e: ifnull 1d5
      // 1a1: aload 8
      // 1a3: aload 4
      // 1a5: ifnonnull 1df
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ae: athrow
      // 1af: instanceof com/finalshell/core/DX
      // 1b2: goto 1b9
      // 1b5: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: ifeq 1dd
      // 1bc: aload 8
      // 1be: checkcast com/finalshell/core/DX
      // 1c1: astore 11
      // 1c3: aload 11
      // 1c5: aload 0
      // 1c6: aload 6
      // 1c8: aload 10
      // 1ca: invokevirtual com/finalshell/core/DX.a (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1cd: pop
      // 1ce: aload 10
      // 1d0: astore 5
      // 1d2: goto 1d5
      // 1d5: iinc 7 1
      // 1d8: aload 4
      // 1da: ifnull 028
      // 1dd: aload 6
      // 1df: ifnonnull 1e8
      // 1e2: bipush 0
      // 1e3: ireturn
      // 1e4: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: aload 0
      // 1e9: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 1ec: aload 0
      // 1ed: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 1f0: arraylength
      // 1f1: bipush 1
      // 1f2: isub
      // 1f3: aaload
      // 1f4: astore 7
      // 1f6: aload 7
      // 1f8: instanceof com/finalshell/core/W3_2
      // 1fb: aload 4
      // 1fd: ifnonnull 221
      // 200: ifeq 21c
      // 203: goto 20a
      // 206: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 209: athrow
      // 20a: aload 7
      // 20c: checkcast com/finalshell/core/W3_2
      // 20f: astore 8
      // 211: aload 8
      // 213: aload 0
      // 214: aload 6
      // 216: aload 2
      // 217: invokevirtual com/finalshell/core/W3_2.M (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)V
      // 21a: bipush 1
      // 21b: ireturn
      // 21c: aload 7
      // 21e: instanceof com/finalshell/core/DX
      // 221: aload 4
      // 223: ifnonnull 243
      // 226: ifeq 244
      // 229: goto 230
      // 22c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22f: athrow
      // 230: aload 7
      // 232: checkcast com/finalshell/core/DX
      // 235: aload 0
      // 236: aload 6
      // 238: aload 2
      // 239: invokevirtual com/finalshell/core/DX.a (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 23c: goto 243
      // 23f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 242: athrow
      // 243: ireturn
      // 244: new java/lang/UnsupportedOperationException
      // 247: dup
      // 248: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 24b: athrow
   }

   public static Object V(Object var0, String var1) {
      Ph4 var2 = B(var1);
      return var2.S(var0);
   }

   public static Object D(Object var0, String var1, boolean var2) {
      Ph4 var3 = Q(var1, var2);
      return var3.S(var0);
   }

   public static int n(Object var0, String var1) {
      Ph4 var2 = B(var1);
      Object var3 = var2.S(var0);
      return var2.T(var3);
   }

   public static Set Z(Object var0, String var1) {
      Ph4 var2 = B(var1);
      Object var3 = var2.S(var0);
      return var2.K(var3);
   }

   public static boolean H(Object var0, String var1) {
      try {
         if (var0 == null) {
            return false;
         }
      } catch (Hf2 var3) {
         throw a(var3);
      }

      Ph4 var2 = B(var1);
      return var2.V(var0);
   }

   public static boolean I(Object var0, String var1, Object var2) {
      Ph4 var3 = B(var1);
      return var3.D(var0, var2);
   }

   public static void L(Object var0, String var1, Object[] var2) {
      Ph4 var3 = B(var1);
      var3.v(var0, var2);
   }

   public static boolean P(Object var0, String var1, Object var2) {
      Ph4 var3 = B(var1);
      return var3.G(var0, var2);
   }

   public static boolean E(Object var0, String var1) {
      Ph4 var2 = B(var1);
      return var2.n(var0);
   }

   public static Ph4 B(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 31
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new com/finalshell/core/Hf2
      // 16: dup
      // 17: sipush 2739
      // 1a: sipush -15717
      // 1d: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 20: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: getstatic com/finalshell/core/Ph4.s Ljava/util/concurrent/ConcurrentMap;
      // 2b: aload 0
      // 2c: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31: checkcast com/finalshell/core/Ph4
      // 34: astore 2
      // 35: aload 2
      // 36: aload 1
      // 37: ifnonnull 85
      // 3a: ifnonnull 84
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: new com/finalshell/core/Ph4
      // 47: dup
      // 48: aload 0
      // 49: invokespecial com/finalshell/core/Ph4.<init> (Ljava/lang/String;)V
      // 4c: aload 1
      // 4d: ifnonnull 85
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: astore 2
      // 58: getstatic com/finalshell/core/Ph4.s Ljava/util/concurrent/ConcurrentMap;
      // 5b: invokeinterface java/util/concurrent/ConcurrentMap.size ()I 1
      // 60: sipush 2580
      // 63: ldc2_w 6628368933578315098
      // 66: invokestatic com/finalshell/core/Ph4.a (IJ)I
      // 69: if_icmpge 84
      // 6c: getstatic com/finalshell/core/Ph4.s Ljava/util/concurrent/ConcurrentMap;
      // 6f: aload 0
      // 70: aload 2
      // 71: invokeinterface java/util/concurrent/ConcurrentMap.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 76: pop
      // 77: getstatic com/finalshell/core/Ph4.s Ljava/util/concurrent/ConcurrentMap;
      // 7a: aload 0
      // 7b: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 80: checkcast com/finalshell/core/Ph4
      // 83: astore 2
      // 84: aload 2
      // 85: areturn
   }

   public static Ph4 Q(String param0, boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 31
      // 09: ifnonnull 28
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: new com/finalshell/core/Hf2
      // 16: dup
      // 17: sipush 2751
      // 1a: sipush -32407
      // 1d: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 20: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;)V
      // 23: athrow
      // 24: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: getstatic com/finalshell/core/Ph4.s Ljava/util/concurrent/ConcurrentMap;
      // 2b: aload 0
      // 2c: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31: checkcast com/finalshell/core/Ph4
      // 34: astore 3
      // 35: aload 3
      // 36: aload 2
      // 37: ifnonnull 86
      // 3a: ifnonnull 85
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: new com/finalshell/core/Ph4
      // 47: dup
      // 48: aload 0
      // 49: iload 1
      // 4a: invokespecial com/finalshell/core/Ph4.<init> (Ljava/lang/String;Z)V
      // 4d: aload 2
      // 4e: ifnonnull 86
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: astore 3
      // 59: getstatic com/finalshell/core/Ph4.s Ljava/util/concurrent/ConcurrentMap;
      // 5c: invokeinterface java/util/concurrent/ConcurrentMap.size ()I 1
      // 61: sipush 11539
      // 64: ldc2_w 5581129419713032794
      // 67: invokestatic com/finalshell/core/Ph4.a (IJ)I
      // 6a: if_icmpge 85
      // 6d: getstatic com/finalshell/core/Ph4.s Ljava/util/concurrent/ConcurrentMap;
      // 70: aload 0
      // 71: aload 3
      // 72: invokeinterface java/util/concurrent/ConcurrentMap.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 77: pop
      // 78: getstatic com/finalshell/core/Ph4.s Ljava/util/concurrent/ConcurrentMap;
      // 7b: aload 0
      // 7c: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 81: checkcast com/finalshell/core/Ph4
      // 84: astore 3
      // 85: aload 3
      // 86: areturn
   }

   public static Object r(String var0, String var1) {
      return B(var1).S(Ok2.X(var0));
   }

   public static Object d(String var0, String var1, Type var2, IG var3) {
      return B(var1).L(Ok2.X(var0), var2, var3);
   }

   public static Object S(String var0, String var1, Type var2) {
      return d(var0, var1, var2, null);
   }

   public static Object f(String var0, String var1, IG var2, int var3, Ks2_2[] var4) {
      var3 |= Ks2_2.OrderedField.mask;
      Yn4 var5 = new Yn4(var0, var2, var3);
      Ph4 var6 = B(var1);
      Object var7 = var6.e(var5);
      var5.N.close();
      return var7;
   }

   public static Object U(String var0, String var1) {
      return f(var0, var1, IG.D, Ok2.h, new Ks2_2[0]);
   }

   public static Map h(Object var0) {
      return T(var0, En2.a);
   }

   public static Map T(Object var0, En2 var1) {
      IdentityHashMap var2 = new IdentityHashMap();
      HashMap var3 = new HashMap();
      f(var2, var3, "/", var0, var1);
      return var3;
   }

   public static void f(Map param0, Map param1, String param2, Object param3, En2 param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 5
      // 005: aload 3
      // 006: aload 5
      // 008: ifnonnull 01e
      // 00b: ifnonnull 016
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: return
      // 016: aload 0
      // 017: aload 3
      // 018: aload 2
      // 019: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 01e: checkcast java/lang/String
      // 021: astore 6
      // 023: aload 6
      // 025: aload 5
      // 027: ifnonnull 109
      // 02a: ifnull 0ff
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aload 3
      // 035: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 038: astore 7
      // 03a: aload 7
      // 03c: ldc java/lang/String
      // 03e: aload 5
      // 040: ifnonnull 059
      // 043: if_acmpeq 0e6
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 7
      // 04f: ldc_w java/lang/Boolean
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: aload 5
      // 05b: ifnonnull 074
      // 05e: if_acmpeq 0e6
      // 061: goto 068
      // 064: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: aload 7
      // 06a: ldc_w java/lang/Character
      // 06d: goto 074
      // 070: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 5
      // 076: ifnonnull 09b
      // 079: if_acmpeq 0e6
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: aload 7
      // 085: aload 5
      // 087: ifnonnull 0a0
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: ldc_w java/util/UUID
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: if_acmpeq 0e6
      // 09e: aload 7
      // 0a0: invokevirtual java/lang/Class.isEnum ()Z
      // 0a3: aload 5
      // 0a5: ifnonnull 0e7
      // 0a8: ifne 0e6
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 3
      // 0b3: instanceof java/lang/Number
      // 0b6: aload 5
      // 0b8: ifnonnull 0e7
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c1: athrow
      // 0c2: ifne 0e6
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: aload 3
      // 0cd: instanceof java/util/Date
      // 0d0: aload 5
      // 0d2: ifnonnull 0e7
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: ifeq 0ea
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: bipush 1
      // 0e7: goto 0eb
      // 0ea: bipush 0
      // 0eb: istore 8
      // 0ed: iload 8
      // 0ef: aload 5
      // 0f1: ifnonnull 10c
      // 0f4: ifne 0ff
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: return
      // 0ff: aload 1
      // 100: aload 2
      // 101: aload 3
      // 102: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 107: pop
      // 108: aload 3
      // 109: instanceof java/util/Map
      // 10c: aload 5
      // 10e: ifnonnull 1e3
      // 111: ifeq 1d3
      // 114: goto 11b
      // 117: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a: athrow
      // 11b: aload 3
      // 11c: checkcast java/util/Map
      // 11f: astore 7
      // 121: aload 7
      // 123: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 128: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12d: astore 8
      // 12f: aload 8
      // 131: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 136: ifeq 1d2
      // 139: aload 8
      // 13b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 140: astore 9
      // 142: aload 9
      // 144: checkcast java/util/Map$Entry
      // 147: astore 10
      // 149: aload 10
      // 14b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 150: astore 11
      // 152: aload 11
      // 154: instanceof java/lang/String
      // 157: aload 5
      // 159: ifnonnull 180
      // 15c: ifeq 1cd
      // 15f: goto 166
      // 162: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: aload 2
      // 167: aload 5
      // 169: ifnonnull 19f
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: ldc_w "/"
      // 176: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 179: goto 180
      // 17c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: ifeq 1a2
      // 183: new java/lang/StringBuilder
      // 186: dup
      // 187: invokespecial java/lang/StringBuilder.<init> ()V
      // 18a: ldc_w "/"
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: aload 11
      // 192: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 195: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: goto 1bb
      // 1a2: new java/lang/StringBuilder
      // 1a5: dup
      // 1a6: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a9: aload 2
      // 1aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ad: ldc_w "/"
      // 1b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b3: aload 11
      // 1b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1b8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1bb: astore 12
      // 1bd: aload 0
      // 1be: aload 1
      // 1bf: aload 12
      // 1c1: aload 10
      // 1c3: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 1c8: aload 4
      // 1ca: invokestatic com/finalshell/core/Ph4.f (Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lcom/finalshell/core/En2;)V
      // 1cd: aload 5
      // 1cf: ifnull 12f
      // 1d2: return
      // 1d3: aload 3
      // 1d4: aload 5
      // 1d6: ifnonnull 270
      // 1d9: instanceof java/util/Collection
      // 1dc: goto 1e3
      // 1df: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: ifeq 26f
      // 1e6: aload 3
      // 1e7: checkcast java/util/Collection
      // 1ea: astore 7
      // 1ec: bipush 0
      // 1ed: istore 8
      // 1ef: aload 7
      // 1f1: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1f6: astore 9
      // 1f8: aload 9
      // 1fa: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1ff: ifeq 26e
      // 202: aload 9
      // 204: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 209: astore 10
      // 20b: aload 2
      // 20c: aload 5
      // 20e: ifnonnull 23d
      // 211: ldc_w "/"
      // 214: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 217: ifeq 240
      // 21a: goto 221
      // 21d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 220: athrow
      // 221: new java/lang/StringBuilder
      // 224: dup
      // 225: invokespecial java/lang/StringBuilder.<init> ()V
      // 228: ldc_w "/"
      // 22b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22e: iload 8
      // 230: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 233: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 236: goto 23d
      // 239: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23c: athrow
      // 23d: goto 259
      // 240: new java/lang/StringBuilder
      // 243: dup
      // 244: invokespecial java/lang/StringBuilder.<init> ()V
      // 247: aload 2
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: ldc_w "/"
      // 24e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 251: iload 8
      // 253: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 256: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 259: astore 11
      // 25b: aload 0
      // 25c: aload 1
      // 25d: aload 11
      // 25f: aload 10
      // 261: aload 4
      // 263: invokestatic com/finalshell/core/Ph4.f (Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lcom/finalshell/core/En2;)V
      // 266: iinc 8 1
      // 269: aload 5
      // 26b: ifnull 1f8
      // 26e: return
      // 26f: aload 3
      // 270: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 273: astore 7
      // 275: aload 7
      // 277: invokevirtual java/lang/Class.isArray ()Z
      // 27a: aload 5
      // 27c: ifnonnull 30a
      // 27f: ifeq 305
      // 282: goto 289
      // 285: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 288: athrow
      // 289: aload 3
      // 28a: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 28d: istore 8
      // 28f: bipush 0
      // 290: istore 9
      // 292: iload 9
      // 294: iload 8
      // 296: if_icmpge 304
      // 299: aload 3
      // 29a: iload 9
      // 29c: invokestatic java/lang/reflect/Array.get (Ljava/lang/Object;I)Ljava/lang/Object;
      // 29f: astore 10
      // 2a1: aload 2
      // 2a2: aload 5
      // 2a4: ifnonnull 2d3
      // 2a7: ldc_w "/"
      // 2aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2ad: ifeq 2d6
      // 2b0: goto 2b7
      // 2b3: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b6: athrow
      // 2b7: new java/lang/StringBuilder
      // 2ba: dup
      // 2bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 2be: ldc_w "/"
      // 2c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c4: iload 9
      // 2c6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2cc: goto 2d3
      // 2cf: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d2: athrow
      // 2d3: goto 2ef
      // 2d6: new java/lang/StringBuilder
      // 2d9: dup
      // 2da: invokespecial java/lang/StringBuilder.<init> ()V
      // 2dd: aload 2
      // 2de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e1: ldc_w "/"
      // 2e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e7: iload 9
      // 2e9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ef: astore 11
      // 2f1: aload 0
      // 2f2: aload 1
      // 2f3: aload 11
      // 2f5: aload 10
      // 2f7: aload 4
      // 2f9: invokestatic com/finalshell/core/Ph4.f (Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lcom/finalshell/core/En2;)V
      // 2fc: iinc 9 1
      // 2ff: aload 5
      // 301: ifnull 292
      // 304: return
      // 305: aload 7
      // 307: invokestatic com/finalshell/core/IG.C (Ljava/lang/Class;)Z
      // 30a: aload 5
      // 30c: ifnonnull 325
      // 30f: ifne 328
      // 312: goto 319
      // 315: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 318: athrow
      // 319: aload 7
      // 31b: invokevirtual java/lang/Class.isEnum ()Z
      // 31e: goto 325
      // 321: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 324: athrow
      // 325: ifeq 329
      // 328: return
      // 329: aload 4
      // 32b: aload 7
      // 32d: invokevirtual com/finalshell/core/En2.O$ak_2 (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 330: astore 8
      // 332: aload 8
      // 334: aload 5
      // 336: ifnonnull 34f
      // 339: instanceof com/finalshell/core/Nj4
      // 33c: ifeq 431
      // 33f: goto 346
      // 342: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 345: athrow
      // 346: aload 8
      // 348: goto 34f
      // 34b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34e: athrow
      // 34f: checkcast com/finalshell/core/Nj4
      // 352: astore 9
      // 354: aload 9
      // 356: aload 3
      // 357: invokevirtual com/finalshell/core/Nj4.k (Ljava/lang/Object;)Ljava/util/Map;
      // 35a: astore 10
      // 35c: aload 10
      // 35e: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 363: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 368: astore 11
      // 36a: aload 11
      // 36c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 371: ifeq 418
      // 374: aload 11
      // 376: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37b: checkcast java/util/Map$Entry
      // 37e: astore 12
      // 380: aload 12
      // 382: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 387: checkcast java/lang/String
      // 38a: astore 13
      // 38c: aload 5
      // 38e: ifnonnull 430
      // 391: aload 13
      // 393: instanceof java/lang/String
      // 396: aload 5
      // 398: ifnonnull 3c6
      // 39b: goto 3a2
      // 39e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a1: athrow
      // 3a2: ifeq 413
      // 3a5: goto 3ac
      // 3a8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ab: athrow
      // 3ac: aload 2
      // 3ad: aload 5
      // 3af: ifnonnull 3e5
      // 3b2: goto 3b9
      // 3b5: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b8: athrow
      // 3b9: ldc_w "/"
      // 3bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3bf: goto 3c6
      // 3c2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c5: athrow
      // 3c6: ifeq 3e8
      // 3c9: new java/lang/StringBuilder
      // 3cc: dup
      // 3cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d0: ldc_w "/"
      // 3d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d6: aload 13
      // 3d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3de: goto 3e5
      // 3e1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e4: athrow
      // 3e5: goto 401
      // 3e8: new java/lang/StringBuilder
      // 3eb: dup
      // 3ec: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ef: aload 2
      // 3f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f3: ldc_w "/"
      // 3f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f9: aload 13
      // 3fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3fe: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 401: astore 14
      // 403: aload 0
      // 404: aload 1
      // 405: aload 14
      // 407: aload 12
      // 409: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 40e: aload 4
      // 410: invokestatic com/finalshell/core/Ph4.f (Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lcom/finalshell/core/En2;)V
      // 413: aload 5
      // 415: ifnull 36a
      // 418: goto 430
      // 41b: astore 10
      // 41d: new com/finalshell/core/Hi2
      // 420: dup
      // 421: sipush 2744
      // 424: sipush 12069
      // 427: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 42a: aload 10
      // 42c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 42f: athrow
      // 430: return
      // 431: return
   }

   public String F() {
      return this.V;
   }

   public static int x(Object param0, Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 008: aload 2
      // 009: ifnonnull 02d
      // 00c: aload 1
      // 00d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 010: if_acmpne 029
      // 013: goto 01a
      // 016: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019: athrow
      // 01a: aload 0
      // 01b: checkcast java/lang/Comparable
      // 01e: aload 1
      // 01f: invokeinterface java/lang/Comparable.compareTo (Ljava/lang/Object;)I 2
      // 024: ireturn
      // 025: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: aload 0
      // 02a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 02d: astore 3
      // 02e: aload 1
      // 02f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 032: astore 4
      // 034: aload 3
      // 035: ldc_w java/math/BigDecimal
      // 038: aload 2
      // 039: ifnonnull 106
      // 03c: if_acmpne 0fb
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: aload 4
      // 048: ldc_w java/lang/Integer
      // 04b: aload 2
      // 04c: ifnonnull 07f
      // 04f: goto 056
      // 052: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: if_acmpne 073
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: new java/math/BigDecimal
      // 063: dup
      // 064: aload 1
      // 065: checkcast java/lang/Integer
      // 068: invokevirtual java/lang/Integer.intValue ()I
      // 06b: invokespecial java/math/BigDecimal.<init> (I)V
      // 06e: astore 1
      // 06f: aload 2
      // 070: ifnull 3dd
      // 073: aload 4
      // 075: ldc_w java/lang/Long
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: aload 2
      // 080: ifnonnull 0ac
      // 083: if_acmpne 0a0
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: new java/math/BigDecimal
      // 090: dup
      // 091: aload 1
      // 092: checkcast java/lang/Long
      // 095: invokevirtual java/lang/Long.longValue ()J
      // 098: invokespecial java/math/BigDecimal.<init> (J)V
      // 09b: astore 1
      // 09c: aload 2
      // 09d: ifnull 3dd
      // 0a0: aload 4
      // 0a2: ldc_w java/lang/Float
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 2
      // 0ad: ifnonnull 0e5
      // 0b0: if_acmpne 0ce
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: new java/math/BigDecimal
      // 0bd: dup
      // 0be: aload 1
      // 0bf: checkcast java/lang/Float
      // 0c2: invokevirtual java/lang/Float.floatValue ()F
      // 0c5: f2d
      // 0c6: invokespecial java/math/BigDecimal.<init> (D)V
      // 0c9: astore 1
      // 0ca: aload 2
      // 0cb: ifnull 3dd
      // 0ce: aload 4
      // 0d0: aload 2
      // 0d1: ifnonnull 3de
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: ldc_w java/lang/Double
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: if_acmpne 3dd
      // 0e8: new java/math/BigDecimal
      // 0eb: dup
      // 0ec: aload 1
      // 0ed: checkcast java/lang/Double
      // 0f0: invokevirtual java/lang/Double.doubleValue ()D
      // 0f3: invokespecial java/math/BigDecimal.<init> (D)V
      // 0f6: astore 1
      // 0f7: aload 2
      // 0f8: ifnull 3dd
      // 0fb: aload 3
      // 0fc: ldc_w java/lang/Long
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 2
      // 107: ifnonnull 1d6
      // 10a: if_acmpne 1cb
      // 10d: goto 114
      // 110: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: aload 4
      // 116: ldc_w java/lang/Integer
      // 119: aload 2
      // 11a: ifnonnull 14e
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: if_acmpne 142
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: new java/lang/Long
      // 131: dup
      // 132: aload 1
      // 133: checkcast java/lang/Integer
      // 136: invokevirtual java/lang/Integer.intValue ()I
      // 139: i2l
      // 13a: invokespecial java/lang/Long.<init> (J)V
      // 13d: astore 1
      // 13e: aload 2
      // 13f: ifnull 3dd
      // 142: aload 4
      // 144: ldc_w java/math/BigDecimal
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: aload 2
      // 14f: ifnonnull 17b
      // 152: if_acmpne 16f
      // 155: goto 15c
      // 158: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15b: athrow
      // 15c: new java/math/BigDecimal
      // 15f: dup
      // 160: aload 0
      // 161: checkcast java/lang/Long
      // 164: invokevirtual java/lang/Long.longValue ()J
      // 167: invokespecial java/math/BigDecimal.<init> (J)V
      // 16a: astore 0
      // 16b: aload 2
      // 16c: ifnull 3dd
      // 16f: aload 4
      // 171: ldc_w java/lang/Float
      // 174: goto 17b
      // 177: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17a: athrow
      // 17b: aload 2
      // 17c: ifnonnull 1b4
      // 17f: if_acmpne 19d
      // 182: goto 189
      // 185: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: new java/lang/Float
      // 18c: dup
      // 18d: aload 0
      // 18e: checkcast java/lang/Long
      // 191: invokevirtual java/lang/Long.longValue ()J
      // 194: l2f
      // 195: invokespecial java/lang/Float.<init> (F)V
      // 198: astore 0
      // 199: aload 2
      // 19a: ifnull 3dd
      // 19d: aload 4
      // 19f: aload 2
      // 1a0: ifnonnull 3de
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: ldc_w java/lang/Double
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: if_acmpne 3dd
      // 1b7: new java/lang/Double
      // 1ba: dup
      // 1bb: aload 0
      // 1bc: checkcast java/lang/Long
      // 1bf: invokevirtual java/lang/Long.longValue ()J
      // 1c2: l2d
      // 1c3: invokespecial java/lang/Double.<init> (D)V
      // 1c6: astore 0
      // 1c7: aload 2
      // 1c8: ifnull 3dd
      // 1cb: aload 3
      // 1cc: ldc_w java/lang/Integer
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: aload 2
      // 1d7: ifnonnull 2a6
      // 1da: if_acmpne 29b
      // 1dd: goto 1e4
      // 1e0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e3: athrow
      // 1e4: aload 4
      // 1e6: ldc_w java/lang/Long
      // 1e9: aload 2
      // 1ea: ifnonnull 21e
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: if_acmpne 212
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fd: athrow
      // 1fe: new java/lang/Long
      // 201: dup
      // 202: aload 0
      // 203: checkcast java/lang/Integer
      // 206: invokevirtual java/lang/Integer.intValue ()I
      // 209: i2l
      // 20a: invokespecial java/lang/Long.<init> (J)V
      // 20d: astore 0
      // 20e: aload 2
      // 20f: ifnull 3dd
      // 212: aload 4
      // 214: ldc_w java/math/BigDecimal
      // 217: goto 21e
      // 21a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: aload 2
      // 21f: ifnonnull 24b
      // 222: if_acmpne 23f
      // 225: goto 22c
      // 228: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: new java/math/BigDecimal
      // 22f: dup
      // 230: aload 0
      // 231: checkcast java/lang/Integer
      // 234: invokevirtual java/lang/Integer.intValue ()I
      // 237: invokespecial java/math/BigDecimal.<init> (I)V
      // 23a: astore 0
      // 23b: aload 2
      // 23c: ifnull 3dd
      // 23f: aload 4
      // 241: ldc_w java/lang/Float
      // 244: goto 24b
      // 247: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24a: athrow
      // 24b: aload 2
      // 24c: ifnonnull 284
      // 24f: if_acmpne 26d
      // 252: goto 259
      // 255: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 258: athrow
      // 259: new java/lang/Float
      // 25c: dup
      // 25d: aload 0
      // 25e: checkcast java/lang/Integer
      // 261: invokevirtual java/lang/Integer.intValue ()I
      // 264: i2f
      // 265: invokespecial java/lang/Float.<init> (F)V
      // 268: astore 0
      // 269: aload 2
      // 26a: ifnull 3dd
      // 26d: aload 4
      // 26f: aload 2
      // 270: ifnonnull 3de
      // 273: goto 27a
      // 276: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: ldc_w java/lang/Double
      // 27d: goto 284
      // 280: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 283: athrow
      // 284: if_acmpne 3dd
      // 287: new java/lang/Double
      // 28a: dup
      // 28b: aload 0
      // 28c: checkcast java/lang/Integer
      // 28f: invokevirtual java/lang/Integer.intValue ()I
      // 292: i2d
      // 293: invokespecial java/lang/Double.<init> (D)V
      // 296: astore 0
      // 297: aload 2
      // 298: ifnull 3dd
      // 29b: aload 3
      // 29c: ldc_w java/lang/Double
      // 29f: goto 2a6
      // 2a2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: aload 2
      // 2a7: ifnonnull 354
      // 2aa: if_acmpne 33e
      // 2ad: goto 2b4
      // 2b0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b3: athrow
      // 2b4: aload 4
      // 2b6: ldc_w java/lang/Integer
      // 2b9: aload 2
      // 2ba: ifnonnull 2ee
      // 2bd: goto 2c4
      // 2c0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c3: athrow
      // 2c4: if_acmpne 2e2
      // 2c7: goto 2ce
      // 2ca: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cd: athrow
      // 2ce: new java/lang/Double
      // 2d1: dup
      // 2d2: aload 1
      // 2d3: checkcast java/lang/Integer
      // 2d6: invokevirtual java/lang/Integer.intValue ()I
      // 2d9: i2d
      // 2da: invokespecial java/lang/Double.<init> (D)V
      // 2dd: astore 1
      // 2de: aload 2
      // 2df: ifnull 3dd
      // 2e2: aload 4
      // 2e4: ldc_w java/lang/Long
      // 2e7: goto 2ee
      // 2ea: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ed: athrow
      // 2ee: aload 2
      // 2ef: ifnonnull 327
      // 2f2: if_acmpne 310
      // 2f5: goto 2fc
      // 2f8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fb: athrow
      // 2fc: new java/lang/Double
      // 2ff: dup
      // 300: aload 1
      // 301: checkcast java/lang/Long
      // 304: invokevirtual java/lang/Long.longValue ()J
      // 307: l2d
      // 308: invokespecial java/lang/Double.<init> (D)V
      // 30b: astore 1
      // 30c: aload 2
      // 30d: ifnull 3dd
      // 310: aload 4
      // 312: aload 2
      // 313: ifnonnull 3de
      // 316: goto 31d
      // 319: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: ldc_w java/lang/Float
      // 320: goto 327
      // 323: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: if_acmpne 3dd
      // 32a: new java/lang/Double
      // 32d: dup
      // 32e: aload 1
      // 32f: checkcast java/lang/Float
      // 332: invokevirtual java/lang/Float.floatValue ()F
      // 335: f2d
      // 336: invokespecial java/lang/Double.<init> (D)V
      // 339: astore 1
      // 33a: aload 2
      // 33b: ifnull 3dd
      // 33e: aload 3
      // 33f: aload 2
      // 340: ifnonnull 3de
      // 343: goto 34a
      // 346: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 349: athrow
      // 34a: ldc_w java/lang/Float
      // 34d: goto 354
      // 350: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 353: athrow
      // 354: if_acmpne 3dd
      // 357: aload 4
      // 359: ldc_w java/lang/Integer
      // 35c: aload 2
      // 35d: ifnonnull 391
      // 360: goto 367
      // 363: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 366: athrow
      // 367: if_acmpne 385
      // 36a: goto 371
      // 36d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 370: athrow
      // 371: new java/lang/Float
      // 374: dup
      // 375: aload 1
      // 376: checkcast java/lang/Integer
      // 379: invokevirtual java/lang/Integer.intValue ()I
      // 37c: i2f
      // 37d: invokespecial java/lang/Float.<init> (F)V
      // 380: astore 1
      // 381: aload 2
      // 382: ifnull 3dd
      // 385: aload 4
      // 387: ldc_w java/lang/Long
      // 38a: goto 391
      // 38d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 390: athrow
      // 391: aload 2
      // 392: ifnonnull 3ca
      // 395: if_acmpne 3b3
      // 398: goto 39f
      // 39b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39e: athrow
      // 39f: new java/lang/Float
      // 3a2: dup
      // 3a3: aload 1
      // 3a4: checkcast java/lang/Long
      // 3a7: invokevirtual java/lang/Long.longValue ()J
      // 3aa: l2f
      // 3ab: invokespecial java/lang/Float.<init> (F)V
      // 3ae: astore 1
      // 3af: aload 2
      // 3b0: ifnull 3dd
      // 3b3: aload 4
      // 3b5: aload 2
      // 3b6: ifnonnull 3de
      // 3b9: goto 3c0
      // 3bc: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bf: athrow
      // 3c0: ldc_w java/lang/Double
      // 3c3: goto 3ca
      // 3c6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c9: athrow
      // 3ca: if_acmpne 3dd
      // 3cd: new java/lang/Double
      // 3d0: dup
      // 3d1: aload 0
      // 3d2: checkcast java/lang/Float
      // 3d5: invokevirtual java/lang/Float.floatValue ()F
      // 3d8: f2d
      // 3d9: invokespecial java/lang/Double.<init> (D)V
      // 3dc: astore 0
      // 3dd: aload 0
      // 3de: checkcast java/lang/Comparable
      // 3e1: aload 1
      // 3e2: invokeinterface java/lang/Comparable.compareTo (Ljava/lang/Object;)I 2
      // 3e7: ireturn
   }

   public Object n(Object param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 1
      // 005: aload 3
      // 006: ifnonnull 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 1
      // 01a: instanceof java/util/List
      // 01d: aload 3
      // 01e: ifnonnull 08d
      // 021: ifeq 086
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 1
      // 02c: checkcast java/util/List
      // 02f: astore 4
      // 031: iload 2
      // 032: aload 3
      // 033: ifnonnull 065
      // 036: iflt 061
      // 039: goto 040
      // 03c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: iload 2
      // 041: aload 4
      // 043: invokeinterface java/util/List.size ()I 1
      // 048: if_icmpge 05f
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: aload 4
      // 054: iload 2
      // 055: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 05a: areturn
      // 05b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: aconst_null
      // 060: areturn
      // 061: iload 2
      // 062: invokestatic java/lang/Math.abs (I)I
      // 065: aload 4
      // 067: invokeinterface java/util/List.size ()I 1
      // 06c: if_icmpgt 084
      // 06f: aload 4
      // 071: aload 4
      // 073: invokeinterface java/util/List.size ()I 1
      // 078: iload 2
      // 079: iadd
      // 07a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 07f: areturn
      // 080: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: aconst_null
      // 085: areturn
      // 086: aload 1
      // 087: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 08a: invokevirtual java/lang/Class.isArray ()Z
      // 08d: aload 3
      // 08e: ifnonnull 0e5
      // 091: ifeq 0e1
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: aload 1
      // 09c: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 09f: istore 4
      // 0a1: iload 2
      // 0a2: aload 3
      // 0a3: ifnonnull 0cd
      // 0a6: iflt 0c9
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: iload 2
      // 0b1: iload 4
      // 0b3: if_icmpge 0c7
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: aload 1
      // 0be: iload 2
      // 0bf: invokestatic java/lang/reflect/Array.get (Ljava/lang/Object;I)Ljava/lang/Object;
      // 0c2: areturn
      // 0c3: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: aconst_null
      // 0c8: areturn
      // 0c9: iload 2
      // 0ca: invokestatic java/lang/Math.abs (I)I
      // 0cd: iload 4
      // 0cf: if_icmpgt 0df
      // 0d2: aload 1
      // 0d3: iload 4
      // 0d5: iload 2
      // 0d6: iadd
      // 0d7: invokestatic java/lang/reflect/Array.get (Ljava/lang/Object;I)Ljava/lang/Object;
      // 0da: areturn
      // 0db: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aconst_null
      // 0e0: areturn
      // 0e1: aload 1
      // 0e2: instanceof java/util/Map
      // 0e5: aload 3
      // 0e6: ifnonnull 12a
      // 0e9: ifeq 126
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 1
      // 0f4: checkcast java/util/Map
      // 0f7: astore 4
      // 0f9: aload 4
      // 0fb: iload 2
      // 0fc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ff: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 104: astore 5
      // 106: aload 5
      // 108: aload 3
      // 109: ifnonnull 125
      // 10c: ifnonnull 123
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 4
      // 118: iload 2
      // 119: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 11c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 121: astore 5
      // 123: aload 5
      // 125: areturn
      // 126: aload 1
      // 127: instanceof java/util/Collection
      // 12a: aload 3
      // 12b: ifnonnull 17f
      // 12e: ifeq 17e
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 1
      // 139: checkcast java/util/Collection
      // 13c: astore 4
      // 13e: bipush 0
      // 13f: istore 5
      // 141: aload 4
      // 143: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 148: astore 6
      // 14a: aload 6
      // 14c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 151: ifeq 17c
      // 154: aload 6
      // 156: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 15b: astore 7
      // 15d: aload 3
      // 15e: ifnonnull 178
      // 161: iload 5
      // 163: iload 2
      // 164: if_icmpne 175
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: aload 7
      // 170: areturn
      // 171: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: iinc 5 1
      // 178: aload 3
      // 179: ifnull 14a
      // 17c: aconst_null
      // 17d: areturn
      // 17e: iload 2
      // 17f: ifne 188
      // 182: aload 1
      // 183: areturn
      // 184: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: new java/lang/UnsupportedOperationException
      // 18b: dup
      // 18c: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 18f: athrow
   }

   public boolean I(Ph4 param1, Object param2, int param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 5
      // 005: aload 2
      // 006: aload 5
      // 008: ifnonnull 062
      // 00b: instanceof java/util/List
      // 00e: ifeq 061
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 2
      // 019: checkcast java/util/List
      // 01c: astore 6
      // 01e: aload 5
      // 020: ifnonnull 040
      // 023: iload 3
      // 024: iflt 045
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 6
      // 030: iload 3
      // 031: aload 4
      // 033: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 038: pop
      // 039: goto 040
      // 03c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: aload 5
      // 042: ifnull 05f
      // 045: aload 6
      // 047: aload 6
      // 049: invokeinterface java/util/List.size ()I 1
      // 04e: iload 3
      // 04f: iadd
      // 050: aload 4
      // 052: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 057: pop
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: bipush 1
      // 060: ireturn
      // 061: aload 2
      // 062: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 065: astore 6
      // 067: aload 6
      // 069: invokevirtual java/lang/Class.isArray ()Z
      // 06c: aload 5
      // 06e: ifnonnull 086
      // 071: ifeq 0f3
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: aload 2
      // 07c: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: istore 7
      // 088: iload 3
      // 089: aload 5
      // 08b: ifnonnull 0cf
      // 08e: iflt 0c4
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: iload 3
      // 099: aload 5
      // 09b: ifnonnull 0f2
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: iload 7
      // 0a7: if_icmpge 0f1
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 2
      // 0b2: iload 3
      // 0b3: aload 4
      // 0b5: invokestatic java/lang/reflect/Array.set (Ljava/lang/Object;ILjava/lang/Object;)V
      // 0b8: aload 5
      // 0ba: ifnull 0f1
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: iload 3
      // 0c5: invokestatic java/lang/Math.abs (I)I
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: aload 5
      // 0d1: ifnonnull 0f2
      // 0d4: iload 7
      // 0d6: if_icmpgt 0f1
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: aload 2
      // 0e1: iload 7
      // 0e3: iload 3
      // 0e4: iadd
      // 0e5: aload 4
      // 0e7: invokestatic java/lang/reflect/Array.set (Ljava/lang/Object;ILjava/lang/Object;)V
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: bipush 1
      // 0f2: ireturn
      // 0f3: new com/finalshell/core/Hf2
      // 0f6: dup
      // 0f7: new java/lang/StringBuilder
      // 0fa: dup
      // 0fb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fe: sipush 2741
      // 101: sipush -16292
      // 104: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10a: aload 6
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 112: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;)V
      // 115: athrow
   }

   public boolean B(Ph4 param1, Object param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 2
      // 06: aload 4
      // 08: ifnonnull 95
      // 0b: instanceof java/util/List
      // 0e: ifeq 94
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 2
      // 19: checkcast java/util/List
      // 1c: astore 5
      // 1e: iload 3
      // 1f: aload 4
      // 21: ifnonnull 73
      // 24: iflt 63
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: iload 3
      // 2f: aload 4
      // 31: ifnonnull 54
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 5
      // 3d: invokeinterface java/util/List.size ()I 1
      // 42: if_icmplt 55
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: bipush 0
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: ireturn
      // 55: aload 5
      // 57: iload 3
      // 58: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 5d: pop
      // 5e: aload 4
      // 60: ifnull 92
      // 63: aload 5
      // 65: invokeinterface java/util/List.size ()I 1
      // 6a: iload 3
      // 6b: iadd
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: istore 6
      // 75: iload 6
      // 77: aload 4
      // 79: ifnonnull 87
      // 7c: ifge 88
      // 7f: goto 86
      // 82: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: bipush 0
      // 87: ireturn
      // 88: aload 5
      // 8a: iload 6
      // 8c: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 91: pop
      // 92: bipush 1
      // 93: ireturn
      // 94: aload 2
      // 95: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 98: astore 5
      // 9a: new com/finalshell/core/Hf2
      // 9d: dup
      // 9e: new java/lang/StringBuilder
      // a1: dup
      // a2: invokespecial java/lang/StringBuilder.<init> ()V
      // a5: sipush 2737
      // a8: sipush 24511
      // ab: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b1: aload 5
      // b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b9: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;)V
      // bc: athrow
   }

   public Collection G(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1d: astore 3
      // 1e: aload 0
      // 1f: aload 3
      // 20: invokevirtual com/finalshell/core/Ph4.e (Ljava/lang/Class;)Lcom/finalshell/core/Nj4;
      // 23: astore 4
      // 25: aload 4
      // 27: aload 2
      // 28: ifnonnull 66
      // 2b: ifnull 65
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 4
      // 37: aload 1
      // 38: invokevirtual com/finalshell/core/Nj4.Y (Ljava/lang/Object;)Ljava/util/List;
      // 3b: areturn
      // 3c: astore 5
      // 3e: new com/finalshell/core/Hf2
      // 41: dup
      // 42: new java/lang/StringBuilder
      // 45: dup
      // 46: invokespecial java/lang/StringBuilder.<init> ()V
      // 49: sipush 2745
      // 4c: sipush -31157
      // 4f: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 52: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55: aload 0
      // 56: getfield com/finalshell/core/Ph4.V Ljava/lang/String;
      // 59: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5f: aload 5
      // 61: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 64: athrow
      // 65: aload 1
      // 66: instanceof java/util/Map
      // 69: aload 2
      // 6a: ifnonnull 94
      // 6d: ifeq 85
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aload 1
      // 78: checkcast java/util/Map
      // 7b: astore 5
      // 7d: aload 5
      // 7f: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 84: areturn
      // 85: aload 1
      // 86: aload 2
      // 87: ifnonnull 98
      // 8a: instanceof java/util/Collection
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: ifeq 9c
      // 97: aload 1
      // 98: checkcast java/util/Collection
      // 9b: areturn
      // 9c: new java/lang/UnsupportedOperationException
      // 9f: dup
      // a0: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // a3: athrow
   }

   public void X(Object var1, List var2) {
      java.lang.Class var4 = var1.getClass();
      String var10000 = Hi2.C();
      Nj4 var5 = this.e(var4);
      String var3 = var10000;
      Object var6 = null;

      label111: {
         label115: {
            label109: {
               try {
                  var10000 = var5;
                  if (var3 != null) {
                     break label109;
                  }

                  if (var5 != null) {
                     break label115;
                  }
               } catch (Exception var15) {
                  throw a(var15);
               }

               var10000 = (String)var1;
            }

            label100: {
               label116: {
                  label98: {
                     try {
                        var18 = var10000 instanceof Map;
                        if (var3 != null) {
                           break label98;
                        }

                        if (var18) {
                           break label100;
                        }
                     } catch (Exception var14) {
                        throw a(var14);
                     }

                     try {
                        var10000 = (String)var1;
                        if (var3 != null) {
                           break label116;
                        }

                        var18 = var1 instanceof Collection;
                     } catch (Exception var13) {
                        throw a(var13);
                     }
                  }

                  if (!var18) {
                     break label111;
                  }

                  var10000 = (String)var1;
               }

               var6 = (Collection)var10000;
               break label111;
            }

            var2.add(var1);
            Map var7 = (Map)var1;
            var6 = var7.values();
            break label111;
         }

         try {
            var6 = var5.Y(var1);
            var2.add(var1);
         } catch (Exception var9) {
            throw new Hf2(a(2745, -31157) + this.V, var9);
         }
      }

      label82: {
         try {
            var10000 = (String)var6;
            if (var3 != null) {
               break label82;
            }

            if (var6 == null) {
               throw new UnsupportedOperationException(var4.getName());
            }
         } catch (Exception var12) {
            throw a(var12);
         }

         var10000 = (String)var6;
      }

      for (Object var8 : var10000) {
         label119: {
            label68: {
               try {
                  var10000 = (String)var8;
                  if (var3 != null) {
                     break label68;
                  }

                  if (var8 == null) {
                     break label119;
                  }
               } catch (Exception var11) {
                  throw a(var11);
               }

               var10000 = (String)var8;
            }

            try {
               if (IG.C(var10000.getClass())) {
                  break label119;
               }
            } catch (Exception var10) {
               throw a(var10);
            }

            this.X(var8, var2);
         }

         if (var3 != null) {
            break;
         }
      }
   }

   public void u(Object param1, List param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 1
      // 004: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 007: astore 4
      // 009: astore 3
      // 00a: aload 0
      // 00b: aload 4
      // 00d: invokevirtual com/finalshell/core/Ph4.e (Ljava/lang/Class;)Lcom/finalshell/core/Nj4;
      // 010: astore 5
      // 012: aconst_null
      // 013: astore 6
      // 015: aload 5
      // 017: aload 3
      // 018: ifnonnull 05a
      // 01b: ifnull 059
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 5
      // 027: aload 1
      // 028: invokevirtual com/finalshell/core/Nj4.Y (Ljava/lang/Object;)Ljava/util/List;
      // 02b: astore 6
      // 02d: goto 095
      // 030: astore 7
      // 032: new com/finalshell/core/Hf2
      // 035: dup
      // 036: new java/lang/StringBuilder
      // 039: dup
      // 03a: invokespecial java/lang/StringBuilder.<init> ()V
      // 03d: sipush 2745
      // 040: sipush -31157
      // 043: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 046: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 049: aload 0
      // 04a: getfield com/finalshell/core/Ph4.V Ljava/lang/String;
      // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 050: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 053: aload 7
      // 055: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 058: athrow
      // 059: aload 1
      // 05a: instanceof java/util/Map
      // 05d: aload 3
      // 05e: ifnonnull 08c
      // 061: ifeq 07d
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: aload 1
      // 06c: checkcast java/util/Map
      // 06f: astore 7
      // 071: aload 7
      // 073: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 078: astore 6
      // 07a: goto 095
      // 07d: aload 1
      // 07e: aload 3
      // 07f: ifnonnull 090
      // 082: instanceof java/util/Collection
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: ifeq 095
      // 08f: aload 1
      // 090: checkcast java/util/Collection
      // 093: astore 6
      // 095: aload 6
      // 097: aload 3
      // 098: ifnonnull 0a7
      // 09b: ifnull 115
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 6
      // 0a7: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0ac: astore 7
      // 0ae: aload 7
      // 0b0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b5: ifeq 114
      // 0b8: aload 7
      // 0ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bf: astore 8
      // 0c1: aload 3
      // 0c2: ifnonnull 0fe
      // 0c5: aload 8
      // 0c7: ifnull 0ee
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: aload 8
      // 0d3: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0d6: invokestatic com/finalshell/core/IG.C (Ljava/lang/Class;)Z
      // 0d9: aload 3
      // 0da: ifnonnull 0fd
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: ifeq 102
      // 0e7: goto 0ee
      // 0ea: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: aload 2
      // 0ef: aload 8
      // 0f1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: pop
      // 0fe: aload 3
      // 0ff: ifnull 110
      // 102: aload 0
      // 103: aload 8
      // 105: aload 2
      // 106: invokevirtual com/finalshell/core/Ph4.u (Ljava/lang/Object;Ljava/util/List;)V
      // 109: goto 110
      // 10c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: aload 3
      // 111: ifnull 0ae
      // 114: return
      // 115: new java/lang/UnsupportedOperationException
      // 118: dup
      // 119: aload 4
      // 11b: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 11e: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 121: athrow
   }

   public static boolean m(Object param0, Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 2
      // 1c: ifnonnull 2a
      // 1f: ifnull 38
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 1
      // 2a: aload 2
      // 2b: ifnonnull 3f
      // 2e: ifnonnull 3e
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: bipush 0
      // 39: ireturn
      // 3a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 42: aload 2
      // 43: ifnonnull 5f
      // 46: aload 1
      // 47: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 4a: if_acmpne 5e
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 0
      // 55: aload 1
      // 56: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 59: ireturn
      // 5a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: aload 0
      // 5f: instanceof java/lang/Number
      // 62: aload 2
      // 63: ifnonnull a0
      // 66: ifeq 9b
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aload 1
      // 71: instanceof java/lang/Number
      // 74: aload 2
      // 75: ifnonnull 9a
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: ifeq 99
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 0
      // 8a: checkcast java/lang/Number
      // 8d: aload 1
      // 8e: checkcast java/lang/Number
      // 91: invokestatic com/finalshell/core/Ph4.A (Ljava/lang/Number;Ljava/lang/Number;)Z
      // 94: ireturn
      // 95: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: bipush 0
      // 9a: ireturn
      // 9b: aload 0
      // 9c: aload 1
      // 9d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // a0: ireturn
   }

   public static boolean A(Number param0, Number param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 007: astore 3
      // 008: astore 2
      // 009: aload 3
      // 00a: invokestatic com/finalshell/core/Ph4.O (Ljava/lang/Class;)Z
      // 00d: istore 4
      // 00f: aload 1
      // 010: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 013: astore 5
      // 015: aload 5
      // 017: invokestatic com/finalshell/core/Ph4.O (Ljava/lang/Class;)Z
      // 01a: istore 6
      // 01c: aload 0
      // 01d: instanceof java/math/BigDecimal
      // 020: aload 2
      // 021: ifnonnull 057
      // 024: ifeq 055
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 0
      // 02f: checkcast java/math/BigDecimal
      // 032: astore 7
      // 034: iload 6
      // 036: aload 2
      // 037: ifnonnull 057
      // 03a: ifeq 055
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: aload 7
      // 046: aload 1
      // 047: invokestatic com/finalshell/core/B8_2.e (Ljava/lang/Number;)J
      // 04a: invokestatic java/math/BigDecimal.valueOf (J)Ljava/math/BigDecimal;
      // 04d: invokevirtual java/math/BigDecimal.equals (Ljava/lang/Object;)Z
      // 050: ireturn
      // 051: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: iload 4
      // 057: aload 2
      // 058: ifnonnull 0cb
      // 05b: ifeq 0c9
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: iload 6
      // 067: aload 2
      // 068: ifnonnull 0a4
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: ifeq 0a0
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 0
      // 07d: invokevirtual java/lang/Number.longValue ()J
      // 080: aload 1
      // 081: invokevirtual java/lang/Number.longValue ()J
      // 084: lcmp
      // 085: aload 2
      // 086: ifnonnull 09b
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: ifne 09e
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: bipush 1
      // 09b: goto 09f
      // 09e: bipush 0
      // 09f: ireturn
      // 0a0: aload 1
      // 0a1: instanceof java/math/BigInteger
      // 0a4: aload 2
      // 0a5: ifnonnull 0cb
      // 0a8: ifeq 0c9
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: checkcast java/math/BigInteger
      // 0b6: astore 7
      // 0b8: aload 0
      // 0b9: invokevirtual java/lang/Number.longValue ()J
      // 0bc: invokestatic java/math/BigInteger.valueOf (J)Ljava/math/BigInteger;
      // 0bf: astore 8
      // 0c1: aload 8
      // 0c3: aload 7
      // 0c5: invokevirtual java/math/BigInteger.equals (Ljava/lang/Object;)Z
      // 0c8: ireturn
      // 0c9: iload 6
      // 0cb: aload 2
      // 0cc: ifnonnull 10d
      // 0cf: ifeq 109
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: instanceof java/math/BigInteger
      // 0dd: aload 2
      // 0de: ifnonnull 10d
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: ifeq 109
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: checkcast java/math/BigInteger
      // 0f6: astore 7
      // 0f8: aload 1
      // 0f9: invokestatic com/finalshell/core/B8_2.e (Ljava/lang/Number;)J
      // 0fc: invokestatic java/math/BigInteger.valueOf (J)Ljava/math/BigInteger;
      // 0ff: astore 8
      // 101: aload 7
      // 103: aload 8
      // 105: invokevirtual java/math/BigInteger.equals (Ljava/lang/Object;)Z
      // 108: ireturn
      // 109: aload 3
      // 10a: invokestatic com/finalshell/core/Ph4.o (Ljava/lang/Class;)Z
      // 10d: istore 7
      // 10f: aload 5
      // 111: invokestatic com/finalshell/core/Ph4.o (Ljava/lang/Class;)Z
      // 114: istore 8
      // 116: iload 7
      // 118: aload 2
      // 119: ifnonnull 13f
      // 11c: ifeq 13d
      // 11f: goto 126
      // 122: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: iload 8
      // 128: aload 2
      // 129: ifnonnull 19b
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: ifne 18b
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: iload 7
      // 13f: aload 2
      // 140: ifnonnull 166
      // 143: ifeq 164
      // 146: goto 14d
      // 149: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: iload 6
      // 14f: aload 2
      // 150: ifnonnull 19b
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: ifne 18b
      // 15d: goto 164
      // 160: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: iload 8
      // 166: aload 2
      // 167: ifnonnull 1b0
      // 16a: ifeq 1af
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: iload 4
      // 176: aload 2
      // 177: ifnonnull 1b0
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: ifeq 1af
      // 184: goto 18b
      // 187: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: aload 0
      // 18c: invokevirtual java/lang/Number.doubleValue ()D
      // 18f: aload 1
      // 190: invokevirtual java/lang/Number.doubleValue ()D
      // 193: dcmpl
      // 194: goto 19b
      // 197: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: aload 2
      // 19c: ifnonnull 1aa
      // 19f: ifne 1ad
      // 1a2: goto 1a9
      // 1a5: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a8: athrow
      // 1a9: bipush 1
      // 1aa: goto 1ae
      // 1ad: bipush 0
      // 1ae: ireturn
      // 1af: bipush 0
      // 1b0: ireturn
   }

   public static boolean o(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: ldc_w java/lang/Float
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: if_acmpeq 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: ldc_w java/lang/Double
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: if_acmpne 2c
      // 24: bipush 1
      // 25: goto 2d
      // 28: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   public static boolean O(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: ldc_w java/lang/Byte
      // 08: aload 1
      // 09: ifnonnull 21
      // 0c: if_acmpeq 56
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: ldc_w java/lang/Short
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 1
      // 22: ifnonnull 3a
      // 25: if_acmpeq 56
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: ldc_w java/lang/Integer
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 1
      // 3b: ifnonnull 53
      // 3e: if_acmpeq 56
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aload 0
      // 49: ldc_w java/lang/Long
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: if_acmpne 5e
      // 56: bipush 1
      // 57: goto 5f
      // 5a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: bipush 0
      // 5f: ireturn
   }

   public Object S(Object param1, String param2, long param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 5
      // 005: aload 1
      // 006: aload 5
      // 008: ifnonnull 01c
      // 00b: ifnonnull 01b
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aconst_null
      // 016: areturn
      // 017: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 1
      // 01c: instanceof java/lang/String
      // 01f: aload 5
      // 021: ifnonnull 056
      // 024: ifeq 046
      // 027: goto 02e
      // 02a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: aload 1
      // 02f: checkcast java/lang/String
      // 032: aload 0
      // 033: getfield com/finalshell/core/Ph4.w Lcom/finalshell/core/IG;
      // 036: invokestatic com/finalshell/core/Ok2.q (Ljava/lang/String;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 039: checkcast com/finalshell/ui/model/O0
      // 03c: astore 6
      // 03e: aload 6
      // 040: astore 1
      // 041: goto 046
      // 044: astore 6
      // 046: aload 1
      // 047: aload 5
      // 049: ifnonnull 0d3
      // 04c: instanceof java/util/Map
      // 04f: goto 056
      // 052: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: ifeq 0d2
      // 059: aload 1
      // 05a: checkcast java/util/Map
      // 05d: astore 6
      // 05f: aload 6
      // 061: aload 2
      // 062: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 067: astore 7
      // 069: aload 7
      // 06b: aload 5
      // 06d: ifnonnull 0d1
      // 070: ifnonnull 0cf
      // 073: goto 07a
      // 076: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079: athrow
      // 07a: sipush 25101
      // 07d: ldc2_w 5373610143680010505
      // 080: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 083: lload 3
      // 084: lcmp
      // 085: aload 5
      // 087: ifnonnull 0ca
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: ifeq 0bc
      // 094: goto 09b
      // 097: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: sipush 13474
      // 09e: ldc2_w 4151343535624310697
      // 0a1: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 0a4: lload 3
      // 0a5: lcmp
      // 0a6: aload 5
      // 0a8: ifnonnull 0ca
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: ifne 0cf
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: aload 6
      // 0be: invokeinterface java/util/Map.size ()I 1
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0cd: astore 7
      // 0cf: aload 7
      // 0d1: areturn
      // 0d2: aload 1
      // 0d3: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0d6: astore 6
      // 0d8: aload 0
      // 0d9: aload 6
      // 0db: invokevirtual com/finalshell/core/Ph4.e (Ljava/lang/Class;)Lcom/finalshell/core/Nj4;
      // 0de: astore 7
      // 0e0: aload 7
      // 0e2: aload 5
      // 0e4: ifnonnull 135
      // 0e7: ifnull 134
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: aload 7
      // 0f3: aload 1
      // 0f4: aload 2
      // 0f5: lload 3
      // 0f6: bipush 0
      // 0f7: invokevirtual com/finalshell/core/Nj4.R (Ljava/lang/Object;Ljava/lang/String;JZ)Ljava/lang/Object;
      // 0fa: areturn
      // 0fb: astore 8
      // 0fd: new com/finalshell/core/Hf2
      // 100: dup
      // 101: new java/lang/StringBuilder
      // 104: dup
      // 105: invokespecial java/lang/StringBuilder.<init> ()V
      // 108: sipush 2745
      // 10b: sipush -31157
      // 10e: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114: aload 0
      // 115: getfield com/finalshell/core/Ph4.V Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: sipush 2740
      // 11e: sipush 24767
      // 121: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: aload 2
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12e: aload 8
      // 130: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 133: athrow
      // 134: aload 1
      // 135: instanceof java/util/List
      // 138: aload 5
      // 13a: ifnonnull 2da
      // 13d: ifeq 2d6
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: aload 1
      // 148: checkcast java/util/List
      // 14b: astore 8
      // 14d: sipush 13541
      // 150: ldc2_w 4460833452907581416
      // 153: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 156: lload 3
      // 157: lcmp
      // 158: aload 5
      // 15a: ifnonnull 196
      // 15d: ifeq 188
      // 160: goto 167
      // 163: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: sipush 5266
      // 16a: ldc2_w 5429430684185816989
      // 16d: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 170: lload 3
      // 171: lcmp
      // 172: aload 5
      // 174: ifnonnull 196
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d: athrow
      // 17e: ifne 19a
      // 181: goto 188
      // 184: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: aload 8
      // 18a: invokeinterface java/util/List.size ()I 1
      // 18f: goto 196
      // 192: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 195: athrow
      // 196: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 199: areturn
      // 19a: aconst_null
      // 19b: astore 9
      // 19d: bipush 0
      // 19e: istore 10
      // 1a0: iload 10
      // 1a2: aload 8
      // 1a4: invokeinterface java/util/List.size ()I 1
      // 1a9: if_icmpge 2bd
      // 1ac: aload 8
      // 1ae: iload 10
      // 1b0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1b5: astore 11
      // 1b7: aload 5
      // 1b9: ifnonnull 2d3
      // 1bc: aload 11
      // 1be: aload 5
      // 1c0: ifnonnull 21c
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c9: athrow
      // 1ca: aload 8
      // 1cc: if_acmpne 20d
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: aload 9
      // 1d8: aload 5
      // 1da: ifnonnull 200
      // 1dd: goto 1e4
      // 1e0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e3: athrow
      // 1e4: ifnonnull 1fe
      // 1e7: goto 1ee
      // 1ea: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: new com/finalshell/ui/model/Oc2
      // 1f1: dup
      // 1f2: aload 8
      // 1f4: invokeinterface java/util/List.size ()I 1
      // 1f9: invokespecial com/finalshell/ui/model/Oc2.<init> (I)V
      // 1fc: astore 9
      // 1fe: aload 9
      // 200: aload 11
      // 202: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 207: pop
      // 208: aload 5
      // 20a: ifnull 2b5
      // 20d: aload 0
      // 20e: aload 11
      // 210: aload 2
      // 211: lload 3
      // 212: invokevirtual com/finalshell/core/Ph4.S (Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;
      // 215: goto 21c
      // 218: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21b: athrow
      // 21c: astore 12
      // 21e: aload 12
      // 220: aload 5
      // 222: ifnonnull 272
      // 225: instanceof java/util/Collection
      // 228: ifeq 269
      // 22b: goto 232
      // 22e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 231: athrow
      // 232: aload 12
      // 234: checkcast java/util/Collection
      // 237: astore 13
      // 239: aload 9
      // 23b: aload 5
      // 23d: ifnonnull 25c
      // 240: ifnonnull 25a
      // 243: goto 24a
      // 246: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 249: athrow
      // 24a: new com/finalshell/ui/model/Oc2
      // 24d: dup
      // 24e: aload 8
      // 250: invokeinterface java/util/List.size ()I 1
      // 255: invokespecial com/finalshell/ui/model/Oc2.<init> (I)V
      // 258: astore 9
      // 25a: aload 9
      // 25c: aload 13
      // 25e: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 263: pop
      // 264: aload 5
      // 266: ifnull 2b5
      // 269: aload 12
      // 26b: goto 272
      // 26e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 271: athrow
      // 272: ifnonnull 283
      // 275: aload 0
      // 276: getfield com/finalshell/core/Ph4.T Z
      // 279: ifne 2b5
      // 27c: goto 283
      // 27f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 282: athrow
      // 283: aload 9
      // 285: aload 5
      // 287: ifnonnull 2ad
      // 28a: goto 291
      // 28d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 290: athrow
      // 291: ifnonnull 2ab
      // 294: goto 29b
      // 297: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29a: athrow
      // 29b: new com/finalshell/ui/model/Oc2
      // 29e: dup
      // 29f: aload 8
      // 2a1: invokeinterface java/util/List.size ()I 1
      // 2a6: invokespecial com/finalshell/ui/model/Oc2.<init> (I)V
      // 2a9: astore 9
      // 2ab: aload 9
      // 2ad: aload 12
      // 2af: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2b4: pop
      // 2b5: iinc 10 1
      // 2b8: aload 5
      // 2ba: ifnull 1a0
      // 2bd: aload 9
      // 2bf: aload 5
      // 2c1: ifnonnull 2d5
      // 2c4: ifnonnull 2d3
      // 2c7: goto 2ce
      // 2ca: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cd: athrow
      // 2ce: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 2d1: astore 9
      // 2d3: aload 9
      // 2d5: areturn
      // 2d6: aload 1
      // 2d7: instanceof [Ljava/lang/Object;
      // 2da: aload 5
      // 2dc: ifnonnull 400
      // 2df: ifeq 3fc
      // 2e2: goto 2e9
      // 2e5: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e8: athrow
      // 2e9: aload 1
      // 2ea: checkcast [Ljava/lang/Object;
      // 2ed: astore 8
      // 2ef: sipush 13541
      // 2f2: ldc2_w 4460833452907581416
      // 2f5: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 2f8: lload 3
      // 2f9: lcmp
      // 2fa: aload 5
      // 2fc: ifnonnull 334
      // 2ff: ifeq 32a
      // 302: goto 309
      // 305: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: sipush 5266
      // 30c: ldc2_w 5429430684185816989
      // 30f: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 312: lload 3
      // 313: lcmp
      // 314: aload 5
      // 316: ifnonnull 334
      // 319: goto 320
      // 31c: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31f: athrow
      // 320: ifne 338
      // 323: goto 32a
      // 326: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 329: athrow
      // 32a: aload 8
      // 32c: arraylength
      // 32d: goto 334
      // 330: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 333: athrow
      // 334: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 337: areturn
      // 338: new com/finalshell/ui/model/Oc2
      // 33b: dup
      // 33c: aload 8
      // 33e: arraylength
      // 33f: invokespecial com/finalshell/ui/model/Oc2.<init> (I)V
      // 342: astore 9
      // 344: bipush 0
      // 345: istore 10
      // 347: iload 10
      // 349: aload 8
      // 34b: arraylength
      // 34c: if_icmpge 3f9
      // 34f: aload 8
      // 351: iload 10
      // 353: aaload
      // 354: astore 11
      // 356: aload 11
      // 358: aload 5
      // 35a: ifnonnull 38e
      // 35d: aload 8
      // 35f: if_acmpne 37f
      // 362: goto 369
      // 365: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 368: athrow
      // 369: aload 9
      // 36b: aload 11
      // 36d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 372: pop
      // 373: aload 5
      // 375: ifnull 3f1
      // 378: goto 37f
      // 37b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37e: athrow
      // 37f: aload 0
      // 380: aload 11
      // 382: aload 2
      // 383: lload 3
      // 384: invokevirtual com/finalshell/core/Ph4.S (Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;
      // 387: goto 38e
      // 38a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38d: athrow
      // 38e: astore 12
      // 390: aload 12
      // 392: aload 5
      // 394: ifnonnull 3c3
      // 397: instanceof java/util/Collection
      // 39a: ifeq 3ba
      // 39d: goto 3a4
      // 3a0: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: aload 12
      // 3a6: checkcast java/util/Collection
      // 3a9: astore 13
      // 3ab: aload 9
      // 3ad: aload 13
      // 3af: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 3b4: pop
      // 3b5: aload 5
      // 3b7: ifnull 3f1
      // 3ba: aload 12
      // 3bc: goto 3c3
      // 3bf: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c2: athrow
      // 3c3: ifnonnull 3e0
      // 3c6: aload 0
      // 3c7: getfield com/finalshell/core/Ph4.T Z
      // 3ca: aload 5
      // 3cc: ifnonnull 3f0
      // 3cf: goto 3d6
      // 3d2: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d5: athrow
      // 3d6: ifne 3f1
      // 3d9: goto 3e0
      // 3dc: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3df: athrow
      // 3e0: aload 9
      // 3e2: aload 12
      // 3e4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: pop
      // 3f1: iinc 10 1
      // 3f4: aload 5
      // 3f6: ifnull 347
      // 3f9: aload 9
      // 3fb: areturn
      // 3fc: aload 1
      // 3fd: instanceof java/lang/Enum
      // 400: aload 5
      // 402: ifnonnull 47a
      // 405: ifeq 476
      // 408: goto 40f
      // 40b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40e: athrow
      // 40f: sipush 24888
      // 412: ldc2_w 4613454632877529636
      // 415: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 418: lstore 8
      // 41a: sipush 3158
      // 41d: ldc2_w 4834138499094902620
      // 420: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 423: lstore 10
      // 425: aload 1
      // 426: checkcast java/lang/Enum
      // 429: astore 12
      // 42b: sipush 31798
      // 42e: ldc2_w 4207313242258310970
      // 431: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 434: lload 3
      // 435: lcmp
      // 436: aload 5
      // 438: ifnonnull 45a
      // 43b: ifne 44f
      // 43e: goto 445
      // 441: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 444: athrow
      // 445: aload 12
      // 447: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 44a: areturn
      // 44b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44e: athrow
      // 44f: sipush 27073
      // 452: ldc2_w 7537955708887077596
      // 455: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 458: lload 3
      // 459: lcmp
      // 45a: aload 5
      // 45c: ifnonnull 47a
      // 45f: ifne 476
      // 462: goto 469
      // 465: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 468: athrow
      // 469: aload 12
      // 46b: invokevirtual java/lang/Enum.ordinal ()I
      // 46e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 471: areturn
      // 472: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 475: athrow
      // 476: aload 1
      // 477: instanceof java/util/Calendar
      // 47a: ifeq 5d0
      // 47d: sipush 15373
      // 480: ldc2_w 4510529984305973004
      // 483: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 486: lstore 8
      // 488: sipush 25031
      // 48b: ldc2_w 559826626649299653
      // 48e: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 491: lstore 10
      // 493: sipush 22532
      // 496: ldc2_w 4726992648096850690
      // 499: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 49c: lstore 12
      // 49e: sipush 26669
      // 4a1: ldc2_w 4419094668829561640
      // 4a4: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 4a7: lstore 14
      // 4a9: sipush 28343
      // 4ac: ldc2_w 1332627107792131519
      // 4af: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 4b2: lstore 16
      // 4b4: sipush 14976
      // 4b7: ldc2_w 8855573924842095007
      // 4ba: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 4bd: lstore 18
      // 4bf: aload 1
      // 4c0: checkcast java/util/Calendar
      // 4c3: astore 20
      // 4c5: sipush 4741
      // 4c8: ldc2_w 160794128543508875
      // 4cb: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 4ce: lload 3
      // 4cf: lcmp
      // 4d0: aload 5
      // 4d2: ifnonnull 4f8
      // 4d5: ifne 4ed
      // 4d8: goto 4df
      // 4db: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4de: athrow
      // 4df: aload 20
      // 4e1: bipush 1
      // 4e2: invokevirtual java/util/Calendar.get (I)I
      // 4e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4e8: areturn
      // 4e9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ec: athrow
      // 4ed: sipush 31504
      // 4f0: ldc2_w 3058217878099886096
      // 4f3: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 4f6: lload 3
      // 4f7: lcmp
      // 4f8: aload 5
      // 4fa: ifnonnull 520
      // 4fd: ifne 515
      // 500: goto 507
      // 503: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 506: athrow
      // 507: aload 20
      // 509: bipush 2
      // 50a: invokevirtual java/util/Calendar.get (I)I
      // 50d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 510: areturn
      // 511: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 514: athrow
      // 515: sipush 4624
      // 518: ldc2_w 3327246407184673038
      // 51b: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 51e: lload 3
      // 51f: lcmp
      // 520: aload 5
      // 522: ifnonnull 548
      // 525: ifne 53d
      // 528: goto 52f
      // 52b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52e: athrow
      // 52f: aload 20
      // 531: bipush 5
      // 532: invokevirtual java/util/Calendar.get (I)I
      // 535: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 538: areturn
      // 539: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53c: athrow
      // 53d: sipush 5705
      // 540: ldc2_w 8719773549315124544
      // 543: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 546: lload 3
      // 547: lcmp
      // 548: aload 5
      // 54a: ifnonnull 578
      // 54d: ifne 56d
      // 550: goto 557
      // 553: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 556: athrow
      // 557: aload 20
      // 559: sipush 350
      // 55c: ldc2_w 4928691428755676694
      // 55f: invokestatic com/finalshell/core/Ph4.a (IJ)I
      // 562: invokevirtual java/util/Calendar.get (I)I
      // 565: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 568: areturn
      // 569: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56c: athrow
      // 56d: sipush 3718
      // 570: ldc2_w 553241040576607621
      // 573: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 576: lload 3
      // 577: lcmp
      // 578: aload 5
      // 57a: ifnonnull 5a8
      // 57d: ifne 59d
      // 580: goto 587
      // 583: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 586: athrow
      // 587: aload 20
      // 589: sipush 18485
      // 58c: ldc2_w 3339895755361081210
      // 58f: invokestatic com/finalshell/core/Ph4.a (IJ)I
      // 592: invokevirtual java/util/Calendar.get (I)I
      // 595: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 598: areturn
      // 599: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59c: athrow
      // 59d: sipush 10755
      // 5a0: ldc2_w 3222351445514703108
      // 5a3: invokestatic com/finalshell/core/Ph4.b (IJ)J
      // 5a6: lload 3
      // 5a7: lcmp
      // 5a8: aload 5
      // 5aa: ifnonnull 5cc
      // 5ad: ifne 5d0
      // 5b0: goto 5b7
      // 5b3: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b6: athrow
      // 5b7: aload 20
      // 5b9: sipush 10608
      // 5bc: ldc2_w 7735060080889968188
      // 5bf: invokestatic com/finalshell/core/Ph4.a (IJ)I
      // 5c2: invokevirtual java/util/Calendar.get (I)I
      // 5c5: goto 5cc
      // 5c8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5cb: athrow
      // 5cc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5cf: areturn
      // 5d0: aconst_null
      // 5d1: areturn
   }

   public void L(Object param1, String param2, List param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnonnull 017
      // 00b: ifnonnull 016
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: return
      // 016: aload 1
      // 017: instanceof java/util/Map
      // 01a: aload 4
      // 01c: ifnonnull 0fd
      // 01f: ifeq 0ed
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: aload 1
      // 02a: checkcast java/util/Map
      // 02d: astore 5
      // 02f: aload 5
      // 031: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 036: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 03b: astore 6
      // 03d: aload 6
      // 03f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 044: ifeq 0ec
      // 047: aload 6
      // 049: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04e: checkcast java/util/Map$Entry
      // 051: astore 7
      // 053: aload 7
      // 055: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 05a: astore 8
      // 05c: aload 2
      // 05d: aload 4
      // 05f: ifnonnull 0b9
      // 062: aload 7
      // 064: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 069: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06c: ifeq 0b7
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: aload 8
      // 078: instanceof java/util/Collection
      // 07b: aload 4
      // 07d: ifnonnull 0b1
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: ifeq 0a9
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 3
      // 092: aload 8
      // 094: checkcast java/util/Collection
      // 097: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 09c: pop
      // 09d: aload 4
      // 09f: ifnull 03d
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 3
      // 0aa: aload 8
      // 0ac: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b1: pop
      // 0b2: aload 4
      // 0b4: ifnull 03d
      // 0b7: aload 8
      // 0b9: aload 4
      // 0bb: ifnonnull 0ca
      // 0be: ifnull 03d
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: aload 8
      // 0ca: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0cd: invokestatic com/finalshell/core/IG.C (Ljava/lang/Class;)Z
      // 0d0: ifeq 0df
      // 0d3: aload 4
      // 0d5: ifnull 03d
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: aload 8
      // 0e2: aload 2
      // 0e3: aload 3
      // 0e4: invokevirtual com/finalshell/core/Ph4.L (Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V
      // 0e7: aload 4
      // 0e9: ifnull 03d
      // 0ec: return
      // 0ed: aload 1
      // 0ee: aload 4
      // 0f0: ifnonnull 150
      // 0f3: instanceof java/util/Collection
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: ifeq 14f
      // 100: aload 1
      // 101: checkcast java/util/Collection
      // 104: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 109: astore 5
      // 10b: aload 5
      // 10d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 112: ifeq 14e
      // 115: aload 5
      // 117: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 11c: astore 6
      // 11e: aload 4
      // 120: ifnonnull 149
      // 123: aload 6
      // 125: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 128: invokestatic com/finalshell/core/IG.C (Ljava/lang/Class;)Z
      // 12b: ifeq 141
      // 12e: goto 135
      // 131: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: aload 4
      // 137: ifnull 10b
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: aload 0
      // 142: aload 6
      // 144: aload 2
      // 145: aload 3
      // 146: invokevirtual com/finalshell/core/Ph4.L (Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V
      // 149: aload 4
      // 14b: ifnull 10b
      // 14e: return
      // 14f: aload 1
      // 150: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 153: astore 5
      // 155: aload 0
      // 156: aload 5
      // 158: invokevirtual com/finalshell/core/Ph4.e (Ljava/lang/Class;)Lcom/finalshell/core/Nj4;
      // 15b: astore 6
      // 15d: aload 6
      // 15f: aload 4
      // 161: ifnonnull 254
      // 164: ifnull 253
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: aload 6
      // 170: aload 2
      // 171: invokevirtual com/finalshell/core/Nj4.d (Ljava/lang/String;)Lcom/finalshell/core/Nc2;
      // 174: astore 7
      // 176: aload 7
      // 178: aload 4
      // 17a: ifnonnull 18d
      // 17d: ifnull 1e8
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: aload 7
      // 189: aload 1
      // 18a: invokevirtual com/finalshell/core/Nc2.t (Ljava/lang/Object;)Ljava/lang/Object;
      // 18d: astore 8
      // 18f: aload 3
      // 190: aload 8
      // 192: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 197: pop
      // 198: goto 1e7
      // 19b: astore 8
      // 19d: new com/finalshell/core/Hi2
      // 1a0: dup
      // 1a1: new java/lang/StringBuilder
      // 1a4: dup
      // 1a5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a8: sipush 2747
      // 1ab: sipush -6984
      // 1ae: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 1b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b4: aload 2
      // 1b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1bb: aload 8
      // 1bd: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1c0: athrow
      // 1c1: astore 8
      // 1c3: new com/finalshell/core/Hi2
      // 1c6: dup
      // 1c7: new java/lang/StringBuilder
      // 1ca: dup
      // 1cb: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ce: sipush 2735
      // 1d1: sipush 18482
      // 1d4: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 1d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1da: aload 2
      // 1db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e1: aload 8
      // 1e3: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1e6: athrow
      // 1e7: return
      // 1e8: aload 6
      // 1ea: aload 1
      // 1eb: invokevirtual com/finalshell/core/Nj4.Y (Ljava/lang/Object;)Ljava/util/List;
      // 1ee: astore 8
      // 1f0: aload 8
      // 1f2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1f7: astore 9
      // 1f9: aload 9
      // 1fb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 200: ifeq 219
      // 203: aload 9
      // 205: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 20a: astore 10
      // 20c: aload 0
      // 20d: aload 10
      // 20f: aload 2
      // 210: aload 3
      // 211: invokevirtual com/finalshell/core/Ph4.L (Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V
      // 214: aload 4
      // 216: ifnull 1f9
      // 219: return
      // 21a: astore 7
      // 21c: new com/finalshell/core/Hf2
      // 21f: dup
      // 220: new java/lang/StringBuilder
      // 223: dup
      // 224: invokespecial java/lang/StringBuilder.<init> ()V
      // 227: sipush 2745
      // 22a: sipush -31157
      // 22d: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 230: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 233: aload 0
      // 234: getfield com/finalshell/core/Ph4.V Ljava/lang/String;
      // 237: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23a: sipush 2740
      // 23d: sipush 24767
      // 240: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 243: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 246: aload 2
      // 247: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24d: aload 7
      // 24f: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 252: athrow
      // 253: aload 1
      // 254: aload 4
      // 256: ifnonnull 26e
      // 259: instanceof java/util/List
      // 25c: ifeq 29e
      // 25f: goto 266
      // 262: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: aload 1
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: checkcast java/util/List
      // 271: astore 7
      // 273: bipush 0
      // 274: istore 8
      // 276: iload 8
      // 278: aload 7
      // 27a: invokeinterface java/util/List.size ()I 1
      // 27f: if_icmpge 29d
      // 282: aload 7
      // 284: iload 8
      // 286: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 28b: astore 9
      // 28d: aload 0
      // 28e: aload 9
      // 290: aload 2
      // 291: aload 3
      // 292: invokevirtual com/finalshell/core/Ph4.L (Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V
      // 295: iinc 8 1
      // 298: aload 4
      // 29a: ifnull 276
      // 29d: return
      // 29e: return
   }

   public void R(Object param1, String param2, long param3, Object param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 6
      // 005: aload 1
      // 006: aload 6
      // 008: ifnonnull 017
      // 00b: ifnonnull 016
      // 00e: goto 015
      // 011: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: return
      // 016: aload 1
      // 017: aload 6
      // 019: ifnonnull 08e
      // 01c: instanceof java/util/Map
      // 01f: ifeq 08d
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: aload 1
      // 02a: checkcast java/util/Map
      // 02d: astore 7
      // 02f: aload 7
      // 031: aload 6
      // 033: ifnonnull 05e
      // 036: aload 2
      // 037: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 03c: ifeq 05c
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: aload 7
      // 048: aload 2
      // 049: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 04e: astore 8
      // 050: aload 7
      // 052: aload 2
      // 053: aload 5
      // 055: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 05a: pop
      // 05b: return
      // 05c: aload 7
      // 05e: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 063: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 068: astore 8
      // 06a: aload 8
      // 06c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 071: ifeq 08c
      // 074: aload 8
      // 076: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07b: astore 9
      // 07d: aload 0
      // 07e: aload 9
      // 080: aload 2
      // 081: lload 3
      // 082: aload 5
      // 084: invokevirtual com/finalshell/core/Ph4.R (Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;)V
      // 087: aload 6
      // 089: ifnull 06a
      // 08c: return
      // 08d: aload 1
      // 08e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 091: astore 7
      // 093: aload 0
      // 094: aload 7
      // 096: invokevirtual com/finalshell/core/Ph4.Z (Ljava/lang/Class;)Lcom/finalshell/core/Ep4;
      // 099: astore 8
      // 09b: aload 8
      // 09d: aload 6
      // 09f: ifnonnull 144
      // 0a2: ifnull 143
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aload 8
      // 0ae: aload 2
      // 0af: invokevirtual com/finalshell/core/Ep4.a (Ljava/lang/String;)Lcom/finalshell/core/UT_2;
      // 0b2: astore 9
      // 0b4: aload 9
      // 0b6: aload 6
      // 0b8: ifnonnull 0c7
      // 0bb: ifnull 0ce
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: aload 9
      // 0c7: aload 1
      // 0c8: aload 5
      // 0ca: invokevirtual com/finalshell/core/UT_2.D (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0cd: return
      // 0ce: aload 0
      // 0cf: aload 7
      // 0d1: invokevirtual com/finalshell/core/Ph4.e (Ljava/lang/Class;)Lcom/finalshell/core/Nj4;
      // 0d4: astore 10
      // 0d6: aload 10
      // 0d8: aload 1
      // 0d9: invokevirtual com/finalshell/core/Nj4.y (Ljava/lang/Object;)Ljava/util/List;
      // 0dc: astore 11
      // 0de: aload 11
      // 0e0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e5: astore 12
      // 0e7: aload 12
      // 0e9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ee: ifeq 109
      // 0f1: aload 12
      // 0f3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f8: astore 13
      // 0fa: aload 0
      // 0fb: aload 13
      // 0fd: aload 2
      // 0fe: lload 3
      // 0ff: aload 5
      // 101: invokevirtual com/finalshell/core/Ph4.R (Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;)V
      // 104: aload 6
      // 106: ifnull 0e7
      // 109: return
      // 10a: astore 9
      // 10c: new com/finalshell/core/Hf2
      // 10f: dup
      // 110: new java/lang/StringBuilder
      // 113: dup
      // 114: invokespecial java/lang/StringBuilder.<init> ()V
      // 117: sipush 2736
      // 11a: sipush -14310
      // 11d: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: aload 0
      // 124: getfield com/finalshell/core/Ph4.V Ljava/lang/String;
      // 127: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12a: sipush 2738
      // 12d: sipush -30609
      // 130: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 136: aload 2
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13d: aload 9
      // 13f: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 142: athrow
      // 143: aload 1
      // 144: aload 6
      // 146: ifnonnull 15e
      // 149: instanceof java/util/List
      // 14c: ifeq 190
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: aload 1
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15d: athrow
      // 15e: checkcast java/util/List
      // 161: astore 9
      // 163: bipush 0
      // 164: istore 10
      // 166: iload 10
      // 168: aload 9
      // 16a: invokeinterface java/util/List.size ()I 1
      // 16f: if_icmpge 18f
      // 172: aload 9
      // 174: iload 10
      // 176: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 17b: astore 11
      // 17d: aload 0
      // 17e: aload 11
      // 180: aload 2
      // 181: lload 3
      // 182: aload 5
      // 184: invokevirtual com/finalshell/core/Ph4.R (Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;)V
      // 187: iinc 10 1
      // 18a: aload 6
      // 18c: ifnull 166
      // 18f: return
      // 190: return
   }

   public boolean u(Object param1, String param2, long param3, Object param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 6
      // 005: aload 1
      // 006: instanceof java/util/Map
      // 009: aload 6
      // 00b: ifnonnull 03b
      // 00e: ifeq 02b
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 1
      // 019: checkcast java/util/Map
      // 01c: aload 2
      // 01d: aload 5
      // 01f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 024: pop
      // 025: bipush 1
      // 026: ireturn
      // 027: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 1
      // 02c: aload 6
      // 02e: ifnonnull 03f
      // 031: instanceof java/util/List
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: ifeq 08b
      // 03e: aload 1
      // 03f: checkcast java/util/List
      // 042: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 047: astore 7
      // 049: aload 7
      // 04b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 050: ifeq 089
      // 053: aload 7
      // 055: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05a: astore 8
      // 05c: aload 6
      // 05e: ifnonnull 084
      // 061: aload 8
      // 063: ifnonnull 079
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: aload 6
      // 06f: ifnull 049
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: aload 0
      // 07a: aload 8
      // 07c: aload 2
      // 07d: lload 3
      // 07e: aload 5
      // 080: invokevirtual com/finalshell/core/Ph4.u (Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;)Z
      // 083: pop
      // 084: aload 6
      // 086: ifnull 049
      // 089: bipush 1
      // 08a: ireturn
      // 08b: aload 0
      // 08c: getfield com/finalshell/core/Ph4.w Lcom/finalshell/core/IG;
      // 08f: aload 1
      // 090: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 093: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 096: astore 7
      // 098: aconst_null
      // 099: astore 8
      // 09b: aload 7
      // 09d: aload 6
      // 09f: ifnonnull 0b8
      // 0a2: instanceof com/finalshell/core/Ep4
      // 0a5: ifeq 0bd
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 7
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: checkcast com/finalshell/core/Ep4
      // 0bb: astore 8
      // 0bd: aload 8
      // 0bf: aload 6
      // 0c1: ifnonnull 0d0
      // 0c4: ifnull 13e
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 8
      // 0d0: lload 3
      // 0d1: invokevirtual com/finalshell/core/Ep4.k (J)Lcom/finalshell/core/UT_2;
      // 0d4: astore 9
      // 0d6: aload 9
      // 0d8: aload 6
      // 0da: ifnonnull 0ef
      // 0dd: ifnonnull 0ed
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: bipush 0
      // 0e8: ireturn
      // 0e9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: aload 5
      // 0ef: aload 6
      // 0f1: ifnonnull 100
      // 0f4: ifnull 134
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aload 5
      // 100: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 103: aload 9
      // 105: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 108: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 10b: aload 6
      // 10d: ifnonnull 12b
      // 110: if_acmpeq 134
      // 113: goto 11a
      // 116: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 5
      // 11c: aload 9
      // 11e: getfield com/finalshell/core/UT_2.p Lcom/finalshell/core/Ph2;
      // 121: getfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: aload 0
      // 12c: getfield com/finalshell/core/Ph4.w Lcom/finalshell/core/IG;
      // 12f: invokestatic com/finalshell/core/B8_2.I (Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/finalshell/core/IG;)Ljava/lang/Object;
      // 132: astore 5
      // 134: aload 9
      // 136: aload 1
      // 137: aload 5
      // 139: invokevirtual com/finalshell/core/UT_2.D (Ljava/lang/Object;Ljava/lang/Object;)V
      // 13c: bipush 1
      // 13d: ireturn
      // 13e: new java/lang/UnsupportedOperationException
      // 141: dup
      // 142: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 145: athrow
   }

   public boolean N(Object param1, String param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnonnull 029
      // 00b: instanceof java/util/Map
      // 00e: ifeq 08b
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 1
      // 019: checkcast java/util/Map
      // 01c: aload 2
      // 01d: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: astore 5
      // 02b: aload 5
      // 02d: ifnull 038
      // 030: bipush 1
      // 031: goto 039
      // 034: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: bipush 0
      // 039: istore 6
      // 03b: iload 3
      // 03c: aload 4
      // 03e: ifnonnull 08a
      // 041: ifeq 088
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 1
      // 04c: checkcast java/util/Map
      // 04f: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 054: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 059: astore 7
      // 05b: aload 7
      // 05d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 062: ifeq 088
      // 065: aload 7
      // 067: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06c: astore 8
      // 06e: aload 0
      // 06f: aload 8
      // 071: aload 2
      // 072: iload 3
      // 073: invokevirtual com/finalshell/core/Ph4.N (Ljava/lang/Object;Ljava/lang/String;Z)Z
      // 076: aload 4
      // 078: ifnonnull 08a
      // 07b: pop
      // 07c: aload 4
      // 07e: ifnull 05b
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: iload 6
      // 08a: ireturn
      // 08b: aload 0
      // 08c: getfield com/finalshell/core/Ph4.w Lcom/finalshell/core/IG;
      // 08f: aload 1
      // 090: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 093: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 096: astore 5
      // 098: aconst_null
      // 099: astore 6
      // 09b: aload 5
      // 09d: aload 4
      // 09f: ifnonnull 0b8
      // 0a2: instanceof com/finalshell/core/Ep4
      // 0a5: ifeq 0bd
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 5
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: checkcast com/finalshell/core/Ep4
      // 0bb: astore 6
      // 0bd: aload 6
      // 0bf: aload 4
      // 0c1: ifnonnull 0d0
      // 0c4: ifnull 155
      // 0c7: goto 0ce
      // 0ca: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd: athrow
      // 0ce: aload 6
      // 0d0: aload 2
      // 0d1: invokevirtual com/finalshell/core/Ep4.a (Ljava/lang/String;)Lcom/finalshell/core/UT_2;
      // 0d4: astore 7
      // 0d6: bipush 0
      // 0d7: istore 8
      // 0d9: aload 7
      // 0db: aload 4
      // 0dd: ifnonnull 0ec
      // 0e0: ifnull 0f4
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 7
      // 0ec: aload 1
      // 0ed: aconst_null
      // 0ee: invokevirtual com/finalshell/core/UT_2.S (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f1: bipush 1
      // 0f2: istore 8
      // 0f4: iload 3
      // 0f5: aload 4
      // 0f7: ifnonnull 154
      // 0fa: ifeq 152
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: aload 0
      // 105: aload 1
      // 106: invokevirtual com/finalshell/core/Ph4.G (Ljava/lang/Object;)Ljava/util/Collection;
      // 109: astore 9
      // 10b: aload 9
      // 10d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 112: astore 10
      // 114: aload 10
      // 116: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11b: ifeq 152
      // 11e: aload 10
      // 120: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 125: astore 11
      // 127: aload 4
      // 129: ifnonnull 14d
      // 12c: aload 11
      // 12e: ifnonnull 144
      // 131: goto 138
      // 134: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: aload 4
      // 13a: ifnull 114
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 143: athrow
      // 144: aload 0
      // 145: aload 11
      // 147: aload 2
      // 148: iload 3
      // 149: invokevirtual com/finalshell/core/Ph4.N (Ljava/lang/Object;Ljava/lang/String;Z)Z
      // 14c: pop
      // 14d: aload 4
      // 14f: ifnull 114
      // 152: iload 8
      // 154: ireturn
      // 155: iload 3
      // 156: aload 4
      // 158: ifnonnull 166
      // 15b: ifeq 167
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: bipush 0
      // 166: ireturn
      // 167: new java/lang/UnsupportedOperationException
      // 16a: dup
      // 16b: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 16e: athrow
   }

   public Nj4 e(java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 3
      // 05: astore 2
      // 06: aload 0
      // 07: getfield com/finalshell/core/Ph4.F Lcom/finalshell/core/En2;
      // 0a: aload 1
      // 0b: invokevirtual com/finalshell/core/En2.O$ak_2 (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 0e: astore 4
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 2c
      // 16: instanceof com/finalshell/core/Nj4
      // 19: ifeq 30
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 4
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: checkcast com/finalshell/core/Nj4
      // 2f: astore 3
      // 30: aload 3
      // 31: areturn
   }

   public Ep4 Z(java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aconst_null
      // 04: astore 3
      // 05: astore 2
      // 06: aload 0
      // 07: getfield com/finalshell/core/Ph4.w Lcom/finalshell/core/IG;
      // 0a: aload 1
      // 0b: invokevirtual com/finalshell/core/IG.h (Ljava/lang/reflect/Type;)Lcom/finalshell/core/X4;
      // 0e: astore 4
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 2c
      // 16: instanceof com/finalshell/core/Ep4
      // 19: ifeq 30
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 4
      // 25: goto 2c
      // 28: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: checkcast com/finalshell/core/Ep4
      // 2f: astore 3
      // 30: aload 3
      // 31: areturn
   }

   public int T(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: astore 2
      // 004: aload 1
      // 005: aload 2
      // 006: ifnonnull 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 012: athrow
      // 013: bipush -1
      // 014: ireturn
      // 015: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 1
      // 01a: instanceof java/util/Collection
      // 01d: aload 2
      // 01e: ifnonnull 03d
      // 021: ifeq 039
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 1
      // 02c: checkcast java/util/Collection
      // 02f: invokeinterface java/util/Collection.size ()I 1
      // 034: ireturn
      // 035: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: aload 1
      // 03a: instanceof [Ljava/lang/Object;
      // 03d: aload 2
      // 03e: ifnonnull 05c
      // 041: ifeq 055
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 1
      // 04c: checkcast [Ljava/lang/Object;
      // 04f: arraylength
      // 050: ireturn
      // 051: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: aload 1
      // 056: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 059: invokevirtual java/lang/Class.isArray ()Z
      // 05c: aload 2
      // 05d: ifnonnull 077
      // 060: ifeq 073
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: aload 1
      // 06b: invokestatic java/lang/reflect/Array.getLength (Ljava/lang/Object;)I
      // 06e: ireturn
      // 06f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: aload 1
      // 074: instanceof java/util/Map
      // 077: aload 2
      // 078: ifnonnull 086
      // 07b: ifeq 0bf
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: bipush 0
      // 086: istore 3
      // 087: aload 1
      // 088: checkcast java/util/Map
      // 08b: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 090: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 095: astore 4
      // 097: aload 4
      // 099: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09e: ifeq 0bd
      // 0a1: aload 4
      // 0a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a8: astore 5
      // 0aa: aload 5
      // 0ac: ifnull 0b9
      // 0af: iinc 3 1
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: aload 2
      // 0ba: ifnull 097
      // 0bd: iload 3
      // 0be: ireturn
      // 0bf: aload 0
      // 0c0: aload 1
      // 0c1: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0c4: invokevirtual com/finalshell/core/Ph4.e (Ljava/lang/Class;)Lcom/finalshell/core/Nj4;
      // 0c7: astore 3
      // 0c8: aload 3
      // 0c9: aload 2
      // 0ca: ifnonnull 0de
      // 0cd: ifnonnull 0dd
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: bipush -1
      // 0d8: ireturn
      // 0d9: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 3
      // 0de: aload 1
      // 0df: invokevirtual com/finalshell/core/Nj4.J (Ljava/lang/Object;)I
      // 0e2: ireturn
      // 0e3: astore 4
      // 0e5: new com/finalshell/core/Hf2
      // 0e8: dup
      // 0e9: new java/lang/StringBuilder
      // 0ec: dup
      // 0ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f0: sipush 2748
      // 0f3: sipush -6552
      // 0f6: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fc: aload 0
      // 0fd: getfield com/finalshell/core/Ph4.V Ljava/lang/String;
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 106: aload 4
      // 108: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 10b: athrow
   }

   public Set K(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 1
      // 1a: instanceof java/util/Map
      // 1d: aload 2
      // 1e: ifnonnull 3d
      // 21: ifeq 39
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 1
      // 2c: checkcast java/util/Map
      // 2f: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 34: areturn
      // 35: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 1
      // 3a: instanceof java/util/Collection
      // 3d: aload 2
      // 3e: ifnonnull 56
      // 41: ifne 75
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: aload 1
      // 4c: instanceof [Ljava/lang/Object;
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: aload 2
      // 57: ifnonnull 72
      // 5a: ifne 75
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: aload 1
      // 65: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 68: invokevirtual java/lang/Class.isArray ()Z
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: ifeq 7b
      // 75: aconst_null
      // 76: areturn
      // 77: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: aload 0
      // 7c: aload 1
      // 7d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 80: invokevirtual com/finalshell/core/Ph4.e (Ljava/lang/Class;)Lcom/finalshell/core/Nj4;
      // 83: astore 3
      // 84: aload 3
      // 85: aload 2
      // 86: ifnonnull 9a
      // 89: ifnonnull 99
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92: athrow
      // 93: aconst_null
      // 94: areturn
      // 95: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: aload 3
      // 9a: aload 1
      // 9b: invokevirtual com/finalshell/core/Nj4.v (Ljava/lang/Object;)Ljava/util/Set;
      // 9e: areturn
      // 9f: astore 4
      // a1: new com/finalshell/core/Hf2
      // a4: dup
      // a5: new java/lang/StringBuilder
      // a8: dup
      // a9: invokespecial java/lang/StringBuilder.<init> ()V
      // ac: sipush 2749
      // af: sipush -13255
      // b2: invokestatic com/finalshell/core/Ph4.a (II)Ljava/lang/String;
      // b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b8: aload 0
      // b9: getfield com/finalshell/core/Ph4.V Ljava/lang/String;
      // bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c2: aload 4
      // c4: invokespecial com/finalshell/core/Hf2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // c7: athrow
   }

   @Override
   public String V() {
      return Ok2.x(this.V);
   }

   public static Object t(Object param0, String[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: new com/finalshell/ui/model/Oc2
      // 06: dup
      // 07: invokespecial com/finalshell/ui/model/Oc2.<init> ()V
      // 0a: astore 3
      // 0b: astore 2
      // 0c: aload 1
      // 0d: aload 2
      // 0e: ifnonnull 1c
      // 11: ifnull 2b
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 2
      // 1d: ifnonnull 32
      // 20: arraylength
      // 21: ifne 31
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 3
      // 2c: areturn
      // 2d: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 1
      // 32: astore 4
      // 34: aload 4
      // 36: arraylength
      // 37: istore 5
      // 39: bipush 0
      // 3a: istore 6
      // 3c: iload 6
      // 3e: iload 5
      // 40: if_icmpge 77
      // 43: aload 4
      // 45: iload 6
      // 47: aaload
      // 48: astore 7
      // 4a: aload 7
      // 4c: invokestatic com/finalshell/core/Ph4.B (Ljava/lang/String;)Lcom/finalshell/core/Ph4;
      // 4f: astore 8
      // 51: aload 8
      // 53: invokevirtual com/finalshell/core/Ph4.x ()V
      // 56: aload 8
      // 58: aload 0
      // 59: invokevirtual com/finalshell/core/Ph4.S (Ljava/lang/Object;)Ljava/lang/Object;
      // 5c: astore 9
      // 5e: aload 3
      // 5f: aload 2
      // 60: ifnonnull 78
      // 63: aload 9
      // 65: invokevirtual com/finalshell/ui/model/Oc2.add (Ljava/lang/Object;)Z
      // 68: pop
      // 69: iinc 6 1
      // 6c: aload 2
      // 6d: ifnull 3c
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aload 3
      // 78: areturn
   }

   public static Object b(Object param0, String[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 2
      // 06: ifnonnull 32
      // 09: ifnull 2a
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: ifnonnull 32
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: arraylength
      // 20: ifne 33
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: areturn
      // 33: new com/finalshell/ui/model/O0
      // 36: dup
      // 37: bipush 1
      // 38: invokespecial com/finalshell/ui/model/O0.<init> (Z)V
      // 3b: astore 3
      // 3c: aload 1
      // 3d: astore 4
      // 3f: aload 4
      // 41: arraylength
      // 42: istore 5
      // 44: bipush 0
      // 45: istore 6
      // 47: iload 6
      // 49: iload 5
      // 4b: if_icmpge b3
      // 4e: aload 4
      // 50: iload 6
      // 52: aaload
      // 53: astore 7
      // 55: aload 7
      // 57: invokestatic com/finalshell/core/Ph4.B (Ljava/lang/String;)Lcom/finalshell/core/Ph4;
      // 5a: astore 8
      // 5c: aload 8
      // 5e: invokevirtual com/finalshell/core/Ph4.x ()V
      // 61: aload 8
      // 63: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 66: aload 8
      // 68: getfield com/finalshell/core/Ph4.K [Lcom/finalshell/core/A0_2;
      // 6b: arraylength
      // 6c: bipush 1
      // 6d: isub
      // 6e: aaload
      // 6f: astore 9
      // 71: aload 2
      // 72: ifnonnull af
      // 75: aload 9
      // 77: instanceof com/finalshell/core/W3_2
      // 7a: ifeq ac
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: aload 8
      // 86: aload 0
      // 87: invokevirtual com/finalshell/core/Ph4.S (Ljava/lang/Object;)Ljava/lang/Object;
      // 8a: astore 10
      // 8c: aload 10
      // 8e: ifnonnull 9c
      // 91: aload 2
      // 92: ifnull ac
      // 95: goto 9c
      // 98: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: aload 8
      // 9e: aload 3
      // 9f: aload 10
      // a1: invokevirtual com/finalshell/core/Ph4.G (Ljava/lang/Object;Ljava/lang/Object;)Z
      // a4: pop
      // a5: goto ac
      // a8: invokestatic com/finalshell/core/Ph4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab: athrow
      // ac: iinc 6 1
      // af: aload 2
      // b0: ifnull 47
      // b3: aload 3
      // b4: areturn
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 2751) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 205;
               break;
            case 1:
               var10000 = 80;
               break;
            case 2:
               var10000 = 47;
               break;
            case 3:
               var10000 = 177;
               break;
            case 4:
               var10000 = 194;
               break;
            case 5:
               var10000 = 38;
               break;
            case 6:
               var10000 = 250;
               break;
            case 7:
               var10000 = 207;
               break;
            case 8:
               var10000 = 46;
               break;
            case 9:
               var10000 = 239;
               break;
            case 10:
               var10000 = 148;
               break;
            case 11:
               var10000 = 75;
               break;
            case 12:
               var10000 = 126;
               break;
            case 13:
               var10000 = 210;
               break;
            case 14:
               var10000 = 98;
               break;
            case 15:
               var10000 = 4;
               break;
            case 16:
               var10000 = 107;
               break;
            case 17:
               var10000 = 99;
               break;
            case 18:
               var10000 = 234;
               break;
            case 19:
               var10000 = 67;
               break;
            case 20:
               var10000 = 145;
               break;
            case 21:
               var10000 = 95;
               break;
            case 22:
               var10000 = 235;
               break;
            case 23:
               var10000 = 109;
               break;
            case 24:
               var10000 = 31;
               break;
            case 25:
               var10000 = 37;
               break;
            case 26:
               var10000 = 246;
               break;
            case 27:
               var10000 = 146;
               break;
            case 28:
               var10000 = 181;
               break;
            case 29:
               var10000 = 1;
               break;
            case 30:
               var10000 = 253;
               break;
            case 31:
               var10000 = 92;
               break;
            case 32:
               var10000 = 189;
               break;
            case 33:
               var10000 = 196;
               break;
            case 34:
               var10000 = 43;
               break;
            case 35:
               var10000 = 85;
               break;
            case 36:
               var10000 = 76;
               break;
            case 37:
               var10000 = 26;
               break;
            case 38:
               var10000 = 151;
               break;
            case 39:
               var10000 = 121;
               break;
            case 40:
               var10000 = 117;
               break;
            case 41:
               var10000 = 101;
               break;
            case 42:
               var10000 = 35;
               break;
            case 43:
               var10000 = 212;
               break;
            case 44:
               var10000 = 74;
               break;
            case 45:
               var10000 = 56;
               break;
            case 46:
               var10000 = 50;
               break;
            case 47:
               var10000 = 10;
               break;
            case 48:
               var10000 = 57;
               break;
            case 49:
               var10000 = 23;
               break;
            case 50:
               var10000 = 17;
               break;
            case 51:
               var10000 = 222;
               break;
            case 52:
               var10000 = 167;
               break;
            case 53:
               var10000 = 150;
               break;
            case 54:
               var10000 = 165;
               break;
            case 55:
               var10000 = 200;
               break;
            case 56:
               var10000 = 159;
               break;
            case 57:
               var10000 = 137;
               break;
            case 58:
               var10000 = 11;
               break;
            case 59:
               var10000 = 252;
               break;
            case 60:
               var10000 = 166;
               break;
            case 61:
               var10000 = 223;
               break;
            case 62:
               var10000 = 201;
               break;
            case 63:
               var10000 = 247;
               break;
            case 64:
               var10000 = 131;
               break;
            case 65:
               var10000 = 25;
               break;
            case 66:
               var10000 = 244;
               break;
            case 67:
               var10000 = 58;
               break;
            case 68:
               var10000 = 168;
               break;
            case 69:
               var10000 = 48;
               break;
            case 70:
               var10000 = 5;
               break;
            case 71:
               var10000 = 185;
               break;
            case 72:
               var10000 = 202;
               break;
            case 73:
               var10000 = 154;
               break;
            case 74:
               var10000 = 221;
               break;
            case 75:
               var10000 = 174;
               break;
            case 76:
               var10000 = 172;
               break;
            case 77:
               var10000 = 128;
               break;
            case 78:
               var10000 = 52;
               break;
            case 79:
               var10000 = 63;
               break;
            case 80:
               var10000 = 171;
               break;
            case 81:
               var10000 = 169;
               break;
            case 82:
               var10000 = 83;
               break;
            case 83:
               var10000 = 54;
               break;
            case 84:
               var10000 = 44;
               break;
            case 85:
               var10000 = 62;
               break;
            case 86:
               var10000 = 149;
               break;
            case 87:
               var10000 = 173;
               break;
            case 88:
               var10000 = 218;
               break;
            case 89:
               var10000 = 19;
               break;
            case 90:
               var10000 = 93;
               break;
            case 91:
               var10000 = 197;
               break;
            case 92:
               var10000 = 255;
               break;
            case 93:
               var10000 = 216;
               break;
            case 94:
               var10000 = 118;
               break;
            case 95:
               var10000 = 227;
               break;
            case 96:
               var10000 = 9;
               break;
            case 97:
               var10000 = 232;
               break;
            case 98:
               var10000 = 113;
               break;
            case 99:
               var10000 = 132;
               break;
            case 100:
               var10000 = 28;
               break;
            case 101:
               var10000 = 213;
               break;
            case 102:
               var10000 = 195;
               break;
            case 103:
               var10000 = 21;
               break;
            case 104:
               var10000 = 49;
               break;
            case 105:
               var10000 = 115;
               break;
            case 106:
               var10000 = 243;
               break;
            case 107:
               var10000 = 106;
               break;
            case 108:
               var10000 = 226;
               break;
            case 109:
               var10000 = 64;
               break;
            case 110:
               var10000 = 79;
               break;
            case 111:
               var10000 = 190;
               break;
            case 112:
               var10000 = 32;
               break;
            case 113:
               var10000 = 236;
               break;
            case 114:
               var10000 = 2;
               break;
            case 115:
               var10000 = 45;
               break;
            case 116:
               var10000 = 41;
               break;
            case 117:
               var10000 = 24;
               break;
            case 118:
               var10000 = 104;
               break;
            case 119:
               var10000 = 34;
               break;
            case 120:
               var10000 = 178;
               break;
            case 121:
               var10000 = 156;
               break;
            case 122:
               var10000 = 158;
               break;
            case 123:
               var10000 = 130;
               break;
            case 124:
               var10000 = 124;
               break;
            case 125:
               var10000 = 72;
               break;
            case 126:
               var10000 = 90;
               break;
            case 127:
               var10000 = 78;
               break;
            case 128:
               var10000 = 91;
               break;
            case 129:
               var10000 = 161;
               break;
            case 130:
               var10000 = 191;
               break;
            case 131:
               var10000 = 182;
               break;
            case 132:
               var10000 = 123;
               break;
            case 133:
               var10000 = 61;
               break;
            case 134:
               var10000 = 112;
               break;
            case 135:
               var10000 = 122;
               break;
            case 136:
               var10000 = 77;
               break;
            case 137:
               var10000 = 84;
               break;
            case 138:
               var10000 = 73;
               break;
            case 139:
               var10000 = 160;
               break;
            case 140:
               var10000 = 65;
               break;
            case 141:
               var10000 = 15;
               break;
            case 142:
               var10000 = 30;
               break;
            case 143:
               var10000 = 86;
               break;
            case 144:
               var10000 = 66;
               break;
            case 145:
               var10000 = 36;
               break;
            case 146:
               var10000 = 211;
               break;
            case 147:
               var10000 = 81;
               break;
            case 148:
               var10000 = 245;
               break;
            case 149:
               var10000 = 241;
               break;
            case 150:
               var10000 = 179;
               break;
            case 151:
               var10000 = 133;
               break;
            case 152:
               var10000 = 40;
               break;
            case 153:
               var10000 = 144;
               break;
            case 154:
               var10000 = 238;
               break;
            case 155:
               var10000 = 114;
               break;
            case 156:
               var10000 = 198;
               break;
            case 157:
               var10000 = 224;
               break;
            case 158:
               var10000 = 7;
               break;
            case 159:
               var10000 = 20;
               break;
            case 160:
               var10000 = 170;
               break;
            case 161:
               var10000 = 184;
               break;
            case 162:
               var10000 = 8;
               break;
            case 163:
               var10000 = 100;
               break;
            case 164:
               var10000 = 164;
               break;
            case 165:
               var10000 = 139;
               break;
            case 166:
               var10000 = 59;
               break;
            case 167:
               var10000 = 14;
               break;
            case 168:
               var10000 = 88;
               break;
            case 169:
               var10000 = 55;
               break;
            case 170:
               var10000 = 208;
               break;
            case 171:
               var10000 = 138;
               break;
            case 172:
               var10000 = 141;
               break;
            case 173:
               var10000 = 162;
               break;
            case 174:
               var10000 = 215;
               break;
            case 175:
               var10000 = 204;
               break;
            case 176:
               var10000 = 51;
               break;
            case 177:
               var10000 = 225;
               break;
            case 178:
               var10000 = 233;
               break;
            case 179:
               var10000 = 135;
               break;
            case 180:
               var10000 = 18;
               break;
            case 181:
               var10000 = 87;
               break;
            case 182:
               var10000 = 102;
               break;
            case 183:
               var10000 = 96;
               break;
            case 184:
               var10000 = 125;
               break;
            case 185:
               var10000 = 103;
               break;
            case 186:
               var10000 = 183;
               break;
            case 187:
               var10000 = 140;
               break;
            case 188:
               var10000 = 127;
               break;
            case 189:
               var10000 = 209;
               break;
            case 190:
               var10000 = 143;
               break;
            case 191:
               var10000 = 248;
               break;
            case 192:
               var10000 = 105;
               break;
            case 193:
               var10000 = 89;
               break;
            case 194:
               var10000 = 94;
               break;
            case 195:
               var10000 = 163;
               break;
            case 196:
               var10000 = 60;
               break;
            case 197:
               var10000 = 203;
               break;
            case 198:
               var10000 = 42;
               break;
            case 199:
               var10000 = 254;
               break;
            case 200:
               var10000 = 110;
               break;
            case 201:
               var10000 = 206;
               break;
            case 202:
               var10000 = 12;
               break;
            case 203:
               var10000 = 119;
               break;
            case 204:
               var10000 = 108;
               break;
            case 205:
               var10000 = 120;
               break;
            case 206:
               var10000 = 142;
               break;
            case 207:
               var10000 = 186;
               break;
            case 208:
               var10000 = 228;
               break;
            case 209:
               var10000 = 237;
               break;
            case 210:
               var10000 = 187;
               break;
            case 211:
               var10000 = 53;
               break;
            case 212:
               var10000 = 97;
               break;
            case 213:
               var10000 = 199;
               break;
            case 214:
               var10000 = 16;
               break;
            case 215:
               var10000 = 29;
               break;
            case 216:
               var10000 = 70;
               break;
            case 217:
               var10000 = 214;
               break;
            case 218:
               var10000 = 68;
               break;
            case 219:
               var10000 = 13;
               break;
            case 220:
               var10000 = 33;
               break;
            case 221:
               var10000 = 71;
               break;
            case 222:
               var10000 = 231;
               break;
            case 223:
               var10000 = 6;
               break;
            case 224:
               var10000 = 230;
               break;
            case 225:
               var10000 = 176;
               break;
            case 226:
               var10000 = 229;
               break;
            case 227:
               var10000 = 22;
               break;
            case 228:
               var10000 = 147;
               break;
            case 229:
               var10000 = 155;
               break;
            case 230:
               var10000 = 240;
               break;
            case 231:
               var10000 = 69;
               break;
            case 232:
               var10000 = 192;
               break;
            case 233:
               var10000 = 111;
               break;
            case 234:
               var10000 = 116;
               break;
            case 235:
               var10000 = 251;
               break;
            case 236:
               var10000 = 0;
               break;
            case 237:
               var10000 = 3;
               break;
            case 238:
               var10000 = 129;
               break;
            case 239:
               var10000 = 134;
               break;
            case 240:
               var10000 = 153;
               break;
            case 241:
               var10000 = 220;
               break;
            case 242:
               var10000 = 219;
               break;
            case 243:
               var10000 = 136;
               break;
            case 244:
               var10000 = 180;
               break;
            case 245:
               var10000 = 249;
               break;
            case 246:
               var10000 = 39;
               break;
            case 247:
               var10000 = 242;
               break;
            case 248:
               var10000 = 27;
               break;
            case 249:
               var10000 = 188;
               break;
            case 250:
               var10000 = 82;
               break;
            case 251:
               var10000 = 217;
               break;
            case 252:
               var10000 = 157;
               break;
            case 253:
               var10000 = 175;
               break;
            case 254:
               var10000 = 152;
               break;
            default:
               var10000 = 193;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8013;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 31502) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[17];
      int var19 = 0;
      String var18 = "1.\u0006\u00009Ó\u00172z(¼oë\u001a[Ö¡ô~\u0081R\fÇ^!ø\u0011ßB\u009dò\u0098?§ÖÜ8\u0003k2rk\u0095@ò8ÈÐ%K£Ð\u0006S\u0017(ø\u008d\u0013ÍeyÎ\"L%~ÕêåÉû¸A\u001bâÓS\u00111\u008eæ³Éï@±_ò\u000bî#©«q\u0019\u0014õõ)\u0087½\n¥\u0081AÑn\tXàÊ\b\u008aä\u0014!\u0018ùÄ\u0083\u0016ÿ(b#Ù®\u0011\u0095ìdOM\u0000Uoh\u0092j5ÿ\u0015¨¢5\u0091_áÛtãæ\u009clÑùùa\u008eßÐÏú\f0\u0013Þ\u0005\u009cÆ/Wñ9Ûb\"\u007f\u001eÏ\u0006]\u0002x'hV½\u0084ÇÇXñ´*\u0005\u0015\u0094h\u0081ª1\u009f¹\u009føè>\u0012xT!Ã¬¸õq\u0004\u0005á\u0014\rªCÍ\u0004ë\u009fP('EÔ>Mûøx¦}\u009dxñ\u0015¶\u001aPÉÊY?\u0091ÌS-[\u008d\u0089;Jcâ\u0091¾ÞÊI|Orué\u000b5¶\u0014!ó\u0099¢ò¸\u008b\"\u0018\u00adµ\u0095sK½Yÿ³\u0091\u0085XÌü¿\n=oíò b\u0089\u0093\u000bE\u008e\u001a&2y\u009aî¿\bÂ\u001a{î¯½\u0093\rYÀ\u009f)ÛÇñ\u0083:Ûº\u0099».åàÚáÇ\u009b";
      int var20 = "1.\u0006\u00009Ó\u00172z(¼oë\u001a[Ö¡ô~\u0081R\fÇ^!ø\u0011ßB\u009dò\u0098?§ÖÜ8\u0003k2rk\u0095@ò8ÈÐ%K£Ð\u0006S\u0017(ø\u008d\u0013ÍeyÎ\"L%~ÕêåÉû¸A\u001bâÓS\u00111\u008eæ³Éï@±_ò\u000bî#©«q\u0019\u0014õõ)\u0087½\n¥\u0081AÑn\tXàÊ\b\u008aä\u0014!\u0018ùÄ\u0083\u0016ÿ(b#Ù®\u0011\u0095ìdOM\u0000Uoh\u0092j5ÿ\u0015¨¢5\u0091_áÛtãæ\u009clÑùùa\u008eßÐÏú\f0\u0013Þ\u0005\u009cÆ/Wñ9Ûb\"\u007f\u001eÏ\u0006]\u0002x'hV½\u0084ÇÇXñ´*\u0005\u0015\u0094h\u0081ª1\u009f¹\u009føè>\u0012xT!Ã¬¸õq\u0004\u0005á\u0014\rªCÍ\u0004ë\u009fP('EÔ>Mûøx¦}\u009dxñ\u0015¶\u001aPÉÊY?\u0091ÌS-[\u008d\u0089;Jcâ\u0091¾ÞÊI|Orué\u000b5¶\u0014!ó\u0099¢ò¸\u008b\"\u0018\u00adµ\u0095sK½Yÿ³\u0091\u0085XÌü¿\n=oíò b\u0089\u0093\u000bE\u008e\u001a&2y\u009aî¿\bÂ\u001a{î¯½\u0093\rYÀ\u009f)ÛÇñ\u0083:Ûº\u0099».åàÚáÇ\u009b"
         .length();
      char var17 = 24;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 126;
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
                        var84 = 125;
                        break;
                     case 1:
                        var84 = 83;
                        break;
                     case 2:
                        var84 = 118;
                        break;
                     case 3:
                        var84 = 109;
                        break;
                     case 4:
                        var84 = 116;
                        break;
                     case 5:
                        var84 = 13;
                        break;
                     default:
                        var84 = 5;
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
                     b = new String[17];
                     long var8 = 2610527661910028729L;
                     long[] var14 = new long[6];
                     int var11 = 0;
                     String var12 = "zu¿¡ÃúDå\u009e\u0012\u008dF\u0099ºG\u0088\u0014\u0000~Û¹[¦Ïy\u0006P\u0001âQàã";
                     int var13 = "zu¿¡ÃúDå\u009e\u0012\u008dF\u0099ºG\u0088\u0014\u0000~Û¹[¦Ïy\u0006P\u0001âQàã".length();
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
                                    d = new Integer[6];
                                    long var0 = 4180382787613909172L;
                                    long[] var6 = new long[20];
                                    int var3 = 0;
                                    String var4 = "D\\\u0091Þ.m×ã\u009bKÒ°í\u0097\u0091\u009cÄÜ\u007f_\u0099\u001bü\bJ\u00015\u0083ÜF\u0081`\u0088þ;gjWëÊé\u008el3_\u0097±¨sÏ;\t\u0098\u0019$â\u0003\u007f\u0096ëV\u0091{»±\u0017,#\u0011\u0007Ì«²\"!\u0081GR\u0091\r={À\u0013±\u0081W\u0081G.\u008a\u0003J?\u0085ÓÉz\u00975\u0096q¬Ôf\u001cË\u0089H¤ÄØäÎ\u0088\u0098º©¶\u0001xÿO©(îydÞ¢J\u001dHÚ\u0006§ä\u007fg\u0080¼`\u0081\u0096";
                                    int var5 = "D\\\u0091Þ.m×ã\u009bKÒ°í\u0097\u0091\u009cÄÜ\u007f_\u0099\u001bü\bJ\u00015\u0083ÜF\u0081`\u0088þ;gjWëÊé\u008el3_\u0097±¨sÏ;\t\u0098\u0019$â\u0003\u007f\u0096ëV\u0091{»±\u0017,#\u0011\u0007Ì«²\"!\u0081GR\u0091\r={À\u0013±\u0081W\u0081G.\u008a\u0003J?\u0085ÓÉz\u00975\u0096q¬Ôf\u001cË\u0089H¤ÄØäÎ\u0088\u0098º©¶\u0001xÿO©(îydÞ¢J\u001dHÚ\u0006§ä\u007fg\u0080¼`\u0081\u0096"
                                       .length();
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
                                                   f = new Long[20];
                                                   s = new ConcurrentHashMap(a(10897, 1903953822846301660L), 0.75F, 1);
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "¾¹VÎ\u0002\u008aá\u0016£tFú£\u0017\u000eJ";
                                                var5 = "¾¹VÎ\u0002\u008aá\u0016£tFú£\u0017\u000eJ".length();
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

                                 var12 = "\u0098Õ%E×\u0000Gã4\u009fÂ*v\u0004ï¤";
                                 var13 = "\u0098Õ%E×\u0000Gã4\u009fÂ*v\u0004ï¤".length();
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

                  var18 = "ös\b]\u000e\u008e\u0007o\u008esÇ(L\u0087¼XÐ\u000eí\u0003«\u0014)3D©æ98\u0011\u000450ce[\u009b\u0089V\"y\u000f";
                  var20 = "ös\b]\u000e\u008e\u0007o\u008esÇ(L\u0087¼XÐ\u000eí\u0003«\u0014)3D©æ98\u0011\u000450ce[\u009b\u0089V\"y\u000f".length();
                  var17 = 21;
                  var26 = -1;
            }

            var10000 = 35;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}





