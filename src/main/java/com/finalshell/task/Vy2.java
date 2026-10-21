package com.finalshell.task;

import com.finalshell.connection.Connection12;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.ProgressDialog;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Address;
import java.awt.Component;
import java.util.ArrayList;

public class Vy2 implements Runnable {
   public String F;
   public final Connection12 N;
   public final String s;
   public final ArrayList Q;
   public final ProgressDialog f;
   public final Tf4 l;
   public final boolean T;
   public final Component O;
   public final Address p;
   public static String a;

   public Vy2(Address var1, Connection12 var2, String var3, ArrayList var4, ProgressDialog var5, Tf4 var6, boolean var7, Component var8) {
      this.p = var1;
      this.N = var2;
      this.s = var3;
      this.Q = var4;
      this.f = var5;
      this.l = var6;
      this.T = var7;
      this.O = var8;
      long var10 = 245743023460960921L;
      Object var9 = null;
      Ref.s(245743023460960921L, var9, var10);
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
      // 000: invokestatic com/finalshell/ui/panel/Address.g ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: ldc2_w 490981108767492981
      // 008: astore 4
      // 00a: ldc2_w 490981108767492981
      // 00d: aload 4
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: aload 0
      // 013: ldc2_w 157065654991100686
      // 016: astore 6
      // 018: ldc2_w 157065654991100686
      // 01b: aload 6
      // 01d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 020: aload 0
      // 021: ldc2_w 386205707096012236
      // 024: astore 8
      // 026: ldc2_w 386205707096012236
      // 029: aload 8
      // 02b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02e: aload 0
      // 02f: ldc2_w 214725033384999303
      // 032: astore 10
      // 034: ldc2_w 214725033384999303
      // 037: aload 10
      // 039: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03c: bipush 1
      // 03d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 040: ldc2_w 557010342823591586
      // 043: astore 13
      // 045: astore 12
      // 047: ldc2_w 557010342823591586
      // 04a: aload 12
      // 04c: aload 13
      // 04e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 051: pop
      // 052: goto 059
      // 055: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 058: athrow
      // 059: aload 0
      // 05a: ldc2_w 386205707096012236
      // 05d: astore 14
      // 05f: ldc2_w 386205707096012236
      // 062: aload 14
      // 064: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 067: checkcast java/util/ArrayList
      // 06a: new com/finalshell/core/GZ_2
      // 06d: dup
      // 06e: aload 0
      // 06f: ldc2_w 157065654991100686
      // 072: astore 16
      // 074: ldc2_w 157065654991100686
      // 077: aload 16
      // 079: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 07c: checkcast java/lang/String
      // 07f: lconst_0
      // 080: aload 0
      // 081: ldc2_w 153012443831424579
      // 084: astore 18
      // 086: ldc2_w 153012443831424579
      // 089: aload 18
      // 08b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 091: ldc2_w 549229823689592892
      // 094: astore 21
      // 096: astore 20
      // 098: ldc2_w 549229823689592892
      // 09b: aload 20
      // 09d: aload 21
      // 09f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a2: checkcast java/lang/Integer
      // 0a5: invokevirtual java/lang/Integer.intValue ()I
      // 0a8: goto 0af
      // 0ab: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: bipush 1
      // 0b0: invokespecial com/finalshell/core/GZ_2.<init> (Ljava/lang/String;JIZ)V
      // 0b3: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0b6: pop
      // 0b7: aload 0
      // 0b8: ldc2_w 490981108767492981
      // 0bb: astore 22
      // 0bd: ldc2_w 490981108767492981
      // 0c0: aload 22
      // 0c2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c5: aload 0
      // 0c6: ldc2_w 386205707096012236
      // 0c9: astore 24
      // 0cb: ldc2_w 386205707096012236
      // 0ce: aload 24
      // 0d0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d3: aload 0
      // 0d4: ldc2_w 214725033384999303
      // 0d7: astore 26
      // 0d9: ldc2_w 214725033384999303
      // 0dc: aload 26
      // 0de: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0e4: ldc2_w 240644964408848820
      // 0e7: astore 29
      // 0e9: astore 28
      // 0eb: ldc2_w 240644964408848820
      // 0ee: aload 28
      // 0f0: aload 29
      // 0f2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f5: pop
      // 0f6: goto 0fd
      // 0f9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: ldc2_w 386205707096012236
      // 101: astore 30
      // 103: ldc2_w 386205707096012236
      // 106: aload 30
      // 108: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10b: checkcast java/util/ArrayList
      // 10e: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 111: astore 2
      // 112: aload 2
      // 113: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 118: ifeq 206
      // 11b: aload 2
      // 11c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 121: checkcast com/finalshell/core/GZ_2
      // 124: astore 3
      // 125: aload 0
      // 126: ldc2_w 233826583040849215
      // 129: astore 32
      // 12b: ldc2_w 233826583040849215
      // 12e: aload 32
      // 130: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 133: ldc2_w 627973027287447539
      // 136: astore 34
      // 138: ldc2_w 627973027287447539
      // 13b: aload 34
      // 13d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 140: aload 3
      // 141: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 144: ldc2_w 552192581091318882
      // 147: astore 37
      // 149: astore 36
      // 14b: ldc2_w 552192581091318882
      // 14e: aload 36
      // 150: aload 37
      // 152: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 155: goto 15c
      // 158: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 15f: ldc2_w 302012955517893264
      // 162: astore 39
      // 164: astore 38
      // 166: ldc2_w 302012955517893264
      // 169: aload 38
      // 16b: aload 39
      // 16d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 170: pop
      // 171: goto 178
      // 174: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 177: athrow
      // 178: aload 0
      // 179: iload 1
      // 17a: ifne 235
      // 17d: iload 1
      // 17e: ifne 1a4
      // 181: goto 188
      // 184: invokestatic com/finalshell/task/Vy2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: ldc2_w 493830017050605478
      // 18b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 18e: swap
      // 18f: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 192: ifeq 202
      // 195: goto 19c
      // 198: invokestatic com/finalshell/task/Vy2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: aload 0
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/task/Vy2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: ldc2_w 233826583040849215
      // 1a7: astore 40
      // 1a9: ldc2_w 233826583040849215
      // 1ac: aload 40
      // 1ae: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b1: aload 3
      // 1b2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b5: ldc2_w 552192581091318882
      // 1b8: astore 43
      // 1ba: astore 42
      // 1bc: ldc2_w 552192581091318882
      // 1bf: aload 42
      // 1c1: aload 43
      // 1c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c6: goto 1cd
      // 1c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d0: ldc2_w 405430188584561323
      // 1d3: astore 44
      // 1d5: ldc2_w 405430188584561323
      // 1d8: aload 44
      // 1da: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1dd: goto 1e4
      // 1e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: bipush 0
      // 1e5: bipush 0
      // 1e6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 1e9: ldc2_w 326794563214348939
      // 1ec: astore 47
      // 1ee: astore 46
      // 1f0: ldc2_w 326794563214348939
      // 1f3: aload 46
      // 1f5: aload 47
      // 1f7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fa: pop
      // 1fb: goto 202
      // 1fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 201: athrow
      // 202: iload 1
      // 203: ifeq 112
      // 206: goto 234
      // 209: astore 2
      // 20a: aload 2
      // 20b: invokevirtual java/lang/Exception.printStackTrace ()V
      // 20e: aload 0
      // 20f: new java/lang/StringBuilder
      // 212: dup
      // 213: invokespecial java/lang/StringBuilder.<init> ()V
      // 216: getstatic com/finalshell/task/Vy2.a Ljava/lang/String;
      // 219: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21c: aload 2
      // 21d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 220: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 223: ldc2_w 245743023460960921
      // 226: astore 49
      // 228: astore 48
      // 22a: ldc2_w 245743023460960921
      // 22d: aload 48
      // 22f: aload 49
      // 231: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 234: aload 0
      // 235: iload 1
      // 236: ifne 28b
      // 239: ldc2_w 245743023460960921
      // 23c: astore 50
      // 23e: ldc2_w 245743023460960921
      // 241: aload 50
      // 243: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 246: checkcast java/lang/String
      // 249: ifnull 283
      // 24c: goto 253
      // 24f: invokestatic com/finalshell/task/Vy2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: aload 0
      // 254: ldc2_w 356655282165577433
      // 257: astore 52
      // 259: ldc2_w 356655282165577433
      // 25c: aload 52
      // 25e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 261: checkcast java/awt/Component
      // 264: aload 0
      // 265: ldc2_w 245743023460960921
      // 268: astore 54
      // 26a: ldc2_w 245743023460960921
      // 26d: aload 54
      // 26f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 272: checkcast java/lang/String
      // 275: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 278: iload 1
      // 279: ifeq 29f
      // 27c: goto 283
      // 27f: invokestatic com/finalshell/task/Vy2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 282: athrow
      // 283: aload 0
      // 284: goto 28b
      // 287: invokestatic com/finalshell/task/Vy2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28a: athrow
      // 28b: ldc2_w 214725033384999303
      // 28e: astore 56
      // 290: ldc2_w 214725033384999303
      // 293: aload 56
      // 295: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 298: checkcast com/finalshell/ui/dialog/ProgressDialog
      // 29b: bipush 0
      // 29c: invokevirtual com/finalshell/ui/dialog/ProgressDialog.setVisible (Z)V
      // 29f: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "剽阭旎亟奠夰贍|C".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 64;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 64;
         var10006 = var0;
      } else {
         var6 = 64;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 64;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 29;
               break;
            case 1:
               var23 = 9;
               break;
            case 2:
               var23 = 9;
               break;
            case 3:
               var23 = 41;
               break;
            case 4:
               var23 = 25;
               break;
            case 5:
               var23 = 65;
               break;
            default:
               var23 = 104;
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





