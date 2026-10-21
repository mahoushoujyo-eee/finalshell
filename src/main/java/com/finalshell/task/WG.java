package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.listener.K23;

public class WG implements Runnable {
   String A;
   final K23 e;
   public static String a;

   WG(K23 var1) {
      this.e = var1;
      long var3 = 486747588508308577L;
      Object var2 = null;
      Ref.s(486747588508308577L, var2, var3);
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
      // 000: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 003: aload 0
      // 004: ldc2_w 433113400934995198
      // 007: astore 5
      // 009: ldc2_w 433113400934995198
      // 00c: aload 5
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: ldc2_w 338548643484545888
      // 014: astore 7
      // 016: ldc2_w 338548643484545888
      // 019: aload 7
      // 01b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01e: ldc2_w 305402254993059552
      // 021: astore 9
      // 023: ldc2_w 305402254993059552
      // 026: aload 9
      // 028: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02e: ldc2_w 212042562452272939
      // 031: astore 12
      // 033: astore 11
      // 035: ldc2_w 212042562452272939
      // 038: aload 11
      // 03a: aload 12
      // 03c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03f: checkcast com/finalshell/connection/Connection12
      // 042: goto 049
      // 045: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 048: athrow
      // 049: astore 2
      // 04a: astore 1
      // 04b: aload 0
      // 04c: ldc2_w 433113400934995198
      // 04f: astore 13
      // 051: ldc2_w 433113400934995198
      // 054: aload 13
      // 056: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 059: ldc2_w 338548643484545888
      // 05c: astore 15
      // 05e: ldc2_w 338548643484545888
      // 061: aload 15
      // 063: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 066: ldc2_w 515525013030853953
      // 069: astore 17
      // 06b: ldc2_w 515525013030853953
      // 06e: aload 17
      // 070: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 073: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 076: ldc2_w 498856411508641826
      // 079: astore 20
      // 07b: astore 19
      // 07d: ldc2_w 498856411508641826
      // 080: aload 19
      // 082: aload 20
      // 084: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 087: checkcast java/lang/String
      // 08a: goto 091
      // 08d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 090: athrow
      // 091: astore 3
      // 092: aconst_null
      // 093: astore 4
      // 095: aload 2
      // 096: aload 3
      // 097: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 09a: ldc2_w 276206147642460148
      // 09d: astore 22
      // 09f: astore 21
      // 0a1: ldc2_w 276206147642460148
      // 0a4: aload 21
      // 0a6: aload 22
      // 0a8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ab: checkcast com/finalshell/ui/model/Tf4
      // 0ae: goto 0b5
      // 0b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: astore 4
      // 0b7: aload 0
      // 0b8: ldc2_w 433113400934995198
      // 0bb: astore 23
      // 0bd: ldc2_w 433113400934995198
      // 0c0: aload 23
      // 0c2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c5: ldc2_w 338548643484545888
      // 0c8: astore 25
      // 0ca: ldc2_w 338548643484545888
      // 0cd: aload 25
      // 0cf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d2: ldc2_w 305402254993059552
      // 0d5: astore 27
      // 0d7: ldc2_w 305402254993059552
      // 0da: aload 27
      // 0dc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0df: aload 4
      // 0e1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0e4: ldc2_w 354921658348946569
      // 0e7: astore 30
      // 0e9: astore 29
      // 0eb: ldc2_w 354921658348946569
      // 0ee: aload 29
      // 0f0: aload 30
      // 0f2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f5: pop
      // 0f6: goto 0fd
      // 0f9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: goto 12e
      // 100: astore 4
      // 102: aload 4
      // 104: invokevirtual java/lang/Exception.printStackTrace ()V
      // 107: aload 0
      // 108: new java/lang/StringBuilder
      // 10b: dup
      // 10c: invokespecial java/lang/StringBuilder.<init> ()V
      // 10f: getstatic com/finalshell/task/WG.a Ljava/lang/String;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: aload 4
      // 117: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 11a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11d: ldc2_w 486747588508308577
      // 120: astore 32
      // 122: astore 31
      // 124: ldc2_w 486747588508308577
      // 127: aload 31
      // 129: aload 32
      // 12b: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 12e: aload 0
      // 12f: aload 1
      // 130: ifnull 155
      // 133: ldc2_w 486747588508308577
      // 136: astore 33
      // 138: ldc2_w 486747588508308577
      // 13b: aload 33
      // 13d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 140: checkcast java/lang/String
      // 143: ifnull 196
      // 146: goto 14d
      // 149: invokestatic com/finalshell/task/WG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: aload 0
      // 14e: goto 155
      // 151: invokestatic com/finalshell/task/WG.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: ldc2_w 433113400934995198
      // 158: astore 35
      // 15a: ldc2_w 433113400934995198
      // 15d: aload 35
      // 15f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 162: ldc2_w 338548643484545888
      // 165: astore 37
      // 167: ldc2_w 338548643484545888
      // 16a: aload 37
      // 16c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 16f: ldc2_w 305402254993059552
      // 172: astore 39
      // 174: ldc2_w 305402254993059552
      // 177: aload 39
      // 179: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 17c: checkcast com/finalshell/ui/panel/Connection4
      // 17f: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // 182: aload 0
      // 183: ldc2_w 486747588508308577
      // 186: astore 41
      // 188: ldc2_w 486747588508308577
      // 18b: aload 41
      // 18d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 190: checkcast java/lang/String
      // 193: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 196: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "剑旺奮赠j_".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 32;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 32;
         var10006 = var0;
      } else {
         var6 = 32;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 32;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 70;
               break;
            case 1:
               var23 = 106;
               break;
            case 2:
               var23 = 127;
               break;
            case 3:
               var23 = 101;
               break;
            case 4:
               var23 = 107;
               break;
            case 5:
               var23 = 117;
               break;
            default:
               var23 = 95;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





