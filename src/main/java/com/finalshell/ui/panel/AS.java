package com.finalshell.ui.panel;

import com.finalshell.core.LO3;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Vn2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import net.miginfocom.swing.MigLayout;

public class AS extends JPanel implements TableCellRenderer {
   JLabel a;
   JLabel A;
   JLabel K;
   Font s;
   Color Y;
   Color r;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public AS() {
      Object var10001 = Registry.lookupField(395970988011231853L).get(null);
      long var3 = 508640197768871539L;
      Object var2 = var10001;
      Ref.s(508640197768871539L, var2, var3);
      this.setBackground(new Color(a(14560, 3013205821989630037L), a(26969, 5164955403688600045L), a(26969, 5164955403688600045L)));
      this.setLayout(new MigLayout(a(-6668, -1640), "", a(-6667, -5644)));
      this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      JLabel var10002 = new JLabel();
      long var5 = 404566686395145286L;
      JLabel var4 = var10002;
      Ref.s(404566686395145286L, var4, var5);
      Object var6 = 404566686395145286L;
      ((JLabel)Ref.g(404566686395145286L, var6)).setOpaque(false);
      Object var8 = 404566686395145286L;
      ((JLabel)Ref.g(404566686395145286L, var8)).setMinimumSize(new Dimension(a(240, 8426817273754290248L), 0));
      Object var10 = 404566686395145286L;
      ((JLabel)Ref.g(404566686395145286L, var10)).setPreferredSize(new Dimension(a(28441, 1820421662151894952L), a(16322, 1044318565680887669L)));
      Object var12 = 404566686395145286L;
      ((JLabel)Ref.g(404566686395145286L, var12)).setMaximumSize(new Dimension(a(3017, 3985379968438010741L), a(29454, 2228211265456733118L)));
      Object var14 = 404566686395145286L;
      JLabel var10007 = (JLabel)Ref.g(404566686395145286L, var14);
      Object var16 = 508640197768871539L;
      this.setFont((Font)Ref.g(508640197768871539L, var16));
      Object var18 = 404566686395145286L;
      this.add((JLabel)Ref.g(404566686395145286L, var18), a(-6665, -20967));
      JLabel var10010 = new JLabel();
      long var21 = 335331661733051084L;
      JLabel var20 = var10010;
      Ref.s(335331661733051084L, var20, var21);
      Object var22 = 335331661733051084L;
      ((JLabel)Ref.g(335331661733051084L, var22)).setOpaque(false);
      Object var24 = 335331661733051084L;
      ((JLabel)Ref.g(335331661733051084L, var24)).setMinimumSize(new Dimension(a(5320, 5826470712700279930L), 0));
      Object var26 = 335331661733051084L;
      ((JLabel)Ref.g(335331661733051084L, var26)).setPreferredSize(new Dimension(a(27373, 4696607981707289172L), a(29454, 2228211265456733118L)));
      Object var28 = 335331661733051084L;
      ((JLabel)Ref.g(335331661733051084L, var28)).setMaximumSize(new Dimension(a(22348, 6224310187097645043L), a(29454, 2228211265456733118L)));
      Object var30 = 335331661733051084L;
      JLabel var10015 = (JLabel)Ref.g(335331661733051084L, var30);
      Object var32 = 508640197768871539L;
      this.setFont((Font)Ref.g(508640197768871539L, var32));
      Object var34 = 335331661733051084L;
      this.add((JLabel)Ref.g(335331661733051084L, var34));
      JLabel var10018 = new JLabel();
      long var37 = 558115666774932292L;
      JLabel var36 = var10018;
      Ref.s(558115666774932292L, var36, var37);
      Object var38 = 558115666774932292L;
      ((JLabel)Ref.g(558115666774932292L, var38)).setOpaque(false);
      Vn2.C();
      Object var40 = 558115666774932292L;
      JLabel var10021 = (JLabel)Ref.g(558115666774932292L, var40);
      Object var42 = 508640197768871539L;
      this.setFont((Font)Ref.g(508640197768871539L, var42));
      Object var44 = 558115666774932292L;
      ((JLabel)Ref.g(558115666774932292L, var44)).setMinimumSize(new Dimension(a(5320, 5826470712700279930L), 0));
      Object var46 = 558115666774932292L;
      ((JLabel)Ref.g(558115666774932292L, var46)).setPreferredSize(new Dimension(a(13958, 2016435012894080565L), a(29454, 2228211265456733118L)));
      Object var48 = 558115666774932292L;
      ((JLabel)Ref.g(558115666774932292L, var48)).setMaximumSize(new Dimension(a(24893, 5215600963011537283L), a(29454, 2228211265456733118L)));
      Object var50 = 558115666774932292L;
      this.add((JLabel)Ref.g(558115666774932292L, var50));
      Color var10026 = new Color(a(26969, 5164955403688600045L), a(26969, 5164955403688600045L), a(26969, 5164955403688600045L));
      long var53 = 295365565062933336L;
      Color var52 = var10026;
      Ref.s(295365565062933336L, var52, var53);
      Color var10027 = new Color(a(10976, 6290542757445050973L), a(24479, 7476511008692197161L), a(26969, 5164955403688600045L));
      long var55 = 172194713795712998L;
      Color var54 = var10027;
      Ref.s(172194713795712998L, var54, var55);
      if (Ky4.F$arrString() != null) {
         Vn2.X("xjCkK");
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String var7;
      label158: {
         var7 = Vn2.C();
         Object var10000 = var2;
         if (var7 == null) {
            if (!(var2 instanceof Lv4_2)) {
               break label158;
            }

            var10000 = var2;
         }

         Lv4_2 var8 = (Lv4_2)var10000;
         String var10001 = (String)(Registry.emptyArgs());
         long var14 = 286931176286176762L;
         Object[] var13 = var10001;
         var10001 = Ref.h(286931176286176762L, var13, var14);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var57) {
            throw var57.getTargetException();
         }

         String var9 = var10001;
         Object var15 = 404566686395145286L;
         ((JLabel)Ref.g(404566686395145286L, var15)).setText(var9);
         Object var10 = null;
         String var10003 = (String)(Registry.emptyArgs());
         long var18 = 413442976446181537L;
         Object[] var17 = var10003;
         var10003 = Ref.h(413442976446181537L, var17, var18);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var56) {
            throw var56.getTargetException();
         }

         String var11 = var10003;
         String var12 = "";

         label139:
         while (true) {
            Registry.emptyArgs();
            long var19 = 270389152141252877L;
            Ref.h2(270389152141252877L, var19);
            Object[] var10005 = Registry.emptyArgs();
            long var22 = 410905379772103887L;
            Object[] var21 = var10005;
            Ref.h(410905379772103887L, var21, var22);
            LO3 var10006 = (LO3)(Registry.packArgs(var11));
            long var24 = 133273064107181210L;
            Object[] var23 = var10006;
            var10006 = Ref.h(133273064107181210L, var23, var24);

            try {
               var10006 = (LO3)var10006;
            } catch (InvocationTargetException var55) {
               throw var55.getTargetException();
            }

            var10 = var10006;
            if (var10 != null) {
               new StringBuilder();
               String var10008 = (String)(Registry.emptyArgs());
               long var26 = 286931176286176762L;
               Object[] var25 = var10008;
               var10008 = Ref.h(286931176286176762L, var25, var26);

               try {
                  var10008 = (String)var10008;
               } catch (InvocationTargetException var54) {
                  throw var54.getTargetException();
               }

               var12 = var10.append((String)var10008).append("/").append(var12).toString();
               var10008 = Registry.emptyArgs();
               long var28 = 413442976446181537L;
               Object[] var27 = var10008;
               var10008 = Ref.h(413442976446181537L, var27, var28);

               try {
                  var10008 = (String)var10008;
               } catch (InvocationTargetException var53) {
                  throw var53.getTargetException();
               }

               var11 = var10008;
            }

            while (var10 == null) {
               var12 = "/" + var12;
               if (var7 == null) {
                  var10006 = var12.length();
                  Object var10007 = true;
                  if (var7 == null) {
                     label154: {
                        if (var10006 > 1) {
                           var10006 = var12.endsWith("/");
                           var10007 = var7;
                           if (var7 != null) {
                              break label154;
                           }

                           if (var10006 != false) {
                              var12 = var12.substring(0, var12.length() - 1);
                           }
                        }

                        var10006 = this;
                        Object var29 = 335331661733051084L;
                        ((JLabel)Ref.g(335331661733051084L, var29)).setText(var12);
                        var10007 = this;
                        Object var31 = 558115666774932292L;
                        JLabel var75 = (JLabel)Ref.g(558115666774932292L, var31);
                        String var10010 = (String)(Registry.emptyArgs());
                        long var34 = 255973732097233937L;
                        Object[] var33 = var10010;
                        var10010 = Ref.h(255973732097233937L, var33, var34);

                        try {
                           var10010 = (String)var10010;
                        } catch (InvocationTargetException var52) {
                           throw var52.getTargetException();
                        }

                        var8.setText(var10010);
                        var10010 = Registry.emptyArgs();
                        long var36 = 402271797068414482L;
                        Object[] var35 = var10010;
                        var10010 = Ref.h(402271797068414482L, var35, var36);

                        try {
                        } catch (InvocationTargetException var51) {
                           throw var51.getTargetException();
                        }
                     }

                     Registry.lookupField(590765520000496083L).getInt(null);
                  }

                  if (var7 == null) {
                     if (var10006 == var10007) {
                        Object var37 = 404566686395145286L;
                        ((JLabel)Ref.g(404566686395145286L, var37)).setIcon((ImageIcon)Registry.lookupField(478725326680392680L).get(null));
                        if (var7 == null) {
                           break label139;
                        }
                     }

                     var10006 = var8;
                     var10007 = Registry.emptyArgs();
                     long var40 = 402271797068414482L;
                     Object[] var39 = (Object[])var10007;
                     var10007 = Ref.h(402271797068414482L, var39, var40);

                     try {
                        var10007 = (Integer)var10007;
                     } catch (InvocationTargetException var50) {
                        throw var50.getTargetException();
                     }

                     Registry.lookupField(292712586650823274L).getInt(null);
                  }

                  if (var10006 == var10007) {
                     Object var41 = 404566686395145286L;
                     ((JLabel)Ref.g(404566686395145286L, var41)).setIcon((ImageIcon)Registry.lookupField(392185280097364709L).get(null));
                  }
                  break label139;
               }

               var11 = var12;
            }
         }
      }

