import com.ne_4;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EventObject;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

class KC extends DefaultCellEditor {
   ne_4 b;
   com.Wb_2 O;
   final a3 x;
   private static final String[] a;
   private static final String[] c;
   private static final long[] d;
   private static final Integer[] e;

   KC(a3 var1, JTextField var2) {
      super(var2);
      this.x = var1;
      com.c.c(517915149035093252L).set(this, new DN());
      com.c.c(321615590296214611L).set(this, new com.Wb_2());
      ((ne_4)com.c.c(517915149035093252L).get(this)).v((com.Wb_2)com.c.c(321615590296214611L).get(this));
      ((ne_4)com.c.c(517915149035093252L).get(this)).setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      ((ne_4)com.c.c(517915149035093252L).get(this)).F(0);
      ((ne_4)com.c.c(517915149035093252L).get(this)).v((com.Wb_2)com.c.c(321615590296214611L).get(this));
      ((ne_4)com.c.c(517915149035093252L).get(this)).I(0, 0, 1, 0);
      ((ne_4)com.c.c(517915149035093252L).get(this)).d(1, 3, 0, 0);
      ((ne_4)com.c.c(517915149035093252L).get(this)).addKeyListener(new xp_2(this));
      ((ne_4)com.c.c(517915149035093252L).get(this)).addFocusListener(new yt_4(this));
   }

   @Override
   public boolean shouldSelectCell(EventObject var1) {
      return super.shouldSelectCell(var1);
   }

