package com.finalshell.core;

public class Z4 extends Z8 {
   public final String c;
   public final String A;
   public final String[] E;
   public final int q;
   public final boolean e;

   public Z4(String var1, boolean var2, String var3, String var4, String[] var5, boolean var6) {
      String var10000 = Hi2.C();
      super(var1, var2);
      String var7 = var10000;
      this.c = var3;
      this.A = var4;
      this.E = var5;
      this.e = var6;
      int var8 = 0;

      label61: {
         label60: {
            try {
               var10000 = var3;
               if (var7 != null) {
                  break label61;
               }

               if (var3 == null) {
                  break label60;
               }
            } catch (Hi2 var15) {
               throw a(var15);
            }

            var8 += var3.length();
         }

         var10000 = var4;
      }

      if (var10000 != null) {
         var8 += var4.length();
      }

      label65: {
         label49: {
            try {
               var10000 = var5;
               if (var7 != null) {
                  break label49;
               }

               if (var5 == null) {
                  break label65;
               }
            } catch (Hi2 var14) {
               throw a(var14);
            }

            var10000 = var5;
         }

         String[] var9 = var10000;
         int var10 = var9.length;
         int var11 = 0;

         while (var11 < var10) {
            String var12 = var9[var11];
            var8 += var12.length();

            try {
               var11++;
               if (var7 != null) {
                  return;
               }

               if (var7 != null) {
                  break;
               }
            } catch (Hi2 var13) {
               throw a(var13);
            }
         }
      }

      this.q = var8;
   }

   @Override
   public boolean x(Ph4 param1, Object param2, Object param3, Object param4) {
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
      // 004: aload 1
      // 005: aload 2
      // 006: aload 4
      // 008: invokevirtual com/finalshell/core/Z4.H (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: astore 6
      // 00d: astore 5
      // 00f: aload 6
      // 011: aload 5
      // 013: ifnonnull 028
      // 016: ifnonnull 026
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 01f: athrow
      // 020: bipush 0
      // 021: ireturn
      // 022: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 025: athrow
      // 026: aload 6
      // 028: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 02b: astore 7
      // 02d: aload 7
      // 02f: invokevirtual java/lang/String.length ()I
      // 032: aload 5
      // 034: ifnonnull 04f
      // 037: aload 0
      // 038: getfield com/finalshell/core/Z4.q I
      // 03b: if_icmpge 04e
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 044: athrow
      // 045: aload 0
      // 046: getfield com/finalshell/core/Z4.e Z
      // 049: ireturn
      // 04a: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 04d: athrow
      // 04e: bipush 0
      // 04f: istore 8
      // 051: aload 0
      // 052: aload 5
      // 054: ifnonnull 099
      // 057: getfield com/finalshell/core/Z4.c Ljava/lang/String;
      // 05a: ifnull 098
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 063: athrow
      // 064: aload 7
      // 066: aload 0
      // 067: getfield com/finalshell/core/Z4.c Ljava/lang/String;
      // 06a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 06d: aload 5
      // 06f: ifnonnull 096
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 078: athrow
      // 079: ifne 08c
      // 07c: goto 083
      // 07f: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 082: athrow
      // 083: aload 0
      // 084: getfield com/finalshell/core/Z4.e Z
      // 087: ireturn
      // 088: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 08b: athrow
      // 08c: iload 8
      // 08e: aload 0
      // 08f: getfield com/finalshell/core/Z4.c Ljava/lang/String;
      // 092: invokevirtual java/lang/String.length ()I
      // 095: iadd
      // 096: istore 8
      // 098: aload 0
      // 099: aload 5
      // 09b: ifnonnull 10c
      // 09e: getfield com/finalshell/core/Z4.E [Ljava/lang/String;
      // 0a1: ifnull 10b
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: getfield com/finalshell/core/Z4.E [Ljava/lang/String;
      // 0af: astore 9
      // 0b1: aload 9
      // 0b3: arraylength
      // 0b4: istore 10
      // 0b6: bipush 0
      // 0b7: istore 11
      // 0b9: iload 11
      // 0bb: iload 10
      // 0bd: if_icmpge 10b
      // 0c0: aload 9
      // 0c2: iload 11
      // 0c4: aaload
      // 0c5: astore 12
      // 0c7: aload 7
      // 0c9: aload 12
      // 0cb: iload 8
      // 0cd: invokevirtual java/lang/String.indexOf (Ljava/lang/String;I)I
      // 0d0: istore 13
      // 0d2: iload 13
      // 0d4: aload 5
      // 0d6: ifnonnull 14a
      // 0d9: bipush -1
      // 0da: aload 5
      // 0dc: ifnonnull 100
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0e5: athrow
      // 0e6: if_icmpne 0f9
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: getfield com/finalshell/core/Z4.e Z
      // 0f4: ireturn
      // 0f5: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 0f8: athrow
      // 0f9: iload 13
      // 0fb: aload 12
      // 0fd: invokevirtual java/lang/String.length ()I
      // 100: iadd
      // 101: istore 8
      // 103: iinc 11 1
      // 106: aload 5
      // 108: ifnull 0b9
      // 10b: aload 0
      // 10c: aload 5
      // 10e: ifnonnull 147
      // 111: getfield com/finalshell/core/Z4.A Ljava/lang/String;
      // 114: ifnull 146
      // 117: goto 11e
      // 11a: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 11d: athrow
      // 11e: aload 7
      // 120: aload 0
      // 121: getfield com/finalshell/core/Z4.A Ljava/lang/String;
      // 124: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 127: aload 5
      // 129: ifnonnull 14a
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 132: athrow
      // 133: ifne 146
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 13c: athrow
      // 13d: aload 0
      // 13e: getfield com/finalshell/core/Z4.e Z
      // 141: ireturn
      // 142: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 145: athrow
      // 146: aload 0
      // 147: getfield com/finalshell/core/Z4.e Z
      // 14a: aload 5
      // 14c: ifnonnull 15a
      // 14f: ifne 15d
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/Z4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 158: athrow
      // 159: bipush 1
      // 15a: goto 15e
      // 15d: bipush 0
      // 15e: ireturn
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }
}