      Vn2 var58 = (Vn2)var1;
      Object var43 = 295365565062933336L;
      Color var59 = (Color)Ref.g(295365565062933336L, var43);
      if (var7 == null) {
         Object[] var76 = Registry.emptyArgs();
         long var46 = 183196893795195206L;
         Object[] var45 = var76;
         var76 = Ref.h(183196893795195206L, var45, var46);

         try {
            var78 = (Integer)var76;
         } catch (InvocationTargetException var49) {
            throw var49.getTargetException();
         }

         if (var78 == var5) {
            Object var47 = 172194713795712998L;
            var59 = (Color)Ref.g(172194713795712998L, var47);
         }

         this.setBackground(var59);
      }

      return this;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -6667) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 42;
               break;
            case 1:
               var10000 = 12;
               break;
            case 2:
               var10000 = 64;
               break;
            case 3:
               var10000 = 226;
               break;
            case 4:
               var10000 = 54;
               break;
            case 5:
               var10000 = 232;
               break;
            case 6:
               var10000 = 40;
               break;
            case 7:
               var10000 = 44;
               break;
            case 8:
               var10000 = 110;
               break;
            case 9:
               var10000 = 254;
               break;
            case 10:
               var10000 = 172;
               break;
            case 11:
               var10000 = 160;
               break;
            case 12:
               var10000 = 102;
               break;
            case 13:
               var10000 = 164;
               break;
            case 14:
               var10000 = 243;
               break;
            case 15:
               var10000 = 181;
               break;
            case 16:
               var10000 = 146;
               break;
            case 17:
               var10000 = 170;
               break;
            case 18:
               var10000 = 180;
               break;
            case 19:
               var10000 = 106;
               break;
            case 20:
               var10000 = 91;
               break;
            case 21:
               var10000 = 124;
               break;
            case 22:
               var10000 = 49;
               break;
            case 23:
               var10000 = 227;
               break;
            case 24:
               var10000 = 252;
               break;
            case 25:
               var10000 = 246;
               break;
            case 26:
               var10000 = 20;
               break;
            case 27:
               var10000 = 107;
               break;
            case 28:
               var10000 = 46;
               break;
            case 29:
               var10000 = 178;
               break;
            case 30:
               var10000 = 204;
               break;
            case 31:
               var10000 = 191;
               break;
            case 32:
               var10000 = 4;
               break;
            case 33:
               var10000 = 98;
               break;
            case 34:
               var10000 = 130;
               break;
            case 35:
               var10000 = 120;
               break;
            case 36:
               var10000 = 21;
               break;
            case 37:
               var10000 = 7;
               break;
            case 38:
               var10000 = 225;
               break;
            case 39:
               var10000 = 182;
               break;
            case 40:
               var10000 = 138;
               break;
            case 41:
               var10000 = 29;
               break;
            case 42:
               var10000 = 83;
               break;
            case 43:
               var10000 = 163;
               break;
            case 44:
               var10000 = 109;
               break;
            case 45:
               var10000 = 185;
               break;
            case 46:
               var10000 = 216;
               break;
            case 47:
               var10000 = 45;
               break;
            case 48:
               var10000 = 135;
               break;
            case 49:
               var10000 = 116;
               break;
            case 50:
               var10000 = 113;
               break;
            case 51:
               var10000 = 90;
               break;
            case 52:
               var10000 = 173;
               break;
            case 53:
               var10000 = 79;
               break;
            case 54:
               var10000 = 97;
               break;
            case 55:
               var10000 = 126;
               break;
            case 56:
               var10000 = 70;
               break;
            case 57:
               var10000 = 205;
               break;
            case 58:
               var10000 = 111;
               break;
            case 59:
               var10000 = 59;
               break;
            case 60:
               var10000 = 251;
               break;
            case 61:
               var10000 = 5;
               break;
            case 62:
               var10000 = 235;
               break;
            case 63:
               var10000 = 30;
               break;
            case 64:
               var10000 = 89;
               break;
            case 65:
               var10000 = 196;
               break;
            case 66:
               var10000 = 186;
               break;
            case 67:
               var10000 = 214;
               break;
            case 68:
               var10000 = 34;
               break;
            case 69:
               var10000 = 212;
               break;
            case 70:
               var10000 = 176;
               break;
            case 71:
               var10000 = 247;
               break;
            case 72:
               var10000 = 141;
               break;
            case 73:
               var10000 = 87;
               break;
            case 74:
               var10000 = 36;
               break;
            case 75:
               var10000 = 148;
               break;
            case 76:
               var10000 = 188;
               break;
            case 77:
               var10000 = 233;
               break;
            case 78:
               var10000 = 33;
               break;
            case 79:
               var10000 = 92;
               break;
            case 80:
               var10000 = 153;
               break;
            case 81:
               var10000 = 167;
               break;
            case 82:
               var10000 = 81;
               break;
            case 83:
               var10000 = 175;
               break;
            case 84:
               var10000 = 179;
               break;
            case 85:
               var10000 = 39;
               break;
            case 86:
               var10000 = 66;
               break;
            case 87:
               var10000 = 136;
               break;
            case 88:
               var10000 = 183;
               break;
            case 89:
               var10000 = 69;
               break;
            case 90:
               var10000 = 201;
               break;
            case 91:
               var10000 = 19;
               break;
            case 92:
               var10000 = 142;
               break;
            case 93:
               var10000 = 86;
               break;
            case 94:
               var10000 = 11;
               break;
            case 95:
               var10000 = 93;
               break;
            case 96:
               var10000 = 230;
               break;
            case 97:
               var10000 = 206;
               break;
            case 98:
               var10000 = 23;
               break;
            case 99:
               var10000 = 169;
               break;
            case 100:
               var10000 = 237;
               break;
            case 101:
               var10000 = 253;
               break;
            case 102:
               var10000 = 100;
               break;
            case 103:
               var10000 = 55;
               break;
            case 104:
               var10000 = 43;
               break;
            case 105:
               var10000 = 71;
               break;
            case 106:
               var10000 = 215;
               break;
            case 107:
               var10000 = 155;
               break;
            case 108:
               var10000 = 0;
               break;
            case 109:
               var10000 = 159;
               break;
            case 110:
               var10000 = 51;
               break;
            case 111:
               var10000 = 26;
               break;
            case 112:
               var10000 = 197;
               break;
            case 113:
               var10000 = 140;
               break;
            case 114:
               var10000 = 77;
               break;
            case 115:
               var10000 = 195;
               break;
            case 116:
               var10000 = 13;
               break;
            case 117:
               var10000 = 152;
               break;
            case 118:
               var10000 = 41;
               break;
            case 119:
               var10000 = 210;
               break;
            case 120:
               var10000 = 80;
               break;
            case 121:
               var10000 = 127;
               break;
            case 122:
               var10000 = 117;
               break;
            case 123:
               var10000 = 61;
               break;
            case 124:
               var10000 = 174;
               break;
            case 125:
               var10000 = 105;
               break;
            case 126:
               var10000 = 27;
               break;
            case 127:
               var10000 = 95;
               break;
            case 128:
               var10000 = 53;
               break;
            case 129:
               var10000 = 6;
               break;
            case 130:
               var10000 = 112;
               break;
            case 131:
               var10000 = 24;
               break;
            case 132:
               var10000 = 242;
               break;
            case 133:
               var10000 = 131;
               break;
            case 134:
               var10000 = 50;
               break;
            case 135:
               var10000 = 122;
               break;
            case 136:
               var10000 = 222;
               break;
            case 137:
               var10000 = 229;
               break;
            case 138:
               var10000 = 162;
               break;
            case 139:
               var10000 = 177;
               break;
            case 140:
               var10000 = 114;
               break;
            case 141:
               var10000 = 190;
               break;
            case 142:
               var10000 = 158;
               break;
            case 143:
               var10000 = 2;
               break;
            case 144:
               var10000 = 198;
               break;
            case 145:
               var10000 = 68;
               break;
            case 146:
               var10000 = 58;
               break;
            case 147:
               var10000 = 9;
               break;
            case 148:
               var10000 = 38;
               break;
            case 149:
               var10000 = 234;
               break;
            case 150:
               var10000 = 203;
               break;
            case 151:
               var10000 = 184;
               break;
            case 152:
               var10000 = 28;
               break;
            case 153:
               var10000 = 57;
               break;
            case 154:
               var10000 = 31;
               break;
            case 155:
               var10000 = 119;
               break;
            case 156:
               var10000 = 88;
               break;
            case 157:
               var10000 = 128;
               break;
            case 158:
               var10000 = 239;
               break;
            case 159:
               var10000 = 154;
               break;
            case 160:
               var10000 = 223;
               break;
            case 161:
               var10000 = 241;
               break;
            case 162:
               var10000 = 194;
               break;
            case 163:
               var10000 = 74;
               break;
            case 164:
               var10000 = 32;
               break;
            case 165:
               var10000 = 171;
               break;
            case 166:
               var10000 = 73;
               break;
            case 167:
               var10000 = 250;
               break;
            case 168:
               var10000 = 248;
               break;
            case 169:
               var10000 = 103;
               break;
            case 170:
               var10000 = 193;
               break;
            case 171:
               var10000 = 3;
               break;
            case 172:
               var10000 = 72;
               break;
            case 173:
               var10000 = 228;
               break;
            case 174:
               var10000 = 236;
               break;
            case 175:
               var10000 = 15;
               break;
            case 176:
               var10000 = 129;
               break;
            case 177:
               var10000 = 63;
               break;
            case 178:
               var10000 = 85;
               break;
            case 179:
               var10000 = 8;
               break;
            case 180:
               var10000 = 151;
               break;
            case 181:
               var10000 = 202;
               break;
            case 182:
               var10000 = 76;
               break;
            case 183:
               var10000 = 121;
               break;
            case 184:
               var10000 = 82;
               break;
            case 185:
               var10000 = 192;
               break;
            case 186:
               var10000 = 37;
               break;
            case 187:
               var10000 = 145;
               break;
            case 188:
               var10000 = 139;
               break;
            case 189:
               var10000 = 187;
               break;
            case 190:
               var10000 = 60;
               break;
            case 191:
               var10000 = 134;
               break;
            case 192:
               var10000 = 150;
               break;
            case 193:
               var10000 = 25;
               break;
            case 194:
               var10000 = 240;
               break;
            case 195:
               var10000 = 47;
               break;
            case 196:
               var10000 = 207;
               break;
            case 197:
               var10000 = 125;
               break;
            case 198:
               var10000 = 156;
               break;
            case 199:
               var10000 = 147;
               break;
            case 200:
               var10000 = 52;
               break;
            case 201:
               var10000 = 144;
               break;
            case 202:
               var10000 = 10;
               break;
            case 203:
               var10000 = 84;
               break;
            case 204:
               var10000 = 143;
               break;
            case 205:
               var10000 = 211;
               break;
            case 206:
               var10000 = 199;
               break;
            case 207:
               var10000 = 132;
               break;
            case 208:
               var10000 = 245;
               break;
            case 209:
               var10000 = 213;
               break;
            case 210:
               var10000 = 115;
               break;
            case 211:
               var10000 = 1;
               break;
            case 212:
               var10000 = 94;
               break;
            case 213:
               var10000 = 35;
               break;
            case 214:
               var10000 = 48;
               break;
            case 215:
               var10000 = 118;
               break;
            case 216:
               var10000 = 166;
               break;
            case 217:
               var10000 = 220;
               break;
            case 218:
               var10000 = 17;
               break;
            case 219:
               var10000 = 168;
               break;
            case 220:
               var10000 = 255;
               break;
            case 221:
               var10000 = 231;
               break;
            case 222:
               var10000 = 133;
               break;
            case 223:
               var10000 = 217;
               break;
            case 224:
               var10000 = 108;
               break;
            case 225:
               var10000 = 221;
               break;
            case 226:
               var10000 = 137;
               break;
            case 227:
               var10000 = 99;
               break;
            case 228:
               var10000 = 208;
               break;
            case 229:
               var10000 = 249;
               break;
            case 230:
               var10000 = 101;
               break;
            case 231:
               var10000 = 224;
               break;
            case 232:
               var10000 = 161;
               break;
            case 233:
               var10000 = 16;
               break;
            case 234:
               var10000 = 238;
               break;
            case 235:
               var10000 = 14;
               break;
            case 236:
               var10000 = 75;
               break;
            case 237:
               var10000 = 104;
               break;
            case 238:
               var10000 = 18;
               break;
            case 239:
               var10000 = 78;
               break;
            case 240:
               var10000 = 22;
               break;
            case 241:
               var10000 = 67;
               break;
            case 242:
               var10000 = 244;
               break;
            case 243:
               var10000 = 65;
               break;
            case 244:
               var10000 = 189;
               break;
            case 245:
               var10000 = 200;
               break;
            case 246:
               var10000 = 149;
               break;
            case 247:
               var10000 = 165;
               break;
            case 248:
               var10000 = 157;
               break;
            case 249:
               var10000 = 218;
               break;
            case 250:
               var10000 = 209;
               break;
            case 251:
               var10000 = 219;
               break;
            case 252:
               var10000 = 62;
               break;
            case 253:
               var10000 = 96;
               break;
            case 254:
               var10000 = 123;
               break;
            default:
               var10000 = 56;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2228;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "[\u001b9\u00915'ÕJÌ\u0090ÊÓ¾ýDPQà\u0087\u0003ð\u001dö&\u008bª{\u0097Ù¤FåPQè¸eºV\b£¦Ý@l\bXê¤2möÚ\u0006";
      int var12 = "[\u001b9\u00915'ÕJÌ\u0090ÊÓ¾ýDPQà\u0087\u0003ð\u001dö&\u008bª{\u0097Ù¤FåPQè¸eºV\b£¦Ý@l\bXê¤2möÚ\u0006".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 90;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 90;
               var10006 = var14;
            } else {
               var27 = 90;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 90;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 16;
                     break;
                  case 1:
                     var47 = 35;
                     break;
                  case 2:
                     var47 = 65;
                     break;
                  case 3:
                     var47 = 42;
                     break;
                  case 4:
                     var47 = 64;
                     break;
                  case 5:
                     var47 = 62;
                     break;
                  default:
                     var47 = 49;
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
            b = var13;
            c = new String[3];
            long var0 = 6599526607098961029L;
            long[] var6 = new long[14];
            int var3 = 0;
            String var4 = "\u008c]0\u0085¨H½\u0097{\u0081+4C\u000bì/fÀ4çÍº\u000bV§Z\u008cAn\u001ekî7·\u009fC\u009fÍ'%\u001bè{\u0012ì\"\u001cY¯@\u0088+ùhÀ\u009bÎ8\u0016xMéyèf«\u001eôükß\n¨¯ï+\u00984~-O¨\u001eøÿ£µ²a\u0002;ó\u0094\u0013\u0083Â";
            int var5 = "\u008c]0\u0085¨H½\u0097{\u0081+4C\u000bì/fÀ4çÍº\u000bV§Z\u008cAn\u001ekî7·\u009fC\u009fÍ'%\u001bè{\u0012ì\"\u001cY¯@\u0088+ùhÀ\u009bÎ8\u0016xMéyèf«\u001eôükß\n¨¯ï+\u00984~-O¨\u001eøÿ£µ²a\u0002;ó\u0094\u0013\u0083Â"
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
                           e = new Integer[14];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "\u0006«÷ºp\u009fT©¸ÿf:ã2\u0019Á";
                        var5 = "\u0006«÷ºp\u009fT©¸ÿf:ã2\u0019Á".length();
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





