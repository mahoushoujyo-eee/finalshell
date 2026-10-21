package com.finalshell.ui.dialog;

import com.finalshell.core.KD;
import com.finalshell.core.Km2;
import com.finalshell.core.T__2;
import com.finalshell.core.Zv2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.FU3;
import com.finalshell.ui.listener.Jt2;
import com.finalshell.ui.listener.QO;
import com.finalshell.ui.listener.YR3;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Kl4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Address;
import com.finalshell.ui.panel.Connection4;
import com.finalshell.ui.panel.PathPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class EditDialog2 extends JDialog {
   public PathPanel q;
   public static int O;
   public static int v;
   public int N;
   public static int M;
   public static int l;
   public static int j;
   public static int g;
   public int C;
   public String t;
   public Km2 A;
   public Kl4 H;
   public ArrayList S;
   public String k;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static void main(String[] var0) {
      EditDialog2 var1 = new EditDialog2(Registry.lookupField(530934992944035866L).getInt(null), null, "", new T__2(), false);
      var1.setTitle(a(16469, -23870));
      Object[] var10001 = Registry.packArgs(a(16478, 6851), true, true);
      long var3 = 206082969888821725L;
      Object[] var2 = var10001;
      Ref.h(206082969888821725L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var1.setSize(a(19435, 531607233426334616L), a(18587, 2600783524684505316L));
      var1.setLocationRelativeTo(null);
      var1.setVisible(true);
   }

   public EditDialog2(int var1, Window var2, String var3, boolean var4) {
      this(var1, var2, var3, null, var4);
   }

   public EditDialog2(int var1, Window var2, String var3, Zv2_2 var4, boolean var5) {
      super(var2, var3);
      Registry.lookupField(633665384138343849L).setInt(this, Registry.lookupField(356419212223958784L).getInt(null));
      boolean var10000 = Address.g();
      Registry.lookupField(620834358354278334L).setInt(this, Registry.lookupField(243490669497898236L).getInt(null));
      boolean var6 = var10000;
      ArrayList var10001 = new ArrayList();
      long var13 = 519726087570605904L;
      ArrayList var12 = var10001;
      Ref.s(519726087570605904L, var12, var13);
      this.setModal(true);
      Registry.lookupField(620834358354278334L).setInt(this, (int)var1);
      JPanel var7 = (JPanel)this.getContentPane();
      var7.setLayout(new MigLayout(a(16474, -31231), "", a(16473, 20128)));
      PathPanel var10002 = new PathPanel((int)var1, var4, true);
      long var15 = 546550992201866353L;
      PathPanel var14 = var10002;
      Ref.s(546550992201866353L, var14, var15);
      Registry.emptyArgs();
      long var16 = 454647487873911743L;
      Object var10003 = Ref.h2(454647487873911743L, var16);

      try {
         var10003 = (Boolean)var10003;
      } catch (InvocationTargetException var76) {
         throw var76.getTargetException();
      }

      if (!var6) {
         if (var10003 == null) {
            Object var18 = 546550992201866353L;
            Ref.g(546550992201866353L, var18);
            Object[] var10005 = Registry.packArgs(true);
            long var21 = 177978832877275863L;
            Object[] var20 = var10005;
            Ref.h(177978832877275863L, var20, var21);

            try {
               ;
            } catch (InvocationTargetException var75) {
               throw var75.getTargetException();
            }
         }

         var10003 = this;
         Object var22 = 546550992201866353L;
         Ref.g(546550992201866353L, var22);
         Object[] var79 = Registry.packArgs((int)var1);
         long var25 = 355553533336863693L;
         Object[] var24 = var79;
         Ref.h(355553533336863693L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var74) {
            throw var74.getTargetException();
         }

         Object var26 = 546550992201866353L;
         Ref.g(546550992201866353L, var26);
         Object[] var10008 = Registry.emptyArgs();
         long var29 = 126176237984401993L;
         Object[] var28 = var10008;
         var10008 = Ref.h(126176237984401993L, var28, var29);
         long var31 = 210562214105886716L;
         Object var30 = var10008;
         Ref.s(210562214105886716L, var30, var31);
         Object var32 = 546550992201866353L;
         Ref.g(546550992201866353L, var32);
         Object[] var10011 = Registry.emptyArgs();
         long var35 = 420275156100745042L;
         Object[] var34 = var10011;
         var10011 = Ref.h(420275156100745042L, var34, var35);
         long var37 = 426338772833936622L;
         Object var36 = var10011;
         Ref.s(426338772833936622L, var36, var37);
      }

      label105: {
         int var10004 = Registry.lookupField(243490669497898236L).getInt(null);
         if (!var6) {
            if (var10003 == var10004) {
               Object var38 = 546550992201866353L;
               Ref.g(546550992201866353L, var38);
               Object[] var10006 = Registry.emptyArgs();
               long var41 = 126176237984401993L;
               Object[] var40 = var10006;
               var10006 = Ref.h(126176237984401993L, var40, var41);
               long var43 = 210562214105886716L;
               Object var42 = var10006;
               Ref.s(210562214105886716L, var42, var43);
               Object var44 = 210562214105886716L;
               ((Km2)Ref.g(210562214105886716L, var44)).setSelectionMode(0);
               if (!var6) {
                  break label105;
               }
            }

            var10003 = var1;
            var10004 = Registry.lookupField(530934992944035866L).getInt(null);
         }

         if (!var6) {
            if (var10003 == var10004) {
               Object var46 = 546550992201866353L;
               Ref.g(546550992201866353L, var46);
               Object[] var82 = Registry.emptyArgs();
               long var49 = 126176237984401993L;
               Object[] var48 = var82;
               var82 = Ref.h(126176237984401993L, var48, var49);
               long var51 = 210562214105886716L;
               Object var50 = var82;
               Ref.s(210562214105886716L, var50, var51);
               Object var52 = 210562214105886716L;
               ((Km2)Ref.g(210562214105886716L, var52)).setSelectionMode(0);
               if (!var6) {
                  break label105;
               }
            }

            var10003 = var1;
            var10004 = Registry.lookupField(117752090945034800L).getInt(null);
         }

         if (var10003 == var10004) {
            Object var54 = 546550992201866353L;
            Ref.g(546550992201866353L, var54);
            Object[] var84 = Registry.emptyArgs();
            long var57 = 126176237984401993L;
            Object[] var56 = var84;
            var84 = Ref.h(126176237984401993L, var56, var57);
            long var59 = 210562214105886716L;
            Object var58 = var84;
            Ref.s(210562214105886716L, var58, var59);
            Object var60 = 210562214105886716L;
            ((Km2)Ref.g(210562214105886716L, var60)).setSelectionMode(0);
         }
      }

      Object var62 = 426338772833936622L;
      Ref.g(426338772833936622L, var62);
      Object[] var80 = Registry.packArgs(var4);
      long var65 = 530612296803885459L;
      Object[] var64 = var80;
      Ref.h(530612296803885459L, var64, var65);

      try {
         ;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      JPanel var8 = new JPanel();
      var8.setLayout(new MigLayout(a(16468, -16560)));
      var7.add(var8, a(16476, 428));
      Object var66 = 546550992201866353L;
      this.add((PathPanel)Ref.g(546550992201866353L, var66));
      JPanel var9 = new JPanel();
      var7.add(var9, a(16475, 11638));
      var9.setLayout(new MigLayout(a(16479, 11273), a(16471, 4440), ""));
      if (var5) {
         KD var10 = new KD(a(16477, -16314));
         var10.V(0, 0, 0, a(30781, 3209545710036389964L));
         var10.G(true);
         var10.setForeground(new Color(a(28408, 8804557846128526990L)));
         var10.t(new Color(a(17784, 73431894817287428L)));
         Object var86 = var10;
         if (!var6) {
            var10.setCursor(new Cursor(a(417, 3503167313153714655L)));
            var86 = Registry.emptyArgs();
            long var68 = 253808553645062345L;
            Object var10007 = Ref.h2(253808553645062345L, var68);

            try {
               var87 = (Boolean)var10007;
            } catch (InvocationTargetException var72) {
               throw var72.getTargetException();
            }

            if (var87) {
               var9.add(var10);
            }
         }

         ((KD)var86).addActionListener(new QO(this));
      }

      JButton var77 = new JButton(a(16472, 24955));
      var9.add(var77);
      var77.addActionListener(new FU3(this, (int)var1));
      Object var70 = 210562214105886716L;
      ((Km2)Ref.g(210562214105886716L, var70)).addMouseListener(new Jt2(this, (int)var1));
      JButton var11 = new JButton(a(16470, 26640));
      var9.add(var11);
      var11.addActionListener(new YR3(this));
   }

   public void j() {
      boolean var2 = false;
      Object var14 = 546550992201866353L;
      Ref.g(546550992201866353L, var14);
      Connection4 var10002 = (Connection4)(Registry.emptyArgs());
      long var17 = 479006944855319308L;
      Object[] var16 = var10002;
      var10002 = Ref.h(479006944855319308L, var16, var17);

      try {
         var10002 = (Connection4)var10002;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      Connection4 var3 = var10002;
      var3.setDragEnabled(false);
      Address.g();
      Object[] var10004 = Registry.emptyArgs();
      long var19 = 208260183617353218L;
      Object[] var18 = var10004;
      Ref.h(208260183617353218L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var59) {
         throw var59.getTargetException();
      }

      Object[] var10006 = Registry.emptyArgs();
      long var21 = 498856411508641826L;
      Object[] var20 = var10006;
      var10006 = Ref.h(498856411508641826L, var20, var21);
      long var23 = 258904458932065319L;
      Object var22 = var10006;
      Ref.s(258904458932065319L, var22, var23);
      Object var24 = 210562214105886716L;
      int[] var5 = ((Km2)Ref.g(210562214105886716L, var24)).getSelectedRows();
      EditDialog2 var1 = this;
      Object var26 = 210562214105886716L;
      Kl4 var6 = (Kl4)((Km2)Ref.g(210562214105886716L, var26)).getModel();
      int[] var7 = var5;
      int var8 = var5.length;
      int var9 = 0;

      Kl4 var10008;
      while (true) {
         if (var9 < var8) {
            int var10 = var7[var9];
            Object var28 = 210562214105886716L;
            int var11 = ((Km2)Ref.g(210562214105886716L, var28)).convertRowIndexToModel(var10);
            var10008 = var6;
            Object[] var10009 = Registry.packArgs(var11);
            long var31 = 291710787850444005L;
            Object[] var30 = var10009;
            var10009 = Ref.h(291710787850444005L, var30, var31);

            try {
               var10009 = (Object[])((Object)var10009);
            } catch (InvocationTargetException var58) {
               throw var58.getTargetException();
            }

            Object var12 = var10009;
            Object var32 = 519726087570605904L;
            ((ArrayList)Ref.g(519726087570605904L, var32)).add(var12);
            boolean var10010 = var12.getClass().equals(Tf4.class);
            if (var1 == null) {
               break;
            }

            label109: {
               label119: {
                  if (var1 == null) {
                     if (var10010) {
                        Tf4 var13 = (Tf4)var12;
                        if (var1 == null) {
                           break label109;
                        }
                     }

                     var68 = var12.getClass();
                     if (var1 == null) {
                        break label119;
                     }

                     var10010 = var68.equals(Ck4.class);
                  }

                  if (!var10010) {
      ArrayList var68;
      ArrayList var68;
                     break label109;
                  }

                  var68 = var12;
               }

               Ck4 var61 = (Ck4)var68;
            }

            var9++;
            if (var1 == null) {
               continue;
            }
         }

         Object var34 = 519726087570605904L;
         var10008 = ((ArrayList)Ref.g(519726087570605904L, var34)).size();
         break;
      }

      if (var1 == null) {
         if (!(var10008 > 0)) {
            return;
         }

         boolean var65 = true;
      }

      Registry.lookupField(633665384138343849L).setInt(this, Registry.lookupField(564170828581134815L).getInt(null));
      this.setVisible(false);
      Registry.emptyArgs();
      long var36 = 270389152141252877L;
      Ref.h2(270389152141252877L, var36);
      Object[] var69 = Registry.emptyArgs();
      long var39 = 306266403902896148L;
      Object[] var38 = var69;
      Ref.h(306266403902896148L, var38, var39);

      try {
         ;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }

      Object var40 = 258904458932065319L;
      Object[] var10012 = Registry.packArgs(Ref.g(258904458932065319L, var40));
      long var43 = 633767615784019382L;
      Object[] var42 = var10012;
      Ref.h(633767615784019382L, var42, var43);

      try {
         ;
      } catch (InvocationTargetException var56) {
         throw var56.getTargetException();
      }

      Object[] var10013 = Registry.emptyArgs();
      long var45 = 623400893456259775L;
      Object[] var44 = var10013;
      Ref.h(623400893456259775L, var44, var45);
      Object var46 = 258904458932065319L;
      Object[] var10015 = Registry.packArgs(Ref.g(258904458932065319L, var46));
      long var49 = 586754005152705687L;
      Object[] var48 = var10015;
      Ref.h(586754005152705687L, var48, var49);

      try {
         ;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      Registry.emptyArgs();
      long var50 = 270389152141252877L;
      Ref.h2(270389152141252877L, var50);
      Object[] var10017 = Registry.emptyArgs();
      long var53 = 578864097947885485L;
      Object[] var52 = var10017;
      Ref.h(578864097947885485L, var52, var53);

      try {
         ;
      } catch (InvocationTargetException var54) {
         throw var54.getTargetException();
      }
   }

   public void s(String var1, boolean var2, boolean var3) {
      Object var4 = 546550992201866353L;
      Ref.g(546550992201866353L, var4);
      Object[] var10002 = Registry.packArgs(var1, var2, var3);
      long var7 = 530353687625151908L;
      Object[] var6 = var10002;
      Ref.h(530353687625151908L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public int s() {
      return Registry.lookupField(633665384138343849L).getInt(this);
   }

   public void D(int var1) {
      Registry.lookupField(633665384138343849L).setInt(this, var1);
   }

   public String E() {
      Object var1 = 518641299092321834L;
      return (String)Ref.g(518641299092321834L, var1);
   }

   public ArrayList n() {
      Object var1 = 519726087570605904L;
      return (ArrayList)Ref.g(519726087570605904L, var1);
   }

   public void U(ArrayList var1) {
      long var3 = 519726087570605904L;
      Ref.s(519726087570605904L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 16476) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 92;
               break;
            case 1:
               var10000 = 253;
               break;
            case 2:
               var10000 = 174;
               break;
            case 3:
               var10000 = 90;
               break;
            case 4:
               var10000 = 193;
               break;
            case 5:
               var10000 = 177;
               break;
            case 6:
               var10000 = 124;
               break;
            case 7:
               var10000 = 126;
               break;
            case 8:
               var10000 = 101;
               break;
            case 9:
               var10000 = 169;
               break;
            case 10:
               var10000 = 202;
               break;
            case 11:
               var10000 = 23;
               break;
            case 12:
               var10000 = 15;
               break;
            case 13:
               var10000 = 14;
               break;
            case 14:
               var10000 = 222;
               break;
            case 15:
               var10000 = 125;
               break;
            case 16:
               var10000 = 145;
               break;
            case 17:
               var10000 = 156;
               break;
            case 18:
               var10000 = 39;
               break;
            case 19:
               var10000 = 186;
               break;
            case 20:
               var10000 = 32;
               break;
            case 21:
               var10000 = 139;
               break;
            case 22:
               var10000 = 129;
               break;
            case 23:
               var10000 = 45;
               break;
            case 24:
               var10000 = 239;
               break;
            case 25:
               var10000 = 152;
               break;
            case 26:
               var10000 = 51;
               break;
            case 27:
               var10000 = 94;
               break;
            case 28:
               var10000 = 235;
               break;
            case 29:
               var10000 = 97;
               break;
            case 30:
               var10000 = 144;
               break;
            case 31:
               var10000 = 0;
               break;
            case 32:
               var10000 = 199;
               break;
            case 33:
               var10000 = 102;
               break;
            case 34:
               var10000 = 89;
               break;
            case 35:
               var10000 = 120;
               break;
            case 36:
               var10000 = 146;
               break;
            case 37:
               var10000 = 8;
               break;
            case 38:
               var10000 = 137;
               break;
            case 39:
               var10000 = 72;
               break;
            case 40:
               var10000 = 150;
               break;
            case 41:
               var10000 = 215;
               break;
            case 42:
               var10000 = 133;
               break;
            case 43:
               var10000 = 60;
               break;
            case 44:
               var10000 = 40;
               break;
            case 45:
               var10000 = 123;
               break;
            case 46:
               var10000 = 24;
               break;
            case 47:
               var10000 = 223;
               break;
            case 48:
               var10000 = 31;
               break;
            case 49:
               var10000 = 103;
               break;
            case 50:
               var10000 = 48;
               break;
            case 51:
               var10000 = 3;
               break;
            case 52:
               var10000 = 140;
               break;
            case 53:
               var10000 = 26;
               break;
            case 54:
               var10000 = 241;
               break;
            case 55:
               var10000 = 160;
               break;
            case 56:
               var10000 = 75;
               break;
            case 57:
               var10000 = 164;
               break;
            case 58:
               var10000 = 159;
               break;
            case 59:
               var10000 = 210;
               break;
            case 60:
               var10000 = 36;
               break;
            case 61:
               var10000 = 105;
               break;
            case 62:
               var10000 = 219;
               break;
            case 63:
               var10000 = 93;
               break;
            case 64:
               var10000 = 62;
               break;
            case 65:
               var10000 = 78;
               break;
            case 66:
               var10000 = 136;
               break;
            case 67:
               var10000 = 28;
               break;
            case 68:
               var10000 = 176;
               break;
            case 69:
               var10000 = 98;
               break;
            case 70:
               var10000 = 190;
               break;
            case 71:
               var10000 = 20;
               break;
            case 72:
               var10000 = 214;
               break;
            case 73:
               var10000 = 138;
               break;
            case 74:
               var10000 = 74;
               break;
            case 75:
               var10000 = 197;
               break;
            case 76:
               var10000 = 57;
               break;
            case 77:
               var10000 = 104;
               break;
            case 78:
               var10000 = 17;
               break;
            case 79:
               var10000 = 232;
               break;
            case 80:
               var10000 = 59;
               break;
            case 81:
               var10000 = 19;
               break;
            case 82:
               var10000 = 191;
               break;
            case 83:
               var10000 = 91;
               break;
            case 84:
               var10000 = 38;
               break;
            case 85:
               var10000 = 141;
               break;
            case 86:
               var10000 = 100;
               break;
            case 87:
               var10000 = 192;
               break;
            case 88:
               var10000 = 244;
               break;
            case 89:
               var10000 = 158;
               break;
            case 90:
               var10000 = 116;
               break;
            case 91:
               var10000 = 188;
               break;
            case 92:
               var10000 = 187;
               break;
            case 93:
               var10000 = 12;
               break;
            case 94:
               var10000 = 37;
               break;
            case 95:
               var10000 = 53;
               break;
            case 96:
               var10000 = 35;
               break;
            case 97:
               var10000 = 185;
               break;
            case 98:
               var10000 = 49;
               break;
            case 99:
               var10000 = 233;
               break;
            case 100:
               var10000 = 95;
               break;
            case 101:
               var10000 = 198;
               break;
            case 102:
               var10000 = 70;
               break;
            case 103:
               var10000 = 154;
               break;
            case 104:
               var10000 = 21;
               break;
            case 105:
               var10000 = 245;
               break;
            case 106:
               var10000 = 196;
               break;
            case 107:
               var10000 = 134;
               break;
            case 108:
               var10000 = 227;
               break;
            case 109:
               var10000 = 6;
               break;
            case 110:
               var10000 = 76;
               break;
            case 111:
               var10000 = 148;
               break;
            case 112:
               var10000 = 4;
               break;
            case 113:
               var10000 = 80;
               break;
            case 114:
               var10000 = 47;
               break;
            case 115:
               var10000 = 118;
               break;
            case 116:
               var10000 = 200;
               break;
            case 117:
               var10000 = 122;
               break;
            case 118:
               var10000 = 181;
               break;
            case 119:
               var10000 = 208;
               break;
            case 120:
               var10000 = 142;
               break;
            case 121:
               var10000 = 225;
               break;
            case 122:
               var10000 = 201;
               break;
            case 123:
               var10000 = 175;
               break;
            case 124:
               var10000 = 113;
               break;
            case 125:
               var10000 = 52;
               break;
            case 126:
               var10000 = 178;
               break;
            case 127:
               var10000 = 254;
               break;
            case 128:
               var10000 = 171;
               break;
            case 129:
               var10000 = 44;
               break;
            case 130:
               var10000 = 69;
               break;
            case 131:
               var10000 = 5;
               break;
            case 132:
               var10000 = 168;
               break;
            case 133:
               var10000 = 217;
               break;
            case 134:
               var10000 = 30;
               break;
            case 135:
               var10000 = 71;
               break;
            case 136:
               var10000 = 131;
               break;
            case 137:
               var10000 = 251;
               break;
            case 138:
               var10000 = 250;
               break;
            case 139:
               var10000 = 29;
               break;
            case 140:
               var10000 = 153;
               break;
            case 141:
               var10000 = 179;
               break;
            case 142:
               var10000 = 85;
               break;
            case 143:
               var10000 = 255;
               break;
            case 144:
               var10000 = 79;
               break;
            case 145:
               var10000 = 149;
               break;
            case 146:
               var10000 = 166;
               break;
            case 147:
               var10000 = 189;
               break;
            case 148:
               var10000 = 13;
               break;
            case 149:
               var10000 = 1;
               break;
            case 150:
               var10000 = 228;
               break;
            case 151:
               var10000 = 81;
               break;
            case 152:
               var10000 = 220;
               break;
            case 153:
               var10000 = 205;
               break;
            case 154:
               var10000 = 106;
               break;
            case 155:
               var10000 = 108;
               break;
            case 156:
               var10000 = 55;
               break;
            case 157:
               var10000 = 82;
               break;
            case 158:
               var10000 = 87;
               break;
            case 159:
               var10000 = 163;
               break;
            case 160:
               var10000 = 161;
               break;
            case 161:
               var10000 = 77;
               break;
            case 162:
               var10000 = 143;
               break;
            case 163:
               var10000 = 112;
               break;
            case 164:
               var10000 = 218;
               break;
            case 165:
               var10000 = 107;
               break;
            case 166:
               var10000 = 184;
               break;
            case 167:
               var10000 = 27;
               break;
            case 168:
               var10000 = 64;
               break;
            case 169:
               var10000 = 242;
               break;
            case 170:
               var10000 = 54;
               break;
            case 171:
               var10000 = 58;
               break;
            case 172:
               var10000 = 127;
               break;
            case 173:
               var10000 = 61;
               break;
            case 174:
               var10000 = 183;
               break;
            case 175:
               var10000 = 172;
               break;
            case 176:
               var10000 = 243;
               break;
            case 177:
               var10000 = 128;
               break;
            case 178:
               var10000 = 195;
               break;
            case 179:
               var10000 = 99;
               break;
            case 180:
               var10000 = 130;
               break;
            case 181:
               var10000 = 182;
               break;
            case 182:
               var10000 = 230;
               break;
            case 183:
               var10000 = 234;
               break;
            case 184:
               var10000 = 63;
               break;
            case 185:
               var10000 = 73;
               break;
            case 186:
               var10000 = 224;
               break;
            case 187:
               var10000 = 203;
               break;
            case 188:
               var10000 = 249;
               break;
            case 189:
               var10000 = 96;
               break;
            case 190:
               var10000 = 119;
               break;
            case 191:
               var10000 = 46;
               break;
            case 192:
               var10000 = 211;
               break;
            case 193:
               var10000 = 207;
               break;
            case 194:
               var10000 = 212;
               break;
            case 195:
               var10000 = 246;
               break;
            case 196:
               var10000 = 173;
               break;
            case 197:
               var10000 = 114;
               break;
            case 198:
               var10000 = 115;
               break;
            case 199:
               var10000 = 25;
               break;
            case 200:
               var10000 = 162;
               break;
            case 201:
               var10000 = 155;
               break;
            case 202:
               var10000 = 50;
               break;
            case 203:
               var10000 = 209;
               break;
            case 204:
               var10000 = 34;
               break;
            case 205:
               var10000 = 213;
               break;
            case 206:
               var10000 = 147;
               break;
            case 207:
               var10000 = 226;
               break;
            case 208:
               var10000 = 83;
               break;
            case 209:
               var10000 = 65;
               break;
            case 210:
               var10000 = 10;
               break;
            case 211:
               var10000 = 110;
               break;
            case 212:
               var10000 = 41;
               break;
            case 213:
               var10000 = 248;
               break;
            case 214:
               var10000 = 33;
               break;
            case 215:
               var10000 = 216;
               break;
            case 216:
               var10000 = 117;
               break;
            case 217:
               var10000 = 66;
               break;
            case 218:
               var10000 = 88;
               break;
            case 219:
               var10000 = 9;
               break;
            case 220:
               var10000 = 43;
               break;
            case 221:
               var10000 = 157;
               break;
            case 222:
               var10000 = 18;
               break;
            case 223:
               var10000 = 42;
               break;
            case 224:
               var10000 = 170;
               break;
            case 225:
               var10000 = 247;
               break;
            case 226:
               var10000 = 132;
               break;
            case 227:
               var10000 = 22;
               break;
            case 228:
               var10000 = 11;
               break;
            case 229:
               var10000 = 238;
               break;
            case 230:
               var10000 = 121;
               break;
            case 231:
               var10000 = 7;
               break;
            case 232:
               var10000 = 231;
               break;
            case 233:
               var10000 = 68;
               break;
            case 234:
               var10000 = 194;
               break;
            case 235:
               var10000 = 86;
               break;
            case 236:
               var10000 = 221;
               break;
            case 237:
               var10000 = 240;
               break;
            case 238:
               var10000 = 84;
               break;
            case 239:
               var10000 = 16;
               break;
            case 240:
               var10000 = 109;
               break;
            case 241:
               var10000 = 151;
               break;
            case 242:
               var10000 = 236;
               break;
            case 243:
               var10000 = 67;
               break;
            case 244:
               var10000 = 204;
               break;
            case 245:
               var10000 = 2;
               break;
            case 246:
               var10000 = 111;
               break;
            case 247:
               var10000 = 180;
               break;
            case 248:
               var10000 = 252;
               break;
            case 249:
               var10000 = 167;
               break;
            case 250:
               var10000 = 206;
               break;
            case 251:
               var10000 = 56;
               break;
            case 252:
               var10000 = 165;
               break;
            case 253:
               var10000 = 237;
               break;
            case 254:
               var10000 = 135;
               break;
            default:
               var10000 = 229;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26741;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[12];
      int var11 = 0;
      String var10 = "O\rwÈ\u0017挾荲斛朝罢轋嘨M×\u0084,\u0007ß\u0090F\u008dmú瀪児丘轔°\u0003ftÝ\u001c\u008d\u0091ó\u0091$\u0011ß\u0080O-à*\u0085\u000eÐ\u000fº\u00ad\u009d¿CT2è`i}á\u0002碬孀\u0005\u008fí\u00975é\u000e\u008d5àE\u0005Â¢Ò©:\u00141Vø\u0005\u0010n\u0080£\u009a\u000e\u0016²\u0093µkÜo\u0011\u0010B#>°\u0019\u0005郌戾翁辧围";
      int var12 = "O\rwÈ\u0017挾荲斛朝罢轋嘨M×\u0084,\u0007ß\u0090F\u008dmú瀪児丘轔°\u0003ftÝ\u001c\u008d\u0091ó\u0091$\u0011ß\u0080O-à*\u0085\u000eÐ\u000fº\u00ad\u009d¿CT2è`i}á\u0002碬孀\u0005\u008fí\u00975é\u000e\u008d5àE\u0005Â¢Ò©:\u00141Vø\u0005\u0010n\u0080£\u009a\u000e\u0016²\u0093µkÜo\u0011\u0010B#>°\u0019\u0005郌戾翁辧围"
         .length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 126;
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
                        var65 = 94;
                        break;
                     case 1:
                        var65 = 108;
                        break;
                     case 2:
                        var65 = 28;
                        break;
                     case 3:
                        var65 = 25;
                        break;
                     case 4:
                        var65 = 66;
                        break;
                     case 5:
                        var65 = 66;
                        break;
                     default:
                        var65 = 33;
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
                     b = new String[12];
                     long var0 = 5991288027738860901L;
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "4_LgÊ§\u0083¥ ó\f\u0096\u0098B½\f\u0096\u00859½Jk¼\u008f°\u009c=á¶ñ\u0005\u0005\u008a6H¨Quý7ô½+'ÞEÖ}>\u001c©²\u0084\u000bLA\u007f\u000fhÓÍ¡ß£Êÿî\u0088£\u0083A^½\u0017Kð\u0085ë.\u008f";
                     int var5 = "4_LgÊ§\u0083¥ ó\f\u0096\u0098B½\f\u0096\u00859½Jk¼\u008f°\u009c=á¶ñ\u0005\u0005\u008a6H¨Quý7ô½+'ÞEÖ}>\u001c©²\u0084\u000bLA\u007f\u000fhÓÍ¡ß£Êÿî\u0088£\u0083A^½\u0017Kð\u0085ë.\u008f"
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
                                    d = new Integer[12];
                                    Registry.lookupField(564170828581134815L).setInt(null, a(14549, 7838248353575882913L));
                                    Registry.lookupField(356419212223958784L).setInt(null, a(21060, 3147860374190635572L));
                                    Registry.lookupField(243490669497898236L).setInt(null, a(14965, 5436345331258708482L));
                                    Registry.lookupField(530934992944035866L).setInt(null, a(1353, 3378588255221673276L));
                                    Registry.lookupField(117752090945034800L).setInt(null, a(16448, 8956493048883161149L));
                                    Registry.lookupField(317162390314131527L).setInt(null, a(24312, 417383470626322058L));
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "5\u0098Å.ÞîÌu\u0081ÓKÏ\u0089%\u0084¶";
                                 var5 = "5\u0098Å.ÞîÌu\u0081ÓKÏ\u0089%\u0084¶".length();
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

                  var10 = "叔淠\u0006T«+P\u009fw";
                  var12 = "叔淠\u0006T«+P\u009fw".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 120;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






