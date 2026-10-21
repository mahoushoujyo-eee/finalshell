package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class XK_2 {
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static void A() {
      ZG_2.Z();
      InputMap var1 = (InputMap)UIManager.get(a(-3088, -27972));
      var1.put(KeyStroke.getKeyStroke(a(29861, 2140787715906078627L), a(13865, 1047338442401137980L)), a(-3081, -24309));
      var1.put(KeyStroke.getKeyStroke(a(2363, 402681433541966381L), a(13865, 1047338442401137980L)), a(-3087, 32338));
      var1.put(KeyStroke.getKeyStroke(a(25594, 7929316003988115694L), a(13865, 1047338442401137980L)), a(-3086, 21919));
      var1.put(KeyStroke.getKeyStroke(a(10641, 7892593651390241419L), a(13865, 1047338442401137980L)), a(-3084, -27271));
      if (Ky4.F$arrString() != null) {
         ZG_2.p(new int[2]);
      }
   }

   public static ZG_2 w$zG(KeyStroke var0) {
      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10002 = Registry.emptyArgs();
      long var10 = 306266403902896148L;
      Object[] var9 = var10002;
      Ref.h(306266403902896148L, var9, var10);
      HashMap var10003 = (HashMap)(Registry.emptyArgs());
      long var12 = 225069668264757241L;
      Object[] var11 = var10003;
      var10003 = Ref.h(225069668264757241L, var11, var12);

      try {
         var10003 = (HashMap)var10003;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      HashMap var2 = var10003;
      ZG_2 var3 = null;
      int[] var19 = ZG_2.Z();
      Iterator var4 = var2.keySet().iterator();
      int[] var1 = var19;

      while (var4.hasNext()) {
         int var5 = (Integer)var4.next();
         ZG_2 var6 = (ZG_2)var2.get(var5);
         if (var1 == null) {
            KeyStroke var10004 = (KeyStroke)(Registry.emptyArgs());
            long var14 = 546345160214988812L;
            Object[] var13 = var10004;
            var10004 = Ref.h(546345160214988812L, var13, var14);

            try {
               var10004 = (KeyStroke)var10004;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            if (!var10004.equals(var0)) {
               continue;
            }
         }

         var3 = var6;
         break;
      }

      return var3;
   }

   public static JMenuItem T(int var0, Action var1) {
      Dd4 var2 = new Dd4(var1);
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 306266403902896148L;
      Object[] var7 = var10002;
      Ref.h(306266403902896148L, var7, var8);
      HashMap var10003 = (HashMap)(Registry.emptyArgs());
      long var10 = 225069668264757241L;
      Object[] var9 = var10003;
      var10003 = Ref.h(225069668264757241L, var9, var10);

      try {
         var10003 = (HashMap)var10003;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      HashMap var3 = var10003;
      ZG_2 var4 = (ZG_2)var3.get(var0);
      if (var4 != null) {
         KeyStroke var10005 = (KeyStroke)(Registry.emptyArgs());
         long var12 = 546345160214988812L;
         Object[] var11 = var10005;
         var10005 = Ref.h(546345160214988812L, var11, var12);

         try {
            var10005 = (KeyStroke)var10005;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         var4.setAccelerator(var10005);
      }

      return var2;
   }

   public static String w$String(KeyStroke var0) {
      int[] var10000 = ZG_2.Z();
      String var2 = KeyEvent.getKeyText(var0.getKeyCode());
      int[] var1 = var10000;
      Registry.packArgs(var2);
      long var5 = 330094358428833085L;
      Object var10001 = Ref.h2(330094358428833085L, var5);

      try {
         var17 = (Boolean)var10001;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      if (var1 == null) {
         if (var17 != 0) {
            Registry.packArgs(var0.getKeyCode());
            long var7 = 456004516276525137L;
            Object var10002 = Ref.h2(456004516276525137L, var7);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            var2 = (String)var10002;
         }

         var17 = var0.getModifiers();
      }

      Registry.packArgs(var17);
      long var9 = 618172242998130527L;
      Object var19 = Ref.h2(618172242998130527L, var9);

      try {
         var19 = (String)var19;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      String var3 = (String)var19;
      var19 = var3;
      if (var1 == null) {
         var19 = Registry.packArgs(var3);
         long var11 = 330094358428833085L;
         Object var10003 = Ref.h2(330094358428833085L, var11);

         try {
            var22 = (Boolean)var10003;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (!var22) {
            String var4 = var3 + a(-3083, 3797) + var2;
            if (var1 != null) {
               return (String)var19;
            }

            if (!var3.contains(var2)) {
               return var4;
            }

            if (var1 != null) {
               return (String)var19;
            }

            if (var2.length() <= 1) {
               return var4;
            }

            if (var1 == null) {
               return var3;
            }
         }
      }

      return (String)var19;
   }

   public static String P(KeyStroke var0) {
      int[] var10000 = ZG_2.Z();
      String var2 = KeyEvent.getKeyText(var0.getKeyCode());
      int[] var1 = var10000;
      Registry.packArgs(var2);
      long var5 = 330094358428833085L;
      Object var10001 = Ref.h2(330094358428833085L, var5);

      try {
         var17 = (Boolean)var10001;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      if (var1 == null) {
         if (var17 != 0) {
            Registry.packArgs(var0.getKeyCode());
            long var7 = 456004516276525137L;
            Object var10002 = Ref.h2(456004516276525137L, var7);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            var2 = (String)var10002;
         }

         var17 = var0.getModifiers();
      }

      Registry.packArgs(var17);
      long var9 = 618172242998130527L;
      Object var19 = Ref.h2(618172242998130527L, var9);

      try {
         var19 = (String)var19;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      String var3 = (String)var19;
      var19 = var3;
      if (var1 == null) {
         var19 = Registry.packArgs(var3);
         long var11 = 330094358428833085L;
         Object var10003 = Ref.h2(330094358428833085L, var11);

         try {
            var22 = (Boolean)var10003;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (!var22) {
            String var4 = var3 + a(-3083, 3797) + var2;
            if (var1 != null) {
               return (String)var19;
            }

            if (!var3.endsWith(var2)) {
               return var4;
            }

            if (var1 != null) {
               return (String)var19;
            }

            if (var2.length() <= 0) {
               return var4;
            }

            if (var1 == null) {
               return var3;
            }
         }
      }

      return (String)var19;
   }

   static String i(int var0) {
      int[] var10000 = ZG_2.Z();
      StringBuilder var2 = new StringBuilder();
      int[] var1 = var10000;
      int var3 = 0;
      int var19 = var0 & a(22207, 4695338234483287483L);
      if (var1 == null) {
         if (var19 != 0) {
            var3 = a(685, 1473476278909759935L);
            String var4 = KeyEvent.getKeyText(var3);
            var2.append(var4 + a(-3082, -30241));
         }

         var19 = var0 & a(2408, 8014799328205830775L);
      }

      if (var1 == null) {
         if (var19 != 0) {
            var3 = a(23927, 6005342388920200811L);
            String var12 = KeyEvent.getKeyText(var3);
            var2.append(var12 + a(-3083, 3797));
         }

         var19 = var0 & a(20883, 6016005928585994890L);
      }

      if (var1 == null) {
         if (var19 != 0) {
            var3 = a(21964, 8533721753083946719L);
            String var13 = KeyEvent.getKeyText(var3);
            var2.append(var13 + a(-3083, 3797));
         }

         var19 = var0 & a(28370, 1279355207993433551L);
      }

      if (var1 == null) {
         if (var19 != 0) {
            var3 = a(16755, 6779327560578609762L);
            String var14 = KeyEvent.getKeyText(var3);
            var2.append(var14 + a(-3083, 3797));
         }

         var19 = var0 & a(17365, 5196606296454410443L);
      }

      if (var1 == null) {
         if (var19 != 0) {
            var3 = a(28894, 3415472712051327941L);
            String var15 = KeyEvent.getKeyText(var3);
            var2.append(var15 + a(-3083, 3797));
         }

         var19 = var0 & a(541, 6692526934269948184L);
      }

      if (var1 == null) {
         if (var19 != 0) {
            var3 = a(32506, 5851297015264677354L);
            String var16 = KeyEvent.getKeyText(var3);
            var2.append(var16 + a(-3083, 3797));
         }

         var19 = var0 & a(19443, 5567264046626814196L);
      }

      label64: {
         if (var1 == null) {
            if (var19 == 0) {
               break label64;
            }

            var3 = a(31675, 1863879119234468003L);
            var19 = var3;
         }

         String var17 = KeyEvent.getKeyText(var19);
         var2.append(var17 + a(-3083, 3797));
      }

      String var18 = var2.toString();
      String var20 = var18;
      if (var1 == null) {
         if (var18.endsWith(a(-3083, 3797))) {
            var18 = var18.substring(0, var18.length() - a(-3083, 3797).length());
         }

         var20 = var18;
      }

      if (var1 != null) {
         Ky4.K(new String[5]);
      }

      return var20;
   }

   public static String r(int param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/ZG_2.Z ()[I
      // 03: sipush 8634
      // 06: ldc2_w 4374253773338497709
      // 09: invokestatic com/finalshell/core/XK_2.a (IJ)I
      // 0c: istore 2
      // 0d: ldc java/awt/event/KeyEvent
      // 0f: invokevirtual java/lang/Class.getDeclaredFields ()[Ljava/lang/reflect/Field;
      // 12: astore 3
      // 13: astore 1
      // 14: bipush 0
      // 15: istore 4
      // 17: iload 4
      // 19: aload 3
      // 1a: arraylength
      // 1b: if_icmpge b9
      // 1e: aload 3
      // 1f: iload 4
      // 21: aaload
      // 22: aload 1
      // 23: ifnonnull 3f
      // 26: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 29: iload 2
      // 2a: if_icmpne ad
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/XK_2.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 33: athrow
      // 34: aload 3
      // 35: iload 4
      // 37: aaload
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/XK_2.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 3e: athrow
      // 3f: aload 1
      // 40: ifnonnull 5e
      // 43: invokevirtual java/lang/reflect/Field.getType ()Ljava/lang/Class;
      // 46: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 49: if_acmpne ad
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/XK_2.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 52: athrow
      // 53: aload 3
      // 54: iload 4
      // 56: aaload
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/XK_2.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 5d: athrow
      // 5e: invokevirtual java/lang/reflect/Field.getName ()Ljava/lang/String;
      // 61: sipush -3085
      // 64: sipush -8136
      // 67: invokestatic com/finalshell/core/XK_2.a (II)Ljava/lang/String;
      // 6a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 6d: aload 1
      // 6e: ifnonnull 96
      // 71: ifeq ad
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/XK_2.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 7a: athrow
      // 7b: aload 3
      // 7c: iload 4
      // 7e: aaload
      // 7f: aload 1
      // 80: ifnonnull a5
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/XK_2.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 89: athrow
      // 8a: ldc java/awt/event/KeyEvent
      // 8c: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 8f: goto 96
      // 92: invokestatic com/finalshell/core/XK_2.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // 95: athrow
      // 96: iload 0
      // 97: if_icmpne ad
      // 9a: aload 3
      // 9b: iload 4
      // 9d: aaload
      // 9e: goto a5
      // a1: invokestatic com/finalshell/core/XK_2.a (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
      // a4: athrow
      // a5: invokevirtual java/lang/reflect/Field.getName ()Ljava/lang/String;
      // a8: bipush 3
      // a9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // ac: areturn
      // ad: goto b2
      // b0: astore 5
      // b2: iinc 4 1
      // b5: aload 1
      // b6: ifnull 17
      // b9: sipush -3075
      // bc: sipush -6159
      // bf: invokestatic com/finalshell/core/XK_2.a (II)Ljava/lang/String;
      // c2: areturn
   }

   public static IllegalAccessException a(IllegalAccessException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -3083) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 35;
               break;
            case 1:
               var10000 = 224;
               break;
            case 2:
               var10000 = 29;
               break;
            case 3:
               var10000 = 98;
               break;
            case 4:
               var10000 = 233;
               break;
            case 5:
               var10000 = 27;
               break;
            case 6:
               var10000 = 148;
               break;
            case 7:
               var10000 = 59;
               break;
            case 8:
               var10000 = 225;
               break;
            case 9:
               var10000 = 142;
               break;
            case 10:
               var10000 = 247;
               break;
            case 11:
               var10000 = 249;
               break;
            case 12:
               var10000 = 179;
               break;
            case 13:
               var10000 = 102;
               break;
            case 14:
               var10000 = 95;
               break;
            case 15:
               var10000 = 9;
               break;
            case 16:
               var10000 = 255;
               break;
            case 17:
               var10000 = 54;
               break;
            case 18:
               var10000 = 118;
               break;
            case 19:
               var10000 = 141;
               break;
            case 20:
               var10000 = 7;
               break;
            case 21:
               var10000 = 48;
               break;
            case 22:
               var10000 = 116;
               break;
            case 23:
               var10000 = 71;
               break;
            case 24:
               var10000 = 14;
               break;
            case 25:
               var10000 = 117;
               break;
            case 26:
               var10000 = 78;
               break;
            case 27:
               var10000 = 25;
               break;
            case 28:
               var10000 = 0;
               break;
            case 29:
               var10000 = 143;
               break;
            case 30:
               var10000 = 168;
               break;
            case 31:
               var10000 = 24;
               break;
            case 32:
               var10000 = 147;
               break;
            case 33:
               var10000 = 210;
               break;
            case 34:
               var10000 = 204;
               break;
            case 35:
               var10000 = 22;
               break;
            case 36:
               var10000 = 241;
               break;
            case 37:
               var10000 = 145;
               break;
            case 38:
               var10000 = 16;
               break;
            case 39:
               var10000 = 108;
               break;
            case 40:
               var10000 = 234;
               break;
            case 41:
               var10000 = 250;
               break;
            case 42:
               var10000 = 99;
               break;
            case 43:
               var10000 = 175;
               break;
            case 44:
               var10000 = 62;
               break;
            case 45:
               var10000 = 86;
               break;
            case 46:
               var10000 = 6;
               break;
            case 47:
               var10000 = 176;
               break;
            case 48:
               var10000 = 140;
               break;
            case 49:
               var10000 = 235;
               break;
            case 50:
               var10000 = 70;
               break;
            case 51:
               var10000 = 222;
               break;
            case 52:
               var10000 = 123;
               break;
            case 53:
               var10000 = 83;
               break;
            case 54:
               var10000 = 166;
               break;
            case 55:
               var10000 = 207;
               break;
            case 56:
               var10000 = 156;
               break;
            case 57:
               var10000 = 251;
               break;
            case 58:
               var10000 = 193;
               break;
            case 59:
               var10000 = 96;
               break;
            case 60:
               var10000 = 229;
               break;
            case 61:
               var10000 = 11;
               break;
            case 62:
               var10000 = 206;
               break;
            case 63:
               var10000 = 67;
               break;
            case 64:
               var10000 = 87;
               break;
            case 65:
               var10000 = 134;
               break;
            case 66:
               var10000 = 157;
               break;
            case 67:
               var10000 = 125;
               break;
            case 68:
               var10000 = 236;
               break;
            case 69:
               var10000 = 5;
               break;
            case 70:
               var10000 = 182;
               break;
            case 71:
               var10000 = 133;
               break;
            case 72:
               var10000 = 218;
               break;
            case 73:
               var10000 = 50;
               break;
            case 74:
               var10000 = 79;
               break;
            case 75:
               var10000 = 43;
               break;
            case 76:
               var10000 = 1;
               break;
            case 77:
               var10000 = 205;
               break;
            case 78:
               var10000 = 31;
               break;
            case 79:
               var10000 = 75;
               break;
            case 80:
               var10000 = 150;
               break;
            case 81:
               var10000 = 58;
               break;
            case 82:
               var10000 = 20;
               break;
            case 83:
               var10000 = 155;
               break;
            case 84:
               var10000 = 160;
               break;
            case 85:
               var10000 = 211;
               break;
            case 86:
               var10000 = 136;
               break;
            case 87:
               var10000 = 238;
               break;
            case 88:
               var10000 = 64;
               break;
            case 89:
               var10000 = 18;
               break;
            case 90:
               var10000 = 188;
               break;
            case 91:
               var10000 = 107;
               break;
            case 92:
               var10000 = 49;
               break;
            case 93:
               var10000 = 217;
               break;
            case 94:
               var10000 = 124;
               break;
            case 95:
               var10000 = 128;
               break;
            case 96:
               var10000 = 191;
               break;
            case 97:
               var10000 = 127;
               break;
            case 98:
               var10000 = 209;
               break;
            case 99:
               var10000 = 56;
               break;
            case 100:
               var10000 = 94;
               break;
            case 101:
               var10000 = 52;
               break;
            case 102:
               var10000 = 19;
               break;
            case 103:
               var10000 = 228;
               break;
            case 104:
               var10000 = 13;
               break;
            case 105:
               var10000 = 66;
               break;
            case 106:
               var10000 = 17;
               break;
            case 107:
               var10000 = 85;
               break;
            case 108:
               var10000 = 231;
               break;
            case 109:
               var10000 = 139;
               break;
            case 110:
               var10000 = 172;
               break;
            case 111:
               var10000 = 101;
               break;
            case 112:
               var10000 = 190;
               break;
            case 113:
               var10000 = 105;
               break;
            case 114:
               var10000 = 15;
               break;
            case 115:
               var10000 = 51;
               break;
            case 116:
               var10000 = 32;
               break;
            case 117:
               var10000 = 244;
               break;
            case 118:
               var10000 = 144;
               break;
            case 119:
               var10000 = 4;
               break;
            case 120:
               var10000 = 115;
               break;
            case 121:
               var10000 = 74;
               break;
            case 122:
               var10000 = 113;
               break;
            case 123:
               var10000 = 208;
               break;
            case 124:
               var10000 = 89;
               break;
            case 125:
               var10000 = 8;
               break;
            case 126:
               var10000 = 216;
               break;
            case 127:
               var10000 = 162;
               break;
            case 128:
               var10000 = 57;
               break;
            case 129:
               var10000 = 177;
               break;
            case 130:
               var10000 = 220;
               break;
            case 131:
               var10000 = 92;
               break;
            case 132:
               var10000 = 199;
               break;
            case 133:
               var10000 = 254;
               break;
            case 134:
               var10000 = 104;
               break;
            case 135:
               var10000 = 131;
               break;
            case 136:
               var10000 = 84;
               break;
            case 137:
               var10000 = 110;
               break;
            case 138:
               var10000 = 135;
               break;
            case 139:
               var10000 = 221;
               break;
            case 140:
               var10000 = 106;
               break;
            case 141:
               var10000 = 112;
               break;
            case 142:
               var10000 = 41;
               break;
            case 143:
               var10000 = 33;
               break;
            case 144:
               var10000 = 34;
               break;
            case 145:
               var10000 = 109;
               break;
            case 146:
               var10000 = 63;
               break;
            case 147:
               var10000 = 215;
               break;
            case 148:
               var10000 = 103;
               break;
            case 149:
               var10000 = 138;
               break;
            case 150:
               var10000 = 26;
               break;
            case 151:
               var10000 = 60;
               break;
            case 152:
               var10000 = 246;
               break;
            case 153:
               var10000 = 28;
               break;
            case 154:
               var10000 = 121;
               break;
            case 155:
               var10000 = 184;
               break;
            case 156:
               var10000 = 201;
               break;
            case 157:
               var10000 = 242;
               break;
            case 158:
               var10000 = 186;
               break;
            case 159:
               var10000 = 88;
               break;
            case 160:
               var10000 = 36;
               break;
            case 161:
               var10000 = 69;
               break;
            case 162:
               var10000 = 164;
               break;
            case 163:
               var10000 = 252;
               break;
            case 164:
               var10000 = 243;
               break;
            case 165:
               var10000 = 240;
               break;
            case 166:
               var10000 = 45;
               break;
            case 167:
               var10000 = 91;
               break;
            case 168:
               var10000 = 161;
               break;
            case 169:
               var10000 = 154;
               break;
            case 170:
               var10000 = 77;
               break;
            case 171:
               var10000 = 194;
               break;
            case 172:
               var10000 = 120;
               break;
            case 173:
               var10000 = 163;
               break;
            case 174:
               var10000 = 129;
               break;
            case 175:
               var10000 = 53;
               break;
            case 176:
               var10000 = 126;
               break;
            case 177:
               var10000 = 55;
               break;
            case 178:
               var10000 = 159;
               break;
            case 179:
               var10000 = 192;
               break;
            case 180:
               var10000 = 130;
               break;
            case 181:
               var10000 = 100;
               break;
            case 182:
               var10000 = 158;
               break;
            case 183:
               var10000 = 153;
               break;
            case 184:
               var10000 = 187;
               break;
            case 185:
               var10000 = 232;
               break;
            case 186:
               var10000 = 2;
               break;
            case 187:
               var10000 = 227;
               break;
            case 188:
               var10000 = 149;
               break;
            case 189:
               var10000 = 10;
               break;
            case 190:
               var10000 = 167;
               break;
            case 191:
               var10000 = 170;
               break;
            case 192:
               var10000 = 40;
               break;
            case 193:
               var10000 = 151;
               break;
            case 194:
               var10000 = 132;
               break;
            case 195:
               var10000 = 146;
               break;
            case 196:
               var10000 = 165;
               break;
            case 197:
               var10000 = 3;
               break;
            case 198:
               var10000 = 202;
               break;
            case 199:
               var10000 = 180;
               break;
            case 200:
               var10000 = 169;
               break;
            case 201:
               var10000 = 72;
               break;
            case 202:
               var10000 = 12;
               break;
            case 203:
               var10000 = 30;
               break;
            case 204:
               var10000 = 44;
               break;
            case 205:
               var10000 = 226;
               break;
            case 206:
               var10000 = 76;
               break;
            case 207:
               var10000 = 38;
               break;
            case 208:
               var10000 = 178;
               break;
            case 209:
               var10000 = 223;
               break;
            case 210:
               var10000 = 90;
               break;
            case 211:
               var10000 = 93;
               break;
            case 212:
               var10000 = 198;
               break;
            case 213:
               var10000 = 47;
               break;
            case 214:
               var10000 = 212;
               break;
            case 215:
               var10000 = 185;
               break;
            case 216:
               var10000 = 248;
               break;
            case 217:
               var10000 = 219;
               break;
            case 218:
               var10000 = 195;
               break;
            case 219:
               var10000 = 239;
               break;
            case 220:
               var10000 = 119;
               break;
            case 221:
               var10000 = 174;
               break;
            case 222:
               var10000 = 183;
               break;
            case 223:
               var10000 = 197;
               break;
            case 224:
               var10000 = 173;
               break;
            case 225:
               var10000 = 214;
               break;
            case 226:
               var10000 = 46;
               break;
            case 227:
               var10000 = 189;
               break;
            case 228:
               var10000 = 203;
               break;
            case 229:
               var10000 = 81;
               break;
            case 230:
               var10000 = 73;
               break;
            case 231:
               var10000 = 111;
               break;
            case 232:
               var10000 = 42;
               break;
            case 233:
               var10000 = 213;
               break;
            case 234:
               var10000 = 82;
               break;
            case 235:
               var10000 = 97;
               break;
            case 236:
               var10000 = 237;
               break;
            case 237:
               var10000 = 181;
               break;
            case 238:
               var10000 = 68;
               break;
            case 239:
               var10000 = 137;
               break;
            case 240:
               var10000 = 200;
               break;
            case 241:
               var10000 = 171;
               break;
            case 242:
               var10000 = 245;
               break;
            case 243:
               var10000 = 39;
               break;
            case 244:
               var10000 = 65;
               break;
            case 245:
               var10000 = 230;
               break;
            case 246:
               var10000 = 152;
               break;
            case 247:
               var10000 = 61;
               break;
            case 248:
               var10000 = 122;
               break;
            case 249:
               var10000 = 21;
               break;
            case 250:
               var10000 = 23;
               break;
            case 251:
               var10000 = 196;
               break;
            case 252:
               var10000 = 253;
               break;
            case 253:
               var10000 = 37;
               break;
            case 254:
               var10000 = 114;
               break;
            default:
               var10000 = 80;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29462;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[9];
      int var11 = 0;
      String var10 = "«³v\näÎêTÁ\u0082\u0080þ\u0015ù\u0011àBd\u0092ÁÅEZ¨¨R\u009aÙØA\n\u0006\u0003>\u0097Ä\u0014âÇVà¬~ \u00000V\u0088w@\u0012¬\u0085\u0083Þ\u009eG\u0017 \u0013¥þ\u009bù\u0002\"\f\u008c.\u000b¹\f~ò»o¿Rûä\n\u0003â\u000f\u0098";
      int var12 = "«³v\näÎêTÁ\u0082\u0080þ\u0015ù\u0011àBd\u0092ÁÅEZ¨¨R\u009aÙØA\n\u0006\u0003>\u0097Ä\u0014âÇVà¬~ \u00000V\u0088w@\u0012¬\u0085\u0083Þ\u009eG\u0017 \u0013¥þ\u009bù\u0002\"\f\u008c.\u000b¹\f~ò»o¿Rûä\n\u0003â\u000f\u0098"
         .length();
      char var9 = 3;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 120;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 74;
                        break;
                     case 1:
                        var65 = 18;
                        break;
                     case 2:
                        var65 = 57;
                        break;
                     case 3:
                        var65 = 20;
                        break;
                     case 4:
                        var65 = 78;
                        break;
                     case 5:
                        var65 = 64;
                        break;
                     default:
                        var65 = 36;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[9];
                     long var0 = 8584935599961051715L;
                     long[] var6 = new long[20];
                     int var3 = 0;
                     String var4 = "zÛîê,¡h8|\u0002\u0006\u000fú\b@÷P®\u0019S\u0086À\u0082õ\u009e¯s~Ý¦Ö\u007fÙ×J\u0093\u001a)ãíY\u001b¸öÿß4\u008c' 2ë1o\u0017©ê£\u008d)\u000f\u0005 ¼Þü\u0090ÿ¦ñ¦\u0088ÆSZP ÷ê4Ë\u008eX\u008e±g¼:¥Î\u008e\u001cþ¶\u000e\u008cA\u0000è)\u0084ÖÈ\u0089qD°+\u009a\u0094\u0095\u0086yB¦\u009aqu\u008aà\u0015ÄfHãK°\u0089õH4B¥R\u0095£Âm1l*¶:·";
                     int var5 = "zÛîê,¡h8|\u0002\u0006\u000fú\b@÷P®\u0019S\u0086À\u0082õ\u009e¯s~Ý¦Ö\u007fÙ×J\u0093\u001a)ãíY\u001b¸öÿß4\u008c' 2ë1o\u0017©ê£\u008d)\u000f\u0005 ¼Þü\u0090ÿ¦ñ¦\u0088ÆSZP ÷ê4Ë\u008eX\u008e±g¼:¥Î\u008e\u001cþ¶\u000e\u008cA\u0000è)\u0084ÖÈ\u0089qD°+\u009a\u0094\u0095\u0086yB¦\u009aqu\u008aà\u0015ÄfHãK°\u0089õH4B¥R\u0095£Âm1l*¶:·"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[20];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "BL\u0096\u001d9ç7xÊíØ\u0086±¬k[";
                                 var5 = "BL\u0096\u001d9ç7xÊíØ\u0086±¬k[".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "((øS\u000e¹\rb%¬\u0095,\u0097Ñ¶s\u0007\u00adä\u0087õ\u0002Z³";
                  var12 = "((øS\u000e¹\rb%¬\u0095,\u0097Ñ¶s\u0007\u00adä\u0087õ\u0002Z³".length();
                  var9 = 16;
                  var17 = -1;
            }

            var10000 = 93;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





