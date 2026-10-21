package com.finalshell.core;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.TextAction;

public class Nn2 extends TextAction {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   Nn2() {
      super(a);
   }

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
      // 003: aload 0
      // 004: aload 1
      // 005: invokevirtual com/finalshell/core/Nn2.getTextComponent (Ljava/awt/event/ActionEvent;)Ljavax/swing/text/JTextComponent;
      // 008: astore 3
      // 009: bipush 1
      // 00a: istore 4
      // 00c: astore 2
      // 00d: aload 2
      // 00e: ifnonnull 160
      // 011: aload 3
      // 012: ifnull 15d
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 01b: athrow
      // 01c: aload 3
      // 01d: invokevirtual javax/swing/text/JTextComponent.isEditable ()Z
      // 020: aload 2
      // 021: ifnonnull 162
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 02a: athrow
      // 02b: ifeq 15d
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 034: athrow
      // 035: aload 3
      // 036: invokevirtual javax/swing/text/JTextComponent.getDocument ()Ljavax/swing/text/Document;
      // 039: astore 5
      // 03b: aload 3
      // 03c: invokevirtual javax/swing/text/JTextComponent.getCaret ()Ljavax/swing/text/Caret;
      // 03f: astore 6
      // 041: aload 6
      // 043: invokeinterface javax/swing/text/Caret.getDot ()I 1
      // 048: istore 7
      // 04a: aload 6
      // 04c: invokeinterface javax/swing/text/Caret.getMark ()I 1
      // 051: istore 8
      // 053: iload 7
      // 055: aload 2
      // 056: ifnonnull 08b
      // 059: iload 8
      // 05b: if_icmpeq 082
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 064: athrow
      // 065: aload 5
      // 067: iload 7
      // 069: iload 8
      // 06b: invokestatic java/lang/Math.min (II)I
      // 06e: iload 7
      // 070: iload 8
      // 072: isub
      // 073: invokestatic java/lang/Math.abs (I)I
      // 076: invokeinterface javax/swing/text/Document.remove (II)V 3
      // 07b: bipush 0
      // 07c: istore 4
      // 07e: aload 2
      // 07f: ifnull 158
      // 082: iload 7
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 08a: athrow
      // 08b: aload 2
      // 08c: ifnonnull 09a
      // 08f: ifle 158
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 098: athrow
      // 099: bipush 1
      // 09a: istore 9
      // 09c: iload 7
      // 09e: aload 2
      // 09f: ifnonnull 156
      // 0a2: bipush 1
      // 0a3: if_icmple 147
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0ac: athrow
      // 0ad: aload 5
      // 0af: iload 7
      // 0b1: bipush 2
      // 0b2: isub
      // 0b3: bipush 2
      // 0b4: invokeinterface javax/swing/text/Document.getText (II)Ljava/lang/String; 3
      // 0b9: astore 10
      // 0bb: aload 10
      // 0bd: bipush 0
      // 0be: invokevirtual java/lang/String.charAt (I)C
      // 0c1: istore 11
      // 0c3: aload 10
      // 0c5: bipush 1
      // 0c6: invokevirtual java/lang/String.charAt (I)C
      // 0c9: istore 12
      // 0cb: iload 11
      // 0cd: aload 2
      // 0ce: ifnonnull 156
      // 0d1: sipush 18776
      // 0d4: ldc2_w 130660890681459844
      // 0d7: invokestatic com/finalshell/core/Nn2.a (IJ)I
      // 0da: if_icmplt 147
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0e3: athrow
      // 0e4: iload 11
      // 0e6: aload 2
      // 0e7: ifnonnull 156
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0f0: athrow
      // 0f1: sipush 2900
      // 0f4: ldc2_w 185630937709119114
      // 0f7: invokestatic com/finalshell/core/Nn2.a (IJ)I
      // 0fa: if_icmpgt 147
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 103: athrow
      // 104: iload 12
      // 106: aload 2
      // 107: ifnonnull 156
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 110: athrow
      // 111: sipush 29123
      // 114: ldc2_w 7448228665762708508
      // 117: invokestatic com/finalshell/core/Nn2.a (IJ)I
      // 11a: if_icmplt 147
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 123: athrow
      // 124: iload 12
      // 126: aload 2
      // 127: ifnonnull 156
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 130: athrow
      // 131: sipush 2301
      // 134: ldc2_w 1903566571027399968
      // 137: invokestatic com/finalshell/core/Nn2.a (IJ)I
      // 13a: if_icmpgt 147
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 143: athrow
      // 144: bipush 2
      // 145: istore 9
      // 147: aload 5
      // 149: iload 7
      // 14b: iload 9
      // 14d: isub
      // 14e: iload 9
      // 150: invokeinterface javax/swing/text/Document.remove (II)V 3
      // 155: bipush 0
      // 156: istore 4
      // 158: goto 15d
      // 15b: astore 5
      // 15d: bipush 0
      // 15e: istore 4
      // 160: iload 4
      // 162: ifeq 173
      // 165: invokestatic javax/swing/UIManager.getLookAndFeel ()Ljavax/swing/LookAndFeel;
      // 168: aload 3
      // 169: invokevirtual javax/swing/LookAndFeel.provideErrorFeedback (Ljava/awt/Component;)V
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/core/Nn2.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 172: athrow
      // 173: return
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3549;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "0EtnMZ_$R}}PP\u0007'".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 25;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 25;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 77;
               break;
            case 1:
               var50 = 57;
               break;
            case 2:
               var50 = 1;
               break;
            case 3:
               var50 = 18;
               break;
            case 4:
               var50 = 32;
               break;
            case 5:
               var50 = 38;
               break;
            default:
               var50 = 107;
         }
      } else {
         var34 = 25;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3284116613923233164L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12 = "Ún¿äõ¿\u0007Sàè=oJÀA\b";
            int var13 = "Ún¿äõ¿\u0007Sàè=oJÀA\b".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0099E\u0000¡Yp}\u0090òE:\u001a¸£\u0000ù";
                        var13 = "\u0099E\u0000¡Yp}\u0090òE:\u001a¸£\u0000ù".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 25;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 77;
               break;
            case 1:
               var50 = 57;
               break;
            case 2:
               var50 = 1;
               break;
            case 3:
               var50 = 18;
               break;
            case 4:
               var50 = 32;
               break;
            case 5:
               var50 = 38;
               break;
            default:
               var50 = 107;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 77;
                  break;
               case 1:
                  var50 = 57;
                  break;
               case 2:
                  var50 = 1;
                  break;
               case 3:
                  var50 = 18;
                  break;
               case 4:
                  var50 = 32;
                  break;
               case 5:
                  var50 = 38;
                  break;
               default:
                  var50 = 107;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3284116613923233164L;
               long[] var6 = new long[4];
               int var3 = 0;
               String var4 = "Ún¿äõ¿\u0007Sàè=oJÀA\b";
               int var5 = "Ún¿äõ¿\u0007Sàè=oJÀA\b".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0099E\u0000¡Yp}\u0090òE:\u001a¸£\u0000ù";
                           var5 = "\u0099E\u0000¡Yp}\u0090òE:\u001a¸£\u0000ù".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 77;
                  break;
               case 1:
                  var50 = 57;
                  break;
               case 2:
                  var50 = 1;
                  break;
               case 3:
                  var50 = 18;
                  break;
               case 4:
                  var50 = 32;
                  break;
               case 5:
                  var50 = 38;
                  break;
               default:
                  var50 = 107;
            }
         }
      }
   }
}





