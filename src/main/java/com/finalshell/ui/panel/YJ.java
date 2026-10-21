package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.LL;
import com.finalshell.ui.listener.DR3;
import com.finalshell.ui.listener.XY;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import javax.swing.undo.UndoManager;

public class YJ extends JPopupMenu implements MouseListener, ActionListener {
   public static YJ L;
   public JMenuItem T;
   public JMenuItem l;
   public JMenuItem P;
   public JMenuItem k;
   public static long q;
   public boolean e;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static void x(String[] var0) {
      JFrame var1 = new JFrame();
      var1.setDefaultCloseOperation(3);
      JTextField var2 = new JTextField(a(6068, 522663635941372887L));
      Registry.packArgs(var2);
      long var4 = 322267315291882359L;
      Ref.h2(322267315291882359L, var4);
      var1.add(var2, a(-742, 12887));
      JTextField var3 = new JTextField(a(22871, 5743972978871270711L));
      Registry.packArgs(var3);
      long var6 = 322267315291882359L;
      Ref.h2(322267315291882359L, var6);
      Registry.packArgs(var3);
      long var8 = 322267315291882359L;
      Ref.h2(322267315291882359L, var8);
      Registry.packArgs(var3);
      long var10 = 363111814618574295L;
      Ref.h2(363111814618574295L, var10);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var1.add(var3, a(-743, 19550));
      var1.pack();
      var1.setLocationRelativeTo(null);
      var1.setVisible(true);
   }

   public static boolean b(JTextComponent var0) {
      String[] var10000 = F8.y();
      boolean var2 = true;
      String[] var1 = var10000;
      boolean var3 = var0.getClass().toString().contains(a(-738, 26465));
      if (var1 == null) {
         if (var3) {
            var2 = false;
         }

         var3 = var2;
      }

      return var3;
   }

