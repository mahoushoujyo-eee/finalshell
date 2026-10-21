package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.FolderAdapter;
import com.finalshell.ui.listener.CF3;
import com.finalshell.ui.listener.Dw2;
import com.finalshell.ui.listener.VQ;
import com.finalshell.ui.model.Kl4;
import com.finalshell.ui.panel.Address;
import com.finalshell.ui.panel.Connection4;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import javax.swing.DropMode;
import javax.swing.KeyStroke;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class Km2 extends KK {
   Yd2 t;
   Km2 q;
   Kl4 v;
   Connection4 K;
   Point G;
   Point n;
   int m;
   boolean b;
   int N;
   long S;
   Address V;
   boolean E;
   boolean p;
   Dk2 U;
   MT Y;
   FolderAdapter Z;
   public static String O;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public Km2(Address var1, Connection4 var2, boolean var3) {
      String var10000 = U$String();
      super();
      String var4 = var10000;
      Registry.lookupField(304927446900442607L).setInt(this, a(11400, 3823113420712635353L));
      Registry.lookupField(511537538001441169L).setBoolean(this, true);
      Registry.lookupField(258582099073628436L).setBoolean(this, false);
      Registry.lookupField(258582099073628436L).setBoolean(this, var3);
      long var6 = 341385810642373253L;
      Ref.s(341385810642373253L, var1, var6);
      long var8 = 485948784714883245L;
      Ref.s(485948784714883245L, this, var8);
      long var10 = 452258994450109180L;
      Ref.s(452258994450109180L, var2, var10);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionForeground((Color)Registry.lookupField(513155505692963448L).get(null));
      this.setBorder(null);
      this.putClientProperty(a(15572, -30620), Boolean.TRUE);
      this.getInputMap(1).put(KeyStroke.getKeyStroke(a(15177, 1186997957767199775L), 0), a(15575, -9336));
      this.getActionMap().put(a(15573, 1802), new com.finalshell.ui.adapter.Og4(this));
      this.setAutoCreateRowSorter(true);
      this.setDragEnabled(true);
      this.setDropMode(DropMode.ON);
      Yd2 var10004 = new Yd2();
      long var12 = 283836772880554241L;
      Yd2 var11 = var10004;
      Ref.s(283836772880554241L, var11, var12);
      Object var13 = 283836772880554241L;
      this.setTransferHandler((Yd2)Ref.g(283836772880554241L, var13));
      this.setShowGrid(false);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.addMouseListener(new com.finalshell.ui.listener.TO(this, var3, var2, var1));
      this.getSelectionModel().addListSelectionListener(new VQ(this));
      Dk2 var10006 = new Dk2(this);
      long var16 = 331468898228971516L;
      Dk2 var15 = var10006;
      Ref.s(331468898228971516L, var15, var16);
      this.addKeyListener(new Dw2(this));
      MT var10007 = new MT();
      long var18 = 296466958961424512L;
      MT var17 = var10007;
      Ref.s(296466958961424512L, var17, var18);
      Object var19 = 296466958961424512L;
      Object.class.setDefaultEditor(this, (MT)Ref.g(296466958961424512L, var19));
      Object var21 = 296466958961424512L;
      Ref.g(296466958961424512L, var21);
      Object[] var10010 = Registry.packArgs(var2);
      long var24 = 299810560244059762L;
      Object[] var23 = var10010;
      Ref.h(299810560244059762L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      Object var25 = 296466958961424512L;
      Ref.g(296466958961424512L, var25);
      Object[] var10012 = Registry.packArgs(var1);
      long var28 = 121302944456872670L;
      Object[] var27 = var10012;
      Ref.h(121302944456872670L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Object[] var10013 = Registry.emptyArgs();
      long var30 = 482793164836435127L;
      Object[] var29 = var10013;
      Ref.h(482793164836435127L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      if (var4 != null) {
         Ky4.K(new String[4]);
      }
   }

   public void v() {
      Object var1 = 296466958961424512L;
      Ref.g(296466958961424512L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 572698636282201706L;
      Object[] var3 = var10002;
      Ref.h(572698636282201706L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      Object var5 = 151255923303099150L;
      Ref.g(151255923303099150L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 381637303098645879L;
      Object[] var7 = var10004;
      Ref.h(381637303098645879L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Registry.packArgs(this);
      long var9 = 242617331513341262L;
      Ref.h2(242617331513341262L, var9);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object[] var10006 = Registry.emptyArgs();
      long var12 = 161246994049355152L;
      Object[] var11 = var10006;
      Ref.h(161246994049355152L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }

   public void W() {
      this.setAutoCreateRowSorter(true);
      JTableHeader var1 = this.getTableHeader();
      Registry.emptyArgs();
      long var2 = 454647487873911743L;
      Object var10001 = Ref.h2(454647487873911743L, var2);

      try {
         var5 = (Boolean)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      if (var5) {
         var1.addMouseListener(new CF3(this, var1));
      }
   }

   public Object L(int var1) {
      Object var2 = 612091313834066062L;
      Ref.g(612091313834066062L, var2);
      Object[] var10002 = Registry.packArgs(this.convertRowIndexToModel(var1));
      long var5 = 291710787850444005L;
      Object[] var4 = var10002;
      var10002 = Ref.h(291710787850444005L, var4, var5);

      try {
         return (Object)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void Z(String var1) {
      U$String();
      Object var4 = 612091313834066062L;
      Object var10002 = Ref.g(612091313834066062L, var4);
      Object[] var10003 = Registry.packArgs(var1);
      long var7 = 444720235200412258L;
      Object[] var6 = var10003;
      var10003 = Ref.h(444720235200412258L, var6, var7);

      try {
         var12 = (Integer)var10003;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      int var3;
      label35: {
         var3 = var12;
         Object var2 = var10002;
         int var9 = var3;
         if (var2 == null) {
            if (var3 < 0) {
               return;
            }

            var10002 = this;
            if (var2 != null) {
               break label35;
            }

            var3 = this.convertRowIndexToView(var3);
            var9 = var3;
         }

         if (var9 <= -1) {
            return;
         }

         var10002 = this;
      }

      ((Km2)var10002).getSelectionModel().setSelectionInterval(var3, var3);
   }

   public void M(String var1) {
      U$String();
      Object var4 = 612091313834066062L;
      Object var10002 = Ref.g(612091313834066062L, var4);
      Object[] var10003 = Registry.packArgs(var1);
      long var7 = 444720235200412258L;
      Object[] var6 = var10003;
      var10003 = Ref.h(444720235200412258L, var6, var7);

      try {
         var12 = (Integer)var10003;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      int var3 = var12;
      var3 = this.convertRowIndexToView(var3);
      Object var2 = var10002;
      int var10 = var3;
      if (var2 == null) {
         if (var3 < 0) {
            return;
         }

         var10 = var3;
      }

      if (var10 > -1) {
         this.getSelectionModel().addSelectionInterval(var3, var3);
      }
   }

   void L() {
      U$String();
      long var5 = 493953348619799745L;
      Object var7 = 140993979563084749L;
      int var2 = this - ((Point)Ref.g(140993979563084749L, var7)).y;
      Object var9 = 493953348619799745L;
      int var10004 = ((Point)Ref.g(493953348619799745L, var9)).x;
      Object var11 = 140993979563084749L;
      int var3 = this - ((Point)Ref.g(140993979563084749L, var11)).x;
      int var1 = var10004;
      long var13 = 140993979563084749L;
      Object var15 = 493953348619799745L;
      Km2 var10006 = this - ((Point)Ref.g(493953348619799745L, var15)).y;
      if (var1 == null) {
         if (var10006 > 0) {
            label42: {
               float var4 = (float)Math.abs(var3 / var2);
               float var24;
               int var22 = (var24 = var4 - 1.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
               if (var1 == null) {
                  if (var22 < 0) {
                     break label42;
                  }

                  var22 = var3;
               }

               if (var22 > 0) {
               }
            }

            if (var1 == null) {
               return;
            }
         }

         var10006 = this;
         long var17 = 493953348619799745L;
         Object var19 = 140993979563084749L;
         int var10008 = this - ((Point)Ref.g(140993979563084749L, var19)).y;
      }

      if (var1 == null) {
         if (!(var10006 > 0)) {
            return;
         }

         var10006 = Math.abs(var3 / var2);
      }

      float var21 = (float)var10006;
      float var25;
      int var23 = (var25 = var21 - 1.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
      if (var1 == null) {
         if (var23 < 0) {
            return;
         }

         var23 = var3;
      }

      if (var23 > 0) {
      }
   }

   public void v(Kl4 var1) {
      Km2 var2;
      label46: {
         U$String();
         super.setModel(var1);
         long var6 = 612091313834066062L;
         Ref.s(612091313834066062L, var1, var6);
         var2 = this;
         TableColumnModel var3 = this.getColumnModel();
         TableColumnModel var10001 = var3;
         if (this == null) {
            if (var3.getColumnCount() > 4) {
               var3.getColumn(0).setPreferredWidth(a(10200, 6777130106887135370L));
               var3.getColumn(1).setPreferredWidth(a(27567, 6154115867179166961L));
               var3.getColumn(2).setPreferredWidth(a(5393, 658339954746315333L));
               var3.getColumn(3).setPreferredWidth(a(9956, 6534531435084767673L));
               var3.getColumn(4).setPreferredWidth(a(23254, 2747403273456262534L));
               var3.getColumn(5).setPreferredWidth(a(17230, 2425566203760772121L));
               if (this == null) {
                  break label46;
               }
            }

            var3.getColumn(0).setPreferredWidth(a(14788, 7979675979927649947L));
            var3.getColumn(1).setPreferredWidth(a(30899, 6664225706056531936L));
            var3.getColumn(2).setPreferredWidth(a(25258, 7418798406822340095L));
            var10001 = var3;
         }

         var10001.getColumn(3).setPreferredWidth(a(8917, 2535022311460005257L));
      }

      FolderAdapter var10002 = new FolderAdapter();
      long var8 = 151255923303099150L;
      FolderAdapter var7 = var10002;
      Ref.s(151255923303099150L, var7, var8);
      Object var9 = 151255923303099150L;
      Ref.g(151255923303099150L, var9);
      Object var11 = 341385810642373253L;
      Object[] var10005 = Registry.packArgs(Ref.g(341385810642373253L, var11));
      long var14 = 215958703013514754L;
      Object[] var13 = var10005;
      Ref.h(215958703013514754L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      int var4 = 0;

      while (true) {
         if (var4 < this.columnModel.getColumnCount()) {
            this.columnModel.getColumn(var4);
            Object var15 = 151255923303099150L;
            this.setCellRenderer((FolderAdapter)Ref.g(151255923303099150L, var15));
            var4++;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         TableRowSorter var10007 = (TableRowSorter)(Registry.emptyArgs());
         long var18 = 594256069457305342L;
         Object[] var17 = var10007;
         var10007 = Ref.h(594256069457305342L, var17, var18);

         try {
            var10007 = (TableRowSorter)var10007;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         this.setRowSorter(var10007);
         this.getRowSorter().toggleSortOrder(0);
         break;
      }
   }

   protected TableRowSorter w() {
      Object var7 = 612091313834066062L;
      Kl4 var2 = (Kl4)Ref.g(612091313834066062L, var7);
      String var10001 = U$String();
      TableRowSorter var3 = new TableRowSorter<>(var2);
      String var1 = var10001;
      int var4 = 0;

      while (var4 < var2.getColumnCount()) {
         label23: {
            com.finalshell.ui.model.CC var6;
            label22: {
               String var5 = var2.z(var4);
               var6 = new com.finalshell.ui.model.CC(this, var5);
               if (var1 == null) {
                  if (var6 != null) {
                     break label22;
                  }

                  var3.setSortable(var4, false);
               }

               if (var1 == null) {
                  break label23;
               }
            }

            var3.setComparator(var4, var6);
         }

         var4++;
         if (var1 != null) {
            break;
         }
      }

      return var3;
   }

   public Address b() {
      Object var1 = 341385810642373253L;
      return (Address)Ref.g(341385810642373253L, var1);
   }

   public void z(Address var1) {
      long var3 = 341385810642373253L;
      Ref.s(341385810642373253L, var1, var3);
   }

   public Connection4 t() {
      Object var1 = 452258994450109180L;
      return (Connection4)Ref.g(452258994450109180L, var1);
   }

   public void S(Connection4 var1) {
      long var3 = 452258994450109180L;
      Ref.s(452258994450109180L, var1, var3);
   }

   public boolean X() {
      return Registry.lookupField(511537538001441169L).getBoolean(this);
   }

   public void f(boolean var1) {
      Registry.lookupField(511537538001441169L).setBoolean(this, var1);
   }

   public Kl4 U$kl_4() {
      Object var1 = 612091313834066062L;
      return (Kl4)Ref.g(612091313834066062L, var1);
   }

   public Yd2 N() {
      Object var1 = 283836772880554241L;
      return (Yd2)Ref.g(283836772880554241L, var1);
   }

   public void B(Yd2 var1) {
      long var3 = 283836772880554241L;
      Ref.s(283836772880554241L, var1, var3);
   }

   public boolean h() {
      return Registry.lookupField(258582099073628436L).getBoolean(this);
   }

   public void a(boolean var1) {
      Registry.lookupField(258582099073628436L).setBoolean(this, var1);
   }

   public Dk2 D() {
      Object var1 = 331468898228971516L;
      return (Dk2)Ref.g(331468898228971516L, var1);
   }

   public void i(Dk2 var1) {
      long var3 = 331468898228971516L;
      Ref.s(331468898228971516L, var1, var3);
   }

   public void R() {
      long var2 = 283836772880554241L;
      Object var1 = null;
      Ref.s(283836772880554241L, var1, var2);
      long var4 = 485948784714883245L;
      Object var3 = null;
      Ref.s(485948784714883245L, var3, var4);
      long var6 = 612091313834066062L;
      Object var5 = null;
      Ref.s(612091313834066062L, var5, var6);
      long var8 = 452258994450109180L;
      Object var7 = null;
      Ref.s(452258994450109180L, var7, var8);
      long var10 = 140993979563084749L;
      Object var9 = null;
      Ref.s(140993979563084749L, var9, var10);
      long var12 = 493953348619799745L;
      Object var11 = null;
      Ref.s(493953348619799745L, var11, var12);
      long var14 = 341385810642373253L;
      Object var13 = null;
      Ref.s(341385810642373253L, var13, var14);
      long var16 = 331468898228971516L;
      Object var15 = null;
      Ref.s(331468898228971516L, var15, var16);
      long var18 = 296466958961424512L;
      Object var17 = null;
      Ref.s(296466958961424512L, var17, var18);
      long var20 = 151255923303099150L;
      Object var19 = null;
      Ref.s(151255923303099150L, var19, var20);
   }

   public void e() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.AC(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public static void G(String var0) {
      O = var0;
   }

   public static String U$String() {
      return O;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 15573) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 77;
               break;
            case 1:
               var10000 = 105;
               break;
            case 2:
               var10000 = 135;
               break;
            case 3:
               var10000 = 235;
               break;
            case 4:
               var10000 = 80;
               break;
            case 5:
               var10000 = 202;
               break;
            case 6:
               var10000 = 103;
               break;
            case 7:
               var10000 = 191;
               break;
            case 8:
               var10000 = 6;
               break;
            case 9:
               var10000 = 119;
               break;
            case 10:
               var10000 = 112;
               break;
            case 11:
               var10000 = 28;
               break;
            case 12:
               var10000 = 141;
               break;
            case 13:
               var10000 = 13;
               break;
            case 14:
               var10000 = 43;
               break;
            case 15:
               var10000 = 154;
               break;
            case 16:
               var10000 = 251;
               break;
            case 17:
               var10000 = 111;
               break;
            case 18:
               var10000 = 241;
               break;
            case 19:
               var10000 = 100;
               break;
            case 20:
               var10000 = 88;
               break;
            case 21:
               var10000 = 242;
               break;
            case 22:
               var10000 = 10;
               break;
            case 23:
               var10000 = 108;
               break;
            case 24:
               var10000 = 168;
               break;
            case 25:
               var10000 = 173;
               break;
            case 26:
               var10000 = 47;
               break;
            case 27:
               var10000 = 106;
               break;
            case 28:
               var10000 = 21;
               break;
            case 29:
               var10000 = 224;
               break;
            case 30:
               var10000 = 17;
               break;
            case 31:
               var10000 = 238;
               break;
            case 32:
               var10000 = 66;
               break;
            case 33:
               var10000 = 133;
               break;
            case 34:
               var10000 = 89;
               break;
            case 35:
               var10000 = 219;
               break;
            case 36:
               var10000 = 92;
               break;
            case 37:
               var10000 = 142;
               break;
            case 38:
               var10000 = 195;
               break;
            case 39:
               var10000 = 216;
               break;
            case 40:
               var10000 = 25;
               break;
            case 41:
               var10000 = 95;
               break;
            case 42:
               var10000 = 215;
               break;
            case 43:
               var10000 = 239;
               break;
            case 44:
               var10000 = 1;
               break;
            case 45:
               var10000 = 11;
               break;
            case 46:
               var10000 = 72;
               break;
            case 47:
               var10000 = 87;
               break;
            case 48:
               var10000 = 176;
               break;
            case 49:
               var10000 = 96;
               break;
            case 50:
               var10000 = 187;
               break;
            case 51:
               var10000 = 18;
               break;
            case 52:
               var10000 = 245;
               break;
            case 53:
               var10000 = 179;
               break;
            case 54:
               var10000 = 82;
               break;
            case 55:
               var10000 = 150;
               break;
            case 56:
               var10000 = 234;
               break;
            case 57:
               var10000 = 76;
               break;
            case 58:
               var10000 = 8;
               break;
            case 59:
               var10000 = 171;
               break;
            case 60:
               var10000 = 122;
               break;
            case 61:
               var10000 = 220;
               break;
            case 62:
               var10000 = 36;
               break;
            case 63:
               var10000 = 52;
               break;
            case 64:
               var10000 = 183;
               break;
            case 65:
               var10000 = 53;
               break;
            case 66:
               var10000 = 174;
               break;
            case 67:
               var10000 = 75;
               break;
            case 68:
               var10000 = 58;
               break;
            case 69:
               var10000 = 182;
               break;
            case 70:
               var10000 = 214;
               break;
            case 71:
               var10000 = 117;
               break;
            case 72:
               var10000 = 44;
               break;
            case 73:
               var10000 = 180;
               break;
            case 74:
               var10000 = 24;
               break;
            case 75:
               var10000 = 197;
               break;
            case 76:
               var10000 = 181;
               break;
            case 77:
               var10000 = 149;
               break;
            case 78:
               var10000 = 69;
               break;
            case 79:
               var10000 = 29;
               break;
            case 80:
               var10000 = 0;
               break;
            case 81:
               var10000 = 83;
               break;
            case 82:
               var10000 = 120;
               break;
            case 83:
               var10000 = 19;
               break;
            case 84:
               var10000 = 207;
               break;
            case 85:
               var10000 = 212;
               break;
            case 86:
               var10000 = 54;
               break;
            case 87:
               var10000 = 190;
               break;
            case 88:
               var10000 = 158;
               break;
            case 89:
               var10000 = 138;
               break;
            case 90:
               var10000 = 20;
               break;
            case 91:
               var10000 = 139;
               break;
            case 92:
               var10000 = 151;
               break;
            case 93:
               var10000 = 247;
               break;
            case 94:
               var10000 = 118;
               break;
            case 95:
               var10000 = 147;
               break;
            case 96:
               var10000 = 209;
               break;
            case 97:
               var10000 = 161;
               break;
            case 98:
               var10000 = 114;
               break;
            case 99:
               var10000 = 159;
               break;
            case 100:
               var10000 = 143;
               break;
            case 101:
               var10000 = 136;
               break;
            case 102:
               var10000 = 86;
               break;
            case 103:
               var10000 = 204;
               break;
            case 104:
               var10000 = 33;
               break;
            case 105:
               var10000 = 169;
               break;
            case 106:
               var10000 = 172;
               break;
            case 107:
               var10000 = 148;
               break;
            case 108:
               var10000 = 240;
               break;
            case 109:
               var10000 = 45;
               break;
            case 110:
               var10000 = 227;
               break;
            case 111:
               var10000 = 63;
               break;
            case 112:
               var10000 = 50;
               break;
            case 113:
               var10000 = 121;
               break;
            case 114:
               var10000 = 94;
               break;
            case 115:
               var10000 = 101;
               break;
            case 116:
               var10000 = 157;
               break;
            case 117:
               var10000 = 67;
               break;
            case 118:
               var10000 = 232;
               break;
            case 119:
               var10000 = 60;
               break;
            case 120:
               var10000 = 125;
               break;
            case 121:
               var10000 = 184;
               break;
            case 122:
               var10000 = 152;
               break;
            case 123:
               var10000 = 229;
               break;
            case 124:
               var10000 = 213;
               break;
            case 125:
               var10000 = 250;
               break;
            case 126:
               var10000 = 236;
               break;
            case 127:
               var10000 = 70;
               break;
            case 128:
               var10000 = 15;
               break;
            case 129:
               var10000 = 237;
               break;
            case 130:
               var10000 = 84;
               break;
            case 131:
               var10000 = 64;
               break;
            case 132:
               var10000 = 170;
               break;
            case 133:
               var10000 = 255;
               break;
            case 134:
               var10000 = 99;
               break;
            case 135:
               var10000 = 198;
               break;
            case 136:
               var10000 = 98;
               break;
            case 137:
               var10000 = 208;
               break;
            case 138:
               var10000 = 194;
               break;
            case 139:
               var10000 = 160;
               break;
            case 140:
               var10000 = 59;
               break;
            case 141:
               var10000 = 221;
               break;
            case 142:
               var10000 = 211;
               break;
            case 143:
               var10000 = 126;
               break;
            case 144:
               var10000 = 162;
               break;
            case 145:
               var10000 = 91;
               break;
            case 146:
               var10000 = 61;
               break;
            case 147:
               var10000 = 222;
               break;
            case 148:
               var10000 = 30;
               break;
            case 149:
               var10000 = 146;
               break;
            case 150:
               var10000 = 27;
               break;
            case 151:
               var10000 = 7;
               break;
            case 152:
               var10000 = 90;
               break;
            case 153:
               var10000 = 244;
               break;
            case 154:
               var10000 = 132;
               break;
            case 155:
               var10000 = 38;
               break;
            case 156:
               var10000 = 55;
               break;
            case 157:
               var10000 = 39;
               break;
            case 158:
               var10000 = 102;
               break;
            case 159:
               var10000 = 41;
               break;
            case 160:
               var10000 = 205;
               break;
            case 161:
               var10000 = 165;
               break;
            case 162:
               var10000 = 155;
               break;
            case 163:
               var10000 = 2;
               break;
            case 164:
               var10000 = 156;
               break;
            case 165:
               var10000 = 46;
               break;
            case 166:
               var10000 = 113;
               break;
            case 167:
               var10000 = 65;
               break;
            case 168:
               var10000 = 178;
               break;
            case 169:
               var10000 = 127;
               break;
            case 170:
               var10000 = 131;
               break;
            case 171:
               var10000 = 140;
               break;
            case 172:
               var10000 = 206;
               break;
            case 173:
               var10000 = 5;
               break;
            case 174:
               var10000 = 68;
               break;
            case 175:
               var10000 = 110;
               break;
            case 176:
               var10000 = 37;
               break;
            case 177:
               var10000 = 233;
               break;
            case 178:
               var10000 = 14;
               break;
            case 179:
               var10000 = 210;
               break;
            case 180:
               var10000 = 32;
               break;
            case 181:
               var10000 = 130;
               break;
            case 182:
               var10000 = 254;
               break;
            case 183:
               var10000 = 225;
               break;
            case 184:
               var10000 = 62;
               break;
            case 185:
               var10000 = 35;
               break;
            case 186:
               var10000 = 192;
               break;
            case 187:
               var10000 = 175;
               break;
            case 188:
               var10000 = 144;
               break;
            case 189:
               var10000 = 49;
               break;
            case 190:
               var10000 = 226;
               break;
            case 191:
               var10000 = 12;
               break;
            case 192:
               var10000 = 201;
               break;
            case 193:
               var10000 = 163;
               break;
            case 194:
               var10000 = 107;
               break;
            case 195:
               var10000 = 104;
               break;
            case 196:
               var10000 = 246;
               break;
            case 197:
               var10000 = 193;
               break;
            case 198:
               var10000 = 51;
               break;
            case 199:
               var10000 = 249;
               break;
            case 200:
               var10000 = 115;
               break;
            case 201:
               var10000 = 81;
               break;
            case 202:
               var10000 = 109;
               break;
            case 203:
               var10000 = 203;
               break;
            case 204:
               var10000 = 26;
               break;
            case 205:
               var10000 = 23;
               break;
            case 206:
               var10000 = 253;
               break;
            case 207:
               var10000 = 128;
               break;
            case 208:
               var10000 = 3;
               break;
            case 209:
               var10000 = 243;
               break;
            case 210:
               var10000 = 74;
               break;
            case 211:
               var10000 = 153;
               break;
            case 212:
               var10000 = 42;
               break;
            case 213:
               var10000 = 123;
               break;
            case 214:
               var10000 = 231;
               break;
            case 215:
               var10000 = 71;
               break;
            case 216:
               var10000 = 186;
               break;
            case 217:
               var10000 = 16;
               break;
            case 218:
               var10000 = 200;
               break;
            case 219:
               var10000 = 230;
               break;
            case 220:
               var10000 = 218;
               break;
            case 221:
               var10000 = 57;
               break;
            case 222:
               var10000 = 185;
               break;
            case 223:
               var10000 = 228;
               break;
            case 224:
               var10000 = 34;
               break;
            case 225:
               var10000 = 223;
               break;
            case 226:
               var10000 = 9;
               break;
            case 227:
               var10000 = 124;
               break;
            case 228:
               var10000 = 22;
               break;
            case 229:
               var10000 = 137;
               break;
            case 230:
               var10000 = 252;
               break;
            case 231:
               var10000 = 79;
               break;
            case 232:
               var10000 = 56;
               break;
            case 233:
               var10000 = 129;
               break;
            case 234:
               var10000 = 85;
               break;
            case 235:
               var10000 = 78;
               break;
            case 236:
               var10000 = 134;
               break;
            case 237:
               var10000 = 217;
               break;
            case 238:
               var10000 = 97;
               break;
            case 239:
               var10000 = 40;
               break;
            case 240:
               var10000 = 145;
               break;
            case 241:
               var10000 = 188;
               break;
            case 242:
               var10000 = 31;
               break;
            case 243:
               var10000 = 93;
               break;
            case 244:
               var10000 = 189;
               break;
            case 245:
               var10000 = 48;
               break;
            case 246:
               var10000 = 166;
               break;
            case 247:
               var10000 = 177;
               break;
            case 248:
               var10000 = 196;
               break;
            case 249:
               var10000 = 4;
               break;
            case 250:
               var10000 = 116;
               break;
            case 251:
               var10000 = 73;
               break;
            case 252:
               var10000 = 248;
               break;
            case 253:
               var10000 = 164;
               break;
            case 254:
               var10000 = 199;
               break;
            default:
               var10000 = 167;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18263;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      G(null);
      String var10 = "1>K«©\u0018F\"´J\u008b-ö\u0003×+ý©é\u009cØR#\rÛ\u0017Ná^>\u0005\u0007Ê\u008d5q";
      int var12 = "1>K«©\u0018F\"´J\u008b-ö\u0003×+ý©é\u009cØR#\rÛ\u0017Ná^>\u0005\u0007Ê\u008d5q".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 100;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 100;
               var10006 = var14;
            } else {
               var27 = 100;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 100;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 80;
                     break;
                  case 1:
                     var47 = 9;
                     break;
                  case 2:
                     var47 = 22;
                     break;
                  case 3:
                     var47 = 99;
                     break;
                  case 4:
                     var47 = 98;
                     break;
                  case 5:
                     var47 = 78;
                     break;
                  default:
                     var47 = 6;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            c = new String[3];
            long var0 = 1740002235584368541L;
            long[] var6 = new long[12];
            int var3 = 0;
            String var4 = "\u0011\u001cÝó\n>Ëà\u0003Tø\u0099ý·³\u0088Æù\u0010yJ\u0085j2(BÒú\u0010}\u009d\u0088À\u0012C\u009eàâð<K)m¥\u0091ø¯·±Fåçùþ¥h[\u0089epñ\u007fRAÞê)\u0001ö)±\u008a <\u0084g\u0001«c'";
            int var5 = "\u0011\u001cÝó\n>Ëà\u0003Tø\u0099ý·³\u0088Æù\u0010yJ\u0085j2(BÒú\u0010}\u009d\u0088À\u0012C\u009eàâð<K)m¥\u0091ø¯·±Fåçùþ¥h[\u0089epñ\u007fRAÞê)\u0001ö)±\u008a <\u0084g\u0001«c'"
               .length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           d = var6;
                           e = new Integer[12];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "\u0091\u00194Ãy½®£dÜm¸\f'*\u0093";
                        var5 = "\u0091\u00194Ãy½®£dÜm¸\f'*\u0093".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