   @Override
   public Object getCellEditorValue() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc2_w 489572751534480599
      // 004: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 007: swap
      // 008: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: ldc2_w 503294693928161508
      // 00e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 011: swap
      // 012: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 015: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 018: astore 2
      // 019: invokestatic a3.I ()[I
      // 01c: aload 2
      // 01d: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 020: astore 3
      // 021: astore 1
      // 022: aload 0
      // 023: ldc2_w 517915149035093252
      // 026: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 029: swap
      // 02a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 02d: checkcast com/ne_4
      // 030: invokevirtual com/ne_4.getText ()Ljava/lang/String;
      // 033: astore 4
      // 035: aload 4
      // 037: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 03a: astore 4
      // 03c: aload 3
      // 03d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 040: ldc ck_4
      // 042: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 045: aload 1
      // 046: ifnull 12f
      // 049: ifeq 114
      // 04c: goto 053
      // 04f: invokestatic KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: aload 3
      // 054: checkcast ck_4
      // 057: astore 5
      // 059: new java/io/File
      // 05c: dup
      // 05d: aload 5
      // 05f: invokestatic com/c.f ()[Ljava/lang/Object;
      // 062: ldc2_w 605430732347023634
      // 065: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 068: dup_x2
      // 069: pop
      // 06a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 06d: checkcast java/lang/String
      // 070: goto 077
      // 073: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 076: athrow
      // 077: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 07a: astore 6
      // 07c: new java/io/File
      // 07f: dup
      // 080: new java/lang/StringBuilder
      // 083: dup
      // 084: invokespecial java/lang/StringBuilder.<init> ()V
      // 087: aload 6
      // 089: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 08c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08f: getstatic java/io/File.separator Ljava/lang/String;
      // 092: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 095: aload 4
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: sipush 7613
      // 09d: sipush -31259
      // 0a0: invokestatic KC.a (II)Ljava/lang/String;
      // 0a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0ac: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0af: astore 7
      // 0b1: aload 6
      // 0b3: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0b6: astore 8
      // 0b8: aload 8
      // 0ba: aload 7
      // 0bc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bf: aload 1
      // 0c0: ifnull 0e2
      // 0c3: ifne 110
      // 0c6: goto 0cd
      // 0c9: invokestatic KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: aload 6
      // 0cf: new java/io/File
      // 0d2: dup
      // 0d3: aload 7
      // 0d5: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0d8: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 0db: goto 0e2
      // 0de: invokestatic KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: pop
      // 0e3: aload 0
      // 0e4: ldc2_w 489572751534480599
      // 0e7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ea: swap
      // 0eb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ee: aload 8
      // 0f0: aload 7
      // 0f2: bipush 1
      // 0f3: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 0f6: ldc2_w 548242680714103358
      // 0f9: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 101: checkcast ck_4
      // 104: goto 10b
      // 107: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: astore 9
      // 10d: aload 9
      // 10f: astore 3
      // 110: aload 1
      // 111: ifnonnull 282
      // 114: aload 3
      // 115: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 118: aload 1
      // 119: ifnull 283
      // 11c: goto 123
      // 11f: invokestatic KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: ldc tf_4
      // 125: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 128: goto 12f
      // 12b: invokestatic KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12e: athrow
      // 12f: ifeq 282
      // 132: aload 3
      // 133: checkcast tf_4
      // 136: astore 5
      // 138: aload 5
      // 13a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 13d: ldc2_w 498856411508641826
      // 140: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 143: dup_x2
      // 144: pop
      // 145: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 148: goto 14f
      // 14b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 4
      // 151: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 154: ldc2_w 416107726621374295
      // 157: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 15a: swap
      // 15b: aconst_null
      // 15c: swap
      // 15d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 160: checkcast java/lang/String
      // 163: goto 16a
      // 166: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 169: athrow
      // 16a: astore 6
      // 16c: aload 5
      // 16e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 171: ldc2_w 498856411508641826
      // 174: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 177: dup_x2
      // 178: pop
      // 179: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 17c: checkcast java/lang/String
      // 17f: goto 186
      // 182: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 185: athrow
      // 186: astore 7
      // 188: aload 7
      // 18a: aload 1
      // 18b: ifnull 283
      // 18e: aload 6
      // 190: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 193: ifne 282
      // 196: goto 19d
      // 199: invokestatic KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: bipush 1
      // 19e: istore 8
      // 1a0: aload 1
      // 1a1: ifnull 23e
      // 1a4: aload 5
      // 1a6: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1a9: ldc2_w 490764181082108623
      // 1ac: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1af: dup_x2
      // 1b0: pop
      // 1b1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1b4: checkcast java/lang/Boolean
      // 1b7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1ba: goto 1c1
      // 1bd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: ifeq 20f
      // 1c4: goto 1cb
      // 1c7: invokestatic KC.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: new java/io/File
      // 1ce: dup
      // 1cf: aload 5
      // 1d1: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1d4: ldc2_w 498856411508641826
      // 1d7: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1da: dup_x2
      // 1db: pop
      // 1dc: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1df: checkcast java/lang/String
      // 1e2: goto 1e9
      // 1e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e8: athrow
      // 1e9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1ec: astore 9
      // 1ee: aload 9
      // 1f0: new java/io/File
      // 1f3: dup
      // 1f4: aload 6
      // 1f6: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1f9: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 1fc: pop
      // 1fd: new java/io/File
      // 200: dup
      // 201: aload 6
      // 203: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 206: invokevirtual java/io/File.exists ()Z
      // 209: istore 8
      // 20b: aload 1
      // 20c: ifnonnull 24b
      // 20f: aload 0
      // 210: ldc2_w 489572751534480599
      // 213: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 216: swap
      // 217: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 21a: ldc2_w 393220934160143516
      // 21d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 220: swap
      // 221: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 224: aload 7
      // 226: aload 6
      // 228: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 22b: ldc2_w 247777483328047393
      // 22e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 231: dup_x2
      // 232: pop
      // 233: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 236: pop
      // 237: goto 23e
      // 23a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23d: athrow
      // 23e: goto 24b
      // 241: astore 9
      // 243: bipush 0
      // 244: istore 8
      // 246: aload 9
      // 248: invokevirtual java/lang/Exception.printStackTrace ()V
      // 24b: iload 8
      // 24d: ifeq 282
      // 250: aload 0
      // 251: ldc2_w 489572751534480599
      // 254: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 257: swap
      // 258: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 25b: aload 7
      // 25d: aload 6
      // 25f: aload 4
      // 261: bipush 1
      // 262: aload 5
      // 264: aload 2
      // 265: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 268: ldc2_w 599514589999069238
      // 26b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 26e: dup_x2
      // 26f: pop
      // 270: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 273: checkcast tf_4
      // 276: goto 27d
      // 279: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 27c: athrow
      // 27d: astore 9
      // 27f: aload 9
      // 281: astore 3
      // 282: aload 3
      // 283: areturn
   }

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      int[] var7;
      String var10;
      Method var22;
      label64: {
         Object var9;
         label63: {
            com.c.c(503294693928161508L).set(com.c.c(489572751534480599L).get(this), var2);
            var22 = a3.I();
            DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)com.c.c(503294693928161508L).get(com.c.c(489572751534480599L).get(this));
            var9 = var8.getUserObject();
            var10 = a(7615, -28835);
            var7 = (int[])var22;
            boolean var19 = var9.getClass().equals(ck_4.class);
            if (var7 != null) {
               if (var19) {
                  ck_4 var11 = (ck_4)var9;
                  Object[] var10001 = com.c.f();
                  Method var10003 = com.c.d(396085629172753019L);
                  Object[] var10002 = var10001;
                  ck_4 var31 = var11;
                  var22 = var10003;

                  try {
                     var21 = (String)var22.invoke(var31, var10002);
                  } catch (InvocationTargetException var16) {
                     throw var16.getTargetException();
                  }

                  var10 = var21;
                  if (var7 != null) {
                     break label63;
                  }
               }

               var22 = var9.getClass();
               if (var7 == null) {
                  break label64;
               }

               var19 = var22.equals(tf_4.class);
            }

            if (var19) {
               tf_4 var17 = (tf_4)var9;
               Object[] var32 = com.c.f();
               Method var43 = com.c.d(179612178163941306L);
               Object[] var38 = var32;
               tf_4 var33 = var17;
               var22 = var43;

               try {
                  var24 = (String)var22.invoke(var33, var38);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               var10 = var24;
            }
         }

         var22 = (Method)var9;
      }

      Object[] var25 = com.c.a(var22);
      var22 = com.c.d(205466484628915359L);
      Object[] var40 = var25;
      Object var35 = null;

      try {
         var27 = (Icon)var22.invoke(var35, var40);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Icon var18 = var27;
      ((com.Wb_2)com.c.c(321615590296214611L).get(this)).A(var18);
      ((ne_4)com.c.c(517915149035093252L).get(this)).setText(var10);
      Object[] var28 = com.c.a(var10, ((ne_4)com.c.c(517915149035093252L).get(this)).getFont());
      var22 = com.c.d(408611976812192060L);
      var40 = var28;
      var35 = null;

      try {
         var30 = (Integer)var22.invoke(var35, var40);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      int var12 = var30 + a(7878, 5548203170632953656L);
      if (var7 != null) {
         if (var12 < a(7910, 3735743073362767641L)) {
            var12 = a(32106, 8530303197528951959L);
         }

         ((ne_4)com.c.c(517915149035093252L).get(this)).M(var12);
      }

      return (ne_4)com.c.c(517915149035093252L).get(this);
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      int[] var10000 = a3.I();
      byte var3 = 0;
      int[] var2 = var10000;
      EventObject var12 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return true;
         }

         var12 = var1;
      }

      byte var13 = var12 instanceof MouseEvent;
      if (var2 != null) {
         if (var13 != 0) {
            MouseEvent var4 = (MouseEvent)var1;
            int var37 = var4.getClickCount();
            if (var2 == null) {
               return (boolean)var37;
            }

            int var5 = var37;
            var10000 = (int[])com.c.c(489572751534480599L).get(this);
            Object[] var10001 = com.c.a(((MouseEvent)var1).getPoint());
            Method var10003 = com.c.d(229190360333115919L);
            Object[] var10002 = var10001;
            var10001 = var10000;
            Method var15 = var10003;

            try {
               var16 = (DefaultMutableTreeNode)var15.invoke(var10001, var10002);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            DefaultMutableTreeNode var6 = var16;
            if (var6 != null) {
               tf_4 var7 = (tf_4)var6.getUserObject();
               var10001 = com.c.f();
               var10003 = com.c.d(498856411508641826L);
               var10002 = var10001;
               tf_4 var25 = var7;
               Method var17 = var10003;

               try {
                  var18 = (String)var17.invoke(var25, var10002);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               boolean var38 = var18.contains(a(7614, -20724));
               if (var2 == null) {
                  return var38;
               }

               if (!var38) {
                  var10001 = com.c.f();
                  var10003 = com.c.d(498856411508641826L);
                  var10002 = var10001;
                  tf_4 var27 = var7;
                  Method var19 = var10003;

                  try {
                     var10000 = (int[])var19.invoke(var27, var10002);
                  } catch (InvocationTargetException var9) {
                     throw var9.getTargetException();
                  }

                  Object[] var21 = com.c.a(var10000);
                  Method var22 = com.c.d(537779894720802184L);
                  var10002 = var21;
                  var10001 = null;

                  try {
                     var39 = (Boolean)var22.invoke(var10001, var10002);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  if (var2 == null) {
                     return var39;
                  }

                  if (!var39) {
                     com.c.c(417596380711490346L).setInt(com.c.c(489572751534480599L).get(this), var5);
                     int var40 = var5;
                     byte var30 = 1;
                     if (var2 != null) {
                        label78: {
                           if (var5 == 1) {
                              var40 = com.c.c(257707175806650747L).getBoolean(com.c.c(489572751534480599L).get(this));
                              if (var2 == null) {
                                 break label78;
                              }

                              if (var40 != 0) {
                                 com.c.c(532071324274744951L).setBoolean(com.c.c(489572751534480599L).get(this), false);
                                 var3 = 1;
                                 new xh_2(this).start();
                              }
                           }

                           var40 = var5;
                        }

                        if (var2 == null) {
                           return (boolean)var40;
                        }

                        var30 = 2;
                     }

                     if (var40 == var30) {
                        com.c.c(532071324274744951L).setBoolean(com.c.c(489572751534480599L).get(this), true);
                     }
                  }
               }
            }
         }

         var13 = var3;
      }

      return (boolean)var13;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "»\u0099ø\u0002\u0092\u001b\u0005\u001cÔsY8";
      int var12 = "»\u0099ø\u0002\u0092\u001b\u0005\u001cÔsY8".length();
      char var9 = 3;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 85;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 85;
               var10006 = var14;
            } else {
               var23 = 85;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 85;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 94;
                     break;
                  case 1:
                     var41 = 50;
                     break;
                  case 2:
                     var41 = 92;
                     break;
                  case 3:
                     var41 = 50;
                     break;
                  case 4:
                     var41 = 81;
                     break;
                  case 5:
                     var41 = 13;
                     break;
                  default:
                     var41 = 63;
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
            a = var13;
            c = new String[3];
            long var0 = 2454725246204218389L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "\u009d³ð%ZÆcV7Ì°vFjc3ÄlEb\u001a8\u0000Ø";
            int var5 = "\u009d³ð%ZÆcV7Ì°vFjc3ÄlEb\u001a8\u0000Ø".length();
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

            d = var6;
            e = new Integer[3];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 7615) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 155;
               break;
            case 1:
               var10000 = 97;
               break;
            case 2:
               var10000 = 166;
               break;
            case 3:
               var10000 = 158;
               break;
            case 4:
               var10000 = 128;
               break;
            case 5:
               var10000 = 54;
               break;
            case 6:
               var10000 = 211;
               break;
            case 7:
               var10000 = 221;
               break;
            case 8:
               var10000 = 48;
               break;
            case 9:
               var10000 = 96;
               break;
            case 10:
               var10000 = 4;
               break;
            case 11:
               var10000 = 244;
               break;
            case 12:
               var10000 = 223;
               break;
            case 13:
               var10000 = 239;
               break;
            case 14:
               var10000 = 240;
               break;
            case 15:
               var10000 = 120;
               break;
            case 16:
               var10000 = 180;
               break;
            case 17:
               var10000 = 56;
               break;
            case 18:
               var10000 = 161;
               break;
            case 19:
               var10000 = 41;
               break;
            case 20:
               var10000 = 123;
               break;
            case 21:
               var10000 = 170;
               break;
            case 22:
               var10000 = 192;
               break;
            case 23:
               var10000 = 172;
               break;
            case 24:
               var10000 = 95;
               break;
            case 25:
               var10000 = 151;
               break;
            case 26:
               var10000 = 80;
               break;
            case 27:
               var10000 = 86;
               break;
            case 28:
               var10000 = 36;
               break;
            case 29:
               var10000 = 15;
               break;
            case 30:
               var10000 = 40;
               break;
            case 31:
               var10000 = 19;
               break;
            case 32:
               var10000 = 127;
               break;
            case 33:
               var10000 = 132;
               break;
            case 34:
               var10000 = 252;
               break;
            case 35:
               var10000 = 156;
               break;
            case 36:
               var10000 = 135;
               break;
            case 37:
               var10000 = 248;
               break;
            case 38:
               var10000 = 238;
               break;
            case 39:
               var10000 = 134;
               break;
            case 40:
               var10000 = 200;
               break;
            case 41:
               var10000 = 27;
               break;
            case 42:
               var10000 = 6;
               break;
            case 43:
               var10000 = 245;
               break;
            case 44:
               var10000 = 26;
               break;
            case 45:
               var10000 = 30;
               break;
            case 46:
               var10000 = 29;
               break;
            case 47:
               var10000 = 165;
               break;
            case 48:
               var10000 = 38;
               break;
            case 49:
               var10000 = 43;
               break;
            case 50:
               var10000 = 126;
               break;
            case 51:
               var10000 = 130;
               break;
            case 52:
               var10000 = 2;
               break;
            case 53:
               var10000 = 108;
               break;
            case 54:
               var10000 = 119;
               break;
            case 55:
               var10000 = 49;
               break;
            case 56:
               var10000 = 246;
               break;
            case 57:
               var10000 = 216;
               break;
            case 58:
               var10000 = 63;
               break;
            case 59:
               var10000 = 101;
               break;
            case 60:
               var10000 = 249;
               break;
            case 61:
               var10000 = 44;
               break;
            case 62:
               var10000 = 179;
               break;
            case 63:
               var10000 = 143;
               break;
            case 64:
               var10000 = 109;
               break;
            case 65:
               var10000 = 140;
               break;
            case 66:
               var10000 = 174;
               break;
            case 67:
               var10000 = 162;
               break;
            case 68:
               var10000 = 231;
               break;
            case 69:
               var10000 = 42;
               break;
            case 70:
               var10000 = 115;
               break;
            case 71:
               var10000 = 64;
               break;
            case 72:
               var10000 = 94;
               break;
            case 73:
               var10000 = 142;
               break;
            case 74:
               var10000 = 5;
               break;
            case 75:
               var10000 = 217;
               break;
            case 76:
               var10000 = 185;
               break;
            case 77:
               var10000 = 67;
               break;
            case 78:
               var10000 = 197;
               break;
            case 79:
               var10000 = 255;
               break;
            case 80:
               var10000 = 110;
               break;
            case 81:
               var10000 = 189;
               break;
            case 82:
               var10000 = 233;
               break;
            case 83:
               var10000 = 9;
               break;
            case 84:
               var10000 = 70;
               break;
            case 85:
               var10000 = 234;
               break;
            case 86:
               var10000 = 50;
               break;
            case 87:
               var10000 = 198;
               break;
            case 88:
               var10000 = 111;
               break;
            case 89:
               var10000 = 89;
               break;
            case 90:
               var10000 = 146;
               break;
            case 91:
               var10000 = 152;
               break;
            case 92:
               var10000 = 35;
               break;
            case 93:
               var10000 = 84;
               break;
            case 94:
               var10000 = 69;
               break;
            case 95:
               var10000 = 131;
               break;
            case 96:
               var10000 = 28;
               break;
            case 97:
               var10000 = 178;
               break;
            case 98:
               var10000 = 55;
               break;
            case 99:
               var10000 = 31;
               break;
            case 100:
               var10000 = 34;
               break;
            case 101:
               var10000 = 99;
               break;
            case 102:
               var10000 = 133;
               break;
            case 103:
               var10000 = 76;
               break;
            case 104:
               var10000 = 157;
               break;
            case 105:
               var10000 = 122;
               break;
            case 106:
               var10000 = 183;
               break;
            case 107:
               var10000 = 141;
               break;
            case 108:
               var10000 = 103;
               break;
            case 109:
               var10000 = 153;
               break;
            case 110:
               var10000 = 202;
               break;
            case 111:
               var10000 = 219;
               break;
            case 112:
               var10000 = 52;
               break;
            case 113:
               var10000 = 113;
               break;
            case 114:
               var10000 = 33;
               break;
            case 115:
               var10000 = 195;
               break;
            case 116:
               var10000 = 88;
               break;
            case 117:
               var10000 = 201;
               break;
            case 118:
               var10000 = 199;
               break;
            case 119:
               var10000 = 138;
               break;
            case 120:
               var10000 = 83;
               break;
            case 121:
               var10000 = 228;
               break;
            case 122:
               var10000 = 18;
               break;
            case 123:
               var10000 = 78;
               break;
            case 124:
               var10000 = 176;
               break;
            case 125:
               var10000 = 224;
               break;
            case 126:
               var10000 = 208;
               break;
            case 127:
               var10000 = 21;
               break;
            case 128:
               var10000 = 222;
               break;
            case 129:
               var10000 = 177;
               break;
            case 130:
               var10000 = 47;
               break;
            case 131:
               var10000 = 167;
               break;
            case 132:
               var10000 = 20;
               break;
            case 133:
               var10000 = 144;
               break;
            case 134:
               var10000 = 3;
               break;
            case 135:
               var10000 = 184;
               break;
            case 136:
               var10000 = 226;
               break;
            case 137:
               var10000 = 68;
               break;
            case 138:
               var10000 = 227;
               break;
            case 139:
               var10000 = 106;
               break;
            case 140:
               var10000 = 225;
               break;
            case 141:
               var10000 = 0;
               break;
            case 142:
               var10000 = 214;
               break;
            case 143:
               var10000 = 100;
               break;
            case 144:
               var10000 = 218;
               break;
            case 145:
               var10000 = 59;
               break;
            case 146:
               var10000 = 191;
               break;
            case 147:
               var10000 = 32;
               break;
            case 148:
               var10000 = 98;
               break;
            case 149:
               var10000 = 236;
               break;
            case 150:
               var10000 = 85;
               break;
            case 151:
               var10000 = 91;
               break;
            case 152:
               var10000 = 190;
               break;
            case 153:
               var10000 = 105;
               break;
            case 154:
               var10000 = 71;
               break;
            case 155:
               var10000 = 188;
               break;
            case 156:
               var10000 = 61;
               break;
            case 157:
               var10000 = 169;
               break;
            case 158:
               var10000 = 193;
               break;
            case 159:
               var10000 = 116;
               break;
            case 160:
               var10000 = 181;
               break;
            case 161:
               var10000 = 213;
               break;
            case 162:
               var10000 = 11;
               break;
            case 163:
               var10000 = 243;
               break;
            case 164:
               var10000 = 79;
               break;
            case 165:
               var10000 = 210;
               break;
            case 166:
               var10000 = 14;
               break;
            case 167:
               var10000 = 215;
               break;
            case 168:
               var10000 = 154;
               break;
            case 169:
               var10000 = 51;
               break;
            case 170:
               var10000 = 77;
               break;
            case 171:
               var10000 = 75;
               break;
            case 172:
               var10000 = 229;
               break;
            case 173:
               var10000 = 250;
               break;
            case 174:
               var10000 = 58;
               break;
            case 175:
               var10000 = 90;
               break;
            case 176:
               var10000 = 206;
               break;
            case 177:
               var10000 = 125;
               break;
            case 178:
               var10000 = 247;
               break;
            case 179:
               var10000 = 12;
               break;
            case 180:
               var10000 = 8;
               break;
            case 181:
               var10000 = 194;
               break;
            case 182:
               var10000 = 7;
               break;
            case 183:
               var10000 = 171;
               break;
            case 184:
               var10000 = 104;
               break;
            case 185:
               var10000 = 60;
               break;
            case 186:
               var10000 = 254;
               break;
            case 187:
               var10000 = 136;
               break;
            case 188:
               var10000 = 187;
               break;
            case 189:
               var10000 = 204;
               break;
            case 190:
               var10000 = 124;
               break;
            case 191:
               var10000 = 253;
               break;
            case 192:
               var10000 = 37;
               break;
            case 193:
               var10000 = 203;
               break;
            case 194:
               var10000 = 145;
               break;
            case 195:
               var10000 = 53;
               break;
            case 196:
               var10000 = 46;
               break;
            case 197:
               var10000 = 230;
               break;
            case 198:
               var10000 = 163;
               break;
            case 199:
               var10000 = 137;
               break;
            case 200:
               var10000 = 22;
               break;
            case 201:
               var10000 = 235;
               break;
            case 202:
               var10000 = 117;
               break;
            case 203:
               var10000 = 241;
               break;
            case 204:
               var10000 = 175;
               break;
            case 205:
               var10000 = 173;
               break;
            case 206:
               var10000 = 1;
               break;
            case 207:
               var10000 = 45;
               break;
            case 208:
               var10000 = 232;
               break;
            case 209:
               var10000 = 81;
               break;
            case 210:
               var10000 = 196;
               break;
            case 211:
               var10000 = 149;
               break;
            case 212:
               var10000 = 74;
               break;
            case 213:
               var10000 = 186;
               break;
            case 214:
               var10000 = 251;
               break;
            case 215:
               var10000 = 207;
               break;
            case 216:
               var10000 = 205;
               break;
            case 217:
               var10000 = 160;
               break;
            case 218:
               var10000 = 66;
               break;
            case 219:
               var10000 = 129;
               break;
            case 220:
               var10000 = 24;
               break;
            case 221:
               var10000 = 237;
               break;
            case 222:
               var10000 = 16;
               break;
            case 223:
               var10000 = 82;
               break;
            case 224:
               var10000 = 13;
               break;
            case 225:
               var10000 = 148;
               break;
            case 226:
               var10000 = 212;
               break;
            case 227:
               var10000 = 242;
               break;
            case 228:
               var10000 = 57;
               break;
            case 229:
               var10000 = 23;
               break;
            case 230:
               var10000 = 209;
               break;
            case 231:
               var10000 = 182;
               break;
            case 232:
               var10000 = 65;
               break;
            case 233:
               var10000 = 102;
               break;
            case 234:
               var10000 = 107;
               break;
            case 235:
               var10000 = 92;
               break;
            case 236:
               var10000 = 139;
               break;
            case 237:
               var10000 = 147;
               break;
            case 238:
               var10000 = 114;
               break;
            case 239:
               var10000 = 62;
               break;
            case 240:
               var10000 = 17;
               break;
            case 241:
               var10000 = 73;
               break;
            case 242:
               var10000 = 93;
               break;
            case 243:
               var10000 = 10;
               break;
            case 244:
               var10000 = 112;
               break;
            case 245:
               var10000 = 72;
               break;
            case 246:
               var10000 = 164;
               break;
            case 247:
               var10000 = 159;
               break;
            case 248:
               var10000 = 220;
               break;
            case 249:
               var10000 = 168;
               break;
            case 250:
               var10000 = 150;
               break;
            case 251:
               var10000 = 39;
               break;
            case 252:
               var10000 = 87;
               break;
            case 253:
               var10000 = 25;
               break;
            case 254:
               var10000 = 118;
               break;
            default:
               var10000 = 121;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29183;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }
}