   public static boolean o(JTextComponent var0) {
      Registry.packArgs(var0, true);
      long var1 = 370149877875067536L;
      Object var10001 = Ref.h2(370149877875067536L, var1);

      try {
         return (Boolean)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static boolean Y(JTextComponent var0, boolean var1) {
      String[] var10000 = F8.y();
      UndoManager var3 = new UndoManager();
      com.finalshell.ui.adapter.Ks4 var4 = new com.finalshell.ui.adapter.Ks4(var3);
      LL var5 = new LL(var3);
      byte var6 = 2;
      String[] var2 = var10000;
      Registry.emptyArgs();
      long var10 = 454647487873911743L;
      Object var10001 = Ref.h2(454647487873911743L, var10);

      try {
         var10001 = (Boolean)var10001;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      if (var2 == null) {
         if (var10001 == null) {
            var6 = 4;
         }

         var0.getDocument().addUndoableEditListener(var3);
         var0.registerKeyboardAction(var4, KeyStroke.getKeyStroke(a(8146, 858434412037520308L), var6), 0);
         var0.registerKeyboardAction(var5, KeyStroke.getKeyStroke(a(10559, 882117388655267162L), var6), 0);
         var10001 = Registry.packArgs(var0);
         long var12 = 620575814828970493L;
         Object var10002 = Ref.h2(620575814828970493L, var12);

         try {
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }
      }

      label91:
      if (var2 == null) {
         if (var10001 == null) {
            var10001 = var1;
            if (var2 != null) {
               break label91;
            }

            if (var1 != false) {
               Registry.packArgs(var0);
               long var14 = 601491195246560697L;
               Ref.h2(601491195246560697L, var14);

               try {
                  ;
               } catch (InvocationTargetException var22) {
                  throw var22.getTargetException();
               }
            }
         }

         var10001 = false;
      }

      Object var7 = (Object[])var10001;
      MouseListener[] var8 = var0.getMouseListeners();
      if (null != var8) {
         int var9 = 0;

         while (var9 < var8.length) {
            if (var2 != null) {
               return false;
            }

            var10001 = var8[var9];
            Object[] var28 = Registry.emptyArgs();
            long var16 = 129058574427582046L;
            Object var10003 = Ref.h2(129058574427582046L, var16);

            try {
               var10003 = (YJ)var10003;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            if (var28 == var10003) {
               var7 = true;
            }

            var9++;
            if (var2 != null) {
               break;
            }
         }
      }

      if (var2 != null) {
         return (boolean)var7;
      } else if (var7 == null) {
         Object var29 = Registry.emptyArgs();
         long var18 = 129058574427582046L;
         Object var31 = Ref.h2(129058574427582046L, var18);

         try {
            var31 = (YJ)var31;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         var29.addMouseListener((MouseListener)var31);
         return true;
      } else {
         return false;
      }
   }

   public static void I(JTextComponent var0) {
      Object var10001 = Registry.emptyArgs();
      long var1 = 129058574427582046L;
      Object var10002 = Ref.h2(129058574427582046L, var1);

      try {
         var10002 = (YJ)var10002;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001.removeMouseListener((MouseListener)var10002);
   }

   public static YJ F() {
      if (null == (YJ)Registry.lookupField(618328928296237087L).get(null)) {
         Registry.lookupField(618328928296237087L).set(null, new YJ());
      }

      return (YJ)Registry.lookupField(618328928296237087L).get(null);
   }

   public YJ() {
      Registry.lookupField(391698271542952594L).setBoolean(this, false);
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 553902588358973671L;
      Object[] var1 = var10001;
      Ref.h(553902588358973671L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Object[] var10002 = Registry.emptyArgs();
      long var4 = 239647238212213637L;
      Object[] var3 = var10002;
      Ref.h(239647238212213637L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var6 = 373062424149998186L;
      Object[] var5 = var10003;
      Ref.h(373062424149998186L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void x() {
      Object[] var10002 = Registry.packArgs(a(-744, 23180));
      long var2 = 290427176111019385L;
      Object[] var1 = var10002;
      var10002 = Ref.h(290427176111019385L, var1, var2);
      long var4 = 523337937420027700L;
      Object var3 = var10002;
      Ref.s(523337937420027700L, var3, var4);
      Object[] var10004 = Registry.packArgs(a(-740, -24185));
      long var6 = 290427176111019385L;
      Object[] var5 = var10004;
      var10004 = Ref.h(290427176111019385L, var5, var6);
      long var8 = 275228187402431692L;
      Object var7 = var10004;
      Ref.s(275228187402431692L, var7, var8);
      Object[] var10006 = Registry.packArgs(a(-737, 21356));
      long var10 = 290427176111019385L;
      Object[] var9 = var10006;
      var10006 = Ref.h(290427176111019385L, var9, var10);
      long var12 = 556828725641436047L;
      Object var11 = var10006;
      Ref.s(556828725641436047L, var11, var12);
      Object[] var10008 = Registry.packArgs(a(-739, 28771));
      long var14 = 290427176111019385L;
      Object[] var13 = var10008;
      var10008 = Ref.h(290427176111019385L, var13, var14);
      long var16 = 195824488389063206L;
      Object var15 = var10008;
      Ref.s(195824488389063206L, var15, var16);
      Object var17 = 523337937420027700L;
      ((JMenuItem)Ref.g(523337937420027700L, var17)).setMnemonic((char)a(5361, 5852033962280366229L));
      Object var19 = 275228187402431692L;
      ((JMenuItem)Ref.g(275228187402431692L, var19)).setMnemonic((char)a(22607, 3434261204481670189L));
      Object var21 = 556828725641436047L;
      ((JMenuItem)Ref.g(556828725641436047L, var21)).setMnemonic((char)a(26346, 5171883601454514827L));
      Object var23 = 195824488389063206L;
      ((JMenuItem)Ref.g(195824488389063206L, var23)).setMnemonic((char)a(9807, 1296162009252430376L));
      Object var25 = 523337937420027700L;
      this.add((JMenuItem)Ref.g(523337937420027700L, var25));
      Object var27 = 275228187402431692L;
      this.add((JMenuItem)Ref.g(275228187402431692L, var27));
      Object var29 = 556828725641436047L;
      this.add((JMenuItem)Ref.g(556828725641436047L, var29));
      this.addSeparator();
      Object var31 = 195824488389063206L;
      this.add((JMenuItem)Ref.g(195824488389063206L, var31));
      this.setFont((Font)Registry.lookupField(395970988011231853L).get(null));
   }

   public JMenuItem F(String var1) {
      JMenuItem var2 = new JMenuItem(var1);
      var2.setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      return var2;
   }

   public void z() {
   }

   public void X() {
      Object var1 = 523337937420027700L;
      ((JMenuItem)Ref.g(523337937420027700L, var1)).addActionListener(this);
      Object var3 = 275228187402431692L;
      ((JMenuItem)Ref.g(275228187402431692L, var3)).addActionListener(this);
      Object var5 = 556828725641436047L;
      ((JMenuItem)Ref.g(556828725641436047L, var5)).addActionListener(this);
      Object var7 = 195824488389063206L;
      ((JMenuItem)Ref.g(195824488389063206L, var7)).addActionListener(this);
   }

   public static void H(JTextComponent var0) {
      var0.addFocusListener(new DR3(var0));
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2;
      Object var10;
      label63: {
         var2 = F8.y();
         int var10000 = (var1.getSource() instanceof JTextComponent) ? 1 : 0;
         if (var2 == null) {
            if (var10000 == 0) {
               return;
            }

            var10 = var1;
            if (var2 != null) {
               break label63;
            }

            var10000 = var1.getButton();
         }

         if (var10000 != 3) {
            return;
         }

         var10 = var1.getSource();
      }

      JTextComponent var3 = (JTextComponent)var10;
      var10 = Boolean.TRUE.equals(var3.getClientProperty(a(-741, 14885)));
      if (var2 == null) {
         if (var10 == null) {
            return;
         }

         var10 = Registry.packArgs(var3);
         long var4 = 620575814828970493L;
         Object var10001 = Ref.h2(620575814828970493L, var4);

         try {
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }
      }

      label66: {
         if (var2 == null) {
            if (var10 == null) {
               break label66;
            }

            var10 = var3.isFocusOwner();
         }

         if (var2 == null && var10 == false) {
            var3.selectAll();
            var3.requestFocusInWindow();
         }
      }

      Object[] var12 = Registry.packArgs(var3, var1.getX(), var1.getY());
      long var7 = 200270251075426170L;
      Object[] var6 = var12;
      Ref.h(200270251075426170L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void show(Component var1, int var2, int var3) {
      JMenuItem var20;
      JMenuItem var21;
      String[] var4;
      JTextComponent var5;
      boolean var19;
      label97: {
         String[] var10000 = F8.y();
         var5 = (JTextComponent)var1;
         var4 = var10000;
         String var6 = var5.getSelectedText();
         if (null != var6) {
            var19 = var6.equals("");
            if (var4 != null) {
               break label97;
            }

            if (!var19) {
               var19 = true;
               break label97;
            }
         }

         var19 = false;
      }

      boolean var7;
      boolean var8;
      boolean var9;
      boolean var10;
      JMenuItem var10001;
      boolean var10002;
      label90: {
         label100: {
            var7 = var19;
            var8 = var5.isEnabled();
            var9 = var5.isEditable();
            var10 = var5 instanceof JPasswordField;
            Object var11 = 523337937420027700L;
            var10001 = (JMenuItem)Ref.g(523337937420027700L, var11);
            var10002 = var7;
            if (var4 == null) {
               if (!var7) {
                  break label100;
               }

               var10002 = var8;
            }

            if (var4 == null) {
               if (!var10002) {
                  break label100;
               }

               var10002 = var9;
            }

            if (var4 == null) {
               if (!var10002) {
                  break label100;
               }

               var10002 = var10;
            }

            if (var4 != null) {
               break label90;
            }

            if (!var10002) {
               var10002 = true;
               break label90;
            }
         }

         var10002 = false;
      }

      boolean var10003;
      label69: {
         label101: {
            var10001.setEnabled(var10002);
            Object var13 = 275228187402431692L;
            var20 = (JMenuItem)Ref.g(275228187402431692L, var13);
            var10003 = var7;
            if (var4 == null) {
               if (!var7) {
                  break label101;
               }

               var10003 = var8;
            }

            if (var4 == null) {
               if (!var10003) {
                  break label101;
               }

               var10003 = var10;
            }

            if (var4 != null) {
               break label69;
            }

            if (!var10003) {
               var10003 = true;
               break label69;
            }
         }

         var10003 = false;
      }

      boolean var10004;
      label53: {
         label102: {
            var20.setEnabled(var10003);
            Object var15 = 556828725641436047L;
            var21 = (JMenuItem)Ref.g(556828725641436047L, var15);
            var10004 = var8;
            if (var4 == null) {
               if (!var8) {
                  break label102;
               }

               var10004 = var9;
            }

            if (var4 != null) {
               break label53;
            }

            if (var10004) {
               var10004 = true;
               break label53;
            }
         }

         var10004 = false;
      }

      var21.setEnabled(var10004);
      Object var17 = 195824488389063206L;
      ((JMenuItem)Ref.g(195824488389063206L, var17)).setEnabled(var8);
      super.show(var1, var2, var3);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var10000 = F8.y();
      JTextComponent var3 = (JTextComponent)this.getInvoker();
      String[] var2 = var10000;
      var1.getSource();
      Object var10001 = this;
      Object var4 = 523337937420027700L;
      Object var10002 = (JMenuItem)Ref.g(523337937420027700L, var4);
      if (var2 == null) {
         if (this == var10002) {
            var3.cut();
            if (var2 == null) {
               return;
            }
         }

         var10001 = var1.getSource();
         var10002 = this;
         Object var6 = 275228187402431692L;
         JMenuItem var10003 = (JMenuItem)Ref.g(275228187402431692L, var6);
      }

      if (var2 == null) {
         if (var10001 == var10002) {
            var3.copy();
            if (var2 == null) {
               return;
            }
         }

         var10001 = var1.getSource();
         var10002 = this;
         Object var8 = 556828725641436047L;
         JMenuItem var12 = (JMenuItem)Ref.g(556828725641436047L, var8);
      }

      if (var2 == null) {
         if (var10001 == var10002) {
            var3.paste();
            if (var2 == null) {
               return;
            }
         }

         var10001 = var1.getSource();
         var10002 = this;
         Object var10 = 195824488389063206L;
         JMenuItem var13 = (JMenuItem)Ref.g(195824488389063206L, var10);
      }

      if (var10001 == var10002) {
         var3.selectAll();
      }
   }

   public static YJ o() {
      return (YJ)Registry.lookupField(618328928296237087L).get(null);
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -740) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 165;
               break;
            case 1:
               var10000 = 54;
               break;
            case 2:
               var10000 = 52;
               break;
            case 3:
               var10000 = 193;
               break;
            case 4:
               var10000 = 82;
               break;
            case 5:
               var10000 = 84;
               break;
            case 6:
               var10000 = 157;
               break;
            case 7:
               var10000 = 218;
               break;
            case 8:
               var10000 = 3;
               break;
            case 9:
               var10000 = 224;
               break;
            case 10:
               var10000 = 26;
               break;
            case 11:
               var10000 = 170;
               break;
            case 12:
               var10000 = 168;
               break;
            case 13:
               var10000 = 229;
               break;
            case 14:
               var10000 = 245;
               break;
            case 15:
               var10000 = 176;
               break;
            case 16:
               var10000 = 117;
               break;
            case 17:
               var10000 = 46;
               break;
            case 18:
               var10000 = 34;
               break;
            case 19:
               var10000 = 175;
               break;
            case 20:
               var10000 = 145;
               break;
            case 21:
               var10000 = 235;
               break;
            case 22:
               var10000 = 182;
               break;
            case 23:
               var10000 = 70;
               break;
            case 24:
               var10000 = 249;
               break;
            case 25:
               var10000 = 164;
               break;
            case 26:
               var10000 = 45;
               break;
            case 27:
               var10000 = 32;
               break;
            case 28:
               var10000 = 64;
               break;
            case 29:
               var10000 = 172;
               break;
            case 30:
               var10000 = 39;
               break;
            case 31:
               var10000 = 223;
               break;
            case 32:
               var10000 = 180;
               break;
            case 33:
               var10000 = 101;
               break;
            case 34:
               var10000 = 94;
               break;
            case 35:
               var10000 = 158;
               break;
            case 36:
               var10000 = 14;
               break;
            case 37:
               var10000 = 65;
               break;
            case 38:
               var10000 = 130;
               break;
            case 39:
               var10000 = 86;
               break;
            case 40:
               var10000 = 68;
               break;
            case 41:
               var10000 = 212;
               break;
            case 42:
               var10000 = 200;
               break;
            case 43:
               var10000 = 53;
               break;
            case 44:
               var10000 = 189;
               break;
            case 45:
               var10000 = 138;
               break;
            case 46:
               var10000 = 154;
               break;
            case 47:
               var10000 = 33;
               break;
            case 48:
               var10000 = 162;
               break;
            case 49:
               var10000 = 4;
               break;
            case 50:
               var10000 = 243;
               break;
            case 51:
               var10000 = 20;
               break;
            case 52:
               var10000 = 183;
               break;
            case 53:
               var10000 = 163;
               break;
            case 54:
               var10000 = 88;
               break;
            case 55:
               var10000 = 118;
               break;
            case 56:
               var10000 = 18;
               break;
            case 57:
               var10000 = 137;
               break;
            case 58:
               var10000 = 105;
               break;
            case 59:
               var10000 = 22;
               break;
            case 60:
               var10000 = 190;
               break;
            case 61:
               var10000 = 67;
               break;
            case 62:
               var10000 = 251;
               break;
            case 63:
               var10000 = 181;
               break;
            case 64:
               var10000 = 115;
               break;
            case 65:
               var10000 = 166;
               break;
            case 66:
               var10000 = 129;
               break;
            case 67:
               var10000 = 201;
               break;
            case 68:
               var10000 = 253;
               break;
            case 69:
               var10000 = 171;
               break;
            case 70:
               var10000 = 128;
               break;
            case 71:
               var10000 = 213;
               break;
            case 72:
               var10000 = 161;
               break;
            case 73:
               var10000 = 77;
               break;
            case 74:
               var10000 = 204;
               break;
            case 75:
               var10000 = 211;
               break;
            case 76:
               var10000 = 6;
               break;
            case 77:
               var10000 = 139;
               break;
            case 78:
               var10000 = 91;
               break;
            case 79:
               var10000 = 58;
               break;
            case 80:
               var10000 = 127;
               break;
            case 81:
               var10000 = 146;
               break;
            case 82:
               var10000 = 140;
               break;
            case 83:
               var10000 = 216;
               break;
            case 84:
               var10000 = 143;
               break;
            case 85:
               var10000 = 98;
               break;
            case 86:
               var10000 = 49;
               break;
            case 87:
               var10000 = 79;
               break;
            case 88:
               var10000 = 244;
               break;
            case 89:
               var10000 = 87;
               break;
            case 90:
               var10000 = 186;
               break;
            case 91:
               var10000 = 120;
               break;
            case 92:
               var10000 = 149;
               break;
            case 93:
               var10000 = 207;
               break;
            case 94:
               var10000 = 177;
               break;
            case 95:
               var10000 = 203;
               break;
            case 96:
               var10000 = 112;
               break;
            case 97:
               var10000 = 90;
               break;
            case 98:
               var10000 = 225;
               break;
            case 99:
               var10000 = 113;
               break;
            case 100:
               var10000 = 147;
               break;
            case 101:
               var10000 = 167;
               break;
            case 102:
               var10000 = 41;
               break;
            case 103:
               var10000 = 35;
               break;
            case 104:
               var10000 = 131;
               break;
            case 105:
               var10000 = 111;
               break;
            case 106:
               var10000 = 63;
               break;
            case 107:
               var10000 = 92;
               break;
            case 108:
               var10000 = 199;
               break;
            case 109:
               var10000 = 122;
               break;
            case 110:
               var10000 = 205;
               break;
            case 111:
               var10000 = 72;
               break;
            case 112:
               var10000 = 62;
               break;
            case 113:
               var10000 = 194;
               break;
            case 114:
               var10000 = 155;
               break;
            case 115:
               var10000 = 19;
               break;
            case 116:
               var10000 = 50;
               break;
            case 117:
               var10000 = 8;
               break;
            case 118:
               var10000 = 102;
               break;
            case 119:
               var10000 = 15;
               break;
            case 120:
               var10000 = 61;
               break;
            case 121:
               var10000 = 152;
               break;
            case 122:
               var10000 = 222;
               break;
            case 123:
               var10000 = 209;
               break;
            case 124:
               var10000 = 198;
               break;
            case 125:
               var10000 = 78;
               break;
            case 126:
               var10000 = 220;
               break;
            case 127:
               var10000 = 16;
               break;
            case 128:
               var10000 = 56;
               break;
            case 129:
               var10000 = 1;
               break;
            case 130:
               var10000 = 151;
               break;
            case 131:
               var10000 = 42;
               break;
            case 132:
               var10000 = 178;
               break;
            case 133:
               var10000 = 96;
               break;
            case 134:
               var10000 = 116;
               break;
            case 135:
               var10000 = 119;
               break;
            case 136:
               var10000 = 233;
               break;
            case 137:
               var10000 = 236;
               break;
            case 138:
               var10000 = 60;
               break;
            case 139:
               var10000 = 13;
               break;
            case 140:
               var10000 = 97;
               break;
            case 141:
               var10000 = 108;
               break;
            case 142:
               var10000 = 132;
               break;
            case 143:
               var10000 = 121;
               break;
            case 144:
               var10000 = 214;
               break;
            case 145:
               var10000 = 126;
               break;
            case 146:
               var10000 = 44;
               break;
            case 147:
               var10000 = 66;
               break;
            case 148:
               var10000 = 104;
               break;
            case 149:
               var10000 = 76;
               break;
            case 150:
               var10000 = 221;
               break;
            case 151:
               var10000 = 59;
               break;
            case 152:
               var10000 = 124;
               break;
            case 153:
               var10000 = 255;
               break;
            case 154:
               var10000 = 187;
               break;
            case 155:
               var10000 = 73;
               break;
            case 156:
               var10000 = 150;
               break;
            case 157:
               var10000 = 75;
               break;
            case 158:
               var10000 = 81;
               break;
            case 159:
               var10000 = 232;
               break;
            case 160:
               var10000 = 141;
               break;
            case 161:
               var10000 = 17;
               break;
            case 162:
               var10000 = 206;
               break;
            case 163:
               var10000 = 24;
               break;
            case 164:
               var10000 = 144;
               break;
            case 165:
               var10000 = 43;
               break;
            case 166:
               var10000 = 217;
               break;
            case 167:
               var10000 = 69;
               break;
            case 168:
               var10000 = 57;
               break;
            case 169:
               var10000 = 197;
               break;
            case 170:
               var10000 = 237;
               break;
            case 171:
               var10000 = 173;
               break;
            case 172:
               var10000 = 230;
               break;
            case 173:
               var10000 = 83;
               break;
            case 174:
               var10000 = 25;
               break;
            case 175:
               var10000 = 51;
               break;
            case 176:
               var10000 = 169;
               break;
            case 177:
               var10000 = 240;
               break;
            case 178:
               var10000 = 148;
               break;
            case 179:
               var10000 = 29;
               break;
            case 180:
               var10000 = 156;
               break;
            case 181:
               var10000 = 40;
               break;
            case 182:
               var10000 = 23;
               break;
            case 183:
               var10000 = 254;
               break;
            case 184:
               var10000 = 89;
               break;
            case 185:
               var10000 = 174;
               break;
            case 186:
               var10000 = 55;
               break;
            case 187:
               var10000 = 114;
               break;
            case 188:
               var10000 = 107;
               break;
            case 189:
               var10000 = 21;
               break;
            case 190:
               var10000 = 159;
               break;
            case 191:
               var10000 = 219;
               break;
            case 192:
               var10000 = 85;
               break;
            case 193:
               var10000 = 93;
               break;
            case 194:
               var10000 = 48;
               break;
            case 195:
               var10000 = 227;
               break;
            case 196:
               var10000 = 234;
               break;
            case 197:
               var10000 = 12;
               break;
            case 198:
               var10000 = 241;
               break;
            case 199:
               var10000 = 123;
               break;
            case 200:
               var10000 = 215;
               break;
            case 201:
               var10000 = 188;
               break;
            case 202:
               var10000 = 134;
               break;
            case 203:
               var10000 = 202;
               break;
            case 204:
               var10000 = 252;
               break;
            case 205:
               var10000 = 125;
               break;
            case 206:
               var10000 = 0;
               break;
            case 207:
               var10000 = 247;
               break;
            case 208:
               var10000 = 2;
               break;
            case 209:
               var10000 = 27;
               break;
            case 210:
               var10000 = 28;
               break;
            case 211:
               var10000 = 109;
               break;
            case 212:
               var10000 = 184;
               break;
            case 213:
               var10000 = 99;
               break;
            case 214:
               var10000 = 208;
               break;
            case 215:
               var10000 = 153;
               break;
            case 216:
               var10000 = 106;
               break;
            case 217:
               var10000 = 136;
               break;
            case 218:
               var10000 = 250;
               break;
            case 219:
               var10000 = 242;
               break;
            case 220:
               var10000 = 228;
               break;
            case 221:
               var10000 = 37;
               break;
            case 222:
               var10000 = 238;
               break;
            case 223:
               var10000 = 239;
               break;
            case 224:
               var10000 = 74;
               break;
            case 225:
               var10000 = 135;
               break;
            case 226:
               var10000 = 30;
               break;
            case 227:
               var10000 = 179;
               break;
            case 228:
               var10000 = 38;
               break;
            case 229:
               var10000 = 192;
               break;
            case 230:
               var10000 = 246;
               break;
            case 231:
               var10000 = 80;
               break;
            case 232:
               var10000 = 195;
               break;
            case 233:
               var10000 = 231;
               break;
            case 234:
               var10000 = 160;
               break;
            case 235:
               var10000 = 110;
               break;
            case 236:
               var10000 = 100;
               break;
            case 237:
               var10000 = 9;
               break;
            case 238:
               var10000 = 10;
               break;
            case 239:
               var10000 = 11;
               break;
            case 240:
               var10000 = 36;
               break;
            case 241:
               var10000 = 5;
               break;
            case 242:
               var10000 = 7;
               break;
            case 243:
               var10000 = 71;
               break;
            case 244:
               var10000 = 248;
               break;
            case 245:
               var10000 = 95;
               break;
            case 246:
               var10000 = 196;
               break;
            case 247:
               var10000 = 185;
               break;
            case 248:
               var10000 = 103;
               break;
            case 249:
               var10000 = 210;
               break;
            case 250:
               var10000 = 191;
               break;
            case 251:
               var10000 = 142;
               break;
            case 252:
               var10000 = 226;
               break;
            case 253:
               var10000 = 31;
               break;
            case 254:
               var10000 = 133;
               break;
            default:
               var10000 = 47;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9319;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "姅勫SEN\u0005兡适\u000e¢å\bÒö\u0093èdZ\u0084\u009b\u0005簊趰\u008dy\u0095\u0005努刖5ö\u0082\u0005\u000f*Â8Ë";
      int var12 = "姅勫SEN\u0005兡适\u000e¢å\bÒö\u0093èdZ\u0084\u009b\u0005簊趰\u008dy\u0095\u0005努刖5ö\u0082\u0005\u000f*Â8Ë".length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 99;
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
                        var65 = 10;
                        break;
                     case 1:
                        var65 = 5;
                        break;
                     case 2:
                        var65 = 33;
                        break;
                     case 3:
                        var65 = 36;
                        break;
                     case 4:
                        var65 = 11;
                        break;
                     case 5:
                        var65 = 68;
                        break;
                     default:
                        var65 = 106;
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
                     b = new String[8];
                     long var0 = 5507968681187707525L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "ÿ¢\u009c\u0003 ò\u0088ìÈ0\u0006iô\\1k\u0011çé$$Õ\u0087\u0086M\u0098¼è[\u0015ºHÓàõæ\u0081g9X\u008a<X\u0082ó#vë";
                     int var5 = "ÿ¢\u009c\u0003 ò\u0088ìÈ0\u0006iô\\1k\u0011çé$$Õ\u0087\u0086M\u0098¼è[\u0015ºHÓàõæ\u0081g9X\u008a<X\u0082ó#vë".length();
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
                                    Registry.lookupField(618328928296237087L).set(null, new YJ());
                                    ((YJ)Registry.lookupField(618328928296237087L).get(null)).addPopupMenuListener(new XY());
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "_ÇÍ_\u0090vÈX\u008f)>\t\u0089;÷¸";
                                 var5 = "_ÇÍ_\u0090vÈX\u008f)>\t\u0089;÷¸".length();
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

                  var10 = "ñµ\u0014\u0080dW\u0010ErxàPòEbI\tU\u000fóþy$";
                  var12 = "ñµ\u0014\u0080dW\u0010ErxàPòEbI\tU\u000fóþy$".length();
                  var9 = 6;
                  var17 = -1;
            }

            var10000 = 99;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





