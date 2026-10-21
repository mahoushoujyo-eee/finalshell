package com.finalshell.ui.panel;

import com.finalshell.core.Km2;
import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.AZ;
import com.finalshell.ui.listener.BO3;
import com.finalshell.ui.listener.BU;
import com.finalshell.ui.listener.Ci2;
import com.finalshell.ui.listener.Dj4;
import com.finalshell.ui.listener.FJ3;
import com.finalshell.ui.listener.Je2;
import com.finalshell.ui.listener.K1;
import com.finalshell.ui.listener.Lf4;
import com.finalshell.ui.listener.MS;
import com.finalshell.ui.listener.TM3;
import com.finalshell.ui.listener.Th4;
import com.finalshell.ui.listener.Vz2;
import com.finalshell.ui.listener.YZ;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class SetExternalEditorPanel extends JPopupMenu {
   public Km2 s;
   public Ck4 U;
   public Tf4 P;
   public com.finalshell.ui.model.Kl4 h;
   public ConnectionInfoPanel T;
   public boolean W;
   public Object X;
   public U62 y;
   public static String[] a;
   public static String[] b;

   public SetExternalEditorPanel(Km2 var1, com.finalshell.ui.model.Kl4 var2, ConnectionInfoPanel var3) {
   super();
   Object[] var20;
      String var10000 = Km2.U$String();
      String var4 = var10000;
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 306266403902896148L;
      Object[] var8 = var10003;
      var10003 = Ref.h(306266403902896148L, var8, var9);
      long var11 = 571912682165835448L;
      Object var10 = var10003;
      Ref.s(571912682165835448L, var10, var11);
      long var13 = 590917027979763395L;
      Ref.s(590917027979763395L, var2, var13);
      long var15 = 166731455568463101L;
      Ref.s(166731455568463101L, var1, var15);
      long var17 = 476201740043670453L;
      Ref.s(476201740043670453L, var3, var17);
      if (var4 == null) {
         if (var2 != null) {
            int var5 = var1.getSelectedRow();
            if (var4 != null) {
               return;
            }

            if (var5 > -1) {
               Object var18 = 166731455568463101L;
               Ref.g(166731455568463101L, var18);
               Object[] var10009 = Registry.packArgs(var5);
               long var21 = 303488344973038628L;
               var20 = var10009;
               var10009 = Ref.h(303488344973038628L, var20, var21);
               long var23 = 125534131174805204L;
               Object var22 = var10009;
               Ref.s(125534131174805204L, var22, var23);
               if (var4 == null) {
                  Object var24 = 125534131174805204L;
                  label49:
                  if (Ref.g(125534131174805204L, var24) != null) {
                     Object var26 = 125534131174805204L;
                     SetExternalEditorPanel var10011 = Ref.g(125534131174805204L, var26).getClass().equals(Ck4.class);
                     if (var4 == null) {
                        if (var10011 == null) {
                           Object var28 = 125534131174805204L;
                           Ck4 var10013 = (Ck4)Ref.g(125534131174805204L, var28);
                           long var31 = 450156560726681374L;
                           Ck4 var30 = var10013;
                           Ref.s(450156560726681374L, var30, var31);
                           Registry.lookupField(315439568652915430L).setBoolean(this, true);
                           if (var4 == null) {
                              break label49;
                           }
                        }

                        var10011 = this;
                        if (var4 != null) {
                           break label49;
                        }

                        Object var32 = 125534131174805204L;
                        Ref.g(125534131174805204L, var32).getClass().equals(Tf4.class);
                     }

                     if (var10011 == null) {
                        Object var34 = 125534131174805204L;
                        Tf4 var43 = (Tf4)Ref.g(125534131174805204L, var34);
                        long var37 = 566271456646205392L;
                        Tf4 var36 = var43;
                        Ref.s(566271456646205392L, var36, var37);
                        Registry.lookupField(315439568652915430L).setBoolean(this, false);
                     }
                  }
               }
            }
         }

         Object[] var10007 = Registry.emptyArgs();
         long var39 = 337364366174303482L;
         Object[] var38 = var10007;
         Ref.h(337364366174303482L, var38, var39);

         try {
            ;
         } catch (InvocationTargetException var40) {
            throw var40.getTargetException();
         }
      }
   }

   public void t() {
      JMenuItem var20;
      String var78;
      boolean var89;
      boolean var94;
      JMenuItem var2 = new JMenuItem(a(-8384, -17012));
      String var10000 = Km2.U$String();
      var2.setEnabled(true);
      var2.addActionListener(new TM3(this));
      this.add(var2);
      this.addSeparator();
      JMenuItem var3 = new JMenuItem(a(-8369, 19762));
      String var1 = var10000;
      this.add(var3);
      var3.addActionListener(new Je2(this));
      JMenu var4 = new JMenu(a(-8362, 15201));
      this.add(var4);
      ButtonGroup var5 = new ButtonGroup();
      JRadioButtonMenuItem var6 = new JRadioButtonMenuItem(a(-8377, 13250));
      var6.addActionListener(new Dj4(this));
      var5.add(var6);
      var4.add((JMenuItem)var6);
      JRadioButtonMenuItem var7 = new JRadioButtonMenuItem(a(-8382, -8308));
      var7.addActionListener(new AZ(this));
      var5.add(var7);
      JMenu var74 = var4;
      if (var1 == null) {
         var4.add((JMenuItem)var7);
         label156:
         if (Registry.lookupField(315439568652915430L).getBoolean(this)) {
            Object var25 = 450156560726681374L;
            Object var10003 = Ref.g(450156560726681374L, var25);
            String var10004 = (String)(Registry.emptyArgs());
            long var28 = 605430732347023634L;
            Object var27 = var10004;
            var10004 = Ref.h(605430732347023634L, var27, var28);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

var10003 = new JMenuItem(var10004);
            Registry.packArgs(this.getName());
            long var29 = 353935338506646766L;
            var10003 = Ref.h2(353935338506646766L, var29);

            try {
               var78 = (String)var10003;
            } catch (InvocationTargetException var70) {
               throw var70.getTargetException();
            }

            String var8 = var78;
            Object var31 = 571912682165835448L;
            Ref.g(571912682165835448L, var31);
            ArrayList var10005 = (ArrayList)(Registry.emptyArgs());
            long var34 = 339037510611298074L;
            Object var33 = var10005;
            var10005 = Ref.h(339037510611298074L, var33, var34);

            try {
               var10005 = (ArrayList)var10005;
            } catch (InvocationTargetException var69) {
               throw var69.getTargetException();
            }

            label162: {
               ArrayList var9 = var10005;
               if (var1 == null) {
                  if (!var9.contains(var8)) {
                     break label162;
                  }

                  var7.setSelected(true);
               }

               if (var1 == null) {
                  break label156;
               }
            }

            var6.setSelected(true);
         }

         var74 = new JMenu(a(-8370, 12518));
      }

      JMenu var72 = var74;
      this.add(var72);
      this.addSeparator();
      JMenuItem var73 = new JMenuItem(a(-8371, -9419));
      this.add(var73);
      var73.addActionListener(new YZ(this));
      JRadioButtonMenuItem var10 = new JRadioButtonMenuItem(a(-8364, 545));
      var10.addActionListener(new MS(this));
      var72.add((JMenuItem)var10);
      JRadioButtonMenuItem var11 = new JRadioButtonMenuItem(a(-8381, 21188));
      var11.addActionListener(new Th4(this));
      var72.add((JMenuItem)var11);
      ButtonGroup var12 = new ButtonGroup();
      var12.add(var10);
      var12.add(var11);
      Object var35 = 571912682165835448L;
      Ref.g(571912682165835448L, var35);
      Integer var10002 = (Integer)(Registry.emptyArgs());
      long var38 = 407355336116664491L;
      Object var37 = var10002;
      var10002 = Ref.h(407355336116664491L, var37, var38);

      try {
         var10002 = (Integer)var10002;
      } catch (InvocationTargetException var68) {
         throw var68.getTargetException();
      }

      label151: {
         if (var1 == null) {
            if (var10002 == null) {
               var10.setSelected(true);
               if (var1 == null) {
                  break label151;
               }
            }

            var10002 = this;
            Object var39 = 571912682165835448L;
            Ref.g(571912682165835448L, var39);
            Object[] var81 = Registry.emptyArgs();
            long var42 = 407355336116664491L;
            Object[] var41 = var81;
            var81 = Ref.h(407355336116664491L, var41, var42);

            try {
            } catch (InvocationTargetException var67) {
               throw var67.getTargetException();
            }
         }

         if (var10002 == null) {
            var11.setSelected(true);
         }
      }

      var72.addSeparator();
      JMenuItem var13 = new JMenuItem(a(-8376, -1465));
      var13.addActionListener(new com.finalshell.ui.listener.Q2(this));
      var72.add(var13);
      this.addSeparator();
      JMenuItem var14 = new JMenuItem(a(-8374, -14183));
      var14.setEnabled(true);
      var14.addActionListener(new BO3(this));
      this.add(var14);
      JMenuItem var15 = new JMenuItem(a(-8375, -1871));
      var15.setEnabled(true);
      var15.addActionListener(new BU(this, var15));
      this.add(var15);
      this.addSeparator();
      JCheckBoxMenuItem var16 = new JCheckBoxMenuItem(a(-8373, 4575));
      boolean var17 = false;
      if (var1 == null) {
         Registry.emptyArgs();
         long var43 = 270389152141252877L;
         Ref.h2(270389152141252877L, var43);
         Object[] var83 = Registry.emptyArgs();
         long var46 = 163462326892114024L;
         Object[] var45 = var83;
         Ref.h(163462326892114024L, var45, var46);
         Object var87 = Registry.emptyArgs();
         long var48 = 633712494917113170L;
         Object var47 = var87;
         var87 = Ref.h(633712494917113170L, var47, var48);

         try {
            var89 = (Boolean)var87;
         } catch (InvocationTargetException var66) {
            throw var66.getTargetException();
         }

         label140:
         if (var89) {
            Registry.emptyArgs();
            long var49 = 270389152141252877L;
            Ref.h2(270389152141252877L, var49);
            Object[] var10007 = Registry.emptyArgs();
            long var52 = 306266403902896148L;
            Object[] var51 = var10007;
            Ref.h(306266403902896148L, var51, var52);
            Object var10008 = Registry.emptyArgs();
            long var54 = 518178624564683680L;
            Object var53 = var10008;
            var10008 = Ref.h(518178624564683680L, var53, var54);

            try {
               var94 = (Boolean)var10008;
            } catch (InvocationTargetException var65) {
               throw var65.getTargetException();
            }

            if (var1 == null) {
               if (!var94) {
                  break label140;
               }

               var94 = true;
            }

            var17 = var94;
         }

         var16.setSelected(var17);
         var16.addActionListener(new Ci2(this, var16));
         this.add(var16);
         this.addSeparator();
      }

      JMenu var18 = new JMenu(a(-8363, -24340));
      this.add(var18);
      JMenuItem var19 = new JMenuItem(a(-8383, 19975));
      var19.setEnabled(true);
      var19.addActionListener(new com.finalshell.ui.listener.U2(this));
      var18.add(var19);
      var20 = new JMenuItem(a(-8380, 7304));
      var20.setEnabled(true);
      var20.addActionListener(new FJ3(this));
      var18.add(var20);
      this.addSeparator();
      JMenuItem var21 = new JMenuItem(a(-8372, -9538));
      var21.setEnabled(true);
      var21.addActionListener(new Vz2(this));
      this.add(var21);
      JMenuItem var22 = new JMenuItem(a(-8378, 8388));
      Object var55 = 166731455568463101L;
      int var84 = ((Km2)Ref.g(166731455568463101L, var55)).getSelectedRowCount();
      if (var1 == null) {
         var84 = var84 > 0 ? 1 : 0;
      }

      this.setEnabled(var84);
      var22.addActionListener(new Lf4(this));
      this.add(var22);
      JMenuItem var23 = new JMenuItem(a(-8361, 27389));
      Object var57 = 166731455568463101L;
      int var90 = ((Km2)Ref.g(166731455568463101L, var57)).getSelectedRowCount();
      if (var1 == null) {
         var90 = var90 > 0 ? 1 : 0;
      }

      this.setEnabled(var90);
      var23.addActionListener(new K1(this));
      this.add(var23);
      this.addSeparator();
      JMenuItem var24 = new JMenuItem(a(-8379, 26799));
      Object var59 = 166731455568463101L;
      int var10006 = ((Km2)Ref.g(166731455568463101L, var59)).getSelectedRowCount();
      if (var1 == null) {
         var10006 = var10006 > 0 ? 1 : 0;
      }

      this.setEnabled(var10006);
      var24.addActionListener(new com.finalshell.ui.listener.Kd4(this));
      this.add(var24);
      SetExternalEditorPanel var91 = this;
      if (var1 == null) {
         Object var61 = 125534131174805204L;
         if (Ref.g(125534131174805204L, var61) == null) {
            var21.setEnabled(false);
            var22.setEnabled(false);
         }
      }

      if (var1 == null) {
         if (!Registry.lookupField(315439568652915430L).getBoolean(this)) {
            var3.setEnabled(false);
            var72.setEnabled(false);
            var4.setEnabled(false);
            var4.setEnabled(false);
         }

         var91 = this;
         Object var63 = 125534131174805204L;
         Object var92 = Ref.g(125534131174805204L, var63);
      }

      if (var91 == null) {
         var14.setEnabled(false);
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -8380) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 108;
               break;
            case 1:
               var10000 = 201;
               break;
            case 2:
               var10000 = 199;
               break;
            case 3:
               var10000 = 83;
               break;
            case 4:
               var10000 = 141;
               break;
            case 5:
               var10000 = 144;
               break;
            case 6:
               var10000 = 138;
               break;
            case 7:
               var10000 = 142;
               break;
            case 8:
               var10000 = 245;
               break;
            case 9:
               var10000 = 10;
               break;
            case 10:
               var10000 = 132;
               break;
            case 11:
               var10000 = 251;
               break;
            case 12:
               var10000 = 153;
               break;
            case 13:
               var10000 = 27;
               break;
            case 14:
               var10000 = 52;
               break;
            case 15:
               var10000 = 48;
               break;
            case 16:
               var10000 = 69;
               break;
            case 17:
               var10000 = 64;
               break;
            case 18:
               var10000 = 204;
               break;
            case 19:
               var10000 = 57;
               break;
            case 20:
               var10000 = 112;
               break;
            case 21:
               var10000 = 122;
               break;
            case 22:
               var10000 = 2;
               break;
            case 23:
               var10000 = 74;
               break;
            case 24:
               var10000 = 190;
               break;
            case 25:
               var10000 = 253;
               break;
            case 26:
               var10000 = 19;
               break;
            case 27:
               var10000 = 87;
               break;
            case 28:
               var10000 = 99;
               break;
            case 29:
               var10000 = 66;
               break;
            case 30:
               var10000 = 124;
               break;
            case 31:
               var10000 = 252;
               break;
            case 32:
               var10000 = 50;
               break;
            case 33:
               var10000 = 41;
               break;
            case 34:
               var10000 = 194;
               break;
            case 35:
               var10000 = 167;
               break;
            case 36:
               var10000 = 113;
               break;
            case 37:
               var10000 = 109;
               break;
            case 38:
               var10000 = 6;
               break;
            case 39:
               var10000 = 80;
               break;
            case 40:
               var10000 = 207;
               break;
            case 41:
               var10000 = 89;
               break;
            case 42:
               var10000 = 149;
               break;
            case 43:
               var10000 = 209;
               break;
            case 44:
               var10000 = 78;
               break;
            case 45:
               var10000 = 222;
               break;
            case 46:
               var10000 = 67;
               break;
            case 47:
               var10000 = 95;
               break;
            case 48:
               var10000 = 5;
               break;
            case 49:
               var10000 = 11;
               break;
            case 50:
               var10000 = 116;
               break;
            case 51:
               var10000 = 91;
               break;
            case 52:
               var10000 = 25;
               break;
            case 53:
               var10000 = 118;
               break;
            case 54:
               var10000 = 152;
               break;
            case 55:
               var10000 = 237;
               break;
            case 56:
               var10000 = 24;
               break;
            case 57:
               var10000 = 4;
               break;
            case 58:
               var10000 = 243;
               break;
            case 59:
               var10000 = 56;
               break;
            case 60:
               var10000 = 28;
               break;
            case 61:
               var10000 = 181;
               break;
            case 62:
               var10000 = 226;
               break;
            case 63:
               var10000 = 227;
               break;
            case 64:
               var10000 = 40;
               break;
            case 65:
               var10000 = 170;
               break;
            case 66:
               var10000 = 216;
               break;
            case 67:
               var10000 = 81;
               break;
            case 68:
               var10000 = 9;
               break;
            case 69:
               var10000 = 31;
               break;
            case 70:
               var10000 = 47;
               break;
            case 71:
               var10000 = 241;
               break;
            case 72:
               var10000 = 139;
               break;
            case 73:
               var10000 = 238;
               break;
            case 74:
               var10000 = 202;
               break;
            case 75:
               var10000 = 33;
               break;
            case 76:
               var10000 = 68;
               break;
            case 77:
               var10000 = 16;
               break;
            case 78:
               var10000 = 172;
               break;
            case 79:
               var10000 = 7;
               break;
            case 80:
               var10000 = 164;
               break;
            case 81:
               var10000 = 120;
               break;
            case 82:
               var10000 = 36;
               break;
            case 83:
               var10000 = 97;
               break;
            case 84:
               var10000 = 30;
               break;
            case 85:
               var10000 = 134;
               break;
            case 86:
               var10000 = 42;
               break;
            case 87:
               var10000 = 205;
               break;
            case 88:
               var10000 = 93;
               break;
            case 89:
               var10000 = 196;
               break;
            case 90:
               var10000 = 22;
               break;
            case 91:
               var10000 = 158;
               break;
            case 92:
               var10000 = 73;
               break;
            case 93:
               var10000 = 107;
               break;
            case 94:
               var10000 = 21;
               break;
            case 95:
               var10000 = 219;
               break;
            case 96:
               var10000 = 70;
               break;
            case 97:
               var10000 = 255;
               break;
            case 98:
               var10000 = 221;
               break;
            case 99:
               var10000 = 79;
               break;
            case 100:
               var10000 = 165;
               break;
            case 101:
               var10000 = 23;
               break;
            case 102:
               var10000 = 72;
               break;
            case 103:
               var10000 = 206;
               break;
            case 104:
               var10000 = 233;
               break;
            case 105:
               var10000 = 174;
               break;
            case 106:
               var10000 = 231;
               break;
            case 107:
               var10000 = 189;
               break;
            case 108:
               var10000 = 100;
               break;
            case 109:
               var10000 = 60;
               break;
            case 110:
               var10000 = 130;
               break;
            case 111:
               var10000 = 38;
               break;
            case 112:
               var10000 = 44;
               break;
            case 113:
               var10000 = 127;
               break;
            case 114:
               var10000 = 131;
               break;
            case 115:
               var10000 = 126;
               break;
            case 116:
               var10000 = 96;
               break;
            case 117:
               var10000 = 135;
               break;
            case 118:
               var10000 = 200;
               break;
            case 119:
               var10000 = 246;
               break;
            case 120:
               var10000 = 94;
               break;
            case 121:
               var10000 = 62;
               break;
            case 122:
               var10000 = 229;
               break;
            case 123:
               var10000 = 117;
               break;
            case 124:
               var10000 = 244;
               break;
            case 125:
               var10000 = 169;
               break;
            case 126:
               var10000 = 148;
               break;
            case 127:
               var10000 = 58;
               break;
            case 128:
               var10000 = 49;
               break;
            case 129:
               var10000 = 92;
               break;
            case 130:
               var10000 = 159;
               break;
            case 131:
               var10000 = 143;
               break;
            case 132:
               var10000 = 160;
               break;
            case 133:
               var10000 = 29;
               break;
            case 134:
               var10000 = 59;
               break;
            case 135:
               var10000 = 212;
               break;
            case 136:
               var10000 = 214;
               break;
            case 137:
               var10000 = 90;
               break;
            case 138:
               var10000 = 101;
               break;
            case 139:
               var10000 = 248;
               break;
            case 140:
               var10000 = 13;
               break;
            case 141:
               var10000 = 240;
               break;
            case 142:
               var10000 = 230;
               break;
            case 143:
               var10000 = 186;
               break;
            case 144:
               var10000 = 12;
               break;
            case 145:
               var10000 = 171;
               break;
            case 146:
               var10000 = 121;
               break;
            case 147:
               var10000 = 155;
               break;
            case 148:
               var10000 = 85;
               break;
            case 149:
               var10000 = 110;
               break;
            case 150:
               var10000 = 3;
               break;
            case 151:
               var10000 = 98;
               break;
            case 152:
               var10000 = 128;
               break;
            case 153:
               var10000 = 234;
               break;
            case 154:
               var10000 = 173;
               break;
            case 155:
               var10000 = 123;
               break;
            case 156:
               var10000 = 119;
               break;
            case 157:
               var10000 = 198;
               break;
            case 158:
               var10000 = 1;
               break;
            case 159:
               var10000 = 163;
               break;
            case 160:
               var10000 = 14;
               break;
            case 161:
               var10000 = 203;
               break;
            case 162:
               var10000 = 104;
               break;
            case 163:
               var10000 = 193;
               break;
            case 164:
               var10000 = 76;
               break;
            case 165:
               var10000 = 106;
               break;
            case 166:
               var10000 = 133;
               break;
            case 167:
               var10000 = 191;
               break;
            case 168:
               var10000 = 162;
               break;
            case 169:
               var10000 = 242;
               break;
            case 170:
               var10000 = 20;
               break;
            case 171:
               var10000 = 18;
               break;
            case 172:
               var10000 = 161;
               break;
            case 173:
               var10000 = 166;
               break;
            case 174:
               var10000 = 53;
               break;
            case 175:
               var10000 = 61;
               break;
            case 176:
               var10000 = 225;
               break;
            case 177:
               var10000 = 46;
               break;
            case 178:
               var10000 = 224;
               break;
            case 179:
               var10000 = 218;
               break;
            case 180:
               var10000 = 137;
               break;
            case 181:
               var10000 = 249;
               break;
            case 182:
               var10000 = 71;
               break;
            case 183:
               var10000 = 54;
               break;
            case 184:
               var10000 = 0;
               break;
            case 185:
               var10000 = 147;
               break;
            case 186:
               var10000 = 125;
               break;
            case 187:
               var10000 = 32;
               break;
            case 188:
               var10000 = 156;
               break;
            case 189:
               var10000 = 254;
               break;
            case 190:
               var10000 = 51;
               break;
            case 191:
               var10000 = 65;
               break;
            case 192:
               var10000 = 177;
               break;
            case 193:
               var10000 = 220;
               break;
            case 194:
               var10000 = 176;
               break;
            case 195:
               var10000 = 75;
               break;
            case 196:
               var10000 = 211;
               break;
            case 197:
               var10000 = 179;
               break;
            case 198:
               var10000 = 82;
               break;
            case 199:
               var10000 = 187;
               break;
            case 200:
               var10000 = 105;
               break;
            case 201:
               var10000 = 84;
               break;
            case 202:
               var10000 = 188;
               break;
            case 203:
               var10000 = 129;
               break;
            case 204:
               var10000 = 43;
               break;
            case 205:
               var10000 = 111;
               break;
            case 206:
               var10000 = 102;
               break;
            case 207:
               var10000 = 236;
               break;
            case 208:
               var10000 = 136;
               break;
            case 209:
               var10000 = 39;
               break;
            case 210:
               var10000 = 17;
               break;
            case 211:
               var10000 = 150;
               break;
            case 212:
               var10000 = 154;
               break;
            case 213:
               var10000 = 35;
               break;
            case 214:
               var10000 = 217;
               break;
            case 215:
               var10000 = 178;
               break;
            case 216:
               var10000 = 88;
               break;
            case 217:
               var10000 = 26;
               break;
            case 218:
               var10000 = 247;
               break;
            case 219:
               var10000 = 183;
               break;
            case 220:
               var10000 = 223;
               break;
            case 221:
               var10000 = 182;
               break;
            case 222:
               var10000 = 213;
               break;
            case 223:
               var10000 = 55;
               break;
            case 224:
               var10000 = 232;
               break;
            case 225:
               var10000 = 210;
               break;
            case 226:
               var10000 = 146;
               break;
            case 227:
               var10000 = 45;
               break;
            case 228:
               var10000 = 145;
               break;
            case 229:
               var10000 = 63;
               break;
            case 230:
               var10000 = 239;
               break;
            case 231:
               var10000 = 208;
               break;
            case 232:
               var10000 = 184;
               break;
            case 233:
               var10000 = 8;
               break;
            case 234:
               var10000 = 197;
               break;
            case 235:
               var10000 = 185;
               break;
            case 236:
               var10000 = 151;
               break;
            case 237:
               var10000 = 228;
               break;
            case 238:
               var10000 = 192;
               break;
            case 239:
               var10000 = 215;
               break;
            case 240:
               var10000 = 114;
               break;
            case 241:
               var10000 = 250;
               break;
            case 242:
               var10000 = 140;
               break;
            case 243:
               var10000 = 157;
               break;
            case 244:
               var10000 = 15;
               break;
            case 245:
               var10000 = 168;
               break;
            case 246:
               var10000 = 86;
               break;
            case 247:
               var10000 = 195;
               break;
            case 248:
               var10000 = 180;
               break;
            case 249:
               var10000 = 77;
               break;
            case 250:
               var10000 = 34;
               break;
            case 251:
               var10000 = 175;
               break;
            case 252:
               var10000 = 235;
               break;
            case 253:
               var10000 = 37;
               break;
            case 254:
               var10000 = 103;
               break;
            default:
               var10000 = 115;
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
      String[] var5 = new String[20];
      int var3 = 0;
      String var2 = "攉亴\u0007旾与木阆¢\u008c2\u0002剏阏\u0005攏杏罃轮噶\u0002刔旺\u0003敄丶夅\u0004籩纸儙胘\u0005夎郞翀輀嘆\u0003酀咴咲\u0004姲刻跞徬\u0007郜拞旷果缽输嚸\u0002拃弭\u0007譪缷姱递罞輞囔\u0005且侯$@ã\u0002仟辠\u0004拘匨俁辌\u0005函羭罟輸囵\u0002攝庻";
      int var4 = "攉亴\u0007旾与木阆¢\u008c2\u0002剏阏\u0005攏杏罃轮噶\u0002刔旺\u0003敄丶夅\u0004籩纸儙胘\u0005夎郞翀輀嘆\u0003酀咴咲\u0004姲刻跞徬\u0007郜拞旷果缽输嚸\u0002拃弭\u0007譪缷姱递罞輞囔\u0005且侯$@ã\u0002仟辠\u0004拘匨俁辌\u0005函羭罟輸囵\u0002攝庻"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 84;
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
                        var46 = 57;
                        break;
                     case 1:
                        var46 = 97;
                        break;
                     case 2:
                        var46 = 58;
                        break;
                     case 3:
                        var46 = 77;
                        break;
                     case 4:
                        var46 = 59;
                        break;
                     case 5:
                        var46 = 79;
                        break;
                     default:
                        var46 = 26;
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
                     b = new String[20];
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

                  var2 = "戨忙斀彍\u000b彋途勚陣;RTÂ哱乹¼";
                  var4 = "戨忙斀彍\u000b彋途勚陣;RTÂ哱乹¼".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 82;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





