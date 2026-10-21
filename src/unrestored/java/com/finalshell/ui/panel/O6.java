package com.finalshell.ui.panel;

import com.finalshell.core.I12;
import com.finalshell.core.I92;
import javax.swing.Icon;

public class O6 extends O {
   public static String a;

   public O6() {
      this(false);
   }

   public O6(boolean var1) {
      this.U(var1);
   }

   public O6(Icon var1) {
      this(var1, false);
   }

   public O6(Icon var1, boolean var2) {
      super(var1);
      this.U(var2);
   }

   public O6(Icon var1, int var2) {
      this(var1, var2, false);
   }

   public O6(Icon var1, int var2, boolean var3) {
      super(var1, var2);
      this.U(var3);
   }

   public O6(String var1) {
      this(var1, false);
   }

   public O6(String var1, boolean var2) {
      super(var1);
      this.U(var2);
   }

   public O6(String var1, int var2) {
      this(var1, var2, false);
   }

   public O6(String var1, int var2, boolean var3) {
      super(var1, var2, new Object[0]);
      this.U(var3);
   }

   public O6(String var1, Icon var2, int var3) {
      this(var1, var2, var3, false);
   }

   public O6(String var1, Icon var2, int var3, boolean var4) {
      super(var1, var2, var3, new Object[0]);
      this.U(var4);
   }

   public boolean E() {
      return this.w().g();
   }

   public void U(boolean var1) {
      this.w().h(var1);
   }

   public I92 w() {
      return (I92)this.getUI();
   }

   @Override
   public void updateUI() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/Oj2.g ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 33
      // 09: invokevirtual com/finalshell/ui/panel/O6.getUI ()Ljavax/swing/plaf/LabelUI;
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic com/finalshell/ui/panel/O6.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 63
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/panel/O6.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: invokevirtual com/finalshell/ui/panel/O6.getUI ()Ljavax/swing/plaf/LabelUI;
      // 25: instanceof com/finalshell/core/I92
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/panel/O6.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: getstatic com/finalshell/core/A9.zd Ljava/lang/String;
      // 36: bipush 0
      // 37: anewarray 41
      // 3a: invokestatic com/finalshell/core/Kp2.w (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d: checkcast com/finalshell/core/I92
      // 40: invokevirtual com/finalshell/ui/panel/O6.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 43: goto 6a
      // 46: astore 2
      // 47: aload 0
      // 48: aload 2
      // 49: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 4c: aload 0
      // 4d: new com/finalshell/core/I92
      // 50: dup
      // 51: invokespecial com/finalshell/core/I92.<init> ()V
      // 54: invokevirtual com/finalshell/ui/panel/O6.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 57: iload 1
      // 58: ifne 6a
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/panel/O6.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual com/finalshell/ui/panel/O6.getUI ()Ljavax/swing/plaf/LabelUI;
      // 67: invokevirtual com/finalshell/ui/panel/O6.setUI (Ljavax/swing/plaf/LabelUI;)V
      // 6a: return
   }

   @Override
   public String getUIClassID() {
      return a;
   }

   @Override
   public I12 R$i1_2() {
      return this.w();
   }

   public static Throwable b(Throwable var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "+{R\u0014\u0013M]\u0011RA\u0002\u001fBi4".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 9;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 9;
         var10006 = var0;
      } else {
         var6 = 9;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 9;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 116;
               break;
            case 1:
               var23 = 23;
               break;
            case 2:
               var23 = 41;
               break;
            case 3:
               var23 = 105;
               break;
            case 4:
               var23 = 115;
               break;
            case 5:
               var23 = 39;
               break;
            default:
               var23 = 53;
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





