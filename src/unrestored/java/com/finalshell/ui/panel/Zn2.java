package com.finalshell.ui.panel;

import com.finalshell.core.Lv4_2;
import com.finalshell.core.NY;
import com.finalshell.core.Vg2;
import com.finalshell.core.XF3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.F4;
import com.finalshell.ui.listener.Gf2;
import com.finalshell.ui.listener.Gw2;
import com.finalshell.ui.model.XG;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;
import net.miginfocom.swing.MigLayout;

public class Zn2 extends Z7 {
   public XG H;
   public XG E;
   public JLabel i;
   public DC v;
   public DC B;
   public JTable t;
   public JTable n;
   public String u;
   public String o;
   public int U;
   public static FileSystemView f;
   public Locale M;
   public Locale W;
   public HashMap T;
   public JComboBox s;
   public HashMap q;
   public static int[] D;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] g;

   public Zn2() {
      Locale var10001 = new Locale(a(-25378, -23720), a(-25406, 13375));
      long var2 = 212343300172665516L;
      Locale var1 = var10001;
      Ref.s(212343300172665516L, var1, var2);
      Locale var10002 = Locale.getDefault();
      long var4 = 629652347688477083L;
      Locale var3 = var10002;
      Ref.s(629652347688477083L, var3, var4);
      HashMap var10003 = new HashMap();
      long var6 = 329000354706190097L;
      HashMap var5 = var10003;
      Ref.s(329000354706190097L, var5, var6);
      HashMap var10004 = new HashMap();
      long var8 = 194328634272721666L;
      HashMap var7 = var10004;
      Ref.s(194328634272721666L, var7, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 384149567237938492L;
      Object[] var9 = var10005;
      Ref.h(384149567237938492L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public void B() {
      Integer var172;
      Object[] var33;
      long var38;
      Object[] var79;
      long var80;
      short var10000 = 567;
      g();
      Registry.emptyArgs();
      long var13 = 270389152141252877L;
      Ref.h2(270389152141252877L, var13);
      Object[] var10004 = Registry.emptyArgs();
      long var16 = 399585344452154517L;
      Object[] var15 = var10004;
      var10004 = Ref.h(399585344452154517L, var15, var16);
      NY var10005 = (NY)(Registry.emptyArgs());
      long var18 = 149968465491171480L;
      Object var17 = var10005;
      var10005 = Ref.h(149968465491171480L, var17, var18);

      try {
         var10005 = (NY)var10005;
      } catch (InvocationTargetException var142) {
         throw var142.getTargetException();
      }

      NY var2 = var10005;
      Object var1 = var10004;
      long var145 = 5165730953117130307L;
      Registry.emptyArgs();
      long var19 = 270389152141252877L;
      Ref.h2(270389152141252877L, var19);
      int var10007 = (int)Registry.emptyArgs();
      long var22 = 121346227073341697L;
      Object var21 = var10007;
      var10007 = (int)Ref.h(121346227073341697L, var21, var22);
      Object[] var10008 = Registry.emptyArgs();
      long var24 = 446211275215857466L;
      Object[] var23 = var10008;
      Ref.h(446211275215857466L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var141) {
         throw var141.getTargetException();
      }

      this.setLayout(new MigLayout(a(-25390, 15414), "", a(-25393, -1145)));
      JPanel var4 = new JPanel();
      var4.setLayout(new MigLayout(a(-25389, 24165), a(-25396, -14432), a(-25402, -1560)));
      this.add(var4, a(-25388, -873));
      JPanel var5 = new JPanel();
      var5.setLayout(new MigLayout(a(-25381, 10872), "", a(-25382, 19079)));
      var4.add(var5, a(-25387, 16448));
      var5.add(new JLabel(a(-25392, 24476)));
      JComboBox var10009 = new JComboBox();
      long var26 = 164806858731042884L;
      JComboBox var25 = var10009;
      Ref.s(164806858731042884L, var25, var26);
      int var6 = a((int)var148, (long)this);

      while (true) {
         if (var6 <= a(26147, 3547907211702680148L)) {
            Object var27 = 164806858731042884L;
            ((JComboBox)Ref.g(164806858731042884L, var27)).addItem("" + var6);
            var6++;
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }

            Ky4.K(new String[5]);
         }

         Object var29 = 164806858731042884L;
         this.add((JComboBox)Ref.g(164806858731042884L, var29), a(-25391, -254));
         JLabel var149 = new JLabel(a(-25403, 28787));
         long var32 = 315260666111066947L;
         JLabel var31 = var149;
         Ref.s(315260666111066947L, var31, var32);
         Object[] var10011 = Registry.emptyArgs();
         long var34 = 570146297653439641L;
         var33 = var10011;
         Ref.h(570146297653439641L, var33, var34);
         Object[] var10012 = Registry.emptyArgs();
         long var36 = 368089303768325505L;
         Object[] var35 = var10012;
         var10012 = Ref.h(368089303768325505L, var35, var36);
         var38 = 162058560421645924L;
         Object var37 = var10012;
         Ref.s(162058560421645924L, var37, var38);
         Object[] var10014 = Registry.emptyArgs();
         long var40 = 381284008132314530L;
         Object[] var39 = var10014;
         Ref.h(381284008132314530L, var39, var40);
         Object[] var10015 = Registry.emptyArgs();
         long var42 = 368089303768325505L;
         Object[] var41 = var10015;
         var10015 = Ref.h(368089303768325505L, var41, var42);
         long var44 = 155460610212598962L;
         Object var43 = var10015;
         Ref.s(155460610212598962L, var43, var44);
         DC var10016 = new DC("");
         long var46 = 539382548805975630L;
         DC var45 = var10016;
         Ref.s(539382548805975630L, var45, var46);
         Object var47 = 539382548805975630L;
         ((DC)Ref.g(539382548805975630L, var47)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
         Object var49 = 539382548805975630L;
         ((DC)Ref.g(539382548805975630L, var49)).setText(a(-25408, 25345));
         Object var51 = 539382548805975630L;
         ((DC)Ref.g(539382548805975630L, var51)).setOpaque(true);
         Object var53 = 539382548805975630L;
         DC var10020 = (DC)Ref.g(539382548805975630L, var53);
         Color var10021;
         XF3 var10024 = (XF3)(Registry.emptyArgs());
         long var56 = 605008073331144146L;
         Object var55 = var10024;
         var10024 = Ref.h(605008073331144146L, var55, var56);

         try {
            var10024 = (XF3)var10024;
         } catch (InvocationTargetException var140) {
            throw var140.getTargetException();
         }

         var2 = (Component)((java.awt.Component) var10024.p());
         var10021.setBackground(var10021);
         Object var57 = 539382548805975630L;
         DC var10022 = (DC)Ref.g(539382548805975630L, var57);
         Color var10023;
         DC var10026 = Registry.emptyArgs();
         long var60 = 307147474512918572L;
         Object var59 = var10026;
         var10026 = Ref.h(307147474512918572L, var59, var60);

         try {
            var10026 = (XF3)var10026;
         } catch (InvocationTargetException var139) {
            throw var139.getTargetException();
         }

         var2 = (NY)((java.awt.Component) var10026.p());
         var10023.setForeground(var10023);
         Object var61 = 539382548805975630L;
         DC var154 = (DC)Ref.g(539382548805975630L, var61);
         var10026 = Registry.emptyArgs();
         long var64 = 570146297653439641L;
         Object var63 = var10026;
         var10026 = (DC)Ref.h(570146297653439641L, var63, var64);
         Font var10027 = (Font)(Registry.emptyArgs());
         long var66 = 439979510325483015L;
         Object var65 = var10027;
         var10027 = Ref.h(439979510325483015L, var65, var66);

         try {
            var10027 = (Font)var10027;
         } catch (InvocationTargetException var138) {
            throw var138.getTargetException();
         }

         var10026.setFont(var10027);
         Object var67 = 539382548805975630L;
         this.add((DC)Ref.g(539382548805975630L, var67), a(-25404, 8041));
         DC var10028 = new DC("");
         long var70 = 358208192808330593L;
         DC var69 = var10028;
         Ref.s(358208192808330593L, var69, var70);
         Object var71 = 358208192808330593L;
         ((DC)Ref.g(358208192808330593L, var71)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
         Object var73 = 358208192808330593L;
         ((DC)Ref.g(358208192808330593L, var73)).setText(a(-25394, 3176));
         Object var75 = 358208192808330593L;
         ((DC)Ref.g(358208192808330593L, var75)).setOpaque(true);
         Object var77 = 358208192808330593L;
         DC var10032 = (DC)Ref.g(358208192808330593L, var77);
         Color var10033;
         XF3 var10036 = (XF3)(Registry.emptyArgs());
         var80 = 605008073331144146L;
         var79 = var10036;
         var10036 = Ref.h(605008073331144146L, var79, var80);

         try {
            var10036 = (XF3)var10036;
         } catch (InvocationTargetException var137) {
            throw var137.getTargetException();
         }

         var2 = (Component)((java.awt.Component) var10036.p());
         var10033.setBackground(var10033);
         Object var81 = 358208192808330593L;
         DC var10034 = (DC)Ref.g(358208192808330593L, var81);
         Color var10035;
         DC var10038 = Registry.emptyArgs();
         long var84 = 307147474512918572L;
         Object var83 = var10038;
         var10038 = Ref.h(307147474512918572L, var83, var84);

         try {
            var10038 = (XF3)var10038;
         } catch (InvocationTargetException var136) {
            throw var136.getTargetException();
         }

         var2 = (NY)((java.awt.Component) var10038.p());
         var10035.setForeground(var10035);
         Object var85 = 358208192808330593L;
         DC var163 = (DC)Ref.g(358208192808330593L, var85);
         var10038 = Registry.emptyArgs();
         long var88 = 381284008132314530L;
         Object var87 = var10038;
         var10038 = (DC)Ref.h(381284008132314530L, var87, var88);
         Font var10039 = (Font)(Registry.emptyArgs());
         long var90 = 439979510325483015L;
         Object var89 = var10039;
         var10039 = Ref.h(439979510325483015L, var89, var90);

         try {
            var10039 = (Font)var10039;
         } catch (InvocationTargetException var135) {
            throw var135.getTargetException();
         }

         var10038.setFont(var10039);
         Object var91 = 358208192808330593L;
         this.add((DC)Ref.g(358208192808330593L, var91), a(-25380, -13834));
         break;
      }

      JPanel var143 = new JPanel();
      var143.setLayout(new MigLayout(a(-25381, 10872), a(-25405, -21998), a(-25382, 19079)));
      this.add(var143, a(-25387, 16448));
      JPanel var7 = new JPanel();
      var7.setLayout(new MigLayout(a(-25381, 10872), "", a(-25385, 18103)));
      JLabel var8 = new JLabel(a(-25379, 4634));
      var8.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
      var7.add(var8, a(-25387, 16448));
      var143.add(var7);
      JTable var10040 = new JTable();
      long var94 = 610095513804326521L;
      JTable var93 = var10040;
      Ref.s(610095513804326521L, var93, var94);
      Object var95 = 610095513804326521L;
      ((JTable)Ref.g(610095513804326521L, var95)).setGridColor(new Color(a(24424, 4021001695593136920L)));
      Object var97 = 610095513804326521L;
      ((JTable)Ref.g(610095513804326521L, var97)).getTableHeader().setVisible(false);
      Object var99 = 610095513804326521L;
      ((JTable)Ref.g(610095513804326521L, var99)).setTableHeader(null);
      Object var101 = 610095513804326521L;
      ((JTable)Ref.g(610095513804326521L, var101)).setSelectionMode(0);
      JScrollPane var10045;
      Object var103 = 610095513804326521L;
      // [VF-super] super((JTable)Ref.g(610095513804326521L, var103));
      JScrollPane var9 = var10045;
      var7.add(var9, a(-25407, 27574));
      JTable var10046 = new JTable();
      long var106 = 589348336963751296L;
      JTable var105 = var10046;
      Ref.s(589348336963751296L, var105, var106);
      Object var107 = 589348336963751296L;
      ((JTable)Ref.g(589348336963751296L, var107)).setGridColor(new Color(a(15675, 4794389092895547715L)));
      Object var109 = 589348336963751296L;
      ((JTable)Ref.g(589348336963751296L, var109)).getTableHeader().setVisible(false);
      Object var111 = 589348336963751296L;
      ((JTable)Ref.g(589348336963751296L, var111)).setTableHeader(null);
      Object var113 = 589348336963751296L;
      ((JTable)Ref.g(589348336963751296L, var113)).setSelectionMode(0);
      JPanel var10 = new JPanel();
      var10.setLayout(new MigLayout(a(-25381, 10872), "", a(-25383, 23553)));
      JLabel var11 = new JLabel(a(-25384, -23555));
      var11.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
      var10.add(var11, a(-25387, 16448));
      var143.add(var10);
      JScrollPane var10051;
      Object var115 = 589348336963751296L;
      // [VF-super] super((JTable)Ref.g(589348336963751296L, var115));
      JScrollPane var12 = var10051;
      var10.add(var12, a(-25401, 21454));
      Object[] var10052 = Registry.emptyArgs();
      long var118 = 512682980948489642L;
      Object[] var117 = var10052;
      Ref.h(512682980948489642L, var117, var118);

      try {
         ;
      } catch (InvocationTargetException var134) {
         throw var134.getTargetException();
      }

      Registry.emptyArgs();
      long var119 = 270389152141252877L;
      Ref.h2(270389152141252877L, var119);
      Object[] var10055 = Registry.emptyArgs();
      long var122 = 306266403902896148L;
      Object[] var121 = var10055;
      var10055 = Ref.h(306266403902896148L, var121, var122);
      Object var10056 = Registry.emptyArgs();
      long var124 = 289260173423359764L;
      Object var123 = var10056;
      var10056 = Ref.h(289260173423359764L, var123, var124);

      try {
         var172 = (Integer)var10056;
      } catch (InvocationTargetException var133) {
         throw var133.getTargetException();
      }

      Registry.lookupField(362807796445170916L).setInt(var10055, var172);
      Object var125 = 164806858731042884L;
      ((JComboBox)Ref.g(164806858731042884L, var125)).setSelectedItem("" + Registry.lookupField(362807796445170916L).getInt(this));
      Object var127 = 164806858731042884L;
      ((JComboBox)Ref.g(164806858731042884L, var127)).addItemListener(new F4(this));
      Object var129 = 610095513804326521L;
      ((JTable)Ref.g(610095513804326521L, var129)).getSelectionModel().addListSelectionListener(new Gf2(this));
      Object var131 = 589348336963751296L;
      ((JTable)Ref.g(589348336963751296L, var131)).getSelectionModel().addListSelectionListener(new Gw2(this));
   }

   public void n() {
      Font var38;
      Object var3 = 162058560421645924L;
      Ref.g(162058560421645924L, var3);
      int var10003 = Registry.lookupField(362807796445170916L).getInt(this);
      Object var5 = 162058560421645924L;
      Registry.packArgs(false, var10003, (int)this, ((String)Ref.g(162058560421645924L, var5)).toLowerCase().endsWith(a(-25386, 2139)));
      long var7 = 519848640695097965L;
      Object var37 = Ref.h2(519848640695097965L, var7);

      try {
         var38 = (Font)var37;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Font var1 = var38;
      Object var9 = 539382548805975630L;
      ((DC)Ref.g(539382548805975630L, var9)).setFont(var1);
      Object var11 = 155460610212598962L;
      Registry.packArgs(Ref.g(155460610212598962L, var11), 0, Registry.lookupField(362807796445170916L).getInt(this), false);
      long var13 = 519848640695097965L;
      Object var10006 = Ref.h2(519848640695097965L, var13);

      try {
         var10006 = (Font)var10006;
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      Font var2 = (Font)var10006;
      Object var15 = 358208192808330593L;
      ((DC)Ref.g(358208192808330593L, var15)).setFont(var2);
      Registry.emptyArgs();
      long var17 = 270389152141252877L;
      Ref.h2(270389152141252877L, var17);
      Object var19 = 162058560421645924L;
      Ref.g(162058560421645924L, var19);
      Object var21 = 155460610212598962L;
      Object[] var10011 = Registry.packArgs(this, Ref.g(155460610212598962L, var21), Registry.lookupField(362807796445170916L).getInt(this));
      long var24 = 440422215469051755L;
      Object[] var23 = var10011;
      Ref.h(440422215469051755L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      Registry.emptyArgs();
      long var25 = 270389152141252877L;
      Ref.h2(270389152141252877L, var25);
      Object var27 = 162058560421645924L;
      Ref.g(162058560421645924L, var27);
      Object var29 = 155460610212598962L;
      Object[] var10015 = Registry.packArgs(this, Ref.g(155460610212598962L, var29), Registry.lookupField(362807796445170916L).getInt(this));
      long var32 = 439863595709949769L;
      Object[] var31 = var10015;
      Ref.h(439863595709949769L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }
   }

   public void L() {
      long var33;
      ArrayList var79;
      boolean var80;
      g();
      XG var10002 = new XG();
      long var11 = 237503863821638476L;
      XG var10 = var10002;
      Ref.s(237503863821638476L, var10, var11);
      Zn2 var1 = this;
      ArrayList var2 = new ArrayList();
      Object[] var77 = Registry.emptyArgs();
      long var13 = 199952364441796844L;
      Object[] var12 = var77;
      var10002 = (XG)Ref.h(199952364441796844L, var12, var13);

      try {
         var79 = (ArrayList)var10002;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      ArrayList var3 = var79;
      var3.addAll(0, var2);
      ArrayList var4 = new ArrayList();
      Iterator var5 = ((ArrayList)Registry.lookupField(614273509583371815L).get(null)).iterator();

      while (true) {
         if (var5.hasNext()) {
            String var6 = (String)var5.next();
            var4.add(var6);
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var5 = var3.iterator();
         break;
      }

      while (true) {
         if (var5.hasNext()) {
            Font var74 = (Font)var5.next();
            if (var1 != null) {
               break;
            }

            Registry.packArgs(var74);
            long var14 = 444318282587707185L;
            Object var10003 = Ref.h2(444318282587707185L, var14);

            try {
               var80 = (Boolean)var10003;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

            label153: {
               if (var1 == null) {
                  if (!var80) {
                     break label153;
                  }

                  var80 = var74.canDisplay((char)a(22259, 2622867176111671941L));
               }

               if (var1 == null && var80) {
                  Object var16 = 629652347688477083L;
                  var74.add(this.getFontName((Locale)Ref.g(629652347688477083L, var16)));
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         Object var18 = 237503863821638476L;
         Ref.g(237503863821638476L, var18);
         Object[] var10004 = Registry.packArgs(var4);
         long var21 = 613199875165811855L;
         Object[] var20 = var10004;
         Ref.h(613199875165811855L, var20, var21);

         try {
            ;
         } catch (InvocationTargetException var70) {
            throw var70.getTargetException();
         }

         Object var22 = 610095513804326521L;
         JTable var10005 = (JTable)Ref.g(610095513804326521L, var22);
         Object var24 = 237503863821638476L;
         this.setModel((XG)Ref.g(237503863821638476L, var24));
         XG var10007 = new XG();
         long var27 = 437330699076589954L;
         XG var26 = var10007;
         Ref.s(437330699076589954L, var26, var27);
         break;
      }

      ArrayList var73 = new ArrayList();
      Iterator var75 = var3.iterator();

      while (true) {
         if (var75.hasNext()) {
            Font var7 = (Font)var75.next();
            if (var1 != null) {
               break;
            }

            label156: {
               boolean var81 = var7.canDisplay((char)a(15413, 6757658378813399110L));
               if (var1 == null) {
                  if (!var81) {
                     break label156;
                  }

                  var81 = var7.canDisplay((char)a(19669, 4518678779032965287L));
               }

               if (var1 == null && var81) {
                  Object var28 = 629652347688477083L;
                  var7.add(this.getFontName((Locale)Ref.g(629652347688477083L, var28)));
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         Object var30 = 437330699076589954L;
         Ref.g(437330699076589954L, var30);
         Object[] var10009 = Registry.packArgs(var73);
         var33 = 613199875165811855L;
         Object[] var32 = var10009;
         Ref.h(613199875165811855L, var32, var33);

         try {
            ;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }

         Object var34 = 589348336963751296L;
         JTable var10010 = (JTable)Ref.g(589348336963751296L, var34);
         Object var36 = 437330699076589954L;
         this.setModel((XG)Ref.g(437330699076589954L, var36));
         Object var38 = 162058560421645924L;
         // [VF-super] super((String)Ref.g(162058560421645924L, var38), 0, a(12367, 8264949169788185662L));
         break;
      }

      Zn2 var76;
      label101: {
         Object var40 = 155460610212598962L;
         // [VF-super] super((String)Ref.g(155460610212598962L, var40), 0, a(515, 1306706182100311670L));
         boolean var8 = false;
         Object var42 = 162058560421645924L;
         Zn2 var10014 = ((String)Ref.g(162058560421645924L, var42)).toLowerCase().endsWith(a(-25377, 2752));
         if (var1 == null) {
            if (var10014 != null) {
               Object var44 = 237503863821638476L;
               Ref.g(237503863821638476L, var44);
               Object var46 = 162058560421645924L;
               Integer var10017 = (Integer)(Registry.packArgs(Ref.g(162058560421645924L, var46)));
               long var49 = 315859001575672678L;
               Object var48 = var10017;
               var10017 = Ref.h(315859001575672678L, var48, var49);

               try {
                  var10017 = (Integer)var10017;
               } catch (InvocationTargetException var68) {
                  throw var68.getTargetException();
               }

               var76 = (Zn2)(var10017);
               if (var1 == null) {
                  break label101;
               }
            }

            var10014 = this;
            Object var50 = 237503863821638476L;
            Ref.g(237503863821638476L, var50);
            Object var52 = 629652347688477083L;
            Object[] var84 = Registry.packArgs(this.getFontName((Locale)Ref.g(629652347688477083L, var52)));
            long var55 = 315859001575672678L;
            Object[] var54 = var84;
            var84 = Ref.h(315859001575672678L, var54, var55);

            try {
            } catch (InvocationTargetException var67) {
               throw var67.getTargetException();
            }
         }

         var76 = var10014;
      }

      Object var56 = 610095513804326521L;
      ((JTable)Ref.g(610095513804326521L, var56)).getSelectionModel().setSelectionInterval((int)var76, (int)var76);
      Object var58 = 437330699076589954L;
      Ref.g(437330699076589954L, var58);
      Object var60 = 629652347688477083L;
      Object var10018 = Registry.packArgs(this.getFontName((Locale)Ref.g(629652347688477083L, var60)));
      long var63 = 315859001575672678L;
      Object var62 = var10018;
      var10018 = Ref.h(315859001575672678L, var62, var63);

      try {
         var87 = (Integer)var10018;
      } catch (InvocationTargetException var66) {
         throw var66.getTargetException();
      }

      int var9 = var87;
      Object var64 = 589348336963751296L;
      ((JTable)Ref.g(589348336963751296L, var64)).getSelectionModel().setSelectionInterval(var9, var9);
      if (Ky4.F$arrString() != null) {
         m(new int[2]);
      }
   }

   public ArrayList C() {
      ArrayList var2 = new ArrayList();
      int[] var10000 = g();
      String[] var3 = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
      int var4 = 0;
      int[] var1 = var10000;

      while (var4 < var3.length) {
         String var5 = var3[var4];
         Font var6 = new Font(var5, 0, a(515, 1306706182100311670L));
         Object var9 = 212343300172665516L;
         String var7 = this.getFontName((Locale)Ref.g(212343300172665516L, var9));
         if (var1 == null) {
            if (!var7.toLowerCase().contains(a(-25395, -2880))) {
               Object var11 = 629652347688477083L;
               String var8 = this.getFontName((Locale)Ref.g(629652347688477083L, var11));
               var2.add(var6);
               Object var13 = 329000354706190097L;
               ((HashMap)Ref.g(329000354706190097L, var13)).put(var8, var7);
            }

            var4++;
         }

         if (var1 != null) {
            break;
         }
      }

      for (String var18 : (ArrayList)Registry.lookupField(614273509583371815L).get(null)) {
         Object var15 = 329000354706190097L;
         ((HashMap)Ref.g(329000354706190097L, var15)).put(var18, var18);
         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   public void K(String var1, String var2, int var3) {
      Registry.emptyArgs();
      long var4 = 270389152141252877L;
      Ref.h2(270389152141252877L, var4);
      Object[] var10002 = Registry.packArgs(var1, var2, var3);
      long var7 = 440422215469051755L;
      Object[] var6 = var10002;
      Ref.h(440422215469051755L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10004 = Registry.packArgs(var1, var2, var3);
      long var11 = 439863595709949769L;
      Object[] var10 = var10004;
      Ref.h(439863595709949769L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   @Override
   public void A(Lv4_2 var1) {
   }

   @Override
   public Vg2 c() {
      return null;
   }

   @Override
   public void F(Lv4_2 var1) {
   }

   static {
      __vfClinit__();
   }

   public static void m(int[] var0) {
      D = var0;
   }

   public static int[] g() {
      return D;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -25386) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 218;
               break;
            case 1:
               var10000 = 79;
               break;
            case 2:
               var10000 = 15;
               break;
            case 3:
               var10000 = 150;
               break;
            case 4:
               var10000 = 45;
               break;
            case 5:
               var10000 = 197;
               break;
            case 6:
               var10000 = 96;
               break;
            case 7:
               var10000 = 191;
               break;
            case 8:
               var10000 = 139;
               break;
            case 9:
               var10000 = 56;
               break;
            case 10:
               var10000 = 43;
               break;
            case 11:
               var10000 = 224;
               break;
            case 12:
               var10000 = 166;
               break;
            case 13:
               var10000 = 229;
               break;
            case 14:
               var10000 = 4;
               break;
            case 15:
               var10000 = 138;
               break;
            case 16:
               var10000 = 60;
               break;
            case 17:
               var10000 = 172;
               break;
            case 18:
               var10000 = 98;
               break;
            case 19:
               var10000 = 245;
               break;
            case 20:
               var10000 = 248;
               break;
            case 21:
               var10000 = 99;
               break;
            case 22:
               var10000 = 209;
               break;
            case 23:
               var10000 = 52;
               break;
            case 24:
               var10000 = 92;
               break;
            case 25:
               var10000 = 84;
               break;
            case 26:
               var10000 = 67;
               break;
            case 27:
               var10000 = 135;
               break;
            case 28:
               var10000 = 113;
               break;
            case 29:
               var10000 = 212;
               break;
            case 30:
               var10000 = 131;
               break;
            case 31:
               var10000 = 169;
               break;
            case 32:
               var10000 = 152;
               break;
            case 33:
               var10000 = 254;
               break;
            case 34:
               var10000 = 111;
               break;
            case 35:
               var10000 = 26;
               break;
            case 36:
               var10000 = 69;
               break;
            case 37:
               var10000 = 184;
               break;
            case 38:
               var10000 = 192;
               break;
            case 39:
               var10000 = 47;
               break;
            case 40:
               var10000 = 204;
               break;
            case 41:
               var10000 = 167;
               break;
            case 42:
               var10000 = 216;
               break;
            case 43:
               var10000 = 247;
               break;
            case 44:
               var10000 = 100;
               break;
            case 45:
               var10000 = 185;
               break;
            case 46:
               var10000 = 22;
               break;
            case 47:
               var10000 = 1;
               break;
            case 48:
               var10000 = 54;
               break;
            case 49:
               var10000 = 142;
               break;
            case 50:
               var10000 = 83;
               break;
            case 51:
               var10000 = 211;
               break;
            case 52:
               var10000 = 195;
               break;
            case 53:
               var10000 = 221;
               break;
            case 54:
               var10000 = 2;
               break;
            case 55:
               var10000 = 198;
               break;
            case 56:
               var10000 = 215;
               break;
            case 57:
               var10000 = 232;
               break;
            case 58:
               var10000 = 25;
               break;
            case 59:
               var10000 = 243;
               break;
            case 60:
               var10000 = 140;
               break;
            case 61:
               var10000 = 86;
               break;
            case 62:
               var10000 = 124;
               break;
            case 63:
               var10000 = 50;
               break;
            case 64:
               var10000 = 235;
               break;
            case 65:
               var10000 = 119;
               break;
            case 66:
               var10000 = 112;
               break;
            case 67:
               var10000 = 31;
               break;
            case 68:
               var10000 = 132;
               break;
            case 69:
               var10000 = 147;
               break;
            case 70:
               var10000 = 153;
               break;
            case 71:
               var10000 = 122;
               break;
            case 72:
               var10000 = 217;
               break;
            case 73:
               var10000 = 126;
               break;
            case 74:
               var10000 = 193;
               break;
            case 75:
               var10000 = 101;
               break;
            case 76:
               var10000 = 17;
               break;
            case 77:
               var10000 = 38;
               break;
            case 78:
               var10000 = 7;
               break;
            case 79:
               var10000 = 146;
               break;
            case 80:
               var10000 = 174;
               break;
            case 81:
               var10000 = 82;
               break;
            case 82:
               var10000 = 97;
               break;
            case 83:
               var10000 = 115;
               break;
            case 84:
               var10000 = 154;
               break;
            case 85:
               var10000 = 252;
               break;
            case 86:
               var10000 = 249;
               break;
            case 87:
               var10000 = 39;
               break;
            case 88:
               var10000 = 102;
               break;
            case 89:
               var10000 = 164;
               break;
            case 90:
               var10000 = 196;
               break;
            case 91:
               var10000 = 74;
               break;
            case 92:
               var10000 = 118;
               break;
            case 93:
               var10000 = 176;
               break;
            case 94:
               var10000 = 210;
               break;
            case 95:
               var10000 = 182;
               break;
            case 96:
               var10000 = 228;
               break;
            case 97:
               var10000 = 89;
               break;
            case 98:
               var10000 = 203;
               break;
            case 99:
               var10000 = 91;
               break;
            case 100:
               var10000 = 14;
               break;
            case 101:
               var10000 = 28;
               break;
            case 102:
               var10000 = 239;
               break;
            case 103:
               var10000 = 240;
               break;
            case 104:
               var10000 = 253;
               break;
            case 105:
               var10000 = 181;
               break;
            case 106:
               var10000 = 183;
               break;
            case 107:
               var10000 = 85;
               break;
            case 108:
               var10000 = 80;
               break;
            case 109:
               var10000 = 168;
               break;
            case 110:
               var10000 = 62;
               break;
            case 111:
               var10000 = 202;
               break;
            case 112:
               var10000 = 58;
               break;
            case 113:
               var10000 = 134;
               break;
            case 114:
               var10000 = 148;
               break;
            case 115:
               var10000 = 66;
               break;
            case 116:
               var10000 = 13;
               break;
            case 117:
               var10000 = 162;
               break;
            case 118:
               var10000 = 120;
               break;
            case 119:
               var10000 = 34;
               break;
            case 120:
               var10000 = 81;
               break;
            case 121:
               var10000 = 149;
               break;
            case 122:
               var10000 = 123;
               break;
            case 123:
               var10000 = 95;
               break;
            case 124:
               var10000 = 133;
               break;
            case 125:
               var10000 = 242;
               break;
            case 126:
               var10000 = 9;
               break;
            case 127:
               var10000 = 19;
               break;
            case 128:
               var10000 = 94;
               break;
            case 129:
               var10000 = 30;
               break;
            case 130:
               var10000 = 21;
               break;
            case 131:
               var10000 = 226;
               break;
            case 132:
               var10000 = 158;
               break;
            case 133:
               var10000 = 103;
               break;
            case 134:
               var10000 = 137;
               break;
            case 135:
               var10000 = 175;
               break;
            case 136:
               var10000 = 255;
               break;
            case 137:
               var10000 = 208;
               break;
            case 138:
               var10000 = 108;
               break;
            case 139:
               var10000 = 179;
               break;
            case 140:
               var10000 = 36;
               break;
            case 141:
               var10000 = 157;
               break;
            case 142:
               var10000 = 178;
               break;
            case 143:
               var10000 = 160;
               break;
            case 144:
               var10000 = 18;
               break;
            case 145:
               var10000 = 73;
               break;
            case 146:
               var10000 = 68;
               break;
            case 147:
               var10000 = 88;
               break;
            case 148:
               var10000 = 180;
               break;
            case 149:
               var10000 = 51;
               break;
            case 150:
               var10000 = 163;
               break;
            case 151:
               var10000 = 251;
               break;
            case 152:
               var10000 = 8;
               break;
            case 153:
               var10000 = 127;
               break;
            case 154:
               var10000 = 87;
               break;
            case 155:
               var10000 = 151;
               break;
            case 156:
               var10000 = 44;
               break;
            case 157:
               var10000 = 110;
               break;
            case 158:
               var10000 = 130;
               break;
            case 159:
               var10000 = 11;
               break;
            case 160:
               var10000 = 61;
               break;
            case 161:
               var10000 = 200;
               break;
            case 162:
               var10000 = 189;
               break;
            case 163:
               var10000 = 35;
               break;
            case 164:
               var10000 = 227;
               break;
            case 165:
               var10000 = 207;
               break;
            case 166:
               var10000 = 63;
               break;
            case 167:
               var10000 = 53;
               break;
            case 168:
               var10000 = 237;
               break;
            case 169:
               var10000 = 105;
               break;
            case 170:
               var10000 = 206;
               break;
            case 171:
               var10000 = 107;
               break;
            case 172:
               var10000 = 20;
               break;
            case 173:
               var10000 = 109;
               break;
            case 174:
               var10000 = 230;
               break;
            case 175:
               var10000 = 170;
               break;
            case 176:
               var10000 = 143;
               break;
            case 177:
               var10000 = 156;
               break;
            case 178:
               var10000 = 46;
               break;
            case 179:
               var10000 = 136;
               break;
            case 180:
               var10000 = 40;
               break;
            case 181:
               var10000 = 24;
               break;
            case 182:
               var10000 = 165;
               break;
            case 183:
               var10000 = 141;
               break;
            case 184:
               var10000 = 76;
               break;
            case 185:
               var10000 = 23;
               break;
            case 186:
               var10000 = 70;
               break;
            case 187:
               var10000 = 234;
               break;
            case 188:
               var10000 = 155;
               break;
            case 189:
               var10000 = 177;
               break;
            case 190:
               var10000 = 173;
               break;
            case 191:
               var10000 = 49;
               break;
            case 192:
               var10000 = 213;
               break;
            case 193:
               var10000 = 16;
               break;
            case 194:
               var10000 = 93;
               break;
            case 195:
               var10000 = 10;
               break;
            case 196:
               var10000 = 145;
               break;
            case 197:
               var10000 = 238;
               break;
            case 198:
               var10000 = 187;
               break;
            case 199:
               var10000 = 32;
               break;
            case 200:
               var10000 = 55;
               break;
            case 201:
               var10000 = 236;
               break;
            case 202:
               var10000 = 59;
               break;
            case 203:
               var10000 = 64;
               break;
            case 204:
               var10000 = 42;
               break;
            case 205:
               var10000 = 104;
               break;
            case 206:
               var10000 = 71;
               break;
            case 207:
               var10000 = 231;
               break;
            case 208:
               var10000 = 117;
               break;
            case 209:
               var10000 = 0;
               break;
            case 210:
               var10000 = 201;
               break;
            case 211:
               var10000 = 106;
               break;
            case 212:
               var10000 = 250;
               break;
            case 213:
               var10000 = 27;
               break;
            case 214:
               var10000 = 128;
               break;
            case 215:
               var10000 = 5;
               break;
            case 216:
               var10000 = 225;
               break;
            case 217:
               var10000 = 159;
               break;
            case 218:
               var10000 = 6;
               break;
            case 219:
               var10000 = 72;
               break;
            case 220:
               var10000 = 223;
               break;
            case 221:
               var10000 = 205;
               break;
            case 222:
               var10000 = 194;
               break;
            case 223:
               var10000 = 190;
               break;
            case 224:
               var10000 = 12;
               break;
            case 225:
               var10000 = 116;
               break;
            case 226:
               var10000 = 188;
               break;
            case 227:
               var10000 = 219;
               break;
            case 228:
               var10000 = 3;
               break;
            case 229:
               var10000 = 90;
               break;
            case 230:
               var10000 = 41;
               break;
            case 231:
               var10000 = 77;
               break;
            case 232:
               var10000 = 161;
               break;
            case 233:
               var10000 = 220;
               break;
            case 234:
               var10000 = 199;
               break;
            case 235:
               var10000 = 144;
               break;
            case 236:
               var10000 = 37;
               break;
            case 237:
               var10000 = 29;
               break;
            case 238:
               var10000 = 75;
               break;
            case 239:
               var10000 = 57;
               break;
            case 240:
               var10000 = 244;
               break;
            case 241:
               var10000 = 246;
               break;
            case 242:
               var10000 = 121;
               break;
            case 243:
               var10000 = 241;
               break;
            case 244:
               var10000 = 65;
               break;
            case 245:
               var10000 = 48;
               break;
            case 246:
               var10000 = 129;
               break;
            case 247:
               var10000 = 233;
               break;
            case 248:
               var10000 = 171;
               break;
            case 249:
               var10000 = 222;
               break;
            case 250:
               var10000 = 78;
               break;
            case 251:
               var10000 = 114;
               break;
            case 252:
               var10000 = 33;
               break;
            case 253:
               var10000 = 214;
               break;
            case 254:
               var10000 = 125;
               break;
            default:
               var10000 = 186;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23664;
      if (g[var3] == null) {
         g[var3] = (int)(d[var3] ^ var1);
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[28];
      int var11 = 0;
      String var10 = "Åx\u0016¾\u0005*\u0085q0Ã\u0004ÇS1\u000b\u0004\u001d\"j%\u0012\u001f,ånöVc\u0091Ü4±± VgYÚ\u0012\u000e\u00040\u0086í\u009a&î\u009e}ä\u0086¹õV\u0004嬚俛姨屠\u001b\\uG³K\u008d]ÒÅgÄÚu0w\u008e ¹î\u0002Õ;O\\\u001fP\u008e\u0002 f\u0004\u008e \u007fµ\u0018\u009b\u0092¿OT\u0012²#¿\u0011Ü\r Ó¯Òj[\u0091\u000f\u009d\u0087Yh\u0004艷攣孇佭\u0005?ÎÖY\u0092\u000eÕ¦¼?Ý|\u0006Õ`\u008d%\u0094\u0081ó\u0004争敳察佧\u0005Æ\u001dì#p\u0005q¾\u001fW«\u0019Ú\u0083\u0097mQV\u0012£·P\u0017%mï%\u001c]ºÌzùu¼\u0099¶\u001dÙ³÷k]\u0096\u0093³\u009b\u0003XO0\u009b½Û(zÙ+\u0094\u0003xøs6\u0094Y©\u0002顧褌\u00027\u001c\u0006x\u0081U\u0018$ì\u001cj\"im*ÌBjH´ÌªÇt¡`o¯`\u0016¡\u0092º-\u0014\f\t \u0019÷\u00882\fåz\u0084&eàM3&-LDp±i\u001bMY*\u001cd\tÇ绹稂仮时嬣依頪触\u0006?\u009f×\u0018\u0095I";
      int var12 = "Åx\u0016¾\u0005*\u0085q0Ã\u0004ÇS1\u000b\u0004\u001d\"j%\u0012\u001f,ånöVc\u0091Ü4±± VgYÚ\u0012\u000e\u00040\u0086í\u009a&î\u009e}ä\u0086¹õV\u0004嬚俛姨屠\u001b\\uG³K\u008d]ÒÅgÄÚu0w\u008e ¹î\u0002Õ;O\\\u001fP\u008e\u0002 f\u0004\u008e \u007fµ\u0018\u009b\u0092¿OT\u0012²#¿\u0011Ü\r Ó¯Òj[\u0091\u000f\u009d\u0087Yh\u0004艷攣孇佭\u0005?ÎÖY\u0092\u000eÕ¦¼?Ý|\u0006Õ`\u008d%\u0094\u0081ó\u0004争敳察佧\u0005Æ\u001dì#p\u0005q¾\u001fW«\u0019Ú\u0083\u0097mQV\u0012£·P\u0017%mï%\u001c]ºÌzùu¼\u0099¶\u001dÙ³÷k]\u0096\u0093³\u009b\u0003XO0\u009b½Û(zÙ+\u0094\u0003xøs6\u0094Y©\u0002顧褌\u00027\u001c\u0006x\u0081U\u0018$ì\u001cj\"im*ÌBjH´ÌªÇt¡`o¯`\u0016¡\u0092º-\u0014\f\t \u0019÷\u00882\fåz\u0084&eàM3&-LDp±i\u001bMY*\u001cd\tÇ绹稂仮时嬣依頪触\u0006?\u009f×\u0018\u0095I"
         .length();
      m(null);
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 90;
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
                        var65 = 9;
                        break;
                     case 1:
                        var65 = 51;
                        break;
                     case 2:
                        var65 = 1;
                        break;
                     case 3:
                        var65 = 90;
                        break;
                     case 4:
                        var65 = 18;
                        break;
                     case 5:
                        var65 = 123;
                        break;
                     default:
                        var65 = 52;
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
                     b = new String[28];
                     long var0 = 8114026040190838379L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "ý3o\u001bd\u0006i¿\bæ¶5x:JYûx\u000f°\u0019\u0083©\u0085ÂU2laE\u0010ÐNÃ\u00ad©N\u0011x 5YÎ\u0080þ=x\u0011ÖdMÃZó,\u008f";
                     int var5 = "ý3o\u001bd\u0006i¿\bæ¶5x:JYûx\u000f°\u0019\u0083©\u0085ÂU2laE\u0010ÐNÃ\u00ad©N\u0011x 5YÎ\u0080þ=x\u0011ÖdMÃZó,\u008f"
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
                                    d = var6;
                                    g = new Integer[9];
                                    Registry.lookupField(211870330455107755L).set(null, FileSystemView.getFileSystemView());
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ö9Î{6M\u009c\u001b@é}\u001aâ\u001f\u000bä";
                                 var5 = "ö9Î{6M\u009c\u001b@é}\u001aâ\u001f\u000bä".length();
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

                  var10 = "ß·2I0×\u0099\u001fÂ\r\u008d\u0011®½0Fè\u001d\nÈ7 ü\u008f\u0084ØG\u0080¡";
                  var12 = "ß·2I0×\u0099\u001fÂ\r\u008d\u0011®½0Fè\u001d\nÈ7 ü\u008f\u0084ØG\u0080¡".length();
                  var9 = 18;
                  var17 = -1;
            }

            var10000 = 111;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
   private static int var148;
}





