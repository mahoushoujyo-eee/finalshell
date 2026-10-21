package com.finalshell.ui.panel;

import com.finalshell.core.C;
import com.finalshell.core.KV;
import com.finalshell.core.VD;
import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Lz4;
import com.finalshell.ui.listener.NF;
import com.finalshell.ui.listener.Wj2;
import com.finalshell.ui.listener.Yo2;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import net.miginfocom.swing.MigLayout;

public class LocalMachinePanel extends JPanel {
   public JO t;
   public JO L;
   public LB3 D;
   public KV T;
   public boolean m;
   public JPopupMenu K;
   public JButton w;
   public String X;
   public static int U;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public LocalMachinePanel(boolean var1) {
   super();
      int var10000 = t();
      Registry.lookupField(527414514539504903L).setBoolean(this, var1);
      int var2 = var10000;
      this.setLayout(new MigLayout(a(23658, 16918), "", a(23656, 2819)));
      this.setOpaque(false);
      JPanel var3 = new JPanel();
      var3.setLayout(new MigLayout(a(23659, 1025), a(23649, 6285), a(23657, 462)));
      var3.setOpaque(false);
      this.add(var3, a(23648, -1428));
      JO var10001 = new JO("");
      long var7 = 462268992386440670L;
      JO var6 = var10001;
      Ref.s(462268992386440670L, var6, var7);
      Object var8 = 462268992386440670L;
      ((JO)Ref.g(462268992386440670L, var8)).setOpaque(false);
      Object var10 = 462268992386440670L;
      ((JO)Ref.g(462268992386440670L, var10)).setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      Object var12 = 462268992386440670L;
      ((JO)Ref.g(462268992386440670L, var12)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var14 = 462268992386440670L;
      this.add((JO)Ref.g(462268992386440670L, var14), "");
      var3.add(new JO(" "), a(23660, 8598));
      JO var10006 = new JO();
      long var17 = 385286581456393831L;
      JO var16 = var10006;
      Ref.s(385286581456393831L, var16, var17);
      Object var18 = 385286581456393831L;
      ((JO)Ref.g(385286581456393831L, var18)).setOpaque(false);
      Object var20 = 385286581456393831L;
      ((JO)Ref.g(385286581456393831L, var20)).setForeground((Color)Registry.lookupField(503018106388102479L).get(null));
      Object var22 = 385286581456393831L;
      ((JO)Ref.g(385286581456393831L, var22)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var24 = 385286581456393831L;
      this.add((JO)Ref.g(385286581456393831L, var24), "");
      Object var26 = 385286581456393831L;
      this.add((JO)Ref.g(385286581456393831L, var26), a(23651, 16376));
      if (var2 != 0) {
         if (var1) {
            Registry.packArgs("\uf0d7");
            long var28 = 378399160856121064L;
            Object var10012 = Ref.h2(378399160856121064L, var28);

            try {
               var10012 = (C)var10012;
            } catch (InvocationTargetException var58) {
               throw var58.getTargetException();
            }

            C var4 = (C)var10012;
            var4.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
            var4.setForeground((Color)Registry.lookupField(476153709123937579L).get(null));
            var3.add(var4, "");
            JPopupMenu var10013 = new JPopupMenu();
            long var31 = 533402787991075064L;
            JPopupMenu var30 = var10013;
            Ref.s(533402787991075064L, var30, var31);
            Y12_2 var10014;
            Object var32 = 533402787991075064L;
var4 = new LocalMachinePanel(this, (JPopupMenu)Ref.g(533402787991075064L, var32));
            Y12_2 var5 = var10014;
            var4.addActionListener(new NF(this, var5, var4));
         }

         LB3 var62 = new LB3();
         long var35 = 200658018674316829L;
         LB3 var34 = var62;
         Ref.s(200658018674316829L, var34, var35);
         Object var36 = 200658018674316829L;
         this.add((LB3)Ref.g(200658018674316829L, var36), a(23663, 17379));
         Object var38 = 200658018674316829L;
         ((LB3)Ref.g(200658018674316829L, var38)).setLayout(new MigLayout(a(23653, 28190)));
         Registry.packArgs("\uf04b");
         long var40 = 378399160856121064L;
         Object var10016 = Ref.h2(378399160856121064L, var40);
         long var43 = 237443335566599428L;
         Object var42 = var10016;
         Ref.s(237443335566599428L, var42, var43);
         Object var44 = 237443335566599428L;
         ((JButton)Ref.g(237443335566599428L, var44)).setFont((Font)Registry.lookupField(488776025980704885L).get(null));
         Object var46 = 237443335566599428L;
         ((JButton)Ref.g(237443335566599428L, var46))
            .setForeground(new Color(a(1951, 5114710771379074604L), a(26556, 6346150750811330062L), a(26556, 6346150750811330062L)));
      }

      Cursor var59 = new Cursor(a(18166, 7080807113373366081L));
      Object var48 = 237443335566599428L;
      ((JButton)Ref.g(237443335566599428L, var48)).setCursor(var59);
      Object var50 = 200658018674316829L;
      LB3 var63 = (LB3)Ref.g(200658018674316829L, var50);
      Object var52 = 237443335566599428L;
      this.add((JButton)Ref.g(237443335566599428L, var52), "");
      Object var54 = 237443335566599428L;
      ((JButton)Ref.g(237443335566599428L, var54)).addActionListener(new Wj2(this));
      if (!var1) {
         Cursor var60 = new Cursor(a(8928, 822130564666348372L));
         this.setCursor(var60);
         Object var56 = 200658018674316829L;
         ((LB3)Ref.g(200658018674316829L, var56)).addMouseListener(new Lz4(this));
      }

      if (var2 == 0) {
         Ky4.K(new String[3]);
      }
   }

   public void s(KV var1, String var2, ArrayList var3, int var4) {
      long var33;
      i();
      long var9 = 177705260303572150L;
      Ref.s(177705260303572150L, var2, var9);
      long var11 = 412103333330765630L;
      Ref.s(412103333330765630L, var1, var11);
      Object var12 = 200658018674316829L;
      Ref.g(200658018674316829L, var12);
      Object[] var10004 = Registry.packArgs(var1, var2, var3, var4);
      long var15 = 303706210341471292L;
      Object[] var14 = var10004;
      Ref.h(303706210341471292L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      label78: {
         Object var16 = 462268992386440670L;
         ((JO)Ref.g(462268992386440670L, var16)).setText(var4 + a(23650, 20458));
         Object var18 = 462268992386440670L;
         ((JO)Ref.g(462268992386440670L, var18))
            .setForeground(new Color(a(27924, 5770069784179285154L), a(9548, 2375504002373178610L), a(11048, 7713079761722792600L)));
         Object var20 = 385286581456393831L;
         ((JO)Ref.g(385286581456393831L, var20))
            .setForeground(new Color(a(26084, 8718613484233102417L), a(20670, 5964839488599040271L), a(4708, 2045348241513833435L)));
         if (this == null && Registry.lookupField(527414514539504903L).getBoolean(this)) {
            String var10008 = (String)(Registry.emptyArgs());
            long var23 = 609170221187935837L;
            Object var22 = var10008;
            var10008 = Ref.h(609170221187935837L, var22, var23);

            try {
               var10008 = (String)var10008;
            } catch (InvocationTargetException var41) {
               throw var41.getTargetException();
            }

            if (var10008 != null) {
               Object var24 = 385286581456393831L;
               JO var10009 = (JO)Ref.g(385286581456393831L, var24);
               String var10011 = (String)(Registry.emptyArgs());
               long var27 = 609170221187935837L;
               Object var26 = var10011;
               var10011 = Ref.h(609170221187935837L, var26, var27);

               try {
                  var10011 = (String)var10011;
               } catch (InvocationTargetException var40) {
                  throw var40.getTargetException();
               }

               var1.setText(var10011);
               if (this == null) {
                  break label78;
               }
            }

            Object var28 = 385286581456393831L;
            ((JO)Ref.g(385286581456393831L, var28)).setText(a(23661, -21140));
            if (this == null) {
               break label78;
            }
         }

         Object var30 = 385286581456393831L;
         ((JO)Ref.g(385286581456393831L, var30)).setText(a(23662, 10724));
      }

      boolean var6 = false;
      if (this == null && Registry.lookupField(527414514539504903L).getBoolean(this)) {
         Object var45 = Registry.emptyArgs();
         var33 = 600849645967396341L;
         Object var32 = var45;
         var45 = Ref.h(600849645967396341L, var32, var33);

         try {
            var47 = (Integer)var45;
         } catch (InvocationTargetException var39) {
            throw var39.getTargetException();
         }

         int var7 = var47;
         if (this == null) {
            return;
         }

         if (var7 == Registry.lookupField(446362246660561336L).getInt(null)) {
            String var10010 = (String)(Registry.emptyArgs());
            long var35 = 445746235927917450L;
            Object var34 = var10010;
            var10010 = Ref.h(445746235927917450L, var34, var35);

            try {
               var10010 = (String)var10010;
            } catch (InvocationTargetException var38) {
               throw var38.getTargetException();
            }

            if (var10010 != null) {
               var6 = true;
            }
         }
      }

      Object var36 = 237443335566599428L;
      ((JButton)Ref.g(237443335566599428L, var36)).setVisible(var6);
   }

   public JPopupMenu L() {
      t();
      Object var6 = 533402787991075064L;
      ((JPopupMenu)Ref.g(533402787991075064L, var6)).removeAll();
      LocalMachinePanel var1 = this;
      if (this == null) {
         Object var8 = 412103333330765630L;
         if ((KV)Ref.g(412103333330765630L, var8) != null) {
            Object var10 = 412103333330765630L;
            Ref.g(412103333330765630L, var10);
            List var10004 = (List)(Registry.emptyArgs());
            long var13 = 408690525415437170L;
            Object var12 = var10004;
            var10004 = Ref.h(408690525415437170L, var12, var13);

            try {
               var10004 = (List)var10004;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            for (VD var4 : var10004) {
               JRadioButtonMenuItem var5 = new JRadioButtonMenuItem(var4.k());
               if (var1 == null) {
                  break;
               }

               label56:
               if (var1 == null) {
                  Object var14 = 412103333330765630L;
                  Ref.g(412103333330765630L, var14);
                  String var10006 = (String)(Registry.emptyArgs());
                  long var17 = 609170221187935837L;
                  Object var16 = var10006;
                  var10006 = Ref.h(609170221187935837L, var16, var17);

                  try {
                     var10006 = (String)var10006;
                  } catch (InvocationTargetException var27) {
                     throw var27.getTargetException();
                  }

                  if (var10006 != null) {
                     if (var1 == null) {
                        break label56;
                     }

                     Object var18 = 412103333330765630L;
                     Ref.g(412103333330765630L, var18);
                     String var10008 = (String)(Registry.emptyArgs());
                     long var21 = 445746235927917450L;
                     Object var20 = var10008;
                     var10008 = Ref.h(445746235927917450L, var20, var21);

                     try {
                        var10008 = (String)var10008;
                     } catch (InvocationTargetException var26) {
                        throw var26.getTargetException();
                     }

                     if (var10008.equals(var4.X())) {
                        var5.setSelected(true);
                     }
                  }

                  var5.addActionListener(new Yo2(this, var5, var4));
               }

               Object var22 = 533402787991075064L;
               ((JPopupMenu)Ref.g(533402787991075064L, var22)).add(var5);
               if (var1 == null) {
                  break;
               }
            }
         }
      }

      Object var24 = 533402787991075064L;
      return (JPopupMenu)Ref.g(533402787991075064L, var24);
   }

   public static void O(int var0) {
      U = var0;
   }

   public static int i() {
      return U;
   }

   public static int t() {
      int var0 = i();
      return var0 == 0 ? 90 : 0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 23657) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 205;
               break;
            case 1:
               var10000 = 49;
               break;
            case 2:
               var10000 = 160;
               break;
            case 3:
               var10000 = 148;
               break;
            case 4:
               var10000 = 37;
               break;
            case 5:
               var10000 = 174;
               break;
            case 6:
               var10000 = 97;
               break;
            case 7:
               var10000 = 131;
               break;
            case 8:
               var10000 = 203;
               break;
            case 9:
               var10000 = 242;
               break;
            case 10:
               var10000 = 211;
               break;
            case 11:
               var10000 = 149;
               break;
            case 12:
               var10000 = 125;
               break;
            case 13:
               var10000 = 120;
               break;
            case 14:
               var10000 = 113;
               break;
            case 15:
               var10000 = 0;
               break;
            case 16:
               var10000 = 151;
               break;
            case 17:
               var10000 = 166;
               break;
            case 18:
               var10000 = 252;
               break;
            case 19:
               var10000 = 156;
               break;
            case 20:
               var10000 = 163;
               break;
            case 21:
               var10000 = 184;
               break;
            case 22:
               var10000 = 138;
               break;
            case 23:
               var10000 = 86;
               break;
            case 24:
               var10000 = 197;
               break;
            case 25:
               var10000 = 171;
               break;
            case 26:
               var10000 = 124;
               break;
            case 27:
               var10000 = 189;
               break;
            case 28:
               var10000 = 21;
               break;
            case 29:
               var10000 = 69;
               break;
            case 30:
               var10000 = 105;
               break;
            case 31:
               var10000 = 226;
               break;
            case 32:
               var10000 = 4;
               break;
            case 33:
               var10000 = 67;
               break;
            case 34:
               var10000 = 178;
               break;
            case 35:
               var10000 = 79;
               break;
            case 36:
               var10000 = 195;
               break;
            case 37:
               var10000 = 155;
               break;
            case 38:
               var10000 = 16;
               break;
            case 39:
               var10000 = 212;
               break;
            case 40:
               var10000 = 135;
               break;
            case 41:
               var10000 = 244;
               break;
            case 42:
               var10000 = 123;
               break;
            case 43:
               var10000 = 87;
               break;
            case 44:
               var10000 = 110;
               break;
            case 45:
               var10000 = 28;
               break;
            case 46:
               var10000 = 150;
               break;
            case 47:
               var10000 = 50;
               break;
            case 48:
               var10000 = 201;
               break;
            case 49:
               var10000 = 24;
               break;
            case 50:
               var10000 = 41;
               break;
            case 51:
               var10000 = 26;
               break;
            case 52:
               var10000 = 55;
               break;
            case 53:
               var10000 = 71;
               break;
            case 54:
               var10000 = 72;
               break;
            case 55:
               var10000 = 185;
               break;
            case 56:
               var10000 = 126;
               break;
            case 57:
               var10000 = 139;
               break;
            case 58:
               var10000 = 43;
               break;
            case 59:
               var10000 = 186;
               break;
            case 60:
               var10000 = 10;
               break;
            case 61:
               var10000 = 27;
               break;
            case 62:
               var10000 = 158;
               break;
            case 63:
               var10000 = 250;
               break;
            case 64:
               var10000 = 239;
               break;
            case 65:
               var10000 = 164;
               break;
            case 66:
               var10000 = 104;
               break;
            case 67:
               var10000 = 119;
               break;
            case 68:
               var10000 = 59;
               break;
            case 69:
               var10000 = 136;
               break;
            case 70:
               var10000 = 140;
               break;
            case 71:
               var10000 = 6;
               break;
            case 72:
               var10000 = 111;
               break;
            case 73:
               var10000 = 81;
               break;
            case 74:
               var10000 = 34;
               break;
            case 75:
               var10000 = 146;
               break;
            case 76:
               var10000 = 208;
               break;
            case 77:
               var10000 = 144;
               break;
            case 78:
               var10000 = 30;
               break;
            case 79:
               var10000 = 101;
               break;
            case 80:
               var10000 = 187;
               break;
            case 81:
               var10000 = 95;
               break;
            case 82:
               var10000 = 157;
               break;
            case 83:
               var10000 = 17;
               break;
            case 84:
               var10000 = 82;
               break;
            case 85:
               var10000 = 183;
               break;
            case 86:
               var10000 = 77;
               break;
            case 87:
               var10000 = 93;
               break;
            case 88:
               var10000 = 210;
               break;
            case 89:
               var10000 = 238;
               break;
            case 90:
               var10000 = 145;
               break;
            case 91:
               var10000 = 38;
               break;
            case 92:
               var10000 = 103;
               break;
            case 93:
               var10000 = 176;
               break;
            case 94:
               var10000 = 191;
               break;
            case 95:
               var10000 = 233;
               break;
            case 96:
               var10000 = 108;
               break;
            case 97:
               var10000 = 78;
               break;
            case 98:
               var10000 = 170;
               break;
            case 99:
               var10000 = 227;
               break;
            case 100:
               var10000 = 141;
               break;
            case 101:
               var10000 = 15;
               break;
            case 102:
               var10000 = 74;
               break;
            case 103:
               var10000 = 83;
               break;
            case 104:
               var10000 = 90;
               break;
            case 105:
               var10000 = 207;
               break;
            case 106:
               var10000 = 19;
               break;
            case 107:
               var10000 = 68;
               break;
            case 108:
               var10000 = 194;
               break;
            case 109:
               var10000 = 181;
               break;
            case 110:
               var10000 = 33;
               break;
            case 111:
               var10000 = 209;
               break;
            case 112:
               var10000 = 13;
               break;
            case 113:
               var10000 = 229;
               break;
            case 114:
               var10000 = 45;
               break;
            case 115:
               var10000 = 46;
               break;
            case 116:
               var10000 = 253;
               break;
            case 117:
               var10000 = 85;
               break;
            case 118:
               var10000 = 129;
               break;
            case 119:
               var10000 = 23;
               break;
            case 120:
               var10000 = 44;
               break;
            case 121:
               var10000 = 231;
               break;
            case 122:
               var10000 = 188;
               break;
            case 123:
               var10000 = 142;
               break;
            case 124:
               var10000 = 89;
               break;
            case 125:
               var10000 = 3;
               break;
            case 126:
               var10000 = 159;
               break;
            case 127:
               var10000 = 63;
               break;
            case 128:
               var10000 = 42;
               break;
            case 129:
               var10000 = 57;
               break;
            case 130:
               var10000 = 52;
               break;
            case 131:
               var10000 = 76;
               break;
            case 132:
               var10000 = 130;
               break;
            case 133:
               var10000 = 118;
               break;
            case 134:
               var10000 = 114;
               break;
            case 135:
               var10000 = 192;
               break;
            case 136:
               var10000 = 109;
               break;
            case 137:
               var10000 = 61;
               break;
            case 138:
               var10000 = 219;
               break;
            case 139:
               var10000 = 62;
               break;
            case 140:
               var10000 = 11;
               break;
            case 141:
               var10000 = 200;
               break;
            case 142:
               var10000 = 1;
               break;
            case 143:
               var10000 = 92;
               break;
            case 144:
               var10000 = 190;
               break;
            case 145:
               var10000 = 115;
               break;
            case 146:
               var10000 = 235;
               break;
            case 147:
               var10000 = 154;
               break;
            case 148:
               var10000 = 243;
               break;
            case 149:
               var10000 = 182;
               break;
            case 150:
               var10000 = 40;
               break;
            case 151:
               var10000 = 213;
               break;
            case 152:
               var10000 = 175;
               break;
            case 153:
               var10000 = 222;
               break;
            case 154:
               var10000 = 153;
               break;
            case 155:
               var10000 = 180;
               break;
            case 156:
               var10000 = 225;
               break;
            case 157:
               var10000 = 143;
               break;
            case 158:
               var10000 = 198;
               break;
            case 159:
               var10000 = 2;
               break;
            case 160:
               var10000 = 88;
               break;
            case 161:
               var10000 = 172;
               break;
            case 162:
               var10000 = 25;
               break;
            case 163:
               var10000 = 32;
               break;
            case 164:
               var10000 = 53;
               break;
            case 165:
               var10000 = 7;
               break;
            case 166:
               var10000 = 152;
               break;
            case 167:
               var10000 = 240;
               break;
            case 168:
               var10000 = 216;
               break;
            case 169:
               var10000 = 39;
               break;
            case 170:
               var10000 = 230;
               break;
            case 171:
               var10000 = 70;
               break;
            case 172:
               var10000 = 75;
               break;
            case 173:
               var10000 = 247;
               break;
            case 174:
               var10000 = 147;
               break;
            case 175:
               var10000 = 122;
               break;
            case 176:
               var10000 = 102;
               break;
            case 177:
               var10000 = 248;
               break;
            case 178:
               var10000 = 35;
               break;
            case 179:
               var10000 = 168;
               break;
            case 180:
               var10000 = 218;
               break;
            case 181:
               var10000 = 249;
               break;
            case 182:
               var10000 = 254;
               break;
            case 183:
               var10000 = 80;
               break;
            case 184:
               var10000 = 47;
               break;
            case 185:
               var10000 = 167;
               break;
            case 186:
               var10000 = 237;
               break;
            case 187:
               var10000 = 217;
               break;
            case 188:
               var10000 = 246;
               break;
            case 189:
               var10000 = 65;
               break;
            case 190:
               var10000 = 18;
               break;
            case 191:
               var10000 = 22;
               break;
            case 192:
               var10000 = 127;
               break;
            case 193:
               var10000 = 214;
               break;
            case 194:
               var10000 = 36;
               break;
            case 195:
               var10000 = 221;
               break;
            case 196:
               var10000 = 206;
               break;
            case 197:
               var10000 = 196;
               break;
            case 198:
               var10000 = 121;
               break;
            case 199:
               var10000 = 5;
               break;
            case 200:
               var10000 = 20;
               break;
            case 201:
               var10000 = 161;
               break;
            case 202:
               var10000 = 73;
               break;
            case 203:
               var10000 = 51;
               break;
            case 204:
               var10000 = 58;
               break;
            case 205:
               var10000 = 162;
               break;
            case 206:
               var10000 = 224;
               break;
            case 207:
               var10000 = 94;
               break;
            case 208:
               var10000 = 112;
               break;
            case 209:
               var10000 = 202;
               break;
            case 210:
               var10000 = 60;
               break;
            case 211:
               var10000 = 179;
               break;
            case 212:
               var10000 = 66;
               break;
            case 213:
               var10000 = 232;
               break;
            case 214:
               var10000 = 106;
               break;
            case 215:
               var10000 = 12;
               break;
            case 216:
               var10000 = 54;
               break;
            case 217:
               var10000 = 100;
               break;
            case 218:
               var10000 = 228;
               break;
            case 219:
               var10000 = 241;
               break;
            case 220:
               var10000 = 91;
               break;
            case 221:
               var10000 = 48;
               break;
            case 222:
               var10000 = 64;
               break;
            case 223:
               var10000 = 107;
               break;
            case 224:
               var10000 = 255;
               break;
            case 225:
               var10000 = 137;
               break;
            case 226:
               var10000 = 223;
               break;
            case 227:
               var10000 = 215;
               break;
            case 228:
               var10000 = 199;
               break;
            case 229:
               var10000 = 117;
               break;
            case 230:
               var10000 = 236;
               break;
            case 231:
               var10000 = 220;
               break;
            case 232:
               var10000 = 165;
               break;
            case 233:
               var10000 = 128;
               break;
            case 234:
               var10000 = 251;
               break;
            case 235:
               var10000 = 96;
               break;
            case 236:
               var10000 = 14;
               break;
            case 237:
               var10000 = 133;
               break;
            case 238:
               var10000 = 169;
               break;
            case 239:
               var10000 = 173;
               break;
            case 240:
               var10000 = 9;
               break;
            case 241:
               var10000 = 177;
               break;
            case 242:
               var10000 = 116;
               break;
            case 243:
               var10000 = 132;
               break;
            case 244:
               var10000 = 84;
               break;
            case 245:
               var10000 = 193;
               break;
            case 246:
               var10000 = 245;
               break;
            case 247:
               var10000 = 56;
               break;
            case 248:
               var10000 = 234;
               break;
            case 249:
               var10000 = 204;
               break;
            case 250:
               var10000 = 8;
               break;
            case 251:
               var10000 = 99;
               break;
            case 252:
               var10000 = 134;
               break;
            case 253:
               var10000 = 98;
               break;
            case 254:
               var10000 = 31;
               break;
            default:
               var10000 = 29;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29111;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[13];
      int var11 = 0;
      String var10 = "\"ï¢\u0019\u0015þ!\u0098óX\\!ûaSVç\rÛÑ\u009eÞñm»\u0081\r½è0«\u000eÊÚ\u0088ÔRý¾¾\u00047ÍÊ`q\u000eEzyÀl\u007fyîü8Ò\u008e\u0083ù\u0007姓圬灼\u008aB\u009cE\fÏpâwöé¯\u0004oC¦\f&(\u0089\u000730\u000e(-/s,\u009e\u0007è\u0081íÐø*×§Ú\u008d\u0091\u0007]ò\u0094ÛãÕ\u009c#\u001f\u0019\u0014\f(\u0002枏某\u0011GØ\u000fÿ\u0081\"³\u0003 +\u0017O\u0092¬~ïB\u0004\u0081..À\b#\u0090\u007fkEjÙ\u007f";
      int var12 = "\"ï¢\u0019\u0015þ!\u0098óX\\!ûaSVç\rÛÑ\u009eÞñm»\u0081\r½è0«\u000eÊÚ\u0088ÔRý¾¾\u00047ÍÊ`q\u000eEzyÀl\u007fyîü8Ò\u008e\u0083ù\u0007姓圬灼\u008aB\u009cE\fÏpâwöé¯\u0004oC¦\f&(\u0089\u000730\u000e(-/s,\u009e\u0007è\u0081íÐø*×§Ú\u008d\u0091\u0007]ò\u0094ÛãÕ\u009c#\u001f\u0019\u0014\f(\u0002枏某\u0011GØ\u000fÿ\u0081\"³\u0003 +\u0017O\u0092¬~ïB\u0004\u0081..À\b#\u0090\u007fkEjÙ\u007f"
         .length();
      char var9 = 17;
      int var17 = -1;
      O(0);

      label70:
      while (true) {
         byte var10000 = 117;
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
                        var65 = 90;
                        break;
                     case 1:
                        var65 = 78;
                        break;
                     case 2:
                        var65 = 118;
                        break;
                     case 3:
                        var65 = 91;
                        break;
                     case 4:
                        var65 = 63;
                        break;
                     case 5:
                        var65 = 109;
                        break;
                     default:
                        var65 = 18;
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
                     b = new String[13];
                     long var0 = 784899250847063214L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "\u0084Õöz\f\u0098+ãj\u0085Ð\u009a\u0000\r\u0000\u0018Kì\u009cg\u008a\u0090\u0088ëUÃ\rtNØOö`Ð\u009a±ÇÜj6\u0089Is Î\u0005\u008a\u0014W²\u0095=«\u001e½ñ\u0088[Åz¾\u0088F´";
                     int var5 = "\u0084Õöz\f\u0098+ãj\u0085Ð\u009a\u0000\r\u0000\u0018Kì\u009cg\u008a\u0090\u0088ëUÃ\rtNØOö`Ð\u009a±ÇÜj6\u0089Is Î\u0005\u008a\u0014W²\u0095=«\u001e½ñ\u0088[Åz¾\u0088F´"
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
                                    d = new Integer[10];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u009d^{¢VS\u007f÷Õ£wÁ\u0018ÍH\f";
                                 var5 = "\u009d^{¢VS\u007f÷Õ£wÁ\u0018ÍH\f".length();
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

                  var10 = "ê{\u001ciÊAkÖ·\u0093K\f\u0005s3\bñ\u0096\\Þºh±´\f<\u009b\u0012Yä0";
                  var12 = "ê{\u001ciÊAkÖ·\u0093K\f\u0005s3\bñ\u0096\\Þºh±´\f<\u009b\u0012Yä0".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 34;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





