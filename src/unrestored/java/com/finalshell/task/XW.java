package com.finalshell.task;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.core.ProcessMonitorService;

public class XW implements Runnable {
   public final ProcessMonitorService H;
   public static String a;
   public static long[] b;
   public static Long[] c;

   public XW(ProcessMonitorService var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/KV.b$arrString ()[Ljava/lang/String;
      // 003: aload 0
      // 004: ldc2_w 157659510478786273
      // 007: astore 4
      // 009: ldc2_w 157659510478786273
      // 00c: aload 4
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 014: ldc2_w 423426464359177155
      // 017: astore 7
      // 019: astore 6
      // 01b: ldc2_w 423426464359177155
      // 01e: aload 6
      // 020: aload 7
      // 022: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 025: aload 0
      // 026: ldc2_w 157659510478786273
      // 029: astore 8
      // 02b: ldc2_w 157659510478786273
      // 02e: aload 8
      // 030: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 033: ldc2_w 192945024419546406
      // 036: astore 10
      // 038: ldc2_w 192945024419546406
      // 03b: aload 10
      // 03d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 040: checkcast com/finalshell/crypto/ConnectHost
      // 043: astore 2
      // 044: astore 1
      // 045: aload 0
      // 046: ldc2_w 157659510478786273
      // 049: astore 12
      // 04b: ldc2_w 157659510478786273
      // 04e: aload 12
      // 050: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 053: ldc2_w 288681454708139251
      // 056: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 059: swap
      // 05a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 05d: ifeq 22a
      // 060: aload 0
      // 061: ldc2_w 157659510478786273
      // 064: astore 14
      // 066: ldc2_w 157659510478786273
      // 069: aload 14
      // 06b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06e: aload 0
      // 06f: ldc2_w 157659510478786273
      // 072: astore 16
      // 074: ldc2_w 157659510478786273
      // 077: aload 16
      // 079: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07c: ldc2_w 494234311615034477
      // 07f: astore 18
      // 081: ldc2_w 494234311615034477
      // 084: aload 18
      // 086: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 089: checkcast com/finalshell/ui/panel/ConnectionProperty
      // 08c: invokevirtual com/finalshell/ui/panel/ConnectionProperty.s$Fv_2 ()Lcom/finalshell/core/Fv2_2;
      // 08f: invokeinterface com/finalshell/core/Fv2_2.e ()Lcom/finalshell/crypto/ConnectHost; 1
      // 094: ldc2_w 192945024419546406
      // 097: astore 21
      // 099: astore 20
      // 09b: ldc2_w 192945024419546406
      // 09e: aload 20
      // 0a0: aload 21
      // 0a2: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0a5: aload 1
      // 0a6: ifnonnull 22e
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/task/XW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0af: athrow
      // 0b0: aload 1
      // 0b1: ifnonnull 223
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/task/XW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: ldc2_w 157659510478786273
      // 0bf: astore 22
      // 0c1: ldc2_w 157659510478786273
      // 0c4: aload 22
      // 0c6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c9: ldc2_w 192945024419546406
      // 0cc: astore 24
      // 0ce: ldc2_w 192945024419546406
      // 0d1: aload 24
      // 0d3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d6: checkcast com/finalshell/crypto/ConnectHost
      // 0d9: ifnull 217
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/task/XW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: ldc2_w 157659510478786273
      // 0e7: astore 26
      // 0e9: ldc2_w 157659510478786273
      // 0ec: aload 26
      // 0ee: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f1: ldc2_w 192945024419546406
      // 0f4: astore 28
      // 0f6: ldc2_w 192945024419546406
      // 0f9: aload 28
      // 0fb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0fe: checkcast com/finalshell/crypto/ConnectHost
      // 101: aload 2
      // 102: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 105: aload 1
      // 106: ifnonnull 1c0
      // 109: goto 110
      // 10c: invokestatic com/finalshell/task/XW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 10f: athrow
      // 110: ifne 194
      // 113: goto 11a
      // 116: invokestatic com/finalshell/task/XW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 119: athrow
      // 11a: sipush 28891
      // 11d: ldc2_w 6882500815543552535
      // 120: invokestatic com/finalshell/task/XW.a (IJ)J
      // 123: invokestatic java/lang/Thread.sleep (J)V
      // 126: goto 132
      // 129: astore 3
      // 12a: aload 3
      // 12b: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 12e: aload 1
      // 12f: ifnull 045
      // 132: aload 0
      // 133: ldc2_w 157659510478786273
      // 136: astore 30
      // 138: ldc2_w 157659510478786273
      // 13b: aload 30
      // 13d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 140: new java/lang/StringBuilder
      // 143: dup
      // 144: invokespecial java/lang/StringBuilder.<init> ()V
      // 147: ldc2_w 133405405151830121
      // 14a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 14d: aconst_null
      // 14e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 151: checkcast java/lang/String
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: getstatic com/finalshell/task/XW.a Ljava/lang/String;
      // 15a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 160: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 163: ldc2_w 316461647454649571
      // 166: astore 33
      // 168: astore 32
      // 16a: ldc2_w 316461647454649571
      // 16d: aload 32
      // 16f: aload 33
      // 171: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 174: pop
      // 175: goto 17c
      // 178: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: sipush 963
      // 17f: ldc2_w 6957899445032335628
      // 182: invokestatic com/finalshell/task/XW.a (IJ)J
      // 185: invokestatic java/lang/Thread.sleep (J)V
      // 188: goto 194
      // 18b: astore 3
      // 18c: aload 3
      // 18d: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 190: aload 1
      // 191: ifnull 045
      // 194: aload 0
      // 195: ldc2_w 157659510478786273
      // 198: astore 34
      // 19a: ldc2_w 157659510478786273
      // 19d: aload 34
      // 19f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1a2: ldc2_w 192945024419546406
      // 1a5: astore 36
      // 1a7: ldc2_w 192945024419546406
      // 1aa: aload 36
      // 1ac: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1af: checkcast com/finalshell/crypto/ConnectHost
      // 1b2: aload 1
      // 1b3: ifnonnull 216
      // 1b6: invokevirtual com/finalshell/crypto/ConnectHost.t$boolean ()Z
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/task/XW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1bf: athrow
      // 1c0: ifeq 1f8
      // 1c3: ldc2_w 388376917454860932
      // 1c6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1c9: aconst_null
      // 1ca: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1cd: new com/finalshell/task/Mt2
      // 1d0: dup
      // 1d1: aload 0
      // 1d2: invokespecial com/finalshell/task/Mt2.<init> (Lcom/finalshell/task/XW;)V
      // 1d5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d8: ldc2_w 434592463220957006
      // 1db: astore 39
      // 1dd: astore 38
      // 1df: ldc2_w 434592463220957006
      // 1e2: aload 38
      // 1e4: aload 39
      // 1e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e9: pop
      // 1ea: goto 1f1
      // 1ed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: goto 1f8
      // 1f4: invokestatic com/finalshell/task/XW.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: ldc2_w 157659510478786273
      // 1fc: astore 40
      // 1fe: ldc2_w 157659510478786273
      // 201: aload 40
      // 203: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 206: ldc2_w 192945024419546406
      // 209: astore 42
      // 20b: ldc2_w 192945024419546406
      // 20e: aload 42
      // 210: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 213: checkcast com/finalshell/crypto/ConnectHost
      // 216: astore 2
      // 217: sipush 13096
      // 21a: ldc2_w 7377152011941546470
      // 21d: invokestatic com/finalshell/task/XW.a (IJ)J
      // 220: invokestatic java/lang/Thread.sleep (J)V
      // 223: goto 045
      // 226: astore 3
      // 227: goto 22a
      // 22a: goto 22e
      // 22d: astore 3
      // 22e: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 15054) & 32767;
      if (c[var3] == null) {
         c[var3] = b[var3] ^ var1;
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "2\nU".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 15;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 15;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 73;
               break;
            case 1:
               var37 = 106;
               break;
            case 2:
               var37 = 42;
               break;
            case 3:
               var37 = 17;
               break;
            case 4:
               var37 = 77;
               break;
            case 5:
               var37 = 60;
               break;
            default:
               var37 = 33;
         }
      } else {
         var25 = 15;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 2787279050392014344L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "@Î\u008f,\u001dT\u0085¶F!\u000b)\u001c\u008b6ðy-é\u0081\u008cNG÷";
            int var13 = "@Î\u008f,\u001dT\u0085¶F!\u000b)\u001c\u008b6ðy-é\u0081\u008cNG÷".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Long[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 15;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 73;
               break;
            case 1:
               var37 = 106;
               break;
            case 2:
               var37 = 42;
               break;
            case 3:
               var37 = 17;
               break;
            case 4:
               var37 = 77;
               break;
            case 5:
               var37 = 60;
               break;
            default:
               var37 = 33;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 73;
                  break;
               case 1:
                  var37 = 106;
                  break;
               case 2:
                  var37 = 42;
                  break;
               case 3:
                  var37 = 17;
                  break;
               case 4:
                  var37 = 77;
                  break;
               case 5:
                  var37 = 60;
                  break;
               default:
                  var37 = 33;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 2787279050392014344L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "@Î\u008f,\u001dT\u0085¶F!\u000b)\u001c\u008b6ðy-é\u0081\u008cNG÷";
               int var5 = "@Î\u008f,\u001dT\u0085¶F!\u000b)\u001c\u008b6ðy-é\u0081\u008cNG÷".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var18 = var3++;
                  long var34 = (
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
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Long[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 73;
                  break;
               case 1:
                  var37 = 106;
                  break;
               case 2:
                  var37 = 42;
                  break;
               case 3:
                  var37 = 17;
                  break;
               case 4:
                  var37 = 77;
                  break;
               case 5:
                  var37 = 60;
                  break;
               default:
                  var37 = 33;
            }
         }
      }
   }
}





