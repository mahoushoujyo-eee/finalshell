import java.awt.Component;
import java.util.ArrayList;

class zH implements Runnable {
   String u;
   final zD R;
   final String l;
   final ArrayList D;
   final fp_4 w;
   final tf_4 s;
   final boolean E;
   final Component n;
   final F6 g;
   private static final String a;

   zH(F6 var1, zD var2, String var3, ArrayList var4, fp_4 var5, tf_4 var6, boolean var7, Component var8) {
      this.g = var1;
      this.R = var2;
      this.l = var3;
      this.D = var4;
      this.w = var5;
      this.s = var6;
      this.E = var7;
      this.n = var8;
      com.c.c(463222660491228991L).set(this, null);
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
      // 000: invokestatic F6.i ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: ldc2_w 201123991837700284
      // 008: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 00b: swap
      // 00c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00f: aload 0
      // 010: ldc2_w 232537343999251168
      // 013: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 016: swap
      // 017: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 01a: aload 0
      // 01b: ldc2_w 432568688744742554
      // 01e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 021: swap
      // 022: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 025: aload 0
      // 026: ldc2_w 228027603960754903
      // 029: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 02c: swap
      // 02d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 030: bipush 1
      // 031: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 034: ldc2_w 557010342823591586
      // 037: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 03a: dup_x2
      // 03b: pop
      // 03c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 03f: pop
      // 040: goto 047
      // 043: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 046: athrow
      // 047: aload 0
      // 048: ldc2_w 432568688744742554
      // 04b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 04e: swap
      // 04f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 052: checkcast java/util/ArrayList
      // 055: new gZ
      // 058: dup
      // 059: aload 0
      // 05a: ldc2_w 232537343999251168
      // 05d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 060: swap
      // 061: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 064: checkcast java/lang/String
      // 067: lconst_0
      // 068: aload 0
      // 069: ldc2_w 268643625884029517
      // 06c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 06f: swap
      // 070: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 073: invokestatic com/c.f ()[Ljava/lang/Object;
      // 076: ldc2_w 549229823689592892
      // 079: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 07c: dup_x2
      // 07d: pop
      // 07e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 081: checkcast java/lang/Integer
      // 084: invokevirtual java/lang/Integer.intValue ()I
      // 087: goto 08e
      // 08a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: bipush 1
      // 08f: invokespecial gZ.<init> (Ljava/lang/String;JIZ)V
      // 092: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 095: pop
      // 096: aload 0
      // 097: ldc2_w 201123991837700284
      // 09a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 09d: swap
      // 09e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a1: aload 0
      // 0a2: ldc2_w 432568688744742554
      // 0a5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0a8: swap
      // 0a9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ac: aload 0
      // 0ad: ldc2_w 228027603960754903
      // 0b0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0b3: swap
      // 0b4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b7: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ba: ldc2_w 240644964408848820
      // 0bd: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0c0: dup_x2
      // 0c1: pop
      // 0c2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0c5: pop
      // 0c6: goto 0cd
      // 0c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: ldc2_w 432568688744742554
      // 0d1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0d4: swap
      // 0d5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0d8: checkcast java/util/ArrayList
      // 0db: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0de: astore 2
      // 0df: aload 2
      // 0e0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e5: ifeq 1b1
      // 0e8: aload 2
      // 0e9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ee: checkcast gZ
      // 0f1: astore 3
      // 0f2: aload 0
      // 0f3: ldc2_w 555127086732888715
      // 0f6: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0f9: swap
      // 0fa: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0fd: ldc2_w 627973027287447539
      // 100: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 103: swap
      // 104: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 107: aload 3
      // 108: invokestatic com/c.f ()[Ljava/lang/Object;
      // 10b: ldc2_w 552192581091318882
      // 10e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 111: dup_x2
      // 112: pop
      // 113: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 116: goto 11d
      // 119: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 120: ldc2_w 302012955517893264
      // 123: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 126: dup_x2
      // 127: pop
      // 128: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 12b: pop
      // 12c: goto 133
      // 12f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 132: athrow
      // 133: aload 0
      // 134: iload 1
      // 135: ifeq 1da
      // 138: iload 1
      // 139: ifeq 15f
      // 13c: goto 143
      // 13f: invokestatic zH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: ldc2_w 388817074990652487
      // 146: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 149: swap
      // 14a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 14d: ifeq 1ad
      // 150: goto 157
      // 153: invokestatic zH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: aload 0
      // 158: goto 15f
      // 15b: invokestatic zH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: ldc2_w 555127086732888715
      // 162: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 165: swap
      // 166: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 169: aload 3
      // 16a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 16d: ldc2_w 552192581091318882
      // 170: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 173: dup_x2
      // 174: pop
      // 175: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 178: goto 17f
      // 17b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 182: ldc2_w 405430188584561323
      // 185: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 188: swap
      // 189: aconst_null
      // 18a: swap
      // 18b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 18e: goto 195
      // 191: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 194: athrow
      // 195: bipush 0
      // 196: bipush 0
      // 197: invokestatic com/c.a (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 19a: ldc2_w 326794563214348939
      // 19d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1a0: dup_x2
      // 1a1: pop
      // 1a2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1a5: pop
      // 1a6: goto 1ad
      // 1a9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ac: athrow
      // 1ad: iload 1
      // 1ae: ifne 0df
      // 1b1: goto 1d9
      // 1b4: astore 2
      // 1b5: aload 2
      // 1b6: invokevirtual java/lang/Exception.printStackTrace ()V
      // 1b9: aload 0
      // 1ba: new java/lang/StringBuilder
      // 1bd: dup
      // 1be: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c1: getstatic zH.a Ljava/lang/String;
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: aload 2
      // 1c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ce: ldc2_w 463222660491228991
      // 1d1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 1d9: aload 0
      // 1da: iload 1
      // 1db: ifeq 227
      // 1de: ldc2_w 463222660491228991
      // 1e1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1e4: swap
      // 1e5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1e8: checkcast java/lang/String
      // 1eb: ifnull 21f
      // 1ee: goto 1f5
      // 1f1: invokestatic zH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: aload 0
      // 1f6: ldc2_w 490902422125566715
      // 1f9: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1fc: swap
      // 1fd: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 200: checkcast java/awt/Component
      // 203: aload 0
      // 204: ldc2_w 463222660491228991
      // 207: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 20a: swap
      // 20b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 20e: checkcast java/lang/String
      // 211: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 214: iload 1
      // 215: ifne 238
      // 218: goto 21f
      // 21b: invokestatic zH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21e: athrow
      // 21f: aload 0
      // 220: goto 227
      // 223: invokestatic zH.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 226: athrow
      // 227: ldc2_w 228027603960754903
      // 22a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 22d: swap
      // 22e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 231: checkcast fp_4
      // 234: bipush 0
      // 235: invokevirtual fp_4.setVisible (Z)V
      // 238: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "刵阖旗仉夵奯赖4x".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 58;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      } else {
         var6 = 58;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 47;
               break;
            case 1:
               var23 = 72;
               break;
            case 2:
               var23 = 106;
               break;
            case 3:
               var23 = 5;
               break;
            case 4:
               var23 = 54;
               break;
            case 5:
               var23 = 100;
               break;
            default:
               var23 = 73;
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





