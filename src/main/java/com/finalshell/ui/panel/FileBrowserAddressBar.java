package com.finalshell.ui.panel;

import com.finalshell.connection.FileTransferConnection;
import com.finalshell.core.CR;
import com.finalshell.core.Dv2;
import com.finalshell.core.GP;
import com.finalshell.core.KD;
import com.finalshell.core.Km2;
import com.finalshell.core.L1;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.NY;
import com.finalshell.core.Qe2_2;
import com.finalshell.core.T3;
import com.finalshell.core.Td4;
import com.finalshell.core.U62;
import com.finalshell.core.Uf4;
import com.finalshell.core.YI;
import com.finalshell.core.Yd2;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.DF3;
import com.finalshell.task.FileJob2;
import com.finalshell.task.OV;
import com.finalshell.task.Qk2;
import com.finalshell.task.UN3;
import com.finalshell.task.Uk2;
import com.finalshell.task.VZ;
import com.finalshell.task.Vy2;
import com.finalshell.task.YY3;
import com.finalshell.task.ZH;
import com.finalshell.ui.dialog.ApplyToFileAndDirDialog;
import com.finalshell.ui.dialog.DownloadProgressDialog;
import com.finalshell.ui.dialog.Fm2;
import com.finalshell.ui.dialog.ProgressDialog;
import com.finalshell.ui.listener.BV;
import com.finalshell.ui.listener.C2;
import com.finalshell.ui.listener.JW;
import com.finalshell.ui.listener.L22;
import com.finalshell.ui.listener.OH;
import com.finalshell.ui.listener.TL;
import com.finalshell.ui.listener.Wc2;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.RenderingHints;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.border.MatteBorder;
import net.miginfocom.swing.MigLayout;

public class FileBrowserAddressBar extends F8 implements Td4 {
   public FileTransferConnection E;
   public FileTransferConnection o;
   public JPanel s;
   public Bi2 t;
   public ConnectionInfoPanel S;
   public Km2 h;
   public com.finalshell.ui.model.Kl4 P;
   public ArrayList g;
   public String y;
   public Lv4_2 L;
   public LoadingPanel A;
   public String W;
   public ConnectionProperty C;
   public boolean j;
   public boolean l;
   public Fm2 k;
   public FileCommandPanel X;
   public Dv2 J;
   public T2 r;
   public static SimpleDateFormat F;
   public JButton B;
   public JButton a;
   public JButton b;
   public JButton G;
   public JButton Y;
   public JButton e;
   public JScrollPane x;
   public boolean Z;
   public static boolean M;
   public static String[] d;
   public static String[] i;
   public static long[] m;
   public static Integer[] n;

