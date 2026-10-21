package com.finalshell.crypto;

import com.finalshell.core.Fc2;
import com.finalshell.core.KD;
import com.finalshell.core.SyncTaskManifest;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Qc2;
import com.finalshell.core.U62;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Cr2;
import com.finalshell.ui.frame.FP;
import com.finalshell.ui.listener.B;
import com.finalshell.ui.listener.BE;
import com.finalshell.ui.listener.CX;
import com.finalshell.ui.listener.JE;
import com.finalshell.ui.listener.OC3;
import com.finalshell.ui.listener.OS3;
import com.finalshell.ui.listener.TF;
import com.finalshell.ui.listener.Uj2;
import com.finalshell.ui.listener.Un2;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.Z7;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import net.miginfocom.swing.MigLayout;

public class User extends Z7 {
   public JLabel X;
   public JLabel B;
   public JPasswordField F;
   public FP k;
   public JLabel d;
   public JButton W;
   public static String A;
   public int Y;
   public int L;
   public int J;
   public int x;
   public boolean T;
   public static int y;
   public static String[] a;
   public static String[] b;
   public static long[] f;
   public static Integer[] g;

   public User(FP var1) {
      Boolean var88;
      Registry.lookupField(390210343425911914L).setInt(this, 1);
      Registry.lookupField(122080408670342351L).setInt(this, a(28958, 7538368611283997663L));
      Registry.lookupField(488912842222213458L).setInt(this, a(5614, 4591630841062389536L));
      Registry.lookupField(624968254140792808L).setInt(this, Registry.lookupField(488912842222213458L).getInt(this));
      Registry.lookupField(133925469553480382L).setBoolean(this, false);
      long var23 = 374662006893184377L;
      Ref.s(374662006893184377L, var1, var23);
      this.setLayout(new MigLayout(a(-8103, -525), a(-8112, -633), ""));
      w();
      this.setBorder(BorderFactory.createLineBorder(new Color(a(20046, 6027206172297014411L), a(4499, 1600689846615602008L), a(4499, 1600689846615602008L))));
      Registry.emptyArgs();
      long var24 = 270389152141252877L;
      Ref.h2(270389152141252877L, var24);
      Object[] var10004 = Registry.emptyArgs();
      long var27 = 375944019649708240L;
      Object[] var26 = var10004;
      Ref.h(375944019649708240L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var84) {
         throw var84.getTargetException();
      }

      new String(a(-8101, 29788));
      String var5 = new String(a(-8123, -25059));
      JLabel var10005 = new JLabel();
      long var29 = 358275063187042994L;
      JLabel var28 = var10005;
      Ref.s(358275063187042994L, var28, var29);
      Object var30 = 358275063187042994L;
      ((JLabel)Ref.g(358275063187042994L, var30)).setFont((Font)Registry.lookupField(236927642915393855L).get(null));
      Object var32 = 358275063187042994L;
      ((JLabel)Ref.g(358275063187042994L, var32)).setText(a(-8105, 8620));
      Object var34 = 358275063187042994L;
      ((JLabel)Ref.g(358275063187042994L, var34))
         .setBorder(
            BorderFactory.createCompoundBorder(
               BorderFactory.createTitledBorder(
                  BorderFactory.createLineBorder(new Color(a(4499, 1600689846615602008L), a(4499, 1600689846615602008L), a(4499, 1600689846615602008L))),
                  a(-8097, -31974)
               ),
               BorderFactory.createEmptyBorder(0, a(5112, 6639035802245001534L), 0, a(27562, 1070508173473712490L))
            )
         );
      Object var36 = 358275063187042994L;
      this.add((JLabel)Ref.g(358275063187042994L, var36), a(-8094, 28057));
      JPanel var6 = new JPanel(new MigLayout(a(-8091, 3475)));
      var6.add(new JLabel(a(-8121, -1689)), a(-8099, -8598));
      JLabel var10010 = new JLabel();
      long var39 = 631555842482185462L;
      JLabel var38 = var10010;
      Ref.s(631555842482185462L, var38, var39);
      Object var40 = 631555842482185462L;
      this.add((JLabel)Ref.g(631555842482185462L, var40), var5);
      this.add(var6, a(-8090, -4213));
      JLabel var10012 = new JLabel();
      long var43 = 274107879507411256L;
      JLabel var42 = var10012;
      Ref.s(274107879507411256L, var42, var43);
      Object var44 = 274107879507411256L;
      this.add((JLabel)Ref.g(274107879507411256L, var44), a(-8096, 16767));
      JPanel var7 = new JPanel(new MigLayout(a(-8087, 25162)));
      var7.add(new JLabel(a(-8127, 10022)), a(-8108, 29356));
      JPasswordField var10014 = new JPasswordField();
      long var47 = 424757448950891498L;
      JPasswordField var46 = var10014;
      Ref.s(424757448950891498L, var46, var47);
      Object var48 = 424757448950891498L;
      Registry.packArgs(Ref.g(424757448950891498L, var48));
      long var50 = 322267315291882359L;
      Ref.h2(322267315291882359L, var50);
      Object var52 = 424757448950891498L;
      this.add((JPasswordField)Ref.g(424757448950891498L, var52), var5);
      JPanel var8 = new JPanel(new MigLayout(a(-8087, 25162)));
      this.add(var8, a(-8096, 16767));
      JButton var9 = new JButton(a(-8126, -20783));
      var8.add(var9, a(-8119, 24792));
      var9.addActionListener(new B(this));
      JButton var10017 = new JButton(a(-8114, 21157));
      long var55 = 201427103655713904L;
      JButton var54 = var10017;
      Ref.s(201427103655713904L, var54, var55);
      Object var56 = 201427103655713904L;
      ((JButton)Ref.g(201427103655713904L, var56)).addActionListener(new TF(this));
      JButton var10 = new JButton(a(-8117, -14178));
      var8.add(var10, a(-8107, -8042));
      var10.addActionListener(new CX(this));
      JButton var11 = new JButton(a(-8113, -27252));
      var8.add(var11, a(-8095, -18558));
      var11.addActionListener(new OC3(this));
      JButton var12 = new JButton(a(-8124, 4349));
      var8.add(var12, a(-8092, -4468));
      var12.addActionListener(new BE(this));
      JTextArea var13 = new JTextArea();
      var13.setLineWrap(true);
      var13.setEditable(false);
      JScrollPane var14 = new JScrollPane(var13);
      var14.setBorder(BorderFactory.createTitledBorder(a(-8104, 11206)));
      a(-8110, -24009);
      Object[] var10021 = Registry.emptyArgs();
      long var58 = 270389152141252877L;
      Object var10022 = Ref.h2(270389152141252877L, var58);
      Object[] var10023 = Registry.emptyArgs();
      long var61 = 375944019649708240L;
      Object[] var60 = var10023;
      var10023 = Ref.h(375944019649708240L, var60, var61);
      Object var10024 = Registry.emptyArgs();
      long var63 = 605218686263352748L;
      Object var62 = var10024;
      var10024 = Ref.h(605218686263352748L, var62, var63);

      try {
         var88 = (Boolean)var10024;
      } catch (InvocationTargetException var83) {
         throw var83.getTargetException();
      }

var10022 = (User)(new Un2(var10023, var88));
      Object[] var15 = var10021;
      this.add(var15, a(-8128, 20675));
      var15.addActionListener(new Un2(this, var15));
      this.add(new JPanel(), a(-8109, 20565));
      JPanel var16 = new JPanel(new MigLayout(a(-8087, 25162)));
      this.add(var16);
      KD var17 = new KD(a(-8106, 7315));
      var17.G(true);
      var17.setCursor(new Cursor(a(1538, 8161728356171244736L)));
      Color var18 = new Color(0, 0, a(4499, 1600689846615602008L));
      var17.setForeground(var18);
      var17.t(var18);
      var16.add(var17, "");
      var17.addActionListener(new Uj2(this));
      KD var19 = new KD(a(-8088, 19718));
      var19.V(0, 0, 0, 0);
      var19.G(true);
      var19.setForeground(new Color(a(17525, 3971826399301871288L), a(2091, 5854430105365834472L), a(4499, 1600689846615602008L)));
      var19.t(new Color(a(3716, 5957388725734370379L), a(18130, 5719935773879215134L), a(4499, 1600689846615602008L)));
      var19.setCursor(new Cursor(a(15033, 8149506589400160381L)));
      var19.addActionListener(new JE(this));
      JButton var20 = new JButton(a(-8089, 5813));
      var20.addActionListener(new OS3(this));
      Object[] var85 = Registry.emptyArgs();
      long var65 = 538856891414811956L;
      Object[] var64 = var85;
      Ref.h(538856891414811956L, var64, var65);

      try {
         ;
      } catch (InvocationTargetException var82) {
         throw var82.getTargetException();
      }

      Registry.emptyArgs();
      long var66 = 270389152141252877L;
      Ref.h2(270389152141252877L, var66);
      Registry.lookupField(388376917454860932L).get(null);
      var10024 = Registry.packArgs(new Cr2(this), a(30037, 7037365432763258770L));
      long var69 = 201859364639460244L;
      Object var68 = var10024;
      Ref.h(201859364639460244L, var68, var69);
      Registry.emptyArgs();
      long var70 = 270389152141252877L;
      Ref.h2(270389152141252877L, var70);
      Object[] var10026 = Registry.emptyArgs();
      long var73 = 612604310671515822L;
      Object[] var72 = var10026;
      Ref.h(612604310671515822L, var72, var73);
      SyncTaskManifest var10027 = (SyncTaskManifest)(Registry.emptyArgs());
      long var75 = 475326244946424763L;
      Object var74 = var10027;
      var10027 = Ref.h(475326244946424763L, var74, var75);

      try {
         var10027 = (SyncTaskManifest)var10027;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }

      SyncTaskManifest var21 = var10027;
      Object var76 = 424757448950891498L;
      JPasswordField var10028 = (JPasswordField)Ref.g(424757448950891498L, var76);
      String var10030 = (String)(Registry.emptyArgs());
      long var79 = 317409027815843261L;
      Object var78 = var10030;
      var10030 = Ref.h(317409027815843261L, var78, var79);

      try {
         var10030 = (String)var10030;
      } catch (InvocationTargetException var80) {
         throw var80.getTargetException();
      }

      var21.setText(var10030);
      if (var7 == null) {
         Ky4.K(new String[5]);
      }
   }

