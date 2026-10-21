package com.finalshell.ui.panel;

import com.finalshell.core.Fb2;
import com.finalshell.core.Ty4;
import com.finalshell.core.Vn2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.OK3;
import com.finalshell.task.U02;
import com.finalshell.task.WE;
import com.finalshell.ui.listener.AF;
import com.finalshell.ui.listener.FC;
import com.finalshell.ui.listener.YV;
import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class QuickConnectPanel extends JPanel implements Fb2 {
   public com.finalshell.ui.model.Q6 T;
   public boolean N;
   public JScrollPane R;
   public Font D;
   public CL Q;
   public Vn2 t;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public QuickConnectPanel(CL var1) {
   super();
      String var10000 = Vn2.C();
      String var2 = var10000;
      Registry.lookupField(592149699134044003L).setBoolean(this, false);
      Object var10001 = Registry.lookupField(395970988011231853L).get(null);
      long var11 = 220149186421929582L;
      Object var10 = var10001;
      Ref.s(220149186421929582L, var10, var11);
      long var13 = 508864055756481627L;
      Ref.s(508864055756481627L, var1, var13);
      this.setOpaque(false);
      this.setLayout(new MigLayout(a(-17620, -20618), a(-17632, 20966), a(-17624, 24073)));
      JPanel var3 = new JPanel();
      Object[] var4 = 3;
      Registry.emptyArgs();
      long var14 = 454647487873911743L;
      Object var10003 = Ref.h2(454647487873911743L, var14);

      try {
         var10003 = (Boolean)var10003;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      if (var2 == null) {
         if (var10003 == null) {
            var4 = a(24901, 5010830234171504879L);
         }

         var10003 = Registry.emptyArgs();
         long var16 = 561847341732101275L;
         Object var10004 = Ref.h2(561847341732101275L, var16);

         try {
         } catch (InvocationTargetException var47) {
            throw var47.getTargetException();
         }
      }

      label66: {
         if (var2 == null) {
            if (var10003 == null) {
               break label66;
            }

            var10003 = 4;
         }

         var4 = (Object[])var10003;
      }

      var3.setLayout(new MigLayout(a(-17622, -29290) + var4 + a(-17625, -31118) + var4 + a(-17618, 4596), a(-17631, -6820), a(-17617, -17678)));
      var3.setBackground(new Color(a(22037, 1179213881623400378L), a(28275, 3199698069165144027L), a(1016, 892885510700112469L)));
      this.add(var3, a(-17629, 28028));
      JLabel var5 = new JLabel(a(-17626, -15347));
      var5.setOpaque(false);
      var3.add(var5, a(-17621, -15422));
      Registry.packArgs(a(-17628, -8802));
      long var18 = 184417017975721055L;
      Object var50 = Ref.h2(184417017975721055L, var18);

      try {
         var50 = (JButton)var50;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      JButton var6 = (JButton)var50;
      var3.add(var6);
      var6.addActionListener(new YV(this));
      JLabel var7 = new JLabel(a(-17619, -16960));
      var7.setOpaque(false);
      JComboBox var8 = new JComboBox();
      var8.addItem(a(-17630, -16387));
      var8.addItem(a(-17627, -9666));
      var8.addItemListener(new FC(this));
      Vn2 var10005 = new Vn2(var1);
      long var21 = 368966479006037777L;
      Vn2 var20 = var10005;
      Ref.s(368966479006037777L, var20, var21);
      JScrollPane var10007;
      Object var22 = 368966479006037777L;
      super((Vn2)Ref.g(368966479006037777L, var22));
      long var25 = 380806102838069194L;
      JScrollPane var24 = var10007;
      Ref.s(380806102838069194L, var24, var25);
      Object var26 = 380806102838069194L;
      this.add((JScrollPane)Ref.g(380806102838069194L, var26), a(-17623, 31999));
      Object var28 = 380806102838069194L;
      ((JScrollPane)Ref.g(380806102838069194L, var28))
         .setBorder(
            BorderFactory.createMatteBorder(
               5,
               a(7556, 8565003386055951402L),
               0,
               a(5334, 1169305275892436349L),
               new Color(a(5079, 2780581436254718587L), a(29973, 568340715426606268L), a(29973, 568340715426606268L))
            )
         );
      Object var30 = 380806102838069194L;
      JViewport var9 = ((JScrollPane)Ref.g(380806102838069194L, var30)).getViewport();
      var9.addChangeListener(new AF(this));
      com.finalshell.ui.model.Q6 var10011 = new com.finalshell.ui.model.Q6();
      long var33 = 179456532871273698L;
      com.finalshell.ui.model.Q6 var32 = var10011;
      Ref.s(179456532871273698L, var32, var33);
      Object var34 = 368966479006037777L;
      Vn2 var10012 = (Vn2)Ref.g(368966479006037777L, var34);
      Object var36 = 179456532871273698L;
      this.setModel((com.finalshell.ui.model.Q6)Ref.g(179456532871273698L, var36));
      Registry.emptyArgs();
      long var38 = 270389152141252877L;
      Ref.h2(270389152141252877L, var38);
      Object[] var10015 = Registry.packArgs(this);
      long var41 = 459969040127248336L;
      Object[] var40 = var10015;
      Ref.h(459969040127248336L, var40, var41);

      try {
         ;
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10016 = Registry.packArgs(new WE(this));
      long var43 = 434592463220957006L;
      Object[] var42 = var10016;
      Ref.h(434592463220957006L, var42, var43);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      if (var2 != null) {
         Ky4.K(new String[2]);
      }
   }

   public void M(java.io.File var1, com.finalshell.ui.frame.U var2) {
      Object var3 = 368966479006037777L;
      Ref.g(368966479006037777L, var3);
      Object[] var10002 = Registry.packArgs(var1, var2);
      long var6 = 594337148944086925L;
      Object[] var5 = var10002;
      Ref.h(594337148944086925L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void b() {
      Object var1 = 368966479006037777L;
      Ref.g(368966479006037777L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 577949937132256055L;
      Object[] var3 = var10002;
      Ref.h(577949937132256055L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      Object[] var10004 = Registry.packArgs(this);
      long var8 = 390922222656242580L;
      Object[] var7 = var10004;
      Ref.h(390922222656242580L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Registry.packArgs(this);
      long var9 = 242617331513341262L;
      Ref.h2(242617331513341262L, var9);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public void d() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 410905379772103887L;
      Object[] var5 = var10002;
      Ref.h(410905379772103887L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object var2 = null;
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var8 = 414769076222012220L;
      Object[] var7 = var10003;
      var10003 = Ref.h(414769076222012220L, var7, var8);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      var2 = var10003;
      Object var9 = 179456532871273698L;
      Ref.g(179456532871273698L, var9);
      Object[] var10005 = Registry.packArgs(var2);
      long var12 = 585282021127690770L;
      Object[] var11 = var10005;
      Ref.h(585282021127690770L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      SwingUtilities.invokeLater(new U02(this));
   }

   @Override
   public void O(Ty4 var1) {
      SwingUtilities.invokeLater(new OK3(this, var1));
   }

   public CL m() {
      Object var1 = 508864055756481627L;
      return (CL)Ref.g(508864055756481627L, var1);
   }

   public void Y(CL var1) {
      long var3 = 508864055756481627L;
      Ref.s(508864055756481627L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -17623) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 152;
               break;
            case 1:
               var10000 = 231;
               break;
            case 2:
               var10000 = 107;
               break;
            case 3:
               var10000 = 194;
               break;
            case 4:
               var10000 = 237;
               break;
            case 5:
               var10000 = 143;
               break;
            case 6:
               var10000 = 87;
               break;
            case 7:
               var10000 = 17;
               break;
            case 8:
               var10000 = 84;
               break;
            case 9:
               var10000 = 89;
               break;
            case 10:
               var10000 = 92;
               break;
            case 11:
               var10000 = 130;
               break;
            case 12:
               var10000 = 57;
               break;
            case 13:
               var10000 = 250;
               break;
            case 14:
               var10000 = 55;
               break;
            case 15:
               var10000 = 64;
               break;
            case 16:
               var10000 = 253;
               break;
            case 17:
               var10000 = 117;
               break;
            case 18:
               var10000 = 11;
               break;
            case 19:
               var10000 = 82;
               break;
            case 20:
               var10000 = 12;
               break;
            case 21:
               var10000 = 155;
               break;
            case 22:
               var10000 = 7;
               break;
            case 23:
               var10000 = 195;
               break;
            case 24:
               var10000 = 5;
               break;
            case 25:
               var10000 = 118;
               break;
            case 26:
               var10000 = 74;
               break;
            case 27:
               var10000 = 16;
               break;
            case 28:
               var10000 = 142;
               break;
            case 29:
               var10000 = 145;
               break;
            case 30:
               var10000 = 37;
               break;
            case 31:
               var10000 = 211;
               break;
            case 32:
               var10000 = 140;
               break;
            case 33:
               var10000 = 132;
               break;
            case 34:
               var10000 = 48;
               break;
            case 35:
               var10000 = 69;
               break;
            case 36:
               var10000 = 169;
               break;
            case 37:
               var10000 = 247;
               break;
            case 38:
               var10000 = 98;
               break;
            case 39:
               var10000 = 49;
               break;
            case 40:
               var10000 = 232;
               break;
            case 41:
               var10000 = 226;
               break;
            case 42:
               var10000 = 218;
               break;
            case 43:
               var10000 = 234;
               break;
            case 44:
               var10000 = 33;
               break;
            case 45:
               var10000 = 63;
               break;
            case 46:
               var10000 = 76;
               break;
            case 47:
               var10000 = 198;
               break;
            case 48:
               var10000 = 103;
               break;
            case 49:
               var10000 = 27;
               break;
            case 50:
               var10000 = 200;
               break;
            case 51:
               var10000 = 18;
               break;
            case 52:
               var10000 = 249;
               break;
            case 53:
               var10000 = 68;
               break;
            case 54:
               var10000 = 28;
               break;
            case 55:
               var10000 = 208;
               break;
            case 56:
               var10000 = 97;
               break;
            case 57:
               var10000 = 220;
               break;
            case 58:
               var10000 = 31;
               break;
            case 59:
               var10000 = 190;
               break;
            case 60:
               var10000 = 88;
               break;
            case 61:
               var10000 = 14;
               break;
            case 62:
               var10000 = 187;
               break;
            case 63:
               var10000 = 90;
               break;
            case 64:
               var10000 = 95;
               break;
            case 65:
               var10000 = 227;
               break;
            case 66:
               var10000 = 101;
               break;
            case 67:
               var10000 = 9;
               break;
            case 68:
               var10000 = 93;
               break;
            case 69:
               var10000 = 170;
               break;
            case 70:
               var10000 = 141;
               break;
            case 71:
               var10000 = 73;
               break;
            case 72:
               var10000 = 188;
               break;
            case 73:
               var10000 = 183;
               break;
            case 74:
               var10000 = 255;
               break;
            case 75:
               var10000 = 81;
               break;
            case 76:
               var10000 = 236;
               break;
            case 77:
               var10000 = 209;
               break;
            case 78:
               var10000 = 178;
               break;
            case 79:
               var10000 = 21;
               break;
            case 80:
               var10000 = 105;
               break;
            case 81:
               var10000 = 100;
               break;
            case 82:
               var10000 = 172;
               break;
            case 83:
               var10000 = 224;
               break;
            case 84:
               var10000 = 19;
               break;
            case 85:
               var10000 = 150;
               break;
            case 86:
               var10000 = 168;
               break;
            case 87:
               var10000 = 164;
               break;
            case 88:
               var10000 = 86;
               break;
            case 89:
               var10000 = 29;
               break;
            case 90:
               var10000 = 138;
               break;
            case 91:
               var10000 = 25;
               break;
            case 92:
               var10000 = 116;
               break;
            case 93:
               var10000 = 56;
               break;
            case 94:
               var10000 = 43;
               break;
            case 95:
               var10000 = 115;
               break;
            case 96:
               var10000 = 50;
               break;
            case 97:
               var10000 = 13;
               break;
            case 98:
               var10000 = 59;
               break;
            case 99:
               var10000 = 199;
               break;
            case 100:
               var10000 = 121;
               break;
            case 101:
               var10000 = 207;
               break;
            case 102:
               var10000 = 173;
               break;
            case 103:
               var10000 = 70;
               break;
            case 104:
               var10000 = 23;
               break;
            case 105:
               var10000 = 248;
               break;
            case 106:
               var10000 = 185;
               break;
            case 107:
               var10000 = 54;
               break;
            case 108:
               var10000 = 26;
               break;
            case 109:
               var10000 = 66;
               break;
            case 110:
               var10000 = 120;
               break;
            case 111:
               var10000 = 79;
               break;
            case 112:
               var10000 = 176;
               break;
            case 113:
               var10000 = 214;
               break;
            case 114:
               var10000 = 201;
               break;
            case 115:
               var10000 = 251;
               break;
            case 116:
               var10000 = 71;
               break;
            case 117:
               var10000 = 162;
               break;
            case 118:
               var10000 = 38;
               break;
            case 119:
               var10000 = 147;
               break;
            case 120:
               var10000 = 148;
               break;
            case 121:
               var10000 = 184;
               break;
            case 122:
               var10000 = 146;
               break;
            case 123:
               var10000 = 136;
               break;
            case 124:
               var10000 = 240;
               break;
            case 125:
               var10000 = 15;
               break;
            case 126:
               var10000 = 113;
               break;
            case 127:
               var10000 = 60;
               break;
            case 128:
               var10000 = 167;
               break;
            case 129:
               var10000 = 245;
               break;
            case 130:
               var10000 = 180;
               break;
            case 131:
               var10000 = 123;
               break;
            case 132:
               var10000 = 144;
               break;
            case 133:
               var10000 = 96;
               break;
            case 134:
               var10000 = 44;
               break;
            case 135:
               var10000 = 41;
               break;
            case 136:
               var10000 = 221;
               break;
            case 137:
               var10000 = 126;
               break;
            case 138:
               var10000 = 83;
               break;
            case 139:
               var10000 = 47;
               break;
            case 140:
               var10000 = 6;
               break;
            case 141:
               var10000 = 177;
               break;
            case 142:
               var10000 = 186;
               break;
            case 143:
               var10000 = 157;
               break;
            case 144:
               var10000 = 161;
               break;
            case 145:
               var10000 = 106;
               break;
            case 146:
               var10000 = 46;
               break;
            case 147:
               var10000 = 109;
               break;
            case 148:
               var10000 = 159;
               break;
            case 149:
               var10000 = 91;
               break;
            case 150:
               var10000 = 119;
               break;
            case 151:
               var10000 = 235;
               break;
            case 152:
               var10000 = 191;
               break;
            case 153:
               var10000 = 175;
               break;
            case 154:
               var10000 = 252;
               break;
            case 155:
               var10000 = 156;
               break;
            case 156:
               var10000 = 179;
               break;
            case 157:
               var10000 = 32;
               break;
            case 158:
               var10000 = 78;
               break;
            case 159:
               var10000 = 65;
               break;
            case 160:
               var10000 = 153;
               break;
            case 161:
               var10000 = 30;
               break;
            case 162:
               var10000 = 238;
               break;
            case 163:
               var10000 = 223;
               break;
            case 164:
               var10000 = 104;
               break;
            case 165:
               var10000 = 246;
               break;
            case 166:
               var10000 = 205;
               break;
            case 167:
               var10000 = 189;
               break;
            case 168:
               var10000 = 128;
               break;
            case 169:
               var10000 = 40;
               break;
            case 170:
               var10000 = 192;
               break;
            case 171:
               var10000 = 1;
               break;
            case 172:
               var10000 = 35;
               break;
            case 173:
               var10000 = 114;
               break;
            case 174:
               var10000 = 102;
               break;
            case 175:
               var10000 = 34;
               break;
            case 176:
               var10000 = 124;
               break;
            case 177:
               var10000 = 127;
               break;
            case 178:
               var10000 = 158;
               break;
            case 179:
               var10000 = 24;
               break;
            case 180:
               var10000 = 204;
               break;
            case 181:
               var10000 = 129;
               break;
            case 182:
               var10000 = 62;
               break;
            case 183:
               var10000 = 233;
               break;
            case 184:
               var10000 = 3;
               break;
            case 185:
               var10000 = 75;
               break;
            case 186:
               var10000 = 165;
               break;
            case 187:
               var10000 = 39;
               break;
            case 188:
               var10000 = 181;
               break;
            case 189:
               var10000 = 122;
               break;
            case 190:
               var10000 = 137;
               break;
            case 191:
               var10000 = 2;
               break;
            case 192:
               var10000 = 36;
               break;
            case 193:
               var10000 = 228;
               break;
            case 194:
               var10000 = 20;
               break;
            case 195:
               var10000 = 80;
               break;
            case 196:
               var10000 = 8;
               break;
            case 197:
               var10000 = 230;
               break;
            case 198:
               var10000 = 203;
               break;
            case 199:
               var10000 = 210;
               break;
            case 200:
               var10000 = 212;
               break;
            case 201:
               var10000 = 243;
               break;
            case 202:
               var10000 = 0;
               break;
            case 203:
               var10000 = 241;
               break;
            case 204:
               var10000 = 217;
               break;
            case 205:
               var10000 = 239;
               break;
            case 206:
               var10000 = 149;
               break;
            case 207:
               var10000 = 99;
               break;
            case 208:
               var10000 = 131;
               break;
            case 209:
               var10000 = 139;
               break;
            case 210:
               var10000 = 206;
               break;
            case 211:
               var10000 = 133;
               break;
            case 212:
               var10000 = 4;
               break;
            case 213:
               var10000 = 174;
               break;
            case 214:
               var10000 = 219;
               break;
            case 215:
               var10000 = 72;
               break;
            case 216:
               var10000 = 94;
               break;
            case 217:
               var10000 = 53;
               break;
            case 218:
               var10000 = 171;
               break;
            case 219:
               var10000 = 216;
               break;
            case 220:
               var10000 = 225;
               break;
            case 221:
               var10000 = 202;
               break;
            case 222:
               var10000 = 229;
               break;
            case 223:
               var10000 = 134;
               break;
            case 224:
               var10000 = 154;
               break;
            case 225:
               var10000 = 125;
               break;
            case 226:
               var10000 = 45;
               break;
            case 227:
               var10000 = 182;
               break;
            case 228:
               var10000 = 196;
               break;
            case 229:
               var10000 = 10;
               break;
            case 230:
               var10000 = 58;
               break;
            case 231:
               var10000 = 61;
               break;
            case 232:
               var10000 = 242;
               break;
            case 233:
               var10000 = 52;
               break;
            case 234:
               var10000 = 111;
               break;
            case 235:
               var10000 = 108;
               break;
            case 236:
               var10000 = 166;
               break;
            case 237:
               var10000 = 22;
               break;
            case 238:
               var10000 = 160;
               break;
            case 239:
               var10000 = 151;
               break;
            case 240:
               var10000 = 67;
               break;
            case 241:
               var10000 = 77;
               break;
            case 242:
               var10000 = 213;
               break;
            case 243:
               var10000 = 110;
               break;
            case 244:
               var10000 = 163;
               break;
            case 245:
               var10000 = 193;
               break;
            case 246:
               var10000 = 215;
               break;
            case 247:
               var10000 = 197;
               break;
            case 248:
               var10000 = 222;
               break;
            case 249:
               var10000 = 42;
               break;
            case 250:
               var10000 = 85;
               break;
            case 251:
               var10000 = 112;
               break;
            case 252:
               var10000 = 244;
               break;
            case 253:
               var10000 = 254;
               break;
            case 254:
               var10000 = 51;
               break;
            default:
               var10000 = 135;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6572;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[16];
      int var11 = 0;
      String var10 = "w\u0083÷à?\u0092 gq!uÅÊêáâÇ\u008bÙ_°\u0012 \u0093 \fÿÓGÅ\u0013o\u0005ñzÃ9(\r\u0095ê²¶í7¥\u0006a\u001añt\u0013\u0006«×¿ç¥.\u0002捁帻(oÑ''¶6[7õ\u001fcÜQÔ\u0088ÇÈ¥\b}ÅoaqJÓúØ÷F'\u0095õ\"9ðÞ^Æx\u0002\u0005¹\u0003Ù\u008fÒ\u0006ì;\"X4ï\u0005\u009eU.Ü\u0095\nM)°µ×8½)×\u0094\u0004謬镝旆閷\u0004佭於斕閦\u0002湏稓";
      int var12 = "w\u0083÷à?\u0092 gq!uÅÊêáâÇ\u008bÙ_°\u0012 \u0093 \fÿÓGÅ\u0013o\u0005ñzÃ9(\r\u0095ê²¶í7¥\u0006a\u001añt\u0013\u0006«×¿ç¥.\u0002捁帻(oÑ''¶6[7õ\u001fcÜQÔ\u0088ÇÈ¥\b}ÅoaqJÓúØ÷F'\u0095õ\"9ðÞ^Æx\u0002\u0005¹\u0003Ù\u008fÒ\u0006ì;\"X4ï\u0005\u009eU.Ü\u0095\nM)°µ×8½)×\u0094\u0004謬镝旆閷\u0004佭於斕閦\u0002湏稓"
         .length();
      char var9 = ' ';
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 16;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
      char[] var33;
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
                        var65 = 103;
                        break;
                     case 1:
                        var65 = 5;
                        break;
                     case 2:
                        var65 = 3;
                        break;
                     case 3:
                        var65 = 105;
                        break;
                     case 4:
                        var65 = 73;
                        break;
                     case 5:
                        var65 = 4;
                        break;
                     default:
                        var65 = 124;
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
                     b = new String[16];
                     long var0 = 5163940294184445662L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "\u0005\u001a\u0085qõ2¬Z\u00019øXVo<|güi\u00809Ò¢þTÆäLloé\u0096ø\u001d\u0011(\u008d'ÑñB\n\u0094ÎêTJ\u009d";
                     int var5 = "\u0005\u001a\u0085qõ2¬Z\u00019øXVo<|güi\u00809Ò¢þTÆäLloé\u0096ø\u001d\u0011(\u008d'ÑñB\n\u0094ÎêTJ\u009d".length();
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
                                    d = new Integer[8];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Í³ÿºÕ¤Þ7 =m\u009f\u007f¿«®";
                                 var5 = "Í³ÿºÕ¤Þ7 =m\u009f\u007f¿«®".length();
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

                  var10 = "\u0018\u007f\u0004í\u0004彛遺輰挣";
                  var12 = "\u0018\u007f\u0004í\u0004彛遺輰挣".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 31;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