   public FileBrowserAddressBar() {
      ArrayList var10001 = new ArrayList();
      long var2 = 625337668494616580L;
      ArrayList var1 = var10001;
      Ref.s(625337668494616580L, var1, var2);
      long var4 = 575820630826541433L;
      Object var3 = null;
      Ref.s(575820630826541433L, var3, var4);
      Registry.lookupField(141556903907833792L).setBoolean(this, true);
      Registry.lookupField(188383599609663881L).setBoolean(this, false);
      Registry.lookupField(388861231234977918L).setBoolean(this, false);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 577065089047651118L;
      Object[] var5 = var10003;
      Ref.h(577065089047651118L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void F() {
      this.setLayout(new MigLayout(a(20043, 8996), a(20044, -32299), a(20056, 31227)));
      this.setOpaque(false);
      this.setBackground(Color.yellow);
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 442180919565762361L;
      Object[] var1 = var10001;
      Ref.h(442180919565762361L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void u() {
      boolean var1 = g();
      Object var2 = 460354311900945697L;
      Object var10001 = (FileTransferConnection)Ref.g(460354311900945697L, var2);
      if (!var1) {
         if (var10001 != null) {
            Object var4 = 460354311900945697L;
            Ref.g(460354311900945697L, var4);
            Object[] var10003 = Registry.emptyArgs();
            long var7 = 335950632529437253L;
            Object[] var6 = var10003;
            Ref.h(335950632529437253L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }
         }

         var10001 = this;
         Object var8 = 382217741243932264L;
         FileTransferConnection var10002 = (FileTransferConnection)Ref.g(382217741243932264L, var8);
      }

      if (!var1) {
         if (var10001 == null) {
            return;
         }

         Object var10 = 382217741243932264L;
         FileTransferConnection var16 = (FileTransferConnection)Ref.g(382217741243932264L, var10);
      }

      Object[] var17 = Registry.emptyArgs();
      long var13 = 335950632529437253L;
      Object[] var12 = var17;
      Ref.h(335950632529437253L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }

   public void q$void() {
      Object[] var62;
      Registry.lookupField(188383599609663881L).setBoolean(this, true);
      g();
      Object var2 = 181230843087831165L;
      Ref.g(181230843087831165L, var2);
      Object[] var10003 = Registry.emptyArgs();
      long var5 = 215393206632126241L;
      Object[] var4 = var10003;
      Ref.h(215393206632126241L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var83) {
         throw var83.getTargetException();
      }

      Object var6 = 627973027287447539L;
      Ref.g(627973027287447539L, var6);
      Object[] var10005 = Registry.emptyArgs();
      long var9 = 209768537123739996L;
      Object[] var8 = var10005;
      Ref.h(209768537123739996L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var82) {
         throw var82.getTargetException();
      }

      Object var10 = 150762093507542450L;
      Object var10006 = Ref.g(150762093507542450L, var10);
      Object[] var10007 = Registry.emptyArgs();
      long var13 = 221605835241312580L;
      Object[] var12 = var10007;
      Ref.h(221605835241312580L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }

      Object var1 = var10006;
      Object var14 = 329882746337374810L;
      ((JScrollPane)Ref.g(329882746337374810L, var14)).setViewportView(null);
      this.removeAll();
      Object var16 = 426888588741823559L;
      Registry.packArgs(Ref.g(426888588741823559L, var16));
      long var18 = 242617331513341262L;
      Ref.h2(242617331513341262L, var18);

      try {
         ;
      } catch (InvocationTargetException var80) {
         throw var80.getTargetException();
      }

      Object var20 = 461351885911709248L;
      Registry.packArgs(Ref.g(461351885911709248L, var20));
      long var22 = 242617331513341262L;
      Ref.h2(242617331513341262L, var22);

      try {
         ;
      } catch (InvocationTargetException var79) {
         throw var79.getTargetException();
      }

      Object var24 = 125409105349421096L;
      Registry.packArgs(Ref.g(125409105349421096L, var24));
      long var26 = 242617331513341262L;
      Ref.h2(242617331513341262L, var26);

      try {
         ;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }

      Object var28 = 592875533914623126L;
      Registry.packArgs(Ref.g(592875533914623126L, var28));
      long var30 = 242617331513341262L;
      Ref.h2(242617331513341262L, var30);

      try {
         ;
      } catch (InvocationTargetException var77) {
         throw var77.getTargetException();
      }

      Object var32 = 125193345155386567L;
      Registry.packArgs(Ref.g(125193345155386567L, var32));
      long var34 = 242617331513341262L;
      Ref.h2(242617331513341262L, var34);

      try {
         ;
      } catch (InvocationTargetException var76) {
         throw var76.getTargetException();
      }

      Object var36 = 567412502050951757L;
      Registry.packArgs(Ref.g(567412502050951757L, var36));
      long var38 = 242617331513341262L;
      Ref.h2(242617331513341262L, var38);

      try {
         ;
      } catch (InvocationTargetException var75) {
         throw var75.getTargetException();
      }

      Object var40 = 506751131738108937L;
      Registry.packArgs(Ref.g(506751131738108937L, var40));
      long var42 = 242617331513341262L;
      Ref.h2(242617331513341262L, var42);

      try {
         ;
      } catch (InvocationTargetException var74) {
         throw var74.getTargetException();
      }

      Object var44 = 329882746337374810L;
      Registry.packArgs(Ref.g(329882746337374810L, var44));
      long var46 = 242617331513341262L;
      Ref.h2(242617331513341262L, var46);

      try {
         ;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      Object var48 = 150762093507542450L;
      Registry.packArgs(Ref.g(150762093507542450L, var48));
      long var50 = 242617331513341262L;
      Ref.h2(242617331513341262L, var50);

      try {
         ;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      label148: {
         Object var52 = 460354311900945697L;
         Object var10026 = (FileTransferConnection)Ref.g(460354311900945697L, var52);
         if (var1 == null) {
            if (var10026 != null) {
               Object var54 = 460354311900945697L;
               Ref.g(460354311900945697L, var54);
               Object[] var10028 = Registry.emptyArgs();
               long var57 = 588282780871837510L;
               Object[] var56 = var10028;
               Ref.h(588282780871837510L, var56, var57);

               try {
                  ;
               } catch (InvocationTargetException var71) {
                  throw var71.getTargetException();
               }
            }

            var10026 = this;
            if (var1 == null) {
               break label148;
            }

            Object var58 = 382217741243932264L;
            FileTransferConnection var10027 = (FileTransferConnection)Ref.g(382217741243932264L, var58);
         }

         if (var10026 != null) {
            Object var60 = 382217741243932264L;
            Ref.g(382217741243932264L, var60);
            Object[] var84 = Registry.emptyArgs();
            long var63 = 588282780871837510L;
            var62 = var84;
            Ref.h(588282780871837510L, var62, var63);

            try {
               ;
            } catch (InvocationTargetException var70) {
               throw var70.getTargetException();
            }
         }

         Registry.packArgs(this);
         long var64 = 242617331513341262L;
         Ref.h2(242617331513341262L, var64);

         try {
            ;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }
      }

      Object[] var85 = Registry.emptyArgs();
      long var67 = 398384310464884086L;
      Object[] var66 = var85;
      Ref.h(398384310464884086L, var66, var67);

      try {
         ;
      } catch (InvocationTargetException var68) {
         throw var68.getTargetException();
      }
   }

   public void m(ConnectHost var1, Lv4_2 var2) {
      boolean var3 = i();
      if (var3) {
         if (Registry.lookupField(188383599609663881L).getBoolean(this)) {
            return;
         }

         long var5 = 412956294006961210L;
         Ref.s(412956294006961210L, var2, var5);
         FileTransferConnection var10002 = new FileTransferConnection(var2, var1, Registry.lookupField(383997995785705643L).getInt(null));
         long var7 = 460354311900945697L;
         FileTransferConnection var6 = var10002;
         Ref.s(460354311900945697L, var6, var7);
      }

      Object var8 = 460354311900945697L;
      Ref.g(460354311900945697L, var8);
      Object[] var19 = Registry.packArgs(this);
      long var11 = 315690782692350561L;
      Object[] var10 = var19;
      Ref.h(315690782692350561L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10003 = Registry.packArgs(new DF3(this));
      long var13 = 434592463220957006L;
      Object[] var12 = var10003;
      Ref.h(434592463220957006L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10004 = Registry.packArgs(new UN3(this, var1));
      long var15 = 434592463220957006L;
      Object[] var14 = var10004;
      Ref.h(434592463220957006L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public void Q(ConnectHost var1) throws Exception {
      FileTransferConnection var10002;
      Object var2 = 412956294006961210L;
      // [VF-super] super((Lv4_2)Ref.g(412956294006961210L, var2), var1, Registry.lookupField(172266869270573121L).getInt(null));
      long var5 = 382217741243932264L;
      FileTransferConnection var4 = var10002;
      Ref.s(382217741243932264L, var4, var5);
      Object var6 = 382217741243932264L;
      Ref.g(382217741243932264L, var6);
      Object[] var10004 = Registry.packArgs(this);
      long var9 = 315690782692350561L;
      Object[] var8 = var10004;
      Ref.h(315690782692350561L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public void T(String var1) {
      Dv2 var2;
      String var3;
      label23: {
         long var5 = 130333487516543213L;
         Ref.s(130333487516543213L, var1, var5);
         Object var6 = 426888588741823559L;
         ((Dv2)Ref.g(426888588741823559L, var6)).setText(var1);
         i();
         Object var8 = 426888588741823559L;
         Dv2 var10004 = (Dv2)Ref.g(426888588741823559L, var8);
         Object var10 = 426888588741823559L;
         this.setCaretPosition(((Dv2)Ref.g(426888588741823559L, var10)).getDocument().getLength());
         var2 = var10004;
         var3 = null;
         Object var12 = 625337668494616580L;
         Object var10005 = (ArrayList)Ref.g(625337668494616580L, var12);
         if (var2 == null) {
            if (var10005.size() <= 0) {
               break label23;
            }

            var10005 = this;
            Object var14 = 625337668494616580L;
            ArrayList var10006 = (ArrayList)Ref.g(625337668494616580L, var14);
            Object var16 = 625337668494616580L;
            this.get(((ArrayList)Ref.g(625337668494616580L, var16)).size() - 1);
         }

         var3 = (String)var10005;
      }

      if (var2 == null && !var1.equals(var3)) {
         Object var18 = 625337668494616580L;
         ((ArrayList)Ref.g(625337668494616580L, var18)).add(var1);
      }
   }

   public void D$void() {
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 399585344452154517L;
      Object[] var7 = var10002;
      Ref.h(399585344452154517L, var7, var8);
      NY var10003 = (NY)(Registry.emptyArgs());
      long var10 = 149968465491171480L;
      Object var9 = var10003;
      var10003 = Ref.h(149968465491171480L, var9, var10);

      try {
         var10003 = (NY)var10003;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      NY var1 = var10003;
      Color var10004 = (Color)(Registry.emptyArgs());
      long var12 = 345089686683358688L;
      Object var11 = var10004;
      var10004 = Ref.h(345089686683358688L, var11, var12);

      try {
         var10004 = (Color)var10004;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Color var2 = var10004;
      Object[] var10005 = Registry.emptyArgs();
      long var14 = 357445816026915918L;
      Object[] var13 = var10005;
      Ref.h(357445816026915918L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Registry.packArgs(var2);
      long var15 = 430829682188014939L;
      Ref.h2(430829682188014939L, var15);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      byte var10006 = 2;
      Color var10011 = (Color)(Registry.emptyArgs());
      long var18 = 345089686683358688L;
      Object var17 = var10011;
      var10011 = Ref.h(345089686683358688L, var17, var18);

      try {
         var10011 = (Color)var10011;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      MatteBorder var4 = BorderFactory.createMatteBorder(0, 0, 0, (int)var1, var10011);
   }

   public void N() {
      long var141;
      long var28;
      GP var62;
      JPanel var10001 = new JPanel();
      long var11 = 272238901011657720L;
      JPanel var10 = var10001;
      Ref.s(272238901011657720L, var10, var11);
      Object var12 = 272238901011657720L;
      this.add((JPanel)Ref.g(272238901011657720L, var12), a(20040, -26649));
      Object var14 = 272238901011657720L;
      ((JPanel)Ref.g(272238901011657720L, var14)).setOpaque(false);
      Object var16 = 272238901011657720L;
      ((JPanel)Ref.g(272238901011657720L, var16)).setLayout(new MigLayout(a(20045, -2900), a(20060, 17384), a(20060, 17384)));
      Bi2 var10005 = new Bi2();
      long var19 = 345912814423170794L;
      Bi2 var18 = var10005;
      Ref.s(345912814423170794L, var18, var19);
      Object var20 = 345912814423170794L;
      ((Bi2)Ref.g(345912814423170794L, var20)).setLayout(new MigLayout(a(20092, -8232), a(20062, -17243), ""));
      Object var22 = 345912814423170794L;
      ((Bi2)Ref.g(345912814423170794L, var22)).setOpaque(false);
      Object var24 = 272238901011657720L;
      JPanel var10008 = (JPanel)Ref.g(272238901011657720L, var24);
      Object var26 = 345912814423170794L;
      this.add((Bi2)Ref.g(345912814423170794L, var26), a(20094, -19896));
      JPanel var2 = new JPanel();
      var2.setOpaque(false);
      var2.setLayout(new MigLayout(a(20059, -19444), "", a(20037, -28487)));
      Registry.packArgs(a(20047, -5909));
      var28 = 479240045929603103L;
      Object var10011 = Ref.h2(479240045929603103L, var28);
      long var31 = 426888588741823559L;
      Object var30 = var10011;
      Ref.s(426888588741823559L, var30, var31);
      Registry.packArgs("\uf1da");
      long var32 = 360256375153447639L;
      Object var10013 = Ref.h2(360256375153447639L, var32);
      long var35 = 180432608079120024L;
      Object var34 = var10013;
      Ref.s(180432608079120024L, var34, var35);
      Object var36 = 180432608079120024L;
      ((T2)Ref.g(180432608079120024L, var36)).setOpaque(false);
      Object var38 = 180432608079120024L;
      ((T2)Ref.g(180432608079120024L, var38)).setForeground((Color)Registry.lookupField(430697627377283751L).get(null));
      Object var40 = 180432608079120024L;
      ((T2)Ref.g(180432608079120024L, var40)).setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      Object var42 = 426888588741823559L;
      this.add((Dv2)Ref.g(426888588741823559L, var42), a(20053, -25508));
      Object var44 = 426888588741823559L;
      Registry.packArgs(Ref.g(426888588741823559L, var44));
      long var46 = 322267315291882359L;
      Ref.h2(322267315291882359L, var46);
      Fm2 var10021;
      Object var48 = 426888588741823559L;
      // [VF-super] super(this, (Dv2)Ref.g(426888588741823559L, var48));
      long var51 = 181230843087831165L;
      Fm2 var50 = var10021;
      Ref.s(181230843087831165L, var50, var51);
      Object var52 = 345912814423170794L;
      ((Bi2)Ref.g(345912814423170794L, var52)).add(var2, "");
      g();
      Object var54 = 426888588741823559L;
      ((Dv2)Ref.g(426888588741823559L, var54)).addKeyListener(new BV(this));
      GP var10025 = ConnectionProperty.K("\uf060");
      long var57 = 461351885911709248L;
      GP var56 = var10025;
      Ref.s(461351885911709248L, var56, var57);
      Object var58 = 461351885911709248L;
      ((JButton)Ref.g(461351885911709248L, var58)).addActionListener(new TL(this));
      GP var10027 = ConnectionProperty.K("\uf061");
      long var61 = 125409105349421096L;
      GP var60 = var10027;
      Ref.s(125409105349421096L, var60, var61);
      new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      GP var10028 = ConnectionProperty.K("\uf021");
      long var63 = 592875533914623126L;
      var62 = var10028;
      Ref.s(592875533914623126L, var62, var63);
      Object var64 = 345912814423170794L;
      Bi2 var10029 = (Bi2)Ref.g(345912814423170794L, var64);
      Object var66 = 592875533914623126L;
      this.add((JButton)Ref.g(592875533914623126L, var66));
      Object var68 = 592875533914623126L;
      ((JButton)Ref.g(592875533914623126L, var68)).addActionListener(new Wc2(this));
      GP var10032 = ConnectionProperty.K("\uf148");
      long var71 = 125193345155386567L;
      GP var70 = var10032;
      Ref.s(125193345155386567L, var70, var71);
      Object var72 = 345912814423170794L;
      Bi2 var10033 = (Bi2)Ref.g(345912814423170794L, var72);
      Object var74 = 125193345155386567L;
      this.add((JButton)Ref.g(125193345155386567L, var74));
      Object var76 = 125193345155386567L;
      ((JButton)Ref.g(125193345155386567L, var76)).addActionListener(new C2(this));
      JPanel var4 = new JPanel();
      var4.setLayout(new MigLayout(a(20045, -2900), a(20036, -29961), a(20081, -6032)));
      Qe2_2 var5 = new Qe2_2("\uf0ec");
      var5.setSelected(Registry.lookupField(141556903907833792L).getBoolean(this));
      var5.setFont((Font)Registry.lookupField(344087302787482558L).get(null));
      var5.setForeground(new Color(b(27327, 6395458649089044064L), b(24089, 146975349765003971L), b(24089, 146975349765003971L)));
      var5.r(new Color(b(12643, 4798910445343323578L), b(11378, 5217342361567307945L), b(11378, 5217342361567307945L)));
      var4.add(var5);
      KD var6 = new KD(a(20093, 27158));
      var6.G(true);
      GP var10036 = ConnectionProperty.K("\uf019");
      long var79 = 567412502050951757L;
      GP var78 = var10036;
      Ref.s(567412502050951757L, var78, var79);
      Object var80 = 567412502050951757L;
      ((JButton)Ref.g(567412502050951757L, var80)).setFocusable(false);
      Object var82 = 567412502050951757L;
      ((JButton)Ref.g(567412502050951757L, var82)).addActionListener(new L22(this));
      Object var84 = 345912814423170794L;
      Bi2 var10039 = (Bi2)Ref.g(345912814423170794L, var84);
      Object var86 = 567412502050951757L;
      this.add((JButton)Ref.g(567412502050951757L, var86));
      Bi2 var1 = var10039;
      GP var10040 = ConnectionProperty.K("\uf093");
      long var89 = 506751131738108937L;
      GP var88 = var10040;
      Ref.s(506751131738108937L, var88, var89);
      Object var90 = 506751131738108937L;
      ((JButton)Ref.g(506751131738108937L, var90)).setFocusable(false);
      Object var92 = 506751131738108937L;
      ((JButton)Ref.g(506751131738108937L, var92)).addActionListener(new OH(this));
      Object var94 = 345912814423170794L;
      Bi2 var10043 = (Bi2)Ref.g(345912814423170794L, var94);
      Object var96 = 506751131738108937L;
      this.add((JButton)Ref.g(506751131738108937L, var96));
      JSplitPane var7 = new JSplitPane(1);
      var7.setOpaque(false);
      Object var98 = 272238901011657720L;
      ((JPanel)Ref.g(272238901011657720L, var98)).add(var7, a(20061, -26462));
      com.finalshell.ui.model.Kl4 var10046 = new com.finalshell.ui.model.Kl4(false);
      long var101 = 246488842365380158L;
      com.finalshell.ui.model.Kl4 var100 = var10046;
      Ref.s(246488842365380158L, var100, var101);
      ConnectionInfoPanel var10048;
      Object var102 = 246488842365380158L;
false = new UN3((boolean)this, (com.finalshell.ui.model.Kl4)Ref.g(246488842365380158L, var102));
      long var105 = 627973027287447539L;
      ConnectionInfoPanel var104 = var10048;
      Ref.s(627973027287447539L, var104, var105);
      Object var106 = 627973027287447539L;
      ((ConnectionInfoPanel)Ref.g(627973027287447539L, var106)).setOpaque(false);
      Object var108 = 627973027287447539L;
      Ref.g(627973027287447539L, var108);
      Object[] var10051 = Registry.packArgs(false);
      long var111 = 631292876089375133L;
      Object[] var110 = var10051;
      Ref.h(631292876089375133L, var110, var111);

      try {
         ;
      } catch (InvocationTargetException var183) {
         throw var183.getTargetException();
      }

      Km2 var10053;
      Object var112 = 627973027287447539L;
      // [VF-super] super(this, (Connection4)Ref.g(627973027287447539L, var112), false);
      long var115 = 150762093507542450L;
      Km2 var114 = var10053;
      Ref.s(150762093507542450L, var114, var115);
      Object var116 = 150762093507542450L;
      ((Km2)Ref.g(150762093507542450L, var116)).setAutoResizeMode(0);
      Object var118 = 150762093507542450L;
      Ref.g(150762093507542450L, var118);
      Object var120 = 246488842365380158L;
      Object[] var10057 = Registry.packArgs(Ref.g(246488842365380158L, var120));
      long var123 = 518955321372630905L;
      Object[] var122 = var10057;
      Ref.h(518955321372630905L, var122, var123);

      try {
         ;
      } catch (InvocationTargetException var182) {
         throw var182.getTargetException();
      }

      Object var124 = 150762093507542450L;
      ((Km2)Ref.g(150762093507542450L, var124)).setOpaque(false);
      Object var126 = 627973027287447539L;
      Ref.g(627973027287447539L, var126);
      Object[] var10060 = Registry.packArgs(this);
      long var129 = 134852060198148161L;
      Object[] var128 = var10060;
      Ref.h(134852060198148161L, var128, var129);

      try {
         ;
      } catch (InvocationTargetException var181) {
         throw var181.getTargetException();
      }

      Object var130 = 627973027287447539L;
      Ref.g(627973027287447539L, var130);
      Object[] var10062 = Registry.packArgs(this);
      long var133 = 444737714719139741L;
      Object[] var132 = var10062;
      Ref.h(444737714719139741L, var132, var133);

      try {
         ;
      } catch (InvocationTargetException var180) {
         throw var180.getTargetException();
      }

      JScrollPane var10063;
      Object var134 = 627973027287447539L;
      // [VF-super] super((Connection4)Ref.g(627973027287447539L, var134));
      JScrollPane var8 = var10063;
      var8.setOpaque(false);
      var8.getViewport().setOpaque(false);
      var8.getVerticalScrollBar().setOpaque(false);
      var8.getHorizontalScrollBar().setOpaque(false);
      var8.setBorder(null);
      var7.setLeftComponent(var8);
      Object var136 = 627973027287447539L;
      Ref.g(627973027287447539L, var136);
      Object var138 = 150762093507542450L;
      Object[] var10066 = Registry.packArgs(Ref.g(150762093507542450L, var138));
      var141 = 403669917970824410L;
      Object[] var140 = var10066;
      Ref.h(403669917970824410L, var140, var141);

      try {
         ;
      } catch (InvocationTargetException var179) {
         throw var179.getTargetException();
      }

      VJ var10068;
      Object var142 = 150762093507542450L;
      // [VF-super] super(this, (Km2)Ref.g(150762093507542450L, var142));
      long var145 = 329882746337374810L;
      VJ var144 = var10068;
      Ref.s(329882746337374810L, var144, var145);
      Object var146 = 329882746337374810L;
      ((JScrollPane)Ref.g(329882746337374810L, var146)).setOpaque(false);
      Object var148 = 329882746337374810L;
      ((JScrollPane)Ref.g(329882746337374810L, var148)).getViewport().setOpaque(false);
      Object var150 = 329882746337374810L;
      JScrollPane var10071 = (JScrollPane)Ref.g(329882746337374810L, var150);
      Object var152 = 150762093507542450L;
      this.setViewportView((Km2)Ref.g(150762093507542450L, var152));
      Object var154 = 329882746337374810L;
      JScrollPane var10073 = (JScrollPane)Ref.g(329882746337374810L, var154);
      Object var156 = 150762093507542450L;
      Object var10075 = Ref.g(150762093507542450L, var156);
      Yd2 var10076 = (Yd2)(Registry.emptyArgs());
      long var159 = 414101134052817736L;
      Object var158 = var10076;
      var10076 = Ref.h(414101134052817736L, var158, var159);

      try {
         var10076 = (Yd2)var10076;
      } catch (InvocationTargetException var178) {
         throw var178.getTargetException();
      }

      var10075.setTransferHandler(var10076);
      Object var160 = 329882746337374810L;
      ((JScrollPane)Ref.g(329882746337374810L, var160)).addMouseListener(new JW(this));
      Object var162 = 150762093507542450L;
      ((Km2)Ref.g(150762093507542450L, var162)).addMouseListener(new com.finalshell.ui.listener.O6(this));
      JPanel var9 = new JPanel();
      var9.setOpaque(false);
      var9.setLayout(new T3());
      LoadingPanel var10078 = new LoadingPanel();
      long var165 = 539889883653769356L;
      LoadingPanel var164 = var10078;
      Ref.s(539889883653769356L, var164, var165);
      Object var166 = 539889883653769356L;
      this.add((LoadingPanel)Ref.g(539889883653769356L, var166));
      Object var168 = 329882746337374810L;
      this.add((JScrollPane)Ref.g(329882746337374810L, var168));
      var7.setRightComponent(var9);
      var7.setDividerLocation(b(31529, 9008234764252970993L));
      var7.setResizeWeight(0.1F);
      Object[] var10081 = Registry.packArgs(false);
      long var171 = 596499686400442579L;
      Object[] var170 = var10081;
      Ref.h(596499686400442579L, var170, var171);

      try {
         ;
      } catch (InvocationTargetException var177) {
         throw var177.getTargetException();
      }

      Object[] var10082 = Registry.emptyArgs();
      long var173 = 361690490358770787L;
      Object[] var172 = var10082;
      Ref.h(361690490358770787L, var172, var173);

      try {
         ;
      } catch (InvocationTargetException var176) {
         throw var176.getTargetException();
      }

      Object var174 = 627973027287447539L;
      ((ConnectionInfoPanel)Ref.g(627973027287447539L, var174)).setRootVisible(false);
      if (Ky4.F$arrString() != null) {
         W(var1 == null);
      }
   }

   public void Y() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new YY3(this));
      long var2 = 434592463220957006L;
      Object[] var1 = var10001;
      Ref.h(434592463220957006L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void V(Tf4 var1) {
      ArrayList var2 = new ArrayList();
      var2.add(var1);
      Object[] var10001 = Registry.packArgs(var2);
      long var4 = 617034375186948190L;
      Object[] var3 = var10001;
      Ref.h(617034375186948190L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void h(ArrayList param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Address.i ()Z
      // 003: istore 2
      // 004: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 007: ldc2_w 270389152141252877
      // 00a: astore 14
      // 00c: ldc2_w 270389152141252877
      // 00f: aload 14
      // 011: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 014: goto 01b
      // 017: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01e: ldc2_w 306266403902896148
      // 021: astore 17
      // 023: astore 16
      // 025: ldc2_w 306266403902896148
      // 028: aload 16
      // 02a: aload 17
      // 02c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02f: goto 036
      // 032: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 035: athrow
      // 036: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 039: ldc2_w 518178624564683680
      // 03c: astore 19
      // 03e: astore 18
      // 040: ldc2_w 518178624564683680
      // 043: aload 18
      // 045: aload 19
      // 047: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04a: checkcast java/lang/Boolean
      // 04d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 050: goto 057
      // 053: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 056: athrow
      // 057: iload 2
      // 058: ifeq 0bf
      // 05b: ifeq 39c
      // 05e: goto 065
      // 061: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 068: ldc2_w 270389152141252877
      // 06b: astore 20
      // 06d: ldc2_w 270389152141252877
      // 070: aload 20
      // 072: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 075: goto 07c
      // 078: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07f: ldc2_w 163462326892114024
      // 082: astore 23
      // 084: astore 22
      // 086: ldc2_w 163462326892114024
      // 089: aload 22
      // 08b: aload 23
      // 08d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 090: goto 097
      // 093: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 096: athrow
      // 097: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 09a: ldc2_w 633712494917113170
      // 09d: astore 25
      // 09f: astore 24
      // 0a1: ldc2_w 633712494917113170
      // 0a4: aload 24
      // 0a6: aload 25
      // 0a8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ab: checkcast java/lang/Boolean
      // 0ae: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b1: goto 0b8
      // 0b4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: ifeq 39c
      // 0c2: aconst_null
      // 0c3: astore 3
      // 0c4: ldc_w ""
      // 0c7: astore 4
      // 0c9: aload 1
      // 0ca: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0cd: astore 5
      // 0cf: aload 5
      // 0d1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d6: ifeq 28c
      // 0d9: aload 5
      // 0db: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e0: astore 6
      // 0e2: aload 6
      // 0e4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0e7: ldc_w com/finalshell/ui/model/Tf4
      // 0ea: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0ed: iload 2
      // 0ee: ifeq 29f
      // 0f1: iload 2
      // 0f2: ifeq 1ed
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: ifeq 1d0
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 6
      // 108: checkcast com/finalshell/ui/model/Tf4
      // 10b: astore 7
      // 10d: aload 0
      // 10e: ldc2_w 627973027287447539
      // 111: astore 26
      // 113: ldc2_w 627973027287447539
      // 116: aload 26
      // 118: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 11b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 11e: ldc2_w 212042562452272939
      // 121: astore 29
      // 123: astore 28
      // 125: ldc2_w 212042562452272939
      // 128: aload 28
      // 12a: aload 29
      // 12c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 12f: checkcast com/finalshell/connection/Connection12
      // 132: goto 139
      // 135: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 138: athrow
      // 139: astore 8
      // 13b: aload 7
      // 13d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 140: ldc2_w 179612178163941306
      // 143: astore 31
      // 145: astore 30
      // 147: ldc2_w 179612178163941306
      // 14a: aload 30
      // 14c: aload 31
      // 14e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 151: checkcast java/lang/String
      // 154: goto 15b
      // 157: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: astore 9
      // 15d: aload 3
      // 15e: iload 2
      // 15f: ifeq 1ca
      // 162: ifnonnull 1a4
      // 165: goto 16c
      // 168: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 7
      // 16e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 171: ldc2_w 498856411508641826
      // 174: astore 33
      // 176: astore 32
      // 178: ldc2_w 498856411508641826
      // 17b: aload 32
      // 17d: aload 33
      // 17f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 182: goto 189
      // 185: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 188: athrow
      // 189: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 18c: ldc2_w 405430188584561323
      // 18f: astore 34
      // 191: ldc2_w 405430188584561323
      // 194: aload 34
      // 196: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 199: checkcast java/lang/String
      // 19c: goto 1a3
      // 19f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: astore 3
      // 1a4: new java/lang/StringBuilder
      // 1a7: dup
      // 1a8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ab: aload 4
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: sipush 20042
      // 1b3: sipush 765
      // 1b6: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 1b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bc: aload 9
      // 1be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c1: ldc_w "\""
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ca: astore 4
      // 1cc: iload 2
      // 1cd: ifne 288
      // 1d0: aload 6
      // 1d2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1d5: iload 2
      // 1d6: ifeq 1f2
      // 1d9: goto 1e0
      // 1dc: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: ldc_w com/finalshell/ui/model/Ck4
      // 1e3: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 1e6: goto 1ed
      // 1e9: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ec: athrow
      // 1ed: ifeq 288
      // 1f0: aload 6
      // 1f2: checkcast com/finalshell/ui/model/Ck4
      // 1f5: astore 7
      // 1f7: aload 7
      // 1f9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1fc: ldc2_w 396085629172753019
      // 1ff: astore 37
      // 201: astore 36
      // 203: ldc2_w 396085629172753019
      // 206: aload 36
      // 208: aload 37
      // 20a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20d: checkcast java/lang/String
      // 210: goto 217
      // 213: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 216: athrow
      // 217: astore 8
      // 219: aload 3
      // 21a: iload 2
      // 21b: ifeq 286
      // 21e: ifnonnull 260
      // 221: goto 228
      // 224: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 227: athrow
      // 228: aload 7
      // 22a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 22d: ldc2_w 605430732347023634
      // 230: astore 39
      // 232: astore 38
      // 234: ldc2_w 605430732347023634
      // 237: aload 38
      // 239: aload 39
      // 23b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 23e: goto 245
      // 241: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 244: athrow
      // 245: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 248: ldc2_w 405430188584561323
      // 24b: astore 40
      // 24d: ldc2_w 405430188584561323
      // 250: aload 40
      // 252: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 255: checkcast java/lang/String
      // 258: goto 25f
      // 25b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25e: athrow
      // 25f: astore 3
      // 260: new java/lang/StringBuilder
      // 263: dup
      // 264: invokespecial java/lang/StringBuilder.<init> ()V
      // 267: aload 4
      // 269: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26c: sipush 20054
      // 26f: sipush 12846
      // 272: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 275: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 278: aload 8
      // 27a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27d: ldc_w "\""
      // 280: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 283: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 286: astore 4
      // 288: iload 2
      // 289: ifne 0cf
      // 28c: aload 4
      // 28e: iload 2
      // 28f: ifeq 30f
      // 292: ldc_w ","
      // 295: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 298: goto 29f
      // 29b: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29e: athrow
      // 29f: ifeq 2b1
      // 2a2: aload 4
      // 2a4: bipush 0
      // 2a5: aload 4
      // 2a7: invokevirtual java/lang/String.length ()I
      // 2aa: bipush 1
      // 2ab: isub
      // 2ac: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2af: astore 4
      // 2b1: new java/lang/StringBuilder
      // 2b4: dup
      // 2b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b8: aload 0
      // 2b9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2bc: ldc2_w 345956374494580204
      // 2bf: astore 43
      // 2c1: astore 42
      // 2c3: ldc2_w 345956374494580204
      // 2c6: aload 42
      // 2c8: aload 43
      // 2ca: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2cd: checkcast java/lang/String
      // 2d0: goto 2d7
      // 2d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d6: athrow
      // 2d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2da: sipush 20050
      // 2dd: sipush 1267
      // 2e0: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 2e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e6: ldc2_w 158096528215803383
      // 2e9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2ec: aconst_null
      // 2ed: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2f0: checkcast java/text/SimpleDateFormat
      // 2f3: new java/util/Date
      // 2f6: dup
      // 2f7: invokespecial java/util/Date.<init> ()V
      // 2fa: invokevirtual java/text/SimpleDateFormat.format (Ljava/util/Date;)Ljava/lang/String;
      // 2fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 300: sipush 20080
      // 303: sipush -4285
      // 306: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 309: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30f: astore 5
      // 311: new java/lang/StringBuilder
      // 314: dup
      // 315: invokespecial java/lang/StringBuilder.<init> ()V
      // 318: sipush 20083
      // 31b: sipush -5913
      // 31e: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 321: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 324: aload 3
      // 325: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 328: sipush 20085
      // 32b: sipush 12509
      // 32e: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 331: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 334: aload 0
      // 335: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 338: ldc2_w 345956374494580204
      // 33b: astore 45
      // 33d: astore 44
      // 33f: ldc2_w 345956374494580204
      // 342: aload 44
      // 344: aload 45
      // 346: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 349: checkcast java/lang/String
      // 34c: goto 353
      // 34f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 352: athrow
      // 353: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 356: sipush 20082
      // 359: sipush -22304
      // 35c: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 35f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 362: aload 5
      // 364: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 367: ldc_w " "
      // 36a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36d: aload 4
      // 36f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 372: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 375: astore 6
      // 377: aload 0
      // 378: aload 6
      // 37a: aload 5
      // 37c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 37f: ldc2_w 430021700951496914
      // 382: astore 47
      // 384: astore 46
      // 386: ldc2_w 430021700951496914
      // 389: aload 46
      // 38b: aload 47
      // 38d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 390: pop
      // 391: goto 398
      // 394: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 397: athrow
      // 398: iload 2
      // 399: ifne 804
      // 39c: new java/util/ArrayList
      // 39f: dup
      // 3a0: invokespecial java/util/ArrayList.<init> ()V
      // 3a3: astore 3
      // 3a4: aconst_null
      // 3a5: astore 4
      // 3a7: aload 1
      // 3a8: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 3ab: astore 5
      // 3ad: aload 5
      // 3af: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3b4: ifeq 610
      // 3b7: aload 5
      // 3b9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3be: astore 6
      // 3c0: aload 6
      // 3c2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 3c5: ldc_w com/finalshell/ui/model/Tf4
      // 3c8: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 3cb: iload 2
      // 3cc: ifeq 61d
      // 3cf: iload 2
      // 3d0: ifeq 53b
      // 3d3: goto 3da
      // 3d6: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d9: athrow
      // 3da: ifeq 51e
      // 3dd: goto 3e4
      // 3e0: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e3: athrow
      // 3e4: aload 6
      // 3e6: checkcast com/finalshell/ui/model/Tf4
      // 3e9: astore 7
      // 3eb: aload 0
      // 3ec: ldc2_w 627973027287447539
      // 3ef: astore 48
      // 3f1: ldc2_w 627973027287447539
      // 3f4: aload 48
      // 3f6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3f9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3fc: ldc2_w 212042562452272939
      // 3ff: astore 51
      // 401: astore 50
      // 403: ldc2_w 212042562452272939
      // 406: aload 50
      // 408: aload 51
      // 40a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 40d: checkcast com/finalshell/connection/Connection12
      // 410: goto 417
      // 413: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 416: athrow
      // 417: astore 8
      // 419: aload 7
      // 41b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 41e: ldc2_w 498856411508641826
      // 421: astore 53
      // 423: astore 52
      // 425: ldc2_w 498856411508641826
      // 428: aload 52
      // 42a: aload 53
      // 42c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 42f: checkcast java/lang/String
      // 432: goto 439
      // 435: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 438: athrow
      // 439: astore 9
      // 43b: new java/util/ArrayList
      // 43e: dup
      // 43f: invokespecial java/util/ArrayList.<init> ()V
      // 442: astore 10
      // 444: new com/finalshell/ui/dialog/ProgressDialog
      // 447: dup
      // 448: aload 0
      // 449: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // 44c: invokespecial com/finalshell/ui/dialog/ProgressDialog.<init> (Ljava/awt/Window;)V
      // 44f: astore 11
      // 451: aconst_null
      // 452: astore 12
      // 454: aload 8
      // 456: aload 9
      // 458: aload 10
      // 45a: aload 11
      // 45c: bipush 1
      // 45d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 460: ldc2_w 557010342823591586
      // 463: astore 55
      // 465: astore 54
      // 467: ldc2_w 557010342823591586
      // 46a: aload 54
      // 46c: aload 55
      // 46e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 471: pop
      // 472: goto 479
      // 475: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 478: athrow
      // 479: goto 4a0
      // 47c: astore 13
      // 47e: aload 13
      // 480: invokevirtual java/lang/Exception.printStackTrace ()V
      // 483: new java/lang/StringBuilder
      // 486: dup
      // 487: invokespecial java/lang/StringBuilder.<init> ()V
      // 48a: sipush 20039
      // 48d: sipush 13580
      // 490: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 493: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 496: aload 13
      // 498: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 49b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49e: astore 12
      // 4a0: aload 12
      // 4a2: ifnull 4b6
      // 4a5: aload 0
      // 4a6: aload 12
      // 4a8: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 4ab: iload 2
      // 4ac: ifne 4c3
      // 4af: goto 4b6
      // 4b2: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b5: athrow
      // 4b6: aload 11
      // 4b8: bipush 0
      // 4b9: invokevirtual com/finalshell/ui/dialog/ProgressDialog.setVisible (Z)V
      // 4bc: goto 4c3
      // 4bf: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c2: athrow
      // 4c3: aload 3
      // 4c4: aload 10
      // 4c6: invokevirtual java/util/ArrayList.addAll (Ljava/util/Collection;)Z
      // 4c9: pop
      // 4ca: aload 4
      // 4cc: iload 2
      // 4cd: ifeq 518
      // 4d0: ifnonnull 51a
      // 4d3: goto 4da
      // 4d6: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d9: athrow
      // 4da: aload 7
      // 4dc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4df: ldc2_w 498856411508641826
      // 4e2: astore 57
      // 4e4: astore 56
      // 4e6: ldc2_w 498856411508641826
      // 4e9: aload 56
      // 4eb: aload 57
      // 4ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4f0: goto 4f7
      // 4f3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4f6: athrow
      // 4f7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4fa: ldc2_w 405430188584561323
      // 4fd: astore 58
      // 4ff: ldc2_w 405430188584561323
      // 502: aload 58
      // 504: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 507: checkcast java/lang/String
      // 50a: goto 511
      // 50d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 510: athrow
      // 511: goto 518
      // 514: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 517: athrow
      // 518: astore 4
      // 51a: iload 2
      // 51b: ifne 60c
      // 51e: aload 6
      // 520: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 523: iload 2
      // 524: ifeq 540
      // 527: goto 52e
      // 52a: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52d: athrow
      // 52e: ldc_w com/finalshell/ui/model/Ck4
      // 531: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 534: goto 53b
      // 537: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53a: athrow
      // 53b: ifeq 60c
      // 53e: aload 6
      // 540: checkcast com/finalshell/ui/model/Ck4
      // 543: astore 7
      // 545: aload 7
      // 547: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 54a: ldc2_w 605430732347023634
      // 54d: astore 61
      // 54f: astore 60
      // 551: ldc2_w 605430732347023634
      // 554: aload 60
      // 556: aload 61
      // 558: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 55b: checkcast java/lang/String
      // 55e: goto 565
      // 561: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 564: athrow
      // 565: astore 8
      // 567: aload 3
      // 568: new com/finalshell/core/GZ_2
      // 56b: dup
      // 56c: aload 8
      // 56e: aload 7
      // 570: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 573: ldc2_w 556117124296734693
      // 576: astore 63
      // 578: astore 62
      // 57a: ldc2_w 556117124296734693
      // 57d: aload 62
      // 57f: aload 63
      // 581: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 584: checkcast java/lang/Long
      // 587: invokevirtual java/lang/Long.longValue ()J
      // 58a: goto 591
      // 58d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 590: athrow
      // 591: aload 7
      // 593: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 596: ldc2_w 498445835749817375
      // 599: astore 65
      // 59b: astore 64
      // 59d: ldc2_w 498445835749817375
      // 5a0: aload 64
      // 5a2: aload 65
      // 5a4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5a7: checkcast java/lang/Integer
      // 5aa: invokevirtual java/lang/Integer.intValue ()I
      // 5ad: goto 5b4
      // 5b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5b3: athrow
      // 5b4: bipush 0
      // 5b5: invokespecial com/finalshell/core/GZ_2.<init> (Ljava/lang/String;JIZ)V
      // 5b8: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 5bb: pop
      // 5bc: aload 4
      // 5be: iload 2
      // 5bf: ifeq 60a
      // 5c2: ifnonnull 60c
      // 5c5: goto 5cc
      // 5c8: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5cb: athrow
      // 5cc: aload 7
      // 5ce: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5d1: ldc2_w 605430732347023634
      // 5d4: astore 67
      // 5d6: astore 66
      // 5d8: ldc2_w 605430732347023634
      // 5db: aload 66
      // 5dd: aload 67
      // 5df: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5e2: goto 5e9
      // 5e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5e8: athrow
      // 5e9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5ec: ldc2_w 405430188584561323
      // 5ef: astore 68
      // 5f1: ldc2_w 405430188584561323
      // 5f4: aload 68
      // 5f6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 5f9: checkcast java/lang/String
      // 5fc: goto 603
      // 5ff: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 602: athrow
      // 603: goto 60a
      // 606: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 609: athrow
      // 60a: astore 4
      // 60c: iload 2
      // 60d: ifne 3ad
      // 610: aload 3
      // 611: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 614: astore 5
      // 616: aload 5
      // 618: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 61d: ifeq 804
      // 620: aload 5
      // 622: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 627: checkcast com/finalshell/core/GZ_2
      // 62a: astore 6
      // 62c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 62f: ldc2_w 270389152141252877
      // 632: astore 70
      // 634: ldc2_w 270389152141252877
      // 637: aload 70
      // 639: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 63c: goto 643
      // 63f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 642: athrow
      // 643: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 646: ldc2_w 306266403902896148
      // 649: astore 73
      // 64b: astore 72
      // 64d: ldc2_w 306266403902896148
      // 650: aload 72
      // 652: aload 73
      // 654: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 657: goto 65e
      // 65a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 65d: athrow
      // 65e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 661: ldc2_w 248904686894997647
      // 664: astore 75
      // 666: astore 74
      // 668: ldc2_w 248904686894997647
      // 66b: aload 74
      // 66d: aload 75
      // 66f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 672: checkcast java/lang/String
      // 675: goto 67c
      // 678: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 67b: athrow
      // 67c: astore 7
      // 67e: aload 6
      // 680: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 683: ldc2_w 552192581091318882
      // 686: astore 77
      // 688: astore 76
      // 68a: ldc2_w 552192581091318882
      // 68d: aload 76
      // 68f: aload 77
      // 691: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 694: checkcast java/lang/String
      // 697: goto 69e
      // 69a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 69d: athrow
      // 69e: astore 8
      // 6a0: aload 8
      // 6a2: aload 4
      // 6a4: invokevirtual java/lang/String.length ()I
      // 6a7: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 6aa: astore 9
      // 6ac: getstatic java/io/File.separator Ljava/lang/String;
      // 6af: iload 2
      // 6b0: ifeq 6f0
      // 6b3: ldc_w "\\"
      // 6b6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6b9: ifeq 6d6
      // 6bc: goto 6c3
      // 6bf: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c2: athrow
      // 6c3: aload 9
      // 6c5: ldc_w "/"
      // 6c8: sipush 20049
      // 6cb: sipush 18768
      // 6ce: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 6d1: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 6d4: astore 9
      // 6d6: new java/lang/StringBuilder
      // 6d9: dup
      // 6da: invokespecial java/lang/StringBuilder.<init> ()V
      // 6dd: aload 7
      // 6df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e2: getstatic java/io/File.separator Ljava/lang/String;
      // 6e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e8: aload 9
      // 6ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ed: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6f0: astore 10
      // 6f2: aload 6
      // 6f4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6f7: ldc2_w 501901987609518328
      // 6fa: astore 79
      // 6fc: astore 78
      // 6fe: ldc2_w 501901987609518328
      // 701: aload 78
      // 703: aload 79
      // 705: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 708: checkcast java/lang/Boolean
      // 70b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 70e: goto 715
      // 711: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 714: athrow
      // 715: ifne 7ef
      // 718: new com/finalshell/core/YI
      // 71b: dup
      // 71c: aload 0
      // 71d: ldc2_w 382217741243932264
      // 720: astore 80
      // 722: ldc2_w 382217741243932264
      // 725: aload 80
      // 727: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 72a: checkcast com/finalshell/connection/Connection12
      // 72d: aload 0
      // 72e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 731: ldc2_w 157614116591371207
      // 734: astore 83
      // 736: astore 82
      // 738: ldc2_w 157614116591371207
      // 73b: aload 82
      // 73d: aload 83
      // 73f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 742: checkcast com/finalshell/core/Lv4_2
      // 745: goto 74c
      // 748: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 74b: athrow
      // 74c: aload 4
      // 74e: aload 7
      // 750: aload 8
      // 752: aload 10
      // 754: bipush 1
      // 755: invokespecial com/finalshell/core/YI.<init> (Lcom/finalshell/connection/Connection12;Lcom/finalshell/core/Lv4_2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 758: astore 11
      // 75a: aload 11
      // 75c: aload 6
      // 75e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 761: ldc2_w 150590411735338600
      // 764: astore 85
      // 766: astore 84
      // 768: ldc2_w 150590411735338600
      // 76b: aload 84
      // 76d: aload 85
      // 76f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 772: checkcast java/lang/Long
      // 775: invokevirtual java/lang/Long.longValue ()J
      // 778: goto 77f
      // 77b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 77e: athrow
      // 77f: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 782: ldc2_w 119264357941005086
      // 785: astore 87
      // 787: astore 86
      // 789: ldc2_w 119264357941005086
      // 78c: aload 86
      // 78e: aload 87
      // 790: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 793: pop
      // 794: goto 79b
      // 797: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 79a: athrow
      // 79b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 79e: ldc2_w 270389152141252877
      // 7a1: astore 88
      // 7a3: ldc2_w 270389152141252877
      // 7a6: aload 88
      // 7a8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 7ab: goto 7b2
      // 7ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7b1: athrow
      // 7b2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 7b5: ldc2_w 377280722715900564
      // 7b8: astore 91
      // 7ba: astore 90
      // 7bc: ldc2_w 377280722715900564
      // 7bf: aload 90
      // 7c1: aload 91
      // 7c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7c6: goto 7cd
      // 7c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7cc: athrow
      // 7cd: aload 11
      // 7cf: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 7d2: ldc2_w 118191003152152827
      // 7d5: astore 93
      // 7d7: astore 92
      // 7d9: ldc2_w 118191003152152827
      // 7dc: aload 92
      // 7de: aload 93
      // 7e0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7e3: pop
      // 7e4: goto 7eb
      // 7e7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7ea: athrow
      // 7eb: iload 2
      // 7ec: ifne 800
      // 7ef: new java/io/File
      // 7f2: dup
      // 7f3: aload 10
      // 7f5: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 7f8: astore 11
      // 7fa: aload 11
      // 7fc: invokevirtual java/io/File.mkdirs ()Z
      // 7ff: pop
      // 800: iload 2
      // 801: ifne 616
      // 804: return
   }

   public String G() {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 622340890791521181L;
      Object[] var3 = var10001;
      Ref.h(622340890791521181L, var3, var4);
      String var10002 = (String)(Registry.emptyArgs());
      long var6 = 207264048673842448L;
      Object var5 = var10002;
      var10002 = Ref.h(207264048673842448L, var5, var6);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      String var1 = var10002;
      return var1 + a(20034, -14746);
   }

   public void H() {
      Object var9 = 150762093507542450L;
      int[] var2 = ((Km2)Ref.g(150762093507542450L, var9)).getSelectedRows();
      ArrayList var3 = new ArrayList();
      boolean var10001 = g();
      int[] var4 = var2;
      boolean var1 = var10001;
      int var5 = var2.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            int var7 = var4[var6];
            Object var11 = 150762093507542450L;
            Ref.g(150762093507542450L, var11);
            Object[] var10003 = Registry.packArgs(var7);
            long var14 = 303488344973038628L;
            Object[] var13 = var10003;
            var10003 = Ref.h(303488344973038628L, var13, var14);

            try {
               var10003 = (Object[])((Object)var10003);
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            Object var8 = var10003;
            var3.add(var8);
            var6++;
            if (var1) {
               break;
            }

            if (!var1) {
               continue;
            }
         }

         Object[] var10002 = Registry.packArgs(var3);
         long var16 = 617034375186948190L;
         Object[] var15 = var10002;
         Ref.h(617034375186948190L, var15, var16);

         try {
            break;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }
      }
   }

   public void Q(String var1, String var2) {
      new DownloadProgressDialog(SwingUtilities.getWindowAncestor(this), this, var1, var2);
   }

   public void x(Component param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // 004: checkcast javax/swing/JFrame
      // 007: astore 3
      // 008: aload 0
      // 009: ldc2_w 627973027287447539
      // 00c: astore 20
      // 00e: ldc2_w 627973027287447539
      // 011: aload 20
      // 013: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 016: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 019: ldc2_w 212042562452272939
      // 01c: astore 23
      // 01e: astore 22
      // 020: ldc2_w 212042562452272939
      // 023: aload 22
      // 025: aload 23
      // 027: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02a: checkcast com/finalshell/connection/Connection12
      // 02d: goto 034
      // 030: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 033: athrow
      // 034: astore 4
      // 036: invokestatic com/finalshell/ui/panel/Address.g ()Z
      // 039: aconst_null
      // 03a: astore 5
      // 03c: istore 2
      // 03d: aload 0
      // 03e: ldc2_w 246488842365380158
      // 041: astore 24
      // 043: ldc2_w 246488842365380158
      // 046: aload 24
      // 048: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04e: ldc2_w 152919711700242153
      // 051: astore 27
      // 053: astore 26
      // 055: ldc2_w 152919711700242153
      // 058: aload 26
      // 05a: aload 27
      // 05c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05f: checkcast com/finalshell/ui/model/Tf4
      // 062: goto 069
      // 065: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 068: athrow
      // 069: astore 6
      // 06b: aload 6
      // 06d: iload 2
      // 06e: ifne 07e
      // 071: ifnonnull 07c
      // 074: goto 07b
      // 077: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: return
      // 07c: aload 6
      // 07e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 081: ldc2_w 498856411508641826
      // 084: astore 29
      // 086: astore 28
      // 088: ldc2_w 498856411508641826
      // 08b: aload 28
      // 08d: aload 29
      // 08f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 092: checkcast java/lang/String
      // 095: goto 09c
      // 098: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: astore 7
      // 09e: new com/finalshell/ui/dialog/Xw2
      // 0a1: dup
      // 0a2: aload 3
      // 0a3: sipush 20033
      // 0a6: sipush -2936
      // 0a9: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 0ac: invokespecial com/finalshell/ui/dialog/Xw2.<init> (Ljava/awt/Window;Ljava/lang/String;)V
      // 0af: astore 8
      // 0b1: aload 8
      // 0b3: aload 3
      // 0b4: invokevirtual com/finalshell/ui/dialog/Xw2.setLocationRelativeTo (Ljava/awt/Component;)V
      // 0b7: aload 8
      // 0b9: bipush 1
      // 0ba: invokevirtual com/finalshell/ui/dialog/Xw2.setVisible (Z)V
      // 0bd: aload 8
      // 0bf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c2: ldc2_w 525435051304774885
      // 0c5: astore 31
      // 0c7: astore 30
      // 0c9: ldc2_w 525435051304774885
      // 0cc: aload 30
      // 0ce: aload 31
      // 0d0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d3: checkcast java/lang/Integer
      // 0d6: invokevirtual java/lang/Integer.intValue ()I
      // 0d9: goto 0e0
      // 0dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: istore 9
      // 0e2: iload 9
      // 0e4: ldc2_w 564170828581134815
      // 0e7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ea: aconst_null
      // 0eb: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0ee: if_icmpne 496
      // 0f1: aload 8
      // 0f3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f6: ldc2_w 441345736697351432
      // 0f9: astore 33
      // 0fb: astore 32
      // 0fd: ldc2_w 441345736697351432
      // 100: aload 32
      // 102: aload 33
      // 104: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 107: checkcast java/lang/String
      // 10a: goto 111
      // 10d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 110: athrow
      // 111: astore 10
      // 113: aload 0
      // 114: ldc2_w 627973027287447539
      // 117: astore 34
      // 119: ldc2_w 627973027287447539
      // 11c: aload 34
      // 11e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 121: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 124: ldc2_w 208260183617353218
      // 127: astore 37
      // 129: astore 36
      // 12b: ldc2_w 208260183617353218
      // 12e: aload 36
      // 130: aload 37
      // 132: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 135: goto 13c
      // 138: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 13f: ldc2_w 498856411508641826
      // 142: astore 39
      // 144: astore 38
      // 146: ldc2_w 498856411508641826
      // 149: aload 38
      // 14b: aload 39
      // 14d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 150: checkcast java/lang/String
      // 153: goto 15a
      // 156: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 159: athrow
      // 15a: astore 11
      // 15c: aload 8
      // 15e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 161: ldc2_w 269744480676509918
      // 164: astore 41
      // 166: astore 40
      // 168: ldc2_w 269744480676509918
      // 16b: aload 40
      // 16d: aload 41
      // 16f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 172: checkcast java/util/ArrayList
      // 175: goto 17c
      // 178: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: astore 12
      // 17e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 181: ldc2_w 270389152141252877
      // 184: astore 42
      // 186: ldc2_w 270389152141252877
      // 189: aload 42
      // 18b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 18e: goto 195
      // 191: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 194: athrow
      // 195: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 198: ldc2_w 306266403902896148
      // 19b: astore 45
      // 19d: astore 44
      // 19f: ldc2_w 306266403902896148
      // 1a2: aload 44
      // 1a4: aload 45
      // 1a6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a9: goto 1b0
      // 1ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b3: ldc2_w 518178624564683680
      // 1b6: astore 47
      // 1b8: astore 46
      // 1ba: ldc2_w 518178624564683680
      // 1bd: aload 46
      // 1bf: aload 47
      // 1c1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c4: checkcast java/lang/Boolean
      // 1c7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1ca: goto 1d1
      // 1cd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: iload 2
      // 1d2: ifne 40d
      // 1d5: ifeq 3f6
      // 1d8: goto 1df
      // 1db: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1e2: ldc2_w 270389152141252877
      // 1e5: astore 48
      // 1e7: ldc2_w 270389152141252877
      // 1ea: aload 48
      // 1ec: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ef: goto 1f6
      // 1f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f5: athrow
      // 1f6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1f9: ldc2_w 163462326892114024
      // 1fc: astore 51
      // 1fe: astore 50
      // 200: ldc2_w 163462326892114024
      // 203: aload 50
      // 205: aload 51
      // 207: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20a: goto 211
      // 20d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 210: athrow
      // 211: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 214: ldc2_w 633712494917113170
      // 217: astore 53
      // 219: astore 52
      // 21b: ldc2_w 633712494917113170
      // 21e: aload 52
      // 220: aload 53
      // 222: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 225: checkcast java/lang/Boolean
      // 228: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 22b: goto 232
      // 22e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 231: athrow
      // 232: iload 2
      // 233: ifne 40d
      // 236: goto 23d
      // 239: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23c: athrow
      // 23d: ifeq 3f6
      // 240: goto 247
      // 243: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 246: athrow
      // 247: aload 12
      // 249: iload 2
      // 24a: ifne 26f
      // 24d: goto 254
      // 250: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 253: athrow
      // 254: invokevirtual java/util/ArrayList.size ()I
      // 257: ifle 496
      // 25a: goto 261
      // 25d: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 260: athrow
      // 261: new java/util/ArrayList
      // 264: dup
      // 265: invokespecial java/util/ArrayList.<init> ()V
      // 268: goto 26f
      // 26b: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26e: athrow
      // 26f: astore 13
      // 271: aload 12
      // 273: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 276: astore 14
      // 278: aload 14
      // 27a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 27f: ifeq 384
      // 282: aload 14
      // 284: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 289: astore 15
      // 28b: aload 10
      // 28d: astore 16
      // 28f: aload 15
      // 291: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 294: ldc2_w 492128056065034754
      // 297: astore 54
      // 299: ldc2_w 492128056065034754
      // 29c: aload 54
      // 29e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a1: checkcast java/io/File
      // 2a4: goto 2ab
      // 2a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2aa: athrow
      // 2ab: astore 17
      // 2ad: aload 17
      // 2af: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2b2: astore 18
      // 2b4: aload 18
      // 2b6: iload 2
      // 2b7: ifne 3a0
      // 2ba: aload 10
      // 2bc: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2bf: iload 2
      // 2c0: ifne 2e6
      // 2c3: goto 2ca
      // 2c6: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: ifne 2db
      // 2cd: goto 2d4
      // 2d0: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d3: athrow
      // 2d4: aload 17
      // 2d6: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 2d9: astore 16
      // 2db: aload 15
      // 2dd: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2e0: ldc_w com/finalshell/ui/model/Tf4
      // 2e3: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2e6: iload 2
      // 2e7: ifne 349
      // 2ea: ifeq 32c
      // 2ed: goto 2f4
      // 2f0: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: aload 15
      // 2f6: checkcast com/finalshell/ui/model/Tf4
      // 2f9: astore 19
      // 2fb: aload 13
      // 2fd: new java/io/File
      // 300: dup
      // 301: aload 19
      // 303: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 306: ldc2_w 498856411508641826
      // 309: astore 57
      // 30b: astore 56
      // 30d: ldc2_w 498856411508641826
      // 310: aload 56
      // 312: aload 57
      // 314: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 317: checkcast java/lang/String
      // 31a: goto 321
      // 31d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 320: athrow
      // 321: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 324: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 327: pop
      // 328: iload 2
      // 329: ifeq 380
      // 32c: aload 15
      // 32e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 331: iload 2
      // 332: ifne 34e
      // 335: goto 33c
      // 338: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33b: athrow
      // 33c: ldc_w com/finalshell/ui/model/Ck4
      // 33f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 342: goto 349
      // 345: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 348: athrow
      // 349: ifeq 380
      // 34c: aload 15
      // 34e: checkcast com/finalshell/ui/model/Ck4
      // 351: astore 19
      // 353: aload 13
      // 355: new java/io/File
      // 358: dup
      // 359: aload 19
      // 35b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 35e: ldc2_w 605430732347023634
      // 361: astore 59
      // 363: astore 58
      // 365: ldc2_w 605430732347023634
      // 368: aload 58
      // 36a: aload 59
      // 36c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 36f: checkcast java/lang/String
      // 372: goto 379
      // 375: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 378: athrow
      // 379: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 37c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 37f: pop
      // 380: iload 2
      // 381: ifeq 278
      // 384: aload 10
      // 386: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 389: ldc2_w 571034619098221891
      // 38c: astore 60
      // 38e: ldc2_w 571034619098221891
      // 391: aload 60
      // 393: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 396: checkcast java/lang/String
      // 399: goto 3a0
      // 39c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 39f: athrow
      // 3a0: astore 14
      // 3a2: new com/finalshell/ui/dialog/Nq2
      // 3a5: dup
      // 3a6: aload 0
      // 3a7: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // 3aa: aload 0
      // 3ab: invokespecial com/finalshell/ui/dialog/Nq2.<init> (Ljava/awt/Window;Lcom/finalshell/ui/panel/Address;)V
      // 3ae: astore 15
      // 3b0: ldc2_w 388376917454860932
      // 3b3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3b6: aconst_null
      // 3b7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3ba: new com/finalshell/task/Q1
      // 3bd: dup
      // 3be: aload 0
      // 3bf: aload 15
      // 3c1: aload 13
      // 3c3: aload 10
      // 3c5: aload 11
      // 3c7: aload 14
      // 3c9: invokespecial com/finalshell/task/Q1.<init> (Lcom/finalshell/ui/panel/Address;Lcom/finalshell/ui/dialog/Nq2;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 3cc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3cf: ldc2_w 434592463220957006
      // 3d2: astore 63
      // 3d4: astore 62
      // 3d6: ldc2_w 434592463220957006
      // 3d9: aload 62
      // 3db: aload 63
      // 3dd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3e0: pop
      // 3e1: goto 3e8
      // 3e4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3e7: athrow
      // 3e8: goto 3f2
      // 3eb: astore 15
      // 3ed: aload 15
      // 3ef: invokevirtual java/lang/Exception.printStackTrace ()V
      // 3f2: iload 2
      // 3f3: ifeq 496
      // 3f6: aload 12
      // 3f8: iload 2
      // 3f9: ifne 412
      // 3fc: goto 403
      // 3ff: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 402: athrow
      // 403: invokevirtual java/util/ArrayList.size ()I
      // 406: goto 40d
      // 409: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40c: athrow
      // 40d: ifle 496
      // 410: aload 12
      // 412: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 415: astore 13
      // 417: aload 13
      // 419: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 41e: ifeq 496
      // 421: aload 13
      // 423: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 428: astore 14
      // 42a: aload 10
      // 42c: astore 15
      // 42e: aload 14
      // 430: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 433: ldc2_w 492128056065034754
      // 436: astore 64
      // 438: ldc2_w 492128056065034754
      // 43b: aload 64
      // 43d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 440: checkcast java/io/File
      // 443: goto 44a
      // 446: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 449: athrow
      // 44a: astore 16
      // 44c: aload 16
      // 44e: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 451: astore 17
      // 453: iload 2
      // 454: ifne 492
      // 457: aload 17
      // 459: aload 10
      // 45b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 45e: ifne 46f
      // 461: goto 468
      // 464: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 467: athrow
      // 468: aload 16
      // 46a: invokevirtual java/io/File.getParent ()Ljava/lang/String;
      // 46d: astore 15
      // 46f: aload 0
      // 470: aload 15
      // 472: aload 11
      // 474: aload 14
      // 476: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 479: ldc2_w 514067219396436785
      // 47c: astore 67
      // 47e: astore 66
      // 480: ldc2_w 514067219396436785
      // 483: aload 66
      // 485: aload 67
      // 487: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 48a: pop
      // 48b: goto 492
      // 48e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 491: athrow
      // 492: iload 2
      // 493: ifeq 417
      // 496: return
   }

   public static String C(String var0) {
      String var1 = System.getProperty(a(20035, 24802));
      return new java.io.File(var1)
         + java.io.File.separator
         + a(20055, 1118)
         + ((SimpleDateFormat)Registry.lookupField(158096528215803383L).get(null)).format(new Date())
         + a(20048, -5743);
   }

   public void w(String var1, String var2, Object var3) {
      ArrayList var5;
      ArrayList var6;
      label91: {
         Object var27;
         label92: {
            boolean var10000 = g();
            var5 = new ArrayList();
            boolean var4 = var10000;
            var6 = new ArrayList();
            boolean var26 = var3.getClass().equals(Tf4.class);
            if (!var4) {
               if (var26) {
                  Tf4 var7 = (Tf4)var3;
                  java.io.File var10001;
                  String var10004 = (String)(Registry.emptyArgs());
                  long var12 = 498856411508641826L;
                  Object var11 = var10004;
                  var10004 = Ref.h(498856411508641826L, var11, var12);

                  try {
                     var10004 = (String)var10004;
                  } catch (InvocationTargetException var24) {
                     throw var24.getTargetException();
                  }

var7 = new ArrayList(var10004);
                  var10001.add(var10001);
                  Object[] var10002 = Registry.emptyArgs();
                  long var14 = 498856411508641826L;
                  Object[] var13 = var10002;
                  Registry.packArgs(Ref.h(498856411508641826L, var13, var14));
                  long var15 = 519932412477559507L;
                  Object var10003 = Ref.h2(519932412477559507L, var15);

                  try {
                     var10003 = (ArrayList)var10003;
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }

                  for (java.io.File var10 : var10003) {
                     if (var4) {
                        return;
                     }

                     boolean var31 = var10.isDirectory();
                     label77:
                     if (!var4) {
                        if (var31) {
                           var5.add(var10);
                           if (!var4) {
                              break label77;
                           }
                        }

                        var6.add(var10);
                     }

                     if (var4) {
                        break;
                     }
                  }

                  if (!var4) {
                     break label91;
                  }
               }

               var27 = var3.getClass();
               if (var4) {
                  break label92;
               }

               var26 = var27.equals(Ck4.class);
            }

            if (!var26) {
               break label91;
            }

            var27 = var3;
         }

         Ck4 var25 = (Ck4)var27;
         java.io.File var28;
         String var34 = (String)(Registry.emptyArgs());
         long var18 = 605430732347023634L;
         Object var17 = var34;
         var34 = Ref.h(605430732347023634L, var17, var18);

         try {
            var34 = (String)var34;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

var25 = new ArrayList(var34);
         var28.add(var28);
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var29 = Registry.packArgs(new FileJob2(this, var5, var1, var2, var6));
      long var20 = 434592463220957006L;
      Object[] var19 = var29;
      Ref.h(434592463220957006L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }
   }

   public YI F(java.io.File var1, String var2, String var3, boolean var4) {
      boolean var10000 = g();
      java.io.File var6 = new java.io.File(var1.getPath());
      boolean var5 = var10000;
      String var7 = var1.getPath();
      String var8 = var7.substring(var2.length());
      String var35 = var8;
      if (!var5) {
         if (var8.contains("\\")) {
            var8 = var8.replaceAll(a(20063, -3872), "/");
         }

         var35 = var3 + "/" + var8;
      }

      String var9 = var35;
      Registry.packArgs(var9);
      long var12 = 251632219801388412L;
      Object var10001 = Ref.h2(251632219801388412L, var12);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      var9 = (String)var10001;
      YI var10004 = Registry.emptyArgs();
      long var15 = 584980468782481561L;
      Object var14 = var10004;
      var10004 = Ref.h(584980468782481561L, var14, var15);

      try {
         var10004 = (FileTransferConnection)var10004;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Lv4_2 var10006 = (Lv4_2)(Registry.emptyArgs());
      long var17 = 157614116591371207L;
      Object var16 = var10006;
      var10006 = Ref.h(157614116591371207L, var16, var17);

      try {
         var10006 = (Lv4_2)var10006;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

var10004 = new FileBrowserAddressBar(this, var10006, var2, var3, var7, var9, false);
      Object[] var39 = Registry.e(var6.length());
      long var19 = 119264357941005086L;
      Object[] var18 = var39;
      Ref.h(119264357941005086L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      Registry.emptyArgs();
      long var20 = 270389152141252877L;
      Ref.h2(270389152141252877L, var20);
      var10006 = Registry.emptyArgs();
      long var23 = 377280722715900564L;
      Object var22 = var10006;
      Ref.h(377280722715900564L, var22, var23);
      Object[] var10007 = Registry.packArgs(this);
      long var25 = 118191003152152827L;
      Object[] var24 = var10007;
      Ref.h(118191003152152827L, var24, var25);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      if (var4) {
         Object[] var10008 = Registry.packArgs(new CR(this, this, var9));
         long var27 = 541437196102236947L;
         Object[] var26 = var10008;
         Ref.h(541437196102236947L, var26, var27);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      }

      return (YI)(this);
   }

   public YI z(java.io.File var1, String var2, String var3) {
      Object var10001 = Registry.packArgs(var1, var2, var3, true);
      long var5 = 137343102481786733L;
      Object var4 = var10001;
      var10001 = Ref.h(137343102481786733L, var4, var5);

      try {
         return (YI)var10001;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void c(YI var1, String var2) {
      Object var3 = 627973027287447539L;
      Ref.g(627973027287447539L, var3);
      Object[] var10002 = Registry.packArgs(var1, var2);
      long var6 = 290925931370904802L;
      Object[] var5 = var10002;
      Ref.h(290925931370904802L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void j(String param1, String param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/lang/StringBuilder
      // 003: dup
      // 004: invokespecial java/lang/StringBuilder.<init> ()V
      // 007: aload 1
      // 008: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 00b: ldc_w "/"
      // 00e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 011: aload 2
      // 012: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 015: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 018: astore 4
      // 01a: aload 0
      // 01b: ldc2_w 627973027287447539
      // 01e: astore 15
      // 020: ldc2_w 627973027287447539
      // 023: aload 15
      // 025: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 028: aload 1
      // 029: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 02c: ldc2_w 224847783244984261
      // 02f: astore 18
      // 031: astore 17
      // 033: ldc2_w 224847783244984261
      // 036: aload 17
      // 038: aload 18
      // 03a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 040: goto 047
      // 043: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 046: athrow
      // 047: astore 5
      // 049: invokestatic com/finalshell/ui/panel/Address.g ()Z
      // 04c: aload 5
      // 04e: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 051: checkcast com/finalshell/ui/model/Tf4
      // 054: astore 6
      // 056: istore 3
      // 057: bipush 0
      // 058: istore 7
      // 05a: aload 6
      // 05c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05f: ldc2_w 248698316749304686
      // 062: astore 20
      // 064: astore 19
      // 066: ldc2_w 248698316749304686
      // 069: aload 19
      // 06b: aload 20
      // 06d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 070: checkcast java/util/List
      // 073: goto 07a
      // 076: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 079: athrow
      // 07a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 07f: astore 8
      // 081: aload 8
      // 083: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 088: ifeq 0e6
      // 08b: aload 8
      // 08d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 092: checkcast com/finalshell/ui/model/Ck4
      // 095: astore 9
      // 097: aload 2
      // 098: aload 9
      // 09a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 09d: ldc2_w 396085629172753019
      // 0a0: astore 22
      // 0a2: astore 21
      // 0a4: ldc2_w 396085629172753019
      // 0a7: aload 21
      // 0a9: aload 22
      // 0ab: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ae: checkcast java/lang/String
      // 0b1: goto 0b8
      // 0b4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bb: iload 3
      // 0bc: ifne 114
      // 0bf: iload 3
      // 0c0: ifne 0d5
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: ifeq 0db
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: bipush 1
      // 0d5: istore 7
      // 0d7: iload 3
      // 0d8: ifeq 0e6
      // 0db: iload 3
      // 0dc: ifeq 081
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: aload 6
      // 0e8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0eb: ldc2_w 369380169373911815
      // 0ee: astore 24
      // 0f0: astore 23
      // 0f2: ldc2_w 369380169373911815
      // 0f5: aload 23
      // 0f7: aload 24
      // 0f9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0fc: checkcast java/util/List
      // 0ff: goto 106
      // 102: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 105: athrow
      // 106: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 10b: astore 8
      // 10d: aload 8
      // 10f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 114: ifeq 167
      // 117: aload 8
      // 119: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 11e: checkcast com/finalshell/ui/model/Tf4
      // 121: astore 9
      // 123: aload 2
      // 124: aload 9
      // 126: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 129: ldc2_w 179612178163941306
      // 12c: astore 26
      // 12e: astore 25
      // 130: ldc2_w 179612178163941306
      // 133: aload 25
      // 135: aload 26
      // 137: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 13a: checkcast java/lang/String
      // 13d: goto 144
      // 140: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 143: athrow
      // 144: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 147: iload 3
      // 148: ifne 156
      // 14b: ifeq 15c
      // 14e: goto 155
      // 151: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: bipush 1
      // 156: istore 7
      // 158: iload 3
      // 159: ifeq 167
      // 15c: iload 3
      // 15d: ifeq 10d
      // 160: goto 167
      // 163: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: aload 0
      // 168: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // 16b: checkcast javax/swing/JFrame
      // 16e: astore 8
      // 170: iload 3
      // 171: ifne 195
      // 174: iload 7
      // 176: ifeq 196
      // 179: goto 180
      // 17c: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: aload 8
      // 182: sipush 20095
      // 185: sipush 16460
      // 188: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 18b: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 18e: goto 195
      // 191: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: return
      // 196: new java/io/File
      // 199: dup
      // 19a: aload 2
      // 19b: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 19e: astore 9
      // 1a0: aload 9
      // 1a2: invokevirtual java/io/File.exists ()Z
      // 1a5: iload 3
      // 1a6: ifne 1c5
      // 1a9: ifeq 1c0
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: aload 9
      // 1b5: invokevirtual java/io/File.delete ()Z
      // 1b8: pop
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: aload 9
      // 1c2: invokevirtual java/io/File.createNewFile ()Z
      // 1c5: pop
      // 1c6: goto 1d0
      // 1c9: astore 10
      // 1cb: aload 10
      // 1cd: invokevirtual java/io/IOException.printStackTrace ()V
      // 1d0: new java/io/File
      // 1d3: dup
      // 1d4: aload 9
      // 1d6: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 1d9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1dc: astore 10
      // 1de: aload 9
      // 1e0: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 1e3: astore 11
      // 1e5: aload 4
      // 1e7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ea: ldc2_w 251632219801388412
      // 1ed: astore 27
      // 1ef: ldc2_w 251632219801388412
      // 1f2: aload 27
      // 1f4: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1f7: checkcast java/lang/String
      // 1fa: goto 201
      // 1fd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 200: athrow
      // 201: astore 4
      // 203: aload 0
      // 204: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 207: ldc2_w 622340890791521181
      // 20a: astore 30
      // 20c: astore 29
      // 20e: ldc2_w 622340890791521181
      // 211: aload 29
      // 213: aload 30
      // 215: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 218: goto 21f
      // 21b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: aload 4
      // 221: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 224: ldc2_w 316038013738282132
      // 227: astore 32
      // 229: astore 31
      // 22b: ldc2_w 316038013738282132
      // 22e: aload 31
      // 230: aload 32
      // 232: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 235: checkcast com/finalshell/ui/model/Ck4
      // 238: goto 23f
      // 23b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23e: athrow
      // 23f: astore 12
      // 241: aload 9
      // 243: invokevirtual java/io/File.delete ()Z
      // 246: pop
      // 247: aload 12
      // 249: astore 13
      // 24b: aload 6
      // 24d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 250: ldc2_w 248698316749304686
      // 253: astore 34
      // 255: astore 33
      // 257: ldc2_w 248698316749304686
      // 25a: aload 33
      // 25c: aload 34
      // 25e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 261: checkcast java/util/List
      // 264: goto 26b
      // 267: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 26a: athrow
      // 26b: aload 13
      // 26d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 272: pop
      // 273: aload 6
      // 275: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 278: ldc2_w 360422804605248482
      // 27b: astore 36
      // 27d: astore 35
      // 27f: ldc2_w 360422804605248482
      // 282: aload 35
      // 284: aload 36
      // 286: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 289: pop
      // 28a: goto 291
      // 28d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 290: athrow
      // 291: aload 4
      // 293: astore 14
      // 295: aload 6
      // 297: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 29a: ldc2_w 498856411508641826
      // 29d: astore 38
      // 29f: astore 37
      // 2a1: ldc2_w 498856411508641826
      // 2a4: aload 37
      // 2a6: aload 38
      // 2a8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2ab: checkcast java/lang/String
      // 2ae: goto 2b5
      // 2b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b4: athrow
      // 2b5: aload 0
      // 2b6: ldc2_w 150762093507542450
      // 2b9: astore 39
      // 2bb: ldc2_w 150762093507542450
      // 2be: aload 39
      // 2c0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2c3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2c6: ldc2_w 565315838989287146
      // 2c9: astore 42
      // 2cb: astore 41
      // 2cd: ldc2_w 565315838989287146
      // 2d0: aload 41
      // 2d2: aload 42
      // 2d4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d7: goto 2de
      // 2da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dd: athrow
      // 2de: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2e1: ldc2_w 152919711700242153
      // 2e4: astore 44
      // 2e6: astore 43
      // 2e8: ldc2_w 152919711700242153
      // 2eb: aload 43
      // 2ed: aload 44
      // 2ef: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2f2: goto 2f9
      // 2f5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f8: athrow
      // 2f9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2fc: ldc2_w 498856411508641826
      // 2ff: astore 46
      // 301: astore 45
      // 303: ldc2_w 498856411508641826
      // 306: aload 45
      // 308: aload 46
      // 30a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 30d: checkcast java/lang/String
      // 310: goto 317
      // 313: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 316: athrow
      // 317: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 31a: ifeq 333
      // 31d: new com/finalshell/task/De4
      // 320: dup
      // 321: aload 0
      // 322: aload 6
      // 324: aload 14
      // 326: invokespecial com/finalshell/task/De4.<init> (Lcom/finalshell/ui/panel/Address;Lcom/finalshell/ui/model/Tf4;Ljava/lang/String;)V
      // 329: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 32c: goto 333
      // 32f: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 332: athrow
      // 333: return
   }

   public void t$void() {
   }

   public void I(Component param1, String param2, String param3, boolean param4, boolean param5) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Address.i ()Z
      // 003: aload 0
      // 004: invokevirtual java/lang/Object.hashCode ()I
      // 007: istore 7
      // 009: istore 6
      // 00b: aload 0
      // 00c: ldc2_w 627973027287447539
      // 00f: astore 16
      // 011: ldc2_w 627973027287447539
      // 014: aload 16
      // 016: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 019: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01c: ldc2_w 212042562452272939
      // 01f: astore 19
      // 021: astore 18
      // 023: ldc2_w 212042562452272939
      // 026: aload 18
      // 028: aload 19
      // 02a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02d: checkcast com/finalshell/connection/Connection12
      // 030: goto 037
      // 033: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 036: athrow
      // 037: astore 8
      // 039: aconst_null
      // 03a: astore 9
      // 03c: aload 2
      // 03d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 040: ldc2_w 159824902428932603
      // 043: astore 20
      // 045: ldc2_w 159824902428932603
      // 048: aload 20
      // 04a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 04d: checkcast java/lang/String
      // 050: goto 057
      // 053: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 056: athrow
      // 057: astore 10
      // 059: new java/lang/StringBuilder
      // 05c: dup
      // 05d: invokespecial java/lang/StringBuilder.<init> ()V
      // 060: aload 2
      // 061: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 064: aload 10
      // 066: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 069: aload 3
      // 06a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 070: astore 11
      // 072: aload 11
      // 074: iload 6
      // 076: ifeq 09c
      // 079: sipush 20084
      // 07c: sipush -11946
      // 07f: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 082: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 085: ifeq 09e
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: aload 11
      // 091: bipush 1
      // 092: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 095: goto 09c
      // 098: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: astore 11
      // 09e: aconst_null
      // 09f: astore 12
      // 0a1: aload 8
      // 0a3: aload 11
      // 0a5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a8: ldc2_w 334828870425417749
      // 0ab: astore 23
      // 0ad: astore 22
      // 0af: ldc2_w 334828870425417749
      // 0b2: aload 22
      // 0b4: aload 23
      // 0b6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b9: checkcast com/finalshell/ui/model/Tf4
      // 0bc: goto 0c3
      // 0bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: astore 12
      // 0c5: iload 6
      // 0c7: ifeq 1c0
      // 0ca: aload 12
      // 0cc: ifnull 18d
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: ldc2_w 627973027287447539
      // 0da: astore 24
      // 0dc: ldc2_w 627973027287447539
      // 0df: aload 24
      // 0e1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e4: aload 2
      // 0e5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0e8: ldc2_w 224847783244984261
      // 0eb: astore 27
      // 0ed: astore 26
      // 0ef: ldc2_w 224847783244984261
      // 0f2: aload 26
      // 0f4: aload 27
      // 0f6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f9: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0fc: goto 103
      // 0ff: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 102: athrow
      // 103: astore 13
      // 105: aload 13
      // 107: iload 6
      // 109: ifeq 122
      // 10c: ifnull 188
      // 10f: goto 116
      // 112: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: aload 13
      // 118: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: astore 14
      // 124: aload 14
      // 126: iload 6
      // 128: ifeq 137
      // 12b: ifnull 188
      // 12e: goto 135
      // 131: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: aload 14
      // 137: checkcast com/finalshell/ui/model/Tf4
      // 13a: astore 15
      // 13c: aload 0
      // 13d: ldc2_w 627973027287447539
      // 140: astore 28
      // 142: ldc2_w 627973027287447539
      // 145: aload 28
      // 147: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14a: aload 12
      // 14c: aload 15
      // 14e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 151: ldc2_w 498856411508641826
      // 154: astore 31
      // 156: astore 30
      // 158: ldc2_w 498856411508641826
      // 15b: aload 30
      // 15d: aload 31
      // 15f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 162: goto 169
      // 165: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 168: athrow
      // 169: aload 3
      // 16a: iload 4
      // 16c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 16f: ldc2_w 503602277218897796
      // 172: astore 33
      // 174: astore 32
      // 176: ldc2_w 503602277218897796
      // 179: aload 32
      // 17b: aload 33
      // 17d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 180: pop
      // 181: goto 188
      // 184: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 187: athrow
      // 188: iload 6
      // 18a: ifne 21b
      // 18d: aload 0
      // 18e: ldc2_w 150762093507542450
      // 191: astore 34
      // 193: ldc2_w 150762093507542450
      // 196: aload 34
      // 198: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 19b: aload 11
      // 19d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a0: ldc2_w 343697430899942544
      // 1a3: astore 37
      // 1a5: astore 36
      // 1a7: ldc2_w 343697430899942544
      // 1aa: aload 36
      // 1ac: aload 37
      // 1ae: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b1: pop
      // 1b2: goto 1b9
      // 1b5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b8: athrow
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: aload 0
      // 1c1: ldc2_w 150762093507542450
      // 1c4: astore 38
      // 1c6: ldc2_w 150762093507542450
      // 1c9: aload 38
      // 1cb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1ce: checkcast com/finalshell/core/Km2
      // 1d1: invokevirtual com/finalshell/core/Km2.getSelectedRow ()I
      // 1d4: istore 13
      // 1d6: iload 13
      // 1d8: iload 6
      // 1da: ifeq 21d
      // 1dd: bipush -1
      // 1de: if_icmple 21b
      // 1e1: goto 1e8
      // 1e4: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: aload 0
      // 1e9: ldc2_w 150762093507542450
      // 1ec: astore 40
      // 1ee: ldc2_w 150762093507542450
      // 1f1: aload 40
      // 1f3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f6: iload 13
      // 1f8: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 1fb: ldc2_w 442091497690345581
      // 1fe: astore 43
      // 200: astore 42
      // 202: ldc2_w 442091497690345581
      // 205: aload 42
      // 207: aload 43
      // 209: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20c: pop
      // 20d: goto 214
      // 210: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 213: athrow
      // 214: goto 21b
      // 217: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21a: athrow
      // 21b: iload 5
      // 21d: ifeq 239
      // 220: aload 9
      // 222: ifnull 239
      // 225: goto 22c
      // 228: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: aload 1
      // 22d: aload 9
      // 22f: invokestatic javax/swing/JOptionPane.showMessageDialog (Ljava/awt/Component;Ljava/lang/Object;)V
      // 232: goto 239
      // 235: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: return
   }

   public void r(Component var1) {
      g();
      Object var12 = 150762093507542450L;
      int[] var3 = ((Km2)Ref.g(150762093507542450L, var12)).getSelectedRows();
      FileBrowserAddressBar var2 = this;
      int var4 = JOptionPane.showConfirmDialog(var1, a(20057, 30116), a(20058, 10267), 0);
      if (this == null) {
         if (var4 != 0) {
            return;
         }

         boolean var10001 = false;
      }

      ArrayList var6 = new ArrayList();
      int[] var7 = var3;
      int var8 = var3.length;
      int var9 = 0;

      while (true) {
         if (var9 < var8) {
            int var10 = var7[var9];
            Object var14 = 150762093507542450L;
            Ref.g(150762093507542450L, var14);
            Object[] var10003 = Registry.packArgs(var10);
            long var17 = 303488344973038628L;
            Object[] var16 = var10003;
            var10003 = Ref.h(303488344973038628L, var16, var17);

            try {
               var10003 = (Object[])((Object)var10003);
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            Object var11 = var10003;
            var6.add(var11);
            var9++;
            if (var2 == null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         Object[] var10002 = Registry.packArgs(var6, var1, false);
         long var19 = 424046130677892248L;
         Object[] var18 = var10002;
         Ref.h(424046130677892248L, var18, var19);

         try {
            break;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }
      }
   }

   public void R(Tf4 var1) {
      ArrayList var2 = new ArrayList();
      var2.add(var1);
      new ApplyToFileAndDirDialog(this, var2, SwingUtilities.getWindowAncestor(this));
   }

   public void E() {
      Object var10 = 150762093507542450L;
      int[] var2 = ((Km2)Ref.g(150762093507542450L, var10)).getSelectedRows();
      boolean var3 = false;
      ArrayList var4 = new ArrayList();
      int[] var5 = var2;
      int var6 = var2.length;
      boolean var10001 = i();
      int var7 = 0;
      boolean var1 = var10001;

      while (var7 < var6) {
         int var8 = var5[var7];
         Object var12 = 150762093507542450L;
         Ref.g(150762093507542450L, var12);
         Object[] var10003 = Registry.packArgs(var8);
         long var15 = 303488344973038628L;
         Object[] var14 = var10003;
         var10003 = Ref.h(303488344973038628L, var14, var15);

         try {
            var10003 = (Object[])((Object)var10003);
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         Object var9 = var10003;
         var4.add(var9);
         var7++;
         if (!var1) {
            break;
         }
      }

      new ApplyToFileAndDirDialog(this, var4, SwingUtilities.getWindowAncestor(this));
   }

   public void Y(Component var1, boolean var2) {
      Object var12 = 150762093507542450L;
      int[] var4 = ((Km2)Ref.g(150762093507542450L, var12)).getSelectedRows();
      boolean var10001 = g();
      int var5 = JOptionPane.showConfirmDialog(var1, a(20041, -2389), a(20032, 29531), 0);
      boolean var3 = var10001;
      if (var5 == 0) {
         ArrayList var6 = new ArrayList();
         int[] var7 = var4;
         int var8 = var4.length;
         int var9 = 0;

         while (true) {
            if (var9 < var8) {
               int var10 = var7[var9];
               Object var14 = 150762093507542450L;
               Ref.g(150762093507542450L, var14);
               Object[] var10003 = Registry.packArgs(var10);
               long var17 = 303488344973038628L;
               Object[] var16 = var10003;
               var10003 = Ref.h(303488344973038628L, var16, var17);

               try {
                  var10003 = (Object[])((Object)var10003);
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }

               Object var11 = var10003;
               var6.add(var11);
               var9++;
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            Object[] var10002 = Registry.packArgs(var6, var1, var2);
            long var19 = 596140999974749196L;
            Object[] var18 = var10002;
            Ref.h(596140999974749196L, var18, var19);

            try {
               break;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }
         }
      }
   }

   public void J(Object var1, Component var2, boolean var3) {
      ArrayList var4 = new ArrayList();
      var4.add(var1);
      Object[] var10001 = Registry.packArgs(var4, var2, var3);
      long var6 = 424046130677892248L;
      Object[] var5 = var10001;
      Ref.h(424046130677892248L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void E(Tf4 var1, Component var2, boolean var3) {
      ArrayList var4 = new ArrayList();
      var4.add(var1);
      Object[] var10001 = Registry.packArgs(var4, var2, var3);
      long var6 = 596140999974749196L;
      Object[] var5 = var10001;
      Ref.h(596140999974749196L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void j(ArrayList param1, Component param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 5
      // 003: invokestatic com/finalshell/ui/panel/Address.i ()Z
      // 006: ldc_w ""
      // 009: astore 6
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 011: astore 7
      // 013: aload 7
      // 015: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01a: ifeq 1db
      // 01d: aload 7
      // 01f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 024: astore 8
      // 026: aload 8
      // 028: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 02b: ldc_w com/finalshell/ui/model/Tf4
      // 02e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 031: iload 4
      // 033: ifeq 1ef
      // 036: iload 4
      // 038: ifeq 138
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: ifeq 11a
      // 045: goto 04c
      // 048: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: aload 8
      // 04e: checkcast com/finalshell/ui/model/Tf4
      // 051: astore 9
      // 053: aload 0
      // 054: ldc2_w 627973027287447539
      // 057: astore 24
      // 059: ldc2_w 627973027287447539
      // 05c: aload 24
      // 05e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 061: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 064: ldc2_w 212042562452272939
      // 067: astore 27
      // 069: astore 26
      // 06b: ldc2_w 212042562452272939
      // 06e: aload 26
      // 070: aload 27
      // 072: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 075: checkcast com/finalshell/connection/Connection12
      // 078: goto 07f
      // 07b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: astore 10
      // 081: aload 9
      // 083: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 086: ldc2_w 179612178163941306
      // 089: astore 29
      // 08b: astore 28
      // 08d: ldc2_w 179612178163941306
      // 090: aload 28
      // 092: aload 29
      // 094: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 097: checkcast java/lang/String
      // 09a: goto 0a1
      // 09d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: astore 11
      // 0a3: aload 5
      // 0a5: iload 4
      // 0a7: ifeq 113
      // 0aa: ifnonnull 0ed
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 9
      // 0b6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b9: ldc2_w 498856411508641826
      // 0bc: astore 31
      // 0be: astore 30
      // 0c0: ldc2_w 498856411508641826
      // 0c3: aload 30
      // 0c5: aload 31
      // 0c7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ca: goto 0d1
      // 0cd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d4: ldc2_w 405430188584561323
      // 0d7: astore 32
      // 0d9: ldc2_w 405430188584561323
      // 0dc: aload 32
      // 0de: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e1: checkcast java/lang/String
      // 0e4: goto 0eb
      // 0e7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: astore 5
      // 0ed: new java/lang/StringBuilder
      // 0f0: dup
      // 0f1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f4: aload 6
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: sipush 20054
      // 0fc: sipush 12846
      // 0ff: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 102: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 105: aload 11
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10a: ldc_w "\""
      // 10d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 110: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 113: astore 6
      // 115: iload 4
      // 117: ifne 1d6
      // 11a: aload 8
      // 11c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 11f: iload 4
      // 121: ifeq 13d
      // 124: goto 12b
      // 127: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: ldc_w com/finalshell/ui/model/Ck4
      // 12e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 131: goto 138
      // 134: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: ifeq 1d6
      // 13b: aload 8
      // 13d: checkcast com/finalshell/ui/model/Ck4
      // 140: astore 9
      // 142: aload 9
      // 144: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 147: ldc2_w 396085629172753019
      // 14a: astore 35
      // 14c: astore 34
      // 14e: ldc2_w 396085629172753019
      // 151: aload 34
      // 153: aload 35
      // 155: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 158: checkcast java/lang/String
      // 15b: goto 162
      // 15e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 161: athrow
      // 162: astore 10
      // 164: aload 5
      // 166: iload 4
      // 168: ifeq 1d4
      // 16b: ifnonnull 1ae
      // 16e: goto 175
      // 171: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: aload 9
      // 177: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 17a: ldc2_w 605430732347023634
      // 17d: astore 37
      // 17f: astore 36
      // 181: ldc2_w 605430732347023634
      // 184: aload 36
      // 186: aload 37
      // 188: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18b: goto 192
      // 18e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 191: athrow
      // 192: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 195: ldc2_w 405430188584561323
      // 198: astore 38
      // 19a: ldc2_w 405430188584561323
      // 19d: aload 38
      // 19f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a2: checkcast java/lang/String
      // 1a5: goto 1ac
      // 1a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: astore 5
      // 1ae: new java/lang/StringBuilder
      // 1b1: dup
      // 1b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b5: aload 6
      // 1b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ba: sipush 20054
      // 1bd: sipush 12846
      // 1c0: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c6: aload 10
      // 1c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cb: ldc_w "\""
      // 1ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d4: astore 6
      // 1d6: iload 4
      // 1d8: ifne 013
      // 1db: aload 6
      // 1dd: iload 4
      // 1df: ifeq 22d
      // 1e2: ldc_w ","
      // 1e5: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: ifeq 201
      // 1f2: aload 6
      // 1f4: bipush 0
      // 1f5: aload 6
      // 1f7: invokevirtual java/lang/String.length ()I
      // 1fa: bipush 1
      // 1fb: isub
      // 1fc: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1ff: astore 6
      // 201: new java/lang/StringBuilder
      // 204: dup
      // 205: invokespecial java/lang/StringBuilder.<init> ()V
      // 208: sipush 20052
      // 20b: sipush -20243
      // 20e: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 211: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 214: aload 5
      // 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 219: sipush 20086
      // 21c: sipush -10719
      // 21f: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 225: aload 6
      // 227: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22d: astore 7
      // 22f: aload 0
      // 230: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 233: ldc2_w 622340890791521181
      // 236: astore 41
      // 238: astore 40
      // 23a: ldc2_w 622340890791521181
      // 23d: aload 40
      // 23f: aload 41
      // 241: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 244: checkcast com/finalshell/connection/Connection12
      // 247: goto 24e
      // 24a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 24d: athrow
      // 24e: astore 8
      // 250: aconst_null
      // 251: astore 9
      // 253: aload 8
      // 255: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 258: ldc2_w 135220879492188512
      // 25b: astore 43
      // 25d: astore 42
      // 25f: ldc2_w 135220879492188512
      // 262: aload 42
      // 264: aload 43
      // 266: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 269: pop
      // 26a: goto 271
      // 26d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 270: athrow
      // 271: aload 8
      // 273: aload 7
      // 275: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 278: ldc2_w 529833862401435412
      // 27b: astore 45
      // 27d: astore 44
      // 27f: ldc2_w 529833862401435412
      // 282: aload 44
      // 284: aload 45
      // 286: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 289: checkcast com/finalshell/core/DB3
      // 28c: goto 293
      // 28f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 292: athrow
      // 293: astore 9
      // 295: new java/io/BufferedReader
      // 298: dup
      // 299: new java/io/InputStreamReader
      // 29c: dup
      // 29d: aload 9
      // 29f: invokevirtual com/finalshell/core/DB3.s ()Ljava/io/InputStream;
      // 2a2: sipush 20046
      // 2a5: sipush -7093
      // 2a8: invokestatic com/finalshell/ui/panel/Address.a (II)Ljava/lang/String;
      // 2ab: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 2ae: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 2b1: astore 10
      // 2b3: aload 9
      // 2b5: invokevirtual com/finalshell/core/DB3.I ()V
      // 2b8: aload 9
      // 2ba: astore 12
      // 2bc: ldc2_w 388376917454860932
      // 2bf: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2c2: aconst_null
      // 2c3: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c6: new com/finalshell/task/TX3
      // 2c9: dup
      // 2ca: aload 0
      // 2cb: aload 12
      // 2cd: invokespecial com/finalshell/task/TX3.<init> (Lcom/finalshell/ui/panel/Address;Lcom/finalshell/core/DB3;)V
      // 2d0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2d3: ldc2_w 434592463220957006
      // 2d6: astore 47
      // 2d8: astore 46
      // 2da: ldc2_w 434592463220957006
      // 2dd: aload 46
      // 2df: aload 47
      // 2e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2e4: pop
      // 2e5: goto 2ec
      // 2e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2eb: athrow
      // 2ec: bipush 0
      // 2ed: istore 13
      // 2ef: aload 10
      // 2f1: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 2f4: dup
      // 2f5: astore 11
      // 2f7: ifnull 30e
      // 2fa: iinc 13 1
      // 2fd: iload 4
      // 2ff: ifeq 313
      // 302: iload 4
      // 304: ifne 2ef
      // 307: goto 30e
      // 30a: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30d: athrow
      // 30e: aload 10
      // 310: invokevirtual java/io/BufferedReader.close ()V
      // 313: bipush 0
      // 314: istore 14
      // 316: aload 9
      // 318: invokevirtual com/finalshell/core/DB3.o ()I
      // 31b: istore 14
      // 31d: iload 4
      // 31f: ifeq 351
      // 322: iload 3
      // 323: ifne 356
      // 326: goto 32d
      // 329: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32c: athrow
      // 32d: aload 0
      // 32e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 331: ldc2_w 553191921490783868
      // 334: astore 49
      // 336: astore 48
      // 338: ldc2_w 553191921490783868
      // 33b: aload 48
      // 33d: aload 49
      // 33f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 342: pop
      // 343: goto 34a
      // 346: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 349: athrow
      // 34a: goto 351
      // 34d: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 350: athrow
      // 351: iload 4
      // 353: ifne 546
      // 356: aconst_null
      // 357: astore 15
      // 359: aload 1
      // 35a: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 35d: astore 16
      // 35f: aload 16
      // 361: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 366: ifeq 50e
      // 369: aload 16
      // 36b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 370: astore 17
      // 372: iload 4
      // 374: ifeq 546
      // 377: aload 17
      // 379: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 37c: ldc_w com/finalshell/ui/model/Tf4
      // 37f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 382: iload 4
      // 384: ifeq 4b8
      // 387: goto 38e
      // 38a: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38d: athrow
      // 38e: ifeq 49a
      // 391: goto 398
      // 394: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 397: athrow
      // 398: aload 17
      // 39a: checkcast com/finalshell/ui/model/Tf4
      // 39d: astore 18
      // 39f: new java/util/ArrayList
      // 3a2: dup
      // 3a3: invokespecial java/util/ArrayList.<init> ()V
      // 3a6: astore 19
      // 3a8: aload 18
      // 3aa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3ad: ldc2_w 498856411508641826
      // 3b0: astore 51
      // 3b2: astore 50
      // 3b4: ldc2_w 498856411508641826
      // 3b7: aload 50
      // 3b9: aload 51
      // 3bb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3be: checkcast java/lang/String
      // 3c1: goto 3c8
      // 3c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3c7: athrow
      // 3c8: astore 20
      // 3ca: aload 19
      // 3cc: new com/finalshell/core/GZ_2
      // 3cf: dup
      // 3d0: aload 20
      // 3d2: lconst_0
      // 3d3: aload 18
      // 3d5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3d8: ldc2_w 549229823689592892
      // 3db: astore 53
      // 3dd: astore 52
      // 3df: ldc2_w 549229823689592892
      // 3e2: aload 52
      // 3e4: aload 53
      // 3e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3e9: checkcast java/lang/Integer
      // 3ec: invokevirtual java/lang/Integer.intValue ()I
      // 3ef: goto 3f6
      // 3f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f5: athrow
      // 3f6: bipush 1
      // 3f7: invokespecial com/finalshell/core/GZ_2.<init> (Ljava/lang/String;JIZ)V
      // 3fa: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 3fd: pop
      // 3fe: aload 19
      // 400: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 403: astore 21
      // 405: aload 21
      // 407: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 40c: ifeq 473
      // 40f: aload 21
      // 411: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 416: checkcast com/finalshell/core/GZ_2
      // 419: astore 22
      // 41b: aload 0
      // 41c: ldc2_w 627973027287447539
      // 41f: astore 54
      // 421: ldc2_w 627973027287447539
      // 424: aload 54
      // 426: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 429: aload 22
      // 42b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 42e: ldc2_w 552192581091318882
      // 431: astore 57
      // 433: astore 56
      // 435: ldc2_w 552192581091318882
      // 438: aload 56
      // 43a: aload 57
      // 43c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 43f: goto 446
      // 442: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 445: athrow
      // 446: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 449: ldc2_w 302012955517893264
      // 44c: astore 59
      // 44e: astore 58
      // 450: ldc2_w 302012955517893264
      // 453: aload 58
      // 455: aload 59
      // 457: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 45a: pop
      // 45b: goto 462
      // 45e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 461: athrow
      // 462: iload 4
      // 464: ifeq 495
      // 467: iload 4
      // 469: ifne 405
      // 46c: goto 473
      // 46f: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 472: athrow
      // 473: aload 18
      // 475: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 478: ldc2_w 498856411508641826
      // 47b: astore 61
      // 47d: astore 60
      // 47f: ldc2_w 498856411508641826
      // 482: aload 60
      // 484: aload 61
      // 486: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 489: checkcast java/lang/String
      // 48c: goto 493
      // 48f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 492: athrow
      // 493: astore 15
      // 495: iload 4
      // 497: ifne 509
      // 49a: aload 17
      // 49c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 49f: iload 4
      // 4a1: ifeq 4bd
      // 4a4: goto 4ab
      // 4a7: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4aa: athrow
      // 4ab: ldc_w com/finalshell/ui/model/Ck4
      // 4ae: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 4b1: goto 4b8
      // 4b4: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b7: athrow
      // 4b8: ifeq 509
      // 4bb: aload 17
      // 4bd: checkcast com/finalshell/ui/model/Ck4
      // 4c0: astore 18
      // 4c2: aload 0
      // 4c3: ldc2_w 627973027287447539
      // 4c6: astore 62
      // 4c8: ldc2_w 627973027287447539
      // 4cb: aload 62
      // 4cd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4d0: aload 18
      // 4d2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4d5: ldc2_w 605430732347023634
      // 4d8: astore 65
      // 4da: astore 64
      // 4dc: ldc2_w 605430732347023634
      // 4df: aload 64
      // 4e1: aload 65
      // 4e3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4e6: goto 4ed
      // 4e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ec: athrow
      // 4ed: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4f0: ldc2_w 266662749976559972
      // 4f3: astore 67
      // 4f5: astore 66
      // 4f7: ldc2_w 266662749976559972
      // 4fa: aload 66
      // 4fc: aload 67
      // 4fe: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 501: pop
      // 502: goto 509
      // 505: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 508: athrow
      // 509: iload 4
      // 50b: ifne 35f
      // 50e: aload 0
      // 50f: aload 15
      // 511: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 514: ldc2_w 405430188584561323
      // 517: astore 68
      // 519: ldc2_w 405430188584561323
      // 51c: aload 68
      // 51e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 521: goto 528
      // 524: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 527: athrow
      // 528: bipush 0
      // 529: bipush 0
      // 52a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 52d: ldc2_w 324338769529465951
      // 530: astore 71
      // 532: astore 70
      // 534: ldc2_w 324338769529465951
      // 537: aload 70
      // 539: aload 71
      // 53b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 53e: pop
      // 53f: goto 546
      // 542: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 545: athrow
      // 546: aload 9
      // 548: iload 4
      // 54a: ifeq 559
      // 54d: ifnull 593
      // 550: goto 557
      // 553: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 556: athrow
      // 557: aload 9
      // 559: invokevirtual com/finalshell/core/DB3.r ()V
      // 55c: goto 593
      // 55f: astore 10
      // 561: aload 10
      // 563: invokevirtual java/lang/Exception.printStackTrace ()V
      // 566: aload 9
      // 568: iload 4
      // 56a: ifeq 572
      // 56d: ifnull 593
      // 570: aload 9
      // 572: invokevirtual com/finalshell/core/DB3.r ()V
      // 575: goto 593
      // 578: astore 23
      // 57a: aload 9
      // 57c: iload 4
      // 57e: ifeq 58d
      // 581: ifnull 590
      // 584: goto 58b
      // 587: invokestatic com/finalshell/ui/panel/Address.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58a: athrow
      // 58b: aload 9
      // 58d: invokevirtual com/finalshell/core/DB3.r ()V
      // 590: aload 23
      // 592: athrow
      // 593: return
   }

   public void M(ArrayList var1, Component var2, boolean var3) {
      boolean var10000 = g();
      Iterator var5 = var1.iterator();
      boolean var4 = var10000;

      while (var5.hasNext()) {
         label69: {
            label70: {
               Object var6 = var5.next();
               var10000 = var6.getClass().equals(Tf4.class);
               if (!var4) {
                  if (var10000) {
                     Tf4 var7 = (Tf4)var6;
                     Object var12 = 627973027287447539L;
                     Ref.g(627973027287447539L, var12);
                     FileTransferConnection var10002 = (FileTransferConnection)(Registry.emptyArgs());
                     long var15 = 212042562452272939L;
                     Object var14 = var10002;
                     var10002 = Ref.h(212042562452272939L, var14, var15);

                     try {
                        var10002 = (FileTransferConnection)var10002;
                     } catch (InvocationTargetException var25) {
                        throw var25.getTargetException();
                     }

                     FileTransferConnection var8 = var10002;
                     String var10003 = (String)(Registry.emptyArgs());
                     long var17 = 498856411508641826L;
                     Object var16 = var10003;
                     var10003 = Ref.h(498856411508641826L, var16, var17);

                     try {
                        var10003 = (String)var10003;
                     } catch (InvocationTargetException var24) {
                        throw var24.getTargetException();
                     }

                     String var9 = var10003;
                     ArrayList var10 = new ArrayList();
                     ProgressDialog var11 = new ProgressDialog(SwingUtilities.getWindowAncestor(this));
                     Registry.lookupField(388376917454860932L).get(null);
                     Object[] var10004 = Registry.packArgs(new Vy2(this, var8, var9, var10, var11, var7, var3, var2));
                     long var19 = 434592463220957006L;
                     Object[] var18 = var10004;
                     Ref.h(434592463220957006L, var18, var19);

                     try {
                        ;
                     } catch (InvocationTargetException var23) {
                        throw var23.getTargetException();
                     }

                     if (!var4) {
                        break label69;
                     }
                  }

                  var28 = var6.getClass();
                  if (var4) {
                     break label70;
                  }

                  var10000 = var28.equals(Ck4.class);
               }

               if (!var10000) {
      long var28;
                  break label69;
               }

               var28 = var6;
            }

            Ck4 var26 = (Ck4)var28;
            Registry.lookupField(388376917454860932L).get(null);
            Object[] var10001 = Registry.packArgs(new OV(this, var26));
            long var21 = 434592463220957006L;
            Object[] var20 = var10001;
            Ref.h(434592463220957006L, var20, var21);

            try {
               ;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }
         }

         if (var4) {
            break;
         }
      }
   }

   public void w(ArrayList var1, Component var2, boolean var3) {
      boolean var10000 = g();
      Iterator var5 = var1.iterator();
      boolean var4 = var10000;

      while (var5.hasNext()) {
         label69: {
            label70: {
               Object var6 = var5.next();
               var10000 = var6.getClass().equals(Tf4.class);
               if (!var4) {
                  if (var10000) {
                     Tf4 var7 = (Tf4)var6;
                     Object var12 = 627973027287447539L;
                     Ref.g(627973027287447539L, var12);
                     Object var10002 = Registry.emptyArgs();
                     long var15 = 212042562452272939L;
                     Object var14 = var10002;
                     var10002 = Ref.h(212042562452272939L, var14, var15);

                     try {
                        var10002 = (FileTransferConnection)var10002;
                     } catch (InvocationTargetException var25) {
                        throw var25.getTargetException();
                     }

                     FileTransferConnection var8 = var10002;
                     Object var10003 = Registry.emptyArgs();
                     long var17 = 498856411508641826L;
                     Object var16 = var10003;
                     var10003 = Ref.h(498856411508641826L, var16, var17);

                     try {
                        var10003 = (String)var10003;
                     } catch (InvocationTargetException var24) {
                        throw var24.getTargetException();
                     }

                     String var9 = var10003;
                     ArrayList var10 = new ArrayList();
                     ProgressDialog var11 = new ProgressDialog(SwingUtilities.getWindowAncestor(this));
                     Registry.lookupField(388376917454860932L).get(null);
                     Object[] var10004 = Registry.packArgs(new ZH(this, var8, var9, var10, var11, var7, var3, var2));
                     long var19 = 434592463220957006L;
                     Object[] var18 = var10004;
                     Ref.h(434592463220957006L, var18, var19);

                     try {
                        ;
                     } catch (InvocationTargetException var23) {
                        throw var23.getTargetException();
                     }

                     if (!var4) {
                        break label69;
                     }
                  }

                  var28 = var6.getClass();
                  if (var4) {
                     break label70;
                  }

                  var10000 = var28.equals(Ck4.class);
               }

               if (!var10000) {
                  break label69;
               }

               var28 = var6;
            }

            Ck4 var26 = (Ck4)var28;
            Registry.lookupField(388376917454860932L).get(null);
            Object[] var10001 = Registry.packArgs(new Uk2(this, var26));
            long var21 = 434592463220957006L;
            Object[] var20 = var10001;
            Ref.h(434592463220957006L, var20, var21);

            try {
               ;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }
         }

         if (var4) {
            break;
         }
      }
   }

   public void g(ArrayList var1, Component var2) {
   }

   public void Y(boolean var1) {
      g();
      var1 = true;
      Object var6 = 150762093507542450L;
      int var3 = ((Km2)Ref.g(150762093507542450L, var6)).getSelectedRow();
      if (var3 >= 0) {
         Object var8 = 150762093507542450L;
         Ref.g(150762093507542450L, var8);
         Object var10003 = Registry.packArgs(var3);
         long var11 = 303488344973038628L;
         Object var10 = var10003;
         var10003 = Ref.h(303488344973038628L, var10, var11);

         try {
            var10003 = (Object[])((Object)var10003);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         Object var4 = var10003;
         Object var5 = null;
         var10003 = (Object[])var4;
         if (this == null) {
            if (var4 == null) {
               return;
            }

            var10003 = (Object[])var4;
         }

         var10003 = var10003.getClass();
         if (this == null) {
            if (!var10003.equals(Ck4.class)) {
               return;
            }

            var10003 = (Object[])var4;
         }

         var5 = (Ck4)var10003;
         Object[] var10005 = Registry.emptyArgs();
         long var13 = 605430732347023634L;
         Object[] var12 = var10005;
         var10005 = Registry.packArgs(Ref.h(605430732347023634L, var12, var13), var1);
         long var15 = 509505013954490929L;
         Object[] var14 = var10005;
         Ref.h(509505013954490929L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }
      }
   }

   public void i(String var1, boolean var2) {
      boolean var141;
      Object[] var33;
      Object[] var10001 = Registry.packArgs(var1, false);
      long var22 = 203282927631494339L;
      Object[] var21 = var10001;
      Ref.h(203282927631494339L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var119) {
         throw var119.getTargetException();
      }

      Registry.emptyArgs();
      long var23 = 270389152141252877L;
      Ref.h2(270389152141252877L, var23);
      Object var10003 = Registry.emptyArgs();
      long var26 = 306266403902896148L;
      Object var25 = var10003;
      var10003 = Ref.h(306266403902896148L, var25, var26);

      try {
         var10003 = (U62)var10003;
      } catch (InvocationTargetException var118) {
         throw var118.getTargetException();
      }

      U62 var4 = var10003;
      Registry.packArgs(var1);
      long var27 = 353935338506646766L;
      Object var10004 = Ref.h2(353935338506646766L, var27);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var117) {
         throw var117.getTargetException();
      }

      String var5 = (String)var10004;
      g();
      Object var10006 = Registry.emptyArgs();
      long var30 = 339037510611298074L;
      Object var29 = var10006;
      var10006 = Ref.h(339037510611298074L, var29, var30);

      try {
         var10006 = (ArrayList)var10006;
      } catch (InvocationTargetException var116) {
         throw var116.getTargetException();
      }

      ArrayList var6 = var10006;
      boolean var10005 = var6.contains(var5);
      if (var4 == null) {
         if (var10005) {
            var2 = false;
         }

         var10005 = var2;
      }

      if (var10005) {
         var10006 = Registry.emptyArgs();
         long var32 = 620011176897972573L;
         Object var31 = var10006;
         var10006 = Ref.h(620011176897972573L, var31, var32);

         try {
            var10006 = (String)var10006;
         } catch (InvocationTargetException var115) {
            throw var115.getTargetException();
         }

         boolean var8;
         label308: {
            U62 var10007;
            label309: {
               String var7 = var10006;
               var8 = false;
               if (var7 != null) {
                  boolean var132 = new java.io.File(var7).exists();
                  var10007 = var4;
                  if (var4 == null) {
                     break label309;
                  }

                  if (var132) {
                     var8 = true;
                  }
               }

               if (var4 == null) {
                  break label308;
               }

               Object[] var136 = Registry.emptyArgs();
               long var34 = 407355336116664491L;
               var33 = var136;
               var10007 = (U62)Ref.h(407355336116664491L, var33, var34);

               try {
                  var10007 = (Integer)var10007;
               } catch (InvocationTargetException var114) {
                  throw var114.getTargetException();
               }
            }

            if (var10007 != null && !var8) {
               Registry.packArgs(this);
               long var35 = 211273487601650149L;
               Ref.h2(211273487601650149L, var35);

               try {
                  ;
               } catch (InvocationTargetException var113) {
                  throw var113.getTargetException();
               }
            }
         }

         Object var138 = Registry.emptyArgs();
         long var38 = 620011176897972573L;
         Object var37 = var138;
         var138 = Ref.h(620011176897972573L, var37, var38);

         try {
            var138 = (String)var138;
         } catch (InvocationTargetException var112) {
            throw var112.getTargetException();
         }

         label289: {
            String var120 = var138;
            if (var120 != null) {
               var141 = new java.io.File(var120).exists();
               if (var4 == null) {
                  break label289;
               }

               if (var141) {
                  var8 = true;
               }
            }

            var141 = var8;
         }

         if (!var141) {
         }
      }

      Registry.packArgs(var1);
      long var39 = 405430188584561323L;
      var10006 = Ref.h2(405430188584561323L, var39);

      try {
         var10006 = (String)var10006;
      } catch (InvocationTargetException var111) {
         throw var111.getTargetException();
      }

      String var121 = var10006;
      String var122 = (String)Registry.lookupField(439146272996415412L).get(null);
      String var10 = var1.substring(var121.length());
      String var135 = java.io.File.separator;
      if (var4 == null) {
         if (java.io.File.separator.equals("\\")) {
            var10 = var10.replaceAll("/", a(20063, -3872));
         }

         var135 = var122 + java.io.File.separator + var10;
      }

      String var11 = var135;
      Registry.packArgs(var11);
      long var41 = 477969598131796924L;
      Ref.h2(477969598131796924L, var41);

      try {
         ;
      } catch (InvocationTargetException var110) {
         throw var110.getTargetException();
      }

      Registry.emptyArgs();
      long var43 = 270389152141252877L;
      Ref.h2(270389152141252877L, var43);
      Object[] var10009 = Registry.emptyArgs();
      long var46 = 377280722715900564L;
      Object[] var45 = var10009;
      Ref.h(377280722715900564L, var45, var46);
      Object[] var10013 = Registry.emptyArgs();
      long var48 = 157614116591371207L;
      Object[] var47 = var10013;
      Object var10011 = Registry.packArgs(var1, this, Ref.h(157614116591371207L, var47, var48));
      long var50 = 127240892210755294L;
      Object var49 = var10011;
      var10011 = Ref.h(127240892210755294L, var49, var50);

      try {
         var143 = (Integer)var10011;
      } catch (InvocationTargetException var109) {
         throw var109.getTargetException();
      }

      int var13 = var143;
      Registry.emptyArgs();
      long var51 = 270389152141252877L;
      Ref.h2(270389152141252877L, var51);
      var10013 = Registry.emptyArgs();
      long var54 = 377280722715900564L;
      Object[] var53 = var10013;
      Ref.h(377280722715900564L, var53, var54);
      Object var10017 = Registry.emptyArgs();
      long var56 = 157614116591371207L;
      Object var55 = var10017;
      Object[] var10015 = Registry.packArgs(var1, this, Ref.h(157614116591371207L, var55, var56), var13);
      long var58 = 203732031803742515L;
      Object[] var57 = var10015;
      Ref.h(203732031803742515L, var57, var58);

      try {
         ;
      } catch (InvocationTargetException var108) {
         throw var108.getTargetException();
      }

      String var14 = "";
      if (var13 > 0) {
         var14 = "(" + var13 + ")";
      }

      Registry.packArgs(var11);
      long var59 = 477969598131796924L;
      Object var10016 = Ref.h2(477969598131796924L, var59);

      try {
         var10016 = (String)var10016;
      } catch (InvocationTargetException var107) {
         throw var107.getTargetException();
      }

      String var15 = (String)var10016;
      Registry.packArgs(var15);
      long var61 = 247244861321523360L;
      var10017 = Ref.h2(247244861321523360L, var61);

      try {
         var10017 = (String)var10017;
      } catch (InvocationTargetException var106) {
         throw var106.getTargetException();
      }

      String var16 = var10017;
      Registry.packArgs(var15);
      long var63 = 353935338506646766L;
      Object var10018 = Ref.h2(353935338506646766L, var63);

      try {
         var10018 = (String)var10018;
      } catch (InvocationTargetException var105) {
         throw var105.getTargetException();
      }

      String var17 = (String)var10018;
      var10018 = var17;
      if (var4 == null) {
         if (!var17.equals("")) {
            String var18 = var16 + "." + var17;
         }

         var10018 = new StringBuilder();
         Object[] var10019 = Registry.packArgs(var11);
         long var65 = 405430188584561323L;
         Object var10020 = Ref.h2(405430188584561323L, var65);

         try {
            var10020 = (String)var10020;
         } catch (InvocationTargetException var104) {
            throw var104.getTargetException();
         }

         ((java.lang.StringBuilder)var10019).append((String)var10020).append(java.io.File.separator);
         Object[] var10021 = Registry.emptyArgs();
         long var68 = 157614116591371207L;
         Object[] var67 = var10021;
         var10021 = Ref.h(157614116591371207L, var67, var68);
         Object var10022 = Registry.emptyArgs();
         long var70 = 286931176286176762L;
         Object var69 = var10022;
         var10022 = Ref.h(286931176286176762L, var69, var70);

         try {
            var10022 = (String)var10022;
         } catch (InvocationTargetException var103) {
            throw var103.getTargetException();
         }

         ((java.lang.StringBuilder)var10021).append((String)var10022).append("_").append(var16).append(var14).append(".").append(var17).toString();
      }

      var11 = (String)var10018;
      YI var152 = Registry.emptyArgs();
      long var72 = 584980468782481561L;
      Object var71 = var152;
      var152 = Ref.h(584980468782481561L, var71, var72);

      try {
         var152 = (FileTransferConnection)var152;
      } catch (InvocationTargetException var102) {
         throw var102.getTargetException();
      }

      Object var10023 = Registry.emptyArgs();
      long var74 = 157614116591371207L;
      Object var73 = var10023;
      var10023 = Ref.h(157614116591371207L, var73, var74);

      try {
         var10023 = (Lv4_2)var10023;
      } catch (InvocationTargetException var101) {
         throw var101.getTargetException();
      }

var152 = new FileBrowserAddressBar(this, var10023, var121, var122, var1, var11, true);
      Object[] var155 = Registry.packArgs(true);
      long var76 = 400314518109324563L;
      Object[] var75 = var155;
      Ref.h(400314518109324563L, var75, var76);

      try {
         ;
      } catch (InvocationTargetException var100) {
         throw var100.getTargetException();
      }

      Registry.emptyArgs();
      long var77 = 270389152141252877L;
      Ref.h2(270389152141252877L, var77);
      var10023 = Registry.emptyArgs();
      long var80 = 377280722715900564L;
      Object var79 = var10023;
      Ref.h(377280722715900564L, var79, var80);
      Object[] var10024 = Registry.packArgs(this);
      long var82 = 118191003152152827L;
      Object[] var81 = var10024;
      Ref.h(118191003152152827L, var81, var82);

      try {
         ;
      } catch (InvocationTargetException var99) {
         throw var99.getTargetException();
      }

      YI var10027 = Registry.emptyArgs();
      long var84 = 584980468782481561L;
      Object var83 = var10027;
      var10027 = Ref.h(584980468782481561L, var83, var84);

      try {
         var10027 = (FileTransferConnection)var10027;
      } catch (InvocationTargetException var98) {
         throw var98.getTargetException();
      }

      Object var10029 = Registry.emptyArgs();
      long var86 = 157614116591371207L;
      Object var85 = var10029;
      var10029 = Ref.h(157614116591371207L, var85, var86);

      try {
         var10029 = (Lv4_2)var10029;
      } catch (InvocationTargetException var97) {
         throw var97.getTargetException();
      }

var10027 = new FileBrowserAddressBar(this, var10029, var122, var121, var11, var1, false);
      Object[] var163 = Registry.packArgs(this);
      long var88 = 626543303632176749L;
      Object[] var87 = var163;
      Ref.h(626543303632176749L, var87, var88);

      try {
         ;
      } catch (InvocationTargetException var96) {
         throw var96.getTargetException();
      }

      Registry.emptyArgs();
      long var89 = 270389152141252877L;
      Ref.h2(270389152141252877L, var89);
      var10029 = Registry.emptyArgs();
      long var92 = 371504798724351056L;
      Object var91 = var10029;
      Ref.h(371504798724351056L, var91, var92);
      Object[] var10030 = Registry.packArgs(var11, this);
      long var94 = 275970138976749932L;
      Object[] var93 = var10030;
      Ref.h(275970138976749932L, var93, var94);

      try {
         ;
      } catch (InvocationTargetException var95) {
         throw var95.getTargetException();
      }
   }

   public boolean O() {
      return Registry.lookupField(388861231234977918L).getBoolean(this);
   }

   public void e(boolean var1) {
      Registry.lookupField(388861231234977918L).setBoolean(this, var1);
   }

   public synchronized void t(String var1, boolean var2, boolean var3) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new VZ(this, var1, var2, var3));
      long var5 = 434592463220957006L;
      Object[] var4 = var10001;
      Ref.h(434592463220957006L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public synchronized void H(String var1, boolean var2) {
      Fm2 var33;
      boolean var10000 = g();
      L1 var4 = new L1("", var1);
      String var5 = a(20087, -26701);
      boolean var3 = var10000;
      if (!var3) {
         if (var2) {
            var5 = a(20038, 1812);
         }

         Object[] var10001 = Registry.packArgs(var5);
         long var7 = 473053936043215323L;
         Object[] var6 = var10001;
         Ref.h(473053936043215323L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }

         Object[] var10002 = Registry.packArgs(0);
         long var9 = 124068231949608152L;
         Object[] var8 = var10002;
         Ref.h(124068231949608152L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         Registry.emptyArgs();
         long var10 = 270389152141252877L;
         Ref.h2(270389152141252877L, var10);
         Object[] var10004 = Registry.emptyArgs();
         long var13 = 306266403902896148L;
         Object[] var12 = var10004;
         Ref.h(306266403902896148L, var12, var13);
         Object[] var10005 = Registry.emptyArgs();
         long var15 = 278198838305589877L;
         Object[] var14 = var10005;
         Ref.h(278198838305589877L, var14, var15);
         Object[] var10006 = Registry.packArgs(var4);
         long var17 = 331594575686452212L;
         Object[] var16 = var10006;
         Ref.h(331594575686452212L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         Registry.emptyArgs();
         long var18 = 270389152141252877L;
         Ref.h2(270389152141252877L, var18);
         Object[] var10008 = Registry.emptyArgs();
         long var21 = 578864097947885485L;
         Object[] var20 = var10008;
         Ref.h(578864097947885485L, var20, var21);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }
      }

      Object var22 = 181230843087831165L;
      var33 = (Fm2)Ref.g(181230843087831165L, var22);
      if (!var3) {
         if (var33 == null) {
            return;
         }

         Object var24 = 181230843087831165L;
         Fm2 var34 = (Fm2)Ref.g(181230843087831165L, var24);
      }

      Object[] var35 = Registry.emptyArgs();
      long var27 = 306221011327708335L;
      Object[] var26 = var35;
      Ref.h(306221011327708335L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }
   }

   public Ck4 g(String var1) {
      Object var2 = 627973027287447539L;
      Ref.g(627973027287447539L, var2);
      Object var10002 = Registry.packArgs(var1);
      long var5 = 278597282596374969L;
      Object var4 = var10002;
      var10002 = Ref.h(278597282596374969L, var4, var5);

      try {
         return (Ck4)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public Tf4 W(String var1) {
      Object var2 = 627973027287447539L;
      Ref.g(627973027287447539L, var2);
      Object var10002 = Registry.packArgs(var1);
      long var5 = 568746055453714541L;
      Object var4 = var10002;
      var10002 = Ref.h(568746055453714541L, var4, var5);

      try {
         return (Tf4)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void s(String var1) {
      String var2 = "";
      if (!var1.startsWith("/")) {
      }
   }

   public void s(String var1, boolean var2, boolean var3) {
      Object var4 = 627973027287447539L;
      Ref.g(627973027287447539L, var4);
      Object[] var10002 = Registry.packArgs(var1, var2, var3);
      long var7 = 413727787977868950L;
      Object[] var6 = var10002;
      Ref.h(413727787977868950L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public ConnectionInfoPanel M() {
      Object var1 = 627973027287447539L;
      return (ConnectionInfoPanel)Ref.g(627973027287447539L, var1);
   }

   public void c(ConnectionInfoPanel var1) {
      long var3 = 627973027287447539L;
      Ref.s(627973027287447539L, var1, var3);
   }

   @Override
   public synchronized void E(Uf4 var1) {
      Object[] var28;
      i();
      Object var10002 = Registry.emptyArgs();
      long var7 = 177073721418864424L;
      Object var6 = var10002;
      var10002 = Ref.h(177073721418864424L, var6, var7);

      try {
         var62 = (Integer)var10002;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      int var3 = var62;
      int var10001 = var3;
      int var63 = Registry.lookupField(451440066276164151L).getInt(null);
      if (var1 == null) {
         if (var3 == var63) {
            var10002 = Registry.emptyArgs();
            long var9 = 405617140951858885L;
            Object var8 = var10002;
            var10002 = Ref.h(405617140951858885L, var8, var9);

            try {
               var10002 = (Tf4)var10002;
            } catch (InvocationTargetException var59) {
               throw var59.getTargetException();
            }

            Tf4 var4 = var10002;
            Object var10 = 246488842365380158L;
            Ref.g(246488842365380158L, var10);
            Object var10004 = Registry.emptyArgs();
            long var13 = 152919711700242153L;
            Object var12 = var10004;
            var10004 = Ref.h(152919711700242153L, var12, var13);

            try {
               var10004 = (Tf4)var10004;
            } catch (InvocationTargetException var58) {
               throw var58.getTargetException();
            }

            if (var1 == null || var10004 != null) {
               Object[] var10005 = Registry.emptyArgs();
               long var15 = 498856411508641826L;
               Object[] var14 = var10005;
               Ref.h(498856411508641826L, var14, var15);

               try {
                  ;
               } catch (InvocationTargetException var57) {
                  throw var57.getTargetException();
               }

               Object var16 = 246488842365380158L;
               Ref.g(246488842365380158L, var16);
               Object[] var10008 = Registry.emptyArgs();
               long var19 = 152919711700242153L;
               Object[] var18 = var10008;
               var10008 = Ref.h(152919711700242153L, var18, var19);
               Object var10009 = Registry.emptyArgs();
               long var21 = 498856411508641826L;
               Object var20 = var10009;
               var10009 = Ref.h(498856411508641826L, var20, var21);

               try {
                  var10009 = (String)var10009;
               } catch (InvocationTargetException var56) {
                  throw var56.getTargetException();
               }

               if (var10008.equals(var10009)) {
                  Object var22 = 246488842365380158L;
                  Ref.g(246488842365380158L, var22);
                  Object[] var10010 = Registry.packArgs(var4);
                  long var25 = 217942201414471271L;
                  Object[] var24 = var10010;
                  Ref.h(217942201414471271L, var24, var25);

                  try {
                     ;
                  } catch (InvocationTargetException var55) {
                     throw var55.getTargetException();
                  }

                  Object[] var10011 = Registry.packArgs(false);
                  long var27 = 596499686400442579L;
                  Object[] var26 = var10011;
                  Ref.h(596499686400442579L, var26, var27);

                  try {
                     ;
                  } catch (InvocationTargetException var54) {
                     throw var54.getTargetException();
                  }
               }
            }

            if (var1 == null) {
               return;
            }
         }

         var10001 = var3;
         var63 = Registry.lookupField(532763949550214061L).getInt(null);
      }

      if (var10001 == var63) {
         var10002 = Registry.emptyArgs();
         long var29 = 470013864655122502L;
         var28 = var10002;
         Ref.h(470013864655122502L, var28, var29);

         try {
            ;
         } catch (InvocationTargetException var53) {
            throw var53.getTargetException();
         }

         Object var10003 = Registry.emptyArgs();
         long var31 = 405617140951858885L;
         Object var30 = var10003;
         var10003 = Ref.h(405617140951858885L, var30, var31);

         try {
            var10003 = (Tf4)var10003;
         } catch (InvocationTargetException var52) {
            throw var52.getTargetException();
         }

         Tf4 var5 = var10003;
         Object var32 = 246488842365380158L;
         Ref.g(246488842365380158L, var32);
         Object var72 = Registry.emptyArgs();
         long var35 = 152919711700242153L;
         Object var34 = var72;
         var72 = Ref.h(152919711700242153L, var34, var35);

         try {
            var72 = (Tf4)var72;
         } catch (InvocationTargetException var51) {
            throw var51.getTargetException();
         }

         if (var1 == null || var72 != null) {
            Object[] var10006 = Registry.emptyArgs();
            long var37 = 498856411508641826L;
            Object[] var36 = var10006;
            Ref.h(498856411508641826L, var36, var37);

            try {
               ;
            } catch (InvocationTargetException var50) {
               throw var50.getTargetException();
            }

            Object var38 = 246488842365380158L;
            Ref.g(246488842365380158L, var38);
            Object[] var78 = Registry.emptyArgs();
            long var41 = 152919711700242153L;
            Object[] var40 = var78;
            var78 = Ref.h(152919711700242153L, var40, var41);
            Object var80 = Registry.emptyArgs();
            long var43 = 498856411508641826L;
            Object var42 = var80;
            var80 = Ref.h(498856411508641826L, var42, var43);

            try {
               var80 = (String)var80;
            } catch (InvocationTargetException var49) {
               throw var49.getTargetException();
            }

            if (var78.equals(var80)) {
               Object var44 = 246488842365380158L;
               Ref.g(246488842365380158L, var44);
               Object[] var83 = Registry.packArgs(var5);
               long var47 = 217942201414471271L;
               Object[] var46 = var83;
               Ref.h(217942201414471271L, var46, var47);

               try {
                  ;
               } catch (InvocationTargetException var48) {
                  throw var48.getTargetException();
               }
            }
         }
      }
   }

   public FileCommandPanel D$s() {
      Object var1 = 157279472226096856L;
      return (FileCommandPanel)Ref.g(157279472226096856L, var1);
   }

   public void W(FileCommandPanel var1) {
      long var3 = 157279472226096856L;
      Ref.s(157279472226096856L, var1, var3);
   }

   public void c(boolean var1) {
      Object var2 = 539889883653769356L;
      ((LoadingPanel)Ref.g(539889883653769356L, var2)).setVisible(var1);
      this.repaint();
   }

   public FileTransferConnection s() {
      Object var1 = 460354311900945697L;
      return (FileTransferConnection)Ref.g(460354311900945697L, var1);
   }

   public FileTransferConnection e() {
      Object var1 = 382217741243932264L;
      return (FileTransferConnection)Ref.g(382217741243932264L, var1);
   }

   public void l(FileTransferConnection var1) {
      long var3 = 382217741243932264L;
      Ref.s(382217741243932264L, var1, var3);
   }

   public Lv4_2 q$lv_4() {
      Object var1 = 412956294006961210L;
      return (Lv4_2)Ref.g(412956294006961210L, var1);
   }

   public void K(Lv4_2 var1) {
      long var3 = 412956294006961210L;
      Ref.s(412956294006961210L, var1, var3);
   }

   public ConnectionProperty t$_y_2() {
      Object var1 = 577566864268156572L;
      return (ConnectionProperty)Ref.g(577566864268156572L, var1);
   }

   @Override
   public void E(ConnectionProperty var1) {
      long var3 = 577566864268156572L;
      Ref.s(577566864268156572L, var1, var3);
   }

   public boolean f() {
      return Registry.lookupField(141556903907833792L).getBoolean(this);
   }

   public void g(boolean var1) {
      Registry.lookupField(141556903907833792L).setBoolean(this, var1);
   }

   public Bi2 A() {
      Object var1 = 345912814423170794L;
      return (Bi2)Ref.g(345912814423170794L, var1);
   }

   public void o(Bi2 var1) {
      long var3 = 345912814423170794L;
      Ref.s(345912814423170794L, var1, var3);
   }

   @Override
   public void h$void() {
      long var28;
      long var2 = 460354311900945697L;
      Object var1 = null;
      Ref.s(460354311900945697L, var1, var2);
      long var4 = 382217741243932264L;
      Object var3 = null;
      Ref.s(382217741243932264L, var3, var4);
      long var6 = 272238901011657720L;
      Object var5 = null;
      Ref.s(272238901011657720L, var5, var6);
      long var8 = 345912814423170794L;
      Object var7 = null;
      Ref.s(345912814423170794L, var7, var8);
      long var10 = 627973027287447539L;
      Object var9 = null;
      Ref.s(627973027287447539L, var9, var10);
      long var12 = 150762093507542450L;
      Object var11 = null;
      Ref.s(150762093507542450L, var11, var12);
      long var14 = 246488842365380158L;
      Object var13 = null;
      Ref.s(246488842365380158L, var13, var14);
      long var16 = 625337668494616580L;
      Object var15 = null;
      Ref.s(625337668494616580L, var15, var16);
      long var18 = 130333487516543213L;
      Object var17 = null;
      Ref.s(130333487516543213L, var17, var18);
      long var20 = 412956294006961210L;
      Object var19 = null;
      Ref.s(412956294006961210L, var19, var20);
      long var22 = 539889883653769356L;
      Object var21 = null;
      Ref.s(539889883653769356L, var21, var22);
      long var24 = 575820630826541433L;
      Object var23 = null;
      Ref.s(575820630826541433L, var23, var24);
      long var26 = 577566864268156572L;
      Object var25 = null;
      Ref.s(577566864268156572L, var25, var26);
      var28 = 181230843087831165L;
      Object var27 = null;
      Ref.s(181230843087831165L, var27, var28);
      long var30 = 157279472226096856L;
      Object var29 = null;
      Ref.s(157279472226096856L, var29, var30);
      long var32 = 426888588741823559L;
      Object var31 = null;
      Ref.s(426888588741823559L, var31, var32);
      long var34 = 180432608079120024L;
      Object var33 = null;
      Ref.s(180432608079120024L, var33, var34);
      long var36 = 461351885911709248L;
      Object var35 = null;
      Ref.s(461351885911709248L, var35, var36);
      long var38 = 592875533914623126L;
      Object var37 = null;
      Ref.s(592875533914623126L, var37, var38);
      long var40 = 125193345155386567L;
      Object var39 = null;
      Ref.s(125193345155386567L, var39, var40);
      long var42 = 567412502050951757L;
      Object var41 = null;
      Ref.s(567412502050951757L, var41, var42);
      long var44 = 506751131738108937L;
      Object var43 = null;
      Ref.s(506751131738108937L, var43, var44);
      long var46 = 125409105349421096L;
      Object var45 = null;
      Ref.s(125409105349421096L, var45, var46);
      long var48 = 329882746337374810L;
      Object var47 = null;
      Ref.s(329882746337374810L, var47, var48);
   }

   @Override
   public void K() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Qk2(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public static void n(FileBrowserAddressBar var0, ConnectHost var1) throws Exception {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 349245443016521960L;
      Object[] var2 = var10001;
      Ref.h(349245443016521960L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static void W(boolean var0) {
      M = var0;
   }

   public static boolean i() {
      return M;
   }

   public static boolean g() {
      boolean var0 = i();
      return !var0;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 20054) & 65535;
      if (i[var2] == null) {
         char[] var3 = d[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 7;
               break;
            case 1:
               var10000 = 40;
               break;
            case 2:
               var10000 = 33;
               break;
            case 3:
               var10000 = 26;
               break;
            case 4:
               var10000 = 71;
               break;
            case 5:
               var10000 = 53;
               break;
            case 6:
               var10000 = 235;
               break;
            case 7:
               var10000 = 201;
               break;
            case 8:
               var10000 = 24;
               break;
            case 9:
               var10000 = 84;
               break;
            case 10:
               var10000 = 82;
               break;
            case 11:
               var10000 = 169;
               break;
            case 12:
               var10000 = 225;
               break;
            case 13:
               var10000 = 148;
               break;
            case 14:
               var10000 = 69;
               break;
            case 15:
               var10000 = 48;
               break;
            case 16:
               var10000 = 58;
               break;
            case 17:
               var10000 = 119;
               break;
            case 18:
               var10000 = 68;
               break;
            case 19:
               var10000 = 243;
               break;
            case 20:
               var10000 = 152;
               break;
            case 21:
               var10000 = 29;
               break;
            case 22:
               var10000 = 237;
               break;
            case 23:
               var10000 = 206;
               break;
            case 24:
               var10000 = 101;
               break;
            case 25:
               var10000 = 60;
               break;
            case 26:
               var10000 = 22;
               break;
            case 27:
               var10000 = 51;
               break;
            case 28:
               var10000 = 34;
               break;
            case 29:
               var10000 = 251;
               break;
            case 30:
               var10000 = 200;
               break;
            case 31:
               var10000 = 153;
               break;
            case 32:
               var10000 = 163;
               break;
            case 33:
               var10000 = 236;
               break;
            case 34:
               var10000 = 85;
               break;
            case 35:
               var10000 = 10;
               break;
            case 36:
               var10000 = 165;
               break;
            case 37:
               var10000 = 14;
               break;
            case 38:
               var10000 = 18;
               break;
            case 39:
               var10000 = 185;
               break;
            case 40:
               var10000 = 205;
               break;
            case 41:
               var10000 = 130;
               break;
            case 42:
               var10000 = 103;
               break;
            case 43:
               var10000 = 191;
               break;
            case 44:
               var10000 = 161;
               break;
            case 45:
               var10000 = 21;
               break;
            case 46:
               var10000 = 160;
               break;
            case 47:
               var10000 = 99;
               break;
            case 48:
               var10000 = 232;
               break;
            case 49:
               var10000 = 186;
               break;
            case 50:
               var10000 = 109;
               break;
            case 51:
               var10000 = 92;
               break;
            case 52:
               var10000 = 140;
               break;
            case 53:
               var10000 = 221;
               break;
            case 54:
               var10000 = 203;
               break;
            case 55:
               var10000 = 192;
               break;
            case 56:
               var10000 = 218;
               break;
            case 57:
               var10000 = 64;
               break;
            case 58:
               var10000 = 81;
               break;
            case 59:
               var10000 = 151;
               break;
            case 60:
               var10000 = 226;
               break;
            case 61:
               var10000 = 54;
               break;
            case 62:
               var10000 = 52;
               break;
            case 63:
               var10000 = 90;
               break;
            case 64:
               var10000 = 95;
               break;
            case 65:
               var10000 = 98;
               break;
            case 66:
               var10000 = 46;
               break;
            case 67:
               var10000 = 6;
               break;
            case 68:
               var10000 = 202;
               break;
            case 69:
               var10000 = 155;
               break;
            case 70:
               var10000 = 162;
               break;
            case 71:
               var10000 = 79;
               break;
            case 72:
               var10000 = 184;
               break;
            case 73:
               var10000 = 242;
               break;
            case 74:
               var10000 = 27;
               break;
            case 75:
               var10000 = 19;
               break;
            case 76:
               var10000 = 89;
               break;
            case 77:
               var10000 = 56;
               break;
            case 78:
               var10000 = 210;
               break;
            case 79:
               var10000 = 233;
               break;
            case 80:
               var10000 = 176;
               break;
            case 81:
               var10000 = 187;
               break;
            case 82:
               var10000 = 126;
               break;
            case 83:
               var10000 = 135;
               break;
            case 84:
               var10000 = 36;
               break;
            case 85:
               var10000 = 246;
               break;
            case 86:
               var10000 = 190;
               break;
            case 87:
               var10000 = 74;
               break;
            case 88:
               var10000 = 207;
               break;
            case 89:
               var10000 = 209;
               break;
            case 90:
               var10000 = 76;
               break;
            case 91:
               var10000 = 30;
               break;
            case 92:
               var10000 = 212;
               break;
            case 93:
               var10000 = 253;
               break;
            case 94:
               var10000 = 229;
               break;
            case 95:
               var10000 = 166;
               break;
            case 96:
               var10000 = 67;
               break;
            case 97:
               var10000 = 249;
               break;
            case 98:
               var10000 = 141;
               break;
            case 99:
               var10000 = 125;
               break;
            case 100:
               var10000 = 41;
               break;
            case 101:
               var10000 = 105;
               break;
            case 102:
               var10000 = 49;
               break;
            case 103:
               var10000 = 121;
               break;
            case 104:
               var10000 = 216;
               break;
            case 105:
               var10000 = 88;
               break;
            case 106:
               var10000 = 193;
               break;
            case 107:
               var10000 = 136;
               break;
            case 108:
               var10000 = 179;
               break;
            case 109:
               var10000 = 39;
               break;
            case 110:
               var10000 = 239;
               break;
            case 111:
               var10000 = 127;
               break;
            case 112:
               var10000 = 42;
               break;
            case 113:
               var10000 = 183;
               break;
            case 114:
               var10000 = 145;
               break;
            case 115:
               var10000 = 231;
               break;
            case 116:
               var10000 = 144;
               break;
            case 117:
               var10000 = 167;
               break;
            case 118:
               var10000 = 80;
               break;
            case 119:
               var10000 = 188;
               break;
            case 120:
               var10000 = 156;
               break;
            case 121:
               var10000 = 219;
               break;
            case 122:
               var10000 = 112;
               break;
            case 123:
               var10000 = 150;
               break;
            case 124:
               var10000 = 28;
               break;
            case 125:
               var10000 = 252;
               break;
            case 126:
               var10000 = 159;
               break;
            case 127:
               var10000 = 158;
               break;
            case 128:
               var10000 = 57;
               break;
            case 129:
               var10000 = 197;
               break;
            case 130:
               var10000 = 108;
               break;
            case 131:
               var10000 = 247;
               break;
            case 132:
               var10000 = 143;
               break;
            case 133:
               var10000 = 9;
               break;
            case 134:
               var10000 = 174;
               break;
            case 135:
               var10000 = 117;
               break;
            case 136:
               var10000 = 12;
               break;
            case 137:
               var10000 = 164;
               break;
            case 138:
               var10000 = 5;
               break;
            case 139:
               var10000 = 137;
               break;
            case 140:
               var10000 = 61;
               break;
            case 141:
               var10000 = 47;
               break;
            case 142:
               var10000 = 199;
               break;
            case 143:
               var10000 = 97;
               break;
            case 144:
               var10000 = 244;
               break;
            case 145:
               var10000 = 132;
               break;
            case 146:
               var10000 = 220;
               break;
            case 147:
               var10000 = 102;
               break;
            case 148:
               var10000 = 142;
               break;
            case 149:
               var10000 = 129;
               break;
            case 150:
               var10000 = 43;
               break;
            case 151:
               var10000 = 128;
               break;
            case 152:
               var10000 = 250;
               break;
            case 153:
               var10000 = 211;
               break;
            case 154:
               var10000 = 138;
               break;
            case 155:
               var10000 = 44;
               break;
            case 156:
               var10000 = 110;
               break;
            case 157:
               var10000 = 55;
               break;
            case 158:
               var10000 = 238;
               break;
            case 159:
               var10000 = 134;
               break;
            case 160:
               var10000 = 114;
               break;
            case 161:
               var10000 = 224;
               break;
            case 162:
               var10000 = 2;
               break;
            case 163:
               var10000 = 72;
               break;
            case 164:
               var10000 = 50;
               break;
            case 165:
               var10000 = 86;
               break;
            case 166:
               var10000 = 113;
               break;
            case 167:
               var10000 = 87;
               break;
            case 168:
               var10000 = 11;
               break;
            case 169:
               var10000 = 149;
               break;
            case 170:
               var10000 = 230;
               break;
            case 171:
               var10000 = 255;
               break;
            case 172:
               var10000 = 168;
               break;
            case 173:
               var10000 = 93;
               break;
            case 174:
               var10000 = 228;
               break;
            case 175:
               var10000 = 146;
               break;
            case 176:
               var10000 = 240;
               break;
            case 177:
               var10000 = 77;
               break;
            case 178:
               var10000 = 66;
               break;
            case 179:
               var10000 = 131;
               break;
            case 180:
               var10000 = 154;
               break;
            case 181:
               var10000 = 181;
               break;
            case 182:
               var10000 = 59;
               break;
            case 183:
               var10000 = 208;
               break;
            case 184:
               var10000 = 115;
               break;
            case 185:
               var10000 = 222;
               break;
            case 186:
               var10000 = 245;
               break;
            case 187:
               var10000 = 223;
               break;
            case 188:
               var10000 = 133;
               break;
            case 189:
               var10000 = 111;
               break;
            case 190:
               var10000 = 241;
               break;
            case 191:
               var10000 = 45;
               break;
            case 192:
               var10000 = 173;
               break;
            case 193:
               var10000 = 217;
               break;
            case 194:
               var10000 = 15;
               break;
            case 195:
               var10000 = 122;
               break;
            case 196:
               var10000 = 13;
               break;
            case 197:
               var10000 = 96;
               break;
            case 198:
               var10000 = 178;
               break;
            case 199:
               var10000 = 213;
               break;
            case 200:
               var10000 = 195;
               break;
            case 201:
               var10000 = 17;
               break;
            case 202:
               var10000 = 78;
               break;
            case 203:
               var10000 = 106;
               break;
            case 204:
               var10000 = 35;
               break;
            case 205:
               var10000 = 8;
               break;
            case 206:
               var10000 = 73;
               break;
            case 207:
               var10000 = 248;
               break;
            case 208:
               var10000 = 214;
               break;
            case 209:
               var10000 = 139;
               break;
            case 210:
               var10000 = 194;
               break;
            case 211:
               var10000 = 20;
               break;
            case 212:
               var10000 = 16;
               break;
            case 213:
               var10000 = 215;
               break;
            case 214:
               var10000 = 25;
               break;
            case 215:
               var10000 = 120;
               break;
            case 216:
               var10000 = 171;
               break;
            case 217:
               var10000 = 23;
               break;
            case 218:
               var10000 = 38;
               break;
            case 219:
               var10000 = 0;
               break;
            case 220:
               var10000 = 1;
               break;
            case 221:
               var10000 = 175;
               break;
            case 222:
               var10000 = 75;
               break;
            case 223:
               var10000 = 37;
               break;
            case 224:
               var10000 = 116;
               break;
            case 225:
               var10000 = 180;
               break;
            case 226:
               var10000 = 147;
               break;
            case 227:
               var10000 = 172;
               break;
            case 228:
               var10000 = 4;
               break;
            case 229:
               var10000 = 32;
               break;
            case 230:
               var10000 = 63;
               break;
            case 231:
               var10000 = 124;
               break;
            case 232:
               var10000 = 65;
               break;
            case 233:
               var10000 = 104;
               break;
            case 234:
               var10000 = 170;
               break;
            case 235:
               var10000 = 177;
               break;
            case 236:
               var10000 = 234;
               break;
            case 237:
               var10000 = 3;
               break;
            case 238:
               var10000 = 123;
               break;
            case 239:
               var10000 = 107;
               break;
            case 240:
               var10000 = 62;
               break;
            case 241:
               var10000 = 204;
               break;
            case 242:
               var10000 = 70;
               break;
            case 243:
               var10000 = 227;
               break;
            case 244:
               var10000 = 196;
               break;
            case 245:
               var10000 = 83;
               break;
            case 246:
               var10000 = 31;
               break;
            case 247:
               var10000 = 254;
               break;
            case 248:
               var10000 = 189;
               break;
            case 249:
               var10000 = 157;
               break;
            case 250:
               var10000 = 182;
               break;
            case 251:
               var10000 = 100;
               break;
            case 252:
               var10000 = 198;
               break;
            case 253:
               var10000 = 118;
               break;
            case 254:
               var10000 = 91;
               break;
            default:
               var10000 = 94;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1243;
      if (n[var3] == null) {
         n[var3] = (int)(m[var3] ^ var1);
      }

      return n[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      byte var28;
      char[] var33;
      String[] var13 = new String[44];
      int var11 = 0;
      String var10 = "½\u0090\f\u000fC`?]\u0004Ï½\u0004\u009cà\u0012\u0003'^ý\u001a\u000fò*(\u0014Ú¤ê\u0015k©|<ïs\u0096\u0083pêñ\u009e\u008b £\t^\u000eÇþQu\u000eg7¯Ü[\b§\"Ò\u0011¤\r\u008dÈ{\u0007\u0099Å\u009b\u000e=\u0018\u0011ÆÉ¾e\u0007¡\u0080\u0088Þ£\u0085\u0093\u0002\u008e¢\u0015ú¨#R\u0018\u0005t¨ì#vÞË\u0000·(m(|\u00ad\u0092\u0002\u0081\u0092\u000e~ðùõ\u0085»k¹E¬\u0085D\u0018\u0095'6}\rÙðä7,\u0083\u00964G\u000b\u0084Ñt\u0000fý6\u008c£¬\u000fö2\u009f¸L%d\u0006\u0016?\u0001BÓ\u0086p\u0002讟咝\u000eÂ\u000eYA\u0093\u0097Þz÷\u007f¼8\u0096w\u000e«\u0000CëÒz\u0081Ã\u0018ã.\u00adm¨\u000b碧嬡觠劋阘辉丆旱件周\u008f\u0003\u0016-n\t抉忖方乪妨契赘¹¨\u0007Ú\u0007\u0006¦¼ºá\tL\u0082¿»Mrr\u0080f\u0012\u0007\u0085ztZ®òNÿ\u0087°\u0084Ýs±Ñ¹\u0093\u000e\u00979\u0095Mõ\u0088LÞWk&\u0018Öï\u0002譒吵\u0006邨拗丁佈攽仞\u00055|):B\u0003垬埸梚\u000e|\u00ad¹^\u008dÎj\u0017ey\u0081þ\u0098Â\rì\u0090\u009c\u0092+¾Ùv\u0015üâJ_\u0002Õ\t\rÊíX=³KÊÈw+®°Ö\u0010\u0097ñ 3.Ö\u0082¤\u009cé/Yà\u0086A´\u000b磄孞覌剤隕轴亷敎什咟I\b\u0014\u0083\u0085*\u008c\u0016\t{\u0004rB¾/\u0002Wé\n1\u0011'ÀZ\u0087YDW\u0016\u000bª>^\tw5ßñª[\u008b\u0003\u0099º*\u0007\u00985¯hGS\u000f\u0007¹\u0089jw1\u0080P\nCÏºô|.ù»ï\r\n宓垴君哰斸乁戀癋復M";
      int var12 = "½\u0090\f\u000fC`?]\u0004Ï½\u0004\u009cà\u0012\u0003'^ý\u001a\u000fò*(\u0014Ú¤ê\u0015k©|<ïs\u0096\u0083pêñ\u009e\u008b £\t^\u000eÇþQu\u000eg7¯Ü[\b§\"Ò\u0011¤\r\u008dÈ{\u0007\u0099Å\u009b\u000e=\u0018\u0011ÆÉ¾e\u0007¡\u0080\u0088Þ£\u0085\u0093\u0002\u008e¢\u0015ú¨#R\u0018\u0005t¨ì#vÞË\u0000·(m(|\u00ad\u0092\u0002\u0081\u0092\u000e~ðùõ\u0085»k¹E¬\u0085D\u0018\u0095'6}\rÙðä7,\u0083\u00964G\u000b\u0084Ñt\u0000fý6\u008c£¬\u000fö2\u009f¸L%d\u0006\u0016?\u0001BÓ\u0086p\u0002讟咝\u000eÂ\u000eYA\u0093\u0097Þz÷\u007f¼8\u0096w\u000e«\u0000CëÒz\u0081Ã\u0018ã.\u00adm¨\u000b碧嬡觠劋阘辉丆旱件周\u008f\u0003\u0016-n\t抉忖方乪妨契赘¹¨\u0007Ú\u0007\u0006¦¼ºá\tL\u0082¿»Mrr\u0080f\u0012\u0007\u0085ztZ®òNÿ\u0087°\u0084Ýs±Ñ¹\u0093\u000e\u00979\u0095Mõ\u0088LÞWk&\u0018Öï\u0002譒吵\u0006邨拗丁佈攽仞\u00055|):B\u0003垬埸梚\u000e|\u00ad¹^\u008dÎj\u0017ey\u0081þ\u0098Â\rì\u0090\u009c\u0092+¾Ùv\u0015üâJ_\u0002Õ\t\rÊíX=³KÊÈw+®°Ö\u0010\u0097ñ 3.Ö\u0082¤\u009cé/Yà\u0086A´\u000b磄孞覌剤隕轴亷敎什咟I\b\u0014\u0083\u0085*\u008c\u0016\t{\u0004rB¾/\u0002Wé\n1\u0011'ÀZ\u0087YDW\u0016\u000bª>^\tw5ßñª[\u008b\u0003\u0099º*\u0007\u00985¯hGS\u000f\u0007¹\u0089jw1\u0080P\nCÏºô|.ù»ï\r\n宓垴君哰斸乁戀癋復M"
         .length();
      W(true);
      char var9 = 2;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 109;
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
                        var65 = 100;
                        break;
                     case 1:
                        var65 = 71;
                        break;
                     case 2:
                        var65 = 122;
                        break;
                     case 3:
                        var65 = 110;
                        break;
                     case 4:
                        var65 = 94;
                        break;
                     case 5:
                        var65 = 8;
                        break;
                     default:
                        var65 = 125;
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
                     d = var13;
                     i = new String[44];
                     long var0 = 5649825827842990381L;
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "I³\u0087\u00163¹\u0089Þ85TjN\u0013û\u0096|ä\u008c÷Ôñ\u0014Í";
                     int var5 = "I³\u0087\u00163¹\u0089Þ85TjN\u0013û\u0096|ä\u008c÷Ôñ\u0014Í".length();
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
                                    m = var6;
                                    n = new Integer[5];
                                    Registry.lookupField(158096528215803383L).set(null, new SimpleDateFormat(a(20051, -17615)));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = ".áÐ£_÷Þhµ\u0012«\r½ÎO5";
                                 var5 = ".áÐ£_÷Þhµ\u0012«\r½ÎO5".length();
                                 var2 = 0;
                           }

                           var28 = var2;
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

                  var10 = "ê·ÏåÒÃuJ\u0013è±[£\u0002稸协";
                  var12 = "ê·ÏåÒÃuJ\u0013è±[£\u0002稸协".length();
                  var9 = '\r';
                  var17 = -1;
            }

            var10000 = 88;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
   private static Object var143;
   private static Object var62;
}





