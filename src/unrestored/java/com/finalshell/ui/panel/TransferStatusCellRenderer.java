package com.finalshell.ui.panel;

import com.finalshell.core.L0;
import com.finalshell.core.YI;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import net.miginfocom.swing.MigLayout;

public class TransferStatusCellRenderer extends JPanel implements TableCellRenderer {
   public JLabel e;
   public JLabel r;
   public YI W;
   public JPanel x;
   public Color X;
   public LA b;
   public T2 i;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] f;

   public TransferStatusCellRenderer() {
      Color var10001 = new Color(0.0F, 0.0F, 0.0F, 0.0F);
      long var2 = 462186808856815754L;
      Color var1 = var10001;
      Ref.s(462186808856815754L, var1, var2);
      this.setOpaque(true);
      this.setLayout(new MigLayout(a(9146, -6958), "", a(9140, -12130)));
      this.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 3));
      JLabel var10002 = new JLabel();
      long var4 = 249698164058145124L;
      JLabel var3 = var10002;
      Ref.s(249698164058145124L, var3, var4);
      Object var5 = 249698164058145124L;
      ((JLabel)Ref.g(249698164058145124L, var5)).setMinimumSize(new Dimension(a(16923, 5685501918514098405L), a(6959, 108926441236097495L)));
      Object var7 = 249698164058145124L;
      ((JLabel)Ref.g(249698164058145124L, var7)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
      Object var9 = 249698164058145124L;
      this.add((JLabel)Ref.g(249698164058145124L, var9), a(9142, -27446));
      Object var11 = 249698164058145124L;
      ((JLabel)Ref.g(249698164058145124L, var11)).setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      Object var13 = 249698164058145124L;
      JLabel var10007 = (JLabel)Ref.g(249698164058145124L, var13);
      Object var15 = 462186808856815754L;
      this.setBackground((Color)Ref.g(462186808856815754L, var15));
      JPanel var10009 = new JPanel();
      long var18 = 313480026652328854L;
      JPanel var17 = var10009;
      Ref.s(313480026652328854L, var17, var18);
      Object var19 = 313480026652328854L;
      this.add((JPanel)Ref.g(313480026652328854L, var19), a(9141, 30831));
      Object var21 = 313480026652328854L;
      JPanel var10011 = (JPanel)Ref.g(313480026652328854L, var21);
      Object var23 = 462186808856815754L;
      this.setBackground((Color)Ref.g(462186808856815754L, var23));
      Object var25 = 313480026652328854L;
      ((JPanel)Ref.g(313480026652328854L, var25)).setLayout(new MigLayout(a(9149, 27393), "", ""));
      Object var27 = 313480026652328854L;
      ((JPanel)Ref.g(313480026652328854L, var27)).setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      Registry.packArgs("\uf062");
      long var29 = 360256375153447639L;
      Object var10016 = Ref.h2(360256375153447639L, var29);
      long var32 = 423334177559132737L;
      Object var31 = var10016;
      Ref.s(423334177559132737L, var31, var32);
      Object var33 = 423334177559132737L;
      ((T2)Ref.g(423334177559132737L, var33)).setFont((Font)Registry.lookupField(243979725756538831L).get(null));
      Object var35 = 423334177559132737L;
      ((T2)Ref.g(423334177559132737L, var35)).setHorizontalAlignment(2);
      Object var37 = 423334177559132737L;
      ((T2)Ref.g(423334177559132737L, var37)).setOpaque(false);
      LA var10020 = new LA();
      long var40 = 371063663716283206L;
      LA var39 = var10020;
      Ref.s(371063663716283206L, var39, var40);
      Object var41 = 371063663716283206L;
      ((LA)Ref.g(371063663716283206L, var41)).setMaximum(a(31228, 6034658029057248007L));
      Object var43 = 371063663716283206L;
      ((LA)Ref.g(371063663716283206L, var43)).setValue(a(21472, 2215926690654626077L));
      Object var45 = 371063663716283206L;
      LA var10023 = (LA)Ref.g(371063663716283206L, var45);
      Object var47 = 462186808856815754L;
      this.setBackground((Color)Ref.g(462186808856815754L, var47));
      Object var49 = 371063663716283206L;
      ((LA)Ref.g(371063663716283206L, var49)).setMinimumSize(new Dimension(a(13014, 7065380020029767722L), 0));
      Object var51 = 371063663716283206L;
      ((LA)Ref.g(371063663716283206L, var51)).setMaximumSize(new Dimension(a(9640, 8268391832932603735L), a(25945, 7099509491854055328L)));
      Object var53 = 313480026652328854L;
      JPanel var10027 = (JPanel)Ref.g(313480026652328854L, var53);
      Object var55 = 371063663716283206L;
      this.add((LA)Ref.g(371063663716283206L, var55), a(9151, -25612));
      Object var57 = 371063663716283206L;
      ((LA)Ref.g(371063663716283206L, var57)).setLayout(new MigLayout(a(9148, -28436), a(9150, -1950), ""));
      Object var59 = 371063663716283206L;
      LA var10030 = (LA)Ref.g(371063663716283206L, var59);
      Object var61 = 423334177559132737L;
      this.add((T2)Ref.g(423334177559132737L, var61), a(9147, 25392));
      JLabel var10032 = new JLabel();
      long var64 = 478867394288887476L;
      JLabel var63 = var10032;
      Ref.s(478867394288887476L, var63, var64);
      Object var65 = 371063663716283206L;
      LA var10033 = (LA)Ref.g(371063663716283206L, var65);
      Object var67 = 478867394288887476L;
      this.add((JLabel)Ref.g(478867394288887476L, var67), "");
      Object var69 = 478867394288887476L;
      ((JLabel)Ref.g(478867394288887476L, var69)).setHorizontalAlignment(4);
      Object var71 = 478867394288887476L;
      ((JLabel)Ref.g(478867394288887476L, var71)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
   }

   public void z(YI var1, JTable var2, int var3) {
      boolean var100;
      Integer var111;
      Long var116;
      Long var118;
      boolean var123;
      Long var131;
      Long var134;
      L0 var97;
      SelectDownloadFolderPanel.O$arrint();
      long var14 = 334292599326061570L;
      Ref.s(334292599326061570L, var1, var14);
      int var5 = this.getPreferredSize().height;
      YI var10001 = var2.getRowHeight(var3);
      if (this == null) {
         if (var10001 != var5) {
            var2.setRowHeight(var3, var5);
         }

         var10001 = var1;
         Object[] var10002 = Registry.emptyArgs();
         long var16 = 532275517761561192L;
         Object[] var15 = var10002;
         var10002 = Ref.h(532275517761561192L, var15, var16);

         try {
         } catch (InvocationTargetException var90) {
            throw var90.getTargetException();
         }
      }

      YI var6;
      String var7;
      label207: {
         var6 = var10001;
         var7 = "";
         var10001 = var6;
         int var94 = Registry.lookupField(635857280906233483L).getInt(null);
         if (this == null) {
            if (var6 == var94) {
               Object[] var95 = Registry.emptyArgs();
               long var18 = 546446528404082025L;
               Object[] var17 = var95;
               Object var96 = Ref.h(546446528404082025L, var17, var18);

               try {
                  var97 = (L0)var96;
               } catch (InvocationTargetException var89) {
                  throw var89.getTargetException();
               }

               if (var97 == null) {
                  break label207;
               }

               new StringBuilder();
               String var10004 = (String)(Registry.emptyArgs());
               long var20 = 150907514571562743L;
               Object var19 = var10004;
               var10004 = Ref.h(150907514571562743L, var19, var20);

               try {
                  var10004 = (String)var10004;
               } catch (InvocationTargetException var88) {
                  throw var88.getTargetException();
               }

               var1.append((String)var10004).append(a(9145, -694));
               Object[] var10005 = Registry.emptyArgs();
               long var22 = 546446528404082025L;
               Object[] var21 = var10005;
               Ref.h(546446528404082025L, var21, var22);
               Object var10006 = Registry.emptyArgs();
               long var24 = 394913323035817203L;
               Object var23 = var10006;
               var10006 = Ref.h(394913323035817203L, var23, var24);

               try {
                  var111 = (Integer)var10006;
               } catch (InvocationTargetException var87) {
                  throw var87.getTargetException();
               }

               var10006 = Registry.e((long)var111);
               long var25 = 148259110884974759L;
               Object var10007 = Ref.h2(148259110884974759L, var25);

               try {
                  var10007 = (String)var10007;
               } catch (InvocationTargetException var86) {
                  throw var86.getTargetException();
               }

               ((java.lang.StringBuilder)var10006).append((String)var10007).append(a(9136, 22390));
               Object var10008 = Registry.emptyArgs();
               long var28 = 361359281152527627L;
               Object var27 = var10008;
               var10008 = Ref.h(361359281152527627L, var27, var28);

               try {
                  var118 = (Long)var10008;
               } catch (InvocationTargetException var85) {
                  throw var85.getTargetException();
               }

               var10008 = Registry.e(var118);
               long var29 = 148259110884974759L;
               Object var10009 = Ref.h2(148259110884974759L, var29);

               try {
                  var10009 = (String)var10009;
               } catch (InvocationTargetException var84) {
                  throw var84.getTargetException();
               }

               var7 = ((java.lang.StringBuilder)var10008).append((String)var10009).toString();
               if (this == null) {
                  break label207;
               }
            }

            var10001 = var6;
            var94 = Registry.lookupField(476761782289979268L).getInt(null);
         }

         if (this == null) {
            if (var10001 == var94) {
               var7 = a(9137, -12579);
               if (this == null) {
                  break label207;
               }
            }

            var10001 = var6;
            var94 = Registry.lookupField(474112474147008326L).getInt(null);
         }

         if (var10001 == var94) {
            var7 = a(9143, 5138);
         }
      }

      String var91;
      label209: {
         var91 = null;
         if (this == null) {
            Object var98 = Registry.emptyArgs();
            long var32 = 161763971655686270L;
            Object var31 = var98;
            var98 = Ref.h(161763971655686270L, var31, var32);

            try {
               var100 = (Boolean)var98;
            } catch (InvocationTargetException var83) {
               throw var83.getTargetException();
            }

            if (var100) {
               Object var33 = 423334177559132737L;
               ((T2)Ref.g(423334177559132737L, var33)).setText("\uf063");
               Object[] var105 = Registry.emptyArgs();
               long var36 = 191716730601734423L;
               Object[] var35 = var105;
               Registry.packArgs(Ref.h(191716730601734423L, var35, var36));
               long var37 = 422950346059317716L;
               Object var106 = Ref.h2(422950346059317716L, var37);

               try {
                  var106 = (String)var106;
               } catch (InvocationTargetException var82) {
                  throw var82.getTargetException();
               }

               var91 = (String)var106;
               break label209;
            }

            Object var39 = 423334177559132737L;
            ((T2)Ref.g(423334177559132737L, var39)).setText("\uf062");
         }

         Object[] var101 = Registry.emptyArgs();
         long var42 = 483977999197402540L;
         Object[] var41 = var101;
         Registry.packArgs(Ref.h(483977999197402540L, var41, var42));
         long var43 = 422950346059317716L;
         Object var10003 = Ref.h2(422950346059317716L, var43);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var81) {
            throw var81.getTargetException();
         }

         var91 = (String)var10003;
      }

      label212: {
         Object var45 = 249698164058145124L;
         ((JLabel)Ref.g(249698164058145124L, var45)).setText(var91);
         Object var47 = 371063663716283206L;
         ((LA)Ref.g(371063663716283206L, var47)).setVisible(true);
         Object var108 = var6;
         if (this == null) {
            if (var6 == Registry.lookupField(364503691566382472L).getInt(null)) {
               var7 = a(9144, -11942);
               Object var49 = 371063663716283206L;
               ((LA)Ref.g(371063663716283206L, var49)).setValue(0);
               Object var51 = 371063663716283206L;
               Ref.g(371063663716283206L, var51);
               Object[] var120 = Registry.packArgs(false);
               long var54 = 394805520504418697L;
               Object[] var53 = var120;
               Ref.h(394805520504418697L, var53, var54);

               try {
                  ;
               } catch (InvocationTargetException var80) {
                  throw var80.getTargetException();
               }

               if (this == null) {
                  break label212;
               }
            }

            var108 = this;
            Object var55 = 371063663716283206L;
            ((LA)Ref.g(371063663716283206L, var55)).getMaximum();
         }

         long var9 = (long)var108;
         int var11 = a(25623, 8548158702698305261L);
         float var109 = 1000.0F;
         Object var114 = Registry.emptyArgs();
         long var58 = 361359281152527627L;
         Object var57 = var114;
         var114 = Ref.h(361359281152527627L, var57, var58);

         try {
            var116 = (Long)var114;
         } catch (InvocationTargetException var79) {
            throw var79.getTargetException();
         }

         float var12 = var1 / (float)var116;
         if (this == null) {
            Object var121 = Registry.emptyArgs();
            long var60 = 361359281152527627L;
            Object var59 = var121;
            var121 = Ref.h(361359281152527627L, var59, var60);

            try {
               var123 = (boolean)((Long)var121);
            } catch (InvocationTargetException var78) {
               throw var78.getTargetException();
            }

            if (var1 != var123) {
               Object var61 = 371063663716283206L;
               LA var124 = (LA)Ref.g(371063663716283206L, var61);
               float var128 = (float)var11 * var12;
               Object var10011 = Registry.emptyArgs();
               long var64 = 361359281152527627L;
               Object var63 = var10011;
               var10011 = Ref.h(361359281152527627L, var63, var64);

               try {
                  var131 = (Long)var10011;
               } catch (InvocationTargetException var77) {
                  throw var77.getTargetException();
               }

               var128.setMaximum((int)(var1 * (float)var131));
            }

            Object var65 = 371063663716283206L;
            LA var125 = (LA)Ref.g(371063663716283206L, var65);
            float var129 = (float)var11 * var12;
            Object var132 = Registry.emptyArgs();
            long var68 = 636391100575588698L;
            Object var67 = var132;
            var132 = Ref.h(636391100575588698L, var67, var68);

            try {
               var134 = (Long)var132;
            } catch (InvocationTargetException var76) {
               throw var76.getTargetException();
            }

            var129.setValue((int)(var1 * (float)var134));
         }

         Object var69 = 371063663716283206L;
         Ref.g(371063663716283206L, var69);
         Object[] var126 = Registry.packArgs(true);
         long var72 = 394805520504418697L;
         Object[] var71 = var126;
         Ref.h(394805520504418697L, var71, var72);

         try {
            ;
         } catch (InvocationTargetException var75) {
            throw var75.getTargetException();
         }
      }

      Object var73 = 478867394288887476L;
      ((JLabel)Ref.g(478867394288887476L, var73)).setText(var7);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      label26: {
         int[] var10000 = SelectDownloadFolderPanel.O$arrint();
         Object var8 = null;
         Object var9 = null;
         int[] var7 = var10000;
         if (var7 == null) {
            if (var3) {
               this.setOpaque(true);
               this.setBackground((Color)Registry.lookupField(136831589974125637L).get(null));
               if (var7 == null) {
                  break label26;
               }
            }

            this.setOpaque(false);
         }

         this.setBackground(Color.white);
      }

      YI var10 = (YI)var2;
      if (var10 != null) {
         Object[] var10001 = Registry.packArgs(var10, var1, var5);
         long var12 = 632588761532829057L;
         Object[] var11 = var10001;
         Ref.h(632588761532829057L, var11, var12);

         try {
            ;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }
      }

      return this;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 9149) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 11;
               break;
            case 1:
               var10000 = 235;
               break;
            case 2:
               var10000 = 64;
               break;
            case 3:
               var10000 = 36;
               break;
            case 4:
               var10000 = 34;
               break;
            case 5:
               var10000 = 234;
               break;
            case 6:
               var10000 = 111;
               break;
            case 7:
               var10000 = 90;
               break;
            case 8:
               var10000 = 186;
               break;
            case 9:
               var10000 = 195;
               break;
            case 10:
               var10000 = 194;
               break;
            case 11:
               var10000 = 120;
               break;
            case 12:
               var10000 = 92;
               break;
            case 13:
               var10000 = 192;
               break;
            case 14:
               var10000 = 142;
               break;
            case 15:
               var10000 = 20;
               break;
            case 16:
               var10000 = 140;
               break;
            case 17:
               var10000 = 69;
               break;
            case 18:
               var10000 = 152;
               break;
            case 19:
               var10000 = 214;
               break;
            case 20:
               var10000 = 193;
               break;
            case 21:
               var10000 = 132;
               break;
            case 22:
               var10000 = 221;
               break;
            case 23:
               var10000 = 171;
               break;
            case 24:
               var10000 = 21;
               break;
            case 25:
               var10000 = 254;
               break;
            case 26:
               var10000 = 133;
               break;
            case 27:
               var10000 = 8;
               break;
            case 28:
               var10000 = 88;
               break;
            case 29:
               var10000 = 32;
               break;
            case 30:
               var10000 = 250;
               break;
            case 31:
               var10000 = 139;
               break;
            case 32:
               var10000 = 225;
               break;
            case 33:
               var10000 = 200;
               break;
            case 34:
               var10000 = 169;
               break;
            case 35:
               var10000 = 227;
               break;
            case 36:
               var10000 = 146;
               break;
            case 37:
               var10000 = 201;
               break;
            case 38:
               var10000 = 153;
               break;
            case 39:
               var10000 = 212;
               break;
            case 40:
               var10000 = 89;
               break;
            case 41:
               var10000 = 125;
               break;
            case 42:
               var10000 = 213;
               break;
            case 43:
               var10000 = 33;
               break;
            case 44:
               var10000 = 199;
               break;
            case 45:
               var10000 = 143;
               break;
            case 46:
               var10000 = 65;
               break;
            case 47:
               var10000 = 241;
               break;
            case 48:
               var10000 = 31;
               break;
            case 49:
               var10000 = 255;
               break;
            case 50:
               var10000 = 252;
               break;
            case 51:
               var10000 = 136;
               break;
            case 52:
               var10000 = 25;
               break;
            case 53:
               var10000 = 175;
               break;
            case 54:
               var10000 = 127;
               break;
            case 55:
               var10000 = 57;
               break;
            case 56:
               var10000 = 67;
               break;
            case 57:
               var10000 = 176;
               break;
            case 58:
               var10000 = 86;
               break;
            case 59:
               var10000 = 13;
               break;
            case 60:
               var10000 = 113;
               break;
            case 61:
               var10000 = 220;
               break;
            case 62:
               var10000 = 6;
               break;
            case 63:
               var10000 = 96;
               break;
            case 64:
               var10000 = 206;
               break;
            case 65:
               var10000 = 62;
               break;
            case 66:
               var10000 = 112;
               break;
            case 67:
               var10000 = 76;
               break;
            case 68:
               var10000 = 207;
               break;
            case 69:
               var10000 = 63;
               break;
            case 70:
               var10000 = 16;
               break;
            case 71:
               var10000 = 95;
               break;
            case 72:
               var10000 = 10;
               break;
            case 73:
               var10000 = 81;
               break;
            case 74:
               var10000 = 30;
               break;
            case 75:
               var10000 = 223;
               break;
            case 76:
               var10000 = 49;
               break;
            case 77:
               var10000 = 37;
               break;
            case 78:
               var10000 = 114;
               break;
            case 79:
               var10000 = 72;
               break;
            case 80:
               var10000 = 119;
               break;
            case 81:
               var10000 = 197;
               break;
            case 82:
               var10000 = 17;
               break;
            case 83:
               var10000 = 150;
               break;
            case 84:
               var10000 = 247;
               break;
            case 85:
               var10000 = 155;
               break;
            case 86:
               var10000 = 236;
               break;
            case 87:
               var10000 = 101;
               break;
            case 88:
               var10000 = 158;
               break;
            case 89:
               var10000 = 185;
               break;
            case 90:
               var10000 = 204;
               break;
            case 91:
               var10000 = 118;
               break;
            case 92:
               var10000 = 244;
               break;
            case 93:
               var10000 = 159;
               break;
            case 94:
               var10000 = 231;
               break;
            case 95:
               var10000 = 160;
               break;
            case 96:
               var10000 = 124;
               break;
            case 97:
               var10000 = 48;
               break;
            case 98:
               var10000 = 93;
               break;
            case 99:
               var10000 = 58;
               break;
            case 100:
               var10000 = 105;
               break;
            case 101:
               var10000 = 70;
               break;
            case 102:
               var10000 = 210;
               break;
            case 103:
               var10000 = 104;
               break;
            case 104:
               var10000 = 128;
               break;
            case 105:
               var10000 = 219;
               break;
            case 106:
               var10000 = 29;
               break;
            case 107:
               var10000 = 166;
               break;
            case 108:
               var10000 = 229;
               break;
            case 109:
               var10000 = 172;
               break;
            case 110:
               var10000 = 237;
               break;
            case 111:
               var10000 = 230;
               break;
            case 112:
               var10000 = 1;
               break;
            case 113:
               var10000 = 24;
               break;
            case 114:
               var10000 = 157;
               break;
            case 115:
               var10000 = 55;
               break;
            case 116:
               var10000 = 97;
               break;
            case 117:
               var10000 = 246;
               break;
            case 118:
               var10000 = 78;
               break;
            case 119:
               var10000 = 138;
               break;
            case 120:
               var10000 = 28;
               break;
            case 121:
               var10000 = 60;
               break;
            case 122:
               var10000 = 103;
               break;
            case 123:
               var10000 = 39;
               break;
            case 124:
               var10000 = 77;
               break;
            case 125:
               var10000 = 182;
               break;
            case 126:
               var10000 = 121;
               break;
            case 127:
               var10000 = 196;
               break;
            case 128:
               var10000 = 177;
               break;
            case 129:
               var10000 = 134;
               break;
            case 130:
               var10000 = 181;
               break;
            case 131:
               var10000 = 26;
               break;
            case 132:
               var10000 = 84;
               break;
            case 133:
               var10000 = 5;
               break;
            case 134:
               var10000 = 14;
               break;
            case 135:
               var10000 = 174;
               break;
            case 136:
               var10000 = 80;
               break;
            case 137:
               var10000 = 216;
               break;
            case 138:
               var10000 = 135;
               break;
            case 139:
               var10000 = 167;
               break;
            case 140:
               var10000 = 100;
               break;
            case 141:
               var10000 = 232;
               break;
            case 142:
               var10000 = 154;
               break;
            case 143:
               var10000 = 0;
               break;
            case 144:
               var10000 = 144;
               break;
            case 145:
               var10000 = 99;
               break;
            case 146:
               var10000 = 19;
               break;
            case 147:
               var10000 = 137;
               break;
            case 148:
               var10000 = 208;
               break;
            case 149:
               var10000 = 75;
               break;
            case 150:
               var10000 = 238;
               break;
            case 151:
               var10000 = 59;
               break;
            case 152:
               var10000 = 35;
               break;
            case 153:
               var10000 = 184;
               break;
            case 154:
               var10000 = 149;
               break;
            case 155:
               var10000 = 91;
               break;
            case 156:
               var10000 = 205;
               break;
            case 157:
               var10000 = 122;
               break;
            case 158:
               var10000 = 190;
               break;
            case 159:
               var10000 = 191;
               break;
            case 160:
               var10000 = 123;
               break;
            case 161:
               var10000 = 52;
               break;
            case 162:
               var10000 = 242;
               break;
            case 163:
               var10000 = 130;
               break;
            case 164:
               var10000 = 23;
               break;
            case 165:
               var10000 = 248;
               break;
            case 166:
               var10000 = 73;
               break;
            case 167:
               var10000 = 145;
               break;
            case 168:
               var10000 = 7;
               break;
            case 169:
               var10000 = 251;
               break;
            case 170:
               var10000 = 187;
               break;
            case 171:
               var10000 = 126;
               break;
            case 172:
               var10000 = 44;
               break;
            case 173:
               var10000 = 168;
               break;
            case 174:
               var10000 = 98;
               break;
            case 175:
               var10000 = 2;
               break;
            case 176:
               var10000 = 3;
               break;
            case 177:
               var10000 = 198;
               break;
            case 178:
               var10000 = 68;
               break;
            case 179:
               var10000 = 12;
               break;
            case 180:
               var10000 = 115;
               break;
            case 181:
               var10000 = 82;
               break;
            case 182:
               var10000 = 202;
               break;
            case 183:
               var10000 = 42;
               break;
            case 184:
               var10000 = 27;
               break;
            case 185:
               var10000 = 141;
               break;
            case 186:
               var10000 = 83;
               break;
            case 187:
               var10000 = 56;
               break;
            case 188:
               var10000 = 233;
               break;
            case 189:
               var10000 = 61;
               break;
            case 190:
               var10000 = 53;
               break;
            case 191:
               var10000 = 217;
               break;
            case 192:
               var10000 = 215;
               break;
            case 193:
               var10000 = 222;
               break;
            case 194:
               var10000 = 162;
               break;
            case 195:
               var10000 = 94;
               break;
            case 196:
               var10000 = 71;
               break;
            case 197:
               var10000 = 40;
               break;
            case 198:
               var10000 = 224;
               break;
            case 199:
               var10000 = 209;
               break;
            case 200:
               var10000 = 66;
               break;
            case 201:
               var10000 = 107;
               break;
            case 202:
               var10000 = 183;
               break;
            case 203:
               var10000 = 189;
               break;
            case 204:
               var10000 = 117;
               break;
            case 205:
               var10000 = 188;
               break;
            case 206:
               var10000 = 38;
               break;
            case 207:
               var10000 = 79;
               break;
            case 208:
               var10000 = 170;
               break;
            case 209:
               var10000 = 109;
               break;
            case 210:
               var10000 = 50;
               break;
            case 211:
               var10000 = 165;
               break;
            case 212:
               var10000 = 54;
               break;
            case 213:
               var10000 = 102;
               break;
            case 214:
               var10000 = 18;
               break;
            case 215:
               var10000 = 4;
               break;
            case 216:
               var10000 = 43;
               break;
            case 217:
               var10000 = 203;
               break;
            case 218:
               var10000 = 51;
               break;
            case 219:
               var10000 = 9;
               break;
            case 220:
               var10000 = 15;
               break;
            case 221:
               var10000 = 106;
               break;
            case 222:
               var10000 = 74;
               break;
            case 223:
               var10000 = 110;
               break;
            case 224:
               var10000 = 218;
               break;
            case 225:
               var10000 = 240;
               break;
            case 226:
               var10000 = 116;
               break;
            case 227:
               var10000 = 87;
               break;
            case 228:
               var10000 = 151;
               break;
            case 229:
               var10000 = 226;
               break;
            case 230:
               var10000 = 173;
               break;
            case 231:
               var10000 = 129;
               break;
            case 232:
               var10000 = 46;
               break;
            case 233:
               var10000 = 178;
               break;
            case 234:
               var10000 = 253;
               break;
            case 235:
               var10000 = 108;
               break;
            case 236:
               var10000 = 131;
               break;
            case 237:
               var10000 = 45;
               break;
            case 238:
               var10000 = 243;
               break;
            case 239:
               var10000 = 164;
               break;
            case 240:
               var10000 = 245;
               break;
            case 241:
               var10000 = 249;
               break;
            case 242:
               var10000 = 148;
               break;
            case 243:
               var10000 = 179;
               break;
            case 244:
               var10000 = 163;
               break;
            case 245:
               var10000 = 211;
               break;
            case 246:
               var10000 = 47;
               break;
            case 247:
               var10000 = 85;
               break;
            case 248:
               var10000 = 147;
               break;
            case 249:
               var10000 = 156;
               break;
            case 250:
               var10000 = 228;
               break;
            case 251:
               var10000 = 161;
               break;
            case 252:
               var10000 = 22;
               break;
            case 253:
               var10000 = 180;
               break;
            case 254:
               var10000 = 239;
               break;
            default:
               var10000 = 41;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29438;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[14];
      int var11 = 0;
      String var10 = "g\u0093yõ²\u0080À<¤#Ñ\u0096º\u0098)\u000eúG\u00986d\t\u0088Ôè÷\u00163\u0015¢>p¬\b\u0092x\u0012Ö]]×Êã\u009fó\u0097V¼\u0094ö\u0097`TKzë\u001e';»\u0016\u0003\u009cs\u0087\u009bu4V\u0018\u0093ÎÆÕµ±wºù¢Ó\u000f\u0094¾:\u009d\u0005\u0005«`ß&¤\u0002\u0086\u0013\u0003巛宁扥\fàöC¯\u001c«\u0090aç©»Í\u0019Q3¬¡K\u001bê#b{\u008b\b2z\u0081\u009e(HÜ\u0089Ñ4\u0087 Ô\u001a±ê\u0098²Ë-pd¨\u007fNÀ©\u001fÏîjG]'\u001dP\u001bsÚÖ\u0005R{è\u0083\u0082\u0002奓贄\u0004\u0089\u009fkþ";
      int var12 = "g\u0093yõ²\u0080À<¤#Ñ\u0096º\u0098)\u000eúG\u00986d\t\u0088Ôè÷\u00163\u0015¢>p¬\b\u0092x\u0012Ö]]×Êã\u009fó\u0097V¼\u0094ö\u0097`TKzë\u001e';»\u0016\u0003\u009cs\u0087\u009bu4V\u0018\u0093ÎÆÕµ±wºù¢Ó\u000f\u0094¾:\u009d\u0005\u0005«`ß&¤\u0002\u0086\u0013\u0003巛宁扥\fàöC¯\u001c«\u0090aç©»Í\u0019Q3¬¡K\u001bê#b{\u008b\b2z\u0081\u009e(HÜ\u0089Ñ4\u0087 Ô\u001a±ê\u0098²Ë-pd¨\u007fNÀ©\u001fÏîjG]'\u001dP\u001bsÚÖ\u0005R{è\u0083\u0082\u0002奓贄\u0004\u0089\u009fkþ"
         .length();
      char var9 = 14;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 14;
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
                        var65 = 34;
                        break;
                     case 1:
                        var65 = 127;
                        break;
                     case 2:
                        var65 = 41;
                        break;
                     case 3:
                        var65 = 97;
                        break;
                     case 4:
                        var65 = 30;
                        break;
                     case 5:
                        var65 = 103;
                        break;
                     default:
                        var65 = 64;
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
                     c = new String[14];
                     long var0 = 3496892983531354618L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "\u0083\u00adÿ¶\n$\u0089-e¤ÖoUA}%8NéÕ\u009dõyâ\u000eL\u0000`\u00887\u0098ùùj\u0016qé\u000e\b\u0007\u0080ç°\u0097\u0006\u001b²»";
                     int var5 = "\u0083\u00adÿ¶\n$\u0089-e¤ÖoUA}%8NéÕ\u009dõyâ\u000eL\u0000`\u00887\u0098ùùj\u0016qé\u000e\b\u0007\u0080ç°\u0097\u0006\u001b²»"
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
                                    f = new Integer[8];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\tr\tdHwP'1üRw¹\u0088®D";
                                 var5 = "\tr\tdHwP'1üRw¹\u0088®D".length();
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

                  var10 = "筄忄\u0003d\u0004Ú";
                  var12 = "筄忄\u0003d\u0004Ú".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 55;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