   public void j() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/crypto/User.w ()I
      // 003: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 006: ldc2_w 270389152141252877
      // 009: astore 4
      // 00b: ldc2_w 270389152141252877
      // 00e: aload 4
      // 010: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 013: goto 01a
      // 016: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 019: athrow
      // 01a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01d: ldc2_w 306266403902896148
      // 020: astore 7
      // 022: astore 6
      // 024: ldc2_w 306266403902896148
      // 027: aload 6
      // 029: aload 7
      // 02b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02e: checkcast com/finalshell/core/U62
      // 031: goto 038
      // 034: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 037: athrow
      // 038: astore 2
      // 039: istore 1
      // 03a: aload 2
      // 03b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03e: ldc2_w 204000105621842013
      // 041: astore 9
      // 043: astore 8
      // 045: ldc2_w 204000105621842013
      // 048: aload 8
      // 04a: aload 9
      // 04c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04f: goto 056
      // 052: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 055: athrow
      // 056: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 059: ldc2_w 330094358428833085
      // 05c: astore 10
      // 05e: ldc2_w 330094358428833085
      // 061: aload 10
      // 063: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 066: checkcast java/lang/Boolean
      // 069: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06c: goto 073
      // 06f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 072: athrow
      // 073: iload 1
      // 074: ifeq 0c1
      // 077: ifne 192
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/crypto/User.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: aload 2
      // 082: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 085: ldc2_w 191807067392725406
      // 088: astore 13
      // 08a: astore 12
      // 08c: ldc2_w 191807067392725406
      // 08f: aload 12
      // 091: aload 13
      // 093: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 096: goto 09d
      // 099: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a0: ldc2_w 330094358428833085
      // 0a3: astore 14
      // 0a5: ldc2_w 330094358428833085
      // 0a8: aload 14
      // 0aa: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ad: checkcast java/lang/Boolean
      // 0b0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b3: goto 0ba
      // 0b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: goto 0c1
      // 0bd: invokestatic com/finalshell/crypto/User.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c0: athrow
      // 0c1: ifne 192
      // 0c4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c7: ldc2_w 270389152141252877
      // 0ca: astore 16
      // 0cc: ldc2_w 270389152141252877
      // 0cf: aload 16
      // 0d1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d4: goto 0db
      // 0d7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0de: ldc2_w 612604310671515822
      // 0e1: astore 19
      // 0e3: astore 18
      // 0e5: ldc2_w 612604310671515822
      // 0e8: aload 18
      // 0ea: aload 19
      // 0ec: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ef: goto 0f6
      // 0f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f9: ldc2_w 203513045669525032
      // 0fc: astore 21
      // 0fe: astore 20
      // 100: ldc2_w 203513045669525032
      // 103: aload 20
      // 105: aload 21
      // 107: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10a: pop
      // 10b: goto 112
      // 10e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 111: athrow
      // 112: goto 192
      // 115: astore 3
      // 116: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 119: ldc2_w 270389152141252877
      // 11c: astore 22
      // 11e: ldc2_w 270389152141252877
      // 121: aload 22
      // 123: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 126: goto 12d
      // 129: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 130: ldc2_w 606040881383812332
      // 133: astore 25
      // 135: astore 24
      // 137: ldc2_w 606040881383812332
      // 13a: aload 24
      // 13c: aload 25
      // 13e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 141: goto 148
      // 144: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 147: athrow
      // 148: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 14b: ldc2_w 140823137094225943
      // 14e: astore 27
      // 150: astore 26
      // 152: ldc2_w 140823137094225943
      // 155: aload 26
      // 157: aload 27
      // 159: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15c: goto 163
      // 15f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 162: athrow
      // 163: new java/lang/StringBuilder
      // 166: dup
      // 167: invokespecial java/lang/StringBuilder.<init> ()V
      // 16a: ldc ""
      // 16c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16f: aload 3
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 173: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 176: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 179: ldc2_w 539001526584876911
      // 17c: astore 29
      // 17e: astore 28
      // 180: ldc2_w 539001526584876911
      // 183: aload 28
      // 185: aload 29
      // 187: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18a: pop
      // 18b: goto 192
      // 18e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 191: athrow
      // 192: return
   }

   public void b() {
      Long var102;
      Object[] var33;
      boolean var77;
      boolean var83;
      Integer var91;
      boolean var95;
      boolean var98;
      w();
      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Object var10002 = Ref.h2(270389152141252877L, var9);
      U62 var10003 = (U62)(Registry.emptyArgs());
      long var12 = 306266403902896148L;
      Object var11 = var10003;
      var10003 = Ref.h(306266403902896148L, var11, var12);

      try {
         var10003 = (U62)var10003;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      U62 var2 = var10003;
      Object var3 = "";
      Object var1 = var10002;
      int var4 = 0;
      String var5 = "";
      var10003 = Registry.emptyArgs();
      long var14 = 204000105621842013L;
      Object var13 = var10003;
      var10003 = Ref.h(204000105621842013L, var13, var14);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      label248: {
         Object var10006;
         label249: {
            label240: {
               if (var1 == null) {
                  var10003 = Registry.packArgs(var10003);
                  long var15 = 330094358428833085L;
                  Object var10004 = Ref.h2(330094358428833085L, var15);

                  try {
                     var77 = (Boolean)var10004;
                  } catch (InvocationTargetException var68) {
                     throw var68.getTargetException();
                  }

                  if (!var77) {
                     String var10005 = (String)(Registry.emptyArgs());
                     long var18 = 191807067392725406L;
                     Object var17 = var10005;
                     var10005 = Ref.h(191807067392725406L, var17, var18);

                     try {
                        var10005 = (String)var10005;
                     } catch (InvocationTargetException var67) {
                        throw var67.getTargetException();
                     }

                     var10006 = var1;
                     if (var1 == null) {
                        break label249;
                     }

                     Registry.packArgs(var10005);
                     long var19 = 330094358428833085L;
                     var10006 = Ref.h2(330094358428833085L, var19);

                     try {
                        var83 = (Boolean)var10006;
                     } catch (InvocationTargetException var66) {
                        throw var66.getTargetException();
                     }

                     if (!var83) {
                        break label240;
                     }
                  }

                  Registry.lookupField(133925469553480382L).setBoolean(this, true);
                  a(-8111, 15338);
               }

               var3 = var10003;
               if (var1 == null) {
                  break label248;
               }
            }

            Registry.emptyArgs();
            long var21 = 270389152141252877L;
            Ref.h2(270389152141252877L, var21);
            Object[] var80 = Registry.emptyArgs();
            long var24 = 375944019649708240L;
            Object[] var23 = var80;
            Ref.h(375944019649708240L, var23, var24);
            var10006 = Registry.emptyArgs();
            long var26 = 318293696412897294L;
            Object[] var25 = (Object[])var10006;
            var10006 = Ref.h(318293696412897294L, var25, var26);

            try {
               var10006 = (String)var10006;
            } catch (InvocationTargetException var65) {
               throw var65.getTargetException();
            }
         }

         Object var6 = var10006;
         Registry.emptyArgs();
         long var27 = 270389152141252877L;
         Ref.h2(270389152141252877L, var27);
         Object[] var10008 = Registry.emptyArgs();
         long var30 = 612604310671515822L;
         Object[] var29 = var10008;
         Ref.h(612604310671515822L, var29, var30);
         Fc2 var10009 = (Fc2)(Registry.emptyArgs());
         long var32 = 208590088574407579L;
         Object var31 = var10009;
         var10009 = Ref.h(208590088574407579L, var31, var32);

         try {
            var10009 = (Fc2)var10009;
         } catch (InvocationTargetException var64) {
            throw var64.getTargetException();
         }

         Fc2 var7 = var10009;
         if (var1 == null) {
            return;
         }

         label225:
         if (var7 != null) {
            Object var10010 = Registry.emptyArgs();
            long var34 = 271380908604154518L;
            var33 = var10010;
            var10010 = Ref.h(271380908604154518L, var33, var34);

            try {
               var91 = (Integer)var10010;
            } catch (InvocationTargetException var63) {
               throw var63.getTargetException();
            }

            var4 = var91;
            int var92 = var4;
            int var10011 = Qc2.Q;
            if (var1 == null) {
               if (var4 == Qc2.Q) {
                  Registry.lookupField(133925469553480382L).setBoolean(this, true);
                  var3 = a(-8116, -29129);
                  if (var1 == null) {
                     break label225;
                  }
               }

               var92 = var4;
               var10011 = Qc2.S;
            }

            label253: {
               if (var1 == null) {
                  if (var92 == var10011) {
                     Object[] var93 = Registry.emptyArgs();
                     long var36 = 326351988475965557L;
                     Object[] var35 = var93;
                     Object var94 = Ref.h(326351988475965557L, var35, var36);

                     try {
                        var95 = (Boolean)var94;
                     } catch (InvocationTargetException var62) {
                        throw var62.getTargetException();
                     }

                     label211: {
                        label255: {
                           if (var1 == null) {
                              if (var95 == false) {
                                 break label255;
                              }

                              var95 = Registry.packArgs(var6);
                              long var37 = 330094358428833085L;
                              Object var10012 = Ref.h2(330094358428833085L, var37);

                              try {
                              } catch (InvocationTargetException var61) {
                                 throw var61.getTargetException();
                              }
                           }

                           if (var1 == null) {
                              if (var95 != false) {
                                 Registry.lookupField(133925469553480382L).setBoolean(this, true);
                                 var3 = a(-8118, -1733);
                                 if (var1 == null) {
                                    break label211;
                                 }
                              }

                              var95 = Registry.emptyArgs();
                              long var39 = 270389152141252877L;
                              Ref.h2(270389152141252877L, var39);
                              Object[] var10013 = Registry.emptyArgs();
                              long var42 = 612604310671515822L;
                              Object[] var41 = var10013;
                              Ref.h(612604310671515822L, var41, var42);
                              Object[] var10014 = Registry.emptyArgs();
                              long var44 = 287288583543378382L;
                              Object[] var43 = var10014;
                              var10014 = Ref.h(287288583543378382L, var43, var44);

                              try {
                              } catch (InvocationTargetException var60) {
                                 throw var60.getTargetException();
                              }
                           }

                           if (var95 != false) {
                              Registry.lookupField(133925469553480382L).setBoolean(this, true);
                              var3 = a(-8100, -8539);
                              if (var1 == null) {
                                 break label211;
                              }
                           }

                           Registry.lookupField(133925469553480382L).setBoolean(this, false);
                           var3 = a(-8115, -20209);
                           if (var1 == null) {
                              break label211;
                           }
                        }

                        Registry.lookupField(133925469553480382L).setBoolean(this, true);
                        var3 = a(-8125, 3310);
                     }

                     label258: {
                        SimpleDateFormat var8;
                        label193: {
                           var8 = new SimpleDateFormat((String)Registry.lookupField(231329429374491840L).get(null));
                           if (var1 == null) {
                              if (var7 != null) {
                                 Object var96 = Registry.emptyArgs();
                                 long var46 = 412439471829603520L;
                                 Object var45 = var96;
                                 var96 = Ref.h(412439471829603520L, var45, var46);

                                 try {
                                    var98 = (Boolean)var96;
                                 } catch (InvocationTargetException var59) {
                                    throw var59.getTargetException();
                                 }

                                 if (!var98) {
                                    break label193;
                                 }
                              }

                              Registry.lookupField(133925469553480382L).setBoolean(this, true);
                           }

                           if (var1 == null) {
                              break label258;
                           }
                        }

                        new StringBuilder().append(a(-8102, -27473));
                        Object var100 = Registry.emptyArgs();
                        long var48 = 156489935889319530L;
                        Object var47 = var100;
                        var100 = Ref.h(156489935889319530L, var47, var48);

                        try {
                           var102 = (Long)var100;
                        } catch (InvocationTargetException var58) {
                           throw var58.getTargetException();
                        }

                        var5 = var8.append(var7.format(Long.valueOf(var102))).toString();
                     }

                     if (var1 == null) {
                        break label253;
                     }
                  }

                  var92 = var4;
                  var10011 = Qc2.i;
               }

               if (var1 == null) {
                  if (var92 == var10011) {
                     Registry.lookupField(133925469553480382L).setBoolean(this, true);
                     var3 = a(-8120, 2455);
                     if (var1 == null) {
                        break label253;
                     }
                  }

                  var92 = var4;
                  var10011 = Qc2.Y;
               }

               if (var92 == var10011) {
                  Registry.lookupField(133925469553480382L).setBoolean(this, true);
                  var3 = a(-8093, 7650);
                  if (var1 == null) {
                     break label253;
                  }
               }

               var3 = a(-8122, -28121);
            }

            if (var4 != 0) {
            }
         }
      }

      Object var49 = 358275063187042994L;
      ((JLabel)Ref.g(358275063187042994L, var49)).setText((String)var3);
      Object var51 = 631555842482185462L;
      JLabel var81 = (JLabel)Ref.g(631555842482185462L, var51);
      String var10007 = (String)(Registry.emptyArgs());
      long var54 = 204000105621842013L;
      Object var53 = var10007;
      var10007 = Ref.h(204000105621842013L, var53, var54);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }

      var2.setText(var10007);
      Object var55 = 274107879507411256L;
      ((JLabel)Ref.g(274107879507411256L, var55)).setText(var5);
   }

   public void U() {
      Object var1 = 201427103655713904L;
      ((JButton)Ref.g(201427103655713904L, var1)).setEnabled(false);
   }

   public void p() {
      Object var1 = 201427103655713904L;
      ((JButton)Ref.g(201427103655713904L, var1)).setEnabled(true);
   }

   public void P() {
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 375944019649708240L;
      Object[] var4 = var10002;
      Ref.h(375944019649708240L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void H() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 612604310671515822L;
      Object[] var5 = var10002;
      Ref.h(612604310671515822L, var5, var6);
      SyncTaskManifest var10003 = (SyncTaskManifest)(Registry.emptyArgs());
      long var8 = 475326244946424763L;
      Object var7 = var10003;
      var10003 = Ref.h(475326244946424763L, var7, var8);

      try {
         var10003 = (SyncTaskManifest)var10003;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      SyncTaskManifest var1 = var10003;
      Object var9 = 424757448950891498L;
      Registry.packArgs(Ref.g(424757448950891498L, var9), var1);
      long var11 = 595769263487460645L;
      Ref.h2(595769263487460645L, var11);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      String var10006;
      Object var13 = 424757448950891498L;
      // [VF-super] super(((JPasswordField)Ref.g(424757448950891498L, var13)).getPassword());
      String var2 = var10006;
      Object[] var10007 = Registry.packArgs(var2);
      long var16 = 593547042552774431L;
      Object[] var15 = var10007;
      Ref.h(593547042552774431L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      Object[] var10008 = Registry.emptyArgs();
      long var18 = 465331157863382722L;
      Object[] var17 = var10008;
      Ref.h(465331157863382722L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      Registry.emptyArgs();
      long var19 = 270389152141252877L;
      Ref.h2(270389152141252877L, var19);
      Object[] var10010 = Registry.emptyArgs();
      long var22 = 612604310671515822L;
      Object[] var21 = var10010;
      Ref.h(612604310671515822L, var21, var22);
      Object[] var10011 = Registry.emptyArgs();
      long var24 = 391242562577877451L;
      Object[] var23 = var10011;
      Ref.h(391242562577877451L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }
   }

   public static void C(JPasswordField param0, SyncTaskManifest param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/crypto/User.c$int ()I
      // 03: new java/lang/String
      // 06: dup
      // 07: aload 0
      // 08: invokevirtual javax/swing/JPasswordField.getPassword ()[C
      // 0b: invokespecial java/lang/String.<init> ([C)V
      // 0e: astore 3
      // 0f: istore 2
      // 10: aload 3
      // 11: iload 2
      // 12: ifne 2d
      // 15: ldc ""
      // 17: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a: ifeq 2b
      // 1d: goto 24
      // 20: invokestatic com/finalshell/crypto/User.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: goto ab
      // 27: invokestatic com/finalshell/crypto/User.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: ldc ""
      // 2d: astore 4
      // 2f: aload 1
      // 30: iload 2
      // 31: ifne 3f
      // 34: ifnull 5f
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/crypto/User.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 1
      // 3f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 42: ldc2_w 317409027815843261
      // 45: astore 8
      // 47: astore 7
      // 49: ldc2_w 317409027815843261
      // 4c: aload 7
      // 4e: aload 8
      // 50: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 53: checkcast java/lang/String
      // 56: goto 5d
      // 59: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: astore 4
      // 5f: aload 3
      // 60: iload 2
      // 61: ifne 7c
      // 64: aload 4
      // 66: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 69: ifne ab
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/crypto/User.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: ldc ""
      // 75: goto 7c
      // 78: invokestatic com/finalshell/crypto/User.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: astore 5
      // 7e: aload 3
      // 7f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 82: ldc2_w 466665856241452304
      // 85: astore 9
      // 87: ldc2_w 466665856241452304
      // 8a: aload 9
      // 8c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 8f: checkcast java/lang/String
      // 92: goto 99
      // 95: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 98: athrow
      // 99: astore 5
      // 9b: goto a5
      // 9e: astore 6
      // a0: aload 6
      // a2: invokevirtual java/lang/Exception.printStackTrace ()V
      // a5: aload 0
      // a6: aload 5
      // a8: invokevirtual javax/swing/JPasswordField.setText (Ljava/lang/String;)V
      // ab: return
   }

   @Override
   public void A(Lv4_2 var1) {
   }

   public Vg2 c$Vg_2() {
      return null;
   }

   @Override
   public void F(Lv4_2 var1) {
   }

   public boolean v() {
      return Registry.lookupField(133925469553480382L).getBoolean(this);
   }

   public void G(boolean var1) {
      Registry.lookupField(133925469553480382L).setBoolean(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static void B(int var0) {
      y = var0;
   }

   public static int w() {
      return y;
   }

   public static int c$int() {
      int var0 = w();
      return var0 == 0 ? 16 : 0;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -8127) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 44;
               break;
            case 1:
               var10000 = 173;
               break;
            case 2:
               var10000 = 188;
               break;
            case 3:
               var10000 = 142;
               break;
            case 4:
               var10000 = 159;
               break;
            case 5:
               var10000 = 15;
               break;
            case 6:
               var10000 = 86;
               break;
            case 7:
               var10000 = 223;
               break;
            case 8:
               var10000 = 195;
               break;
            case 9:
               var10000 = 41;
               break;
            case 10:
               var10000 = 234;
               break;
            case 11:
               var10000 = 214;
               break;
            case 12:
               var10000 = 225;
               break;
            case 13:
               var10000 = 58;
               break;
            case 14:
               var10000 = 18;
               break;
            case 15:
               var10000 = 190;
               break;
            case 16:
               var10000 = 230;
               break;
            case 17:
               var10000 = 8;
               break;
            case 18:
               var10000 = 2;
               break;
            case 19:
               var10000 = 253;
               break;
            case 20:
               var10000 = 122;
               break;
            case 21:
               var10000 = 118;
               break;
            case 22:
               var10000 = 59;
               break;
            case 23:
               var10000 = 91;
               break;
            case 24:
               var10000 = 171;
               break;
            case 25:
               var10000 = 4;
               break;
            case 26:
               var10000 = 26;
               break;
            case 27:
               var10000 = 166;
               break;
            case 28:
               var10000 = 29;
               break;
            case 29:
               var10000 = 231;
               break;
            case 30:
               var10000 = 75;
               break;
            case 31:
               var10000 = 174;
               break;
            case 32:
               var10000 = 103;
               break;
            case 33:
               var10000 = 53;
               break;
            case 34:
               var10000 = 51;
               break;
            case 35:
               var10000 = 9;
               break;
            case 36:
               var10000 = 14;
               break;
            case 37:
               var10000 = 98;
               break;
            case 38:
               var10000 = 167;
               break;
            case 39:
               var10000 = 140;
               break;
            case 40:
               var10000 = 213;
               break;
            case 41:
               var10000 = 11;
               break;
            case 42:
               var10000 = 16;
               break;
            case 43:
               var10000 = 34;
               break;
            case 44:
               var10000 = 131;
               break;
            case 45:
               var10000 = 43;
               break;
            case 46:
               var10000 = 6;
               break;
            case 47:
               var10000 = 69;
               break;
            case 48:
               var10000 = 192;
               break;
            case 49:
               var10000 = 148;
               break;
            case 50:
               var10000 = 94;
               break;
            case 51:
               var10000 = 158;
               break;
            case 52:
               var10000 = 218;
               break;
            case 53:
               var10000 = 40;
               break;
            case 54:
               var10000 = 193;
               break;
            case 55:
               var10000 = 108;
               break;
            case 56:
               var10000 = 126;
               break;
            case 57:
               var10000 = 155;
               break;
            case 58:
               var10000 = 50;
               break;
            case 59:
               var10000 = 220;
               break;
            case 60:
               var10000 = 177;
               break;
            case 61:
               var10000 = 46;
               break;
            case 62:
               var10000 = 64;
               break;
            case 63:
               var10000 = 114;
               break;
            case 64:
               var10000 = 49;
               break;
            case 65:
               var10000 = 78;
               break;
            case 66:
               var10000 = 81;
               break;
            case 67:
               var10000 = 79;
               break;
            case 68:
               var10000 = 200;
               break;
            case 69:
               var10000 = 128;
               break;
            case 70:
               var10000 = 23;
               break;
            case 71:
               var10000 = 107;
               break;
            case 72:
               var10000 = 252;
               break;
            case 73:
               var10000 = 31;
               break;
            case 74:
               var10000 = 33;
               break;
            case 75:
               var10000 = 187;
               break;
            case 76:
               var10000 = 66;
               break;
            case 77:
               var10000 = 55;
               break;
            case 78:
               var10000 = 130;
               break;
            case 79:
               var10000 = 197;
               break;
            case 80:
               var10000 = 160;
               break;
            case 81:
               var10000 = 172;
               break;
            case 82:
               var10000 = 133;
               break;
            case 83:
               var10000 = 24;
               break;
            case 84:
               var10000 = 88;
               break;
            case 85:
               var10000 = 12;
               break;
            case 86:
               var10000 = 85;
               break;
            case 87:
               var10000 = 206;
               break;
            case 88:
               var10000 = 144;
               break;
            case 89:
               var10000 = 25;
               break;
            case 90:
               var10000 = 207;
               break;
            case 91:
               var10000 = 176;
               break;
            case 92:
               var10000 = 1;
               break;
            case 93:
               var10000 = 244;
               break;
            case 94:
               var10000 = 209;
               break;
            case 95:
               var10000 = 224;
               break;
            case 96:
               var10000 = 149;
               break;
            case 97:
               var10000 = 17;
               break;
            case 98:
               var10000 = 147;
               break;
            case 99:
               var10000 = 62;
               break;
            case 100:
               var10000 = 134;
               break;
            case 101:
               var10000 = 123;
               break;
            case 102:
               var10000 = 74;
               break;
            case 103:
               var10000 = 241;
               break;
            case 104:
               var10000 = 113;
               break;
            case 105:
               var10000 = 22;
               break;
            case 106:
               var10000 = 141;
               break;
            case 107:
               var10000 = 68;
               break;
            case 108:
               var10000 = 32;
               break;
            case 109:
               var10000 = 65;
               break;
            case 110:
               var10000 = 95;
               break;
            case 111:
               var10000 = 139;
               break;
            case 112:
               var10000 = 84;
               break;
            case 113:
               var10000 = 0;
               break;
            case 114:
               var10000 = 178;
               break;
            case 115:
               var10000 = 125;
               break;
            case 116:
               var10000 = 157;
               break;
            case 117:
               var10000 = 250;
               break;
            case 118:
               var10000 = 210;
               break;
            case 119:
               var10000 = 135;
               break;
            case 120:
               var10000 = 201;
               break;
            case 121:
               var10000 = 5;
               break;
            case 122:
               var10000 = 136;
               break;
            case 123:
               var10000 = 232;
               break;
            case 124:
               var10000 = 54;
               break;
            case 125:
               var10000 = 243;
               break;
            case 126:
               var10000 = 105;
               break;
            case 127:
               var10000 = 72;
               break;
            case 128:
               var10000 = 109;
               break;
            case 129:
               var10000 = 202;
               break;
            case 130:
               var10000 = 227;
               break;
            case 131:
               var10000 = 217;
               break;
            case 132:
               var10000 = 211;
               break;
            case 133:
               var10000 = 21;
               break;
            case 134:
               var10000 = 169;
               break;
            case 135:
               var10000 = 115;
               break;
            case 136:
               var10000 = 245;
               break;
            case 137:
               var10000 = 73;
               break;
            case 138:
               var10000 = 38;
               break;
            case 139:
               var10000 = 60;
               break;
            case 140:
               var10000 = 153;
               break;
            case 141:
               var10000 = 35;
               break;
            case 142:
               var10000 = 165;
               break;
            case 143:
               var10000 = 120;
               break;
            case 144:
               var10000 = 221;
               break;
            case 145:
               var10000 = 132;
               break;
            case 146:
               var10000 = 222;
               break;
            case 147:
               var10000 = 13;
               break;
            case 148:
               var10000 = 39;
               break;
            case 149:
               var10000 = 162;
               break;
            case 150:
               var10000 = 117;
               break;
            case 151:
               var10000 = 137;
               break;
            case 152:
               var10000 = 97;
               break;
            case 153:
               var10000 = 170;
               break;
            case 154:
               var10000 = 82;
               break;
            case 155:
               var10000 = 89;
               break;
            case 156:
               var10000 = 87;
               break;
            case 157:
               var10000 = 96;
               break;
            case 158:
               var10000 = 138;
               break;
            case 159:
               var10000 = 196;
               break;
            case 160:
               var10000 = 102;
               break;
            case 161:
               var10000 = 238;
               break;
            case 162:
               var10000 = 229;
               break;
            case 163:
               var10000 = 116;
               break;
            case 164:
               var10000 = 28;
               break;
            case 165:
               var10000 = 189;
               break;
            case 166:
               var10000 = 27;
               break;
            case 167:
               var10000 = 37;
               break;
            case 168:
               var10000 = 129;
               break;
            case 169:
               var10000 = 161;
               break;
            case 170:
               var10000 = 10;
               break;
            case 171:
               var10000 = 121;
               break;
            case 172:
               var10000 = 71;
               break;
            case 173:
               var10000 = 45;
               break;
            case 174:
               var10000 = 239;
               break;
            case 175:
               var10000 = 156;
               break;
            case 176:
               var10000 = 203;
               break;
            case 177:
               var10000 = 104;
               break;
            case 178:
               var10000 = 181;
               break;
            case 179:
               var10000 = 255;
               break;
            case 180:
               var10000 = 219;
               break;
            case 181:
               var10000 = 198;
               break;
            case 182:
               var10000 = 112;
               break;
            case 183:
               var10000 = 175;
               break;
            case 184:
               var10000 = 146;
               break;
            case 185:
               var10000 = 48;
               break;
            case 186:
               var10000 = 163;
               break;
            case 187:
               var10000 = 152;
               break;
            case 188:
               var10000 = 183;
               break;
            case 189:
               var10000 = 3;
               break;
            case 190:
               var10000 = 204;
               break;
            case 191:
               var10000 = 100;
               break;
            case 192:
               var10000 = 20;
               break;
            case 193:
               var10000 = 249;
               break;
            case 194:
               var10000 = 216;
               break;
            case 195:
               var10000 = 76;
               break;
            case 196:
               var10000 = 77;
               break;
            case 197:
               var10000 = 52;
               break;
            case 198:
               var10000 = 110;
               break;
            case 199:
               var10000 = 106;
               break;
            case 200:
               var10000 = 168;
               break;
            case 201:
               var10000 = 248;
               break;
            case 202:
               var10000 = 191;
               break;
            case 203:
               var10000 = 80;
               break;
            case 204:
               var10000 = 235;
               break;
            case 205:
               var10000 = 111;
               break;
            case 206:
               var10000 = 57;
               break;
            case 207:
               var10000 = 186;
               break;
            case 208:
               var10000 = 127;
               break;
            case 209:
               var10000 = 101;
               break;
            case 210:
               var10000 = 215;
               break;
            case 211:
               var10000 = 30;
               break;
            case 212:
               var10000 = 199;
               break;
            case 213:
               var10000 = 92;
               break;
            case 214:
               var10000 = 208;
               break;
            case 215:
               var10000 = 228;
               break;
            case 216:
               var10000 = 145;
               break;
            case 217:
               var10000 = 242;
               break;
            case 218:
               var10000 = 184;
               break;
            case 219:
               var10000 = 180;
               break;
            case 220:
               var10000 = 179;
               break;
            case 221:
               var10000 = 246;
               break;
            case 222:
               var10000 = 99;
               break;
            case 223:
               var10000 = 7;
               break;
            case 224:
               var10000 = 42;
               break;
            case 225:
               var10000 = 194;
               break;
            case 226:
               var10000 = 19;
               break;
            case 227:
               var10000 = 119;
               break;
            case 228:
               var10000 = 185;
               break;
            case 229:
               var10000 = 61;
               break;
            case 230:
               var10000 = 154;
               break;
            case 231:
               var10000 = 56;
               break;
            case 232:
               var10000 = 182;
               break;
            case 233:
               var10000 = 254;
               break;
            case 234:
               var10000 = 251;
               break;
            case 235:
               var10000 = 47;
               break;
            case 236:
               var10000 = 233;
               break;
            case 237:
               var10000 = 90;
               break;
            case 238:
               var10000 = 236;
               break;
            case 239:
               var10000 = 67;
               break;
            case 240:
               var10000 = 63;
               break;
            case 241:
               var10000 = 237;
               break;
            case 242:
               var10000 = 164;
               break;
            case 243:
               var10000 = 83;
               break;
            case 244:
               var10000 = 93;
               break;
            case 245:
               var10000 = 70;
               break;
            case 246:
               var10000 = 150;
               break;
            case 247:
               var10000 = 205;
               break;
            case 248:
               var10000 = 151;
               break;
            case 249:
               var10000 = 36;
               break;
            case 250:
               var10000 = 124;
               break;
            case 251:
               var10000 = 212;
               break;
            case 252:
               var10000 = 247;
               break;
            case 253:
               var10000 = 143;
               break;
            case 254:
               var10000 = 240;
               break;
            default:
               var10000 = 226;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25287;
      if (g[var3] == null) {
         g[var3] = (int)(f[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[42];
      int var11 = 0;
      String var10 = "咲毴宑硛$äCíU\u0098&uÎ\u0006@\u0001¡Ø!ð\u0098R\u0000¾J+y\u001a\u0089åT«ÒÜe\u009fD\u001d\u0005bø\b岗枩讙缹哳殷嬌砪\u0006盔忻后毨簒繝\u000bÚi*\u0010`\u008ea×ò¼_\u0004忊郑柘勏\u0003疯戮呙\u0002朆睸\u0017\u0007Þ`x\u0085¦Ì\bqÃ\u008a\u008c\rhHÄ\u0005OZª?f\u0012\u0004计汊妀赫\u0006譝翋呂殲宦磈\u0007譀轶凨吮欔寘硳\u0002毝廈\u000e讃譽姽赾!癣忡赊反戱孻硖锾謽\u0004癵彌贐厌\u0004劍救牚悀\u0005识皷弈跉厬\u00051\u0095ª\u0012\u009b\u0014ÊîÙ~²f*\u0012¢É\u0014»ÒHBêÎ\u008b\u0084k\u0004膮劭哢歠\u001ci¾\u00adt<'û8\u0097ÅVL\u0096p;Çk/\u0097¦\u0086â%o£\u0093Ú\u0007\nÈ¼hª(Ùo;Þç\u0002殎幬\u0004呷殫講暿\f\u0018/«nú0¦SL[BF\u0002謎晧\n[\u0081\u001a\rf-¨¥é4\b吁次本剁枅斣枾\u0001\nb¤=©\u0082¹?7qf\u0006周歲寊碋闻诩\u0004彘勳爈悖\teC\u000fJ幦\u0004朇\u0014旵\u0017\u0095Á2\u009bÏÚ\u0085\u0087X2¯²©¯Ü<\u0097P\bIu\u001a[\u0004m\u0006Ù\u0081\u0007咩欳朹刃朄徣郌\u001f\u009ekSÎãp\u0000×í\u009d±[\u008bHo0\u009c;¶ë°|¢$_-§\u0096;Ó§\u000e3\u0092Ý\u0099wß\rÂ\\Ò\u0082ù\u0002\u0000\u001cMÊ)ú¬öé\u0002Õ\u0082\u001e¤\u009fm\u001adO[\u0013(\u001667Pát\u0092û\u0002硷孎\u0004YÔ_Û";
      int var12 = "咲毴宑硛$äCíU\u0098&uÎ\u0006@\u0001¡Ø!ð\u0098R\u0000¾J+y\u001a\u0089åT«ÒÜe\u009fD\u001d\u0005bø\b岗枩讙缹哳殷嬌砪\u0006盔忻后毨簒繝\u000bÚi*\u0010`\u008ea×ò¼_\u0004忊郑柘勏\u0003疯戮呙\u0002朆睸\u0017\u0007Þ`x\u0085¦Ì\bqÃ\u008a\u008c\rhHÄ\u0005OZª?f\u0012\u0004计汊妀赫\u0006譝翋呂殲宦磈\u0007譀轶凨吮欔寘硳\u0002毝廈\u000e讃譽姽赾!癣忡赊反戱孻硖锾謽\u0004癵彌贐厌\u0004劍救牚悀\u0005识皷弈跉厬\u00051\u0095ª\u0012\u009b\u0014ÊîÙ~²f*\u0012¢É\u0014»ÒHBêÎ\u008b\u0084k\u0004膮劭哢歠\u001ci¾\u00adt<'û8\u0097ÅVL\u0096p;Çk/\u0097¦\u0086â%o£\u0093Ú\u0007\nÈ¼hª(Ùo;Þç\u0002殎幬\u0004呷殫講暿\f\u0018/«nú0¦SL[BF\u0002謎晧\n[\u0081\u001a\rf-¨¥é4\b吁次本剁枅斣枾\u0001\nb¤=©\u0082¹?7qf\u0006周歲寊碋闻诩\u0004彘勳爈悖\teC\u000fJ幦\u0004朇\u0014旵\u0017\u0095Á2\u009bÏÚ\u0085\u0087X2¯²©¯Ü<\u0097P\bIu\u001a[\u0004m\u0006Ù\u0081\u0007咩欳朹刃朄徣郌\u001f\u009ekSÎãp\u0000×í\u009d±[\u008bHo0\u009c;¶ë°|¢$_-§\u0096;Ó§\u000e3\u0092Ý\u0099wß\rÂ\\Ò\u0082ù\u0002\u0000\u001cMÊ)ú¬öé\u0002Õ\u0082\u001e¤\u009fm\u001adO[\u0013(\u001667Pát\u0092û\u0002硷孎\u0004YÔ_Û"
         .length();
      char var9 = 4;
      int var17 = -1;
      B(24);

      label70:
      while (true) {
         byte var10000 = 69;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
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
                        var65 = 18;
                        break;
                     case 1:
                        var65 = 62;
                        break;
                     case 2:
                        var65 = 35;
                        break;
                     case 3:
                        var65 = 39;
                        break;
                     case 4:
                        var65 = 44;
                        break;
                     case 5:
                        var65 = 95;
                        break;
                     default:
                        var65 = 81;
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
                     b = new String[42];
                     long var0 = 8532446150859935992L;
                     long[] var6 = new long[13];
                     int var3 = 0;
                     String var4 = "\u000fwê\u0014iPF\u009esËL\u0018,Î!ÌÒ!\u0002*¸éü»\u0089&\bH\u0094Á\b\u00895¸ã+\u0097\u0089:VØ÷\u0090¸Aö44\u009d\u0086¨\u0099â®C%FÿÞ\u0092.*Y\u0098e`¹\u001b½w¼\u00ad\u0006m\u0095°\u001ag§ÛJZ`\u008a8Ïör";
                     int var5 = "\u000fwê\u0014iPF\u009esËL\u0018,Î!ÌÒ!\u0002*¸éü»\u0089&\bH\u0094Á\b\u00895¸ã+\u0097\u0089:VØ÷\u0090¸Aö44\u009d\u0086¨\u0099â®C%FÿÞ\u0092.*Y\u0098e`¹\u001b½w¼\u00ad\u0006m\u0095°\u001ag§ÛJZ`\u008a8Ïör"
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
                                    f = var6;
                                    g = new Integer[13];
                                    Registry.lookupField(231329429374491840L).set(null, a(-8098, -24663));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "`ñt\bÛ9tø)ï\u0080¤x?#h";
                                 var5 = "`ñt\bÛ9tø)ï\u0080¤x?#h".length();
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

                  var10 = "õö.>\"\u0000\u008c\u0012GãÊô \u008a\u0004醲罤帻加";
                  var12 = "õö.>\"\u0000\u008c\u0012GãÊô \u008a\u0004醲罤帻加".length();
                  var9 = 14;
                  var17 = -1;
            }

            var10000 = 6;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





