package com.finalshell.ui.panel;

import com.finalshell.core.Fb2;
import com.finalshell.core.LD3_2;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Ty4;
import com.finalshell.core.Vg2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.EditProxyServerDialog;
import com.finalshell.ui.listener.Co4;
import com.finalshell.ui.listener.ConfirmDeleteListener;
import com.finalshell.ui.listener.LU;
import com.finalshell.ui.model.C62;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class ProxySelectionPanel extends Z7 implements Fb2 {
   public C62 q;
   public com.finalshell.core.Yy2 E;
   public static Ky4[] p;
   public static String[] a;
   public static String[] b;

   public ProxySelectionPanel() {
      super();
      com.finalshell.core.Yy2 var11;
      long var20;
      this.add(new JLabel(""), a(25972, 4162));
      this.add(new JLabel(a(25968, -23693)), a(25969, -22869));
      C62 var10001 = new C62();
      long var8 = 318973214616786715L;
      C62 var7 = var10001;
      Ref.s(318973214616786715L, var7, var8);
      com.finalshell.core.Yy2 var10003;
      Object var9 = 318973214616786715L;
      // [VF-super] super(this, (C62)Ref.g(318973214616786715L, var9));
      long var12 = 155517873227409293L;
      var11 = var10003;
      Ref.s(155517873227409293L, var11, var12);
      t();
      Object var13 = 155517873227409293L;
      com.finalshell.core.Yy2 var10005 = (com.finalshell.core.Yy2)Ref.g(155517873227409293L, var13);
      Object var15 = 318973214616786715L;
      this.setModel((C62)Ref.g(318973214616786715L, var15));
      JScrollPane var10006;
      Object var17 = 155517873227409293L;
      super((com.finalshell.core.Yy2)Ref.g(155517873227409293L, var17));
      JScrollPane var2 = var10006;
      this.add(var2, a(25973, 21202));
      var2.addMouseListener(new LU(this));
      JPanel var3 = new JPanel(new MigLayout(a(25981, -15034)));
      this.add(var3, a(25980, 21597));
      JButton var4 = new JButton(a(25975, -20813));
      var3.add(var4);
      var4.addActionListener(new Co4(this));
      JButton var5 = new JButton(a(25970, 16506));
      var3.add(var5);
      var5.addActionListener(new com.finalshell.ui.listener.O(this));
      JButton var6 = new JButton(a(25974, 16913));
      var3.add(var6);
      var6.addActionListener(new ConfirmDeleteListener(this));
      this.add(new JLabel(a(25971, 21404)), a(25980, 21597));
      Object[] var10007 = Registry.emptyArgs();
      var20 = 233983325047014865L;
      Object[] var19 = var10007;
      Ref.h(233983325047014865L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      Registry.emptyArgs();
      long var21 = 270389152141252877L;
      Ref.h2(270389152141252877L, var21);
      Object[] var10009 = Registry.packArgs(this);
      long var24 = 459969040127248336L;
      Object[] var23 = var10009;
      Ref.h(459969040127248336L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      if (Ky4.F$arrString() != null) {
         P(new Ky4[3]);
      }
   }

   @Override
   public void O(Ty4 var1) {
      Ky4[] var2 = t();
      Integer var10001 = (Integer)(Registry.emptyArgs());
      long var4 = 542590257020999358L;
      Object var3 = var10001;
      var10001 = Ref.h(542590257020999358L, var3, var4);

      try {
         var10001 = (Integer)var10001;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      label38: {
         int var10002 = Registry.lookupField(164254360187462884L).getInt(null);
         if (var2 == null) {
            if (var10001 == var10002) {
               break label38;
            }

            var10001 = (Integer)(var1);
            Object[] var14 = Registry.emptyArgs();
            long var6 = 542590257020999358L;
            Object[] var5 = var14;
            Object var15 = Ref.h(542590257020999358L, var5, var6);

            try {
               var10002 = (Integer)var15;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            Registry.lookupField(213416441008748074L).getInt(null);
         }

         if (var10001 != var10002) {
            return;
         }
      }

      Object[] var16 = Registry.emptyArgs();
      long var8 = 233983325047014865L;
      Object[] var7 = var16;
      Ref.h(233983325047014865L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void S() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.packArgs(this);
      long var4 = 390922222656242580L;
      Object[] var3 = var10002;
      Ref.h(390922222656242580L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void Z(String var1) {
      long var11;
      Object[] var20;
      t();
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 306266403902896148L;
      Object[] var8 = var10003;
      var10003 = Ref.h(306266403902896148L, var8, var9);
      String var10004 = Registry.emptyArgs();
      var11 = 401275417195122293L;
      Object var10 = var10004;
      var10004 = Ref.h(401275417195122293L, var10, var11);

      try {
         var10004 = (ArrayList)var10004;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      ArrayList var3 = var10004;
      Object var2 = var10003;
      Iterator var4 = var3.iterator();

      while (true) {
         label96:
         if (var4.hasNext()) {
            LD3_2 var5 = (LD3_2)var4.next();
            if (var2 != null) {
               break;
            }

            var10004 = Registry.emptyArgs();
            long var13 = 194080076253066315L;
            Object var12 = var10004;
            var10004 = Ref.h(194080076253066315L, var12, var13);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var38) {
               throw var38.getTargetException();
            }

            label104: {
               boolean var47 = var10004.equals(var1);
               if (var2 == null) {
                  if (!var47) {
                     break label104;
                  }

                  var3.remove(var5);
               }

               Registry.emptyArgs();
               long var14 = 270389152141252877L;
               Ref.h2(270389152141252877L, var14);
               Object[] var10006 = Registry.emptyArgs();
               long var17 = 445913128761932285L;
               Object[] var16 = var10006;
               Ref.h(445913128761932285L, var16, var17);
               Object[] var10008 = Registry.emptyArgs();
               long var19 = 194080076253066315L;
               Object[] var18 = var10008;
               Ref.h(194080076253066315L, var18, var19);
               Object[] var10010 = Registry.emptyArgs();
               long var21 = 286931176286176762L;
               var20 = var10010;
               Object[] var10009 = Registry.packArgs(var5, Ref.h(286931176286176762L, var20, var21), Registry.lookupField(216428498330897051L).getInt(null));
               long var23 = 200839191777796316L;
               Object[] var22 = var10009;
               Ref.h(200839191777796316L, var22, var23);

               try {
                  ;
               } catch (InvocationTargetException var37) {
                  throw var37.getTargetException();
               }

               if (var2 == null) {
                  break label96;
               }
            }

            if (var2 == null) {
               continue;
            }
         }

         Object[] var48 = Registry.emptyArgs();
         long var25 = 233983325047014865L;
         Object[] var24 = var48;
         Ref.h(233983325047014865L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var36) {
            throw var36.getTargetException();
         }

         Registry.emptyArgs();
         long var26 = 270389152141252877L;
         Ref.h2(270389152141252877L, var26);
         Object[] var49 = Registry.emptyArgs();
         long var29 = 578864097947885485L;
         Object[] var28 = var49;
         Ref.h(578864097947885485L, var28, var29);

         try {
            break;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }
      }

      Ty4 var40 = new Ty4(Registry.lookupField(164254360187462884L).getInt(null));
      Registry.emptyArgs();
      long var30 = 270389152141252877L;
      Ref.h2(270389152141252877L, var30);
      Object[] var50 = Registry.packArgs(var40);
      long var33 = 473928376202613579L;
      Object[] var32 = var50;
      Ref.h(473928376202613579L, var32, var33);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }
   }

   public void c(LD3_2 var1) {
      new EditProxyServerDialog(this, var1, true);
   }

   public void F() {
      long var11;
      ArrayList var1 = new ArrayList();
      LD3_2 var2 = new LD3_2();
      Object[] var10001 = Registry.packArgs(Registry.lookupField(339184634502945253L).getInt(null));
      long var5 = 225283838617508237L;
      Object[] var4 = var10001;
      Ref.h(225283838617508237L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Object[] var10002 = Registry.packArgs("0");
      long var7 = 457580554385758333L;
      Object[] var6 = var10002;
      Ref.h(457580554385758333L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var1.add(var2);
      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10004 = Registry.emptyArgs();
      var11 = 306266403902896148L;
      Object[] var10 = var10004;
      Ref.h(306266403902896148L, var10, var11);
      ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
      long var13 = 401275417195122293L;
      Object var12 = var10005;
      var10005 = Ref.h(401275417195122293L, var12, var13);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      ArrayList var3 = var10005;
      var1.addAll(var3);
      Object var14 = 318973214616786715L;
      Ref.g(318973214616786715L, var14);
      Object[] var10007 = Registry.packArgs(var1);
      long var17 = 152570464475277546L;
      Object[] var16 = var10007;
      Ref.h(152570464475277546L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }
   }

   public void l(String var1) {
      Object var3 = 318973214616786715L;
      Ref.g(318973214616786715L, var3);
      Object var10002 = Registry.packArgs(var1);
      long var6 = 185075583183789006L;
      Object var5 = var10002;
      var10002 = Ref.h(185075583183789006L, var5, var6);

      try {
         var11 = (Integer)var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      int var2 = var11;
      if (var2 > -1) {
         Object var7 = 155517873227409293L;
         ((com.finalshell.core.Yy2)Ref.g(155517873227409293L, var7)).getSelectionModel().setSelectionInterval(var2, var2);
      }
   }

   @Override
   public void A(Lv4_2 var1) {
      Object var2 = 318973214616786715L;
      Ref.g(318973214616786715L, var2);
      Object[] var10003 = Registry.emptyArgs();
      long var5 = 603433831346798442L;
      Object[] var4 = var10003;
      var10003 = Registry.packArgs(Ref.h(603433831346798442L, var4, var5));
      long var7 = 263380209102442608L;
      Object[] var6 = var10003;
      Ref.h(263380209102442608L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object[] var10004 = Registry.emptyArgs();
      long var9 = 233983325047014865L;
      Object[] var8 = var10004;
      Ref.h(233983325047014865L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   @Override
   public Vg2 c() {
      Vg2 var1 = new Vg2();
      Object[] var10001 = Registry.packArgs(this);
      long var3 = 143039821796059343L;
      Object[] var2 = var10001;
      Ref.h(143039821796059343L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var10002 = Registry.packArgs(true);
      long var5 = 301723499838963718L;
      Object[] var4 = var10002;
      Ref.h(301723499838963718L, var4, var5);

      try {
         return var1;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   @Override
   public void F(Lv4_2 var1) {
      Object var2 = 318973214616786715L;
      Ref.g(318973214616786715L, var2);
      Object[] var10003 = Registry.emptyArgs();
      long var5 = 254699288696797633L;
      Object[] var4 = var10003;
      var10003 = Registry.packArgs(Ref.h(254699288696797633L, var4, var5));
      long var7 = 565669029343447325L;
      Object[] var6 = var10003;
      Ref.h(565669029343447325L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public static void P(Ky4[] var0) {
      p = var0;
   }

   public static Ky4[] t() {
      return p;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 25972) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 162;
               break;
            case 1:
               var10000 = 24;
               break;
            case 2:
               var10000 = 15;
               break;
            case 3:
               var10000 = 109;
               break;
            case 4:
               var10000 = 121;
               break;
            case 5:
               var10000 = 143;
               break;
            case 6:
               var10000 = 229;
               break;
            case 7:
               var10000 = 39;
               break;
            case 8:
               var10000 = 225;
               break;
            case 9:
               var10000 = 204;
               break;
            case 10:
               var10000 = 20;
               break;
            case 11:
               var10000 = 250;
               break;
            case 12:
               var10000 = 119;
               break;
            case 13:
               var10000 = 79;
               break;
            case 14:
               var10000 = 178;
               break;
            case 15:
               var10000 = 150;
               break;
            case 16:
               var10000 = 188;
               break;
            case 17:
               var10000 = 88;
               break;
            case 18:
               var10000 = 166;
               break;
            case 19:
               var10000 = 232;
               break;
            case 20:
               var10000 = 74;
               break;
            case 21:
               var10000 = 251;
               break;
            case 22:
               var10000 = 124;
               break;
            case 23:
               var10000 = 196;
               break;
            case 24:
               var10000 = 98;
               break;
            case 25:
               var10000 = 99;
               break;
            case 26:
               var10000 = 19;
               break;
            case 27:
               var10000 = 56;
               break;
            case 28:
               var10000 = 227;
               break;
            case 29:
               var10000 = 151;
               break;
            case 30:
               var10000 = 80;
               break;
            case 31:
               var10000 = 200;
               break;
            case 32:
               var10000 = 112;
               break;
            case 33:
               var10000 = 161;
               break;
            case 34:
               var10000 = 163;
               break;
            case 35:
               var10000 = 26;
               break;
            case 36:
               var10000 = 96;
               break;
            case 37:
               var10000 = 75;
               break;
            case 38:
               var10000 = 193;
               break;
            case 39:
               var10000 = 158;
               break;
            case 40:
               var10000 = 157;
               break;
            case 41:
               var10000 = 217;
               break;
            case 42:
               var10000 = 230;
               break;
            case 43:
               var10000 = 244;
               break;
            case 44:
               var10000 = 0;
               break;
            case 45:
               var10000 = 133;
               break;
            case 46:
               var10000 = 110;
               break;
            case 47:
               var10000 = 116;
               break;
            case 48:
               var10000 = 25;
               break;
            case 49:
               var10000 = 42;
               break;
            case 50:
               var10000 = 239;
               break;
            case 51:
               var10000 = 195;
               break;
            case 52:
               var10000 = 64;
               break;
            case 53:
               var10000 = 10;
               break;
            case 54:
               var10000 = 57;
               break;
            case 55:
               var10000 = 205;
               break;
            case 56:
               var10000 = 43;
               break;
            case 57:
               var10000 = 66;
               break;
            case 58:
               var10000 = 176;
               break;
            case 59:
               var10000 = 185;
               break;
            case 60:
               var10000 = 228;
               break;
            case 61:
               var10000 = 177;
               break;
            case 62:
               var10000 = 233;
               break;
            case 63:
               var10000 = 192;
               break;
            case 64:
               var10000 = 29;
               break;
            case 65:
               var10000 = 199;
               break;
            case 66:
               var10000 = 180;
               break;
            case 67:
               var10000 = 40;
               break;
            case 68:
               var10000 = 216;
               break;
            case 69:
               var10000 = 115;
               break;
            case 70:
               var10000 = 120;
               break;
            case 71:
               var10000 = 73;
               break;
            case 72:
               var10000 = 222;
               break;
            case 73:
               var10000 = 76;
               break;
            case 74:
               var10000 = 2;
               break;
            case 75:
               var10000 = 153;
               break;
            case 76:
               var10000 = 59;
               break;
            case 77:
               var10000 = 16;
               break;
            case 78:
               var10000 = 171;
               break;
            case 79:
               var10000 = 129;
               break;
            case 80:
               var10000 = 21;
               break;
            case 81:
               var10000 = 104;
               break;
            case 82:
               var10000 = 8;
               break;
            case 83:
               var10000 = 214;
               break;
            case 84:
               var10000 = 207;
               break;
            case 85:
               var10000 = 114;
               break;
            case 86:
               var10000 = 126;
               break;
            case 87:
               var10000 = 191;
               break;
            case 88:
               var10000 = 159;
               break;
            case 89:
               var10000 = 189;
               break;
            case 90:
               var10000 = 93;
               break;
            case 91:
               var10000 = 184;
               break;
            case 92:
               var10000 = 155;
               break;
            case 93:
               var10000 = 3;
               break;
            case 94:
               var10000 = 31;
               break;
            case 95:
               var10000 = 181;
               break;
            case 96:
               var10000 = 137;
               break;
            case 97:
               var10000 = 198;
               break;
            case 98:
               var10000 = 122;
               break;
            case 99:
               var10000 = 13;
               break;
            case 100:
               var10000 = 221;
               break;
            case 101:
               var10000 = 33;
               break;
            case 102:
               var10000 = 138;
               break;
            case 103:
               var10000 = 78;
               break;
            case 104:
               var10000 = 100;
               break;
            case 105:
               var10000 = 125;
               break;
            case 106:
               var10000 = 44;
               break;
            case 107:
               var10000 = 103;
               break;
            case 108:
               var10000 = 160;
               break;
            case 109:
               var10000 = 27;
               break;
            case 110:
               var10000 = 4;
               break;
            case 111:
               var10000 = 223;
               break;
            case 112:
               var10000 = 220;
               break;
            case 113:
               var10000 = 52;
               break;
            case 114:
               var10000 = 249;
               break;
            case 115:
               var10000 = 95;
               break;
            case 116:
               var10000 = 145;
               break;
            case 117:
               var10000 = 234;
               break;
            case 118:
               var10000 = 209;
               break;
            case 119:
               var10000 = 81;
               break;
            case 120:
               var10000 = 164;
               break;
            case 121:
               var10000 = 194;
               break;
            case 122:
               var10000 = 46;
               break;
            case 123:
               var10000 = 68;
               break;
            case 124:
               var10000 = 107;
               break;
            case 125:
               var10000 = 224;
               break;
            case 126:
               var10000 = 7;
               break;
            case 127:
               var10000 = 147;
               break;
            case 128:
               var10000 = 146;
               break;
            case 129:
               var10000 = 17;
               break;
            case 130:
               var10000 = 144;
               break;
            case 131:
               var10000 = 41;
               break;
            case 132:
               var10000 = 142;
               break;
            case 133:
               var10000 = 85;
               break;
            case 134:
               var10000 = 168;
               break;
            case 135:
               var10000 = 58;
               break;
            case 136:
               var10000 = 113;
               break;
            case 137:
               var10000 = 45;
               break;
            case 138:
               var10000 = 94;
               break;
            case 139:
               var10000 = 37;
               break;
            case 140:
               var10000 = 89;
               break;
            case 141:
               var10000 = 187;
               break;
            case 142:
               var10000 = 23;
               break;
            case 143:
               var10000 = 242;
               break;
            case 144:
               var10000 = 134;
               break;
            case 145:
               var10000 = 140;
               break;
            case 146:
               var10000 = 90;
               break;
            case 147:
               var10000 = 1;
               break;
            case 148:
               var10000 = 236;
               break;
            case 149:
               var10000 = 118;
               break;
            case 150:
               var10000 = 190;
               break;
            case 151:
               var10000 = 55;
               break;
            case 152:
               var10000 = 148;
               break;
            case 153:
               var10000 = 36;
               break;
            case 154:
               var10000 = 87;
               break;
            case 155:
               var10000 = 231;
               break;
            case 156:
               var10000 = 235;
               break;
            case 157:
               var10000 = 11;
               break;
            case 158:
               var10000 = 62;
               break;
            case 159:
               var10000 = 218;
               break;
            case 160:
               var10000 = 51;
               break;
            case 161:
               var10000 = 83;
               break;
            case 162:
               var10000 = 32;
               break;
            case 163:
               var10000 = 203;
               break;
            case 164:
               var10000 = 108;
               break;
            case 165:
               var10000 = 149;
               break;
            case 166:
               var10000 = 246;
               break;
            case 167:
               var10000 = 77;
               break;
            case 168:
               var10000 = 206;
               break;
            case 169:
               var10000 = 241;
               break;
            case 170:
               var10000 = 183;
               break;
            case 171:
               var10000 = 91;
               break;
            case 172:
               var10000 = 123;
               break;
            case 173:
               var10000 = 117;
               break;
            case 174:
               var10000 = 84;
               break;
            case 175:
               var10000 = 97;
               break;
            case 176:
               var10000 = 111;
               break;
            case 177:
               var10000 = 254;
               break;
            case 178:
               var10000 = 208;
               break;
            case 179:
               var10000 = 12;
               break;
            case 180:
               var10000 = 102;
               break;
            case 181:
               var10000 = 72;
               break;
            case 182:
               var10000 = 213;
               break;
            case 183:
               var10000 = 86;
               break;
            case 184:
               var10000 = 65;
               break;
            case 185:
               var10000 = 202;
               break;
            case 186:
               var10000 = 243;
               break;
            case 187:
               var10000 = 69;
               break;
            case 188:
               var10000 = 9;
               break;
            case 189:
               var10000 = 50;
               break;
            case 190:
               var10000 = 215;
               break;
            case 191:
               var10000 = 70;
               break;
            case 192:
               var10000 = 152;
               break;
            case 193:
               var10000 = 245;
               break;
            case 194:
               var10000 = 47;
               break;
            case 195:
               var10000 = 212;
               break;
            case 196:
               var10000 = 167;
               break;
            case 197:
               var10000 = 253;
               break;
            case 198:
               var10000 = 82;
               break;
            case 199:
               var10000 = 101;
               break;
            case 200:
               var10000 = 130;
               break;
            case 201:
               var10000 = 179;
               break;
            case 202:
               var10000 = 211;
               break;
            case 203:
               var10000 = 210;
               break;
            case 204:
               var10000 = 175;
               break;
            case 205:
               var10000 = 14;
               break;
            case 206:
               var10000 = 53;
               break;
            case 207:
               var10000 = 252;
               break;
            case 208:
               var10000 = 127;
               break;
            case 209:
               var10000 = 105;
               break;
            case 210:
               var10000 = 248;
               break;
            case 211:
               var10000 = 141;
               break;
            case 212:
               var10000 = 201;
               break;
            case 213:
               var10000 = 219;
               break;
            case 214:
               var10000 = 226;
               break;
            case 215:
               var10000 = 49;
               break;
            case 216:
               var10000 = 30;
               break;
            case 217:
               var10000 = 131;
               break;
            case 218:
               var10000 = 186;
               break;
            case 219:
               var10000 = 5;
               break;
            case 220:
               var10000 = 135;
               break;
            case 221:
               var10000 = 38;
               break;
            case 222:
               var10000 = 136;
               break;
            case 223:
               var10000 = 165;
               break;
            case 224:
               var10000 = 132;
               break;
            case 225:
               var10000 = 6;
               break;
            case 226:
               var10000 = 48;
               break;
            case 227:
               var10000 = 247;
               break;
            case 228:
               var10000 = 169;
               break;
            case 229:
               var10000 = 255;
               break;
            case 230:
               var10000 = 128;
               break;
            case 231:
               var10000 = 18;
               break;
            case 232:
               var10000 = 92;
               break;
            case 233:
               var10000 = 35;
               break;
            case 234:
               var10000 = 182;
               break;
            case 235:
               var10000 = 63;
               break;
            case 236:
               var10000 = 174;
               break;
            case 237:
               var10000 = 154;
               break;
            case 238:
               var10000 = 170;
               break;
            case 239:
               var10000 = 106;
               break;
            case 240:
               var10000 = 60;
               break;
            case 241:
               var10000 = 22;
               break;
            case 242:
               var10000 = 67;
               break;
            case 243:
               var10000 = 54;
               break;
            case 244:
               var10000 = 173;
               break;
            case 245:
               var10000 = 240;
               break;
            case 246:
               var10000 = 172;
               break;
            case 247:
               var10000 = 156;
               break;
            case 248:
               var10000 = 197;
               break;
            case 249:
               var10000 = 28;
               break;
            case 250:
               var10000 = 237;
               break;
            case 251:
               var10000 = 71;
               break;
            case 252:
               var10000 = 61;
               break;
            case 253:
               var10000 = 34;
               break;
            case 254:
               var10000 = 238;
               break;
            default:
               var10000 = 139;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "\u008c\u0084æ^¤\rlã\tJl\u0007¾\u0086\u00ad\r\u001e\u007f²i\u0006ù#Ýøc)\u008ek¶\u001cX¼\\\b\u009aøøÐÊm/¨\u008fs\u008b³\u0002勋阭\u0002羐轁\u0007逐拳亲瓌攤彩\u008d\u0004È\u0099\u009a\u001f\u0002洮剘\u0011Ö哛疤串瓫柭劧囻哾M昊肩勭郕妺斟\u0012";
      int var4 = "\u008c\u0084æ^¤\rlã\tJl\u0007¾\u0086\u00ad\r\u001e\u007f²i\u0006ù#Ýøc)\u008ek¶\u001cX¼\\\b\u009aøøÐÊm/¨\u008fs\u008b³\u0002勋阭\u0002羐轁\u0007逐拳亲瓌攤彩\u008d\u0004È\u0099\u009a\u001f\u0002洮剘\u0011Ö哛疤串瓫柭劧囻哾M昊肩勭郕妺斟\u0012"
         .length();
      P(null);
      char var1 = 16;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 24;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 17;
                        break;
                     case 1:
                        var46 = 66;
                        break;
                     case 2:
                        var46 = 66;
                        break;
                     case 3:
                        var46 = 51;
                        break;
                     case 4:
                        var46 = 7;
                        break;
                     case 5:
                        var46 = 68;
                        break;
                     default:
                        var46 = 70;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[10];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u000fb\u0013\u0011\u000eZ\u008fv&\u00826F\u0018,\u000f\u0090Â^\u0092";
                  var4 = "\u000fb\u0013\u0011\u000eZ\u008fv&\u00826F\u0018,\u000f\u0090Â^\u0092".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 11;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





